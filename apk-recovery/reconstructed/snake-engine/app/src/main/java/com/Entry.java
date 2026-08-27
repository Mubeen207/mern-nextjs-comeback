package com;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Display;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.snake.helper.DaemonService;
import com.snake.helper.Native;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Main Flutter activity
 * This activity bridges Flutter UI with native Android functionality
 * Note: In a real Flutter project, this would be auto-generated
 */
public class Entry extends AppCompatActivity {
    public static final String TAG = "SnakeEngine";
    public static String lastResult;
    public static FirebaseAnalytics firebaseAnalytics;

    private boolean cameraPermissionGranted = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Note: Flutter would set content view via FlutterActivity or FlutterFragmentActivity
        // For now, we're just initializing the necessary components
        
        firebaseAnalytics = FirebaseAnalytics.getInstance(this);
        initializeFirebase();
        startDaemonService();
        setupNotificationChannels();
    }

    /**
     * Initialize Firebase messaging
     */
    private void initializeFirebase() {
        FirebaseMessaging.getInstance().subscribeToTopic("default");
    }

    /**
     * Start the daemon service
     */
    private void startDaemonService() {
        Intent daemonIntent = new Intent(this, DaemonService.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(daemonIntent);
        } else {
            startService(daemonIntent);
        }
    }

    /**
     * Setup notification channels for Android 8.0+
     */
    private void setupNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationManager notificationManager =
                    getSystemService(NotificationManager.class);
            
            if (notificationManager != null) {
                NotificationChannel channel = new NotificationChannel(
                        "com.snake.snake_engine",
                        "Snake Engine Service",
                        NotificationManager.IMPORTANCE_LOW
                );
                channel.setDescription("Notifications from Snake Engine");
                notificationManager.createNotificationChannel(channel);
            }
        }
    }

    /**
     * Handle platform channel method calls
     * This is called from Flutter through platform channels
     */
    public void handleMethodCall(String method, Object arguments) {
        switch (method) {
            case "getNativeString":
                if (arguments instanceof Integer) {
                    byte[] result = Native.djp((Integer) arguments);
                    if (result != null) {
                        lastResult = new String(result);
                    }
                }
                break;
            case "checkData":
                if (arguments instanceof byte[]) {
                    boolean result = Native.chl((byte[]) arguments);
                    // Handle result
                }
                break;
            case "openUrl":
                if (arguments instanceof String) {
                    String url = (String) arguments;
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                }
                break;
            case "savePreference":
                if (arguments instanceof Map) {
                    @SuppressWarnings("unchecked")
                    Map<String, String> prefs = (Map<String, String>) arguments;
                    SharedPreferences.Editor editor = getSharedPreferences(
                            getPackageName(), 
                            Context.MODE_PRIVATE
                    ).edit();
                    for (Map.Entry<String, String> entry : prefs.entrySet()) {
                        editor.putString(entry.getKey(), entry.getValue());
                    }
                    editor.apply();
                }
                break;
            case "getPreference":
                if (arguments instanceof String) {
                    String key = (String) arguments;
                    String value = getSharedPreferences(
                            getPackageName(), 
                            Context.MODE_PRIVATE
                    ).getString(key, "");
                    lastResult = value;
                }
                break;
            case "showToast":
                if (arguments instanceof String) {
                    Toast.makeText(this, (String) arguments, Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
