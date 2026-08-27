package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.appcompat.view.menu.cm0;
import androidx.appcompat.view.menu.dn0;
import androidx.appcompat.view.menu.hm0;
import androidx.appcompat.view.menu.hn0;
import androidx.appcompat.view.menu.lb0;
import androidx.appcompat.view.menu.my0;
import androidx.appcompat.view.menu.n50;
import androidx.appcompat.view.menu.on0;
import androidx.appcompat.view.menu.p0;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.p61;
import androidx.appcompat.view.menu.qb0;
import androidx.appcompat.view.menu.rb0;
import androidx.appcompat.view.menu.s0;
import androidx.appcompat.view.menu.u51;
import androidx.appcompat.view.menu.vt0;
import androidx.appcompat.view.menu.xb0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.b {
    public static final int i0 = hn0.b;
    public boolean A;
    public final g B;
    public ValueAnimator C;
    public int D;
    public int E;
    public int F;
    public float G;
    public int H;
    public float I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public u51 O;
    public boolean P;
    public int Q;
    public boolean R;
    public float S;
    public int T;
    public int U;
    public int V;
    public WeakReference W;
    public WeakReference X;
    public WeakReference Y;
    public final ArrayList Z;
    public int a;
    public VelocityTracker a0;
    public boolean b;
    public lb0 b0;
    public boolean c;
    public int c0;
    public float d;
    public int d0;
    public int e;
    public boolean e0;
    public int f;
    public Map f0;
    public boolean g;
    public final SparseIntArray g0;
    public int h;
    public final u51.c h0;
    public int i;
    public rb0 j;
    public ColorStateList k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public boolean y;
    public vt0 z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ View m;
        public final /* synthetic */ int n;

        public a(View view, int i) {
            this.m = view;
            this.n = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.V0(this.m, this.n, false);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.j != null) {
                BottomSheetBehavior.this.j.U(floatValue);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements p61.c {
        public final /* synthetic */ boolean a;

        public c(boolean z) {
            this.a = z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
            if (r6 != false) goto L31;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
        @Override // androidx.appcompat.view.menu.p61.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.appcompat.view.menu.b91 a(android.view.View r11, androidx.appcompat.view.menu.b91 r12, androidx.appcompat.view.menu.p61.d r13) {
            /*
                r10 = this;
                int r0 = androidx.appcompat.view.menu.b91.m.h()
                androidx.appcompat.view.menu.m50 r0 = r12.f(r0)
                int r1 = androidx.appcompat.view.menu.b91.m.e()
                androidx.appcompat.view.menu.m50 r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.b
                com.google.android.material.bottomsheet.BottomSheetBehavior.P(r2, r3)
                boolean r2 = androidx.appcompat.view.menu.p61.g(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.h()
                com.google.android.material.bottomsheet.BottomSheetBehavior.S(r3, r6)
                int r3 = r13.d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.R(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.T(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.c
                goto L50
            L4e:
                int r4 = r13.a
            L50:
                int r6 = r0.a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.a
                goto L62
            L60:
                int r13 = r13.c
            L62:
                int r2 = r0.c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.V(r2)
                r6 = 1
                r7 = 0
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r6
                goto L81
            L80:
                r2 = r7
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.W(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                goto L93
            L92:
                r6 = r2
            L93:
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.F(r2)
                if (r2 == 0) goto La4
                int r2 = r13.topMargin
                int r0 = r0.b
                if (r2 == r0) goto La4
                r13.topMargin = r0
                goto La6
            La4:
                if (r6 == 0) goto La9
            La6:
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.d
                com.google.android.material.bottomsheet.BottomSheetBehavior.G(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.a
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.H(r11, r7)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, androidx.appcompat.view.menu.b91, androidx.appcompat.view.menu.p61$d):androidx.appcompat.view.menu.b91");
        }
    }

    /* loaded from: classes.dex */
    public class d extends u51.c {
        public long a;

        public d() {
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public int b(View view, int i, int i2) {
            return xb0.b(i, BottomSheetBehavior.this.m0(), e(view));
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public int e(View view) {
            return BottomSheetBehavior.this.e0() ? BottomSheetBehavior.this.V : BottomSheetBehavior.this.H;
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public void j(int i) {
            if (i == 1 && BottomSheetBehavior.this.L) {
                BottomSheetBehavior.this.O0(1);
            }
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public void k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.j0(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r7.b.Q0(r0, (r9 * 100.0f) / r10.V) != false) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
            if (r9 > r7.b.F) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.b.m0()) < java.lang.Math.abs(r8.getTop() - r7.b.F)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
            if (r7.b.T0() == false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00f1, code lost:
            if (java.lang.Math.abs(r9 - r7.b.E) < java.lang.Math.abs(r9 - r7.b.H)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x010d, code lost:
            if (r7.b.T0() != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0127, code lost:
            if (r7.b.T0() == false) goto L6;
         */
        @Override // androidx.appcompat.view.menu.u51.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public boolean m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.M;
            if (i2 == 1 || bottomSheetBehavior.e0) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.c0 == i) {
                WeakReference weakReference = bottomSheetBehavior.Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.W;
            return weakReference2 != null && weakReference2.get() == view;
        }

        public final boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.V + bottomSheetBehavior.m0()) / 2;
        }
    }

    /* loaded from: classes.dex */
    public class e implements s0 {
        public final /* synthetic */ int a;

        public e(int i) {
            this.a = i;
        }

        @Override // androidx.appcompat.view.menu.s0
        public boolean a(View view, s0.a aVar) {
            BottomSheetBehavior.this.N0(this.a);
            return true;
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.c = false;
        this.l = -1;
        this.m = -1;
        this.B = new g(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList();
        this.d0 = -1;
        this.g0 = new SparseIntArray();
        this.h0 = new d();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.Q = 0;
        this.R = false;
        return (i & 2) != 0;
    }

    public void A0(boolean z) {
        this.L = z;
    }

    public void B0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.D = i;
        Y0(this.M, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r4.getTop() <= r2.F) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.H)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
        if (T0() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.H)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.F) < java.lang.Math.abs(r3 - r2.H)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
        r0 = 6;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.O0(r0)
            return
        Lf:
            boolean r3 = r2.v0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.Y
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.R
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.Q
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.J
            if (r3 == 0) goto L49
            float r3 = r2.o0()
            boolean r3 = r2.S0(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.Q
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.b
            if (r1 == 0) goto L68
            int r5 = r2.E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.F
            if (r3 >= r1) goto L7e
            int r1 = r2.H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.T0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.V0(r4, r0, r3)
            r2.R = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void C0(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.W != null) {
            Y();
        }
        O0((this.b && this.M == 6) ? 3 : this.M);
        Y0(this.M, true);
        W0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (view.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.M == 1 && actionMasked == 0) {
                return true;
            }
            if (R0()) {
                this.O.z(motionEvent);
            }
            if (actionMasked == 0) {
                x0();
            }
            if (this.a0 == null) {
                this.a0 = VelocityTracker.obtain();
            }
            this.a0.addMovement(motionEvent);
            if (R0() && actionMasked == 2 && !this.P && Math.abs(this.d0 - motionEvent.getY()) > this.O.u()) {
                this.O.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.P;
        }
        return false;
    }

    public void D0(boolean z) {
        this.o = z;
    }

    public void E0(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.G = f2;
        if (this.W != null) {
            a0();
        }
    }

    public void F0(boolean z) {
        if (this.J != z) {
            this.J = z;
            if (!z && this.M == 5) {
                N0(4);
            }
            W0();
        }
    }

    public void G0(int i) {
        this.m = i;
    }

    public void H0(int i) {
        this.l = i;
    }

    public void I0(int i) {
        J0(i, false);
    }

    public final void J0(int i, boolean z) {
        if (i == -1) {
            if (this.g) {
                return;
            }
            this.g = true;
        } else if (!this.g && this.f == i) {
            return;
        } else {
            this.g = false;
            this.f = Math.max(0, i);
        }
        a1(z);
    }

    public void K0(int i) {
        this.a = i;
    }

    public void L0(int i) {
        this.e = i;
    }

    public void M0(boolean z) {
        this.K = z;
    }

    public void N0(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.J && i == 5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot set state: ");
            sb2.append(i);
        } else {
            int i2 = (i == 6 && this.b && n0(i) <= this.E) ? 3 : i;
            WeakReference weakReference = this.W;
            if (weakReference == null || weakReference.get() == null) {
                O0(i);
                return;
            }
            View view = (View) this.W.get();
            z0(view, new a(view, i2));
        }
    }

    public void O0(int i) {
        if (this.M == i) {
            return;
        }
        this.M = i;
        if (i == 4 || i == 3 || i == 6 || (this.J && i == 5)) {
            this.N = i;
        }
        WeakReference weakReference = this.W;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            Z0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            Z0(false);
        }
        Y0(i, true);
        if (this.Z.size() <= 0) {
            W0();
        } else {
            my0.a(this.Z.get(0));
            throw null;
        }
    }

    public final void P0(View view) {
        boolean z = (Build.VERSION.SDK_INT < 29 || r0() || this.g) ? false : true;
        if (this.p || this.q || this.r || this.t || this.u || this.v || z) {
            p61.b(view, new c(z));
        }
    }

    public boolean Q0(long j, float f2) {
        return false;
    }

    public final boolean R0() {
        return this.O != null && (this.L || this.M == 1);
    }

    public boolean S0(View view, float f2) {
        if (this.K) {
            return true;
        }
        if (t0() && view.getTop() >= this.H) {
            return Math.abs((((float) view.getTop()) + (f2 * this.S)) - ((float) this.H)) / ((float) c0()) > 0.5f;
        }
        return false;
    }

    public boolean T0() {
        return false;
    }

    public boolean U0() {
        return true;
    }

    public final void V0(View view, int i, boolean z) {
        int n0 = n0(i);
        u51 u51Var = this.O;
        if (u51Var == null || (!z ? u51Var.H(view, view.getLeft(), n0) : u51Var.F(view.getLeft(), n0))) {
            O0(i);
            return;
        }
        O0(2);
        Y0(i, true);
        this.B.c(i);
    }

    public final void W0() {
        WeakReference weakReference = this.W;
        if (weakReference != null) {
            X0((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.X;
        if (weakReference2 != null) {
            X0((View) weakReference2.get(), 1);
        }
    }

    public final int X(View view, int i, int i2) {
        return p51.c(view, view.getResources().getString(i), g0(i2));
    }

    public final void X0(View view, int i) {
        if (view == null) {
            return;
        }
        f0(view, i);
        if (!this.b && this.M != 6) {
            this.g0.put(i, X(view, dn0.a, 6));
        }
        if (this.J && t0() && this.M != 5) {
            w0(view, p0.a.y, 5);
        }
        int i2 = this.M;
        if (i2 == 3) {
            w0(view, p0.a.x, this.b ? 4 : 6);
        } else if (i2 == 4) {
            w0(view, p0.a.w, this.b ? 3 : 6);
        } else if (i2 != 6) {
        } else {
            w0(view, p0.a.x, 4);
            w0(view, p0.a.w, 3);
        }
    }

    public final void Y() {
        int c0 = c0();
        if (this.b) {
            this.H = Math.max(this.V - c0, this.E);
        } else {
            this.H = this.V - c0;
        }
    }

    public final void Y0(int i, boolean z) {
        boolean q0;
        ValueAnimator valueAnimator;
        if (i == 2 || this.A == (q0 = q0()) || this.j == null) {
            return;
        }
        this.A = q0;
        if (!z || (valueAnimator = this.C) == null) {
            ValueAnimator valueAnimator2 = this.C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.C.cancel();
            }
            this.j.U(this.A ? b0() : 1.0f);
        } else if (valueAnimator.isRunning()) {
            this.C.reverse();
        } else {
            this.C.setFloatValues(this.j.w(), q0 ? b0() : 1.0f);
            this.C.start();
        }
    }

    public final float Z(float f2, RoundedCorner roundedCorner) {
        int radius;
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            float f3 = radius;
            if (f3 > 0.0f && f2 > 0.0f) {
                return f3 / f2;
            }
        }
        return 0.0f;
    }

    public final void Z0(boolean z) {
        Map map;
        WeakReference weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.f0 != null) {
                    return;
                }
                this.f0 = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.W.get()) {
                    if (z) {
                        this.f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.c) {
                            p51.u0(childAt, 4);
                        }
                    } else if (this.c && (map = this.f0) != null && map.containsKey(childAt)) {
                        p51.u0(childAt, ((Integer) this.f0.get(childAt)).intValue());
                    }
                }
            }
            if (!z) {
                this.f0 = null;
            } else if (this.c) {
                ((View) this.W.get()).sendAccessibilityEvent(8);
            }
        }
    }

    public final void a0() {
        this.F = (int) (this.V * (1.0f - this.G));
    }

    public final void a1(boolean z) {
        View view;
        if (this.W != null) {
            Y();
            if (this.M != 4 || (view = (View) this.W.get()) == null) {
                return;
            }
            if (z) {
                N0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    public final float b0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        if (this.j == null || (weakReference = this.W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.W.get();
        if (!p0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        float C = this.j.C();
        roundedCorner = rootWindowInsets.getRoundedCorner(0);
        float Z = Z(C, roundedCorner);
        float D = this.j.D();
        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
        return Math.max(Z, Z(D, roundedCorner2));
    }

    public final int c0() {
        int i;
        return this.g ? Math.min(Math.max(this.h, this.V - ((this.U * 9) / 16)), this.T) + this.w : (this.o || this.p || (i = this.n) <= 0) ? this.f + this.w : Math.max(this.f, i + this.i);
    }

    public final float d0(int i) {
        float f2;
        float f3;
        int i2 = this.H;
        if (i > i2 || i2 == m0()) {
            int i3 = this.H;
            f2 = i3 - i;
            f3 = this.V - i3;
        } else {
            int i4 = this.H;
            f2 = i4 - i;
            f3 = i4 - m0();
        }
        return f2 / f3;
    }

    public final boolean e0() {
        return s0() && t0();
    }

    public final void f0(View view, int i) {
        if (view == null) {
            return;
        }
        p51.e0(view, 524288);
        p51.e0(view, 262144);
        p51.e0(view, 1048576);
        int i2 = this.g0.get(i, -1);
        if (i2 != -1) {
            p51.e0(view, i2);
            this.g0.delete(i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.W = null;
        this.O = null;
        this.b0 = null;
    }

    public final s0 g0(int i) {
        return new e(i);
    }

    public final void h0(Context context) {
        if (this.z == null) {
            return;
        }
        rb0 rb0Var = new rb0(this.z);
        this.j = rb0Var;
        rb0Var.J(context);
        ColorStateList colorStateList = this.k;
        if (colorStateList != null) {
            this.j.T(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.j.setTint(typedValue.data);
    }

    public final void i0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(b0(), 1.0f);
        this.C = ofFloat;
        ofFloat.setDuration(500L);
        this.C.addUpdateListener(new b());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void j() {
        super.j();
        this.W = null;
        this.O = null;
        this.b0 = null;
    }

    public void j0(int i) {
        if (((View) this.W.get()) == null || this.Z.isEmpty()) {
            return;
        }
        d0(i);
        if (this.Z.size() <= 0) {
            return;
        }
        my0.a(this.Z.get(0));
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        u51 u51Var;
        if (!view.isShown() || !this.L) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            x0();
        }
        if (this.a0 == null) {
            this.a0 = VelocityTracker.obtain();
        }
        this.a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.d0 = (int) motionEvent.getY();
            if (this.M != 2) {
                WeakReference weakReference = this.Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.z(view2, x, this.d0)) {
                    this.c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.e0 = true;
                }
            }
            this.P = this.c0 == -1 && !coordinatorLayout.z(view, x, this.d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.e0 = false;
            this.c0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (this.P || (u51Var = this.O) == null || !u51Var.G(motionEvent)) {
            WeakReference weakReference2 = this.Y;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            return (actionMasked != 2 || view3 == null || this.P || this.M == 1 || coordinatorLayout.z(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || (i = this.d0) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.O.u())) ? false : true;
        }
        return true;
    }

    public View k0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (p51.P(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View k0 = k0(viewGroup.getChildAt(i));
                if (k0 != null) {
                    return k0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (p51.u(coordinatorLayout) && !p51.u(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.W == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(hm0.a);
            P0(view);
            p51.B0(view, new n50(view));
            this.W = new WeakReference(view);
            this.b0 = new lb0(view);
            rb0 rb0Var = this.j;
            if (rb0Var != null) {
                p51.o0(view, rb0Var);
                rb0 rb0Var2 = this.j;
                float f2 = this.I;
                if (f2 == -1.0f) {
                    f2 = p51.s(view);
                }
                rb0Var2.S(f2);
            } else {
                ColorStateList colorStateList = this.k;
                if (colorStateList != null) {
                    p51.p0(view, colorStateList);
                }
            }
            W0();
            if (p51.v(view) == 0) {
                p51.u0(view, 1);
            }
        }
        if (this.O == null) {
            this.O = u51.m(coordinatorLayout, this.h0);
        }
        int top = view.getTop();
        coordinatorLayout.G(view, i);
        this.U = coordinatorLayout.getWidth();
        this.V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.T = height;
        int i2 = this.V;
        int i3 = i2 - height;
        int i4 = this.x;
        if (i3 < i4) {
            if (this.s) {
                int i5 = this.m;
                if (i5 != -1) {
                    i2 = Math.min(i2, i5);
                }
                this.T = i2;
            } else {
                int i6 = i2 - i4;
                int i7 = this.m;
                if (i7 != -1) {
                    i6 = Math.min(i6, i7);
                }
                this.T = i6;
            }
        }
        this.E = Math.max(0, this.V - this.T);
        a0();
        Y();
        int i8 = this.M;
        if (i8 == 3) {
            p51.V(view, m0());
        } else if (i8 == 6) {
            p51.V(view, this.F);
        } else if (this.J && i8 == 5) {
            p51.V(view, this.V);
        } else if (i8 == 4) {
            p51.V(view, this.H);
        } else if (i8 == 1 || i8 == 2) {
            p51.V(view, top - view.getTop());
        }
        Y0(this.M, false);
        this.Y = new WeakReference(k0(view));
        if (this.Z.size() <= 0) {
            return true;
        }
        my0.a(this.Z.get(0));
        throw null;
    }

    public final int l0(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(l0(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.l, marginLayoutParams.width), l0(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.m, marginLayoutParams.height));
        return true;
    }

    public int m0() {
        if (this.b) {
            return this.E;
        }
        return Math.max(this.D, this.s ? 0 : this.x);
    }

    public final int n0(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.F;
                    }
                    throw new IllegalArgumentException("Invalid state to get top offset: " + i);
                }
                return this.V;
            }
            return this.H;
        }
        return m0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f2, float f3) {
        WeakReference weakReference;
        if (v0() && (weakReference = this.Y) != null && view2 == weakReference.get()) {
            return this.M != 3 || super.o(coordinatorLayout, view, view2, f2, f3);
        }
        return false;
    }

    public final float o0() {
        VelocityTracker velocityTracker = this.a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.d);
        return this.a0.getYVelocity(this.c0);
    }

    public final boolean p0() {
        WeakReference weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.W.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.Y;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!v0() || view2 == view3) {
            int top = view.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < m0()) {
                    int m0 = top - m0();
                    iArr[1] = m0;
                    p51.V(view, -m0);
                    O0(3);
                } else if (!this.L) {
                    return;
                } else {
                    iArr[1] = i2;
                    p51.V(view, -i2);
                    O0(1);
                }
            } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
                if (i4 > this.H && !e0()) {
                    int i5 = top - this.H;
                    iArr[1] = i5;
                    p51.V(view, -i5);
                    O0(4);
                } else if (!this.L) {
                    return;
                } else {
                    iArr[1] = i2;
                    p51.V(view, -i2);
                    O0(1);
                }
            }
            j0(view.getTop());
            this.Q = i2;
            this.R = true;
        }
    }

    public final boolean q0() {
        return this.M == 3 && (this.y || p0());
    }

    public boolean r0() {
        return this.o;
    }

    public boolean s0() {
        return this.J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public boolean t0() {
        return true;
    }

    public final boolean u0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && p51.N(view);
    }

    public boolean v0() {
        return true;
    }

    public final void w0(View view, p0.a aVar, int i) {
        p51.g0(view, aVar, null, g0(i));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.x(coordinatorLayout, view, fVar.a());
        y0(fVar);
        int i = fVar.o;
        if (i == 1 || i == 2) {
            this.M = 4;
            this.N = 4;
            return;
        }
        this.M = i;
        this.N = i;
    }

    public final void x0() {
        this.c0 = -1;
        this.d0 = -1;
        VelocityTracker velocityTracker = this.a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.a0 = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new f(super.y(coordinatorLayout, view), this);
    }

    public final void y0(f fVar) {
        int i = this.a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.f = fVar.p;
        }
        if (i == -1 || (i & 2) == 2) {
            this.b = fVar.q;
        }
        if (i == -1 || (i & 4) == 4) {
            this.J = fVar.r;
        }
        if (i == -1 || (i & 8) == 8) {
            this.K = fVar.s;
        }
    }

    public final void z0(View view, Runnable runnable) {
        if (u0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* loaded from: classes.dex */
    public class g {
        public int a;
        public boolean b;
        public final Runnable c;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.b = false;
                u51 u51Var = BottomSheetBehavior.this.O;
                if (u51Var != null && u51Var.k(true)) {
                    g gVar = g.this;
                    gVar.c(gVar.a);
                    return;
                }
                g gVar2 = g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.M == 2) {
                    bottomSheetBehavior.O0(gVar2.a);
                }
            }
        }

        public g() {
            this.c = new a();
        }

        public void c(int i) {
            WeakReference weakReference = BottomSheetBehavior.this.W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            p51.c0((View) BottomSheetBehavior.this.W.get(), this.c);
            this.b = true;
        }

        public /* synthetic */ g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class f extends androidx.appcompat.view.menu.c {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public final int o;
        public int p;
        public boolean q;
        public boolean r;
        public boolean s;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.o = parcel.readInt();
            this.p = parcel.readInt();
            this.q = parcel.readInt() == 1;
            this.r = parcel.readInt() == 1;
            this.s = parcel.readInt() == 1;
        }

        @Override // androidx.appcompat.view.menu.c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
            parcel.writeInt(this.q ? 1 : 0);
            parcel.writeInt(this.r ? 1 : 0);
            parcel.writeInt(this.s ? 1 : 0);
        }

        public f(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.o = bottomSheetBehavior.M;
            this.p = bottomSheetBehavior.f;
            this.q = bottomSheetBehavior.b;
            this.r = bottomSheetBehavior.J;
            this.s = bottomSheetBehavior.K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.a = 0;
        this.b = true;
        this.c = false;
        this.l = -1;
        this.m = -1;
        this.B = new g(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList();
        this.d0 = -1;
        this.g0 = new SparseIntArray();
        this.h0 = new d();
        this.i = context.getResources().getDimensionPixelSize(hm0.R);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, on0.x);
        if (obtainStyledAttributes.hasValue(on0.B)) {
            this.k = qb0.a(context, obtainStyledAttributes, on0.B);
        }
        if (obtainStyledAttributes.hasValue(on0.T)) {
            this.z = vt0.e(context, attributeSet, cm0.a, i0).m();
        }
        h0(context);
        i0();
        this.I = obtainStyledAttributes.getDimension(on0.A, -1.0f);
        if (obtainStyledAttributes.hasValue(on0.y)) {
            H0(obtainStyledAttributes.getDimensionPixelSize(on0.y, -1));
        }
        if (obtainStyledAttributes.hasValue(on0.z)) {
            G0(obtainStyledAttributes.getDimensionPixelSize(on0.z, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(on0.H);
        if (peekValue != null && (i = peekValue.data) == -1) {
            I0(i);
        } else {
            I0(obtainStyledAttributes.getDimensionPixelSize(on0.H, -1));
        }
        F0(obtainStyledAttributes.getBoolean(on0.G, false));
        D0(obtainStyledAttributes.getBoolean(on0.L, false));
        C0(obtainStyledAttributes.getBoolean(on0.E, true));
        M0(obtainStyledAttributes.getBoolean(on0.K, false));
        A0(obtainStyledAttributes.getBoolean(on0.C, true));
        K0(obtainStyledAttributes.getInt(on0.I, 0));
        E0(obtainStyledAttributes.getFloat(on0.F, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(on0.D);
        if (peekValue2 != null && peekValue2.type == 16) {
            B0(peekValue2.data);
        } else {
            B0(obtainStyledAttributes.getDimensionPixelOffset(on0.D, 0));
        }
        L0(obtainStyledAttributes.getInt(on0.J, 500));
        this.p = obtainStyledAttributes.getBoolean(on0.P, false);
        this.q = obtainStyledAttributes.getBoolean(on0.Q, false);
        this.r = obtainStyledAttributes.getBoolean(on0.R, false);
        this.s = obtainStyledAttributes.getBoolean(on0.S, true);
        this.t = obtainStyledAttributes.getBoolean(on0.M, false);
        this.u = obtainStyledAttributes.getBoolean(on0.N, false);
        this.v = obtainStyledAttributes.getBoolean(on0.O, false);
        this.y = obtainStyledAttributes.getBoolean(on0.U, true);
        obtainStyledAttributes.recycle();
        this.d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
