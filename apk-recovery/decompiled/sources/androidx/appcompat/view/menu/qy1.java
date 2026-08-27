package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class qy1 implements Runnable {
    public final /* synthetic */ y92 m;
    public final /* synthetic */ fb2 n;
    public final /* synthetic */ nx1 o;

    public qy1(nx1 nx1Var, y92 y92Var, fb2 fb2Var) {
        this.o = nx1Var;
        this.m = y92Var;
        this.n = fb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r82 r82Var;
        r82 r82Var2;
        r82 r82Var3;
        r82Var = this.o.l;
        r82Var.o0();
        if (this.m.d() == null) {
            r82Var3 = this.o.l;
            r82Var3.E(this.m.n, this.n);
            return;
        }
        r82Var2 = this.o.l;
        r82Var2.x(this.m, this.n);
    }
}
