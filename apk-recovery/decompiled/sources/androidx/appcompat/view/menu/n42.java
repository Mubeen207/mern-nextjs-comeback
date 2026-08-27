package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class n42 implements Runnable {
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ fb2 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ km1 q;
    public final /* synthetic */ k42 r;

    public n42(k42 k42Var, String str, String str2, fb2 fb2Var, boolean z, km1 km1Var) {
        this.r = k42Var;
        this.m = str;
        this.n = str2;
        this.o = fb2Var;
        this.p = z;
        this.q = km1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at1 at1Var;
        Bundle bundle = new Bundle();
        try {
            at1Var = this.r.d;
            if (at1Var == null) {
                this.r.l().G().c("Failed to get user properties; not connected to service", this.m, this.n);
                return;
            }
            pj0.i(this.o);
            Bundle F = aa2.F(at1Var.m1(this.m, this.n, this.p, this.o));
            this.r.g0();
            this.r.j().Q(this.q, F);
        } catch (RemoteException e) {
            this.r.l().G().c("Failed to get user properties; remote exception", this.m, e);
        } finally {
            this.r.j().Q(this.q, bundle);
        }
    }
}
