package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ey1 implements Runnable {
    public final /* synthetic */ fb2 m;
    public final /* synthetic */ nx1 n;

    public ey1(nx1 nx1Var, fb2 fb2Var) {
        this.n = nx1Var;
        this.m = fb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r82 r82Var;
        r82 r82Var2;
        r82Var = this.n.l;
        r82Var.o0();
        r82Var2 = this.n.l;
        r82Var2.b0(this.m);
    }
}
