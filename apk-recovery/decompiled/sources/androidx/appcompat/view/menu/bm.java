package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class bm extends dm implements wh, xg {
    public static final AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(bm.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;
    public final nh p;
    public final xg q;
    public Object r;
    public final Object s;

    public bm(nh nhVar, xg xgVar) {
        super(-1);
        this.p = nhVar;
        this.q = xgVar;
        this.r = cm.a();
        this.s = l01.b(b());
    }

    @Override // androidx.appcompat.view.menu.xg
    public kh b() {
        return this.q.b();
    }

    @Override // androidx.appcompat.view.menu.dm
    public void c(Object obj, Throwable th) {
        if (obj instanceof od) {
            ((od) obj).b.i(th);
        }
    }

    @Override // androidx.appcompat.view.menu.dm
    public xg d() {
        return this;
    }

    @Override // androidx.appcompat.view.menu.wh
    public wh g() {
        xg xgVar = this.q;
        if (xgVar instanceof wh) {
            return (wh) xgVar;
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.dm
    public Object j() {
        Object obj = this.r;
        this.r = cm.a();
        return obj;
    }

    public final void k() {
        do {
        } while (t.get(this) == cm.b);
    }

    public final y9 l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                t.set(this, cm.b);
                return null;
            } else if (obj instanceof y9) {
                if (q.a(t, this, obj, cm.b)) {
                    return (y9) obj;
                }
            } else if (obj != cm.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final y9 m() {
        Object obj = t.get(this);
        if (obj instanceof y9) {
            return (y9) obj;
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.xg
    public void n(Object obj) {
        kh b = this.q.b();
        Object d = rd.d(obj, null, 1, null);
        if (this.p.D(b)) {
            this.r = d;
            this.o = 0;
            this.p.A(b, this);
            return;
        }
        bp a = m01.a.a();
        if (a.L()) {
            this.r = d;
            this.o = 0;
            a.H(this);
            return;
        }
        a.J(true);
        try {
            kh b2 = b();
            Object c = l01.c(b2, this.s);
            this.q.n(obj);
            u31 u31Var = u31.a;
            l01.a(b2, c);
            do {
            } while (a.N());
        } catch (Throwable th) {
            try {
                i(th, null);
            } finally {
                a.F(true);
            }
        }
    }

    public final boolean o() {
        return t.get(this) != null;
    }

    public final boolean p(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            py0 py0Var = cm.b;
            if (c60.a(obj, py0Var)) {
                if (q.a(t, this, py0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (q.a(t, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void q() {
        k();
        y9 m = m();
        if (m != null) {
            m.r();
        }
    }

    public final Throwable r(x9 x9Var) {
        py0 py0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            py0Var = cm.b;
            if (obj != py0Var) {
                if (obj instanceof Throwable) {
                    if (q.a(t, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!q.a(t, this, py0Var, x9Var));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.p + ", " + hj.c(this.q) + ']';
    }
}
