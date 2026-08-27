package androidx.appcompat.view.menu;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class w52 implements Runnable {
    public final /* synthetic */ AtomicReference m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ fb2 q;
    public final /* synthetic */ k42 r;

    public w52(k42 k42Var, AtomicReference atomicReference, String str, String str2, String str3, fb2 fb2Var) {
        this.r = k42Var;
        this.m = atomicReference;
        this.n = str;
        this.o = str2;
        this.p = str3;
        this.q = fb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at1 at1Var;
        synchronized (this.m) {
            try {
                at1Var = this.r.d;
            } catch (RemoteException e) {
                this.r.l().G().d("(legacy) Failed to get conditional properties; remote exception", st1.v(this.n), this.o, e);
                this.m.set(Collections.emptyList());
                this.m.notify();
            }
            if (at1Var == null) {
                this.r.l().G().d("(legacy) Failed to get conditional properties; not connected to service", st1.v(this.n), this.o, this.p);
                this.m.set(Collections.emptyList());
                this.m.notify();
                return;
            }
            if (TextUtils.isEmpty(this.n)) {
                pj0.i(this.q);
                this.m.set(at1Var.o0(this.o, this.p, this.q));
            } else {
                this.m.set(at1Var.Z1(this.n, this.o, this.p));
            }
            this.r.g0();
            this.m.notify();
        }
    }
}
