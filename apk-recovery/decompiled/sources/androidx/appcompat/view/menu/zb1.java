package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.m2;
import java.util.Map;
/* loaded from: classes.dex */
public final class zb1 implements Runnable {
    public final /* synthetic */ ef m;
    public final /* synthetic */ ac1 n;

    public zb1(ac1 ac1Var, ef efVar) {
        this.n = ac1Var;
        this.m = efVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        r2 r2Var;
        m2.f fVar;
        m2.f fVar2;
        m2.f fVar3;
        m2.f fVar4;
        ac1 ac1Var = this.n;
        map = ac1Var.f.w;
        r2Var = ac1Var.b;
        wb1 wb1Var = (wb1) map.get(r2Var);
        if (wb1Var == null) {
            return;
        }
        if (!this.m.n()) {
            wb1Var.G(this.m, null);
            return;
        }
        this.n.e = true;
        fVar = this.n.a;
        if (fVar.o()) {
            this.n.h();
            return;
        }
        try {
            ac1 ac1Var2 = this.n;
            fVar3 = ac1Var2.a;
            fVar4 = ac1Var2.a;
            fVar3.k(null, fVar4.b());
        } catch (SecurityException unused) {
            fVar2 = this.n.a;
            fVar2.c("Failed to get service from broker.");
            wb1Var.G(new ef(10), null);
        }
    }
}
