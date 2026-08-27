package androidx.appcompat.view.menu;

import android.util.DisplayMetrics;
import androidx.appcompat.view.menu.jo0;
import java.io.File;
/* loaded from: classes.dex */
public abstract class fh0 {
    public static final jo0 a;
    public static jo0.d b;
    public static jo0.d c;

    /* loaded from: classes.dex */
    public static class a {
        public static final jo0 a;
        public static jo0.b b;

        static {
            jo0 w = jo0.w("android.content.pm.PackageParser$SigningDetails");
            a = w;
            b = w.e("signatures");
        }
    }

    static {
        jo0 w = jo0.w("android.content.pm.PackageParser");
        a = w;
        Class cls = Integer.TYPE;
        b = w.u("collectCertificates", jo0.v("android.content.pm.PackageParser$Package"), cls);
        c = w.u("parsePackage", File.class, String.class, DisplayMetrics.class, cls);
    }
}
