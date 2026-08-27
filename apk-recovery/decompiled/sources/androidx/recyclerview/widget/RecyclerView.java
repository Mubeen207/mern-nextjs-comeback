package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.pm.PackageParser;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.bm0;
import androidx.appcompat.view.menu.gm0;
import androidx.appcompat.view.menu.in;
import androidx.appcompat.view.menu.my0;
import androidx.appcompat.view.menu.nn0;
import androidx.appcompat.view.menu.p0;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.r11;
import androidx.appcompat.view.menu.t51;
import androidx.appcompat.view.menu.tj0;
import androidx.appcompat.view.menu.ue0;
import androidx.appcompat.view.menu.yd0;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final Class[] D0;
    public static final Interpolator E0;
    public final AccessibilityManager A;
    public List B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public k G;
    public EdgeEffect H;
    public EdgeEffect I;
    public EdgeEffect J;
    public EdgeEffect K;
    public l L;
    public int M;
    public int N;
    public VelocityTracker O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public q U;
    public final int V;
    public final int W;
    public final w a;
    public float a0;
    public final u b;
    public float b0;
    public x c;
    public boolean c0;
    public androidx.recyclerview.widget.a d;
    public final b0 d0;
    public androidx.recyclerview.widget.b e;
    public androidx.recyclerview.widget.e e0;
    public final androidx.recyclerview.widget.p f;
    public e.b f0;
    public boolean g;
    public final z g0;
    public final Runnable h;
    public s h0;
    public final Rect i;
    public List i0;
    public final Rect j;
    public boolean j0;
    public final RectF k;
    public boolean k0;
    public g l;
    public l.a l0;
    public o m;
    public boolean m0;
    public final ArrayList n;
    public androidx.recyclerview.widget.k n0;
    public final ArrayList o;
    public final int[] o0;
    public r p;
    public ue0 p0;
    public boolean q;
    public final int[] q0;
    public boolean r;
    public final int[] r0;
    public boolean s;
    public final int[] s0;
    public boolean t;
    public final List t0;
    public int u;
    public Runnable u0;
    public boolean v;
    public final p.b v0;
    public boolean w;
    public boolean x;
    public int y;
    public boolean z;
    public static final int[] w0 = {16843830};
    public static final boolean x0 = false;
    public static final boolean y0 = true;
    public static final boolean z0 = true;
    public static final boolean A0 = true;
    public static final boolean B0 = false;
    public static final boolean C0 = false;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.t || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.q) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.w) {
                recyclerView2.v = true;
            } else {
                recyclerView2.t();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a0 {
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.L;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.m0 = false;
        }
    }

    /* loaded from: classes.dex */
    public class b0 implements Runnable {
        public int m;
        public int n;
        public OverScroller o;
        public Interpolator p;
        public boolean q;
        public boolean r;

        public b0() {
            Interpolator interpolator = RecyclerView.E0;
            this.p = interpolator;
            this.q = false;
            this.r = false;
            this.o = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            int sqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = width;
            float f2 = i6;
            float b = f2 + (b(Math.min(1.0f, (sqrt2 * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(b / sqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        public final float b(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        public void c(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.n = 0;
            this.m = 0;
            Interpolator interpolator = this.p;
            Interpolator interpolator2 = RecyclerView.E0;
            if (interpolator != interpolator2) {
                this.p = interpolator2;
                this.o = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.o.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            e();
        }

        public final void d() {
            RecyclerView.this.removeCallbacks(this);
            p51.c0(RecyclerView.this, this);
        }

        public void e() {
            if (this.q) {
                this.r = true;
            } else {
                d();
            }
        }

        public void f(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.E0;
            }
            if (this.p != interpolator) {
                this.p = interpolator;
                this.o = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.n = 0;
            this.m = 0;
            RecyclerView.this.setScrollState(2);
            this.o.startScroll(0, 0, i, i2, i4);
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.o.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.m == null) {
                g();
                return;
            }
            this.r = false;
            this.q = true;
            recyclerView.t();
            OverScroller overScroller = this.o;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.m;
                int i4 = currY - this.n;
                this.m = currX;
                this.n = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.s0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.E(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.s0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.s(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.l != null) {
                    int[] iArr3 = recyclerView3.s0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.e1(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.s0;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    y yVar = recyclerView4.m.g;
                    if (yVar != null && !yVar.g() && yVar.h()) {
                        int b = RecyclerView.this.g0.b();
                        if (b == 0) {
                            yVar.r();
                        } else if (yVar.f() >= b) {
                            yVar.p(b - 1);
                            yVar.j(i2, i);
                        } else {
                            yVar.j(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.n.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.s0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.F(i2, i, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.s0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.H(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                y yVar2 = RecyclerView.this.m.g;
                if ((yVar2 == null || !yVar2.g()) && z) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i7, currVelocity);
                    }
                    if (RecyclerView.A0) {
                        RecyclerView.this.f0.b();
                    }
                } else {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.e0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i2, i);
                    }
                }
            }
            y yVar3 = RecyclerView.this.m.g;
            if (yVar3 != null && yVar3.g()) {
                yVar3.j(0, 0);
            }
            this.q = false;
            if (this.r) {
                d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.r1(1);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c0 {
        public static final List s = Collections.emptyList();
        public final View a;
        public WeakReference b;
        public int j;
        public RecyclerView r;
        public int c = -1;
        public int d = -1;
        public long e = -1;
        public int f = -1;
        public int g = -1;
        public c0 h = null;
        public c0 i = null;
        public List k = null;
        public List l = null;
        public int m = 0;
        public u n = null;
        public boolean o = false;
        public int p = 0;
        public int q = -1;

        public c0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.a = view;
        }

        public void A(int i, boolean z) {
            if (this.d == -1) {
                this.d = this.c;
            }
            if (this.g == -1) {
                this.g = this.c;
            }
            if (z) {
                this.g += i;
            }
            this.c += i;
            if (this.a.getLayoutParams() != null) {
                ((p) this.a.getLayoutParams()).c = true;
            }
        }

        public void B(RecyclerView recyclerView) {
            int i = this.q;
            if (i != -1) {
                this.p = i;
            } else {
                this.p = p51.v(this.a);
            }
            recyclerView.h1(this, 4);
        }

        public void C(RecyclerView recyclerView) {
            recyclerView.h1(this, this.p);
            this.p = 0;
        }

        public void D() {
            this.j = 0;
            this.c = -1;
            this.d = -1;
            this.e = -1L;
            this.g = -1;
            this.m = 0;
            this.h = null;
            this.i = null;
            d();
            this.p = 0;
            this.q = -1;
            RecyclerView.q(this);
        }

        public void E() {
            if (this.d == -1) {
                this.d = this.c;
            }
        }

        public void F(int i, int i2) {
            this.j = (i & i2) | (this.j & (~i2));
        }

        public final void G(boolean z) {
            int i = this.m;
            int i2 = z ? i - 1 : i + 1;
            this.m = i2;
            if (i2 < 0) {
                this.m = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
            } else if (!z && i2 == 1) {
                this.j |= 16;
            } else if (z && i2 == 0) {
                this.j &= -17;
            }
        }

        public void H(u uVar, boolean z) {
            this.n = uVar;
            this.o = z;
        }

        public boolean I() {
            return (this.j & 16) != 0;
        }

        public boolean J() {
            return (this.j & PackageParser.PARSE_IS_PRIVILEGED) != 0;
        }

        public void K() {
            this.n.J(this);
        }

        public boolean L() {
            return (this.j & 32) != 0;
        }

        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.j) == 0) {
                g();
                this.k.add(obj);
            }
        }

        public void b(int i) {
            this.j = i | this.j;
        }

        public void c() {
            this.d = -1;
            this.g = -1;
        }

        public void d() {
            List list = this.k;
            if (list != null) {
                list.clear();
            }
            this.j &= -1025;
        }

        public void e() {
            this.j &= -33;
        }

        public void f() {
            this.j &= -257;
        }

        public final void g() {
            if (this.k == null) {
                ArrayList arrayList = new ArrayList();
                this.k = arrayList;
                this.l = Collections.unmodifiableList(arrayList);
            }
        }

        public boolean h() {
            return (this.j & 16) == 0 && p51.L(this.a);
        }

        public void i(int i, int i2, boolean z) {
            b(8);
            A(i2, z);
            this.c = i;
        }

        public final int j() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.a0(this);
        }

        public final long k() {
            return this.e;
        }

        public final int l() {
            return this.f;
        }

        public final int m() {
            int i = this.g;
            return i == -1 ? this.c : i;
        }

        public final int n() {
            return this.d;
        }

        public List o() {
            if ((this.j & 1024) == 0) {
                List list = this.k;
                return (list == null || list.size() == 0) ? s : this.l;
            }
            return s;
        }

        public boolean p(int i) {
            return (i & this.j) != 0;
        }

        public boolean q() {
            return (this.j & PackageParser.PARSE_TRUSTED_OVERLAY) != 0 || t();
        }

        public boolean r() {
            return (this.a.getParent() == null || this.a.getParent() == this.r) ? false : true;
        }

        public boolean s() {
            return (this.j & 1) != 0;
        }

        public boolean t() {
            return (this.j & 4) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
            if (w()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (t()) {
                sb.append(" invalid");
            }
            if (!s()) {
                sb.append(" unbound");
            }
            if (z()) {
                sb.append(" update");
            }
            if (v()) {
                sb.append(" removed");
            }
            if (J()) {
                sb.append(" ignored");
            }
            if (x()) {
                sb.append(" tmpDetached");
            }
            if (!u()) {
                sb.append(" not recyclable(" + this.m + ")");
            }
            if (q()) {
                sb.append(" undefined adapter position");
            }
            if (this.a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final boolean u() {
            return (this.j & 16) == 0 && !p51.L(this.a);
        }

        public boolean v() {
            return (this.j & 8) != 0;
        }

        public boolean w() {
            return this.n != null;
        }

        public boolean x() {
            return (this.j & PackageParser.PARSE_COLLECT_CERTIFICATES) != 0;
        }

        public boolean y() {
            return (this.j & 2) != 0;
        }

        public boolean z() {
            return (this.j & 2) != 0;
        }
    }

    /* loaded from: classes.dex */
    public class d implements p.b {
        public d() {
        }

        @Override // androidx.recyclerview.widget.p.b
        public void a(c0 c0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.m.s1(c0Var.a, recyclerView.b);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void b(c0 c0Var, l.b bVar, l.b bVar2) {
            RecyclerView.this.k(c0Var, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void c(c0 c0Var, l.b bVar, l.b bVar2) {
            RecyclerView.this.b.J(c0Var);
            RecyclerView.this.m(c0Var, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void d(c0 c0Var, l.b bVar, l.b bVar2) {
            c0Var.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.C) {
                if (recyclerView.L.b(c0Var, c0Var, bVar, bVar2)) {
                    RecyclerView.this.K0();
                }
            } else if (recyclerView.L.d(c0Var, bVar, bVar2)) {
                RecyclerView.this.K0();
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements b.InterfaceC0053b {
        public e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public View a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public void b(View view) {
            c0 e0 = RecyclerView.e0(view);
            if (e0 != null) {
                e0.B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public c0 c(View view) {
            return RecyclerView.e0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public void d(int i) {
            c0 e0;
            View a = a(i);
            if (a != null && (e0 = RecyclerView.e0(a)) != null) {
                if (e0.x() && !e0.J()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + e0 + RecyclerView.this.O());
                }
                e0.b(PackageParser.PARSE_COLLECT_CERTIFICATES);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public void e(View view) {
            c0 e0 = RecyclerView.e0(view);
            if (e0 != null) {
                e0.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public void f(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.x(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public int g() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public void h(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.y(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public void i() {
            int g = g();
            for (int i = 0; i < g; i++) {
                View a = a(i);
                RecyclerView.this.y(a);
                a.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public void j(View view, int i, ViewGroup.LayoutParams layoutParams) {
            c0 e0 = RecyclerView.e0(view);
            if (e0 != null) {
                if (!e0.x() && !e0.J()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + e0 + RecyclerView.this.O());
                }
                e0.f();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0053b
        public int k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* loaded from: classes.dex */
    public class f implements a.InterfaceC0052a {
        public f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0052a
        public void a(int i, int i2) {
            RecyclerView.this.A0(i, i2);
            RecyclerView.this.j0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0052a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0052a
        public c0 c(int i) {
            c0 Y = RecyclerView.this.Y(i, true);
            if (Y == null || RecyclerView.this.e.n(Y.a)) {
                return null;
            }
            return Y;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0052a
        public void d(int i, int i2) {
            RecyclerView.this.B0(i, i2, false);
            RecyclerView.this.j0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0052a
        public void e(int i, int i2) {
            RecyclerView.this.z0(i, i2);
            RecyclerView.this.j0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0052a
        public void f(int i, int i2) {
            RecyclerView.this.B0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.j0 = true;
            recyclerView.g0.d += i2;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0052a
        public void g(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0052a
        public void h(int i, int i2, Object obj) {
            RecyclerView.this.u1(i, i2, obj);
            RecyclerView.this.k0 = true;
        }

        public void i(a.b bVar) {
            int i = bVar.a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.m.X0(recyclerView, bVar.b, bVar.d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.m.a1(recyclerView2, bVar.b, bVar.d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.m.c1(recyclerView3, bVar.b, bVar.d, bVar.c);
            } else if (i != 8) {
            } else {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.m.Z0(recyclerView4, bVar.b, bVar.d, 1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public final h a = new h();
        public boolean b = false;

        public final void a(c0 c0Var, int i) {
            c0Var.c = i;
            if (g()) {
                c0Var.e = d(i);
            }
            c0Var.F(1, 519);
            r11.a("RV OnBindView");
            j(c0Var, i, c0Var.o());
            c0Var.d();
            ViewGroup.LayoutParams layoutParams = c0Var.a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).c = true;
            }
            r11.b();
        }

        public final c0 b(ViewGroup viewGroup, int i) {
            try {
                r11.a("RV CreateView");
                c0 k = k(viewGroup, i);
                if (k.a.getParent() == null) {
                    k.f = i;
                    return k;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                r11.b();
            }
        }

        public abstract int c();

        public long d(int i) {
            return -1L;
        }

        public int e(int i) {
            return 0;
        }

        public final boolean f() {
            return this.a.a();
        }

        public final boolean g() {
            return this.b;
        }

        public void h(RecyclerView recyclerView) {
        }

        public abstract void i(c0 c0Var, int i);

        public void j(c0 c0Var, int i, List list) {
            i(c0Var, i);
        }

        public abstract c0 k(ViewGroup viewGroup, int i);

        public void l(RecyclerView recyclerView) {
        }

        public boolean m(c0 c0Var) {
            return false;
        }

        public void n(c0 c0Var) {
        }

        public void o(c0 c0Var) {
        }

        public void p(c0 c0Var) {
        }

        public void q(i iVar) {
            this.a.registerObserver(iVar);
        }

        public void r(boolean z) {
            if (f()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.b = z;
        }

        public void s(i iVar) {
            this.a.unregisterObserver(iVar);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends Observable {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
    }

    /* loaded from: classes.dex */
    public interface j {
    }

    /* loaded from: classes.dex */
    public static class k {
        public EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        public a a = null;
        public ArrayList b = new ArrayList();
        public long c = 120;
        public long d = 120;
        public long e = 250;
        public long f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a(c0 c0Var);
        }

        /* loaded from: classes.dex */
        public static class b {
            public int a;
            public int b;
            public int c;
            public int d;

            public b a(c0 c0Var) {
                return b(c0Var, 0);
            }

            public b b(c0 c0Var, int i) {
                View view = c0Var.a;
                this.a = view.getLeft();
                this.b = view.getTop();
                this.c = view.getRight();
                this.d = view.getBottom();
                return this;
            }
        }

        public static int e(c0 c0Var) {
            int i = c0Var.j;
            int i2 = i & 14;
            if (c0Var.t()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int n = c0Var.n();
                int j = c0Var.j();
                return (n == -1 || j == -1 || n == j) ? i2 : i2 | 2048;
            }
            return i2;
        }

        public abstract boolean a(c0 c0Var, b bVar, b bVar2);

        public abstract boolean b(c0 c0Var, c0 c0Var2, b bVar, b bVar2);

        public abstract boolean c(c0 c0Var, b bVar, b bVar2);

        public abstract boolean d(c0 c0Var, b bVar, b bVar2);

        public abstract boolean f(c0 c0Var);

        public boolean g(c0 c0Var, List list) {
            return f(c0Var);
        }

        public final void h(c0 c0Var) {
            r(c0Var);
            a aVar = this.a;
            if (aVar != null) {
                aVar.a(c0Var);
            }
        }

        public final void i() {
            if (this.b.size() <= 0) {
                this.b.clear();
            } else {
                my0.a(this.b.get(0));
                throw null;
            }
        }

        public abstract void j(c0 c0Var);

        public abstract void k();

        public long l() {
            return this.c;
        }

        public long m() {
            return this.f;
        }

        public long n() {
            return this.e;
        }

        public long o() {
            return this.d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(c0 c0Var) {
        }

        public b s(z zVar, c0 c0Var) {
            return q().a(c0Var);
        }

        public b t(z zVar, c0 c0Var, int i, List list) {
            return q().a(c0Var);
        }

        public abstract void u();

        public void v(a aVar) {
            this.a = aVar;
        }
    }

    /* loaded from: classes.dex */
    public class m implements l.a {
        public m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.a
        public void a(c0 c0Var) {
            c0Var.G(true);
            if (c0Var.h != null && c0Var.i == null) {
                c0Var.h = null;
            }
            c0Var.i = null;
            if (c0Var.I() || RecyclerView.this.T0(c0Var.a) || !c0Var.x()) {
                return;
            }
            RecyclerView.this.removeDetachedView(c0Var.a, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class n {
        public void d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, z zVar) {
            d(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, z zVar) {
            f(canvas, recyclerView);
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, z zVar) {
            h(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {
        public androidx.recyclerview.widget.b a;
        public RecyclerView b;
        public final o.b c;
        public final o.b d;
        public androidx.recyclerview.widget.o e;
        public androidx.recyclerview.widget.o f;
        public y g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public int m;
        public boolean n;
        public int o;
        public int p;
        public int q;
        public int r;

        /* loaded from: classes.dex */
        public class a implements o.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i) {
                return o.this.N(i);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return o.this.u0() - o.this.k0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c(View view) {
                return o.this.V(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return o.this.j0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return o.this.Y(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements o.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i) {
                return o.this.N(i);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return o.this.b0() - o.this.h0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c(View view) {
                return o.this.Z(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return o.this.m0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return o.this.T(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(int i, int i2);
        }

        /* loaded from: classes.dex */
        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public o() {
            a aVar = new a();
            this.c = aVar;
            b bVar = new b();
            this.d = bVar;
            this.e = new androidx.recyclerview.widget.o(aVar);
            this.f = new androidx.recyclerview.widget.o(bVar);
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = true;
            this.l = true;
        }

        public static boolean C0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 <= 0 || i == i3) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i;
                } else {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
            if (r5 == 1073741824) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int P(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.P(int, int, int, int, boolean):int");
        }

        public static d o0(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nn0.f, i, i2);
            dVar.a = obtainStyledAttributes.getInt(nn0.g, 1);
            dVar.b = obtainStyledAttributes.getInt(nn0.q, 1);
            dVar.c = obtainStyledAttributes.getBoolean(nn0.p, false);
            dVar.d = obtainStyledAttributes.getBoolean(nn0.r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int s(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        public abstract int A(z zVar);

        public final boolean A0() {
            return this.l;
        }

        public void A1() {
            this.h = true;
        }

        public void B(u uVar) {
            for (int O = O() - 1; O >= 0; O--) {
                B1(uVar, O, N(O));
            }
        }

        public boolean B0(u uVar, z zVar) {
            return false;
        }

        public final void B1(u uVar, int i, View view) {
            c0 e0 = RecyclerView.e0(view);
            if (e0.J()) {
                return;
            }
            if (e0.t() && !e0.v() && !this.b.l.g()) {
                w1(i);
                uVar.C(e0);
                return;
            }
            C(i);
            uVar.D(view);
            this.b.f.k(e0);
        }

        public void C(int i) {
            D(i, N(i));
        }

        public abstract int C1(int i, u uVar, z zVar);

        public final void D(int i, View view) {
            this.a.d(i);
        }

        public boolean D0() {
            y yVar = this.g;
            return yVar != null && yVar.h();
        }

        public abstract void D1(int i);

        public void E(RecyclerView recyclerView) {
            this.i = true;
            M0(recyclerView);
        }

        public boolean E0(View view, boolean z, boolean z2) {
            boolean z3 = this.e.b(view, 24579) && this.f.b(view, 24579);
            return z ? z3 : !z3;
        }

        public abstract int E1(int i, u uVar, z zVar);

        public void F(RecyclerView recyclerView, u uVar) {
            this.i = false;
            O0(recyclerView, uVar);
        }

        public void F0(View view, int i, int i2, int i3, int i4) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public void F1(RecyclerView recyclerView) {
            G1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public View G(View view) {
            View Q;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (Q = recyclerView.Q(view)) == null || this.a.n(Q)) {
                return null;
            }
            return Q;
        }

        public void G0(View view, int i, int i2) {
            p pVar = (p) view.getLayoutParams();
            Rect i0 = this.b.i0(view);
            int i3 = i + i0.left + i0.right;
            int i4 = i2 + i0.top + i0.bottom;
            int P = P(u0(), v0(), j0() + k0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) pVar).width, p());
            int P2 = P(b0(), c0(), m0() + h0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) pVar).height, q());
            if (L1(view, P, P2, pVar)) {
                view.measure(P, P2);
            }
        }

        public void G1(int i, int i2) {
            this.q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.o = mode;
            if (mode == 0 && !RecyclerView.y0) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.p = mode2;
            if (mode2 != 0 || RecyclerView.y0) {
                return;
            }
            this.r = 0;
        }

        public View H(int i) {
            int O = O();
            for (int i2 = 0; i2 < O; i2++) {
                View N = N(i2);
                c0 e0 = RecyclerView.e0(N);
                if (e0 != null && e0.m() == i && !e0.J() && (this.b.g0.e() || !e0.v())) {
                    return N;
                }
            }
            return null;
        }

        public void H0(int i, int i2) {
            View N = N(i);
            if (N != null) {
                C(i);
                m(N, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.b.toString());
        }

        public void H1(int i, int i2) {
            this.b.setMeasuredDimension(i, i2);
        }

        public abstract p I();

        public void I0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.x0(i);
            }
        }

        public void I1(Rect rect, int i, int i2) {
            H1(s(i, rect.width() + j0() + k0(), g0()), s(i2, rect.height() + m0() + h0(), f0()));
        }

        public p J(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void J0(int i) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.y0(i);
            }
        }

        public void J1(int i, int i2) {
            int O = O();
            if (O == 0) {
                this.b.v(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < O; i7++) {
                View N = N(i7);
                Rect rect = this.b.i;
                U(N, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.b.i.set(i6, i4, i3, i5);
            I1(this.b.i, i, i2);
        }

        public p K(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public void K0(g gVar, g gVar2) {
        }

        public void K1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.q = 0;
                this.r = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.e;
                this.q = recyclerView.getWidth();
                this.r = recyclerView.getHeight();
            }
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public int L() {
            return -1;
        }

        public boolean L0(RecyclerView recyclerView, ArrayList arrayList, int i, int i2) {
            return false;
        }

        public boolean L1(View view, int i, int i2, p pVar) {
            return (!view.isLayoutRequested() && this.k && C0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) && C0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public int M(View view) {
            return ((p) view.getLayoutParams()).b.bottom;
        }

        public void M0(RecyclerView recyclerView) {
        }

        public boolean M1() {
            return false;
        }

        public View N(int i) {
            androidx.recyclerview.widget.b bVar = this.a;
            if (bVar != null) {
                return bVar.f(i);
            }
            return null;
        }

        public void N0(RecyclerView recyclerView) {
        }

        public boolean N1(View view, int i, int i2, p pVar) {
            return (this.k && C0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) && C0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public int O() {
            androidx.recyclerview.widget.b bVar = this.a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void O0(RecyclerView recyclerView, u uVar) {
            N0(recyclerView);
        }

        public abstract void O1(RecyclerView recyclerView, z zVar, int i);

        public abstract View P0(View view, int i, u uVar, z zVar);

        public void P1(y yVar) {
            y yVar2 = this.g;
            if (yVar2 != null && yVar != yVar2 && yVar2.h()) {
                this.g.r();
            }
            this.g = yVar;
            yVar.q(this.b, this);
        }

        public final int[] Q(View view, Rect rect) {
            int[] iArr = new int[2];
            int j0 = j0();
            int m0 = m0();
            int u0 = u0() - k0();
            int b0 = b0() - h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - j0;
            int min = Math.min(0, i);
            int i2 = top - m0;
            int min2 = Math.min(0, i2);
            int i3 = width - u0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - b0);
            if (d0() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public void Q0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            R0(recyclerView.b, recyclerView.g0, accessibilityEvent);
        }

        public void Q1() {
            y yVar = this.g;
            if (yVar != null) {
                yVar.r();
            }
        }

        public boolean R() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.g;
        }

        public void R0(u uVar, z zVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            g gVar = this.b.l;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.c());
            }
        }

        public boolean R1() {
            return false;
        }

        public int S(u uVar, z zVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.l == null || !p()) {
                return 1;
            }
            return this.b.l.c();
        }

        public void S0(p0 p0Var) {
            RecyclerView recyclerView = this.b;
            T0(recyclerView.b, recyclerView.g0, p0Var);
        }

        public int T(View view) {
            return view.getBottom() + M(view);
        }

        public void T0(u uVar, z zVar, p0 p0Var) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                p0Var.a(8192);
                p0Var.u0(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                p0Var.a(4096);
                p0Var.u0(true);
            }
            p0Var.e0(p0.e.a(q0(uVar, zVar), S(uVar, zVar), B0(uVar, zVar), r0(uVar, zVar)));
        }

        public void U(View view, Rect rect) {
            RecyclerView.f0(view, rect);
        }

        public void U0(View view, p0 p0Var) {
            c0 e0 = RecyclerView.e0(view);
            if (e0 == null || e0.v() || this.a.n(e0.a)) {
                return;
            }
            RecyclerView recyclerView = this.b;
            V0(recyclerView.b, recyclerView.g0, view, p0Var);
        }

        public int V(View view) {
            return view.getLeft() - e0(view);
        }

        public void V0(u uVar, z zVar, View view, p0 p0Var) {
            p0Var.f0(p0.f.a(q() ? n0(view) : 0, 1, p() ? n0(view) : 0, 1, false, false));
        }

        public int W(View view) {
            Rect rect = ((p) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public View W0(View view, int i) {
            return null;
        }

        public int X(View view) {
            Rect rect = ((p) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void X0(RecyclerView recyclerView, int i, int i2) {
        }

        public int Y(View view) {
            return view.getRight() + p0(view);
        }

        public void Y0(RecyclerView recyclerView) {
        }

        public int Z(View view) {
            return view.getTop() - s0(view);
        }

        public void Z0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public View a0() {
            View focusedChild;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void a1(RecyclerView recyclerView, int i, int i2) {
        }

        public int b0() {
            return this.r;
        }

        public void b1(RecyclerView recyclerView, int i, int i2) {
        }

        public int c0() {
            return this.p;
        }

        public void c1(RecyclerView recyclerView, int i, int i2, Object obj) {
            b1(recyclerView, i, i2);
        }

        public int d0() {
            return p51.x(this.b);
        }

        public abstract void d1(u uVar, z zVar);

        public int e() {
            RecyclerView recyclerView = this.b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.c();
            }
            return 0;
        }

        public int e0(View view) {
            return ((p) view.getLayoutParams()).b.left;
        }

        public void e1(z zVar) {
        }

        public int f0() {
            return p51.y(this.b);
        }

        public void f1(u uVar, z zVar, int i, int i2) {
            this.b.v(i, i2);
        }

        public void g(View view) {
            h(view, -1);
        }

        public int g0() {
            return p51.z(this.b);
        }

        public boolean g1(RecyclerView recyclerView, View view, View view2) {
            return D0() || recyclerView.s0();
        }

        public void h(View view, int i) {
            k(view, i, true);
        }

        public int h0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public boolean h1(RecyclerView recyclerView, z zVar, View view, View view2) {
            return g1(recyclerView, view, view2);
        }

        public void i(View view) {
            j(view, -1);
        }

        public int i0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return p51.B(recyclerView);
            }
            return 0;
        }

        public void i1(Parcelable parcelable) {
        }

        public void j(View view, int i) {
            k(view, i, false);
        }

        public int j0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public Parcelable j1() {
            return null;
        }

        public final void k(View view, int i, boolean z) {
            c0 e0 = RecyclerView.e0(view);
            if (z || e0.v()) {
                this.b.f.b(e0);
            } else {
                this.b.f.p(e0);
            }
            p pVar = (p) view.getLayoutParams();
            if (e0.L() || e0.w()) {
                if (e0.w()) {
                    e0.K();
                } else {
                    e0.e();
                }
                this.a.c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.b) {
                int m = this.a.m(view);
                if (i == -1) {
                    i = this.a.g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.O());
                } else if (m != i) {
                    this.b.m.H0(m, i);
                }
            } else {
                this.a.a(view, i, false);
                pVar.c = true;
                y yVar = this.g;
                if (yVar != null && yVar.h()) {
                    this.g.k(view);
                }
            }
            if (pVar.d) {
                e0.a.invalidate();
                pVar.d = false;
            }
        }

        public int k0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void k1(int i) {
        }

        public void l(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.n(str);
            }
        }

        public int l0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return p51.C(recyclerView);
            }
            return 0;
        }

        public void l1(y yVar) {
            if (this.g == yVar) {
                this.g = null;
            }
        }

        public void m(View view, int i) {
            n(view, i, (p) view.getLayoutParams());
        }

        public int m0() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean m1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return n1(recyclerView.b, recyclerView.g0, i, bundle);
        }

        public void n(View view, int i, p pVar) {
            c0 e0 = RecyclerView.e0(view);
            if (e0.v()) {
                this.b.f.b(e0);
            } else {
                this.b.f.p(e0);
            }
            this.a.c(view, i, pVar, e0.v());
        }

        public int n0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public boolean n1(u uVar, z zVar, int i, Bundle bundle) {
            int b0;
            int u0;
            int i2;
            int i3;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                b0 = recyclerView.canScrollVertically(1) ? (b0() - m0()) - h0() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    u0 = (u0() - j0()) - k0();
                    i2 = b0;
                    i3 = u0;
                }
                i2 = b0;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                b0 = recyclerView.canScrollVertically(-1) ? -((b0() - m0()) - h0()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    u0 = -((u0() - j0()) - k0());
                    i2 = b0;
                    i3 = u0;
                }
                i2 = b0;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.b.m1(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void o(View view, Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.i0(view));
            }
        }

        public boolean o1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return p1(recyclerView.b, recyclerView.g0, view, i, bundle);
        }

        public abstract boolean p();

        public int p0(View view) {
            return ((p) view.getLayoutParams()).b.right;
        }

        public boolean p1(u uVar, z zVar, View view, int i, Bundle bundle) {
            return false;
        }

        public abstract boolean q();

        public int q0(u uVar, z zVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.l == null || !q()) {
                return 1;
            }
            return this.b.l.c();
        }

        public void q1(u uVar) {
            for (int O = O() - 1; O >= 0; O--) {
                if (!RecyclerView.e0(N(O)).J()) {
                    t1(O, uVar);
                }
            }
        }

        public boolean r(p pVar) {
            return pVar != null;
        }

        public int r0(u uVar, z zVar) {
            return 0;
        }

        public void r1(u uVar) {
            int j = uVar.j();
            for (int i = j - 1; i >= 0; i--) {
                View n = uVar.n(i);
                c0 e0 = RecyclerView.e0(n);
                if (!e0.J()) {
                    e0.G(false);
                    if (e0.x()) {
                        this.b.removeDetachedView(n, false);
                    }
                    l lVar = this.b.L;
                    if (lVar != null) {
                        lVar.j(e0);
                    }
                    e0.G(true);
                    uVar.y(n);
                }
            }
            uVar.e();
            if (j > 0) {
                this.b.invalidate();
            }
        }

        public int s0(View view) {
            return ((p) view.getLayoutParams()).b.top;
        }

        public void s1(View view, u uVar) {
            v1(view);
            uVar.B(view);
        }

        public void t(int i, int i2, z zVar, c cVar) {
        }

        public void t0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((p) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.b.k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void t1(int i, u uVar) {
            View N = N(i);
            w1(i);
            uVar.B(N);
        }

        public void u(int i, c cVar) {
        }

        public int u0() {
            return this.q;
        }

        public boolean u1(Runnable runnable) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public abstract int v(z zVar);

        public int v0() {
            return this.o;
        }

        public void v1(View view) {
            this.a.p(view);
        }

        public abstract int w(z zVar);

        public boolean w0() {
            int O = O();
            for (int i = 0; i < O; i++) {
                ViewGroup.LayoutParams layoutParams = N(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void w1(int i) {
            if (N(i) != null) {
                this.a.q(i);
            }
        }

        public abstract int x(z zVar);

        public boolean x0() {
            return this.i;
        }

        public boolean x1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return y1(recyclerView, view, rect, z, false);
        }

        public abstract int y(z zVar);

        public boolean y0() {
            return this.j;
        }

        public boolean y1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] Q = Q(view, rect);
            int i = Q[0];
            int i2 = Q[1];
            if ((!z2 || z0(recyclerView, i, i2)) && !(i == 0 && i2 == 0)) {
                if (z) {
                    recyclerView.scrollBy(i, i2);
                } else {
                    recyclerView.j1(i, i2);
                }
                return true;
            }
            return false;
        }

        public abstract int z(z zVar);

        public final boolean z0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int j0 = j0();
            int m0 = m0();
            int u0 = u0() - k0();
            int b0 = b0() - h0();
            Rect rect = this.b.i;
            U(focusedChild, rect);
            return rect.left - i < u0 && rect.right - i > j0 && rect.top - i2 < b0 && rect.bottom - i2 > m0;
        }

        public void z1() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class q {
        public abstract boolean a(int i, int i2);
    }

    /* loaded from: classes.dex */
    public interface r {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z);
    }

    /* loaded from: classes.dex */
    public static abstract class s {
        public void a(RecyclerView recyclerView, int i) {
        }

        public abstract void b(RecyclerView recyclerView, int i, int i2);
    }

    /* loaded from: classes.dex */
    public static class t {
        public SparseArray a = new SparseArray();
        public int b = 0;

        /* loaded from: classes.dex */
        public static class a {
            public final ArrayList a = new ArrayList();
            public int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public void a() {
            this.b++;
        }

        public void b() {
            for (int i = 0; i < this.a.size(); i++) {
                ((a) this.a.valueAt(i)).a.clear();
            }
        }

        public void c() {
            this.b--;
        }

        public void d(int i, long j) {
            a g = g(i);
            g.d = j(g.d, j);
        }

        public void e(int i, long j) {
            a g = g(i);
            g.c = j(g.c, j);
        }

        public c0 f(int i) {
            a aVar = (a) this.a.get(i);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((c0) arrayList.get(size)).r()) {
                    return (c0) arrayList.remove(size);
                }
            }
            return null;
        }

        public final a g(int i) {
            a aVar = (a) this.a.get(i);
            if (aVar == null) {
                a aVar2 = new a();
                this.a.put(i, aVar2);
                return aVar2;
            }
            return aVar;
        }

        public void h(g gVar, g gVar2, boolean z) {
            if (gVar != null) {
                c();
            }
            if (!z && this.b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(c0 c0Var) {
            int l = c0Var.l();
            ArrayList arrayList = g(l).a;
            if (((a) this.a.get(l)).b <= arrayList.size()) {
                return;
            }
            c0Var.D();
            arrayList.add(c0Var);
        }

        public long j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        public boolean k(int i, long j, long j2) {
            long j3 = g(i).d;
            return j3 == 0 || j + j3 < j2;
        }

        public boolean l(int i, long j, long j2) {
            long j3 = g(i).c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* loaded from: classes.dex */
    public final class u {
        public final ArrayList a;
        public ArrayList b;
        public final ArrayList c;
        public final List d;
        public int e;
        public int f;
        public t g;

        public u() {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.b = null;
            this.c = new ArrayList();
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public void A(int i) {
            a((c0) this.c.get(i), true);
            this.c.remove(i);
        }

        public void B(View view) {
            c0 e0 = RecyclerView.e0(view);
            if (e0.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (e0.w()) {
                e0.K();
            } else if (e0.L()) {
                e0.e();
            }
            C(e0);
            if (RecyclerView.this.L == null || e0.u()) {
                return;
            }
            RecyclerView.this.L.j(e0);
        }

        public void C(c0 c0Var) {
            boolean z;
            boolean z2 = true;
            if (c0Var.w() || c0Var.a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(c0Var.w());
                sb.append(" isAttached:");
                sb.append(c0Var.a.getParent() != null);
                sb.append(RecyclerView.this.O());
                throw new IllegalArgumentException(sb.toString());
            } else if (c0Var.x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c0Var + RecyclerView.this.O());
            } else if (c0Var.J()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.O());
            } else {
                boolean h = c0Var.h();
                g gVar = RecyclerView.this.l;
                if ((gVar != null && h && gVar.m(c0Var)) || c0Var.u()) {
                    if (this.f <= 0 || c0Var.p(526)) {
                        z = false;
                    } else {
                        int size = this.c.size();
                        if (size >= this.f && size > 0) {
                            A(0);
                            size--;
                        }
                        if (RecyclerView.A0 && size > 0 && !RecyclerView.this.f0.d(c0Var.c)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f0.d(((c0) this.c.get(i)).c)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.c.add(size, c0Var);
                        z = true;
                    }
                    if (z) {
                        z2 = false;
                    } else {
                        a(c0Var, true);
                    }
                    r1 = z;
                } else {
                    z2 = false;
                }
                RecyclerView.this.f.q(c0Var);
                if (r1 || z2 || !h) {
                    return;
                }
                c0Var.r = null;
            }
        }

        public void D(View view) {
            c0 e0 = RecyclerView.e0(view);
            if (!e0.p(12) && e0.y() && !RecyclerView.this.o(e0)) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                e0.H(this, true);
                this.b.add(e0);
            } else if (!e0.t() || e0.v() || RecyclerView.this.l.g()) {
                e0.H(this, false);
                this.a.add(e0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.O());
            }
        }

        public void E(t tVar) {
            t tVar2 = this.g;
            if (tVar2 != null) {
                tVar2.c();
            }
            this.g = tVar;
            if (tVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.g.a();
        }

        public void F(a0 a0Var) {
        }

        public void G(int i) {
            this.e = i;
            K();
        }

        public final boolean H(c0 c0Var, int i, int i2, long j) {
            c0Var.r = RecyclerView.this;
            int l = c0Var.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j == Long.MAX_VALUE || this.g.k(l, nanoTime, j)) {
                RecyclerView.this.l.a(c0Var, i);
                this.g.d(c0Var.l(), RecyclerView.this.getNanoTime() - nanoTime);
                b(c0Var);
                if (RecyclerView.this.g0.e()) {
                    c0Var.g = i2;
                    return true;
                }
                return true;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01b8  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01d4 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.c0 I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 531
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$c0");
        }

        public void J(c0 c0Var) {
            if (c0Var.o) {
                this.b.remove(c0Var);
            } else {
                this.a.remove(c0Var);
            }
            c0Var.n = null;
            c0Var.o = false;
            c0Var.e();
        }

        public void K() {
            o oVar = RecyclerView.this.m;
            this.f = this.e + (oVar != null ? oVar.m : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
                A(size);
            }
        }

        public boolean L(c0 c0Var) {
            if (c0Var.v()) {
                return RecyclerView.this.g0.e();
            }
            int i = c0Var.c;
            if (i >= 0 && i < RecyclerView.this.l.c()) {
                if (RecyclerView.this.g0.e() || RecyclerView.this.l.e(c0Var.c) == c0Var.l()) {
                    return !RecyclerView.this.l.g() || c0Var.k() == RecyclerView.this.l.d(c0Var.c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c0Var + RecyclerView.this.O());
        }

        public void M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                c0 c0Var = (c0) this.c.get(size);
                if (c0Var != null && (i3 = c0Var.c) >= i && i3 < i4) {
                    c0Var.b(2);
                    A(size);
                }
            }
        }

        public void a(c0 c0Var, boolean z) {
            RecyclerView.q(c0Var);
            View view = c0Var.a;
            androidx.recyclerview.widget.k kVar = RecyclerView.this.n0;
            if (kVar != null) {
                androidx.appcompat.view.menu.b0 n = kVar.n();
                p51.k0(view, n instanceof k.a ? ((k.a) n).n(view) : null);
            }
            if (z) {
                g(c0Var);
            }
            c0Var.r = null;
            i().i(c0Var);
        }

        public final void b(c0 c0Var) {
            if (RecyclerView.this.r0()) {
                View view = c0Var.a;
                if (p51.v(view) == 0) {
                    p51.u0(view, 1);
                }
                androidx.recyclerview.widget.k kVar = RecyclerView.this.n0;
                if (kVar == null) {
                    return;
                }
                androidx.appcompat.view.menu.b0 n = kVar.n();
                if (n instanceof k.a) {
                    ((k.a) n).o(view);
                }
                p51.k0(view, n);
            }
        }

        public void c() {
            this.a.clear();
            z();
        }

        public void d() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                ((c0) this.c.get(i)).c();
            }
            int size2 = this.a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((c0) this.a.get(i2)).c();
            }
            ArrayList arrayList = this.b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((c0) this.b.get(i3)).c();
                }
            }
        }

        public void e() {
            this.a.clear();
            ArrayList arrayList = this.b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i) {
            if (i >= 0 && i < RecyclerView.this.g0.b()) {
                return !RecyclerView.this.g0.e() ? i : RecyclerView.this.d.m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.g0.b() + RecyclerView.this.O());
        }

        public void g(c0 c0Var) {
            RecyclerView.this.getClass();
            g gVar = RecyclerView.this.l;
            if (gVar != null) {
                gVar.p(c0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.g0 != null) {
                recyclerView.f.q(c0Var);
            }
        }

        public c0 h(int i) {
            int size;
            int m;
            ArrayList arrayList = this.b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    c0 c0Var = (c0) this.b.get(i2);
                    if (!c0Var.L() && c0Var.m() == i) {
                        c0Var.b(32);
                        return c0Var;
                    }
                }
                if (RecyclerView.this.l.g() && (m = RecyclerView.this.d.m(i)) > 0 && m < RecyclerView.this.l.c()) {
                    long d = RecyclerView.this.l.d(m);
                    for (int i3 = 0; i3 < size; i3++) {
                        c0 c0Var2 = (c0) this.b.get(i3);
                        if (!c0Var2.L() && c0Var2.k() == d) {
                            c0Var2.b(32);
                            return c0Var2;
                        }
                    }
                }
            }
            return null;
        }

        public t i() {
            if (this.g == null) {
                this.g = new t();
            }
            return this.g;
        }

        public int j() {
            return this.a.size();
        }

        public List k() {
            return this.d;
        }

        public c0 l(long j, int i, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                c0 c0Var = (c0) this.a.get(size);
                if (c0Var.k() == j && !c0Var.L()) {
                    if (i == c0Var.l()) {
                        c0Var.b(32);
                        if (c0Var.v() && !RecyclerView.this.g0.e()) {
                            c0Var.F(2, 14);
                        }
                        return c0Var;
                    } else if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(c0Var.a, false);
                        y(c0Var.a);
                    }
                }
            }
            int size2 = this.c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                c0 c0Var2 = (c0) this.c.get(size2);
                if (c0Var2.k() == j && !c0Var2.r()) {
                    if (i == c0Var2.l()) {
                        if (!z) {
                            this.c.remove(size2);
                        }
                        return c0Var2;
                    } else if (!z) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        public c0 m(int i, boolean z) {
            View e;
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                c0 c0Var = (c0) this.a.get(i2);
                if (!c0Var.L() && c0Var.m() == i && !c0Var.t() && (RecyclerView.this.g0.h || !c0Var.v())) {
                    c0Var.b(32);
                    return c0Var;
                }
            }
            if (z || (e = RecyclerView.this.e.e(i)) == null) {
                int size2 = this.c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    c0 c0Var2 = (c0) this.c.get(i3);
                    if (!c0Var2.t() && c0Var2.m() == i && !c0Var2.r()) {
                        if (!z) {
                            this.c.remove(i3);
                        }
                        return c0Var2;
                    }
                }
                return null;
            }
            c0 e0 = RecyclerView.e0(e);
            RecyclerView.this.e.s(e);
            int m = RecyclerView.this.e.m(e);
            if (m != -1) {
                RecyclerView.this.e.d(m);
                D(e);
                e0.b(8224);
                return e0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + e0 + RecyclerView.this.O());
        }

        public View n(int i) {
            return ((c0) this.a.get(i)).a;
        }

        public View o(int i) {
            return p(i, false);
        }

        public View p(int i, boolean z) {
            return I(i, z, Long.MAX_VALUE).a;
        }

        public final void q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public final void r(c0 c0Var) {
            View view = c0Var.a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                p pVar = (p) ((c0) this.c.get(i)).a.getLayoutParams();
                if (pVar != null) {
                    pVar.c = true;
                }
            }
        }

        public void t() {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                c0 c0Var = (c0) this.c.get(i);
                if (c0Var != null) {
                    c0Var.b(6);
                    c0Var.a(null);
                }
            }
            g gVar = RecyclerView.this.l;
            if (gVar == null || !gVar.g()) {
                z();
            }
        }

        public void u(int i, int i2) {
            int size = this.c.size();
            for (int i3 = 0; i3 < size; i3++) {
                c0 c0Var = (c0) this.c.get(i3);
                if (c0Var != null && c0Var.c >= i) {
                    c0Var.A(i2, true);
                }
            }
        }

        public void v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.c.size();
            for (int i7 = 0; i7 < size; i7++) {
                c0 c0Var = (c0) this.c.get(i7);
                if (c0Var != null && (i6 = c0Var.c) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        c0Var.A(i2 - i, false);
                    } else {
                        c0Var.A(i3, false);
                    }
                }
            }
        }

        public void w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                c0 c0Var = (c0) this.c.get(size);
                if (c0Var != null) {
                    int i4 = c0Var.c;
                    if (i4 >= i3) {
                        c0Var.A(-i2, z);
                    } else if (i4 >= i) {
                        c0Var.b(8);
                        A(size);
                    }
                }
            }
        }

        public void x(g gVar, g gVar2, boolean z) {
            c();
            i().h(gVar, gVar2, z);
        }

        public void y(View view) {
            c0 e0 = RecyclerView.e0(view);
            e0.n = null;
            e0.o = false;
            e0.e();
            C(e0);
        }

        public void z() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.c.clear();
            if (RecyclerView.A0) {
                RecyclerView.this.f0.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface v {
    }

    /* loaded from: classes.dex */
    public class w extends i {
        public w() {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class y {
        public RecyclerView b;
        public o c;
        public boolean d;
        public boolean e;
        public View f;
        public boolean h;
        public int a = -1;
        public final a g = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {
            public int a;
            public int b;
            public int c;
            public int d;
            public Interpolator e;
            public boolean f;
            public int g;

            public a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public boolean a() {
                return this.d >= 0;
            }

            public void b(int i) {
                this.d = i;
            }

            public void c(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.u0(i);
                    this.f = false;
                } else if (!this.f) {
                    this.g = 0;
                } else {
                    e();
                    recyclerView.d0.f(this.a, this.b, this.c, this.e);
                    this.g++;
                    this.f = false;
                }
            }

            public void d(int i, int i2, int i3, Interpolator interpolator) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
                this.f = true;
            }

            public final void e() {
                if (this.e != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF d(int i);
        }

        public PointF a(int i) {
            o e = e();
            if (e instanceof b) {
                return ((b) e).d(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(b.class.getCanonicalName());
            return null;
        }

        public View b(int i) {
            return this.b.m.H(i);
        }

        public int c() {
            return this.b.m.O();
        }

        public int d(View view) {
            return this.b.c0(view);
        }

        public o e() {
            return this.c;
        }

        public int f() {
            return this.a;
        }

        public boolean g() {
            return this.d;
        }

        public boolean h() {
            return this.e;
        }

        public void i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void j(int i, int i2) {
            PointF a2;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                r();
            }
            if (this.d && this.f == null && this.c != null && (a2 = a(this.a)) != null) {
                float f = a2.x;
                if (f != 0.0f || a2.y != 0.0f) {
                    recyclerView.e1((int) Math.signum(f), (int) Math.signum(a2.y), null);
                }
            }
            this.d = false;
            View view = this.f;
            if (view != null) {
                if (d(view) == this.a) {
                    o(this.f, recyclerView.g0, this.g);
                    this.g.c(recyclerView);
                    r();
                } else {
                    this.f = null;
                }
            }
            if (this.e) {
                l(i, i2, recyclerView.g0, this.g);
                boolean a3 = this.g.a();
                this.g.c(recyclerView);
                if (a3 && this.e) {
                    this.d = true;
                    recyclerView.d0.e();
                }
            }
        }

        public void k(View view) {
            if (d(view) == f()) {
                this.f = view;
            }
        }

        public abstract void l(int i, int i2, z zVar, a aVar);

        public abstract void m();

        public abstract void n();

        public abstract void o(View view, z zVar, a aVar);

        public void p(int i) {
            this.a = i;
        }

        public void q(RecyclerView recyclerView, o oVar) {
            recyclerView.d0.g();
            if (this.h) {
                StringBuilder sb = new StringBuilder();
                sb.append("An instance of ");
                sb.append(getClass().getSimpleName());
                sb.append(" was started more than once. Each instance of");
                sb.append(getClass().getSimpleName());
                sb.append(" is intended to only be used once. You should create a new instance for each use.");
            }
            this.b = recyclerView;
            this.c = oVar;
            int i = this.a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.g0.a = i;
            this.e = true;
            this.d = true;
            this.f = b(f());
            m();
            this.b.d0.e();
            this.h = true;
        }

        public final void r() {
            if (this.e) {
                this.e = false;
                n();
                this.b.g0.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                this.c.l1(this);
                this.c = null;
                this.b = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class z {
        public SparseArray b;
        public int m;
        public long n;
        public int o;
        public int p;
        public int q;
        public int a = -1;
        public int c = 0;
        public int d = 0;
        public int e = 1;
        public int f = 0;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public boolean l = false;

        public void a(int i) {
            if ((this.e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.e));
        }

        public int b() {
            return this.h ? this.c - this.d : this.f;
        }

        public int c() {
            return this.a;
        }

        public boolean d() {
            return this.a != -1;
        }

        public boolean e() {
            return this.h;
        }

        public void f(g gVar) {
            this.e = 1;
            this.f = gVar.c();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public boolean g() {
            return this.l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.a + ", mData=" + this.b + ", mItemCount=" + this.f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.d + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    static {
        Class cls = Integer.TYPE;
        D0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        E0 = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, bm0.a);
    }

    public static RecyclerView U(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                RecyclerView U = U(viewGroup.getChildAt(i2));
                if (U != null) {
                    return U;
                }
            }
            return null;
        }
        return null;
    }

    public static c0 e0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).a;
    }

    public static void f0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private ue0 getScrollingChildHelper() {
        if (this.p0 == null) {
            this.p0 = new ue0(this);
        }
        return this.p0;
    }

    public static void q(c0 c0Var) {
        WeakReference weakReference = c0Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == c0Var.a) {
                    return;
                }
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            c0Var.b = null;
        }
    }

    public void A() {
        if (this.l == null || this.m == null) {
            return;
        }
        z zVar = this.g0;
        zVar.j = false;
        if (zVar.e == 1) {
            B();
            this.m.F1(this);
            C();
        } else if (!this.d.q() && this.m.u0() == getWidth() && this.m.b0() == getHeight()) {
            this.m.F1(this);
        } else {
            this.m.F1(this);
            C();
        }
        D();
    }

    public void A0(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int j2 = this.e.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < j2; i8++) {
            c0 e0 = e0(this.e.i(i8));
            if (e0 != null && (i7 = e0.c) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    e0.A(i3 - i2, false);
                } else {
                    e0.A(i6, false);
                }
                this.g0.g = true;
            }
        }
        this.b.v(i2, i3);
        requestLayout();
    }

    public final void B() {
        boolean z2 = true;
        this.g0.a(1);
        P(this.g0);
        this.g0.j = false;
        o1();
        this.f.f();
        E0();
        M0();
        b1();
        z zVar = this.g0;
        zVar.i = (zVar.k && this.k0) ? false : false;
        this.k0 = false;
        this.j0 = false;
        zVar.h = zVar.l;
        zVar.f = this.l.c();
        T(this.o0);
        if (this.g0.k) {
            int g2 = this.e.g();
            for (int i2 = 0; i2 < g2; i2++) {
                c0 e0 = e0(this.e.f(i2));
                if (!e0.J() && (!e0.t() || this.l.g())) {
                    this.f.e(e0, this.L.t(this.g0, e0, l.e(e0), e0.o()));
                    if (this.g0.i && e0.y() && !e0.v() && !e0.J() && !e0.t()) {
                        this.f.c(b0(e0), e0);
                    }
                }
            }
        }
        if (this.g0.l) {
            c1();
            z zVar2 = this.g0;
            boolean z3 = zVar2.g;
            zVar2.g = false;
            this.m.d1(this.b, zVar2);
            this.g0.g = z3;
            for (int i3 = 0; i3 < this.e.g(); i3++) {
                c0 e02 = e0(this.e.f(i3));
                if (!e02.J() && !this.f.i(e02)) {
                    int e2 = l.e(e02);
                    boolean p2 = e02.p(8192);
                    if (!p2) {
                        e2 |= 4096;
                    }
                    l.b t2 = this.L.t(this.g0, e02, e2, e02.o());
                    if (p2) {
                        P0(e02, t2);
                    } else {
                        this.f.a(e02, t2);
                    }
                }
            }
            r();
        } else {
            r();
        }
        F0();
        q1(false);
        this.g0.e = 2;
    }

    public void B0(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int j2 = this.e.j();
        for (int i5 = 0; i5 < j2; i5++) {
            c0 e0 = e0(this.e.i(i5));
            if (e0 != null && !e0.J()) {
                int i6 = e0.c;
                if (i6 >= i4) {
                    e0.A(-i3, z2);
                    this.g0.g = true;
                } else if (i6 >= i2) {
                    e0.i(i2 - 1, -i3, z2);
                    this.g0.g = true;
                }
            }
        }
        this.b.w(i2, i3, z2);
        requestLayout();
    }

    public final void C() {
        o1();
        E0();
        this.g0.a(6);
        this.d.j();
        this.g0.f = this.l.c();
        z zVar = this.g0;
        zVar.d = 0;
        zVar.h = false;
        this.m.d1(this.b, zVar);
        z zVar2 = this.g0;
        zVar2.g = false;
        this.c = null;
        zVar2.k = zVar2.k && this.L != null;
        zVar2.e = 4;
        F0();
        q1(false);
    }

    public void C0(View view) {
    }

    public final void D() {
        this.g0.a(4);
        o1();
        E0();
        z zVar = this.g0;
        zVar.e = 1;
        if (zVar.k) {
            for (int g2 = this.e.g() - 1; g2 >= 0; g2--) {
                c0 e0 = e0(this.e.f(g2));
                if (!e0.J()) {
                    long b02 = b0(e0);
                    l.b s2 = this.L.s(this.g0, e0);
                    c0 g3 = this.f.g(b02);
                    if (g3 == null || g3.J()) {
                        this.f.d(e0, s2);
                    } else {
                        boolean h2 = this.f.h(g3);
                        boolean h3 = this.f.h(e0);
                        if (h2 && g3 == e0) {
                            this.f.d(e0, s2);
                        } else {
                            l.b n2 = this.f.n(g3);
                            this.f.d(e0, s2);
                            l.b m2 = this.f.m(e0);
                            if (n2 == null) {
                                j0(b02, e0, g3);
                            } else {
                                l(g3, e0, n2, m2, h2, h3);
                            }
                        }
                    }
                }
            }
            this.f.o(this.v0);
        }
        this.m.r1(this.b);
        z zVar2 = this.g0;
        zVar2.c = zVar2.f;
        this.C = false;
        this.D = false;
        zVar2.k = false;
        zVar2.l = false;
        this.m.h = false;
        ArrayList arrayList = this.b.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.m;
        if (oVar.n) {
            oVar.m = 0;
            oVar.n = false;
            this.b.K();
        }
        this.m.e1(this.g0);
        F0();
        q1(false);
        this.f.f();
        int[] iArr = this.o0;
        if (w(iArr[0], iArr[1])) {
            H(0, 0);
        }
        Q0();
        Z0();
    }

    public void D0(View view) {
    }

    public boolean E(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    public void E0() {
        this.E++;
    }

    public final void F(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void F0() {
        G0(true);
    }

    public void G(int i2) {
        o oVar = this.m;
        if (oVar != null) {
            oVar.k1(i2);
        }
        I0(i2);
        s sVar = this.h0;
        if (sVar != null) {
            sVar.a(this, i2);
        }
        List list = this.i0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.i0.get(size)).a(this, i2);
            }
        }
    }

    public void G0(boolean z2) {
        int i2 = this.E - 1;
        this.E = i2;
        if (i2 < 1) {
            this.E = 0;
            if (z2) {
                z();
                I();
            }
        }
    }

    public void H(int i2, int i3) {
        this.F++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        J0(i2, i3);
        s sVar = this.h0;
        if (sVar != null) {
            sVar.b(this, i2, i3);
        }
        List list = this.i0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.i0.get(size)).b(this, i2, i3);
            }
        }
        this.F--;
    }

    public final void H0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.N) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.N = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.R = x2;
            this.P = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.S = y2;
            this.Q = y2;
        }
    }

    public void I() {
        int i2;
        for (int size = this.t0.size() - 1; size >= 0; size--) {
            c0 c0Var = (c0) this.t0.get(size);
            if (c0Var.a.getParent() == this && !c0Var.J() && (i2 = c0Var.q) != -1) {
                p51.u0(c0Var.a, i2);
                c0Var.q = -1;
            }
        }
        this.t0.clear();
    }

    public void I0(int i2) {
    }

    public final boolean J(MotionEvent motionEvent) {
        r rVar = this.p;
        if (rVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return S(motionEvent);
        }
        rVar.b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.p = null;
        }
        return true;
    }

    public void J0(int i2, int i3) {
    }

    public void K() {
        if (this.K != null) {
            return;
        }
        EdgeEffect a2 = this.G.a(this, 3);
        this.K = a2;
        if (this.g) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void K0() {
        if (this.m0 || !this.q) {
            return;
        }
        p51.c0(this, this.u0);
        this.m0 = true;
    }

    public void L() {
        if (this.H != null) {
            return;
        }
        EdgeEffect a2 = this.G.a(this, 0);
        this.H = a2;
        if (this.g) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final boolean L0() {
        return this.L != null && this.m.R1();
    }

    public void M() {
        if (this.J != null) {
            return;
        }
        EdgeEffect a2 = this.G.a(this, 2);
        this.J = a2;
        if (this.g) {
            a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a2.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void M0() {
        boolean z2;
        if (this.C) {
            this.d.u();
            if (this.D) {
                this.m.Y0(this);
            }
        }
        if (L0()) {
            this.d.s();
        } else {
            this.d.j();
        }
        boolean z3 = true;
        boolean z4 = this.j0 || this.k0;
        this.g0.k = this.t && this.L != null && ((z2 = this.C) || z4 || this.m.h) && (!z2 || this.l.g());
        z zVar = this.g0;
        if (!zVar.k || !z4 || this.C || !L0()) {
            z3 = false;
        }
        zVar.l = z3;
    }

    public void N() {
        if (this.I != null) {
            return;
        }
        EdgeEffect a2 = this.G.a(this, 1);
        this.I = a2;
        if (this.g) {
            a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a2.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void N0(boolean z2) {
        this.D = z2 | this.D;
        this.C = true;
        w0();
    }

    public String O() {
        return " " + super.toString() + ", adapter:" + this.l + ", layout:" + this.m + ", context:" + getContext();
    }

    public final void O0(float f2, float f3, float f4, float f5) {
        boolean z2 = true;
        if (f3 < 0.0f) {
            L();
            in.c(this.H, (-f3) / getWidth(), 1.0f - (f4 / getHeight()));
        } else if (f3 > 0.0f) {
            M();
            in.c(this.J, f3 / getWidth(), f4 / getHeight());
        } else {
            z2 = false;
        }
        if (f5 < 0.0f) {
            N();
            in.c(this.I, (-f5) / getHeight(), f2 / getWidth());
        } else if (f5 > 0.0f) {
            K();
            in.c(this.K, f5 / getHeight(), 1.0f - (f2 / getWidth()));
        } else if (!z2 && f3 == 0.0f && f5 == 0.0f) {
            return;
        }
        p51.b0(this);
    }

    public final void P(z zVar) {
        if (getScrollState() != 2) {
            zVar.p = 0;
            zVar.q = 0;
            return;
        }
        OverScroller overScroller = this.d0.o;
        zVar.p = overScroller.getFinalX() - overScroller.getCurrX();
        zVar.q = overScroller.getFinalY() - overScroller.getCurrY();
    }

    public void P0(c0 c0Var, l.b bVar) {
        c0Var.F(0, 8192);
        if (this.g0.i && c0Var.y() && !c0Var.v() && !c0Var.J()) {
            this.f.c(b0(c0Var), c0Var);
        }
        this.f.e(c0Var, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View Q(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Q(android.view.View):android.view.View");
    }

    public final void Q0() {
        View findViewById;
        if (!this.c0 || this.l == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!C0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.e.n(focusedChild)) {
                    return;
                }
            } else if (this.e.g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        c0 X = (this.g0.n == -1 || !this.l.g()) ? null : X(this.g0.n);
        if (X != null && !this.e.n(X.a) && X.a.hasFocusable()) {
            view = X.a;
        } else if (this.e.g() > 0) {
            view = V();
        }
        if (view != null) {
            int i2 = this.g0.o;
            if (i2 != -1 && (findViewById = view.findViewById(i2)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    public c0 R(View view) {
        View Q = Q(view);
        if (Q == null) {
            return null;
        }
        return d0(Q);
    }

    public final void R0() {
        boolean z2;
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.H.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.I;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.K;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.K.isFinished();
        }
        if (z2) {
            p51.b0(this);
        }
    }

    public final boolean S(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            r rVar = (r) this.o.get(i2);
            if (rVar.a(this, motionEvent) && action != 3) {
                this.p = rVar;
                return true;
            }
        }
        return false;
    }

    public void S0() {
        l lVar = this.L;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.m;
        if (oVar != null) {
            oVar.q1(this.b);
            this.m.r1(this.b);
        }
        this.b.c();
    }

    public final void T(int[] iArr) {
        int g2 = this.e.g();
        if (g2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < g2; i4++) {
            c0 e0 = e0(this.e.f(i4));
            if (!e0.J()) {
                int m2 = e0.m();
                if (m2 < i2) {
                    i2 = m2;
                }
                if (m2 > i3) {
                    i3 = m2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public boolean T0(View view) {
        o1();
        boolean r2 = this.e.r(view);
        if (r2) {
            c0 e0 = e0(view);
            this.b.J(e0);
            this.b.C(e0);
        }
        q1(!r2);
        return r2;
    }

    public void U0(n nVar) {
        o oVar = this.m;
        if (oVar != null) {
            oVar.l("Cannot remove item decoration during a scroll  or layout");
        }
        this.n.remove(nVar);
        if (this.n.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        v0();
        requestLayout();
    }

    public final View V() {
        c0 W;
        z zVar = this.g0;
        int i2 = zVar.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int b2 = zVar.b();
        for (int i3 = i2; i3 < b2; i3++) {
            c0 W2 = W(i3);
            if (W2 == null) {
                break;
            } else if (W2.a.hasFocusable()) {
                return W2.a;
            }
        }
        int min = Math.min(b2, i2);
        while (true) {
            min--;
            if (min < 0 || (W = W(min)) == null) {
                return null;
            }
            if (W.a.hasFocusable()) {
                return W.a;
            }
        }
    }

    public void V0(r rVar) {
        this.o.remove(rVar);
        if (this.p == rVar) {
            this.p = null;
        }
    }

    public c0 W(int i2) {
        c0 c0Var = null;
        if (this.C) {
            return null;
        }
        int j2 = this.e.j();
        for (int i3 = 0; i3 < j2; i3++) {
            c0 e0 = e0(this.e.i(i3));
            if (e0 != null && !e0.v() && a0(e0) == i2) {
                if (!this.e.n(e0.a)) {
                    return e0;
                }
                c0Var = e0;
            }
        }
        return c0Var;
    }

    public void W0(s sVar) {
        List list = this.i0;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public c0 X(long j2) {
        g gVar = this.l;
        c0 c0Var = null;
        if (gVar != null && gVar.g()) {
            int j3 = this.e.j();
            for (int i2 = 0; i2 < j3; i2++) {
                c0 e0 = e0(this.e.i(i2));
                if (e0 != null && !e0.v() && e0.k() == j2) {
                    if (!this.e.n(e0.a)) {
                        return e0;
                    }
                    c0Var = e0;
                }
            }
        }
        return c0Var;
    }

    public void X0() {
        c0 c0Var;
        int g2 = this.e.g();
        for (int i2 = 0; i2 < g2; i2++) {
            View f2 = this.e.f(i2);
            c0 d0 = d0(f2);
            if (d0 != null && (c0Var = d0.i) != null) {
                View view = c0Var.a;
                int left = f2.getLeft();
                int top = f2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.RecyclerView.c0 Y(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.e
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.e
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$c0 r3 = e0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.v()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.m()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.e
            android.view.View r4 = r3.a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, boolean):androidx.recyclerview.widget.RecyclerView$c0");
    }

    public final void Y0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.c) {
                Rect rect = pVar.b;
                Rect rect2 = this.i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.i);
            offsetRectIntoDescendantCoords(view, this.i);
        }
        this.m.y1(this, view, this.i, !this.t, view2 == null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean Z(int i2, int i3) {
        o oVar = this.m;
        if (oVar == null || this.w) {
            return false;
        }
        int p2 = oVar.p();
        boolean q2 = this.m.q();
        if (p2 == 0 || Math.abs(i2) < this.V) {
            i2 = 0;
        }
        if (!q2 || Math.abs(i3) < this.V) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        float f2 = i2;
        float f3 = i3;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z2 = p2 != 0 || q2;
            dispatchNestedFling(f2, f3, z2);
            q qVar = this.U;
            if (qVar != null && qVar.a(i2, i3)) {
                return true;
            }
            if (z2) {
                if (q2) {
                    p2 = (p2 == true ? 1 : 0) | 2;
                }
                p1(p2, 1);
                int i4 = this.W;
                int max = Math.max(-i4, Math.min(i2, i4));
                int i5 = this.W;
                this.d0.c(max, Math.max(-i5, Math.min(i3, i5)));
                return true;
            }
        }
        return false;
    }

    public final void Z0() {
        z zVar = this.g0;
        zVar.n = -1L;
        zVar.m = -1;
        zVar.o = -1;
    }

    public void a(int i2, int i3) {
        if (i2 < 0) {
            L();
            if (this.H.isFinished()) {
                this.H.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            M();
            if (this.J.isFinished()) {
                this.J.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            N();
            if (this.I.isFinished()) {
                this.I.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            K();
            if (this.K.isFinished()) {
                this.K.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        p51.b0(this);
    }

    public int a0(c0 c0Var) {
        if (c0Var.p(524) || !c0Var.s()) {
            return -1;
        }
        return this.d.e(c0Var.c);
    }

    public final void a1() {
        VelocityTracker velocityTracker = this.O;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        r1(0);
        R0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i2, int i3) {
        o oVar = this.m;
        if (oVar == null || !oVar.L0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public long b0(c0 c0Var) {
        return this.l.g() ? c0Var.k() : c0Var.c;
    }

    public final void b1() {
        View focusedChild = (this.c0 && hasFocus() && this.l != null) ? getFocusedChild() : null;
        c0 R = focusedChild != null ? R(focusedChild) : null;
        if (R == null) {
            Z0();
            return;
        }
        this.g0.n = this.l.g() ? R.k() : -1L;
        this.g0.m = this.C ? -1 : R.v() ? R.d : R.j();
        this.g0.o = g0(R.a);
    }

    public int c0(View view) {
        c0 e0 = e0(view);
        if (e0 != null) {
            return e0.m();
        }
        return -1;
    }

    public void c1() {
        int j2 = this.e.j();
        for (int i2 = 0; i2 < j2; i2++) {
            c0 e0 = e0(this.e.i(i2));
            if (!e0.J()) {
                e0.E();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.m.r((p) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.m;
        if (oVar != null && oVar.p()) {
            return this.m.v(this.g0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.m;
        if (oVar != null && oVar.p()) {
            return this.m.w(this.g0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.m;
        if (oVar != null && oVar.p()) {
            return this.m.x(this.g0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.m;
        if (oVar != null && oVar.q()) {
            return this.m.y(this.g0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.m;
        if (oVar != null && oVar.q()) {
            return this.m.z(this.g0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.m;
        if (oVar != null && oVar.q()) {
            return this.m.A(this.g0);
        }
        return 0;
    }

    public c0 d0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return e0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean d1(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        t();
        if (this.l != null) {
            int[] iArr = this.s0;
            iArr[0] = 0;
            iArr[1] = 0;
            e1(i2, i3, iArr);
            int[] iArr2 = this.s0;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i4 = i9;
            i5 = i8;
            i6 = i2 - i8;
            i7 = i3 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.n.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.s0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        F(i5, i4, i6, i7, this.q0, 0, iArr3);
        int[] iArr4 = this.s0;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z2 = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.R;
        int[] iArr5 = this.q0;
        int i15 = iArr5[0];
        this.R = i14 - i15;
        int i16 = this.S;
        int i17 = iArr5[1];
        this.S = i16 - i17;
        int[] iArr6 = this.r0;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !yd0.a(motionEvent, 8194)) {
                O0(motionEvent.getX(), i11, motionEvent.getY(), i13);
            }
            s(i2, i3);
        }
        if (i5 != 0 || i4 != 0) {
            H(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i4 == 0) ? false : true;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.n.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((n) this.n.get(i2)).i(canvas, this, this.g0);
        }
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.H;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.I;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.J;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.J;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.K;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.g) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.K;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if ((z2 || this.L == null || this.n.size() <= 0 || !this.L.p()) && !z2) {
            return;
        }
        p51.b0(this);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public void e1(int i2, int i3, int[] iArr) {
        o1();
        E0();
        r11.a("RV Scroll");
        P(this.g0);
        int C1 = i2 != 0 ? this.m.C1(i2, this.b, this.g0) : 0;
        int E1 = i3 != 0 ? this.m.E1(i3, this.b, this.g0) : 0;
        r11.b();
        X0();
        F0();
        q1(false);
        if (iArr != null) {
            iArr[0] = C1;
            iArr[1] = E1;
        }
    }

    public final void f(c0 c0Var) {
        View view = c0Var.a;
        boolean z2 = view.getParent() == this;
        this.b.J(d0(view));
        if (c0Var.x()) {
            this.e.c(view, -1, view.getLayoutParams(), true);
        } else if (z2) {
            this.e.k(view);
        } else {
            this.e.b(view, true);
        }
    }

    public void f1(int i2) {
        if (this.w) {
            return;
        }
        s1();
        o oVar = this.m;
        if (oVar == null) {
            return;
        }
        oVar.D1(i2);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View W0 = this.m.W0(view, i2);
        if (W0 != null) {
            return W0;
        }
        boolean z3 = (this.l == null || this.m == null || s0() || this.w) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.m.q()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (B0) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.m.p()) {
                int i4 = (this.m.d0() == 1) ^ (i2 == 2) ? 66 : 17;
                boolean z4 = focusFinder.findNextFocus(this, view, i4) == null;
                if (B0) {
                    i2 = i4;
                }
                z2 = z4;
            }
            if (z2) {
                t();
                if (Q(view) == null) {
                    return null;
                }
                o1();
                this.m.P0(view, i2, this.b, this.g0);
                q1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (findNextFocus == null && z3) {
                t();
                if (Q(view) == null) {
                    return null;
                }
                o1();
                view2 = this.m.P0(view, i2, this.b, this.g0);
                q1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return t0(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        } else {
            Y0(view2, null);
            return view;
        }
    }

    public void g(n nVar) {
        h(nVar, -1);
    }

    public final int g0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public final void g1(g gVar, boolean z2, boolean z3) {
        g gVar2 = this.l;
        if (gVar2 != null) {
            gVar2.s(this.a);
            this.l.l(this);
        }
        if (!z2 || z3) {
            S0();
        }
        this.d.u();
        g gVar3 = this.l;
        this.l = gVar;
        if (gVar != null) {
            gVar.q(this.a);
            gVar.h(this);
        }
        o oVar = this.m;
        if (oVar != null) {
            oVar.K0(gVar3, this.l);
        }
        this.b.x(gVar3, this.l, z2);
        this.g0.g = true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.m;
        if (oVar != null) {
            return oVar.I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + O());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.m;
        if (oVar != null) {
            return oVar.J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + O());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.l;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.m;
        return oVar != null ? oVar.L() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.g;
    }

    public androidx.recyclerview.widget.k getCompatAccessibilityDelegate() {
        return this.n0;
    }

    public k getEdgeEffectFactory() {
        return this.G;
    }

    public l getItemAnimator() {
        return this.L;
    }

    public int getItemDecorationCount() {
        return this.n.size();
    }

    public o getLayoutManager() {
        return this.m;
    }

    public int getMaxFlingVelocity() {
        return this.W;
    }

    public int getMinFlingVelocity() {
        return this.V;
    }

    public long getNanoTime() {
        if (A0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public q getOnFlingListener() {
        return this.U;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.c0;
    }

    public t getRecycledViewPool() {
        return this.b.i();
    }

    public int getScrollState() {
        return this.M;
    }

    public void h(n nVar, int i2) {
        o oVar = this.m;
        if (oVar != null) {
            oVar.l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.n.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.n.add(nVar);
        } else {
            this.n.add(i2, nVar);
        }
        v0();
        requestLayout();
    }

    public final String h0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    public boolean h1(c0 c0Var, int i2) {
        if (!s0()) {
            p51.u0(c0Var.a, i2);
            return true;
        }
        c0Var.q = i2;
        this.t0.add(c0Var);
        return false;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(r rVar) {
        this.o.add(rVar);
    }

    public Rect i0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (pVar.c) {
            if (this.g0.e() && (pVar.b() || pVar.d())) {
                return pVar.b;
            }
            Rect rect = pVar.b;
            rect.set(0, 0, 0, 0);
            int size = this.n.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.i.set(0, 0, 0, 0);
                ((n) this.n.get(i2)).e(this.i, view, this, this.g0);
                int i3 = rect.left;
                Rect rect2 = this.i;
                rect.left = i3 + rect2.left;
                rect.top += rect2.top;
                rect.right += rect2.right;
                rect.bottom += rect2.bottom;
            }
            pVar.c = false;
            return rect;
        }
        return pVar.b;
    }

    public boolean i1(AccessibilityEvent accessibilityEvent) {
        if (s0()) {
            int a2 = accessibilityEvent != null ? androidx.appcompat.view.menu.c0.a(accessibilityEvent) : 0;
            this.y |= a2 != 0 ? a2 : 0;
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.q;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.w;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(s sVar) {
        if (this.i0 == null) {
            this.i0 = new ArrayList();
        }
        this.i0.add(sVar);
    }

    public final void j0(long j2, c0 c0Var, c0 c0Var2) {
        int g2 = this.e.g();
        for (int i2 = 0; i2 < g2; i2++) {
            c0 e0 = e0(this.e.f(i2));
            if (e0 != c0Var && b0(e0) == j2) {
                g gVar = this.l;
                if (gVar == null || !gVar.g()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + e0 + " \n View Holder 2:" + c0Var + O());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + e0 + " \n View Holder 2:" + c0Var + O());
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb.append(c0Var2);
        sb.append(" cannot be found but it is necessary for ");
        sb.append(c0Var);
        sb.append(O());
    }

    public void j1(int i2, int i3) {
        k1(i2, i3, null);
    }

    public void k(c0 c0Var, l.b bVar, l.b bVar2) {
        c0Var.G(false);
        if (this.L.a(c0Var, bVar, bVar2)) {
            K0();
        }
    }

    public boolean k0() {
        return !this.t || this.C || this.d.p();
    }

    public void k1(int i2, int i3, Interpolator interpolator) {
        l1(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    public final void l(c0 c0Var, c0 c0Var2, l.b bVar, l.b bVar2, boolean z2, boolean z3) {
        c0Var.G(false);
        if (z2) {
            f(c0Var);
        }
        if (c0Var != c0Var2) {
            if (z3) {
                f(c0Var2);
            }
            c0Var.h = c0Var2;
            f(c0Var);
            this.b.J(c0Var);
            c0Var2.G(false);
            c0Var2.i = c0Var;
        }
        if (this.L.b(c0Var, c0Var2, bVar, bVar2)) {
            K0();
        }
    }

    public final boolean l0() {
        int g2 = this.e.g();
        for (int i2 = 0; i2 < g2; i2++) {
            c0 e0 = e0(this.e.f(i2));
            if (e0 != null && !e0.J() && e0.y()) {
                return true;
            }
        }
        return false;
    }

    public void l1(int i2, int i3, Interpolator interpolator, int i4) {
        m1(i2, i3, interpolator, i4, false);
    }

    public void m(c0 c0Var, l.b bVar, l.b bVar2) {
        f(c0Var);
        c0Var.G(false);
        if (this.L.c(c0Var, bVar, bVar2)) {
            K0();
        }
    }

    public void m0() {
        this.d = new androidx.recyclerview.widget.a(new f());
    }

    public void m1(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        o oVar = this.m;
        if (oVar == null || this.w) {
            return;
        }
        if (!oVar.p()) {
            i2 = 0;
        }
        if (!this.m.q()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (i4 != Integer.MIN_VALUE && i4 <= 0) {
            scrollBy(i2, i3);
            return;
        }
        if (z2) {
            int i5 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i5 |= 2;
            }
            p1(i5, 1);
        }
        this.d0.f(i2, i3, i4, interpolator);
    }

    public void n(String str) {
        if (s0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + O());
        } else if (this.F > 0) {
            new IllegalStateException("" + O());
        }
    }

    public final void n0() {
        if (p51.w(this) == 0) {
            p51.w0(this, 8);
        }
    }

    public void n1(int i2) {
        o oVar;
        if (this.w || (oVar = this.m) == null) {
            return;
        }
        oVar.O1(this, this.g0, i2);
    }

    public boolean o(c0 c0Var) {
        l lVar = this.L;
        return lVar == null || lVar.g(c0Var, c0Var.o());
    }

    public final void o0() {
        this.e = new androidx.recyclerview.widget.b(new e());
    }

    public void o1() {
        int i2 = this.u + 1;
        this.u = i2;
        if (i2 != 1 || this.w) {
            return;
        }
        this.v = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r1 >= 30.0f) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.E = r0
            r1 = 1
            r5.q = r1
            boolean r2 = r5.t
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.t = r1
            androidx.recyclerview.widget.RecyclerView$o r1 = r5.m
            if (r1 == 0) goto L1e
            r1.E(r5)
        L1e:
            r5.m0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.A0
            if (r0 == 0) goto L61
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.e.q
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.e0 = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.e0 = r1
            android.view.Display r1 = androidx.appcompat.view.menu.p51.r(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.e r2 = r5.e0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.o = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.e r0 = r5.e0
            r0.a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        l lVar = this.L;
        if (lVar != null) {
            lVar.k();
        }
        s1();
        this.q = false;
        o oVar = this.m;
        if (oVar != null) {
            oVar.F(this, this.b);
        }
        this.t0.clear();
        removeCallbacks(this.u0);
        this.f.j();
        if (!A0 || (eVar = this.e0) == null) {
            return;
        }
        eVar.j(this);
        this.e0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.n.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((n) this.n.get(i2)).g(canvas, this, this.g0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.m
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.w
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.m
            boolean r0 = r0.q()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.m
            boolean r3 = r3.p()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.m
            boolean r3 = r3.q()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.m
            boolean r3 = r3.p()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.a0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.b0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.d1(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
        if (r0 != false) goto L48;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        r11.a("RV OnLayout");
        A();
        r11.b();
        this.t = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        o oVar = this.m;
        if (oVar == null) {
            v(i2, i3);
        } else if (oVar.y0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.m.f1(this.b, this.g0, i2, i3);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.l == null) {
                return;
            }
            if (this.g0.e == 1) {
                B();
            }
            this.m.G1(i2, i3);
            this.g0.j = true;
            C();
            this.m.J1(i2, i3);
            if (this.m.M1()) {
                this.m.G1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.g0.j = true;
                C();
                this.m.J1(i2, i3);
            }
        } else if (this.r) {
            this.m.f1(this.b, this.g0, i2, i3);
        } else {
            if (this.z) {
                o1();
                E0();
                M0();
                F0();
                z zVar = this.g0;
                if (zVar.l) {
                    zVar.h = true;
                } else {
                    this.d.j();
                    this.g0.h = false;
                }
                this.z = false;
                q1(false);
            } else if (this.g0.l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.l;
            if (gVar != null) {
                this.g0.f = gVar.c();
            } else {
                this.g0.f = 0;
            }
            o1();
            this.m.f1(this.b, this.g0, i2, i3);
            q1(false);
            this.g0.h = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (s0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        this.c = xVar;
        super.onRestoreInstanceState(xVar.a());
        o oVar = this.m;
        if (oVar == null || (parcelable2 = this.c.o) == null) {
            return;
        }
        oVar.i1(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        x xVar2 = this.c;
        if (xVar2 != null) {
            xVar.b(xVar2);
        } else {
            o oVar = this.m;
            if (oVar != null) {
                xVar.o = oVar.j1();
            } else {
                xVar.o = null;
            }
        }
        return xVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        q0();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        a1();
        setScrollState(0);
    }

    public void p0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(gm0.a), resources.getDimensionPixelSize(gm0.c), resources.getDimensionPixelOffset(gm0.b));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + O());
    }

    public boolean p1(int i2, int i3) {
        return getScrollingChildHelper().p(i2, i3);
    }

    public void q0() {
        this.K = null;
        this.I = null;
        this.J = null;
        this.H = null;
    }

    public void q1(boolean z2) {
        if (this.u < 1) {
            this.u = 1;
        }
        if (!z2 && !this.w) {
            this.v = false;
        }
        if (this.u == 1) {
            if (z2 && this.v && !this.w && this.m != null && this.l != null) {
                A();
            }
            if (!this.w) {
                this.v = false;
            }
        }
        this.u--;
    }

    public void r() {
        int j2 = this.e.j();
        for (int i2 = 0; i2 < j2; i2++) {
            c0 e0 = e0(this.e.i(i2));
            if (!e0.J()) {
                e0.c();
            }
        }
        this.b.d();
    }

    public boolean r0() {
        AccessibilityManager accessibilityManager = this.A;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void r1(int i2) {
        getScrollingChildHelper().r(i2);
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        c0 e0 = e0(view);
        if (e0 != null) {
            if (e0.x()) {
                e0.f();
            } else if (!e0.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + e0 + O());
            }
        }
        view.clearAnimation();
        y(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.m.h1(this, this.g0, view, view2) && view2 != null) {
            Y0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.m.x1(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.o.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((r) this.o.get(i2)).c(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.u != 0 || this.w) {
            this.v = true;
        } else {
            super.requestLayout();
        }
    }

    public void s(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.H.onRelease();
            z2 = this.H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.J.onRelease();
            z2 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.I.onRelease();
            z2 |= this.I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.K;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.K.onRelease();
            z2 |= this.K.isFinished();
        }
        if (z2) {
            p51.b0(this);
        }
    }

    public boolean s0() {
        return this.E > 0;
    }

    public void s1() {
        setScrollState(0);
        t1();
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        o oVar = this.m;
        if (oVar == null || this.w) {
            return;
        }
        boolean p2 = oVar.p();
        boolean q2 = this.m.q();
        if (p2 || q2) {
            if (!p2) {
                i2 = 0;
            }
            if (!q2) {
                i3 = 0;
            }
            d1(i2, i3, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (i1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.k kVar) {
        this.n0 = kVar;
        p51.k0(this, kVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        g1(gVar, false, true);
        N0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.g) {
            q0();
        }
        this.g = z2;
        super.setClipToPadding(z2);
        if (this.t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        tj0.g(kVar);
        this.G = kVar;
        q0();
    }

    public void setHasFixedSize(boolean z2) {
        this.r = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.L;
        if (lVar2 != null) {
            lVar2.k();
            this.L.v(null);
        }
        this.L = lVar;
        if (lVar != null) {
            lVar.v(this.l0);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.b.G(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.m) {
            return;
        }
        s1();
        if (this.m != null) {
            l lVar = this.L;
            if (lVar != null) {
                lVar.k();
            }
            this.m.q1(this.b);
            this.m.r1(this.b);
            this.b.c();
            if (this.q) {
                this.m.F(this, this.b);
            }
            this.m.K1(null);
            this.m = null;
        } else {
            this.b.c();
        }
        this.e.o();
        this.m = oVar;
        if (oVar != null) {
            if (oVar.b != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.b.O());
            }
            oVar.K1(this);
            if (this.q) {
                this.m.E(this);
            }
        }
        this.b.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().m(z2);
    }

    public void setOnFlingListener(q qVar) {
        this.U = qVar;
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.h0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.c0 = z2;
    }

    public void setRecycledViewPool(t tVar) {
        this.b.E(tVar);
    }

    public void setRecyclerListener(v vVar) {
    }

    public void setScrollState(int i2) {
        if (i2 == this.M) {
            return;
        }
        this.M = i2;
        if (i2 != 2) {
            t1();
        }
        G(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.T = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("setScrollingTouchSlop(): bad argument constant ");
            sb.append(i2);
            sb.append("; using default value");
        }
        this.T = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(a0 a0Var) {
        this.b.F(a0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().o(i2);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.w) {
            n("Do not suppressLayout in layout or scroll");
            if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.w = true;
                this.x = true;
                s1();
                return;
            }
            this.w = false;
            if (this.v && this.m != null && this.l != null) {
                requestLayout();
            }
            this.v = false;
        }
    }

    public void t() {
        if (!this.t || this.C) {
            r11.a("RV FullInvalidate");
            A();
            r11.b();
        } else if (this.d.p()) {
            if (!this.d.o(4) || this.d.o(11)) {
                if (this.d.p()) {
                    r11.a("RV FullInvalidate");
                    A();
                    r11.b();
                    return;
                }
                return;
            }
            r11.a("RV PartialInvalidate");
            o1();
            E0();
            this.d.s();
            if (!this.v) {
                if (l0()) {
                    A();
                } else {
                    this.d.i();
                }
            }
            q1(true);
            F0();
            r11.b();
        }
    }

    public final boolean t0(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || Q(view2) == null) {
            return false;
        }
        if (view == null || Q(view) == null) {
            return true;
        }
        this.i.set(0, 0, view.getWidth(), view.getHeight());
        this.j.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.i);
        offsetDescendantRectToMyCoords(view2, this.j);
        char c2 = 65535;
        int i4 = this.m.d0() == 1 ? -1 : 1;
        Rect rect = this.i;
        int i5 = rect.left;
        Rect rect2 = this.j;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 <= 0);
        } else if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 >= 0);
        } else if (i2 == 17) {
            return i3 < 0;
        } else if (i2 == 33) {
            return c2 < 0;
        } else if (i2 == 66) {
            return i3 > 0;
        } else if (i2 == 130) {
            return c2 > 0;
        } else {
            throw new IllegalArgumentException("Invalid direction: " + i2 + O());
        }
    }

    public final void t1() {
        this.d0.g();
        o oVar = this.m;
        if (oVar != null) {
            oVar.Q1();
        }
    }

    public final void u(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String h0 = h0(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(h0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                try {
                    constructor = asSubclass.getConstructor(D0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + h0, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + h0, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + h0, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + h0, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + h0, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + h0, e8);
            }
        }
    }

    public void u0(int i2) {
        if (this.m == null) {
            return;
        }
        setScrollState(2);
        this.m.D1(i2);
        awakenScrollBars();
    }

    public void u1(int i2, int i3, Object obj) {
        int i4;
        int j2 = this.e.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < j2; i6++) {
            View i7 = this.e.i(i6);
            c0 e0 = e0(i7);
            if (e0 != null && !e0.J() && (i4 = e0.c) >= i2 && i4 < i5) {
                e0.b(2);
                e0.a(obj);
                ((p) i7.getLayoutParams()).c = true;
            }
        }
        this.b.M(i2, i3);
    }

    public void v(int i2, int i3) {
        setMeasuredDimension(o.s(i2, getPaddingLeft() + getPaddingRight(), p51.z(this)), o.s(i3, getPaddingTop() + getPaddingBottom(), p51.y(this)));
    }

    public void v0() {
        int j2 = this.e.j();
        for (int i2 = 0; i2 < j2; i2++) {
            ((p) this.e.i(i2).getLayoutParams()).c = true;
        }
        this.b.s();
    }

    public final boolean w(int i2, int i3) {
        T(this.o0);
        int[] iArr = this.o0;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    public void w0() {
        int j2 = this.e.j();
        for (int i2 = 0; i2 < j2; i2++) {
            c0 e0 = e0(this.e.i(i2));
            if (e0 != null && !e0.J()) {
                e0.b(6);
            }
        }
        v0();
        this.b.t();
    }

    public void x(View view) {
        int size;
        c0 e0 = e0(view);
        C0(view);
        g gVar = this.l;
        if (gVar != null && e0 != null) {
            gVar.n(e0);
        }
        List list = this.B;
        if (list == null || list.size() - 1 < 0) {
            return;
        }
        my0.a(this.B.get(size));
        throw null;
    }

    public void x0(int i2) {
        int g2 = this.e.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.e.f(i3).offsetLeftAndRight(i2);
        }
    }

    public void y(View view) {
        int size;
        c0 e0 = e0(view);
        D0(view);
        g gVar = this.l;
        if (gVar != null && e0 != null) {
            gVar.o(e0);
        }
        List list = this.B;
        if (list == null || list.size() - 1 < 0) {
            return;
        }
        my0.a(this.B.get(size));
        throw null;
    }

    public void y0(int i2) {
        int g2 = this.e.g();
        for (int i3 = 0; i3 < g2; i3++) {
            this.e.f(i3).offsetTopAndBottom(i2);
        }
    }

    public final void z() {
        int i2 = this.y;
        this.y = 0;
        if (i2 == 0 || !r0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        androidx.appcompat.view.menu.c0.b(obtain, i2);
        sendAccessibilityEventUnchecked(obtain);
    }

    public void z0(int i2, int i3) {
        int j2 = this.e.j();
        for (int i4 = 0; i4 < j2; i4++) {
            c0 e0 = e0(this.e.i(i4));
            if (e0 != null && !e0.J() && e0.c >= i2) {
                e0.A(i3, false);
                this.g0.g = true;
            }
        }
        this.b.u(i2, i3);
        requestLayout();
    }

    /* loaded from: classes.dex */
    public static class p extends ViewGroup.MarginLayoutParams {
        public c0 a;
        public final Rect b;
        public boolean c;
        public boolean d;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public int a() {
            return this.a.m();
        }

        public boolean b() {
            return this.a.y();
        }

        public boolean c() {
            return this.a.v();
        }

        public boolean d() {
            return this.a.t();
        }

        public p(int i, int i2) {
            super(i, i2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new w();
        this.b = new u();
        this.f = new androidx.recyclerview.widget.p();
        this.h = new a();
        this.i = new Rect();
        this.j = new Rect();
        this.k = new RectF();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.u = 0;
        this.C = false;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.G = new k();
        this.L = new androidx.recyclerview.widget.c();
        this.M = 0;
        this.N = -1;
        this.a0 = Float.MIN_VALUE;
        this.b0 = Float.MIN_VALUE;
        this.c0 = true;
        this.d0 = new b0();
        this.f0 = A0 ? new e.b() : null;
        this.g0 = new z();
        this.j0 = false;
        this.k0 = false;
        this.l0 = new m();
        this.m0 = false;
        this.o0 = new int[2];
        this.q0 = new int[2];
        this.r0 = new int[2];
        this.s0 = new int[2];
        this.t0 = new ArrayList();
        this.u0 = new b();
        this.v0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.T = viewConfiguration.getScaledTouchSlop();
        this.a0 = t51.e(viewConfiguration, context);
        this.b0 = t51.h(viewConfiguration, context);
        this.V = viewConfiguration.getScaledMinimumFlingVelocity();
        this.W = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.L.v(this.l0);
        m0();
        o0();
        n0();
        if (p51.v(this) == 0) {
            p51.u0(this, 1);
        }
        this.A = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.k(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nn0.f, i2, 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, nn0.f, attributeSet, obtainStyledAttributes, i2, 0);
        }
        String string = obtainStyledAttributes.getString(nn0.o);
        if (obtainStyledAttributes.getInt(nn0.i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.g = obtainStyledAttributes.getBoolean(nn0.h, true);
        boolean z2 = obtainStyledAttributes.getBoolean(nn0.j, false);
        this.s = z2;
        if (z2) {
            p0((StateListDrawable) obtainStyledAttributes.getDrawable(nn0.m), obtainStyledAttributes.getDrawable(nn0.n), (StateListDrawable) obtainStyledAttributes.getDrawable(nn0.k), obtainStyledAttributes.getDrawable(nn0.l));
        }
        obtainStyledAttributes.recycle();
        u(context, string, attributeSet, i2, 0);
        int[] iArr = w0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        if (i3 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes2, i2, 0);
        }
        boolean z3 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
    }

    /* loaded from: classes.dex */
    public static class x extends androidx.appcompat.view.menu.c {
        public static final Parcelable.Creator<x> CREATOR = new a();
        public Parcelable o;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public x createFromParcel(Parcel parcel) {
                return new x(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public x createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new x(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public x[] newArray(int i) {
                return new x[i];
            }
        }

        public x(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.o = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        public void b(x xVar) {
            this.o = xVar.o;
        }

        @Override // androidx.appcompat.view.menu.c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.o, 0);
        }

        public x(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.m;
        if (oVar != null) {
            return oVar.K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + O());
    }
}
