package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.qp0;
/* loaded from: classes.dex */
public abstract class q31 {
    public static final void a(yw ywVar, Object obj, xg xgVar) {
        Object c;
        xg a = gj.a(xgVar);
        try {
            kh b = xgVar.b();
            Object c2 = l01.c(b, null);
            Object h = ((yw) t21.a(ywVar, 2)).h(obj, a);
            l01.a(b, c2);
            c = f60.c();
            if (h != c) {
                a.n(qp0.a(h));
            }
        } catch (Throwable th) {
            qp0.a aVar = qp0.m;
            a.n(qp0.a(rp0.a(th)));
        }
    }

    public static final Object b(ls0 ls0Var, Object obj, yw ywVar) {
        Object ndVar;
        Object c;
        Object c2;
        Object c3;
        try {
            ndVar = ((yw) t21.a(ywVar, 2)).h(obj, ls0Var);
        } catch (Throwable th) {
            ndVar = new nd(th, false, 2, null);
        }
        c = f60.c();
        if (ndVar == c) {
            c3 = f60.c();
            return c3;
        }
        Object k0 = ls0Var.k0(ndVar);
        if (k0 == f70.b) {
            c2 = f60.c();
            return c2;
        } else if (k0 instanceof nd) {
            throw ((nd) k0).a;
        } else {
            return f70.h(k0);
        }
    }
}
