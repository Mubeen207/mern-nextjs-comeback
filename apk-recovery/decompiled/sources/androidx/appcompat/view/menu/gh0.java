package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import android.os.Build;
import android.util.DisplayMetrics;
import java.io.File;
/* loaded from: classes.dex */
public abstract class gh0 {
    public static final int a = Build.VERSION.SDK_INT;

    public static void a(PackageParser packageParser, PackageParser.Package r3, int i) {
        if (y8.e()) {
            lh0.c.b(r3, Boolean.TRUE);
        } else {
            int i2 = a;
            if (i2 >= 24) {
                kh0.b.b(r3, Integer.valueOf(i));
            } else if (i2 >= 23) {
                jh0.c.b(packageParser, r3, Integer.valueOf(i));
            } else if (i2 >= 22) {
                hh0.c.b(packageParser, r3, Integer.valueOf(i));
            } else if (i2 >= 21) {
                ih0.c.b(packageParser, r3, Integer.valueOf(i));
            }
        }
        fh0.b.b(packageParser, r3, Integer.valueOf(i));
    }

    public static PackageParser b() {
        if (y8.f()) {
            lh0.b.b(new Object[0]);
            PackageParser packageParser = (PackageParser) lh0.b.b(new Object[0]);
            packageParser.setCallback(new PackageParser.CallbackImpl(bv0.r()));
            return packageParser;
        }
        int i = a;
        if (i >= 28) {
            return (PackageParser) lh0.b.b(new Object[0]);
        }
        if (i >= 23) {
            return (PackageParser) jh0.b.b(new Object[0]);
        }
        if (i >= 22) {
            return (PackageParser) hh0.b.b(new Object[0]);
        }
        if (i >= 21) {
            return (PackageParser) ih0.b.b(new Object[0]);
        }
        return null;
    }

    public static PackageParser.Package c(PackageParser packageParser, File file, int i) {
        if (y8.e()) {
            return (PackageParser.Package) lh0.d.b(packageParser, file, Integer.valueOf(i));
        }
        int i2 = a;
        return i2 >= 23 ? (PackageParser.Package) jh0.d.b(packageParser, file, Integer.valueOf(i)) : i2 >= 22 ? (PackageParser.Package) hh0.d.b(packageParser, file, Integer.valueOf(i)) : i2 >= 21 ? (PackageParser.Package) ih0.d.b(packageParser, file, Integer.valueOf(i)) : (PackageParser.Package) fh0.c.b(packageParser, file, null, new DisplayMetrics(), Integer.valueOf(i));
    }
}
