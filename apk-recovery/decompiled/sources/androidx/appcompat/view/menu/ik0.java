package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.os0;
/* loaded from: classes.dex */
public final class ik0 extends ta implements jk0 {
    public ik0(kh khVar, sa saVar) {
        super(khVar, saVar, true, true);
    }

    @Override // androidx.appcompat.view.menu.g
    public void I0(Throwable th, boolean z) {
        if (L0().k(th) || z) {
            return;
        }
        rh.a(b(), th);
    }

    @Override // androidx.appcompat.view.menu.g
    /* renamed from: M0 */
    public void J0(u31 u31Var) {
        os0.a.a(L0(), null, 1, null);
    }

    @Override // androidx.appcompat.view.menu.g, androidx.appcompat.view.menu.e70, androidx.appcompat.view.menu.t60
    public boolean c() {
        return super.c();
    }
}
