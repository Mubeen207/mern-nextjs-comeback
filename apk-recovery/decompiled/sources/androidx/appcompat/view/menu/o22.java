package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class o22 implements Runnable {
    public final /* synthetic */ AtomicReference m;
    public final /* synthetic */ g02 n;

    public o22(g02 g02Var, AtomicReference atomicReference) {
        this.n = g02Var;
        this.m = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.m) {
            try {
                this.m.set(Double.valueOf(this.n.e().o(this.n.p().F(), vi1.Q)));
                this.m.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
