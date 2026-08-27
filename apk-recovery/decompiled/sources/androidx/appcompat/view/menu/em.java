package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.qp0;
/* loaded from: classes.dex */
public abstract class em {
    public static final void a(dm dmVar, int i) {
        xg d = dmVar.d();
        boolean z = i == 4;
        if (z || !(d instanceof bm) || b(i) != b(dmVar.o)) {
            d(dmVar, d, z);
            return;
        }
        nh nhVar = ((bm) d).p;
        kh b = d.b();
        if (nhVar.D(b)) {
            nhVar.A(b, dmVar);
        } else {
            e(dmVar);
        }
    }

    public static final boolean b(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean c(int i) {
        return i == 2;
    }

    public static final void d(dm dmVar, xg xgVar, boolean z) {
        Object h;
        Object j = dmVar.j();
        Throwable e = dmVar.e(j);
        if (e != null) {
            qp0.a aVar = qp0.m;
            h = rp0.a(e);
        } else {
            qp0.a aVar2 = qp0.m;
            h = dmVar.h(j);
        }
        Object a = qp0.a(h);
        if (!z) {
            xgVar.n(a);
            return;
        }
        c60.c(xgVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        bm bmVar = (bm) xgVar;
        xg xgVar2 = bmVar.q;
        Object obj = bmVar.s;
        kh b = xgVar2.b();
        Object c = l01.c(b, obj);
        if (c != l01.a) {
            lh.f(xgVar2, b, c);
        }
        try {
            bmVar.q.n(a);
            u31 u31Var = u31.a;
        } finally {
            l01.a(b, c);
        }
    }

    public static final void e(dm dmVar) {
        bp a = m01.a.a();
        if (a.L()) {
            a.H(dmVar);
            return;
        }
        a.J(true);
        try {
            d(dmVar, dmVar.d(), true);
            do {
            } while (a.N());
        } finally {
            try {
            } finally {
            }
        }
    }
}
