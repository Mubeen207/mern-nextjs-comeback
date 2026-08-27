package androidx.appcompat.view.menu;

import android.content.Context;
import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class tg {
    public static final jo0 a;
    public static jo0.b b;
    public static jo0.b c;
    public static jo0.b d;
    public static jo0.d e;
    public static jo0.d f;

    static {
        jo0 w = jo0.w("android.app.ContextImpl");
        a = w;
        b = w.e("mBasePackageName");
        c = w.e("mPackageInfo");
        d = w.e("mPackageManager");
        e = w.u("setOuterContext", Context.class);
        f = w.u("getAttributionSource", new Class[0]);
    }
}
