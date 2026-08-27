package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
/* loaded from: classes.dex */
public class ly {
    public static ly c;
    public final Context a;
    public volatile String b;

    public ly(Context context) {
        this.a = context.getApplicationContext();
    }

    public static ly a(Context context) {
        pj0.i(context);
        synchronized (ly.class) {
            try {
                if (c == null) {
                    n92.d(context);
                    c = new ly(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public static final z02 d(PackageInfo packageInfo, z02... z02VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            a32 a32Var = new a32(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < z02VarArr.length; i++) {
                if (z02VarArr[i].equals(a32Var)) {
                    return z02VarArr[i];
                }
            }
            return null;
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z) {
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z ? d(packageInfo, h72.a) : d(packageInfo, h72.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        return e(packageInfo, true) && ky.d(this.a);
    }

    public boolean c(int i) {
        sf2 c2;
        int length;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c2 = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    pj0.i(c2);
                    break;
                }
                c2 = f(packagesForUid[i2], false, false);
                if (c2.a) {
                    break;
                }
                i2++;
            }
        } else {
            c2 = sf2.c("no pkgs");
        }
        c2.e();
        return c2.a;
    }

    public final sf2 f(String str, boolean z, boolean z2) {
        sf2 c2;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return sf2.c("null pkg");
        }
        if (str.equals(this.b)) {
            return sf2.b();
        }
        if (n92.e()) {
            c2 = n92.b(str, ky.d(this.a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 64);
                boolean d = ky.d(this.a);
                if (packageInfo == null) {
                    c2 = sf2.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        c2 = sf2.c("single cert required");
                    } else {
                        a32 a32Var = new a32(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        sf2 a = n92.a(str2, a32Var, d, false);
                        c2 = (!a.a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !n92.a(str2, a32Var, false, true).a) ? a : sf2.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                return sf2.d("no pkg ".concat(str), e);
            }
        }
        if (c2.a) {
            this.b = str;
        }
        return c2;
    }
}
