package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class km {
    public static final jo0 a;
    public static jo0.b b;
    public static jo0.e c;

    static {
        jo0 w = jo0.w("android.hardware.display.DisplayManagerGlobal");
        a = w;
        b = w.e("mDm");
        c = w.z("getInstance", new Class[0]);
    }
}
