package androidx.appcompat.view.menu;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class fx1 implements lz1 {
    public static volatile fx1 I;
    public volatile Boolean A;
    public Boolean B;
    public Boolean C;
    public volatile boolean D;
    public int E;
    public int F;
    public final long H;
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final pf1 f;
    public final tf1 g;
    public final wu1 h;
    public final st1 i;
    public final mw1 j;
    public final b72 k;
    public final aa2 l;
    public final pt1 m;
    public final cc n;
    public final u32 o;
    public final g02 p;
    public final rh1 q;
    public final k32 r;
    public final String s;
    public it1 t;
    public k42 u;
    public fi1 v;
    public ct1 w;
    public Boolean y;
    public long z;
    public boolean x = false;
    public AtomicInteger G = new AtomicInteger(0);

    public fx1(b02 b02Var) {
        Bundle bundle;
        boolean z = false;
        pj0.i(b02Var);
        pf1 pf1Var = new pf1(b02Var.a);
        this.f = pf1Var;
        ds1.a = pf1Var;
        Context context = b02Var.a;
        this.a = context;
        this.b = b02Var.b;
        this.c = b02Var.c;
        this.d = b02Var.d;
        this.e = b02Var.h;
        this.A = b02Var.e;
        this.s = b02Var.j;
        this.D = true;
        mn1 mn1Var = b02Var.g;
        if (mn1Var != null && (bundle = mn1Var.s) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = mn1Var.s.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        rv1.l(context);
        cc d = kj.d();
        this.n = d;
        Long l = b02Var.i;
        this.H = l != null ? l.longValue() : d.a();
        this.g = new tf1(this);
        wu1 wu1Var = new wu1(this);
        wu1Var.p();
        this.h = wu1Var;
        st1 st1Var = new st1(this);
        st1Var.p();
        this.i = st1Var;
        aa2 aa2Var = new aa2(this);
        aa2Var.p();
        this.l = aa2Var;
        this.m = new pt1(new zz1(b02Var, this));
        this.q = new rh1(this);
        u32 u32Var = new u32(this);
        u32Var.w();
        this.o = u32Var;
        g02 g02Var = new g02(this);
        g02Var.w();
        this.p = g02Var;
        b72 b72Var = new b72(this);
        b72Var.w();
        this.k = b72Var;
        k32 k32Var = new k32(this);
        k32Var.p();
        this.r = k32Var;
        mw1 mw1Var = new mw1(this);
        mw1Var.p();
        this.j = mw1Var;
        mn1 mn1Var2 = b02Var.g;
        if (mn1Var2 != null && mn1Var2.n != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (context.getApplicationContext() instanceof Application) {
            g02 H = H();
            if (H.a().getApplicationContext() instanceof Application) {
                Application application = (Application) H.a().getApplicationContext();
                if (H.c == null) {
                    H.c = new u22(H);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(H.c);
                    application.registerActivityLifecycleCallbacks(H.c);
                    H.l().K().a("Registered activity lifecycle callback");
                }
            }
        } else {
            l().L().a("Application context is not an Application");
        }
        mw1Var.D(new hx1(this, b02Var));
    }

    public static fx1 c(Context context, mn1 mn1Var, Long l) {
        Bundle bundle;
        if (mn1Var != null && (mn1Var.q == null || mn1Var.r == null)) {
            mn1Var = new mn1(mn1Var.m, mn1Var.n, mn1Var.o, mn1Var.p, null, null, mn1Var.s, null);
        }
        pj0.i(context);
        pj0.i(context.getApplicationContext());
        if (I == null) {
            synchronized (fx1.class) {
                try {
                    if (I == null) {
                        I = new fx1(new b02(context, mn1Var, l));
                    }
                } finally {
                }
            }
        } else if (mn1Var != null && (bundle = mn1Var.s) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            pj0.i(I);
            I.m(mn1Var.s.getBoolean("dataCollectionDefaultEnabled"));
        }
        pj0.i(I);
        return I;
    }

    public static void f(fp1 fp1Var) {
        if (fp1Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (fp1Var.z()) {
            return;
        }
        String valueOf = String.valueOf(fp1Var.getClass());
        throw new IllegalStateException("Component not initialized: " + valueOf);
    }

    public static /* synthetic */ void g(fx1 fx1Var, b02 b02Var) {
        fx1Var.h().n();
        fi1 fi1Var = new fi1(fx1Var);
        fi1Var.p();
        fx1Var.v = fi1Var;
        ct1 ct1Var = new ct1(fx1Var, b02Var.f);
        ct1Var.w();
        fx1Var.w = ct1Var;
        it1 it1Var = new it1(fx1Var);
        it1Var.w();
        fx1Var.t = it1Var;
        k42 k42Var = new k42(fx1Var);
        k42Var.w();
        fx1Var.u = k42Var;
        fx1Var.l.q();
        fx1Var.h.q();
        fx1Var.w.x();
        fx1Var.l().J().b("App measurement initialized, version", 82001L);
        fx1Var.l().J().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String F = ct1Var.F();
        if (TextUtils.isEmpty(fx1Var.b)) {
            if (fx1Var.L().F0(F)) {
                fx1Var.l().J().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                vt1 J = fx1Var.l().J();
                J.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + F);
            }
        }
        fx1Var.l().F().a("Debug-level message logging enabled");
        if (fx1Var.E != fx1Var.G.get()) {
            fx1Var.l().G().c("Not all components initialized", Integer.valueOf(fx1Var.E), Integer.valueOf(fx1Var.G.get()));
        }
        fx1Var.x = true;
    }

    public static void i(gz1 gz1Var) {
        if (gz1Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (gz1Var.r()) {
            return;
        }
        String valueOf = String.valueOf(gz1Var.getClass());
        throw new IllegalStateException("Component not initialized: " + valueOf);
    }

    public static void j(iz1 iz1Var) {
        if (iz1Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public final fi1 A() {
        i(this.v);
        return this.v;
    }

    public final ct1 B() {
        f(this.w);
        return this.w;
    }

    public final it1 C() {
        f(this.t);
        return this.t;
    }

    public final pt1 D() {
        return this.m;
    }

    public final st1 E() {
        st1 st1Var = this.i;
        if (st1Var == null || !st1Var.r()) {
            return null;
        }
        return this.i;
    }

    public final wu1 F() {
        j(this.h);
        return this.h;
    }

    public final mw1 G() {
        return this.j;
    }

    public final g02 H() {
        f(this.p);
        return this.p;
    }

    public final u32 I() {
        f(this.o);
        return this.o;
    }

    public final k42 J() {
        f(this.u);
        return this.u;
    }

    public final b72 K() {
        f(this.k);
        return this.k;
    }

    public final aa2 L() {
        j(this.l);
        return this.l;
    }

    public final String M() {
        return this.b;
    }

    public final String N() {
        return this.c;
    }

    public final String O() {
        return this.d;
    }

    public final String P() {
        return this.s;
    }

    public final void Q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public final void R() {
        this.G.incrementAndGet();
    }

    @Override // androidx.appcompat.view.menu.lz1
    public final Context a() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.lz1
    public final cc b() {
        return this.n;
    }

    @Override // androidx.appcompat.view.menu.lz1
    public final pf1 d() {
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
        if (r1.z() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(androidx.appcompat.view.menu.mn1 r10) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.fx1.e(androidx.appcompat.view.menu.mn1):void");
    }

    @Override // androidx.appcompat.view.menu.lz1
    public final mw1 h() {
        i(this.j);
        return this.j;
    }

    public final /* synthetic */ void k(String str, int i, Throwable th, byte[] bArr, Map map) {
        if ((i != 200 && i != 204 && i != 304) || th != null) {
            l().L().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        F().t.a(true);
        if (bArr == null || bArr.length == 0) {
            l().F().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            String optString3 = jSONObject.optString("gbraid", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                l().F().a("Deferred Deep Link is empty.");
                return;
            }
            Bundle bundle = new Bundle();
            if (qb2.a() && this.g.s(vi1.Z0)) {
                if (!L().K0(optString)) {
                    l().L().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                }
                bundle.putString("gbraid", optString3);
            } else if (!L().K0(optString)) {
                l().L().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.p.z0("auto", "_cmp", bundle);
            aa2 L = L();
            if (TextUtils.isEmpty(optString) || !L.h0(optString, optDouble)) {
                return;
            }
            L.a().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e) {
            l().G().b("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }

    @Override // androidx.appcompat.view.menu.lz1
    public final st1 l() {
        i(this.i);
        return this.i;
    }

    public final void m(boolean z) {
        this.A = Boolean.valueOf(z);
    }

    public final void n() {
        this.E++;
    }

    public final boolean o() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean p() {
        return x() == 0;
    }

    public final boolean q() {
        h().n();
        return this.D;
    }

    public final boolean r() {
        return TextUtils.isEmpty(this.b);
    }

    public final boolean s() {
        if (this.x) {
            h().n();
            Boolean bool = this.y;
            if (bool == null || this.z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.n.b() - this.z) > 1000)) {
                this.z = this.n.b();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(L().E0("android.permission.INTERNET") && L().E0("android.permission.ACCESS_NETWORK_STATE") && (va1.a(this.a).f() || this.g.S() || (aa2.c0(this.a) && aa2.d0(this.a, false))));
                this.y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!L().j0(B().G(), B().E()) && TextUtils.isEmpty(B().E())) {
                        z = false;
                    }
                    this.y = Boolean.valueOf(z);
                }
            }
            return this.y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean t() {
        return this.e;
    }

    public final boolean u() {
        h().n();
        i(v());
        String F = B().F();
        Pair u = F().u(F);
        if (!this.g.P() || ((Boolean) u.second).booleanValue() || TextUtils.isEmpty((CharSequence) u.first)) {
            l().F().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        } else if (!v().w()) {
            l().L().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            if (qa2.a() && this.g.s(vi1.U0)) {
                g02 H = H();
                H.n();
                kg1 V = H.t().V();
                Bundle bundle = V != null ? V.m : null;
                if (bundle == null) {
                    int i = this.F;
                    this.F = i + 1;
                    boolean z = i < 10;
                    vt1 F2 = l().F();
                    String str = z ? "Retrying." : "Skipping.";
                    F2.b("Failed to retrieve DMA consent from the service, " + str + " retryCount", Integer.valueOf(this.F));
                    return z;
                }
                oz1 c = oz1.c(bundle, 100);
                sb.append("&gcs=");
                sb.append(c.w());
                ih1 b = ih1.b(bundle, 100);
                sb.append("&dma=");
                sb.append(b.g() == Boolean.FALSE ? 0 : 1);
                if (!TextUtils.isEmpty(b.h())) {
                    sb.append("&dma_cps=");
                    sb.append(b.h());
                }
                int i2 = ih1.d(bundle) == Boolean.TRUE ? 0 : 1;
                sb.append("&npa=");
                sb.append(i2);
                l().K().b("Consent query parameters to Bow", sb);
            }
            aa2 L = L();
            B();
            URL J = L.J(82001L, F, (String) u.first, F().u.a() - 1, sb.toString());
            if (J != null) {
                k32 v = v();
                i32 i32Var = new i32() { // from class: androidx.appcompat.view.menu.jx1
                    @Override // androidx.appcompat.view.menu.i32
                    public final void a(String str2, int i3, Throwable th, byte[] bArr, Map map) {
                        fx1.this.k(str2, i3, th, bArr, map);
                    }
                };
                v.n();
                v.o();
                pj0.i(J);
                pj0.i(i32Var);
                v.h().z(new o32(v, F, J, null, null, i32Var));
            }
            return false;
        }
    }

    public final k32 v() {
        i(this.r);
        return this.r;
    }

    public final void w(boolean z) {
        h().n();
        this.D = z;
    }

    public final int x() {
        h().n();
        if (this.g.R()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool == null || !bool.booleanValue()) {
            if (q()) {
                Boolean M = F().M();
                if (M != null) {
                    return M.booleanValue() ? 0 : 3;
                }
                Boolean F = this.g.F("firebase_analytics_collection_enabled");
                if (F != null) {
                    return F.booleanValue() ? 0 : 4;
                }
                Boolean bool2 = this.B;
                return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.A == null || this.A.booleanValue()) ? 0 : 7;
            }
            return 8;
        }
        return 2;
    }

    public final rh1 y() {
        rh1 rh1Var = this.q;
        if (rh1Var != null) {
            return rh1Var;
        }
        throw new IllegalStateException("Component not created");
    }

    public final tf1 z() {
        return this.g;
    }
}
