package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.qp0;
/* loaded from: classes.dex */
public abstract class ba {
    public static final void a(xg xgVar, Throwable th) {
        qp0.a aVar = qp0.m;
        xgVar.n(qp0.a(rp0.a(th)));
        throw th;
    }

    public static final void b(xg xgVar, xg xgVar2) {
        xg b;
        try {
            b = e60.b(xgVar);
            qp0.a aVar = qp0.m;
            cm.c(b, qp0.a(u31.a), null, 2, null);
        } catch (Throwable th) {
            a(xgVar2, th);
        }
    }

    public static final void c(yw ywVar, Object obj, xg xgVar, kw kwVar) {
        xg a;
        xg b;
        try {
            a = e60.a(ywVar, obj, xgVar);
            b = e60.b(a);
            qp0.a aVar = qp0.m;
            cm.b(b, qp0.a(u31.a), kwVar);
        } catch (Throwable th) {
            a(xgVar, th);
        }
    }

    public static /* synthetic */ void d(yw ywVar, Object obj, xg xgVar, kw kwVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            kwVar = null;
        }
        c(ywVar, obj, xgVar, kwVar);
    }
}
