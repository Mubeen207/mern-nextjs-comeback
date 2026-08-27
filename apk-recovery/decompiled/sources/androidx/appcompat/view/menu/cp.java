package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class cp extends dp implements sk {
    public static final AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(cp.class, Object.class, "_queue");
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(cp.class, Object.class, "_delayed");
    public static final AtomicIntegerFieldUpdater t = AtomicIntegerFieldUpdater.newUpdater(cp.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* loaded from: classes.dex */
    public static final class a extends p01 {
    }

    private final boolean U() {
        return t.get(this) != 0;
    }

    @Override // androidx.appcompat.view.menu.nh
    public final void A(kh khVar, Runnable runnable) {
        S(runnable);
    }

    @Override // androidx.appcompat.view.menu.bp
    public long I() {
        py0 py0Var;
        if (super.I() == 0) {
            return 0L;
        }
        Object obj = r.get(this);
        if (obj != null) {
            if (!(obj instanceof ga0)) {
                py0Var = fp.b;
                return obj == py0Var ? Long.MAX_VALUE : 0L;
            } else if (!((ga0) obj).g()) {
                return 0L;
            }
        }
        a aVar = (a) s.get(this);
        return Long.MAX_VALUE;
    }

    public final void Q() {
        py0 py0Var;
        py0 py0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = r;
                py0Var = fp.b;
                if (q.a(atomicReferenceFieldUpdater2, this, null, py0Var)) {
                    return;
                }
            } else if (obj instanceof ga0) {
                ((ga0) obj).d();
                return;
            } else {
                py0Var2 = fp.b;
                if (obj == py0Var2) {
                    return;
                }
                ga0 ga0Var = new ga0(8, true);
                c60.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                ga0Var.a((Runnable) obj);
                if (q.a(r, this, obj, ga0Var)) {
                    return;
                }
            }
        }
    }

    public final Runnable R() {
        py0 py0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof ga0) {
                c60.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                ga0 ga0Var = (ga0) obj;
                Object j = ga0Var.j();
                if (j != ga0.h) {
                    return (Runnable) j;
                }
                q.a(r, this, obj, ga0Var.i());
            } else {
                py0Var = fp.b;
                if (obj == py0Var) {
                    return null;
                }
                if (q.a(r, this, obj, null)) {
                    c60.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void S(Runnable runnable) {
        if (T(runnable)) {
            P();
        } else {
            mj.u.S(runnable);
        }
    }

    public final boolean T(Runnable runnable) {
        py0 py0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (U()) {
                return false;
            }
            if (obj == null) {
                if (q.a(r, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof ga0) {
                c60.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                ga0 ga0Var = (ga0) obj;
                int a2 = ga0Var.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    q.a(r, this, obj, ga0Var.i());
                } else if (a2 == 2) {
                    return false;
                }
            } else {
                py0Var = fp.b;
                if (obj == py0Var) {
                    return false;
                }
                ga0 ga0Var2 = new ga0(8, true);
                c60.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                ga0Var2.a((Runnable) obj);
                ga0Var2.a(runnable);
                if (q.a(r, this, obj, ga0Var2)) {
                    return true;
                }
            }
        }
    }

    public boolean V() {
        py0 py0Var;
        if (M()) {
            a aVar = (a) s.get(this);
            Object obj = r.get(this);
            if (obj != null) {
                if (obj instanceof ga0) {
                    return ((ga0) obj).g();
                }
                py0Var = fp.b;
                if (obj != py0Var) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public long W() {
        if (N()) {
            return 0L;
        }
        a aVar = (a) s.get(this);
        Runnable R = R();
        if (R != null) {
            R.run();
            return 0L;
        }
        return I();
    }

    public final void X() {
        w.a();
        System.nanoTime();
        a aVar = (a) s.get(this);
    }

    public final void Y() {
        r.set(this, null);
        s.set(this, null);
    }

    public final void Z(boolean z) {
        t.set(this, z ? 1 : 0);
    }

    @Override // androidx.appcompat.view.menu.bp
    public void shutdown() {
        m01.a.b();
        Z(true);
        Q();
        do {
        } while (W() <= 0);
        X();
    }
}
