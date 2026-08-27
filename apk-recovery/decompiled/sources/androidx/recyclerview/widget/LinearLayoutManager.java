package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.y.b {
    public int A;
    public int B;
    public boolean C;
    public d D;
    public final a E;
    public final b F;
    public int G;
    public int[] H;
    public int s;
    public c t;
    public i u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* loaded from: classes.dex */
    public static class a {
        public i a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            e();
        }

        public void a() {
            this.c = this.d ? this.a.i() : this.a.m();
        }

        public void b(View view, int i) {
            if (this.d) {
                this.c = this.a.d(view) + this.a.o();
            } else {
                this.c = this.a.g(view);
            }
            this.b = i;
        }

        public void c(View view, int i) {
            int o = this.a.o();
            if (o >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int i2 = (this.a.i() - o) - this.a.d(view);
                this.c = this.a.i() - i2;
                if (i2 > 0) {
                    int e = this.c - this.a.e(view);
                    int m = this.a.m();
                    int min = e - (m + Math.min(this.a.g(view) - m, 0));
                    if (min < 0) {
                        this.c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.a.g(view);
            int m2 = g - this.a.m();
            this.c = g;
            if (m2 > 0) {
                int i3 = (this.a.i() - Math.min(0, (this.a.i() - o) - this.a.d(view))) - (g + this.a.e(view));
                if (i3 < 0) {
                    this.c -= Math.min(m2, -i3);
                }
            }
        }

        public boolean d(View view, RecyclerView.z zVar) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < zVar.b();
        }

        public void e() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        public void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int k;
        public boolean m;
        public boolean a = true;
        public int h = 0;
        public int i = 0;
        public boolean j = false;
        public List l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f = f(view);
            if (f == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.p) f.getLayoutParams()).a();
            }
        }

        public boolean c(RecyclerView.z zVar) {
            int i = this.d;
            return i >= 0 && i < zVar.b();
        }

        public View d(RecyclerView.u uVar) {
            if (this.l != null) {
                return e();
            }
            View o = uVar.o(this.d);
            this.d += this.e;
            return o;
        }

        public final View e() {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                View view = ((RecyclerView.c0) this.l.get(i)).a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.d == pVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int a;
            int size = this.l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((RecyclerView.c0) this.l.get(i2)).a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (a = (pVar.a() - this.d) * this.e) >= 0 && a < i) {
                    view2 = view3;
                    if (a == 0) {
                        break;
                    }
                    i = a;
                }
            }
            return view2;
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public int m;
        public int n;
        public boolean o;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        public boolean a() {
            return this.m >= 0;
        }

        public void b() {
            this.m = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.m);
            parcel.writeInt(this.n);
            parcel.writeInt(this.o ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.m = parcel.readInt();
            this.n = parcel.readInt();
            this.o = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.m = dVar.m;
            this.n = dVar.n;
            this.o = dVar.o;
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        I2(i);
        J2(z);
    }

    private View s2() {
        return N(this.x ? 0 : O() - 1);
    }

    private View t2() {
        return N(this.x ? O() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.z zVar) {
        return W1(zVar);
    }

    public void A2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar, int i) {
    }

    public final void B2(RecyclerView.u uVar, c cVar) {
        if (!cVar.a || cVar.m) {
            return;
        }
        int i = cVar.g;
        int i2 = cVar.i;
        if (cVar.f == -1) {
            D2(uVar, i, i2);
        } else {
            E2(uVar, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int C1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.s == 1) {
            return 0;
        }
        return H2(i, uVar, zVar);
    }

    public final void C2(RecyclerView.u uVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                t1(i, uVar);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            t1(i3, uVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void D1(int i) {
        this.A = i;
        this.B = Integer.MIN_VALUE;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        z1();
    }

    public final void D2(RecyclerView.u uVar, int i, int i2) {
        int O = O();
        if (i < 0) {
            return;
        }
        int h = (this.u.h() - i) + i2;
        if (this.x) {
            for (int i3 = 0; i3 < O; i3++) {
                View N = N(i3);
                if (this.u.g(N) < h || this.u.q(N) < h) {
                    C2(uVar, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = O - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View N2 = N(i5);
            if (this.u.g(N2) < h || this.u.q(N2) < h) {
                C2(uVar, i4, i5);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int E1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.s == 0) {
            return 0;
        }
        return H2(i, uVar, zVar);
    }

    public final void E2(RecyclerView.u uVar, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int O = O();
        if (!this.x) {
            for (int i4 = 0; i4 < O; i4++) {
                View N = N(i4);
                if (this.u.d(N) > i3 || this.u.p(N) > i3) {
                    C2(uVar, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = O - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View N2 = N(i6);
            if (this.u.d(N2) > i3 || this.u.p(N2) > i3) {
                C2(uVar, i5, i6);
                return;
            }
        }
    }

    public boolean F2() {
        return this.u.k() == 0 && this.u.h() == 0;
    }

    public final void G2() {
        if (this.s == 1 || !w2()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View H(int i) {
        int O = O();
        if (O == 0) {
            return null;
        }
        int n0 = i - n0(N(0));
        if (n0 >= 0 && n0 < O) {
            View N = N(n0);
            if (n0(N) == i) {
                return N;
            }
        }
        return super.H(i);
    }

    public int H2(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (O() == 0 || i == 0) {
            return 0;
        }
        Z1();
        this.t.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        O2(i2, abs, true, zVar);
        c cVar = this.t;
        int a2 = cVar.g + a2(uVar, cVar, zVar, false);
        if (a2 < 0) {
            return 0;
        }
        if (abs > a2) {
            i = i2 * a2;
        }
        this.u.r(-i);
        this.t.k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p I() {
        return new RecyclerView.p(-2, -2);
    }

    public void I2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        l(null);
        if (i != this.s || this.u == null) {
            i b2 = i.b(this, i);
            this.u = b2;
            this.E.a = b2;
            this.s = i;
            z1();
        }
    }

    public void J2(boolean z) {
        l(null);
        if (z == this.w) {
            return;
        }
        this.w = z;
        z1();
    }

    public void K2(boolean z) {
        l(null);
        if (this.y == z) {
            return;
        }
        this.y = z;
        z1();
    }

    public final boolean L2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (O() == 0) {
            return false;
        }
        View a0 = a0();
        if (a0 != null && aVar.d(a0, zVar)) {
            aVar.c(a0, n0(a0));
            return true;
        } else if (this.v != this.y) {
            return false;
        } else {
            View o2 = aVar.d ? o2(uVar, zVar) : p2(uVar, zVar);
            if (o2 != null) {
                aVar.b(o2, n0(o2));
                if (!zVar.e() && R1() && (this.u.g(o2) >= this.u.i() || this.u.d(o2) < this.u.m())) {
                    aVar.c = aVar.d ? this.u.i() : this.u.m();
                }
                return true;
            }
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean M1() {
        return (c0() == 1073741824 || v0() == 1073741824 || !w0()) ? false : true;
    }

    public final boolean M2(RecyclerView.z zVar, a aVar) {
        int i;
        if (!zVar.e() && (i = this.A) != -1) {
            if (i >= 0 && i < zVar.b()) {
                aVar.b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.a()) {
                    boolean z = this.D.o;
                    aVar.d = z;
                    if (z) {
                        aVar.c = this.u.i() - this.D.n;
                    } else {
                        aVar.c = this.u.m() + this.D.n;
                    }
                    return true;
                } else if (this.B != Integer.MIN_VALUE) {
                    boolean z2 = this.x;
                    aVar.d = z2;
                    if (z2) {
                        aVar.c = this.u.i() - this.B;
                    } else {
                        aVar.c = this.u.m() + this.B;
                    }
                    return true;
                } else {
                    View H = H(this.A);
                    if (H == null) {
                        if (O() > 0) {
                            aVar.d = (this.A < n0(N(0))) == this.x;
                        }
                        aVar.a();
                    } else if (this.u.e(H) > this.u.n()) {
                        aVar.a();
                        return true;
                    } else if (this.u.g(H) - this.u.m() < 0) {
                        aVar.c = this.u.m();
                        aVar.d = false;
                        return true;
                    } else if (this.u.i() - this.u.d(H) < 0) {
                        aVar.c = this.u.i();
                        aVar.d = true;
                        return true;
                    } else {
                        aVar.c = aVar.d ? this.u.d(H) + this.u.o() : this.u.g(H);
                    }
                    return true;
                }
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void N2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (M2(zVar, aVar) || L2(uVar, zVar, aVar)) {
            return;
        }
        aVar.a();
        aVar.b = this.y ? zVar.b() - 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void O0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.O0(recyclerView, uVar);
        if (this.C) {
            q1(uVar);
            uVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void O1(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i);
        P1(gVar);
    }

    public final void O2(int i, int i2, boolean z, RecyclerView.z zVar) {
        int m;
        this.t.m = F2();
        this.t.f = i;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        S1(zVar, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        boolean z2 = i == 1;
        c cVar = this.t;
        int i3 = z2 ? max2 : max;
        cVar.h = i3;
        if (!z2) {
            max = max2;
        }
        cVar.i = max;
        if (z2) {
            cVar.h = i3 + this.u.j();
            View s2 = s2();
            c cVar2 = this.t;
            cVar2.e = this.x ? -1 : 1;
            int n0 = n0(s2);
            c cVar3 = this.t;
            cVar2.d = n0 + cVar3.e;
            cVar3.b = this.u.d(s2);
            m = this.u.d(s2) - this.u.i();
        } else {
            View t2 = t2();
            this.t.h += this.u.m();
            c cVar4 = this.t;
            cVar4.e = this.x ? 1 : -1;
            int n02 = n0(t2);
            c cVar5 = this.t;
            cVar4.d = n02 + cVar5.e;
            cVar5.b = this.u.g(t2);
            m = (-this.u.g(t2)) + this.u.m();
        }
        c cVar6 = this.t;
        cVar6.c = i2;
        if (z) {
            cVar6.c = i2 - m;
        }
        cVar6.g = m;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View P0(View view, int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        int X1;
        G2();
        if (O() == 0 || (X1 = X1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        Z1();
        O2(X1, (int) (this.u.n() * 0.33333334f), false, zVar);
        c cVar = this.t;
        cVar.g = Integer.MIN_VALUE;
        cVar.a = false;
        a2(uVar, cVar, zVar, true);
        View m2 = X1 == -1 ? m2() : l2();
        View t2 = X1 == -1 ? t2() : s2();
        if (t2.hasFocusable()) {
            if (m2 == null) {
                return null;
            }
            return t2;
        }
        return m2;
    }

    public final void P2(int i, int i2) {
        this.t.c = this.u.i() - i2;
        c cVar = this.t;
        cVar.e = this.x ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Q0(AccessibilityEvent accessibilityEvent) {
        super.Q0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(f2());
            accessibilityEvent.setToIndex(i2());
        }
    }

    public final void Q2(a aVar) {
        P2(aVar.b, aVar.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean R1() {
        return this.D == null && this.v == this.y;
    }

    public final void R2(int i, int i2) {
        this.t.c = i2 - this.u.m();
        c cVar = this.t;
        cVar.d = i;
        cVar.e = this.x ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    public void S1(RecyclerView.z zVar, int[] iArr) {
        int i;
        int u2 = u2(zVar);
        if (this.t.f == -1) {
            i = 0;
        } else {
            i = u2;
            u2 = 0;
        }
        iArr[0] = u2;
        iArr[1] = i;
    }

    public final void S2(a aVar) {
        R2(aVar.b, aVar.c);
    }

    public void T1(RecyclerView.z zVar, c cVar, RecyclerView.o.c cVar2) {
        int i = cVar.d;
        if (i < 0 || i >= zVar.b()) {
            return;
        }
        cVar2.a(i, Math.max(0, cVar.g));
    }

    public final int U1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        Z1();
        return l.a(zVar, this.u, e2(!this.z, true), d2(!this.z, true), this, this.z);
    }

    public final int V1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        Z1();
        return l.b(zVar, this.u, e2(!this.z, true), d2(!this.z, true), this, this.z, this.x);
    }

    public final int W1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        Z1();
        return l.c(zVar, this.u, e2(!this.z, true), d2(!this.z, true), this, this.z);
    }

    public int X1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.s == 1) ? 1 : Integer.MIN_VALUE : this.s == 0 ? 1 : Integer.MIN_VALUE : this.s == 1 ? -1 : Integer.MIN_VALUE : this.s == 0 ? -1 : Integer.MIN_VALUE : (this.s != 1 && w2()) ? -1 : 1 : (this.s != 1 && w2()) ? 1 : -1;
    }

    public c Y1() {
        return new c();
    }

    public void Z1() {
        if (this.t == null) {
            this.t = Y1();
        }
    }

    public int a2(RecyclerView.u uVar, c cVar, RecyclerView.z zVar, boolean z) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            B2(uVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.c(zVar)) {
                break;
            }
            bVar.a();
            y2(uVar, zVar, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.a * cVar.f;
                if (!bVar.c || cVar.l != null || !zVar.e()) {
                    int i4 = cVar.c;
                    int i5 = bVar.a;
                    cVar.c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.a;
                    cVar.g = i7;
                    int i8 = cVar.c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    B2(uVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    public final View b2() {
        return j2(0, O());
    }

    public final View c2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return n2(uVar, zVar, 0, O(), zVar.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF d(int i) {
        if (O() == 0) {
            return null;
        }
        int i2 = (i < n0(N(0))) != this.x ? -1 : 1;
        return this.s == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void d1(RecyclerView.u uVar, RecyclerView.z zVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int q2;
        int i5;
        View H;
        int g;
        int i6;
        int i7 = -1;
        if (!(this.D == null && this.A == -1) && zVar.b() == 0) {
            q1(uVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.m;
        }
        Z1();
        this.t.a = false;
        G2();
        View a0 = a0();
        a aVar = this.E;
        if (!aVar.e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.d = this.x ^ this.y;
            N2(uVar, zVar, aVar2);
            this.E.e = true;
        } else if (a0 != null && (this.u.g(a0) >= this.u.i() || this.u.d(a0) <= this.u.m())) {
            this.E.c(a0, n0(a0));
        }
        c cVar = this.t;
        cVar.f = cVar.k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        S1(zVar, iArr);
        int max = Math.max(0, this.H[0]) + this.u.m();
        int max2 = Math.max(0, this.H[1]) + this.u.j();
        if (zVar.e() && (i5 = this.A) != -1 && this.B != Integer.MIN_VALUE && (H = H(i5)) != null) {
            if (this.x) {
                i6 = this.u.i() - this.u.d(H);
                g = this.B;
            } else {
                g = this.u.g(H) - this.u.m();
                i6 = this.B;
            }
            int i8 = i6 - g;
            if (i8 > 0) {
                max += i8;
            } else {
                max2 -= i8;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.d ? !this.x : this.x) {
            i7 = 1;
        }
        A2(uVar, zVar, aVar3, i7);
        B(uVar);
        this.t.m = F2();
        this.t.j = zVar.e();
        this.t.i = 0;
        a aVar4 = this.E;
        if (aVar4.d) {
            S2(aVar4);
            c cVar2 = this.t;
            cVar2.h = max;
            a2(uVar, cVar2, zVar, false);
            c cVar3 = this.t;
            i2 = cVar3.b;
            int i9 = cVar3.d;
            int i10 = cVar3.c;
            if (i10 > 0) {
                max2 += i10;
            }
            Q2(this.E);
            c cVar4 = this.t;
            cVar4.h = max2;
            cVar4.d += cVar4.e;
            a2(uVar, cVar4, zVar, false);
            c cVar5 = this.t;
            i = cVar5.b;
            int i11 = cVar5.c;
            if (i11 > 0) {
                R2(i9, i2);
                c cVar6 = this.t;
                cVar6.h = i11;
                a2(uVar, cVar6, zVar, false);
                i2 = this.t.b;
            }
        } else {
            Q2(aVar4);
            c cVar7 = this.t;
            cVar7.h = max2;
            a2(uVar, cVar7, zVar, false);
            c cVar8 = this.t;
            i = cVar8.b;
            int i12 = cVar8.d;
            int i13 = cVar8.c;
            if (i13 > 0) {
                max += i13;
            }
            S2(this.E);
            c cVar9 = this.t;
            cVar9.h = max;
            cVar9.d += cVar9.e;
            a2(uVar, cVar9, zVar, false);
            c cVar10 = this.t;
            i2 = cVar10.b;
            int i14 = cVar10.c;
            if (i14 > 0) {
                P2(i12, i);
                c cVar11 = this.t;
                cVar11.h = i14;
                a2(uVar, cVar11, zVar, false);
                i = this.t.b;
            }
        }
        if (O() > 0) {
            if (this.x ^ this.y) {
                int q22 = q2(i, uVar, zVar, true);
                i3 = i2 + q22;
                i4 = i + q22;
                q2 = r2(i3, uVar, zVar, false);
            } else {
                int r2 = r2(i2, uVar, zVar, true);
                i3 = i2 + r2;
                i4 = i + r2;
                q2 = q2(i4, uVar, zVar, false);
            }
            i2 = i3 + q2;
            i = i4 + q2;
        }
        z2(uVar, zVar, i2, i);
        if (zVar.e()) {
            this.E.e();
        } else {
            this.u.s();
        }
        this.v = this.y;
    }

    public View d2(boolean z, boolean z2) {
        return this.x ? k2(0, O(), z, z2) : k2(O() - 1, -1, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e1(RecyclerView.z zVar) {
        super.e1(zVar);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    public View e2(boolean z, boolean z2) {
        return this.x ? k2(O() - 1, -1, z, z2) : k2(0, O(), z, z2);
    }

    public int f2() {
        View k2 = k2(0, O(), false, true);
        if (k2 == null) {
            return -1;
        }
        return n0(k2);
    }

    public final View g2() {
        return j2(O() - 1, -1);
    }

    public final View h2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return n2(uVar, zVar, O() - 1, -1, zVar.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.D = (d) parcelable;
            z1();
        }
    }

    public int i2() {
        View k2 = k2(O() - 1, -1, false, true);
        if (k2 == null) {
            return -1;
        }
        return n0(k2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable j1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (O() > 0) {
            Z1();
            boolean z = this.v ^ this.x;
            dVar.o = z;
            if (z) {
                View s2 = s2();
                dVar.n = this.u.i() - this.u.d(s2);
                dVar.m = n0(s2);
            } else {
                View t2 = t2();
                dVar.m = n0(t2);
                dVar.n = this.u.g(t2) - this.u.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    public View j2(int i, int i2) {
        int i3;
        int i4;
        Z1();
        if (i2 <= i && i2 >= i) {
            return N(i);
        }
        if (this.u.g(N(i)) < this.u.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.s == 0 ? this.e.a(i, i2, i3, i4) : this.f.a(i, i2, i3, i4);
    }

    public View k2(int i, int i2, boolean z, boolean z2) {
        Z1();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.s == 0 ? this.e.a(i, i2, i3, i4) : this.f.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l(String str) {
        if (this.D == null) {
            super.l(str);
        }
    }

    public final View l2() {
        return this.x ? b2() : g2();
    }

    public final View m2() {
        return this.x ? g2() : b2();
    }

    public View n2(RecyclerView.u uVar, RecyclerView.z zVar, int i, int i2, int i3) {
        Z1();
        int m = this.u.m();
        int i4 = this.u.i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View N = N(i);
            int n0 = n0(N);
            if (n0 >= 0 && n0 < i3) {
                if (((RecyclerView.p) N.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = N;
                    }
                } else if (this.u.g(N) < i4 && this.u.d(N) >= m) {
                    return N;
                } else {
                    if (view == null) {
                        view = N;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    public final View o2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.x ? c2(uVar, zVar) : h2(uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p() {
        return this.s == 0;
    }

    public final View p2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.x ? h2(uVar, zVar) : c2(uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q() {
        return this.s == 1;
    }

    public final int q2(int i, RecyclerView.u uVar, RecyclerView.z zVar, boolean z) {
        int i2;
        int i3 = this.u.i() - i;
        if (i3 > 0) {
            int i4 = -H2(-i3, uVar, zVar);
            int i5 = i + i4;
            if (!z || (i2 = this.u.i() - i5) <= 0) {
                return i4;
            }
            this.u.r(i2);
            return i2 + i4;
        }
        return 0;
    }

    public final int r2(int i, RecyclerView.u uVar, RecyclerView.z zVar, boolean z) {
        int m;
        int m2 = i - this.u.m();
        if (m2 > 0) {
            int i2 = -H2(m2, uVar, zVar);
            int i3 = i + i2;
            if (!z || (m = i3 - this.u.m()) <= 0) {
                return i2;
            }
            this.u.r(-m);
            return i2 - m;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t(int i, int i2, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        if (this.s != 0) {
            i = i2;
        }
        if (O() == 0 || i == 0) {
            return;
        }
        Z1();
        O2(i > 0 ? 1 : -1, Math.abs(i), true, zVar);
        T1(zVar, this.t, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void u(int i, RecyclerView.o.c cVar) {
        boolean z;
        int i2;
        d dVar = this.D;
        if (dVar == null || !dVar.a()) {
            G2();
            z = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z = dVar2.o;
            i2 = dVar2.m;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.G && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    public int u2(RecyclerView.z zVar) {
        if (zVar.d()) {
            return this.u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return U1(zVar);
    }

    public int v2() {
        return this.s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.z zVar) {
        return V1(zVar);
    }

    public boolean w2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.z zVar) {
        return W1(zVar);
    }

    public boolean x2() {
        return this.z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.z zVar) {
        return U1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean y0() {
        return true;
    }

    public void y2(RecyclerView.u uVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int f;
        View d2 = cVar.d(uVar);
        if (d2 == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) d2.getLayoutParams();
        if (cVar.l == null) {
            if (this.x == (cVar.f == -1)) {
                i(d2);
            } else {
                j(d2, 0);
            }
        } else {
            if (this.x == (cVar.f == -1)) {
                g(d2);
            } else {
                h(d2, 0);
            }
        }
        G0(d2, 0, 0);
        bVar.a = this.u.e(d2);
        if (this.s == 1) {
            if (w2()) {
                f = u0() - k0();
                i4 = f - this.u.f(d2);
            } else {
                i4 = j0();
                f = this.u.f(d2) + i4;
            }
            if (cVar.f == -1) {
                int i5 = cVar.b;
                i3 = i5;
                i2 = f;
                i = i5 - bVar.a;
            } else {
                int i6 = cVar.b;
                i = i6;
                i2 = f;
                i3 = bVar.a + i6;
            }
        } else {
            int m0 = m0();
            int f2 = this.u.f(d2) + m0;
            if (cVar.f == -1) {
                int i7 = cVar.b;
                i2 = i7;
                i = m0;
                i3 = f2;
                i4 = i7 - bVar.a;
            } else {
                int i8 = cVar.b;
                i = m0;
                i2 = bVar.a + i8;
                i3 = f2;
                i4 = i8;
            }
        }
        F0(d2, i4, i, i2, i3);
        if (pVar.c() || pVar.b()) {
            bVar.c = true;
        }
        bVar.d = d2.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.z zVar) {
        return V1(zVar);
    }

    public final void z2(RecyclerView.u uVar, RecyclerView.z zVar, int i, int i2) {
        if (!zVar.g() || O() == 0 || zVar.e() || !R1()) {
            return;
        }
        List k = uVar.k();
        int size = k.size();
        int n0 = n0(N(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.c0 c0Var = (RecyclerView.c0) k.get(i5);
            if (!c0Var.v()) {
                if ((c0Var.m() < n0) != this.x) {
                    i3 += this.u.e(c0Var.a);
                } else {
                    i4 += this.u.e(c0Var.a);
                }
            }
        }
        this.t.l = k;
        if (i3 > 0) {
            R2(n0(t2()), i);
            c cVar = this.t;
            cVar.h = i3;
            cVar.c = 0;
            cVar.a();
            a2(uVar, this.t, zVar, false);
        }
        if (i4 > 0) {
            P2(n0(s2()), i2);
            c cVar2 = this.t;
            cVar2.h = i4;
            cVar2.c = 0;
            cVar2.a();
            a2(uVar, this.t, zVar, false);
        }
        this.t.l = null;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.o.d o0 = RecyclerView.o.o0(context, attributeSet, i, i2);
        I2(o0.a);
        J2(o0.c);
        K2(o0.d);
    }
}
