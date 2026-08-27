package androidx.appcompat.view.menu;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes.dex */
public final class mj extends cp implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final mj u;
    public static final long v;

    static {
        Long l;
        mj mjVar = new mj();
        u = mjVar;
        bp.K(mjVar, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        v = timeUnit.toNanos(l.longValue());
    }

    @Override // androidx.appcompat.view.menu.dp
    public Thread O() {
        Thread thread = _thread;
        return thread == null ? b0() : thread;
    }

    @Override // androidx.appcompat.view.menu.cp
    public void S(Runnable runnable) {
        if (c0()) {
            f0();
        }
        super.S(runnable);
    }

    public final synchronized void a0() {
        if (d0()) {
            debugStatus = 3;
            Y();
            c60.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread b0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean c0() {
        return debugStatus == 4;
    }

    public final boolean d0() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    public final synchronized boolean e0() {
        if (d0()) {
            return false;
        }
        debugStatus = 1;
        c60.c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final void f0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean V;
        m01.a.c(this);
        w.a();
        try {
            if (!e0()) {
                if (V) {
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long W = W();
                if (W == Long.MAX_VALUE) {
                    w.a();
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = v + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        a0();
                        w.a();
                        if (V()) {
                            return;
                        }
                        O();
                        return;
                    }
                    W = xn0.c(W, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (W > 0) {
                    if (d0()) {
                        _thread = null;
                        a0();
                        w.a();
                        if (V()) {
                            return;
                        }
                        O();
                        return;
                    }
                    w.a();
                    LockSupport.parkNanos(this, W);
                }
            }
        } finally {
            _thread = null;
            a0();
            w.a();
            if (!V()) {
                O();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.cp, androidx.appcompat.view.menu.bp
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
