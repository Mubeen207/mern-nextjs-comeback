package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class jx0 {
    public static final jo0 a;
    public static jo0.b b;
    public static jo0.b c;
    public static jo0.b d;
    public static jo0.e e;

    static {
        jo0 w = jo0.w("android.os.StrictMode");
        a = w;
        b = w.e("DETECT_VM_FILE_URI_EXPOSURE");
        c = w.e("PENALTY_DEATH_ON_FILE_URI_EXPOSURE");
        d = w.e("sVmPolicyMask");
        e = w.z("disableDeathOnFileUriExposure", new Class[0]);
    }
}
