package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.qp0;
import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class y7 implements xg, wh, Serializable {
    public final xg m;

    public y7(xg xgVar) {
        this.m = xgVar;
    }

    public xg a(Object obj, xg xgVar) {
        c60.e(xgVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final xg c() {
        return this.m;
    }

    @Override // androidx.appcompat.view.menu.wh
    public wh g() {
        xg xgVar = this.m;
        if (xgVar instanceof wh) {
            return (wh) xgVar;
        }
        return null;
    }

    public StackTraceElement j() {
        return fj.d(this);
    }

    public abstract Object k(Object obj);

    public void l() {
    }

    @Override // androidx.appcompat.view.menu.xg
    public final void n(Object obj) {
        Object k;
        Object c;
        xg xgVar = this;
        while (true) {
            gj.b(xgVar);
            y7 y7Var = (y7) xgVar;
            xg xgVar2 = y7Var.m;
            c60.b(xgVar2);
            try {
                k = y7Var.k(obj);
                c = f60.c();
            } catch (Throwable th) {
                qp0.a aVar = qp0.m;
                obj = qp0.a(rp0.a(th));
            }
            if (k == c) {
                return;
            }
            obj = qp0.a(k);
            y7Var.l();
            if (!(xgVar2 instanceof y7)) {
                xgVar2.n(obj);
                return;
            }
            xgVar = xgVar2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object j = j();
        if (j == null) {
            j = getClass().getName();
        }
        sb.append(j);
        return sb.toString();
    }
}
