package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class cj {
    public static final jo0 a;
    public static jo0.e b;

    static {
        jo0 w = jo0.w("android.ddm.DdmHandleAppName");
        a = w;
        b = w.z("setAppName", String.class, Integer.TYPE);
    }
}
