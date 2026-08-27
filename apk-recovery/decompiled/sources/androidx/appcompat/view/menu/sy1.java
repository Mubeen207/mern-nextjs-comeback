package androidx.appcompat.view.menu;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class sy1 implements Callable {
    public final /* synthetic */ ri1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ nx1 c;

    public sy1(nx1 nx1Var, ri1 ri1Var, String str) {
        this.c = nx1Var;
        this.a = ri1Var;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        r82 r82Var;
        r82 r82Var2;
        r82Var = this.c.l;
        r82Var.o0();
        r82Var2 = this.c.l;
        return r82Var2.j0().y(this.a, this.b);
    }
}
