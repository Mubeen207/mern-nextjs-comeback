package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.view.menu.fy;
import androidx.appcompat.view.menu.m2;
import java.util.Set;
/* loaded from: classes.dex */
public final class pc1 extends hc1 implements fy.a, fy.b {
    public static final m2.a s = uc1.c;
    public final Context l;
    public final Handler m;
    public final m2.a n;
    public final Set o;
    public final ac p;
    public xc1 q;
    public oc1 r;

    public pc1(Context context, Handler handler, ac acVar) {
        m2.a aVar = s;
        this.l = context;
        this.m = handler;
        this.p = (ac) pj0.j(acVar, "ClientSettings must not be null");
        this.o = acVar.e();
        this.n = aVar;
    }

    public static /* bridge */ /* synthetic */ void w2(pc1 pc1Var, od1 od1Var) {
        ef d = od1Var.d();
        if (d.n()) {
            fe1 fe1Var = (fe1) pj0.i(od1Var.f());
            ef d2 = fe1Var.d();
            if (!d2.n()) {
                String valueOf = String.valueOf(d2);
                new Exception();
                "Sign-in succeeded with resolve account failure: ".concat(valueOf);
                pc1Var.r.c(d2);
                pc1Var.q.n();
                return;
            }
            pc1Var.r.b(fe1Var.f(), pc1Var.o);
        } else {
            pc1Var.r.c(d);
        }
        pc1Var.q.n();
    }

    @Override // androidx.appcompat.view.menu.df
    public final void h(int i) {
        this.q.n();
    }

    @Override // androidx.appcompat.view.menu.kg0
    public final void j(ef efVar) {
        this.r.c(efVar);
    }

    @Override // androidx.appcompat.view.menu.df
    public final void k(Bundle bundle) {
        this.q.i(this);
    }

    @Override // androidx.appcompat.view.menu.yc1
    public final void v(od1 od1Var) {
        this.m.post(new nc1(this, od1Var));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.appcompat.view.menu.m2$f, androidx.appcompat.view.menu.xc1] */
    public final void x2(oc1 oc1Var) {
        xc1 xc1Var = this.q;
        if (xc1Var != null) {
            xc1Var.n();
        }
        this.p.i(Integer.valueOf(System.identityHashCode(this)));
        m2.a aVar = this.n;
        Context context = this.l;
        Looper looper = this.m.getLooper();
        ac acVar = this.p;
        this.q = aVar.b(context, looper, acVar, acVar.f(), this, this);
        this.r = oc1Var;
        Set set = this.o;
        if (set == null || set.isEmpty()) {
            this.m.post(new mc1(this));
        } else {
            this.q.p();
        }
    }

    public final void y2() {
        xc1 xc1Var = this.q;
        if (xc1Var != null) {
            xc1Var.n();
        }
    }
}
