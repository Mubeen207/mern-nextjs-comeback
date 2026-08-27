package androidx.appcompat.view.menu;

import android.app.Dialog;
/* loaded from: classes.dex */
public final class wd1 extends cc1 {
    public final /* synthetic */ Dialog a;
    public final /* synthetic */ yd1 b;

    public wd1(yd1 yd1Var, Dialog dialog) {
        this.b = yd1Var;
        this.a = dialog;
    }

    @Override // androidx.appcompat.view.menu.cc1
    public final void a() {
        this.b.n.o();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
