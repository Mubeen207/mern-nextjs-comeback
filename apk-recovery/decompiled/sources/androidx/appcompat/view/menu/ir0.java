package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ir0 implements vq {
    public final gl0 a;
    public final gl0 b;
    public final gl0 c;
    public final gl0 d;
    public final gl0 e;

    public ir0(gl0 gl0Var, gl0 gl0Var2, gl0 gl0Var3, gl0 gl0Var4, gl0 gl0Var5) {
        this.a = gl0Var;
        this.b = gl0Var2;
        this.c = gl0Var3;
        this.d = gl0Var4;
        this.e = gl0Var5;
    }

    public static ir0 a(gl0 gl0Var, gl0 gl0Var2, gl0 gl0Var3, gl0 gl0Var4, gl0 gl0Var5) {
        return new ir0(gl0Var, gl0Var2, gl0Var3, gl0Var4, gl0Var5);
    }

    public static hr0 c(ec ecVar, ec ecVar2, Object obj, Object obj2, gl0 gl0Var) {
        return new hr0(ecVar, ecVar2, (hp) obj, (js0) obj2, gl0Var);
    }

    @Override // androidx.appcompat.view.menu.gl0
    /* renamed from: b */
    public hr0 get() {
        return c((ec) this.a.get(), (ec) this.b.get(), this.c.get(), this.d.get(), this.e);
    }
}
