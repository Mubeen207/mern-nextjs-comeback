package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class gx0 {
    public static final jo0 a;
    public static jo0.e b;

    static {
        jo0 w = jo0.w("android.os.storage.StorageManager");
        a = w;
        Class cls = Integer.TYPE;
        b = w.z("getVolumeList", cls, cls);
    }
}
