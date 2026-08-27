package androidx.appcompat.view.menu;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final class j52 implements Runnable {
    public final /* synthetic */ fb2 m;
    public final /* synthetic */ k42 n;

    public j52(k42 k42Var, fb2 fb2Var) {
        this.n = k42Var;
        this.m = fb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at1 at1Var;
        at1Var = this.n.d;
        if (at1Var == null) {
            this.n.l().G().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            pj0.i(this.m);
            at1Var.i2(this.m);
            this.n.q().J();
            this.n.K(at1Var, null, this.m);
            this.n.g0();
        } catch (RemoteException e) {
            this.n.l().G().b("Failed to send app launch to the service", e);
        }
    }
}
