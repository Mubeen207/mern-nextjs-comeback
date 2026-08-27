package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.qp0;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public abstract class cm {
    public static final py0 a = new py0("UNDEFINED");
    public static final py0 b = new py0("REUSABLE_CLAIMED");

    public static final void b(xg xgVar, Object obj, kw kwVar) {
        if (!(xgVar instanceof bm)) {
            xgVar.n(obj);
            return;
        }
        bm bmVar = (bm) xgVar;
        Object c = rd.c(obj, kwVar);
        if (bmVar.p.D(bmVar.b())) {
            bmVar.r = c;
            bmVar.o = 1;
            bmVar.p.A(bmVar.b(), bmVar);
            return;
        }
        bp a2 = m01.a.a();
        if (a2.L()) {
            bmVar.r = c;
            bmVar.o = 1;
            a2.H(bmVar);
            return;
        }
        a2.J(true);
        try {
            t60 t60Var = (t60) bmVar.b().d(t60.d);
            if (t60Var == null || t60Var.c()) {
                xg xgVar2 = bmVar.q;
                Object obj2 = bmVar.s;
                kh b2 = xgVar2.b();
                Object c2 = l01.c(b2, obj2);
                if (c2 != l01.a) {
                    lh.f(xgVar2, b2, c2);
                }
                bmVar.q.n(obj);
                u31 u31Var = u31.a;
                l01.a(b2, c2);
            } else {
                CancellationException w = t60Var.w();
                bmVar.c(c, w);
                qp0.a aVar = qp0.m;
                bmVar.n(qp0.a(rp0.a(w)));
            }
            do {
            } while (a2.N());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(xg xgVar, Object obj, kw kwVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            kwVar = null;
        }
        b(xgVar, obj, kwVar);
    }
}
