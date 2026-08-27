package androidx.appcompat.view.menu;

import android.os.RemoteException;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class y52 implements Runnable {
    public final /* synthetic */ boolean m = true;
    public final /* synthetic */ fb2 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ lf1 p;
    public final /* synthetic */ lf1 q;
    public final /* synthetic */ k42 r;

    public y52(k42 k42Var, boolean z, fb2 fb2Var, boolean z2, lf1 lf1Var, lf1 lf1Var2) {
        this.r = k42Var;
        this.n = fb2Var;
        this.o = z2;
        this.p = lf1Var;
        this.q = lf1Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at1 at1Var;
        at1Var = this.r.d;
        if (at1Var == null) {
            this.r.l().G().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.m) {
            pj0.i(this.n);
            this.r.K(at1Var, this.o ? null : this.p, this.n);
        } else {
            try {
                if (TextUtils.isEmpty(this.q.m)) {
                    pj0.i(this.n);
                    at1Var.o(this.p, this.n);
                } else {
                    at1Var.I(this.p);
                }
            } catch (RemoteException e) {
                this.r.l().G().b("Failed to send conditional user property to the service", e);
            }
        }
        this.r.g0();
    }
}
