package androidx.appcompat.view.menu;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.os.Binder;
import android.os.Bundle;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class rl0 {
    public static boolean b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    public static void c(Context context) {
        if (sl0.b(context)) {
            return;
        }
        e(new lc0(), context, f(context));
    }

    public static /* synthetic */ void d(Context context, boolean z, ez0 ez0Var) {
        String notificationDelegate;
        try {
            if (!b(context)) {
                StringBuilder sb = new StringBuilder();
                sb.append("error configuring notification delegate for package ");
                sb.append(context.getPackageName());
                return;
            }
            sl0.c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else {
                notificationDelegate = notificationManager.getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            ez0Var.e(null);
        }
    }

    public static cz0 e(Executor executor, final Context context, final boolean z) {
        if (ti0.j()) {
            final ez0 ez0Var = new ez0();
            executor.execute(new Runnable() { // from class: androidx.appcompat.view.menu.ql0
                @Override // java.lang.Runnable
                public final void run() {
                    rl0.d(context, z, ez0Var);
                }
            });
            return ez0Var.a();
        }
        return mz0.e(null);
    }

    public static boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), PackageParser.PARSE_IS_PRIVILEGED)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
