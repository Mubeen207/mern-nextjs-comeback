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
import android.widget.TextView;
import android.widget.Button;
import android.widget.LinearLayout;

import com.snake.billing.DebugEntitlementManager;
import com.snake.helper.DaemonService;
import com.snake.helper.Native;
import com.snake.helper.ProxyVpnService;

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
public class Entry extends android.app.Activity {
    public static final String TAG = "SnakeEngine";
    private static final int VPN_PREPARE_REQUEST = 2001;
    public static String lastResult;
    private boolean cameraPermissionGranted = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Note: Flutter would set content view via FlutterActivity or FlutterFragmentActivity
        // For now, we're just initializing the necessary components
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(32, 64, 32, 32);

        TextView status = new TextView(this);
        status.setText("Snake Engine\n\nRecovered Android service shell\n"
            + (DebugEntitlementManager.isDebugEntitlementActive()
            ? "Local debug entitlement active."
            : "Subscription entitlement is required."));
        status.setTextSize(18.0f);
        layout.addView(status);

        Button connect = new Button(this);
        connect.setText("Connect VPN");
        connect.setOnClickListener(view -> prepareVpnConnection());
        layout.addView(connect);
        setContentView(layout);
        
        startDaemonService();
        setupNotificationChannels();
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

    private void prepareVpnConnection() {
        if (!DebugEntitlementManager.hasEntitlement(this, "vpn")) {
            Toast.makeText(this, "An active entitlement is required.", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent prepareIntent = android.net.VpnService.prepare(this);
        if (prepareIntent != null) {
            startActivityForResult(prepareIntent, VPN_PREPARE_REQUEST);
        } else {
            startVpnService();
        }
    }

    private void startVpnService() {
        Intent vpnIntent = new Intent(this, ProxyVpnService.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(vpnIntent);
        } else {
            startService(vpnIntent);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == VPN_PREPARE_REQUEST && resultCode == RESULT_OK) {
            startVpnService();
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
