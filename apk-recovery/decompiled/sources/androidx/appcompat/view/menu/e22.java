package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class e22 implements ea2 {
    public final /* synthetic */ g02 a;

    public e22(g02 g02Var) {
        this.a = g02Var;
    }

    @Override // androidx.appcompat.view.menu.ea2
    public final void l(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.a.y0("auto", str2, bundle);
        } else {
            this.a.Y("auto", str2, bundle, str);
        }
    }
}
