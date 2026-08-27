package androidx.appcompat.view.menu;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
/* loaded from: classes.dex */
public final class kb1 extends be1 {
    public final q4 f;
    public final gy g;

    public kb1(b90 b90Var, gy gyVar, dy dyVar) {
        super(b90Var, dyVar);
        this.f = new q4();
        this.g = gyVar;
        this.a.a("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, gy gyVar, r2 r2Var) {
        b90 c = LifecycleCallback.c(activity);
        kb1 kb1Var = (kb1) c.d("ConnectionlessLifecycleHelper", kb1.class);
        if (kb1Var == null) {
            kb1Var = new kb1(c, gyVar, dy.m());
        }
        pj0.j(r2Var, "ApiKey cannot be null");
        kb1Var.f.add(r2Var);
        gyVar.c(kb1Var);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // androidx.appcompat.view.menu.be1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // androidx.appcompat.view.menu.be1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.g.d(this);
    }

    @Override // androidx.appcompat.view.menu.be1
    public final void m(ef efVar, int i) {
        this.g.F(efVar, i);
    }

    @Override // androidx.appcompat.view.menu.be1
    public final void n() {
        this.g.a();
    }

    public final q4 t() {
        return this.f;
    }

    public final void v() {
        if (this.f.isEmpty()) {
            return;
        }
        this.g.c(this);
    }
}
