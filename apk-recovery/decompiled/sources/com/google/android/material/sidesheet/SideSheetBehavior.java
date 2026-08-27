package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.dn0;
import androidx.appcompat.view.menu.fu0;
import androidx.appcompat.view.menu.gu0;
import androidx.appcompat.view.menu.hn0;
import androidx.appcompat.view.menu.my;
import androidx.appcompat.view.menu.my0;
import androidx.appcompat.view.menu.on0;
import androidx.appcompat.view.menu.p0;
import androidx.appcompat.view.menu.p51;
import androidx.appcompat.view.menu.qb0;
import androidx.appcompat.view.menu.rb0;
import androidx.appcompat.view.menu.s0;
import androidx.appcompat.view.menu.t80;
import androidx.appcompat.view.menu.tb0;
import androidx.appcompat.view.menu.u51;
import androidx.appcompat.view.menu.up0;
import androidx.appcompat.view.menu.vt0;
import androidx.appcompat.view.menu.xb0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.b {
    public fu0 a;
    public float b;
    public rb0 c;
    public ColorStateList d;
    public vt0 e;
    public final c f;
    public float g;
    public boolean h;
    public int i;
    public int j;
    public u51 k;
    public boolean l;
    public float m;
    public int n;
    public int o;
    public int p;
    public int q;
    public WeakReference r;
    public WeakReference s;
    public int t;
    public VelocityTracker u;
    public tb0 v;
    public int w;
    public final Set x;
    public final u51.c y;
    public static final int z = dn0.t;
    public static final int A = hn0.e;

    /* loaded from: classes.dex */
    public class a extends u51.c {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public int a(View view, int i, int i2) {
            return xb0.b(i, SideSheetBehavior.this.a.f(), SideSheetBehavior.this.a.e());
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public int d(View view) {
            return SideSheetBehavior.this.n + SideSheetBehavior.this.d0();
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public void j(int i) {
            if (i == 1 && SideSheetBehavior.this.h) {
                SideSheetBehavior.this.B0(1);
            }
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public void k(View view, int i, int i2, int i3, int i4) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View Z = SideSheetBehavior.this.Z();
            if (Z != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) Z.getLayoutParams()) != null) {
                SideSheetBehavior.this.a.n(marginLayoutParams, view.getLeft(), view.getRight());
                Z.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.V(view, i);
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public void l(View view, float f, float f2) {
            int R = SideSheetBehavior.this.R(view, f, f2);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.G0(view, R, sideSheetBehavior.F0());
        }

        @Override // androidx.appcompat.view.menu.u51.c
        public boolean m(View view, int i) {
            return (SideSheetBehavior.this.i == 1 || SideSheetBehavior.this.r == null || SideSheetBehavior.this.r.get() != view) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    public class c {
        public int a;
        public boolean b;
        public final Runnable c = new Runnable() { // from class: androidx.appcompat.view.menu.ku0
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c.this.c();
            }
        };

        public c() {
        }

        public void b(int i) {
            if (SideSheetBehavior.this.r == null || SideSheetBehavior.this.r.get() == null) {
                return;
            }
            this.a = i;
            if (this.b) {
                return;
            }
            p51.c0((View) SideSheetBehavior.this.r.get(), this.c);
            this.b = true;
        }

        public final /* synthetic */ void c() {
            this.b = false;
            if (SideSheetBehavior.this.k != null && SideSheetBehavior.this.k.k(true)) {
                b(this.a);
            } else if (SideSheetBehavior.this.i == 2) {
                SideSheetBehavior.this.B0(this.a);
            }
        }
    }

    public SideSheetBehavior() {
        this.f = new c();
        this.h = true;
        this.i = 5;
        this.j = 5;
        this.m = 0.1f;
        this.t = -1;
        this.x = new LinkedHashSet();
        this.y = new a();
    }

    private boolean C0() {
        return this.k != null && (this.h || this.i == 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0(View view, int i, boolean z2) {
        if (!p0(view, i, z2)) {
            B0(i);
            return;
        }
        B0(2);
        this.f.b(i);
    }

    private void H0() {
        View view;
        WeakReference weakReference = this.r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        p51.e0(view, 262144);
        p51.e0(view, 1048576);
        if (this.i != 5) {
            t0(view, p0.a.y, 5);
        }
        if (this.i != 3) {
            t0(view, p0.a.w, 3);
        }
    }

    private s0 T(final int i) {
        return new s0() { // from class: androidx.appcompat.view.menu.iu0
            @Override // androidx.appcompat.view.menu.s0
            public final boolean a(View view, s0.a aVar) {
                boolean q0;
                q0 = SideSheetBehavior.this.q0(i, view, aVar);
                return q0;
            }
        };
    }

    private void U(Context context) {
        if (this.e == null) {
            return;
        }
        rb0 rb0Var = new rb0(this.e);
        this.c = rb0Var;
        rb0Var.J(context);
        ColorStateList colorStateList = this.d;
        if (colorStateList != null) {
            this.c.T(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.c.setTint(typedValue.data);
    }

    private int X(int i, int i2, int i3, int i4) {
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

    private void t0(View view, p0.a aVar, int i) {
        p51.g0(view, aVar, null, T(i));
    }

    private void v0(View view, Runnable runnable) {
        if (o0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    public void A0(final int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.r;
        if (weakReference == null || weakReference.get() == null) {
            B0(i);
        } else {
            v0((View) this.r.get(), new Runnable() { // from class: androidx.appcompat.view.menu.ju0
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.this.r0(i);
                }
            });
        }
    }

    public void B0(int i) {
        View view;
        if (this.i == i) {
            return;
        }
        this.i = i;
        if (i == 3 || i == 5) {
            this.j = i;
        }
        WeakReference weakReference = this.r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        J0(view);
        Iterator it = this.x.iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        } else {
            H0();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (view.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.i == 1 && actionMasked == 0) {
                return true;
            }
            if (C0()) {
                this.k.z(motionEvent);
            }
            if (actionMasked == 0) {
                u0();
            }
            if (this.u == null) {
                this.u = VelocityTracker.obtain();
            }
            this.u.addMovement(motionEvent);
            if (C0() && actionMasked == 2 && !this.l && m0(motionEvent)) {
                this.k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.l;
        }
        return false;
    }

    public boolean D0(View view, float f) {
        return this.a.m(view, f);
    }

    public final boolean E0(View view) {
        return (view.isShown() || p51.l(view) != null) && this.h;
    }

    public boolean F0() {
        return true;
    }

    public final void I0(vt0 vt0Var) {
        rb0 rb0Var = this.c;
        if (rb0Var != null) {
            rb0Var.setShapeAppearanceModel(vt0Var);
        }
    }

    public final void J0(View view) {
        int i = this.i == 5 ? 4 : 0;
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    public final int P(int i, View view) {
        int i2 = this.i;
        if (i2 == 1 || i2 == 2) {
            return i - this.a.g(view);
        }
        if (i2 != 3) {
            if (i2 == 5) {
                return this.a.d();
            }
            throw new IllegalStateException("Unexpected value: " + this.i);
        }
        return 0;
    }

    public final float Q(float f, float f2) {
        return Math.abs(f - f2);
    }

    public final int R(View view, float f, float f2) {
        if (n0(f)) {
            return 3;
        }
        if (D0(view, f)) {
            if (!this.a.l(f, f2) && !this.a.k(view)) {
                return 3;
            }
        } else if (f == 0.0f || !gu0.a(f, f2)) {
            int left = view.getLeft();
            if (Math.abs(left - a0()) < Math.abs(left - this.a.d())) {
                return 3;
            }
        }
        return 5;
    }

    public final void S() {
        WeakReference weakReference = this.s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.s = null;
    }

    public final void V(View view, int i) {
        if (this.x.isEmpty()) {
            return;
        }
        this.a.b(i);
        Iterator it = this.x.iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            throw null;
        }
    }

    public final void W(View view) {
        if (p51.l(view) == null) {
            p51.n0(view, view.getResources().getString(z));
        }
    }

    public int Y() {
        return this.n;
    }

    public View Z() {
        WeakReference weakReference = this.s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int a0() {
        return this.a.c();
    }

    public float b0() {
        return this.m;
    }

    public float c0() {
        return 0.5f;
    }

    public int d0() {
        return this.q;
    }

    public int e0(int i) {
        if (i != 3) {
            if (i == 5) {
                return this.a.d();
            }
            throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i);
        }
        return a0();
    }

    public int f0() {
        return this.p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.r = null;
        this.k = null;
        this.v = null;
    }

    public int g0() {
        return this.o;
    }

    public int h0() {
        return 500;
    }

    public u51 i0() {
        return this.k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void j() {
        super.j();
        this.r = null;
        this.k = null;
        this.v = null;
    }

    public final CoordinatorLayout.e j0() {
        View view;
        WeakReference weakReference = this.r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.e)) {
            return null;
        }
        return (CoordinatorLayout.e) view.getLayoutParams();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        u51 u51Var;
        if (!E0(view)) {
            this.l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u0();
        }
        if (this.u == null) {
            this.u = VelocityTracker.obtain();
        }
        this.u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.l) {
            this.l = false;
            return false;
        }
        return (this.l || (u51Var = this.k) == null || !u51Var.G(motionEvent)) ? false : true;
    }

    public final boolean k0() {
        CoordinatorLayout.e j0 = j0();
        return j0 != null && ((ViewGroup.MarginLayoutParams) j0).leftMargin > 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (p51.u(coordinatorLayout) && !p51.u(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.r == null) {
            this.r = new WeakReference(view);
            this.v = new tb0(view);
            rb0 rb0Var = this.c;
            if (rb0Var != null) {
                p51.o0(view, rb0Var);
                rb0 rb0Var2 = this.c;
                float f = this.g;
                if (f == -1.0f) {
                    f = p51.s(view);
                }
                rb0Var2.S(f);
            } else {
                ColorStateList colorStateList = this.d;
                if (colorStateList != null) {
                    p51.p0(view, colorStateList);
                }
            }
            J0(view);
            H0();
            if (p51.v(view) == 0) {
                p51.u0(view, 1);
            }
            W(view);
        }
        z0(view, i);
        if (this.k == null) {
            this.k = u51.m(coordinatorLayout, this.y);
        }
        int g = this.a.g(view);
        coordinatorLayout.G(view, i);
        this.o = coordinatorLayout.getWidth();
        this.p = this.a.h(coordinatorLayout);
        this.n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.q = marginLayoutParams != null ? this.a.a(marginLayoutParams) : 0;
        p51.U(view, P(g, view));
        s0(coordinatorLayout);
        for (Object obj : this.x) {
            my0.a(obj);
        }
        return true;
    }

    public final boolean l0() {
        CoordinatorLayout.e j0 = j0();
        return j0 != null && ((ViewGroup.MarginLayoutParams) j0).rightMargin > 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(X(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, -1, marginLayoutParams.width), X(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, -1, marginLayoutParams.height));
        return true;
    }

    public final boolean m0(MotionEvent motionEvent) {
        return C0() && Q((float) this.w, motionEvent.getX()) > ((float) this.k.u());
    }

    public final boolean n0(float f) {
        return this.a.j(f);
    }

    public final boolean o0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && p51.N(view);
    }

    public final boolean p0(View view, int i, boolean z2) {
        int e0 = e0(i);
        u51 i0 = i0();
        return i0 != null && (!z2 ? !i0.H(view, e0, view.getTop()) : !i0.F(e0, view.getTop()));
    }

    public final /* synthetic */ boolean q0(int i, View view, s0.a aVar) {
        A0(i);
        return true;
    }

    public final /* synthetic */ void r0(int i) {
        View view = (View) this.r.get();
        if (view != null) {
            G0(view, i, false);
        }
    }

    public final void s0(CoordinatorLayout coordinatorLayout) {
        int i;
        View findViewById;
        if (this.s != null || (i = this.t) == -1 || (findViewById = coordinatorLayout.findViewById(i)) == null) {
            return;
        }
        this.s = new WeakReference(findViewById);
    }

    public final void u0() {
        VelocityTracker velocityTracker = this.u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.u = null;
        }
    }

    public void w0(int i) {
        this.t = i;
        S();
        WeakReference weakReference = this.r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i == -1 || !p51.O(view)) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        b bVar = (b) parcelable;
        if (bVar.a() != null) {
            super.x(coordinatorLayout, view, bVar.a());
        }
        int i = bVar.o;
        i = (i == 1 || i == 2) ? 5 : 5;
        this.i = i;
        this.j = i;
    }

    public void x0(boolean z2) {
        this.h = z2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new b(super.y(coordinatorLayout, view), this);
    }

    public final void y0(int i) {
        fu0 fu0Var = this.a;
        if (fu0Var == null || fu0Var.i() != i) {
            if (i == 0) {
                this.a = new up0(this);
                if (this.e == null || l0()) {
                    return;
                }
                vt0.b v = this.e.v();
                v.E(0.0f).w(0.0f);
                I0(v.m());
            } else if (i == 1) {
                this.a = new t80(this);
                if (this.e == null || k0()) {
                    return;
                }
                vt0.b v2 = this.e.v();
                v2.A(0.0f).s(0.0f);
                I0(v2.m());
            } else {
                throw new IllegalArgumentException("Invalid sheet edge position value: " + i + ". Must be 0 or 1.");
            }
        }
    }

    public final void z0(View view, int i) {
        y0(my.b(((CoordinatorLayout.e) view.getLayoutParams()).c, i) == 3 ? 1 : 0);
    }

    /* loaded from: classes.dex */
    public static class b extends androidx.appcompat.view.menu.c {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final int o;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.o = parcel.readInt();
        }

        @Override // androidx.appcompat.view.menu.c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.o);
        }

        public b(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.o = sideSheetBehavior.i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new c();
        this.h = true;
        this.i = 5;
        this.j = 5;
        this.m = 0.1f;
        this.t = -1;
        this.x = new LinkedHashSet();
        this.y = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, on0.W3);
        if (obtainStyledAttributes.hasValue(on0.Y3)) {
            this.d = qb0.a(context, obtainStyledAttributes, on0.Y3);
        }
        if (obtainStyledAttributes.hasValue(on0.b4)) {
            this.e = vt0.e(context, attributeSet, 0, A).m();
        }
        if (obtainStyledAttributes.hasValue(on0.a4)) {
            w0(obtainStyledAttributes.getResourceId(on0.a4, -1));
        }
        U(context);
        this.g = obtainStyledAttributes.getDimension(on0.X3, -1.0f);
        x0(obtainStyledAttributes.getBoolean(on0.Z3, true));
        obtainStyledAttributes.recycle();
        this.b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
