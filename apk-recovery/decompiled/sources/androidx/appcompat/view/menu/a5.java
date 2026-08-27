package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class a5 {
    public static final jo0 a;
    public static jo0.a b;
    public static jo0.d c;

    static {
        jo0 w = jo0.w("android.content.res.AssetManager");
        a = w;
        b = w.c(new Class[0]);
        c = w.u("addAssetPath", String.class);
    }
}
