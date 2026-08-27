package androidx.appcompat.view.menu;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class zj implements vq {
    public final gl0 a;
    public final gl0 b;
    public final gl0 c;
    public final gl0 d;
    public final gl0 e;

    public zj(gl0 gl0Var, gl0 gl0Var2, gl0 gl0Var3, gl0 gl0Var4, gl0 gl0Var5) {
        this.a = gl0Var;
        this.b = gl0Var2;
        this.c = gl0Var3;
        this.d = gl0Var4;
        this.e = gl0Var5;
    }

    public static zj a(gl0 gl0Var, gl0 gl0Var2, gl0 gl0Var3, gl0 gl0Var4, gl0 gl0Var5) {
        return new zj(gl0Var, gl0Var2, gl0Var3, gl0Var4, gl0Var5);
    }

    public static yj c(Executor executor, r7 r7Var, sa1 sa1Var, gp gpVar, sy0 sy0Var) {
        return new yj(executor, r7Var, sa1Var, gpVar, sy0Var);
    }

    @Override // androidx.appcompat.view.menu.gl0
    /* renamed from: b */
    public yj get() {
        return c((Executor) this.a.get(), (r7) this.b.get(), (sa1) this.c.get(), (gp) this.d.get(), (sy0) this.e.get());
    }
}
