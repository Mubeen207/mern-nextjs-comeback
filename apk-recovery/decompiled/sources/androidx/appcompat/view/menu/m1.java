package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class m1 {
    public static final jo0 a;
    public static jo0.b b;

    static {
        jo0 w = jo0.w("android.app.ActivityManager");
        a = w;
        b = w.e("IActivityManagerSingleton");
    }
}
