package androidx.appcompat.view.menu;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes.dex */
public final class vp extends up implements sk {
    public final Executor p;

    public vp(Executor executor) {
        this.p = executor;
        xe.a(G());
    }

    @Override // androidx.appcompat.view.menu.nh
    public void A(kh khVar, Runnable runnable) {
        try {
            Executor G = G();
            w.a();
            G.execute(runnable);
        } catch (RejectedExecutionException e) {
            w.a();
            F(khVar, e);
            fm.b().A(khVar, runnable);
        }
    }

    public final void F(kh khVar, RejectedExecutionException rejectedExecutionException) {
        a70.c(khVar, np.a("The task was rejected", rejectedExecutionException));
    }

    public Executor G() {
        return this.p;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor G = G();
        ExecutorService executorService = G instanceof ExecutorService ? (ExecutorService) G : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof vp) && ((vp) obj).G() == G();
    }

    public int hashCode() {
        return System.identityHashCode(G());
    }

    @Override // androidx.appcompat.view.menu.nh
    public String toString() {
        return G().toString();
    }
}
