package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class f12 implements Runnable {
    public final /* synthetic */ AtomicReference m;
    public final /* synthetic */ g02 n;

    public f12(g02 g02Var, AtomicReference atomicReference) {
        this.n = g02Var;
        this.m = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.m) {
            try {
                this.m.set(Boolean.valueOf(this.n.e().J(this.n.p().F())));
                this.m.notify();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
