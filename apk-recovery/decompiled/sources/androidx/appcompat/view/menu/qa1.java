package androidx.appcompat.view.menu;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class qa1 implements vq {
    public final gl0 a;
    public final gl0 b;
    public final gl0 c;
    public final gl0 d;

    public qa1(gl0 gl0Var, gl0 gl0Var2, gl0 gl0Var3, gl0 gl0Var4) {
        this.a = gl0Var;
        this.b = gl0Var2;
        this.c = gl0Var3;
        this.d = gl0Var4;
    }

    public static qa1 a(gl0 gl0Var, gl0 gl0Var2, gl0 gl0Var3, gl0 gl0Var4) {
        return new qa1(gl0Var, gl0Var2, gl0Var3, gl0Var4);
    }

    public static pa1 c(Executor executor, gp gpVar, sa1 sa1Var, sy0 sy0Var) {
        return new pa1(executor, gpVar, sa1Var, sy0Var);
    }

    @Override // androidx.appcompat.view.menu.gl0
    /* renamed from: b */
    public pa1 get() {
        return c((Executor) this.a.get(), (gp) this.b.get(), (sa1) this.c.get(), (sy0) this.d.get());
    }
}
