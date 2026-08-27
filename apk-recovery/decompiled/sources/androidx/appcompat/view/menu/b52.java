package androidx.appcompat.view.menu;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final class b52 implements Runnable {
    public final /* synthetic */ w32 m;
    public final /* synthetic */ k42 n;

    public b52(k42 k42Var, w32 w32Var) {
        this.n = k42Var;
        this.m = w32Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at1 at1Var;
        at1Var = this.n.d;
        if (at1Var == null) {
            this.n.l().G().a("Failed to send current screen to service");
            return;
        }
        try {
            w32 w32Var = this.m;
            if (w32Var == null) {
                at1Var.V1(0L, null, null, this.n.a().getPackageName());
            } else {
                at1Var.V1(w32Var.c, w32Var.a, w32Var.b, this.n.a().getPackageName());
            }
            this.n.g0();
        } catch (RemoteException e) {
            this.n.l().G().b("Failed to send current screen to the service", e);
        }
    }
}
