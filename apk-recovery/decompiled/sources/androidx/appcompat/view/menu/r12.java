package androidx.appcompat.view.menu;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class r12 implements Runnable {
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ long o;
    public final /* synthetic */ Bundle p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ String t;
    public final /* synthetic */ g02 u;

    public r12(g02 g02Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.u = g02Var;
        this.m = str;
        this.n = str2;
        this.o = j;
        this.p = bundle;
        this.q = z;
        this.r = z2;
        this.s = z3;
        this.t = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.u.V(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t);
    }
}
