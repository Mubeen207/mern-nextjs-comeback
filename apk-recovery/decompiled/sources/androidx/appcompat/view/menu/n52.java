package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class n52 implements Runnable {
    public final /* synthetic */ fb2 m;
    public final /* synthetic */ Bundle n;
    public final /* synthetic */ k42 o;

    public n52(k42 k42Var, fb2 fb2Var, Bundle bundle) {
        this.o = k42Var;
        this.m = fb2Var;
        this.n = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at1 at1Var;
        at1Var = this.o.d;
        if (at1Var == null) {
            this.o.l().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            pj0.i(this.m);
            at1Var.G0(this.n, this.m);
        } catch (RemoteException e) {
            this.o.l().G().b("Failed to send default event parameters to service", e);
        }
    }
}
