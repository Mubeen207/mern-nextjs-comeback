package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class w12 implements Runnable {
    public final /* synthetic */ AtomicReference m;
    public final /* synthetic */ g02 n;

    public w12(g02 g02Var, AtomicReference atomicReference) {
        this.n = g02Var;
        this.m = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.m) {
            try {
                this.m.set(this.n.e().H(this.n.p().F()));
                this.m.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
