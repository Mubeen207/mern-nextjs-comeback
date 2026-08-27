package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class l1 {
    public static final jo0 a;
    public static jo0.b b;
    public static jo0.e c;

    static {
        jo0 w = jo0.w("android.app.ActivityManagerNative");
        a = w;
        b = w.e("gDefault");
        c = w.z("getDefault", new Class[0]);
    }
}
