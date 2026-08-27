package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.jo0;
/* loaded from: classes.dex */
public abstract class kh0 {
    public static final jo0 a;
    public static jo0.e b;

    static {
        jo0 w = jo0.w("android.content.pm.PackageParser");
        a = w;
        b = w.z("collectCertificates", PackageParser.Package.class, Integer.TYPE);
    }
}
