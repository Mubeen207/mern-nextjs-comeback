package androidx.appcompat.view.menu;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class ju1 extends pe1 {
    public final /* synthetic */ z7 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju1(z7 z7Var, int i, Bundle bundle) {
        super(z7Var, i, null);
        this.g = z7Var;
    }

    @Override // androidx.appcompat.view.menu.pe1
    public final void f(ef efVar) {
        if (this.g.t() && z7.h0(this.g)) {
            z7.d0(this.g, 16);
            return;
        }
        this.g.A.a(efVar);
        this.g.L(efVar);
    }

    @Override // androidx.appcompat.view.menu.pe1
    public final boolean g() {
        this.g.A.a(ef.q);
        return true;
    }
}
