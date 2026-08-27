package androidx.appcompat.view.menu;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class tj extends up implements Executor {
    public static final tj p = new tj();
    public static final nh q;

    static {
        int a;
        int e;
        v31 v31Var = v31.o;
        a = xn0.a(64, wy0.a());
        e = yy0.e("kotlinx.coroutines.io.parallelism", a, 0, 0, 12, null);
        q = v31Var.E(e);
    }

    @Override // androidx.appcompat.view.menu.nh
    public void A(kh khVar, Runnable runnable) {
        q.A(khVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        A(bo.m, runnable);
    }

    @Override // androidx.appcompat.view.menu.nh
    public String toString() {
        return "Dispatchers.IO";
    }
}
