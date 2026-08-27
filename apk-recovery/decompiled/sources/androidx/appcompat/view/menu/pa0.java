package androidx.appcompat.view.menu;

import android.util.Log;
/* loaded from: classes.dex */
public abstract class pa0 {
    public static void a(String str, String str2, Object obj) {
        if (Log.isLoggable(d(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        if (Log.isLoggable(d(str), 3)) {
            String.format(str2, objArr);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        Log.isLoggable(d(str), 6);
    }

    public static String d(String str) {
        return "TRuntime." + str;
    }

    public static void e(String str, String str2, Object obj) {
        if (Log.isLoggable(d(str), 4)) {
            String.format(str2, obj);
        }
    }

    public static void f(String str, String str2, Object obj) {
        if (Log.isLoggable(d(str), 5)) {
            String.format(str2, obj);
        }
    }
}
