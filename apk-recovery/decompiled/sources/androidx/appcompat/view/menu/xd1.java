package androidx.appcompat.view.menu;

import android.content.Context;
import androidx.appcompat.view.menu.cy;
import androidx.appcompat.view.menu.dz0;
import androidx.appcompat.view.menu.m2;
/* loaded from: classes.dex */
public final class xd1 extends cy implements qz0 {
    public static final m2.g k;
    public static final m2.a l;
    public static final m2 m;

    static {
        m2.g gVar = new m2.g();
        k = gVar;
        vd1 vd1Var = new vd1();
        l = vd1Var;
        m = new m2("ClientTelemetry.API", vd1Var, gVar);
    }

    public xd1(Context context, rz0 rz0Var) {
        super(context, m, rz0Var, cy.a.c);
    }

    @Override // androidx.appcompat.view.menu.qz0
    public final cz0 a(final oz0 oz0Var) {
        dz0.a a = dz0.a();
        a.d(tc1.a);
        a.c(false);
        a.b(new qo0() { // from class: androidx.appcompat.view.menu.sd1
            @Override // androidx.appcompat.view.menu.qo0
            public final void a(Object obj, Object obj2) {
                oz0 oz0Var2 = oz0.this;
                m2.g gVar = xd1.k;
                ((kd1) ((ae1) obj).D()).u2(oz0Var2);
                ((ez0) obj2).c(null);
            }
        });
        return c(a.a());
    }
}
