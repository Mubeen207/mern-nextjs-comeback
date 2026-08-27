package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class sx1 implements Runnable {
    public final /* synthetic */ lf1 m;
    public final /* synthetic */ fb2 n;
    public final /* synthetic */ nx1 o;

    public sx1(nx1 nx1Var, lf1 lf1Var, fb2 fb2Var) {
        this.o = nx1Var;
        this.m = lf1Var;
        this.n = fb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r82 r82Var;
        r82 r82Var2;
        r82 r82Var3;
        r82Var = this.o.l;
        r82Var.o0();
        if (this.m.o.d() == null) {
            r82Var3 = this.o.l;
            r82Var3.p(this.m, this.n);
            return;
        }
        r82Var2 = this.o.l;
        r82Var2.T(this.m, this.n);
    }
}
