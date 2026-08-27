package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.IBinder;
/* loaded from: classes.dex */
public final class xm1 extends af1 {
    public z7 l;
    public final int m;

    public xm1(z7 z7Var, int i) {
        this.l = z7Var;
        this.m = i;
    }

    @Override // androidx.appcompat.view.menu.k10
    public final void j0(int i, IBinder iBinder, a12 a12Var) {
        z7 z7Var = this.l;
        pj0.j(z7Var, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        pj0.i(a12Var);
        z7.c0(z7Var, a12Var);
        t2(i, iBinder, a12Var.m);
    }

    @Override // androidx.appcompat.view.menu.k10
    public final void o1(int i, Bundle bundle) {
        new Exception();
    }

    @Override // androidx.appcompat.view.menu.k10
    public final void t2(int i, IBinder iBinder, Bundle bundle) {
        pj0.j(this.l, "onPostInitComplete can be called only once per call to getRemoteService");
        this.l.N(i, iBinder, bundle, this.m);
        this.l = null;
    }
}
