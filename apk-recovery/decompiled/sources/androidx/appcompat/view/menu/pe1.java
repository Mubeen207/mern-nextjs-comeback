package androidx.appcompat.view.menu;

import android.app.PendingIntent;
import android.os.Bundle;
/* loaded from: classes.dex */
public abstract class pe1 extends nk1 {
    public final int d;
    public final Bundle e;
    public final /* synthetic */ z7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe1(z7 z7Var, int i, Bundle bundle) {
        super(z7Var, Boolean.TRUE);
        this.f = z7Var;
        this.d = i;
        this.e = bundle;
    }

    @Override // androidx.appcompat.view.menu.nk1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.d != 0) {
            this.f.i0(1, null);
            Bundle bundle = this.e;
            f(new ef(this.d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else if (g()) {
        } else {
            this.f.i0(1, null);
            f(new ef(8, null));
        }
    }

    @Override // androidx.appcompat.view.menu.nk1
    public final void b() {
    }

    public abstract void f(ef efVar);

    public abstract boolean g();
}
