package androidx.appcompat.view.menu;

import android.os.RemoteException;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class s52 implements Runnable {
    public final /* synthetic */ boolean m;
    public final /* synthetic */ fb2 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ ri1 p;
    public final /* synthetic */ String q;
    public final /* synthetic */ k42 r;

    public s52(k42 k42Var, boolean z, fb2 fb2Var, boolean z2, ri1 ri1Var, String str) {
        this.r = k42Var;
        this.m = z;
        this.n = fb2Var;
        this.o = z2;
        this.p = ri1Var;
        this.q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at1 at1Var;
        at1Var = this.r.d;
        if (at1Var == null) {
            this.r.l().G().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.m) {
            pj0.i(this.n);
            this.r.K(at1Var, this.o ? null : this.p, this.n);
        } else {
            try {
                if (TextUtils.isEmpty(this.q)) {
                    pj0.i(this.n);
                    at1Var.g0(this.p, this.n);
                } else {
                    at1Var.A(this.p, this.q, this.r.l().O());
                }
            } catch (RemoteException e) {
                this.r.l().G().b("Failed to send event to the service", e);
            }
        }
        this.r.g0();
    }
}
