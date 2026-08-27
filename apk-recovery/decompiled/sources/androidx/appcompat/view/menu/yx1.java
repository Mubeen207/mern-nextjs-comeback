package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class yx1 implements Runnable {
    public final /* synthetic */ lf1 m;
    public final /* synthetic */ nx1 n;

    public yx1(nx1 nx1Var, lf1 lf1Var) {
        this.n = nx1Var;
        this.m = lf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r82 r82Var;
        r82 r82Var2;
        r82 r82Var3;
        r82Var = this.n.l;
        r82Var.o0();
        if (this.m.o.d() == null) {
            r82Var3 = this.n.l;
            r82Var3.o(this.m);
            return;
        }
        r82Var2 = this.n.l;
        r82Var2.S(this.m);
    }
}
