package androidx.appcompat.view.menu;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final class t42 implements Runnable {
    public final /* synthetic */ fb2 m;
    public final /* synthetic */ k42 n;

    public t42(k42 k42Var, fb2 fb2Var) {
        this.n = k42Var;
        this.m = fb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at1 at1Var;
        at1Var = this.n.d;
        if (at1Var == null) {
            this.n.l().G().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            pj0.i(this.m);
            at1Var.S(this.m);
        } catch (RemoteException e) {
            this.n.l().G().b("Failed to reset data on the service: remote exception", e);
        }
        this.n.g0();
    }
}
