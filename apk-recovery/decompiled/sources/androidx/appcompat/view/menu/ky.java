package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public abstract class ky {
    public static final int a = 12451000;
    public static boolean c = false;
    public static boolean d = false;
    public static final AtomicBoolean b = new AtomicBoolean();
    public static final AtomicBoolean e = new AtomicBoolean();

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static String b(int i) {
        return ef.p(i);
    }

    public static Resources c(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean d(Context context) {
        if (!d) {
            try {
                PackageInfo e2 = va1.a(context).e("com.google.android.gms", 64);
                ly.a(context);
                if (e2 == null || ly.e(e2, false) || !ly.e(e2, true)) {
                    c = false;
                } else {
                    c = true;
                }
                d = true;
            } catch (PackageManager.NameNotFoundException unused) {
                d = true;
            } catch (Throwable th) {
                d = true;
                throw th;
            }
        }
        return c || !rl.b();
    }

    public static int e(Context context, int i) {
        PackageInfo packageInfo;
        try {
            context.getResources().getString(cn0.a);
        } catch (Throwable unused) {
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !e.get()) {
            int a2 = xf1.a(context);
            if (a2 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (a2 != a) {
                throw new GooglePlayServicesIncorrectManifestValueException(a2);
            }
        }
        boolean z = (rl.d(context) || rl.f(context)) ? false : true;
        pj0.a(i >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing.");
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            ly.a(context);
            if (ly.e(packageInfo2, true)) {
                if (z) {
                    pj0.i(packageInfo);
                    if (!ly.e(packageInfo, true)) {
                        String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid.");
                    }
                }
                if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    if (qe1.a(packageInfo2.versionCode) >= qe1.a(i)) {
                        ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException unused3) {
                                String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info.");
                                return 1;
                            }
                        }
                        return !applicationInfo.enabled ? 3 : 0;
                    }
                    int i2 = packageInfo2.versionCode;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Google Play services out of date for ");
                    sb.append(packageName);
                    sb.append(".  Requires ");
                    sb.append(i);
                    sb.append(" but found ");
                    sb.append(i2);
                    return 2;
                }
                String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services.");
            } else {
                String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid.");
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused4) {
            String.valueOf(packageName).concat(" requires Google Play services, but they are missing.");
            return 1;
        }
    }

    public static boolean f(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return j(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean g(Context context) {
        if (ti0.c()) {
            Object systemService = context.getSystemService("user");
            pj0.i(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
        }
        return false;
    }

    public static boolean h(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    public static boolean i(Context context, int i, String str) {
        return k31.b(context, i, str);
    }

    public static boolean j(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (ti0.f()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !g(context);
    }
}
