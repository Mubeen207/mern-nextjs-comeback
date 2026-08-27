package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class q42 implements Runnable {
    public final /* synthetic */ AtomicReference m;
    public final /* synthetic */ fb2 n;
    public final /* synthetic */ Bundle o;
    public final /* synthetic */ k42 p;

    public q42(k42 k42Var, AtomicReference atomicReference, fb2 fb2Var, Bundle bundle) {
        this.p = k42Var;
        this.m = atomicReference;
        this.n = fb2Var;
        this.o = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at1 at1Var;
        synchronized (this.m) {
            try {
                at1Var = this.p.d;
            } catch (RemoteException e) {
                this.p.l().G().b("Failed to get trigger URIs; remote exception", e);
                this.m.notify();
            }
            if (at1Var == null) {
                this.p.l().G().a("Failed to get trigger URIs; not connected to service");
                this.m.notify();
                return;
            }
            pj0.i(this.n);
            this.m.set(at1Var.s(this.n, this.o));
            this.p.g0();
            this.m.notify();
        }
    }
}
