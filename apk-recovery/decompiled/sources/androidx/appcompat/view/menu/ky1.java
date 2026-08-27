package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ky1 implements Runnable {
    public final /* synthetic */ fb2 m;
    public final /* synthetic */ nx1 n;

    public ky1(nx1 nx1Var, fb2 fb2Var) {
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
        fb2 fb2Var = this.m;
        r82Var2.h().n();
        r82Var2.p0();
        pj0.e(fb2Var.m);
        oz1 f = oz1.f(fb2Var.H, (qa2.a() && r82Var2.c0().s(vi1.T0)) ? fb2Var.M : 100);
        oz1 Q = r82Var2.Q(fb2Var.m);
        r82Var2.l().K().c("Setting consent, package, consent", fb2Var.m, f);
        r82Var2.C(fb2Var.m, f);
        if (f.t(Q)) {
            r82Var2.b0(fb2Var);
        }
        if (qa2.a() && r82Var2.c0().s(vi1.T0)) {
            ih1 c = ih1.c(fb2Var.N);
            if (ih1.f.equals(c)) {
                return;
            }
            r82Var2.l().K().c("Setting DMA consent. package, consent", fb2Var.m, c);
            r82Var2.A(fb2Var.m, c);
        }
    }
}
