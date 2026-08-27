package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class x41 {
    public static final jo0 a;
    public static jo0.e b;
    public static jo0.d c;

    static {
        jo0 w = jo0.w("dalvik.system.VMRuntime");
        a = w;
        b = w.z("getRuntime", new Class[0]);
        c = w.u("setTargetSdkVersion", Integer.TYPE);
    }
}
