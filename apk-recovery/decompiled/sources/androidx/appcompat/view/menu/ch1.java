package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ch1 implements Runnable {
    public final /* synthetic */ lz1 m;
    public final /* synthetic */ eh1 n;

    public ch1(eh1 eh1Var, lz1 lz1Var) {
        this.n = eh1Var;
        this.m = lz1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.m.d();
        if (pf1.a()) {
            this.m.h().D(this);
            return;
        }
        boolean e = this.n.e();
        this.n.c = 0L;
        if (e) {
            this.n.d();
        }
    }
}
