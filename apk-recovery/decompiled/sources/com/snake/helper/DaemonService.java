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
import androidx.appcompat.view.menu.jf0;
/* loaded from: classes.dex */
public class DaemonService extends Service {

    /* loaded from: classes.dex */
    public static class DaemonInnerService extends Service {
        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i, int i2) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                NotificationChannel notificationChannel = new NotificationChannel("com.snake.snake_engine.inner", "Snake Engine Inner", 2);
                notificationChannel.setDescription("Inner helper for Snake Engine");
                notificationManager.createNotificationChannel(notificationChannel);
            }
            Notification b = new jf0.e(this, "com.snake.snake_engine.inner").s(true).b();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                startForeground(10001, b, i3 >= 34 ? 1073741824 : 1);
            } else {
                startForeground(10001, b);
            }
            stopForeground(true);
            stopSelf();
            return 2;
        }
    }

    public static String a(Context context) {
        return "com.snake.snake_engine";
    }

    public final void b(long j) {
        boolean canScheduleExactAlarms;
        AlarmManager alarmManager = (AlarmManager) getSystemService(AlarmManager.class);
        if (alarmManager == null) {
            return;
        }
        PendingIntent service = PendingIntent.getService(this, 1, new Intent(getApplicationContext(), DaemonService.class).setPackage(getPackageName()), 201326592);
        long currentTimeMillis = System.currentTimeMillis() + j;
        if (Build.VERSION.SDK_INT < 31) {
            alarmManager.setAndAllowWhileIdle(0, currentTimeMillis, service);
            return;
        }
        try {
            canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
            if (canScheduleExactAlarms) {
                alarmManager.setExactAndAllowWhileIdle(0, currentTimeMillis, service);
            } else {
                alarmManager.setAndAllowWhileIdle(0, currentTimeMillis, service);
            }
        } catch (SecurityException unused) {
            alarmManager.setAndAllowWhileIdle(0, currentTimeMillis, service);
        }
    }

    public final void c() {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("com.snake.snake_engine", "Snake Engine Service Channel", 4);
            notificationChannel.setDescription("Channel for Snake Engine Daemon");
            notificationManager.createNotificationChannel(notificationChannel);
        }
        Notification b = new jf0.e(this, "com.snake.snake_engine").s(true).t(2).n(1).b();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            startForeground(10000, b, i >= 34 ? 1073741824 : 1);
        } else {
            startForeground(10000, b);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        b(1500L);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        c();
        try {
            startService(new Intent(this, DaemonInnerService.class));
            return 1;
        } catch (Throwable unused) {
            return 1;
        }
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        b(1000L);
        super.onTaskRemoved(intent);
    }
}
