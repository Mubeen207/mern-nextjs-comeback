package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class p21 implements vq {
    public final gl0 a;
    public final gl0 b;
    public final gl0 c;
    public final gl0 d;
    public final gl0 e;

    public p21(gl0 gl0Var, gl0 gl0Var2, gl0 gl0Var3, gl0 gl0Var4, gl0 gl0Var5) {
        this.a = gl0Var;
        this.b = gl0Var2;
        this.c = gl0Var3;
        this.d = gl0Var4;
        this.e = gl0Var5;
    }

    public static p21 a(gl0 gl0Var, gl0 gl0Var2, gl0 gl0Var3, gl0 gl0Var4, gl0 gl0Var5) {
        return new p21(gl0Var, gl0Var2, gl0Var3, gl0Var4, gl0Var5);
    }

    public static n21 c(ec ecVar, ec ecVar2, wr0 wr0Var, l41 l41Var, pa1 pa1Var) {
        return new n21(ecVar, ecVar2, wr0Var, l41Var, pa1Var);
    }

    @Override // androidx.appcompat.view.menu.gl0
    /* renamed from: b */
    public n21 get() {
        return c((ec) this.a.get(), (ec) this.b.get(), (wr0) this.c.get(), (l41) this.d.get(), (pa1) this.e.get());
    }
}
