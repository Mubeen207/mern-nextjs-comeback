package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class b4 {
    public static final jo0 a;
    public static jo0.b b;
    public static jo0.b c;
    public static jo0.b d;

    static {
        jo0 w = jo0.w("android.content.pm.ApplicationInfo");
        a = w;
        b = w.e("credentialEncryptedDataDir");
        c = w.e("credentialProtectedDataDir");
        d = w.e("deviceProtectedDataDir");
    }
}
