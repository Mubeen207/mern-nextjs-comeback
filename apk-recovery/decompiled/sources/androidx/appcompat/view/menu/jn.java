package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.Window;
/* loaded from: classes.dex */
public abstract class jn {
    public static void a(Window window, boolean z, Integer num, Integer num2) {
        boolean z2 = false;
        boolean z3 = num == null || num.intValue() == 0;
        if (num2 == null || num2.intValue() == 0) {
            z2 = true;
        }
        if (z3 || z2) {
            int b = ob0.b(window.getContext(), 16842801, -16777216);
            if (z3) {
                num = Integer.valueOf(b);
            }
            if (z2) {
                num2 = Integer.valueOf(b);
            }
        }
        f81.b(window, !z);
        int c = c(window.getContext(), z);
        int b2 = b(window.getContext(), z);
        window.setStatusBarColor(c);
        window.setNavigationBarColor(b2);
        f(window, d(c, ob0.h(num.intValue())));
        e(window, d(b2, ob0.h(num2.intValue())));
    }

    public static int b(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return ob0.b(context, 16843858, -16777216);
    }

    public static int c(Context context, boolean z) {
        if (z) {
            return 0;
        }
        return ob0.b(context, 16843857, -16777216);
    }

    public static boolean d(int i, boolean z) {
        return ob0.h(i) || (i == 0 && z);
    }

    public static void e(Window window, boolean z) {
        f81.a(window, window.getDecorView()).a(z);
    }

    public static void f(Window window, boolean z) {
        f81.a(window, window.getDecorView()).b(z);
    }
}
