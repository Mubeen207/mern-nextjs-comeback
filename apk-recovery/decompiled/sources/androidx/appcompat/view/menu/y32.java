package androidx.appcompat.view.menu;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class y32 implements Runnable {
    public final /* synthetic */ Bundle m;
    public final /* synthetic */ w32 n;
    public final /* synthetic */ w32 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ u32 q;

    public y32(u32 u32Var, Bundle bundle, w32 w32Var, w32 w32Var2, long j) {
        this.q = u32Var;
        this.m = bundle;
        this.n = w32Var;
        this.o = w32Var2;
        this.p = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u32.J(this.q, this.m, this.n, this.o, this.p);
    }
}
