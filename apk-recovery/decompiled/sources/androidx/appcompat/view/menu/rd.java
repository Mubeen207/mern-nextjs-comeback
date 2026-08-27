package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.qp0;
/* loaded from: classes.dex */
public abstract class rd {
    public static final Object a(Object obj, xg xgVar) {
        if (obj instanceof nd) {
            qp0.a aVar = qp0.m;
            return qp0.a(rp0.a(((nd) obj).a));
        }
        return qp0.a(obj);
    }

    public static final Object b(Object obj, x9 x9Var) {
        Throwable b = qp0.b(obj);
        return b == null ? obj : new nd(b, false, 2, null);
    }

    public static final Object c(Object obj, kw kwVar) {
        Throwable b = qp0.b(obj);
        return b == null ? kwVar != null ? new od(obj, kwVar) : obj : new nd(b, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, kw kwVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            kwVar = null;
        }
        return c(obj, kwVar);
    }
}
