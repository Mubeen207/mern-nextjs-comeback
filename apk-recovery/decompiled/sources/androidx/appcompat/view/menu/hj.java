package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.qp0;
/* loaded from: classes.dex */
public abstract class hj {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(xg xgVar) {
        String a;
        if (xgVar instanceof bm) {
            return xgVar.toString();
        }
        try {
            qp0.a aVar = qp0.m;
            a = qp0.a(xgVar + '@' + b(xgVar));
        } catch (Throwable th) {
            qp0.a aVar2 = qp0.m;
            a = qp0.a(rp0.a(th));
        }
        if (qp0.b(a) != null) {
            a = xgVar.getClass().getName() + '@' + b(xgVar);
        }
        return (String) a;
    }
}
