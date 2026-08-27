package androidx.appcompat.view.menu;

import android.content.Intent;
import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class c1 {
    public static final jo0 a;
    public static jo0.b b;
    public static jo0.b c;
    public static jo0.b d;
    public static jo0.b e;
    public static jo0.b f;
    public static jo0.b g;
    public static jo0.d h;

    static {
        jo0 w = jo0.w("android.app.Activity");
        a = w;
        b = w.e("mActivityInfo");
        c = w.e("mFinished");
        d = w.e("mParent");
        e = w.e("mResultCode");
        f = w.e("mResultData");
        g = w.e("mToken");
        h = w.u("onNewIntent", Intent.class);
    }
}
