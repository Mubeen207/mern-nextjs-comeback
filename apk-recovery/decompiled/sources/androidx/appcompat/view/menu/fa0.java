package androidx.appcompat.view.menu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class fa0 {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(fa0.class, Object.class, "_cur");
    private volatile Object _cur;

    public fa0(boolean z) {
        this._cur = new ga0(8, z);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            ga0 ga0Var = (ga0) atomicReferenceFieldUpdater.get(this);
            int a2 = ga0Var.a(obj);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                q.a(a, this, ga0Var, ga0Var.i());
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            ga0 ga0Var = (ga0) atomicReferenceFieldUpdater.get(this);
            if (ga0Var.d()) {
                return;
            }
            q.a(a, this, ga0Var, ga0Var.i());
        }
    }

    public final int c() {
        return ((ga0) a.get(this)).f();
    }

    public final Object d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            ga0 ga0Var = (ga0) atomicReferenceFieldUpdater.get(this);
            Object j = ga0Var.j();
            if (j != ga0.h) {
                return j;
            }
            q.a(a, this, ga0Var, ga0Var.i());
        }
    }
}
