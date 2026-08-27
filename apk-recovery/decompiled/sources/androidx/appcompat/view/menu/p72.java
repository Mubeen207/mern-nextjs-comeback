package androidx.appcompat.view.menu;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class p72 implements Runnable {
    public long m;
    public long n;
    public final /* synthetic */ r72 o;

    public p72(r72 r72Var, long j, long j2) {
        this.o = r72Var;
        this.m = j;
        this.n = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.o.b.h().D(new Runnable() { // from class: androidx.appcompat.view.menu.v72
            @Override // java.lang.Runnable
            public final void run() {
                p72 p72Var = p72.this;
                r72 r72Var = p72Var.o;
                long j = p72Var.m;
                long j2 = p72Var.n;
                r72Var.b.n();
                r72Var.b.l().F().a("Application going to the background");
                r72Var.b.i().s.a(true);
                r72Var.b.D(true);
                if (!r72Var.b.e().Q()) {
                    r72Var.b.f.e(j2);
                    r72Var.b.E(false, false, j2);
                }
                if (bd2.a() && r72Var.b.e().s(vi1.K0)) {
                    r72Var.b.l().J().b("Application backgrounded at: timestamp_millis", Long.valueOf(j));
                } else {
                    r72Var.b.r().U("auto", "_ab", j, new Bundle());
                }
            }
        });
    }
}
