package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class e1 {
    public static final jo0 a;
    public static jo0.b b;
    public static jo0.e c;
    public static jo0.e d;

    /* loaded from: classes.dex */
    public static class a {
        public static final jo0 a;
        public static jo0.b b;

        static {
            jo0 w = jo0.w("android.app.ActivityClient$ActivityClientControllerSingleton");
            a = w;
            b = w.e("mKnownInstance");
        }
    }

    static {
        jo0 w = jo0.w("android.app.ActivityClient");
        a = w;
        b = w.e("INTERFACE_SINGLETON");
        c = w.z("getInstance", new Class[0]);
        d = w.z("getActivityClientController", new Class[0]);
    }
}
