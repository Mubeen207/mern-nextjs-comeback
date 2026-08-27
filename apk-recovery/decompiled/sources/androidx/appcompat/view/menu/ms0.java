package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public abstract class ms0 extends ze implements ff0 {
    public static final AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(ms0.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;
    public final long o;

    public ms0(long j, ms0 ms0Var, int i) {
        super(ms0Var);
        this.o = j;
        this.cleanedAndPointers = i << 16;
    }

    @Override // androidx.appcompat.view.menu.ze
    public boolean h() {
        return p.get(this) == n() && !i();
    }

    public final boolean m() {
        return p.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i, Throwable th, kh khVar);

    public final void p() {
        if (p.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = p;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == n() && !i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
