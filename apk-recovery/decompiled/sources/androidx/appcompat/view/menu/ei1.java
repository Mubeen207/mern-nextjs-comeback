package androidx.appcompat.view.menu;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class ei1 extends Thread {
    public final WeakReference m;
    public final long n;
    public final CountDownLatch o = new CountDownLatch(1);
    public boolean p = false;

    public ei1(y1 y1Var, long j) {
        this.m = new WeakReference(y1Var);
        this.n = j;
        start();
    }

    public final void a() {
        y1 y1Var = (y1) this.m.get();
        if (y1Var != null) {
            y1Var.c();
            this.p = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.o.await(this.n, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
