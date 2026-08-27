package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class g90 extends nh implements sk {
    public static final AtomicIntegerFieldUpdater t = AtomicIntegerFieldUpdater.newUpdater(g90.class, "runningWorkers");
    public final nh o;
    public final int p;
    public final /* synthetic */ sk q;
    public final fa0 r;
    private volatile int runningWorkers;
    public final Object s;

    /* loaded from: classes.dex */
    public final class a implements Runnable {
        public Runnable m;

        public a(Runnable runnable) {
            this.m = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.m.run();
                } catch (Throwable th) {
                    rh.a(bo.m, th);
                }
                Runnable H = g90.this.H();
                if (H == null) {
                    return;
                }
                this.m = H;
                i++;
                if (i >= 16 && g90.this.o.D(g90.this)) {
                    g90.this.o.A(g90.this, this);
                    return;
                }
            }
        }
    }

    public g90(nh nhVar, int i) {
        this.o = nhVar;
        this.p = i;
        sk skVar = nhVar instanceof sk ? (sk) nhVar : null;
        this.q = skVar == null ? nj.a() : skVar;
        this.r = new fa0(false);
        this.s = new Object();
    }

    @Override // androidx.appcompat.view.menu.nh
    public void A(kh khVar, Runnable runnable) {
        Runnable H;
        this.r.a(runnable);
        if (t.get(this) >= this.p || !I() || (H = H()) == null) {
            return;
        }
        this.o.A(this, new a(H));
    }

    public final Runnable H() {
        while (true) {
            Runnable runnable = (Runnable) this.r.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.s) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.r.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean I() {
        synchronized (this.s) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t;
            if (atomicIntegerFieldUpdater.get(this) >= this.p) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
