package androidx.appcompat.view.menu;

import android.content.Context;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class mw1 extends gz1 {
    public static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    public ax1 c;
    public ax1 d;
    public final PriorityBlockingQueue e;
    public final BlockingQueue f;
    public final Thread.UncaughtExceptionHandler g;
    public final Thread.UncaughtExceptionHandler h;
    public final Object i;
    public final Semaphore j;
    public volatile boolean k;

    public mw1(fx1 fx1Var) {
        super(fx1Var);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue();
        this.f = new LinkedBlockingQueue();
        this.g = new xw1(this, "Thread death: Uncaught exception on worker thread");
        this.h = new xw1(this, "Thread death: Uncaught exception on network thread");
    }

    public final Future B(Callable callable) {
        o();
        pj0.i(callable);
        cx1 cx1Var = new cx1(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            cx1Var.run();
        } else {
            y(cx1Var);
        }
        return cx1Var;
    }

    public final void D(Runnable runnable) {
        o();
        pj0.i(runnable);
        y(new cx1(this, runnable, false, "Task exception on worker thread"));
    }

    public final void G(Runnable runnable) {
        o();
        pj0.i(runnable);
        y(new cx1(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean J() {
        return Thread.currentThread() == this.c;
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ cc b() {
        return super.b();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ pf1 d() {
        return super.d();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ tf1 e() {
        return super.e();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ fi1 f() {
        return super.f();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ pt1 g() {
        return super.g();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ mw1 h() {
        return super.h();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ wu1 i() {
        return super.i();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ aa2 j() {
        return super.j();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final void k() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ st1 l() {
        return super.l();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final void n() {
        if (Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // androidx.appcompat.view.menu.gz1
    public final boolean s() {
        return false;
    }

    public final Object v(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            h().D(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                vt1 L = l().L();
                L.a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            vt1 L2 = l().L();
            L2.a("Timed out waiting for " + str);
        }
        return obj;
    }

    public final Future w(Callable callable) {
        o();
        pj0.i(callable);
        cx1 cx1Var = new cx1(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                l().L().a("Callable skipped the worker queue.");
            }
            cx1Var.run();
        } else {
            y(cx1Var);
        }
        return cx1Var;
    }

    public final void y(cx1 cx1Var) {
        synchronized (this.i) {
            try {
                this.e.add(cx1Var);
                ax1 ax1Var = this.c;
                if (ax1Var == null) {
                    ax1 ax1Var2 = new ax1(this, "Measurement Worker", this.e);
                    this.c = ax1Var2;
                    ax1Var2.setUncaughtExceptionHandler(this.g);
                    this.c.start();
                } else {
                    ax1Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(Runnable runnable) {
        o();
        pj0.i(runnable);
        cx1 cx1Var = new cx1(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            try {
                this.f.add(cx1Var);
                ax1 ax1Var = this.d;
                if (ax1Var == null) {
                    ax1 ax1Var2 = new ax1(this, "Measurement Network", this.f);
                    this.d = ax1Var2;
                    ax1Var2.setUncaughtExceptionHandler(this.h);
                    this.d.start();
                } else {
                    ax1Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
