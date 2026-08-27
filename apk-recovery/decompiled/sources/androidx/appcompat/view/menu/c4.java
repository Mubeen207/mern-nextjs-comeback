package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class c4 {
    public static final jo0 a;
    public static jo0.b b;
    public static jo0.b c;

    static {
        jo0 w = jo0.w("android.app.ApplicationPackageManager");
        a = w;
        b = w.e("mPM");
        c = w.e("mPermissionManager");
    }
}
