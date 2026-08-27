package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.jo0;
import java.io.File;
/* loaded from: classes.dex */
public abstract class lh0 {
    public static final jo0 a;
    public static jo0.a b;
    public static jo0.e c;
    public static jo0.d d;

    static {
        jo0 w = jo0.w("android.content.pm.PackageParser");
        a = w;
        b = w.c(new Class[0]);
        c = w.z("collectCertificates", PackageParser.Package.class, Boolean.TYPE);
        d = w.u("parsePackage", File.class, Integer.TYPE);
    }
}
