package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.gl;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class fl implements ScheduledExecutorService {
    public final ExecutorService m;
    public final ScheduledExecutorService n;

    public fl(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.m = executorService;
        this.n = scheduledExecutorService;
    }

    public static /* synthetic */ void m(Runnable runnable, gl.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e) {
            bVar.a(e);
        }
    }

    public static /* synthetic */ void p(Callable callable, gl.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e) {
            bVar.a(e);
        }
    }

    public static /* synthetic */ void s(Runnable runnable, gl.b bVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.a(e);
            throw e;
        }
    }

    public static /* synthetic */ void x(Runnable runnable, gl.b bVar) {
        try {
            runnable.run();
        } catch (Exception e) {
            bVar.a(e);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.m.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.m.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.m.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.m.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.m.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.m.isTerminated();
    }

    public final /* synthetic */ void n(final Runnable runnable, final gl.b bVar) {
        this.m.execute(new Runnable() { // from class: androidx.appcompat.view.menu.uk
            @Override // java.lang.Runnable
            public final void run() {
                fl.m(runnable, bVar);
            }
        });
    }

    public final /* synthetic */ ScheduledFuture o(final Runnable runnable, long j, TimeUnit timeUnit, final gl.b bVar) {
        return this.n.schedule(new Runnable() { // from class: androidx.appcompat.view.menu.bl
            @Override // java.lang.Runnable
            public final void run() {
                fl.this.n(runnable, bVar);
            }
        }, j, timeUnit);
    }

    public final /* synthetic */ Future q(final Callable callable, final gl.b bVar) {
        return this.m.submit(new Runnable() { // from class: androidx.appcompat.view.menu.dl
            @Override // java.lang.Runnable
            public final void run() {
                fl.p(callable, bVar);
            }
        });
    }

    public final /* synthetic */ ScheduledFuture r(final Callable callable, long j, TimeUnit timeUnit, final gl.b bVar) {
        return this.n.schedule(new Callable() { // from class: androidx.appcompat.view.menu.cl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Future q;
                q = fl.this.q(callable, bVar);
                return q;
            }
        }, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new gl(new gl.c() { // from class: androidx.appcompat.view.menu.wk
            @Override // androidx.appcompat.view.menu.gl.c
            public final ScheduledFuture a(gl.b bVar) {
                ScheduledFuture o;
                o = fl.this.o(runnable, j, timeUnit, bVar);
                return o;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new gl(new gl.c() { // from class: androidx.appcompat.view.menu.yk
            @Override // androidx.appcompat.view.menu.gl.c
            public final ScheduledFuture a(gl.b bVar) {
                ScheduledFuture u;
                u = fl.this.u(runnable, j, j2, timeUnit, bVar);
                return u;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new gl(new gl.c() { // from class: androidx.appcompat.view.menu.xk
            @Override // androidx.appcompat.view.menu.gl.c
            public final ScheduledFuture a(gl.b bVar) {
                ScheduledFuture w;
                w = fl.this.w(runnable, j, j2, timeUnit, bVar);
                return w;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.m.submit(callable);
    }

    public final /* synthetic */ void t(final Runnable runnable, final gl.b bVar) {
        this.m.execute(new Runnable() { // from class: androidx.appcompat.view.menu.el
            @Override // java.lang.Runnable
            public final void run() {
                fl.s(runnable, bVar);
            }
        });
    }

    public final /* synthetic */ ScheduledFuture u(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final gl.b bVar) {
        return this.n.scheduleAtFixedRate(new Runnable() { // from class: androidx.appcompat.view.menu.zk
            @Override // java.lang.Runnable
            public final void run() {
                fl.this.t(runnable, bVar);
            }
        }, j, j2, timeUnit);
    }

    public final /* synthetic */ void v(final Runnable runnable, final gl.b bVar) {
        this.m.execute(new Runnable() { // from class: androidx.appcompat.view.menu.vk
            @Override // java.lang.Runnable
            public final void run() {
                fl.x(runnable, bVar);
            }
        });
    }

    public final /* synthetic */ ScheduledFuture w(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final gl.b bVar) {
        return this.n.scheduleWithFixedDelay(new Runnable() { // from class: androidx.appcompat.view.menu.al
            @Override // java.lang.Runnable
            public final void run() {
                fl.this.v(runnable, bVar);
            }
        }, j, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.m.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.m.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j, final TimeUnit timeUnit) {
        return new gl(new gl.c() { // from class: androidx.appcompat.view.menu.tk
            @Override // androidx.appcompat.view.menu.gl.c
            public final ScheduledFuture a(gl.b bVar) {
                ScheduledFuture r;
                r = fl.this.r(callable, j, timeUnit, bVar);
                return r;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.m.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.m.submit(runnable);
    }
}
