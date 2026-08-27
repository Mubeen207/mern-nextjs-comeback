package com.snake.helper;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;

import androidx.core.app.NotificationCompat;

/**
 * Daemon service that maintains the app in the background
 * This service runs as a foreground service to prevent the app from being killed
 */
public class DaemonService extends Service {
    private static final String CHANNEL_ID = "com.snake.snake_engine";
    private static final String INNER_CHANNEL_ID = "com.snake.snake_engine.inner";
    private static final int NOTIFICATION_ID = 10000;
    private static final int INNER_NOTIFICATION_ID = 10001;

    /**
     * Inner daemon service that handles background tasks
     */
    public static class DaemonInnerService extends Service {
        @Override
        public IBinder onBind(Intent intent) {
            return null;
        }

        @Override
        public int onStartCommand(Intent intent, int flags, int startId) {
            setupNotificationChannel(this, INNER_CHANNEL_ID, "Snake Engine Inner", 
                    "Inner helper for Snake Engine");
            
            Notification notification = createNotification(this, INNER_CHANNEL_ID, 
                    "Snake Engine", "Service is running");
            
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
                startForeground(INNER_NOTIFICATION_ID, notification, 
                        1073741824); // FOREGROUND_SERVICE_TYPE_SYSTEM_EXEMPTED
            } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                startForeground(INNER_NOTIFICATION_ID, notification, 1);
            } else {
                startForeground(INNER_NOTIFICATION_ID, notification);
            }
            
            stopForeground(true);
            stopSelf();
            return START_STICKY;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        setupNotificationChannel(this, CHANNEL_ID, "Snake Engine Service Channel",
                "Channel for Snake Engine Daemon");
        
        Notification notification = createNotification(this, CHANNEL_ID,
                "Snake Engine", "Daemon service is running");
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            startForeground(NOTIFICATION_ID, notification, 1);
        } else {
            startForeground(NOTIFICATION_ID, notification);
        }
        
        // Start inner service
        try {
            Intent innerIntent = new Intent(this, DaemonInnerService.class);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                startForegroundService(innerIntent);
            } else {
                startService(innerIntent);
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
        
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        // Reschedule the service when it's destroyed
        rescheduleService(1500L);
        super.onDestroy();
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        // Reschedule the service when the task is removed
        rescheduleService(1000L);
        super.onTaskRemoved(rootIntent);
    }

    /**
     * Setup notification channel for Android 8.0+
     */
    private void setupNotificationChannel(Context context, String channelId, 
            String channelName, String channelDescription) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationManager notificationManager = 
                    context.getSystemService(NotificationManager.class);
            
            if (notificationManager != null) {
                NotificationChannel channel = new NotificationChannel(
                        channelId, 
                        channelName, 
                        NotificationManager.IMPORTANCE_LOW
                );
                channel.setDescription(channelDescription);
                channel.enableLights(false);
                channel.enableVibration(false);
                notificationManager.createNotificationChannel(channel);
            }
        }
    }

    /**
     * Create a notification
     */
    private Notification createNotification(Context context, String channelId,
            String title, String content) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, channelId)
                .setContentTitle(title)
                .setContentText(content)
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setAutoCancel(false)
                .setOngoing(true);
        
        return builder.build();
    }

    /**
     * Reschedule the service to restart after a delay
     */
    private void rescheduleService(long delayMillis) {
        AlarmManager alarmManager = (AlarmManager) getSystemService(AlarmManager.class);
        if (alarmManager == null) {
            return;
        }
        
        Intent intent = new Intent(this, DaemonService.class);
        intent.setPackage(getPackageName());
        
        PendingIntent pendingIntent = PendingIntent.getService(
                this, 
                1, 
                intent, 
                201326592 // PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
        );
        
        long triggerTime = System.currentTimeMillis() + delayMillis;
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            try {
                if (alarmManager.canScheduleExactAlarms()) {
                    alarmManager.setExactAndAllowWhileIdle(
                            AlarmManager.RTC_WAKEUP, 
                            triggerTime, 
                            pendingIntent
                    );
                } else {
                    alarmManager.setAndAllowWhileIdle(
                            AlarmManager.RTC_WAKEUP, 
                            triggerTime, 
                            pendingIntent
                    );
                }
            } catch (SecurityException e) {
                alarmManager.setAndAllowWhileIdle(
                        AlarmManager.RTC_WAKEUP, 
                        triggerTime, 
                        pendingIntent
                );
            }
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            alarmManager.setAndAllowWhileIdle(
                    AlarmManager.RTC_WAKEUP, 
                    triggerTime, 
                    pendingIntent
            );
        } else {
            alarmManager.setAndAllowWhileIdle(
                    AlarmManager.RTC_WAKEUP, 
                    triggerTime, 
                    pendingIntent
            );
        }
    }
}
