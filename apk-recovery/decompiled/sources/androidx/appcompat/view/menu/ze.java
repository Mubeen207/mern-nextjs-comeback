package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class ze {
    public static final AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(ze.class, Object.class, "_next");
    public static final AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(ze.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public ze(ze zeVar) {
        this._prev = zeVar;
    }

    public final void b() {
        n.lazySet(this, null);
    }

    public final ze c() {
        ze g = g();
        while (g != null && g.h()) {
            g = (ze) n.get(g);
        }
        return g;
    }

    public final ze d() {
        ze e;
        ze e2 = e();
        c60.b(e2);
        while (e2.h() && (e = e2.e()) != null) {
            e2 = e;
        }
        return e2;
    }

    public final ze e() {
        Object f = f();
        if (f == ye.a()) {
            return null;
        }
        return (ze) f;
    }

    public final Object f() {
        return m.get(this);
    }

    public final ze g() {
        return (ze) n.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return q.a(m, this, null, ye.a());
    }

    public final void k() {
        Object obj;
        if (i()) {
            return;
        }
        while (true) {
            ze c = c();
            ze d = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            do {
                obj = atomicReferenceFieldUpdater.get(d);
            } while (!q.a(atomicReferenceFieldUpdater, d, obj, ((ze) obj) == null ? null : c));
            if (c != null) {
                m.set(c, d);
            }
            if (!d.h() || d.i()) {
                if (c == null || !c.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(ze zeVar) {
        return q.a(m, this, null, zeVar);
    }
}
