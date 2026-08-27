package androidx.appcompat.view.menu;

import android.os.Build;
/* loaded from: classes.dex */
public abstract class y8 {
    public static boolean a() {
        return true;
    }

    public static boolean b() {
        return true;
    }

    public static boolean c() {
        return true;
    }

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 29 || Build.VERSION.PREVIEW_SDK_INT == 1;
    }

    public static boolean g() {
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            return i >= 29 && Build.VERSION.PREVIEW_SDK_INT == 1;
        }
        return true;
    }

    public static boolean h() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            return i >= 30 && Build.VERSION.PREVIEW_SDK_INT == 1;
        }
        return true;
    }

    public static boolean i() {
        return "samsung".equalsIgnoreCase(Build.BRAND) || "samsung".equalsIgnoreCase(Build.MANUFACTURER);
    }

    public static boolean j() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            return i >= 31 && Build.VERSION.PREVIEW_SDK_INT == 1;
        }
        return true;
    }

    public static boolean k() {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            return i >= 33 && Build.VERSION.PREVIEW_SDK_INT == 1;
        }
        return true;
    }
}
