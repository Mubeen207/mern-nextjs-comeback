package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SigningInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import androidx.appcompat.view.menu.fh0;
import androidx.appcompat.view.menu.jo0;
import androidx.appcompat.view.menu.u6;
import java.util.ArrayList;
import java.util.HashSet;
/* loaded from: classes.dex */
public abstract class ch0 {
    public static boolean a(z6 z6Var, ApplicationInfo applicationInfo) {
        return y3.b(applicationInfo.packageName) || !z6Var.m || z6Var.o;
    }

    public static void b(ApplicationInfo applicationInfo) {
        HashSet hashSet = new HashSet();
        if (!y8.f()) {
            hashSet.add("/system/framework/org.apache.http.legacy.boot.jar");
        } else if (qr.e("/system/framework/org.apache.http.legacy.jar")) {
            hashSet.add("/system/framework/org.apache.http.legacy.jar");
        } else {
            hashSet.add("/system/framework/org.apache.http.legacy.boot.jar");
        }
        applicationInfo.sharedLibraryFiles = (String[]) hashSet.toArray(new String[0]);
    }

    public static ActivityInfo c(u6.b bVar, int i, z6 z6Var, int i2) {
        if (a(z6Var, bVar.f.applicationInfo)) {
            return null;
        }
        ActivityInfo activityInfo = new ActivityInfo(bVar.f);
        activityInfo.metaData = bVar.d;
        activityInfo.processName = x6.v2(activityInfo.packageName, activityInfo.processName);
        activityInfo.applicationInfo = d(bVar.a, i, z6Var, i2);
        return activityInfo;
    }

    public static ApplicationInfo d(u6 u6Var, int i, z6 z6Var, int i2) {
        if (a(z6Var, u6Var.E)) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = bv0.r().getApplicationInfo(bv0.o(), i);
            String str = u6Var.G;
            if (u6Var.E == null) {
                u6Var.E = bv0.r().getPackageArchiveInfo(str, 0).applicationInfo;
            }
            ApplicationInfo applicationInfo2 = new ApplicationInfo(u6Var.E);
            if ((i & PackageParser.PARSE_IS_PRIVILEGED) != 0) {
                applicationInfo2.metaData = u6Var.w;
            }
            applicationInfo2.dataDir = ov0.i(applicationInfo2.packageName, i2).getAbsolutePath();
            if (!u6Var.K.b(1)) {
                applicationInfo2.nativeLibraryDir = ov0.c(applicationInfo2.packageName).getAbsolutePath();
            }
            applicationInfo2.processName = x6.v2(u6Var.y, applicationInfo2.packageName);
            applicationInfo2.publicSourceDir = str;
            applicationInfo2.sourceDir = str;
            applicationInfo2.uid = u6Var.x.n;
            if (y8.a()) {
                z3.b.e(applicationInfo2, Build.CPU_ABI);
                jo0.b bVar = z3.c;
                bVar.e(applicationInfo2, bVar.c(applicationInfo));
                jo0.b bVar2 = z3.d;
                bVar2.e(applicationInfo2, bVar2.c(applicationInfo));
            }
            String absolutePath = ov0.l(u6Var.y, i2).getAbsolutePath();
            applicationInfo2.deviceProtectedDataDir = absolutePath;
            jo0.b bVar3 = b4.d;
            if (bVar3 != null) {
                bVar3.e(applicationInfo2, absolutePath);
            }
            jo0.b bVar4 = b4.b;
            if (bVar4 != null) {
                bVar4.e(applicationInfo2, applicationInfo2.dataDir);
            }
            jo0.b bVar5 = b4.d;
            if (bVar5 != null) {
                bVar5.e(applicationInfo2, applicationInfo2.deviceProtectedDataDir);
            }
            jo0.b bVar6 = b4.c;
            if (bVar6 != null) {
                bVar6.e(applicationInfo2, applicationInfo2.dataDir);
            }
            b(applicationInfo2);
            return applicationInfo2;
        } catch (Exception unused) {
            return null;
        }
    }

    public static InstrumentationInfo e(u6.e eVar, int i) {
        if (eVar == null) {
            return null;
        }
        if ((i & PackageParser.PARSE_IS_PRIVILEGED) == 0) {
            return eVar.f;
        }
        InstrumentationInfo instrumentationInfo = new InstrumentationInfo(eVar.f);
        instrumentationInfo.metaData = eVar.d;
        return instrumentationInfo;
    }

    public static PackageInfo f(u6 u6Var, int i, long j, long j2, z6 z6Var, int i2) {
        PackageInfo packageInfo;
        String[] strArr;
        if (a(z6Var, u6Var.E)) {
            return null;
        }
        PackageInfo packageInfo2 = new PackageInfo();
        packageInfo2.packageName = u6Var.y;
        packageInfo2.versionCode = u6Var.D;
        packageInfo2.versionName = u6Var.F;
        packageInfo2.sharedUserId = u6Var.A;
        packageInfo2.sharedUserLabel = u6Var.H;
        packageInfo2.applicationInfo = d(u6Var, i, z6Var, i2);
        packageInfo2.firstInstallTime = j;
        packageInfo2.lastUpdateTime = j2;
        if (!u6Var.t.isEmpty()) {
            String[] strArr2 = new String[u6Var.t.size()];
            u6Var.t.toArray(strArr2);
            packageInfo2.requestedPermissions = strArr2;
        }
        if ((i & PackageParser.PARSE_COLLECT_CERTIFICATES) != 0) {
            packageInfo2.gids = new int[0];
        }
        if ((i & 16384) != 0) {
            ArrayList arrayList = u6Var.I;
            int size = arrayList != null ? arrayList.size() : 0;
            if (size > 0) {
                ConfigurationInfo[] configurationInfoArr = new ConfigurationInfo[size];
                packageInfo2.configPreferences = configurationInfoArr;
                u6Var.I.toArray(configurationInfoArr);
            }
            ArrayList arrayList2 = u6Var.J;
            int size2 = arrayList2 != null ? arrayList2.size() : 0;
            if (size2 > 0) {
                FeatureInfo[] featureInfoArr = new FeatureInfo[size2];
                packageInfo2.reqFeatures = featureInfoArr;
                u6Var.J.toArray(featureInfoArr);
            }
        }
        if ((i & 1) != 0) {
            packageInfo2.activities = null;
            int size3 = u6Var.m.size();
            if (size3 > 0) {
                ActivityInfo[] activityInfoArr = new ActivityInfo[size3];
                int i3 = 0;
                int i4 = 0;
                while (i3 < size3) {
                    activityInfoArr[i4] = c((u6.b) u6Var.m.get(i3), i, z6Var, i2);
                    i3++;
                    i4++;
                }
                packageInfo2.activities = (ActivityInfo[]) r4.f(activityInfoArr, i4);
            }
        }
        if ((i & 2) != 0) {
            packageInfo2.receivers = null;
            int size4 = u6Var.n.size();
            if (size4 > 0) {
                ActivityInfo[] activityInfoArr2 = new ActivityInfo[size4];
                int i5 = 0;
                int i6 = 0;
                while (i5 < size4) {
                    activityInfoArr2[i6] = c((u6.b) u6Var.n.get(i5), i, z6Var, i2);
                    i5++;
                    i6++;
                }
                packageInfo2.receivers = (ActivityInfo[]) r4.f(activityInfoArr2, i6);
            }
        }
        if ((i & 4) != 0) {
            packageInfo2.services = null;
            int size5 = u6Var.p.size();
            if (size5 > 0) {
                ServiceInfo[] serviceInfoArr = new ServiceInfo[size5];
                int i7 = 0;
                int i8 = 0;
                while (i7 < size5) {
                    serviceInfoArr[i8] = j((u6.k) u6Var.p.get(i7), i, z6Var, i2);
                    i7++;
                    i8++;
                }
                packageInfo2.services = (ServiceInfo[]) r4.f(serviceInfoArr, i8);
            }
        }
        if ((i & 8) != 0) {
            packageInfo2.providers = null;
            int size6 = u6Var.o.size();
            if (size6 > 0) {
                ProviderInfo[] providerInfoArr = new ProviderInfo[size6];
                int i9 = 0;
                for (int i10 = 0; i10 < size6; i10++) {
                    ProviderInfo i11 = i((u6.i) u6Var.o.get(i10), i, z6Var, i2);
                    if (i11 != null) {
                        providerInfoArr[i9] = i11;
                        i9++;
                    }
                }
                packageInfo2.providers = (ProviderInfo[]) r4.f(providerInfoArr, i9);
            }
        }
        if ((i & 16) != 0) {
            packageInfo2.instrumentation = null;
            int size7 = u6Var.q.size();
            if (size7 > 0) {
                packageInfo2.instrumentation = new InstrumentationInfo[size7];
                for (int i12 = 0; i12 < size7; i12++) {
                    packageInfo2.instrumentation[i12] = e((u6.e) u6Var.q.get(i12), i);
                }
            }
        }
        if ((i & 4096) != 0) {
            packageInfo2.permissions = null;
            int size8 = u6Var.r.size();
            if (size8 > 0) {
                packageInfo2.permissions = new PermissionInfo[size8];
                for (int i13 = 0; i13 < size8; i13++) {
                    packageInfo2.permissions[i13] = h((u6.g) u6Var.r.get(i13), i);
                }
            }
            packageInfo2.requestedPermissions = null;
            int size9 = u6Var.t.size();
            if (size9 > 0) {
                packageInfo2.requestedPermissions = new String[size9];
                packageInfo2.requestedPermissionsFlags = new int[size9];
                for (int i14 = 0; i14 < size9; i14++) {
                    packageInfo2.requestedPermissions[i14] = (String) u6Var.t.get(i14);
                }
            }
        }
        try {
            packageInfo = bv0.r().getPackageInfo(u6Var.y, i);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo != null && (strArr = packageInfo.splitNames) != null) {
            packageInfo2.splitNames = strArr;
        }
        if ((i & 64) != 0) {
            if (packageInfo == null) {
                packageInfo2.signatures = u6Var.u;
            } else {
                packageInfo2.signatures = packageInfo.signatures;
            }
        }
        if (y8.e() && (i & 134217728) != 0) {
            if (packageInfo == null) {
                fh0.a.b.e(null, u6Var.v.m);
                packageInfo2.signingInfo = (SigningInfo) pu0.b.b(new Object[0]);
            } else {
                packageInfo2.signingInfo = packageInfo.signingInfo;
            }
        }
        return packageInfo2;
    }

    public static PackageInfo g(y6 y6Var, int i, z6 z6Var, int i2) {
        u6 u6Var;
        if (y6Var == null || (u6Var = y6Var.m) == null) {
            return null;
        }
        try {
            return f(u6Var, i, 0L, 0L, z6Var, i2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static PermissionInfo h(u6.g gVar, int i) {
        if (gVar == null) {
            return null;
        }
        if ((i & PackageParser.PARSE_IS_PRIVILEGED) == 0) {
            return gVar.f;
        }
        PermissionInfo permissionInfo = new PermissionInfo(gVar.f);
        permissionInfo.metaData = gVar.d;
        return permissionInfo;
    }

    public static ProviderInfo i(u6.i iVar, int i, z6 z6Var, int i2) {
        if (a(z6Var, iVar.f.applicationInfo)) {
            return null;
        }
        ProviderInfo providerInfo = new ProviderInfo(iVar.f);
        if (providerInfo.authority == null) {
            return null;
        }
        providerInfo.metaData = iVar.d;
        providerInfo.processName = x6.v2(providerInfo.packageName, providerInfo.processName);
        if ((i & 2048) == 0) {
            providerInfo.uriPermissionPatterns = null;
        }
        providerInfo.applicationInfo = d(iVar.a, i, z6Var, i2);
        return providerInfo;
    }

    public static ServiceInfo j(u6.k kVar, int i, z6 z6Var, int i2) {
        if (a(z6Var, kVar.f.applicationInfo)) {
            return null;
        }
        ServiceInfo serviceInfo = new ServiceInfo(kVar.f);
        serviceInfo.metaData = kVar.d;
        serviceInfo.processName = x6.v2(serviceInfo.packageName, serviceInfo.processName);
        serviceInfo.applicationInfo = d(kVar.a, i, z6Var, i2);
        return serviceInfo;
    }

    public static Resources k(Context context, ApplicationInfo applicationInfo) {
        y6 z2 = x6.w2().z2(applicationInfo.packageName);
        if (z2 != null) {
            AssetManager assetManager = (AssetManager) a5.b.b(new Object[0]);
            a5.c.b(assetManager, z2.m.G);
            Resources resources = context.getResources();
            return new Resources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
        }
        return null;
    }
}
