package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class tf1 extends iz1 {
    public Boolean b;
    public zf1 c;
    public Boolean d;

    public tf1(fx1 fx1Var) {
        super(fx1Var);
        this.c = new zf1() { // from class: androidx.appcompat.view.menu.cg1
            @Override // androidx.appcompat.view.menu.zf1
            public final String c(String str, String str2) {
                return null;
            }
        };
    }

    public static long G() {
        return ((Long) vi1.f.a(null)).longValue();
    }

    public static long M() {
        return ((Long) vi1.F.a(null)).longValue();
    }

    private final String c(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            pj0.i(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            l().G().b("Could not find SystemProperties class", e);
            return str2;
        } catch (IllegalAccessException e2) {
            l().G().b("Could not access SystemProperties.get()", e2);
            return str2;
        } catch (NoSuchMethodException e3) {
            l().G().b("Could not find SystemProperties.get() method", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            l().G().b("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }

    public final int A(String str) {
        return u(str, vi1.q);
    }

    public final boolean B(String str, xs1 xs1Var) {
        return D(str, xs1Var);
    }

    public final long C(String str) {
        return x(str, vi1.c);
    }

    public final boolean D(String str, xs1 xs1Var) {
        if (str == null) {
            return ((Boolean) xs1Var.a(null)).booleanValue();
        }
        String c = this.c.c(str, xs1Var.b());
        return TextUtils.isEmpty(c) ? ((Boolean) xs1Var.a(null)).booleanValue() : ((Boolean) xs1Var.a(Boolean.valueOf("1".equals(c)))).booleanValue();
    }

    public final int E() {
        return j().b0(201500000, true) ? 100 : 25;
    }

    public final Boolean F(String str) {
        pj0.e(str);
        Bundle U = U();
        if (U == null) {
            l().G().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (U.containsKey(str)) {
            return Boolean.valueOf(U.getBoolean(str));
        } else {
            return null;
        }
    }

    public final String H(String str) {
        return z(str, vi1.N);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List I(java.lang.String r4) {
        /*
            r3 = this;
            androidx.appcompat.view.menu.pj0.e(r4)
            android.os.Bundle r0 = r3.U()
            r1 = 0
            if (r0 != 0) goto L19
            androidx.appcompat.view.menu.st1 r4 = r3.l()
            androidx.appcompat.view.menu.vt1 r4 = r4.G()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.a()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            androidx.appcompat.view.menu.st1 r0 = r3.l()
            androidx.appcompat.view.menu.vt1 r0 = r0.G()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.tf1.I(java.lang.String):java.util.List");
    }

    public final boolean J(String str) {
        return D(str, vi1.M);
    }

    public final boolean K(String str) {
        return "1".equals(this.c.c(str, "gaia_collection_enabled"));
    }

    public final boolean L(String str) {
        return "1".equals(this.c.c(str, "measurement.event_sampling_enabled"));
    }

    public final String N() {
        return c("debug.firebase.analytics.app", "");
    }

    public final String O() {
        return c("debug.deferred.deeplink", "");
    }

    public final boolean P() {
        Boolean F = F("google_analytics_adid_collection_enabled");
        return F == null || F.booleanValue();
    }

    public final boolean Q() {
        Boolean F = F("google_analytics_automatic_screen_reporting_enabled");
        return F == null || F.booleanValue();
    }

    public final boolean R() {
        Boolean F = F("firebase_analytics_collection_deactivated");
        return F != null && F.booleanValue();
    }

    public final boolean S() {
        if (this.b == null) {
            Boolean F = F("app_measurement_lite");
            this.b = F;
            if (F == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.t();
    }

    public final boolean T() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        ApplicationInfo applicationInfo = a().getApplicationInfo();
                        String a = gk0.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            this.d = Boolean.valueOf(str != null && str.equals(a));
                        }
                        if (this.d == null) {
                            this.d = Boolean.TRUE;
                            l().G().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.d.booleanValue();
    }

    public final Bundle U() {
        try {
            if (a().getPackageManager() == null) {
                l().G().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = va1.a(a()).c(a().getPackageName(), PackageParser.PARSE_IS_PRIVILEGED);
            if (c == null) {
                l().G().a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return c.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            l().G().b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ cc b() {
        return super.b();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ pf1 d() {
        return super.d();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ tf1 e() {
        return super.e();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ fi1 f() {
        return super.f();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ pt1 g() {
        return super.g();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ mw1 h() {
        return super.h();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ wu1 i() {
        return super.i();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ aa2 j() {
        return super.j();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ st1 l() {
        return super.l();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final double o(String str, xs1 xs1Var) {
        if (str == null) {
            return ((Double) xs1Var.a(null)).doubleValue();
        }
        String c = this.c.c(str, xs1Var.b());
        if (TextUtils.isEmpty(c)) {
            return ((Double) xs1Var.a(null)).doubleValue();
        }
        try {
            return ((Double) xs1Var.a(Double.valueOf(Double.parseDouble(c)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) xs1Var.a(null)).doubleValue();
        }
    }

    public final int p(String str) {
        return q(str, vi1.J, 500, 2000);
    }

    public final int q(String str, xs1 xs1Var, int i, int i2) {
        return Math.max(Math.min(u(str, xs1Var), i2), i);
    }

    public final void r(zf1 zf1Var) {
        this.c = zf1Var;
    }

    public final boolean s(xs1 xs1Var) {
        return D(null, xs1Var);
    }

    public final int t(String str) {
        return (wb2.a() && e().D(null, vi1.b1)) ? 500 : 100;
    }

    public final int u(String str, xs1 xs1Var) {
        if (str == null) {
            return ((Integer) xs1Var.a(null)).intValue();
        }
        String c = this.c.c(str, xs1Var.b());
        if (TextUtils.isEmpty(c)) {
            return ((Integer) xs1Var.a(null)).intValue();
        }
        try {
            return ((Integer) xs1Var.a(Integer.valueOf(Integer.parseInt(c)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) xs1Var.a(null)).intValue();
        }
    }

    public final int v() {
        return (bc2.a() && e().D(null, vi1.I0) && j().b0(231100000, true)) ? 35 : 0;
    }

    public final int w(String str) {
        return Math.max(t(str), (int) PackageParser.PARSE_COLLECT_CERTIFICATES);
    }

    public final long x(String str, xs1 xs1Var) {
        if (str == null) {
            return ((Long) xs1Var.a(null)).longValue();
        }
        String c = this.c.c(str, xs1Var.b());
        if (TextUtils.isEmpty(c)) {
            return ((Long) xs1Var.a(null)).longValue();
        }
        try {
            return ((Long) xs1Var.a(Long.valueOf(Long.parseLong(c)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) xs1Var.a(null)).longValue();
        }
    }

    public final int y(String str) {
        return q(str, vi1.K, 25, 100);
    }

    public final String z(String str, xs1 xs1Var) {
        return str == null ? (String) xs1Var.a(null) : (String) xs1Var.a(this.c.c(str, xs1Var.b()));
    }
}
