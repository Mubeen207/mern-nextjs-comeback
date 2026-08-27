package androidx.appcompat.view.menu;

import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class sz1 implements g92 {
    public final mz1 a;

    public sz1(mz1 mz1Var) {
        mz1 mz1Var2 = (mz1) y02.f(mz1Var, "output");
        this.a = mz1Var2;
        mz1Var2.a = this;
    }

    public static sz1 P(mz1 mz1Var) {
        sz1 sz1Var = mz1Var.a;
        return sz1Var != null ? sz1Var : new sz1(mz1Var);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void A(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.q0(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.V(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += mz1.j0(((Long) list.get(i4)).longValue());
        }
        this.a.U(i3);
        while (i2 < list.size()) {
            this.a.r0(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void B(int i, long j) {
        this.a.q0(i, j);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void C(int i, List list, m52 m52Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            u(i, list.get(i2), m52Var);
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void D(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.I(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        this.a.V(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += mz1.c(((Double) list.get(i4)).doubleValue());
        }
        this.a.U(i3);
        while (i2 < list.size()) {
            this.a.F(((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void E(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.J(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        this.a.V(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += mz1.d(((Float) list.get(i4)).floatValue());
        }
        this.a.U(i3);
        while (i2 < list.size()) {
            this.a.G(((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void F(int i, String str) {
        this.a.q(i, str);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void G(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.V(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += mz1.f0(((Long) list.get(i4)).longValue());
        }
        this.a.U(i3);
        while (i2 < list.size()) {
            this.a.s(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void H(int i, int i2) {
        this.a.y0(i, i2);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void I(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.y0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.V(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += mz1.o0(((Integer) list.get(i4)).intValue());
        }
        this.a.U(i3);
        while (i2 < list.size()) {
            this.a.x0(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void J(int i, long j) {
        this.a.L(i, j);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void K(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.a.n(i, (tx1) list.get(i2));
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void L(int i, int i2) {
        this.a.K(i, i2);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void M(int i, long j) {
        this.a.m(i, j);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void N(int i, double d) {
        this.a.I(i, d);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void O(int i, float f) {
        this.a.J(i, f);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final int a() {
        return m92.a;
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void b(int i, List list, m52 m52Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            m(i, list.get(i2), m52Var);
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void c(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.m(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.V(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += mz1.S(((Long) list.get(i4)).longValue());
        }
        this.a.U(i3);
        while (i2 < list.size()) {
            this.a.s(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void d(int i, boolean z) {
        this.a.r(i, z);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void e(int i) {
        this.a.V(i, 4);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void f(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.l(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.V(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += mz1.k0(((Integer) list.get(i4)).intValue());
        }
        this.a.U(i3);
        while (i2 < list.size()) {
            this.a.k(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void g(int i, int i2) {
        this.a.b0(i, i2);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void h(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.L(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.V(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += mz1.n0(((Long) list.get(i4)).longValue());
        }
        this.a.U(i3);
        while (i2 < list.size()) {
            this.a.N(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void i(int i, long j) {
        this.a.L(i, j);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void j(int i) {
        this.a.V(i, 3);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void k(int i, int i2) {
        this.a.l(i, i2);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void l(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.r(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.a.V(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += mz1.h(((Boolean) list.get(i4)).booleanValue());
        }
        this.a.U(i3);
        while (i2 < list.size()) {
            this.a.O(((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void m(int i, Object obj, m52 m52Var) {
        mz1 mz1Var = this.a;
        mz1Var.V(i, 3);
        m52Var.g((z32) obj, mz1Var.a);
        mz1Var.V(i, 4);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void n(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.l(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.V(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += mz1.c0(((Integer) list.get(i4)).intValue());
        }
        this.a.U(i3);
        while (i2 < list.size()) {
            this.a.k(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void o(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.L(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.a.V(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += mz1.a0(((Long) list.get(i4)).longValue());
        }
        this.a.U(i3);
        while (i2 < list.size()) {
            this.a.N(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void p(int i, p32 p32Var, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.a.V(i, 2);
            this.a.U(j32.a(p32Var, entry.getKey(), entry.getValue()));
            j32.b(this.a, p32Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void q(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.b0(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.V(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += mz1.v0(((Integer) list.get(i4)).intValue());
        }
        this.a.U(i3);
        while (i2 < list.size()) {
            this.a.U(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void r(int i, int i2) {
        this.a.K(i, i2);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void s(int i, long j) {
        this.a.m(i, j);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void t(int i, Object obj) {
        if (obj instanceof tx1) {
            this.a.M(i, (tx1) obj);
        } else {
            this.a.o(i, (z32) obj);
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void u(int i, Object obj, m52 m52Var) {
        this.a.p(i, (z32) obj, m52Var);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void v(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.K(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.V(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += mz1.X(((Integer) list.get(i4)).intValue());
        }
        this.a.U(i3);
        while (i2 < list.size()) {
            this.a.H(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void w(int i, List list, boolean z) {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.a.K(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.a.V(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += mz1.g0(((Integer) list.get(i4)).intValue());
        }
        this.a.U(i3);
        while (i2 < list.size()) {
            this.a.H(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void x(int i, tx1 tx1Var) {
        this.a.n(i, tx1Var);
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void y(int i, List list) {
        int i2 = 0;
        if (!(list instanceof f22)) {
            while (i2 < list.size()) {
                this.a.q(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        f22 f22Var = (f22) list;
        while (i2 < list.size()) {
            Object j = f22Var.j(i2);
            if (j instanceof String) {
                this.a.q(i, (String) j);
            } else {
                this.a.n(i, (tx1) j);
            }
            i2++;
        }
    }

    @Override // androidx.appcompat.view.menu.g92
    public final void z(int i, int i2) {
        this.a.l(i, i2);
    }
}
