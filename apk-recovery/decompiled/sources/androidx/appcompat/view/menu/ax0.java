package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.qp0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class ax0 extends u {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ax0.class, Object.class, "_state");
    private volatile Object _state;

    @Override // androidx.appcompat.view.menu.u
    /* renamed from: d */
    public boolean a(yw0 yw0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, zw0.b());
        return true;
    }

    public final Object e(xg xgVar) {
        xg b;
        Object c;
        Object c2;
        b = e60.b(xgVar);
        y9 y9Var = new y9(b, 1);
        y9Var.z();
        if (!q.a(a, this, zw0.b(), y9Var)) {
            qp0.a aVar = qp0.m;
            y9Var.n(qp0.a(u31.a));
        }
        Object w = y9Var.w();
        c = f60.c();
        if (w == c) {
            gj.c(xgVar);
        }
        c2 = f60.c();
        return w == c2 ? w : u31.a;
    }

    @Override // androidx.appcompat.view.menu.u
    /* renamed from: f */
    public xg[] b(yw0 yw0Var) {
        a.set(this, null);
        return t.a;
    }

    public final void g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null || obj == zw0.c()) {
                return;
            }
            if (obj == zw0.b()) {
                if (q.a(a, this, obj, zw0.c())) {
                    return;
                }
            } else if (q.a(a, this, obj, zw0.b())) {
                qp0.a aVar = qp0.m;
                ((y9) obj).n(qp0.a(u31.a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = a.getAndSet(this, zw0.b());
        c60.b(andSet);
        return andSet == zw0.c();
    }
}
