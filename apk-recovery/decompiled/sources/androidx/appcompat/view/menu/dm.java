package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.qp0;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public abstract class dm extends bz0 {
    public int o;

    public dm(int i) {
        this.o = i;
    }

    public abstract void c(Object obj, Throwable th);

    public abstract xg d();

    public Throwable e(Object obj) {
        nd ndVar = obj instanceof nd ? (nd) obj : null;
        if (ndVar != null) {
            return ndVar.a;
        }
        return null;
    }

    public Object h(Object obj) {
        return obj;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            pp.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        c60.b(th);
        rh.a(d().b(), new yh("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Object a;
        Object a2;
        fz0 fz0Var = this.n;
        try {
            xg d = d();
            c60.c(d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            bm bmVar = (bm) d;
            xg xgVar = bmVar.q;
            Object obj = bmVar.s;
            kh b = xgVar.b();
            Object c = l01.c(b, obj);
            if (c != l01.a) {
                lh.f(xgVar, b, c);
            }
            kh b2 = xgVar.b();
            Object j = j();
            Throwable e = e(j);
            t60 t60Var = (e == null && em.b(this.o)) ? (t60) b2.d(t60.d) : null;
            if (t60Var != null && !t60Var.c()) {
                CancellationException w = t60Var.w();
                c(j, w);
                qp0.a aVar = qp0.m;
                xgVar.n(qp0.a(rp0.a(w)));
            } else if (e != null) {
                qp0.a aVar2 = qp0.m;
                xgVar.n(qp0.a(rp0.a(e)));
            } else {
                qp0.a aVar3 = qp0.m;
                xgVar.n(qp0.a(h(j)));
            }
            u31 u31Var = u31.a;
            l01.a(b, c);
            try {
                fz0Var.a();
                a2 = qp0.a(u31.a);
            } catch (Throwable th) {
                qp0.a aVar4 = qp0.m;
                a2 = qp0.a(rp0.a(th));
            }
            i(null, qp0.b(a2));
        } catch (Throwable th2) {
            try {
                qp0.a aVar5 = qp0.m;
                fz0Var.a();
                a = qp0.a(u31.a);
            } catch (Throwable th3) {
                qp0.a aVar6 = qp0.m;
                a = qp0.a(rp0.a(th3));
            }
            i(th2, qp0.b(a));
        }
    }
}
