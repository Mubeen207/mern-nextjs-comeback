package androidx.appcompat.view.menu;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class z42 implements Runnable {
    public final /* synthetic */ AtomicReference m;
    public final /* synthetic */ fb2 n;
    public final /* synthetic */ k42 o;

    public z42(k42 k42Var, AtomicReference atomicReference, fb2 fb2Var) {
        this.o = k42Var;
        this.m = atomicReference;
        this.n = fb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at1 at1Var;
        synchronized (this.m) {
            try {
            } catch (RemoteException e) {
                this.o.l().G().b("Failed to get app instance id", e);
                this.m.notify();
            }
            if (!this.o.i().J().y()) {
                this.o.l().M().a("Analytics storage consent denied; will not get app instance id");
                this.o.r().T(null);
                this.o.i().g.b(null);
                this.m.set(null);
                this.m.notify();
                return;
            }
            at1Var = this.o.d;
            if (at1Var == null) {
                this.o.l().G().a("Failed to get app instance id");
                this.m.notify();
                return;
            }
            pj0.i(this.n);
            this.m.set(at1Var.P1(this.n));
            String str = (String) this.m.get();
            if (str != null) {
                this.o.r().T(str);
                this.o.i().g.b(str);
            }
            this.o.g0();
            this.m.notify();
        }
    }
}
