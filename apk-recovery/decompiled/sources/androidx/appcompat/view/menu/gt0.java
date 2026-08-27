package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
/* loaded from: classes.dex */
public class gt0 {
    public static gt0 e;
    public String a = null;
    public Boolean b = null;
    public Boolean c = null;
    public final Queue d = new ArrayDeque();

    public static synchronized gt0 b() {
        gt0 gt0Var;
        synchronized (gt0.class) {
            try {
                if (e == null) {
                    e = new gt0();
                }
                gt0Var = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gt0Var;
    }

    public final int a(Context context, Intent intent) {
        String f = f(context, intent);
        if (f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Restricting intent to a specific service: ");
                sb.append(f);
            }
            intent.setClassName(context.getPackageName(), f);
        }
        try {
            return (e(context) ? t71.h(context, intent) : context.startService(intent)) == null ? 404 : -1;
        } catch (IllegalStateException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to start service while in background: ");
            sb2.append(e2);
            return 402;
        } catch (SecurityException unused) {
            return 401;
        }
    }

    public Intent c() {
        return (Intent) this.d.poll();
    }

    public boolean d(Context context) {
        if (this.c == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.b.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.c.booleanValue();
    }

    public boolean e(Context context) {
        if (this.b == null) {
            this.b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.b.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return this.b.booleanValue();
    }

    public final synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.a = serviceInfo.name;
                    }
                    return this.a;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                sb.append(serviceInfo.packageName);
                sb.append("/");
                sb.append(serviceInfo.name);
                return null;
            }
            return null;
        } finally {
        }
    }

    public int g(Context context, Intent intent) {
        Log.isLoggable("FirebaseMessaging", 3);
        this.d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
