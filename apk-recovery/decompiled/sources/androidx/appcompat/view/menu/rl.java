package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
/* loaded from: classes.dex */
public abstract class rl {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (d == null) {
            boolean z = false;
            if (ti0.h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            d = Boolean.valueOf(z);
        }
        return d.booleanValue();
    }

    public static boolean b() {
        int i = ky.a;
        return "user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (a == null) {
            boolean z = false;
            if (ti0.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            a = Boolean.valueOf(z);
        }
        return a.booleanValue();
    }

    public static boolean d(Context context) {
        if (!c(context) || ti0.g()) {
            if (e(context)) {
                return !ti0.h() || ti0.k();
            }
            return false;
        }
        return true;
    }

    public static boolean e(Context context) {
        if (b == null) {
            boolean z = false;
            if (ti0.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static boolean f(Context context) {
        if (c == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            c = Boolean.valueOf(z);
        }
        return c.booleanValue();
    }
}
