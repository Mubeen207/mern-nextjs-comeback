package androidx.appcompat.view.menu;

import android.os.Handler;
import androidx.appcompat.view.menu.z7;
/* loaded from: classes.dex */
public final class vb1 implements z7.e {
    public final /* synthetic */ wb1 a;

    public vb1(wb1 wb1Var) {
        this.a = wb1Var;
    }

    @Override // androidx.appcompat.view.menu.z7.e
    public final void a() {
        Handler handler;
        handler = this.a.x.A;
        handler.post(new ub1(this));
    }
}
