package androidx.appcompat.view.menu;

import android.os.Handler;
import androidx.appcompat.view.menu.m2;
import androidx.appcompat.view.menu.z7;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class ac1 implements z7.c, oc1 {
    public final m2.f a;
    public final r2 b;
    public rz c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ gy f;

    public ac1(gy gyVar, m2.f fVar, r2 r2Var) {
        this.f = gyVar;
        this.a = fVar;
        this.b = r2Var;
    }

    @Override // androidx.appcompat.view.menu.z7.c
    public final void a(ef efVar) {
        Handler handler;
        handler = this.f.A;
        handler.post(new zb1(this, efVar));
    }

    @Override // androidx.appcompat.view.menu.oc1
    public final void b(rz rzVar, Set set) {
        if (rzVar == null || set == null) {
            new Exception();
            c(new ef(4));
            return;
        }
        this.c = rzVar;
        this.d = set;
        h();
    }

    @Override // androidx.appcompat.view.menu.oc1
    public final void c(ef efVar) {
        Map map;
        map = this.f.w;
        wb1 wb1Var = (wb1) map.get(this.b);
        if (wb1Var != null) {
            wb1Var.H(efVar);
        }
    }

    public final void h() {
        rz rzVar;
        if (!this.e || (rzVar = this.c) == null) {
            return;
        }
        this.a.k(rzVar, this.d);
    }
}
