package androidx.appcompat.view.menu;

import android.os.RemoteException;
/* loaded from: classes.dex */
public final class q52 implements Runnable {
    public final /* synthetic */ ri1 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ km1 o;
    public final /* synthetic */ k42 p;

    public q52(k42 k42Var, ri1 ri1Var, String str, km1 km1Var) {
        this.p = k42Var;
        this.m = ri1Var;
        this.n = str;
        this.o = km1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at1 at1Var;
        try {
            at1Var = this.p.d;
            if (at1Var == null) {
                this.p.l().G().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] E1 = at1Var.E1(this.m, this.n);
            this.p.g0();
            this.p.j().U(this.o, E1);
        } catch (RemoteException e) {
            this.p.l().G().b("Failed to send event to the service to bundle", e);
        } finally {
            this.p.j().U(this.o, null);
        }
    }
}
