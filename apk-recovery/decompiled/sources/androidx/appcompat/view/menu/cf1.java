package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class cf1 extends gf1 {
    public vq1 g;
    public final /* synthetic */ ze2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf1(ze2 ze2Var, String str, int i, vq1 vq1Var) {
        super(str, i);
        this.h = ze2Var;
        this.g = vq1Var;
    }

    @Override // androidx.appcompat.view.menu.gf1
    public final int a() {
        return this.g.j();
    }

    @Override // androidx.appcompat.view.menu.gf1
    public final boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.gf1
    public final boolean j() {
        return true;
    }

    public final boolean k(Long l, Long l2, ws1 ws1Var, boolean z) {
        Object[] objArr = (jb2.a() && this.h.e().D(this.a, vi1.h0)) ? 1 : null;
        boolean M = this.g.M();
        boolean N = this.g.N();
        boolean O = this.g.O();
        Object[] objArr2 = (M || N || O) ? 1 : null;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z && objArr2 == null) {
            this.h.l().K().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), this.g.P() ? Integer.valueOf(this.g.j()) : null);
            return true;
        }
        tq1 I = this.g.I();
        boolean N2 = I.N();
        if (ws1Var.d0()) {
            if (I.P()) {
                bool = gf1.d(gf1.c(ws1Var.U(), I.K()), N2);
            } else {
                this.h.l().L().b("No number filter for long property. property", this.h.g().g(ws1Var.Z()));
            }
        } else if (ws1Var.b0()) {
            if (I.P()) {
                bool = gf1.d(gf1.b(ws1Var.G(), I.K()), N2);
            } else {
                this.h.l().L().b("No number filter for double property. property", this.h.g().g(ws1Var.Z()));
            }
        } else if (!ws1Var.f0()) {
            this.h.l().L().b("User property has no value, property", this.h.g().g(ws1Var.Z()));
        } else if (I.R()) {
            bool = gf1.d(gf1.g(ws1Var.a0(), I.L(), this.h.l()), N2);
        } else if (!I.P()) {
            this.h.l().L().b("No string or number filter defined. property", this.h.g().g(ws1Var.Z()));
        } else if (l92.f0(ws1Var.a0())) {
            bool = gf1.d(gf1.e(ws1Var.a0(), I.K()), N2);
        } else {
            this.h.l().L().c("Invalid user property value for Numeric number filter. property, value", this.h.g().g(ws1Var.Z()), ws1Var.a0());
        }
        this.h.l().K().b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (!O || bool.booleanValue()) {
            if (!z || this.g.M()) {
                this.d = bool;
            }
            if (bool.booleanValue() && objArr2 != null && ws1Var.e0()) {
                long W = ws1Var.W();
                if (l != null) {
                    W = l.longValue();
                }
                if (objArr != null && this.g.M() && !this.g.N() && l2 != null) {
                    W = l2.longValue();
                }
                if (this.g.N()) {
                    this.f = Long.valueOf(W);
                } else {
                    this.e = Long.valueOf(W);
                }
            }
            return true;
        }
        return true;
    }
}
