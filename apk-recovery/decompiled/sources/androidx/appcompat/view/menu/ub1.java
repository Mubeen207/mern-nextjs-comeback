package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.m2;
/* loaded from: classes.dex */
public final class ub1 implements Runnable {
    public final /* synthetic */ vb1 m;

    public ub1(vb1 vb1Var) {
        this.m = vb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m2.f fVar;
        m2.f fVar2;
        wb1 wb1Var = this.m.a;
        fVar = wb1Var.m;
        fVar2 = wb1Var.m;
        fVar.c(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
