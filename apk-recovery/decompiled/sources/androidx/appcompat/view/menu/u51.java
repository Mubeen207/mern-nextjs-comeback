package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
/* loaded from: classes.dex */
public class u51 {
    public static final Interpolator x = new a();
    public int a;
    public int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public float m;
    public float n;
    public int o;
    public final int p;
    public int q;
    public OverScroller r;
    public final c s;
    public View t;
    public boolean u;
    public final ViewGroup v;
    public int c = -1;
    public final Runnable w = new b();

    /* loaded from: classes.dex */
    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u51.this.E(0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract int a(View view, int i, int i2);

        public abstract int b(View view, int i, int i2);

        public int c(int i) {
            return i;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i, int i2) {
        }

        public boolean g(int i) {
            return false;
        }

        public void h(int i, int i2) {
        }

        public void i(View view, int i) {
        }

        public abstract void j(int i);

        public abstract void k(View view, int i, int i2, int i3, int i4);

        public abstract void l(View view, float f, float f2);

        public abstract boolean m(View view, int i);
    }

    public u51(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.v = viewGroup;
        this.s = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.p = i;
        this.o = i;
        this.b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.r = new OverScroller(context, x);
    }

    public static u51 l(ViewGroup viewGroup, float f, c cVar) {
        u51 m = m(viewGroup, cVar);
        m.b = (int) (m.b * (1.0f / f));
        return m;
    }

    public static u51 m(ViewGroup viewGroup, c cVar) {
        return new u51(viewGroup.getContext(), viewGroup, cVar);
    }

    public final void A() {
        this.l.computeCurrentVelocity(1000, this.m);
        n(e(this.l.getXVelocity(this.c), this.n, this.m), e(this.l.getYVelocity(this.c), this.n, this.m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.appcompat.view.menu.u51$c] */
    public final void B(float f, float f2, int i) {
        boolean c2 = c(f, f2, i, 1);
        boolean z = c2;
        if (c(f2, f, i, 4)) {
            z = c2 | true;
        }
        boolean z2 = z;
        if (c(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | true;
        }
        ?? r0 = z2;
        if (c(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | true;
        }
        if (r0 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | r0;
            this.s.f(r0, i);
        }
    }

    public final void C(float f, float f2, int i) {
        q(i);
        float[] fArr = this.d;
        this.f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.e;
        this.g[i] = f2;
        fArr2[i] = f2;
        this.h[i] = t((int) f, (int) f2);
        this.k |= 1 << i;
    }

    public final void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (x(pointerId)) {
                float x2 = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x2;
                this.g[pointerId] = y;
            }
        }
    }

    public void E(int i) {
        this.v.removeCallbacks(this.w);
        if (this.a != i) {
            this.a = i;
            this.s.j(i);
            if (this.a == 0) {
                this.t = null;
            }
        }
    }

    public boolean F(int i, int i2) {
        if (this.u) {
            return s(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.u51.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i, int i2) {
        this.t = view;
        this.c = -1;
        boolean s = s(i, i2, 0, 0);
        if (!s && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return s;
    }

    public boolean I(View view, int i) {
        if (view == this.t && this.c == i) {
            return true;
        }
        if (view == null || !this.s.m(view, i)) {
            return false;
        }
        this.c = i;
        b(view, i);
        return true;
    }

    public void a() {
        this.c = -1;
        g();
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public void b(View view, int i) {
        if (view.getParent() == this.v) {
            this.t = view;
            this.c = i;
            this.s.i(view, i);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.v + ")");
    }

    public final boolean c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.h[i] & i2) != i2 || (this.q & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.b;
        if (abs > i3 || abs2 > i3) {
            if (abs >= abs2 * 0.5f || !this.s.g(i2)) {
                return (this.i[i] & i2) == 0 && abs > ((float) this.b);
            }
            int[] iArr = this.j;
            iArr[i] = iArr[i] | i2;
            return false;
        }
        return false;
    }

    public final boolean d(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.s.d(view) > 0;
        boolean z2 = this.s.e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.b) : z2 && Math.abs(f2) > ((float) this.b);
        }
        int i = this.b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    public final float e(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    public final int f(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    public final void g() {
        float[] fArr = this.d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.e, 0.0f);
        Arrays.fill(this.f, 0.0f);
        Arrays.fill(this.g, 0.0f);
        Arrays.fill(this.h, 0);
        Arrays.fill(this.i, 0);
        Arrays.fill(this.j, 0);
        this.k = 0;
    }

    public final void h(int i) {
        if (this.d == null || !w(i)) {
            return;
        }
        this.d[i] = 0.0f;
        this.e[i] = 0.0f;
        this.f[i] = 0.0f;
        this.g[i] = 0.0f;
        this.h[i] = 0;
        this.i[i] = 0;
        this.j[i] = 0;
        this.k = (~(1 << i)) & this.k;
    }

    public final int i(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.v.getWidth();
        float f = width / 2;
        float o = f + (o(Math.min(1.0f, Math.abs(i) / width)) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(o / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final int j(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int f5 = f(i3, (int) this.n, (int) this.m);
        int f6 = f(i4, (int) this.n, (int) this.m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(f5);
        int abs4 = Math.abs(f6);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (f5 != 0) {
            f = abs3;
            f2 = i5;
        } else {
            f = abs;
            f2 = i6;
        }
        float f7 = f / f2;
        if (f6 != 0) {
            f3 = abs4;
            f4 = i5;
        } else {
            f3 = abs2;
            f4 = i6;
        }
        return (int) ((i(i, f5, this.s.d(view)) * f7) + (i(i2, f6, this.s.e(view)) * (f3 / f4)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r0 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(boolean r12) {
        /*
            r11 = this;
            int r0 = r11.a
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L6a
            android.widget.OverScroller r0 = r11.r
            boolean r0 = r0.computeScrollOffset()
            android.widget.OverScroller r3 = r11.r
            int r3 = r3.getCurrX()
            android.widget.OverScroller r4 = r11.r
            int r10 = r4.getCurrY()
            android.view.View r4 = r11.t
            int r4 = r4.getLeft()
            int r8 = r3 - r4
            android.view.View r4 = r11.t
            int r4 = r4.getTop()
            int r9 = r10 - r4
            if (r8 == 0) goto L2f
            android.view.View r4 = r11.t
            androidx.appcompat.view.menu.p51.U(r4, r8)
        L2f:
            if (r9 == 0) goto L36
            android.view.View r4 = r11.t
            androidx.appcompat.view.menu.p51.V(r4, r9)
        L36:
            if (r8 != 0) goto L3a
            if (r9 == 0) goto L43
        L3a:
            androidx.appcompat.view.menu.u51$c r4 = r11.s
            android.view.View r5 = r11.t
            r6 = r3
            r7 = r10
            r4.k(r5, r6, r7, r8, r9)
        L43:
            if (r0 == 0) goto L5b
            android.widget.OverScroller r4 = r11.r
            int r4 = r4.getFinalX()
            if (r3 != r4) goto L5b
            android.widget.OverScroller r3 = r11.r
            int r3 = r3.getFinalY()
            if (r10 != r3) goto L5b
            android.widget.OverScroller r0 = r11.r
            r0.abortAnimation()
            goto L5d
        L5b:
            if (r0 != 0) goto L6a
        L5d:
            if (r12 == 0) goto L67
            android.view.ViewGroup r12 = r11.v
            java.lang.Runnable r0 = r11.w
            r12.post(r0)
            goto L6a
        L67:
            r11.E(r1)
        L6a:
            int r12 = r11.a
            if (r12 != r2) goto L6f
            r1 = 1
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.u51.k(boolean):boolean");
    }

    public final void n(float f, float f2) {
        this.u = true;
        this.s.l(this.t, f, f2);
        this.u = false;
        if (this.a == 1) {
            E(0);
        }
    }

    public final float o(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public final void p(int i, int i2, int i3, int i4) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        if (i3 != 0) {
            i = this.s.a(this.t, i, i3);
            p51.U(this.t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.s.b(this.t, i2, i4);
            p51.V(this.t, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.s.k(this.t, i5, i6, i5 - left, i6 - top);
    }

    public final void q(int i) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
    }

    public View r(int i, int i2) {
        for (int childCount = this.v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.v.getChildAt(this.s.c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean s(int i, int i2, int i3, int i4) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.r.abortAnimation();
            E(0);
            return false;
        }
        this.r.startScroll(left, top, i5, i6, j(this.t, i5, i6, i3, i4));
        E(2);
        return true;
    }

    public final int t(int i, int i2) {
        int i3 = i < this.v.getLeft() + this.o ? 1 : 0;
        if (i2 < this.v.getTop() + this.o) {
            i3 |= 4;
        }
        if (i > this.v.getRight() - this.o) {
            i3 |= 2;
        }
        return i2 > this.v.getBottom() - this.o ? i3 | 8 : i3;
    }

    public int u() {
        return this.b;
    }

    public boolean v(int i, int i2) {
        return y(this.t, i, i2);
    }

    public boolean w(int i) {
        return ((1 << i) & this.k) != 0;
    }

    public final boolean x(int i) {
        if (w(i)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean y(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
        if (r9.c == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
        A();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.u51.z(android.view.MotionEvent):void");
    }
}
