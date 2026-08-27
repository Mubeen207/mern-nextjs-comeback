package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class h12 implements Runnable {
    public final /* synthetic */ boolean m;
    public final /* synthetic */ g02 n;

    public h12(g02 g02Var, boolean z) {
        this.n = g02Var;
        this.m = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean p = this.n.a.p();
        boolean o = this.n.a.o();
        this.n.a.m(this.m);
        if (o == this.m) {
            this.n.a.l().K().b("Default data collection state already set to", Boolean.valueOf(this.m));
        }
        if (this.n.a.p() == p || this.n.a.p() != this.n.a.o()) {
            this.n.a.l().M().c("Default data collection is different than actual status", Boolean.valueOf(this.m), Boolean.valueOf(p));
        }
        this.n.t0();
    }
}
