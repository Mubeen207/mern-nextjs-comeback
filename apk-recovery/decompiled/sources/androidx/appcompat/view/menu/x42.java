package androidx.appcompat.view.menu;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final class x42 implements Runnable {
    public final /* synthetic */ fb2 m;
    public final /* synthetic */ km1 n;
    public final /* synthetic */ k42 o;

    public x42(k42 k42Var, fb2 fb2Var, km1 km1Var) {
        this.o = k42Var;
        this.m = fb2Var;
        this.n = km1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at1 at1Var;
        try {
            if (!this.o.i().J().y()) {
                this.o.l().M().a("Analytics storage consent denied; will not get app instance id");
                this.o.r().T(null);
                this.o.i().g.b(null);
                return;
            }
            at1Var = this.o.d;
            if (at1Var == null) {
                this.o.l().G().a("Failed to get app instance id");
                return;
            }
            pj0.i(this.m);
            String P1 = at1Var.P1(this.m);
            if (P1 != null) {
                this.o.r().T(P1);
                this.o.i().g.b(P1);
            }
            this.o.g0();
            this.o.j().R(this.n, P1);
        } catch (RemoteException e) {
            this.o.l().G().b("Failed to get app instance id", e);
        } finally {
            this.o.j().R(this.n, null);
        }
    }
}
