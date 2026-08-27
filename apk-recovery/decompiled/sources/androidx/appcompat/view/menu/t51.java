package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class t51 {

    /* loaded from: classes.dex */
    public static class a {
        public static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        public static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        public static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
        }

        public static int b(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
        }
    }

    public static int a(Resources resources, int i, iy0 iy0Var, int i2) {
        int dimensionPixelSize;
        return i != -1 ? (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) ? i2 : dimensionPixelSize : ((Integer) iy0Var.get()).intValue();
    }

    public static int b(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    public static int c(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return b(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static int d(Resources resources, int i, int i2) {
        if (i == 4194304 && i2 == 26) {
            return b(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float e(ViewConfiguration viewConfiguration, Context context) {
        return a.a(viewConfiguration);
    }

    public static int f(Context context, final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i, i2, i3);
        }
        if (i(i, i2, i3)) {
            Resources resources = context.getResources();
            int c2 = c(resources, i3, i2);
            Objects.requireNonNull(viewConfiguration);
            return a(resources, c2, new iy0() { // from class: androidx.appcompat.view.menu.s51
                @Override // androidx.appcompat.view.menu.iy0
                public final Object get() {
                    return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
                }
            }, Integer.MIN_VALUE);
        }
        return Integer.MIN_VALUE;
    }

    public static int g(Context context, final ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i, i2, i3);
        }
        if (i(i, i2, i3)) {
            Resources resources = context.getResources();
            int d = d(resources, i3, i2);
            Objects.requireNonNull(viewConfiguration);
            return a(resources, d, new iy0() { // from class: androidx.appcompat.view.menu.r51
                @Override // androidx.appcompat.view.menu.iy0
                public final Object get() {
                    return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
                }
            }, Integer.MAX_VALUE);
        }
        return Integer.MAX_VALUE;
    }

    public static float h(ViewConfiguration viewConfiguration, Context context) {
        return a.b(viewConfiguration);
    }

    public static boolean i(int i, int i2, int i3) {
        InputDevice device = InputDevice.getDevice(i);
        return (device == null || device.getMotionRange(i2, i3) == null) ? false : true;
    }

    public static boolean j(ViewConfiguration viewConfiguration, Context context) {
        return b.b(viewConfiguration);
    }
}
