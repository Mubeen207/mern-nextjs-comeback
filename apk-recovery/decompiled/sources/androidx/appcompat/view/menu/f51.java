package androidx.appcompat.view.menu;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class f51 {
    public static Map a = Collections.synchronizedMap(new WeakHashMap());

    /* loaded from: classes.dex */
    public static class a {
        public static float a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }

        public static float b(VelocityTracker velocityTracker, int i, int i2) {
            return velocityTracker.getAxisVelocity(i, i2);
        }

        public static boolean c(VelocityTracker velocityTracker, int i) {
            return velocityTracker.isAxisSupported(i);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!a.containsKey(velocityTracker)) {
                a.put(velocityTracker, new g51());
            }
            ((g51) a.get(velocityTracker)).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i) {
        c(velocityTracker, i, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i, float f) {
        velocityTracker.computeCurrentVelocity(i, f);
        g51 e = e(velocityTracker);
        if (e != null) {
            e.c(i, f);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        g51 e = e(velocityTracker);
        if (e != null) {
            return e.d(i);
        }
        return 0.0f;
    }

    public static g51 e(VelocityTracker velocityTracker) {
        return (g51) a.get(velocityTracker);
    }
}
