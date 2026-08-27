package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class v42 implements Runnable {
    public final /* synthetic */ fb2 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ y92 o;
    public final /* synthetic */ k42 p;

    public v42(k42 k42Var, fb2 fb2Var, boolean z, y92 y92Var) {
        this.p = k42Var;
        this.m = fb2Var;
        this.n = z;
        this.o = y92Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at1 at1Var;
        at1Var = this.p.d;
        if (at1Var == null) {
            this.p.l().G().a("Discarding data. Failed to set user property");
            return;
        }
        pj0.i(this.m);
        this.p.K(at1Var, this.n ? null : this.o, this.m);
        this.p.g0();
    }
}
