package androidx.appcompat.view.menu;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class d92 implements Runnable {
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ Bundle o;
    public final /* synthetic */ f92 p;

    public d92(f92 f92Var, String str, String str2, Bundle bundle) {
        this.p = f92Var;
        this.m = str;
        this.n = str2;
        this.o = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.a.r((ri1) pj0.i(this.p.a.n0().G(this.m, this.n, this.o, "auto", this.p.a.b().a(), false, true)), this.m);
    }
}
