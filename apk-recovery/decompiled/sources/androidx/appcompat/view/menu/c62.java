package androidx.appcompat.view.menu;

import android.os.RemoteException;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class c62 implements Runnable {
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ fb2 o;
    public final /* synthetic */ km1 p;
    public final /* synthetic */ k42 q;

    public c62(k42 k42Var, String str, String str2, fb2 fb2Var, km1 km1Var) {
        this.q = k42Var;
        this.m = str;
        this.n = str2;
        this.o = fb2Var;
        this.p = km1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at1 at1Var;
        ArrayList arrayList = new ArrayList();
        try {
            at1Var = this.q.d;
            if (at1Var == null) {
                this.q.l().G().c("Failed to get conditional properties; not connected to service", this.m, this.n);
                return;
            }
            pj0.i(this.o);
            ArrayList t0 = aa2.t0(at1Var.o0(this.m, this.n, this.o));
            this.q.g0();
            this.q.j().S(this.p, t0);
        } catch (RemoteException e) {
            this.q.l().G().d("Failed to get conditional properties; remote exception", this.m, this.n, e);
        } finally {
            this.q.j().S(this.p, arrayList);
        }
    }
}
