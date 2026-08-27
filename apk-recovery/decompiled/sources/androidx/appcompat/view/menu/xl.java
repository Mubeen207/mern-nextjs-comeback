package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public class xl {
    public final Context a;
    public final yl b;
    public final b c;
    public final a d;
    public VelocityTracker e;
    public float f;
    public int g;
    public int h;
    public int i;
    public final int[] j;

    /* loaded from: classes.dex */
    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    public xl(Context context, yl ylVar) {
        this(context, ylVar, new b() { // from class: androidx.appcompat.view.menu.vl
            @Override // androidx.appcompat.view.menu.xl.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i) {
                xl.c(context2, iArr, motionEvent, i);
            }
        }, new a() { // from class: androidx.appcompat.view.menu.wl
            @Override // androidx.appcompat.view.menu.xl.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
                float f;
                f = xl.f(velocityTracker, motionEvent, i);
                return f;
            }
        });
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = t51.g(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = t51.f(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        f51.a(velocityTracker, motionEvent);
        f51.b(velocityTracker, 1000);
        return f51.d(velocityTracker, i);
    }

    public final boolean d(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.h == source && this.i == deviceId && this.g == i) {
            return false;
        }
        this.c.a(this.a, this.j, motionEvent, i);
        this.h = source;
        this.i = deviceId;
        this.g = i;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i) {
        if (this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        return this.d.a(this.e, motionEvent, i);
    }

    public void g(MotionEvent motionEvent, int i) {
        boolean d = d(motionEvent, i);
        if (this.j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.e = null;
                return;
            }
            return;
        }
        float e = e(motionEvent, i) * this.b.b();
        float signum = Math.signum(e);
        if (d || (signum != Math.signum(this.f) && signum != 0.0f)) {
            this.b.c();
        }
        float abs = Math.abs(e);
        int[] iArr = this.j;
        if (abs < iArr[0]) {
            return;
        }
        int i2 = iArr[1];
        float max = Math.max(-i2, Math.min(e, i2));
        this.f = this.b.a(max) ? max : 0.0f;
    }

    public xl(Context context, yl ylVar, b bVar, a aVar) {
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new int[]{Integer.MAX_VALUE, 0};
        this.a = context;
        this.b = ylVar;
        this.c = bVar;
        this.d = aVar;
    }
}
