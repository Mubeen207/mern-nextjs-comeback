package com.snake.helper;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Binder;
import androidx.annotation.Keep;
import androidx.appcompat.view.menu.ay;
import androidx.appcompat.view.menu.bv0;
import androidx.appcompat.view.menu.e20;
import androidx.appcompat.view.menu.mv0;
import java.io.File;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class Native {
    @Keep
    public static native void ac(Object obj, Object obj2);

    @Keep
    public static native void aior(String str, String str2);

    @Keep
    public static native void awl(String str);

    @Keep
    public static native boolean chl(byte[] bArr);

    @Keep
    public static native byte[] djp(int i);

    @Keep
    public static native void eio();

    @Keep
    public static int gcuid(int i) {
        if ((i <= 0 || i >= 10000) && i <= 19999 && i == bv0.p()) {
            int r = bv0.u().r(Binder.getCallingPid());
            return r != -1 ? r : mv0.K2();
        }
        return i;
    }

    @Keep
    public static ApplicationInfo getApplicationInfo(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 0);
        } catch (Exception unused) {
            return null;
        }
    }

    @Keep
    public static native void i(int i);

    @Keep
    public static native void ic(Context context);

    @Keep
    public static String il(String str) {
        return e20.d().h(str);
    }

    @Keep
    public static native String ilil(int i);

    @Keep
    public static void logIn(final String str, final long j) {
        ay.g(str, j);
        final Activity e = ay.e();
        if (e == null) {
            ay.c(j, 3, "", "", "");
            return;
        }
        final int N2 = mv0.N2();
        e.runOnUiThread(new Runnable() { // from class: androidx.appcompat.view.menu.qe0
            @Override // java.lang.Runnable
            public final void run() {
                ay.f(e, str, N2, j);
            }
        });
    }

    @Keep
    public static native void pjowqpxe(Object obj, Object obj2, Object obj3);

    @Keep
    public static native void update(Object obj, Method method);

    @Keep
    public static File il(File file) {
        return e20.d().g(file);
    }
}
