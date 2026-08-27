package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t60;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class y9 extends dm implements x9, wh, p71 {
    public static final AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(y9.class, "_decisionAndIndex");
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(y9.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(y9.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;
    public final xg p;
    public final kh q;

    public y9(xg xgVar, int i) {
        super(i);
        this.p = xgVar;
        this.q = xgVar.b();
        this._decisionAndIndex = 536870911;
        this._state = z0.m;
    }

    private final boolean E() {
        if (em.c(this.o)) {
            xg xgVar = this.p;
            c60.c(xgVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((bm) xgVar).o()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void M(y9 y9Var, Object obj, int i, kw kwVar, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i2 & 4) != 0) {
            kwVar = null;
        }
        y9Var.L(obj, i, kwVar);
    }

    public final mm A() {
        t60 t60Var = (t60) b().d(t60.d);
        if (t60Var == null) {
            return null;
        }
        mm d = t60.a.d(t60Var, true, false, new ib(this), 2, null);
        q.a(t, this, null, d);
        return d;
    }

    public final void B(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof z0) {
                if (q.a(s, this, obj2, obj)) {
                    return;
                }
            } else if (obj2 instanceof ms0) {
                F(obj, obj2);
            } else {
                boolean z = obj2 instanceof nd;
                if (z) {
                    nd ndVar = (nd) obj2;
                    if (!ndVar.b()) {
                        F(obj, obj2);
                    }
                    if (obj2 instanceof da) {
                        if (!z) {
                            ndVar = null;
                        }
                        Throwable th = ndVar != null ? ndVar.a : null;
                        c60.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        o((ms0) obj, th);
                        return;
                    }
                    return;
                } else if (obj2 instanceof ld) {
                    ld ldVar = (ld) obj2;
                    ldVar.getClass();
                    if (obj instanceof ms0) {
                        return;
                    }
                    c60.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    my0.a(obj);
                    if (ldVar.c()) {
                        my0.a(obj);
                        l(null, ldVar.d);
                        return;
                    }
                    my0.a(obj);
                    if (q.a(s, this, obj2, ld.b(ldVar, null, null, null, null, null, 29, null))) {
                        return;
                    }
                } else if (obj instanceof ms0) {
                    return;
                } else {
                    c60.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    my0.a(obj);
                    my0.a(obj);
                    if (q.a(s, this, obj2, new ld(obj2, null, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    public boolean C() {
        return !(x() instanceof ff0);
    }

    @Override // androidx.appcompat.view.menu.x9
    public void D(Object obj) {
        t(this.o);
    }

    public final void F(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String G() {
        return "CancellableContinuation";
    }

    public final void H(Throwable th) {
        if (q(th)) {
            return;
        }
        p(th);
        s();
    }

    public final void I() {
        Throwable r2;
        xg xgVar = this.p;
        bm bmVar = xgVar instanceof bm ? (bm) xgVar : null;
        if (bmVar == null || (r2 = bmVar.r(this)) == null) {
            return;
        }
        r();
        p(r2);
    }

    public final boolean J() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof ld) && ((ld) obj).c != null) {
            r();
            return false;
        }
        r.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, z0.m);
        return true;
    }

    public void K(Object obj, kw kwVar) {
        L(obj, this.o, kwVar);
    }

    public final void L(Object obj, int i, kw kwVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof ff0)) {
                if (obj2 instanceof da) {
                    da daVar = (da) obj2;
                    if (daVar.c()) {
                        if (kwVar != null) {
                            m(kwVar, daVar.a);
                            return;
                        }
                        return;
                    }
                }
                k(obj);
                throw new g80();
            }
        } while (!q.a(s, this, obj2, N((ff0) obj2, obj, i, kwVar, null)));
        s();
        t(i);
    }

    public final Object N(ff0 ff0Var, Object obj, int i, kw kwVar, Object obj2) {
        return obj instanceof nd ? obj : (em.b(i) || obj2 != null) ? (kwVar == null && obj2 == null) ? obj : new ld(obj, null, kwVar, obj2, null, 16, null) : obj;
    }

    public final boolean O() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = r;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!r.compareAndSet(this, i, 1073741824 + (536870911 & i)));
        return true;
    }

    public final py0 P(Object obj, Object obj2, kw kwVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof ff0)) {
                if ((obj3 instanceof ld) && obj2 != null && ((ld) obj3).c == obj2) {
                    return z9.a;
                }
                return null;
            }
        } while (!q.a(s, this, obj3, N((ff0) obj3, obj, this.o, kwVar, obj2)));
        s();
        return z9.a;
    }

    public final boolean Q() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = r;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!r.compareAndSet(this, i, 536870912 + (536870911 & i)));
        return true;
    }

    @Override // androidx.appcompat.view.menu.p71
    public void a(ms0 ms0Var, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = r;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        B(ms0Var);
    }

    @Override // androidx.appcompat.view.menu.xg
    public kh b() {
        return this.q;
    }

    @Override // androidx.appcompat.view.menu.dm
    public void c(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof ff0) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof nd) {
                return;
            }
            if (obj2 instanceof ld) {
                ld ldVar = (ld) obj2;
                if (!(!ldVar.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (q.a(s, this, obj2, ld.b(ldVar, null, null, null, null, th, 15, null))) {
                    ldVar.d(this, th);
                    return;
                }
            } else if (q.a(s, this, obj2, new ld(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.dm
    public final xg d() {
        return this.p;
    }

    @Override // androidx.appcompat.view.menu.dm
    public Throwable e(Object obj) {
        Throwable e = super.e(obj);
        if (e != null) {
            return e;
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.x9
    public Object f(Object obj, Object obj2, kw kwVar) {
        return P(obj, obj2, kwVar);
    }

    @Override // androidx.appcompat.view.menu.wh
    public wh g() {
        xg xgVar = this.p;
        if (xgVar instanceof wh) {
            return (wh) xgVar;
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.dm
    public Object h(Object obj) {
        return obj instanceof ld ? ((ld) obj).a : obj;
    }

    @Override // androidx.appcompat.view.menu.dm
    public Object j() {
        return x();
    }

    public final Void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final void l(t9 t9Var, Throwable th) {
        try {
            throw null;
        } catch (Throwable th2) {
            kh b = b();
            rh.a(b, new qd("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(kw kwVar, Throwable th) {
        try {
            kwVar.i(th);
        } catch (Throwable th2) {
            kh b = b();
            rh.a(b, new qd("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // androidx.appcompat.view.menu.xg
    public void n(Object obj) {
        M(this, rd.b(obj, this), this.o, null, 4, null);
    }

    public final void o(ms0 ms0Var, Throwable th) {
        int i = r.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            ms0Var.o(i, th, b());
        } catch (Throwable th2) {
            kh b = b();
            rh.a(b, new qd("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public boolean p(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof ff0)) {
                return false;
            }
        } while (!q.a(s, this, obj, new da(this, th, obj instanceof ms0)));
        if (((ff0) obj) instanceof ms0) {
            o((ms0) obj, th);
        }
        s();
        t(this.o);
        return true;
    }

    public final boolean q(Throwable th) {
        if (E()) {
            xg xgVar = this.p;
            c60.c(xgVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            return ((bm) xgVar).p(th);
        }
        return false;
    }

    public final void r() {
        mm v = v();
        if (v == null) {
            return;
        }
        v.a();
        t.set(this, df0.m);
    }

    public final void s() {
        if (E()) {
            return;
        }
        r();
    }

    public final void t(int i) {
        if (O()) {
            return;
        }
        em.a(this, i);
    }

    public String toString() {
        return G() + '(' + hj.c(this.p) + "){" + y() + "}@" + hj.b(this);
    }

    public Throwable u(t60 t60Var) {
        return t60Var.w();
    }

    public final mm v() {
        return (mm) t.get(this);
    }

    public final Object w() {
        t60 t60Var;
        Object c;
        boolean E = E();
        if (Q()) {
            if (v() == null) {
                A();
            }
            if (E) {
                I();
            }
            c = f60.c();
            return c;
        }
        if (E) {
            I();
        }
        Object x = x();
        if (x instanceof nd) {
            throw ((nd) x).a;
        }
        if (!em.b(this.o) || (t60Var = (t60) b().d(t60.d)) == null || t60Var.c()) {
            return h(x);
        }
        CancellationException w = t60Var.w();
        c(x, w);
        throw w;
    }

    public final Object x() {
        return s.get(this);
    }

    public final String y() {
        Object x = x();
        return x instanceof ff0 ? "Active" : x instanceof da ? "Cancelled" : "Completed";
    }

    public void z() {
        mm A = A();
        if (A != null && C()) {
            A.a();
            t.set(this, df0.m);
        }
    }
}
