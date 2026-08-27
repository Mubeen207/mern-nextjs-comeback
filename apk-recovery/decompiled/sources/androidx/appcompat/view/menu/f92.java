package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class f92 implements ea2 {
    public final /* synthetic */ r82 a;

    public f92(r82 r82Var) {
        this.a = r82Var;
    }

    @Override // androidx.appcompat.view.menu.ea2
    public final void l(String str, String str2, Bundle bundle) {
        fx1 fx1Var;
        fx1 fx1Var2;
        if (!TextUtils.isEmpty(str)) {
            this.a.h().D(new d92(this, str, str2, bundle));
            return;
        }
        fx1Var = this.a.l;
        if (fx1Var != null) {
            fx1Var2 = this.a.l;
            fx1Var2.l().G().b("AppId not known when logging event", str2);
        }
    }
}
