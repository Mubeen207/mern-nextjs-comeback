package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class j60 extends v60 {
    public static final AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(j60.class, "_invoked");
    private volatile int _invoked;
    public final kw q;

    public j60(kw kwVar) {
        this.q = kwVar;
    }

    @Override // androidx.appcompat.view.menu.kw
    public /* bridge */ /* synthetic */ Object i(Object obj) {
        w((Throwable) obj);
        return u31.a;
    }

    @Override // androidx.appcompat.view.menu.pd
    public void w(Throwable th) {
        if (r.compareAndSet(this, 0, 1)) {
            this.q.i(th);
        }
    }
}
