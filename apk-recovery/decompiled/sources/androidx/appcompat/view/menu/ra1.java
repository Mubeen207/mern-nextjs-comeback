package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class ra1 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ra1.class, Object.class, "lastScheduledTask");
    public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(ra1.class, "producerIndex");
    public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(ra1.class, "consumerIndex");
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(ra1.class, "blockingTasksInBuffer");
    public final AtomicReferenceArray a = new AtomicReferenceArray((int) PackageParser.PARSE_IS_PRIVILEGED);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final bz0 a(bz0 bz0Var, boolean z) {
        if (z) {
            return b(bz0Var);
        }
        bz0 bz0Var2 = (bz0) b.getAndSet(this, bz0Var);
        if (bz0Var2 == null) {
            return null;
        }
        return b(bz0Var2);
    }

    public final bz0 b(bz0 bz0Var) {
        if (d() == 127) {
            return bz0Var;
        }
        if (bz0Var.n.b() == 1) {
            e.incrementAndGet(this);
        }
        int i = c.get(this) & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, bz0Var);
        c.incrementAndGet(this);
        return null;
    }

    public final void c(bz0 bz0Var) {
        if (bz0Var == null || bz0Var.n.b() != 1) {
            return;
        }
        e.decrementAndGet(this);
    }

    public final int d() {
        return c.get(this) - d.get(this);
    }

    public final int e() {
        return b.get(this) != null ? d() + 1 : d();
    }

    public final void f(ux uxVar) {
        bz0 bz0Var = (bz0) b.getAndSet(this, null);
        if (bz0Var != null) {
            uxVar.a(bz0Var);
        }
        do {
        } while (j(uxVar));
    }

    public final bz0 g() {
        bz0 bz0Var = (bz0) b.getAndSet(this, null);
        return bz0Var == null ? i() : bz0Var;
    }

    public final bz0 h() {
        return k(true);
    }

    public final bz0 i() {
        bz0 bz0Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (bz0Var = (bz0) this.a.getAndSet(i2, null)) != null) {
                c(bz0Var);
                return bz0Var;
            }
        }
    }

    public final boolean j(ux uxVar) {
        bz0 i = i();
        if (i == null) {
            return false;
        }
        uxVar.a(i);
        return true;
    }

    public final bz0 k(boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        bz0 bz0Var;
        do {
            atomicReferenceFieldUpdater = b;
            bz0Var = (bz0) atomicReferenceFieldUpdater.get(this);
            if (bz0Var != null) {
                if ((bz0Var.n.b() == 1) == z) {
                }
            }
            int i = d.get(this);
            int i2 = c.get(this);
            while (i != i2) {
                if (z && e.get(this) == 0) {
                    return null;
                }
                i2--;
                bz0 m = m(i2, z);
                if (m != null) {
                    return m;
                }
            }
            return null;
        } while (!q.a(atomicReferenceFieldUpdater, this, bz0Var, null));
        return bz0Var;
    }

    public final bz0 l(int i) {
        int i2 = d.get(this);
        int i3 = c.get(this);
        boolean z = i == 1;
        while (i2 != i3) {
            if (z && e.get(this) == 0) {
                return null;
            }
            int i4 = i2 + 1;
            bz0 m = m(i2, z);
            if (m != null) {
                return m;
            }
            i2 = i4;
        }
        return null;
    }

    public final bz0 m(int i, boolean z) {
        int i2 = i & 127;
        bz0 bz0Var = (bz0) this.a.get(i2);
        if (bz0Var != null) {
            if ((bz0Var.n.b() == 1) == z && cb.a(this.a, i2, bz0Var, null)) {
                if (z) {
                    e.decrementAndGet(this);
                }
                return bz0Var;
            }
        }
        return null;
    }

    public final long n(int i, eo0 eo0Var) {
        bz0 i2 = i == 3 ? i() : l(i);
        if (i2 != null) {
            eo0Var.m = i2;
            return -1L;
        }
        return o(i, eo0Var);
    }

    public final long o(int i, eo0 eo0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        bz0 bz0Var;
        do {
            atomicReferenceFieldUpdater = b;
            bz0Var = (bz0) atomicReferenceFieldUpdater.get(this);
            if (bz0Var == null) {
                return -2L;
            }
            if (((bz0Var.n.b() != 1 ? 2 : 1) & i) == 0) {
                return -2L;
            }
            long a = nz0.f.a() - bz0Var.m;
            long j = nz0.b;
            if (a < j) {
                return j - a;
            }
        } while (!q.a(atomicReferenceFieldUpdater, this, bz0Var, null));
        eo0Var.m = bz0Var;
        return -1L;
    }
}
