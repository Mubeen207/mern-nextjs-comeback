package androidx.appcompat.view.menu;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class iy1 implements Callable {
    public final /* synthetic */ fb2 a;
    public final /* synthetic */ nx1 b;

    public iy1(nx1 nx1Var, fb2 fb2Var) {
        this.b = nx1Var;
        this.a = fb2Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        r82 r82Var;
        r82 r82Var2;
        r82Var = this.b.l;
        r82Var.o0();
        r82Var2 = this.b.l;
        return new kg1(r82Var2.e(this.a.m));
    }
}
