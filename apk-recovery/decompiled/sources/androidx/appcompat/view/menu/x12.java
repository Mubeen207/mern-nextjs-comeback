package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class x12 implements Runnable {
    public final /* synthetic */ long m;
    public final /* synthetic */ g02 n;

    public x12(g02 g02Var, long j) {
        this.n = g02Var;
        this.m = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.E(this.m, true);
        this.n.t().Q(new AtomicReference());
    }
}
