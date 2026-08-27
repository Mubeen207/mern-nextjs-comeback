package androidx.appcompat.view.menu;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class cz1 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ nx1 b;

    public cz1(nx1 nx1Var, String str) {
        this.b = nx1Var;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        r82 r82Var;
        r82 r82Var2;
        r82Var = this.b.l;
        r82Var.o0();
        r82Var2 = this.b.l;
        return r82Var2.e0().M0(this.a);
    }
}
