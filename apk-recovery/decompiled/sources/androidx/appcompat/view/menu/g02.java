package androidx.appcompat.view.menu;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.appcompat.view.menu.oz1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
/* loaded from: classes.dex */
public final class g02 extends fp1 {
    public u22 c;
    public xz1 d;
    public final Set e;
    public boolean f;
    public final AtomicReference g;
    public final Object h;
    public boolean i;
    public PriorityQueue j;
    public oz1 k;
    public final AtomicLong l;
    public long m;
    public final ff2 n;
    public boolean o;
    public eh1 p;
    public final ea2 q;

    public g02(fx1 fx1Var) {
        super(fx1Var);
        this.e = new CopyOnWriteArraySet();
        this.h = new Object();
        this.i = false;
        this.o = true;
        this.q = new e22(this);
        this.g = new AtomicReference();
        this.k = oz1.c;
        this.m = -1L;
        this.l = new AtomicLong(0L);
        this.n = new ff2(fx1Var);
    }

    public static /* synthetic */ void N(g02 g02Var, oz1 oz1Var, long j, boolean z, boolean z2) {
        g02Var.n();
        g02Var.v();
        oz1 J = g02Var.i().J();
        if (j <= g02Var.m && oz1.k(J.b(), oz1Var.b())) {
            g02Var.l().J().b("Dropped out-of-date consent setting, proposed settings", oz1Var);
        } else if (!g02Var.i().A(oz1Var)) {
            g02Var.l().J().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(oz1Var.b()));
        } else {
            g02Var.m = j;
            g02Var.t().U(z);
            if (z2) {
                g02Var.t().Q(new AtomicReference());
            }
        }
    }

    public static /* synthetic */ void O(g02 g02Var, oz1 oz1Var, oz1 oz1Var2) {
        oz1.a aVar = oz1.a.ANALYTICS_STORAGE;
        oz1.a aVar2 = oz1.a.AD_STORAGE;
        boolean m = oz1Var.m(oz1Var2, aVar, aVar2);
        boolean r = oz1Var.r(oz1Var2, aVar, aVar2);
        if (m || r) {
            g02Var.p().I();
        }
    }

    @Override // androidx.appcompat.view.menu.fp1
    public final boolean A() {
        return false;
    }

    public final ArrayList C(String str, String str2) {
        if (h().J()) {
            l().G().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        } else if (pf1.a()) {
            l().G().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.a.h().v(atomicReference, 5000L, "get conditional user properties", new c22(this, atomicReference, null, str, str2));
            List list = (List) atomicReference.get();
            if (list == null) {
                l().G().b("Timed out waiting for get conditional user properties", null);
                return new ArrayList();
            }
            return aa2.t0(list);
        }
    }

    public final Map D(String str, String str2, boolean z) {
        if (h().J()) {
            l().G().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (pf1.a()) {
            l().G().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.a.h().v(atomicReference, 5000L, "get user properties", new b22(this, atomicReference, null, str, str2, z));
            List<y92> list = (List) atomicReference.get();
            if (list == null) {
                l().G().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            o4 o4Var = new o4(list.size());
            for (y92 y92Var : list) {
                Object d = y92Var.d();
                if (d != null) {
                    o4Var.put(y92Var.n, d);
                }
            }
            return o4Var;
        }
    }

    public final void E(long j, boolean z) {
        n();
        v();
        l().F().a("Resetting analytics data (FE)");
        b72 u = u();
        u.n();
        u.f.b();
        if (hd2.a() && e().s(vi1.x0)) {
            p().I();
        }
        boolean p = this.a.p();
        wu1 i = i();
        i.e.b(j);
        if (!TextUtils.isEmpty(i.i().v.a())) {
            i.v.b(null);
        }
        if (pb2.a() && i.e().s(vi1.q0)) {
            i.p.b(0L);
        }
        i.q.b(0L);
        if (!i.e().R()) {
            i.E(!p);
        }
        i.w.b(null);
        i.x.b(0L);
        i.y.b(null);
        if (z) {
            t().a0();
        }
        if (pb2.a() && e().s(vi1.q0)) {
            u().e.a();
        }
        this.o = !p;
    }

    public final /* synthetic */ void F(Bundle bundle) {
        if (bundle == null) {
            i().y.b(new Bundle());
            return;
        }
        Bundle a = i().y.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                j();
                if (aa2.g0(obj)) {
                    j();
                    aa2.X(this.q, 27, null, null, 0);
                }
                l().M().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (aa2.H0(str)) {
                l().M().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a.remove(str);
            } else if (j().k0("param", str, e().t(this.a.B().F()), obj)) {
                j().N(a, str, obj);
            }
        }
        j();
        if (aa2.f0(a, e().E())) {
            j();
            aa2.X(this.q, 26, null, null, 0);
            l().M().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        i().y.b(a);
        t().C(a);
    }

    public final void G(Bundle bundle, int i, long j) {
        v();
        String i2 = oz1.i(bundle);
        if (i2 != null) {
            l().M().b("Ignoring invalid consent setting", i2);
            l().M().a("Valid consent values are 'granted', 'denied'");
        }
        oz1 c = oz1.c(bundle, i);
        if (!qa2.a() || !e().s(vi1.S0)) {
            K(c, j);
            return;
        }
        if (c.z()) {
            K(c, j);
        }
        ih1 b = ih1.b(bundle, i);
        if (b.j()) {
            I(b);
        }
        Boolean d = ih1.d(bundle);
        if (d != null) {
            b0("app", "allow_personalized_ads", d.toString(), false);
        }
    }

    public final void H(Bundle bundle, long j) {
        pj0.i(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            l().L().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        pj0.i(bundle2);
        kz1.a(bundle2, "app_id", String.class, null);
        kz1.a(bundle2, "origin", String.class, null);
        kz1.a(bundle2, "name", String.class, null);
        kz1.a(bundle2, "value", Object.class, null);
        kz1.a(bundle2, "trigger_event_name", String.class, null);
        kz1.a(bundle2, "trigger_timeout", Long.class, 0L);
        kz1.a(bundle2, "timed_out_event_name", String.class, null);
        kz1.a(bundle2, "timed_out_event_params", Bundle.class, null);
        kz1.a(bundle2, "triggered_event_name", String.class, null);
        kz1.a(bundle2, "triggered_event_params", Bundle.class, null);
        kz1.a(bundle2, "time_to_live", Long.class, 0L);
        kz1.a(bundle2, "expired_event_name", String.class, null);
        kz1.a(bundle2, "expired_event_params", Bundle.class, null);
        pj0.e(bundle2.getString("name"));
        pj0.e(bundle2.getString("origin"));
        pj0.i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (j().q0(string) != 0) {
            l().G().b("Invalid conditional user property name", g().g(string));
        } else if (j().w(string, obj) != 0) {
            l().G().c("Invalid conditional user property value", g().g(string), obj);
        } else {
            Object A0 = j().A0(string, obj);
            if (A0 == null) {
                l().G().c("Unable to normalize conditional user property value", g().g(string), obj);
                return;
            }
            kz1.b(bundle2, A0);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
                l().G().c("Invalid conditional user property timeout", g().g(string), Long.valueOf(j2));
                return;
            }
            long j3 = bundle2.getLong("time_to_live");
            if (j3 > 15552000000L || j3 < 1) {
                l().G().c("Invalid conditional user property time to live", g().g(string), Long.valueOf(j3));
            } else {
                h().D(new a22(this, bundle2));
            }
        }
    }

    public final void I(ih1 ih1Var) {
        h().D(new s22(this, ih1Var));
    }

    public final void J(oz1 oz1Var) {
        n();
        boolean z = (oz1Var.y() && oz1Var.x()) || t().e0();
        if (z != this.a.q()) {
            this.a.w(z);
            Boolean L = i().L();
            if (!z || L == null || L.booleanValue()) {
                S(Boolean.valueOf(z), false);
            }
        }
    }

    public final void K(oz1 oz1Var, long j) {
        oz1 oz1Var2;
        boolean z;
        oz1 oz1Var3;
        boolean z2;
        boolean z3;
        v();
        int b = oz1Var.b();
        if (b != -10 && oz1Var.s() == null && oz1Var.u() == null) {
            l().M().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.h) {
            try {
                oz1Var2 = this.k;
                z = false;
                if (oz1.k(b, oz1Var2.b())) {
                    z3 = oz1Var.t(this.k);
                    if (oz1Var.y() && !this.k.y()) {
                        z = true;
                    }
                    oz1 p = oz1Var.p(this.k);
                    this.k = p;
                    oz1Var3 = p;
                    z2 = z;
                    z = true;
                } else {
                    oz1Var3 = oz1Var;
                    z2 = false;
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            l().J().b("Ignoring lower-priority consent settings, proposed settings", oz1Var3);
            return;
        }
        long andIncrement = this.l.getAndIncrement();
        if (z3) {
            T(null);
            h().G(new q22(this, oz1Var3, j, andIncrement, z2, oz1Var2));
            return;
        }
        w22 w22Var = new w22(this, oz1Var3, andIncrement, z2, oz1Var2);
        if (b == 30 || b == -10) {
            h().G(w22Var);
        } else {
            h().D(w22Var);
        }
    }

    public final void L(vz1 vz1Var) {
        v();
        pj0.i(vz1Var);
        if (this.e.add(vz1Var)) {
            return;
        }
        l().L().a("OnEventListener already registered");
    }

    public final void M(xz1 xz1Var) {
        xz1 xz1Var2;
        n();
        v();
        if (xz1Var != null && xz1Var != (xz1Var2 = this.d)) {
            pj0.m(xz1Var2 == null, "EventInterceptor already set.");
        }
        this.d = xz1Var;
    }

    public final void R(Boolean bool) {
        v();
        h().D(new m22(this, bool));
    }

    public final void S(Boolean bool, boolean z) {
        n();
        v();
        l().F().b("Setting app measurement enabled (FE)", bool);
        i().v(bool);
        if (z) {
            i().C(bool);
        }
        if (this.a.q() || !(bool == null || bool.booleanValue())) {
            t0();
        }
    }

    public final void T(String str) {
        this.g.set(str);
    }

    public final void U(String str, String str2, long j, Bundle bundle) {
        n();
        V(str, str2, j, bundle, true, this.d == null || aa2.H0(str2), true, null);
    }

    public final void V(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        long j2;
        String str4;
        g02 g02Var;
        String str5;
        String str6;
        int length;
        pj0.e(str);
        pj0.i(bundle);
        n();
        v();
        if (!this.a.p()) {
            l().F().a("Event not sent since app measurement is disabled");
            return;
        }
        List H = p().H();
        if (H != null && !H.contains(str2)) {
            l().F().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f) {
            this.f = true;
            try {
                try {
                    (!this.a.t() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, a().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, a());
                } catch (Exception e) {
                    l().L().b("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                l().J().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2)) {
            if (bundle.containsKey("gclid")) {
                a0("auto", "_lgclid", bundle.getString("gclid"), b().a());
            }
            if (qb2.a() && e().s(vi1.Z0) && bundle.containsKey("gbraid")) {
                a0("auto", "_gbraid", bundle.getString("gbraid"), b().a());
            }
        }
        if (z && aa2.L0(str2)) {
            j().M(bundle, i().y.a());
        }
        if (!z3 && !"_iap".equals(str2)) {
            aa2 L = this.a.L();
            int i = 2;
            if (L.C0("event", str2)) {
                if (!L.o0("event", qz1.a, qz1.b, str2)) {
                    i = 13;
                } else if (L.i0("event", 40, str2)) {
                    i = 0;
                }
            }
            if (i != 0) {
                l().H().b("Invalid public event name. Event will not be logged (FE)", g().c(str2));
                this.a.L();
                String I = aa2.I(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.a.L();
                aa2.X(this.q, i, "_ev", I, length);
                return;
            }
        }
        w32 C = s().C(false);
        if (C != null && !bundle.containsKey("_sc")) {
            C.d = true;
        }
        aa2.W(C, bundle, z && !z3);
        boolean equals = "am".equals(str);
        boolean H0 = aa2.H0(str2);
        if (z && this.d != null && !H0 && !equals) {
            l().F().c("Passing event to registered event handler (FE)", g().c(str2), g().a(bundle));
            pj0.i(this.d);
            this.d.a(str, str2, bundle, j);
        } else if (this.a.s()) {
            int v = j().v(str2);
            if (v != 0) {
                l().H().b("Invalid event name. Event will not be logged (FE)", g().c(str2));
                j();
                String I2 = aa2.I(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.a.L();
                aa2.Y(this.q, str3, v, "_ev", I2, length);
                return;
            }
            Bundle E = j().E(str3, str2, bundle, oc.c("_o", "_sn", "_sc", "_si"), z3);
            pj0.i(E);
            if (s().C(false) != null && "_ae".equals(str2)) {
                t72 t72Var = u().f;
                long b = t72Var.d.b().b();
                long j3 = b - t72Var.b;
                t72Var.b = b;
                if (j3 > 0) {
                    j().L(E, j3);
                }
            }
            if (wa2.a() && e().s(vi1.p0)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    aa2 j4 = j();
                    String string = E.getString("_ffr");
                    String trim = px0.a(string) ? null : string != null ? string.trim() : string;
                    if (ga2.a(trim, j4.i().v.a())) {
                        j4.l().F().a("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    j4.i().v.b(trim);
                } else if ("_ae".equals(str2)) {
                    String a = j().i().v.a();
                    if (!TextUtils.isEmpty(a)) {
                        E.putString("_ffr", a);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(E);
            boolean F = e().s(vi1.Q0) ? u().F() : i().s.b();
            if (i().p.a() > 0 && i().y(j) && F) {
                l().K().a("Current session is expired, remove the session number, ID, and engagement time");
                j2 = 0;
                str4 = "_ae";
                a0("auto", "_sid", null, b().a());
                a0("auto", "_sno", null, b().a());
                a0("auto", "_se", null, b().a());
                i().q.b(0L);
            } else {
                j2 = 0;
                str4 = "_ae";
            }
            if (E.getLong("extend_session", j2) == 1) {
                l().K().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                g02Var = this;
                g02Var.a.K().e.b(j, true);
            } else {
                g02Var = this;
            }
            ArrayList arrayList2 = new ArrayList(E.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                String str7 = (String) obj;
                if (str7 != null) {
                    j();
                    Bundle[] x0 = aa2.x0(E.get(str7));
                    if (x0 != null) {
                        E.putParcelableArray(str7, x0);
                    }
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) arrayList.get(i3);
                if (i3 != 0) {
                    str6 = "_ep";
                    str5 = str;
                } else {
                    str5 = str;
                    str6 = str2;
                }
                bundle2.putString("_o", str5);
                if (z2) {
                    bundle2 = j().r0(bundle2);
                }
                Bundle bundle3 = bundle2;
                t().E(new ri1(str6, new hi1(bundle3), str, j), str3);
                if (!equals) {
                    for (vz1 vz1Var : g02Var.e) {
                        vz1Var.a(str, str2, new Bundle(bundle3), j);
                    }
                }
            }
            if (s().C(false) == null || !str4.equals(str2)) {
                return;
            }
            u().E(true, true, b().b());
        }
    }

    public final void W(String str, String str2, long j, Object obj) {
        h().D(new p12(this, str, str2, obj, j));
    }

    public final void X(String str, String str2, Bundle bundle) {
        long a = b().a();
        pj0.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        h().D(new z12(this, bundle2));
    }

    public final void Y(String str, String str2, Bundle bundle, String str3) {
        m();
        x0(str, str2, b().a(), bundle, false, true, true, str3);
    }

    public final void Z(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            s().I(bundle2, j);
        } else {
            x0(str3, str2, j, bundle2, z2, !z2 || this.d == null || aa2.H0(str2), z, null);
        }
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            androidx.appcompat.view.menu.pj0.e(r9)
            androidx.appcompat.view.menu.pj0.e(r10)
            r8.n()
            r8.v()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L60
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L51
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L51
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            androidx.appcompat.view.menu.wu1 r0 = r8.i()
            androidx.appcompat.view.menu.jv1 r0 = r0.m
            long r4 = r10.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4b
            java.lang.String r11 = "true"
        L4b:
            r0.b(r11)
            r6 = r10
        L4f:
            r3 = r1
            goto L62
        L51:
            if (r11 != 0) goto L60
            androidx.appcompat.view.menu.wu1 r10 = r8.i()
            androidx.appcompat.view.menu.jv1 r10 = r10.m
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
            goto L4f
        L60:
            r3 = r10
            r6 = r11
        L62:
            androidx.appcompat.view.menu.fx1 r10 = r8.a
            boolean r10 = r10.p()
            if (r10 != 0) goto L78
            androidx.appcompat.view.menu.st1 r9 = r8.l()
            androidx.appcompat.view.menu.vt1 r9 = r9.K()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L78:
            androidx.appcompat.view.menu.fx1 r10 = r8.a
            boolean r10 = r10.s()
            if (r10 != 0) goto L81
            return
        L81:
            androidx.appcompat.view.menu.y92 r10 = new androidx.appcompat.view.menu.y92
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            androidx.appcompat.view.menu.k42 r9 = r8.t()
            r9.O(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g02.a0(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ cc b() {
        return super.b();
    }

    public final void b0(String str, String str2, Object obj, boolean z) {
        c0(str, str2, obj, z, b().a());
    }

    public final void c0(String str, String str2, Object obj, boolean z, long j) {
        int i;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (z) {
            i = j().q0(str2);
        } else {
            aa2 j2 = j();
            if (j2.C0("user property", str2)) {
                if (!j2.n0("user property", rz1.a, str2)) {
                    i = 15;
                } else if (j2.i0("user property", 24, str2)) {
                    i = 0;
                }
            }
            i = 6;
        }
        if (i != 0) {
            j();
            String I = aa2.I(str2, 24, true);
            r7 = str2 != null ? str2.length() : 0;
            this.a.L();
            aa2.X(this.q, i, "_ev", I, r7);
        } else if (obj == null) {
            W(str3, str2, j, null);
        } else {
            int w = j().w(str2, obj);
            if (w == 0) {
                Object A0 = j().A0(str2, obj);
                if (A0 != null) {
                    W(str3, str2, j, A0);
                    return;
                }
                return;
            }
            j();
            String I2 = aa2.I(str2, 24, true);
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                r7 = String.valueOf(obj).length();
            }
            this.a.L();
            aa2.X(this.q, w, "_ev", I2, r7);
        }
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ pf1 d() {
        return super.d();
    }

    public final /* synthetic */ void d0(List list) {
        boolean contains;
        n();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray H = i().H();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b82 b82Var = (b82) it.next();
                contains = H.contains(b82Var.o);
                if (!contains || ((Long) H.get(b82Var.o)).longValue() < b82Var.n) {
                    s0().add(b82Var);
                }
            }
            r0();
        }
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ tf1 e() {
        return super.e();
    }

    public final Boolean e0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) h().v(atomicReference, 15000L, "boolean test flag value", new f12(this, atomicReference));
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ fi1 f() {
        return super.f();
    }

    public final Double f0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) h().v(atomicReference, 15000L, "double test flag value", new o22(this, atomicReference));
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ pt1 g() {
        return super.g();
    }

    public final Integer g0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) h().v(atomicReference, 15000L, "int test flag value", new i22(this, atomicReference));
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ mw1 h() {
        return super.h();
    }

    public final Long h0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) h().v(atomicReference, 15000L, "long test flag value", new k22(this, atomicReference));
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ wu1 i() {
        return super.i();
    }

    public final String i0() {
        return (String) this.g.get();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ aa2 j() {
        return super.j();
    }

    public final String j0() {
        w32 P = this.a.I().P();
        if (P != null) {
            return P.b;
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.kr1, androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final String k0() {
        w32 P = this.a.I().P();
        if (P != null) {
            return P.a;
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ st1 l() {
        return super.l();
    }

    public final String l0() {
        if (this.a.M() != null) {
            return this.a.M();
        }
        try {
            return new ow1(a(), this.a.P()).b("google_app_id");
        } catch (IllegalStateException e) {
            this.a.l().G().b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    @Override // androidx.appcompat.view.menu.kr1, androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public final String m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) h().v(atomicReference, 15000L, "String test flag value", new w12(this, atomicReference));
    }

    @Override // androidx.appcompat.view.menu.kr1, androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final void n0() {
        Boolean F;
        n();
        v();
        if (this.a.s()) {
            if (e().s(vi1.k0) && (F = e().F("google_analytics_deferred_deep_link_enabled")) != null && F.booleanValue()) {
                l().F().a("Deferred Deep Link feature enabled.");
                h().D(new Runnable() { // from class: androidx.appcompat.view.menu.q02
                    @Override // java.lang.Runnable
                    public final void run() {
                        g02.this.q0();
                    }
                });
            }
            t().X();
            this.o = false;
            String N = i().N();
            if (TextUtils.isEmpty(N)) {
                return;
            }
            f().o();
            if (N.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", N);
            z0("auto", "_ou", bundle);
        }
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ rh1 o() {
        return super.o();
    }

    public final void o0() {
        if (!(a().getApplicationContext() instanceof Application) || this.c == null) {
            return;
        }
        ((Application) a().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ ct1 p() {
        return super.p();
    }

    public final void p0() {
        if (vc2.a() && e().s(vi1.M0)) {
            if (h().J()) {
                l().G().a("Cannot get trigger URIs from analytics worker thread");
            } else if (pf1.a()) {
                l().G().a("Cannot get trigger URIs from main thread");
            } else {
                v();
                l().K().a("Getting trigger URIs (FE)");
                final AtomicReference atomicReference = new AtomicReference();
                h().v(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: androidx.appcompat.view.menu.i02
                    @Override // java.lang.Runnable
                    public final void run() {
                        g02 g02Var = g02.this;
                        AtomicReference atomicReference2 = atomicReference;
                        Bundle a = g02Var.i().n.a();
                        k42 t = g02Var.t();
                        if (a == null) {
                            a = new Bundle();
                        }
                        t.R(atomicReference2, a);
                    }
                });
                final List list = (List) atomicReference.get();
                if (list == null) {
                    l().G().a("Timed out waiting for get trigger URIs");
                } else {
                    h().D(new Runnable() { // from class: androidx.appcompat.view.menu.o02
                        @Override // java.lang.Runnable
                        public final void run() {
                            g02.this.d0(list);
                        }
                    });
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ it1 q() {
        return super.q();
    }

    public final void q0() {
        n();
        if (i().t.b()) {
            l().F().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a = i().u.a();
        i().u.b(1 + a);
        if (a >= 5) {
            l().L().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            i().t.a(true);
        } else if (!qa2.a() || !e().s(vi1.U0)) {
            this.a.u();
        } else {
            if (this.p == null) {
                this.p = new t12(this, this.a);
            }
            this.p.b(0L);
        }
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ g02 r() {
        return super.r();
    }

    public final void r0() {
        b82 b82Var;
        nc0 Q0;
        n();
        if (s0().isEmpty() || this.i || (b82Var = (b82) s0().poll()) == null || (Q0 = j().Q0()) == null) {
            return;
        }
        this.i = true;
        l().K().b("Registering trigger URI", b82Var.m);
        m90 c = Q0.c(Uri.parse(b82Var.m));
        if (c == null) {
            this.i = false;
            s0().add(b82Var);
            return;
        }
        SparseArray H = i().H();
        H.put(b82Var.o, Long.valueOf(b82Var.n));
        wu1 i = i();
        int[] iArr = new int[H.size()];
        long[] jArr = new long[H.size()];
        for (int i2 = 0; i2 < H.size(); i2++) {
            iArr[i2] = H.keyAt(i2);
            jArr[i2] = ((Long) H.valueAt(i2)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        i.n.b(bundle);
        nx.a(c, new j12(this, b82Var), new x02(this));
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ u32 s() {
        return super.s();
    }

    public final PriorityQueue s0() {
        Comparator comparing;
        if (this.j == null) {
            comparing = Comparator.comparing(new Function() { // from class: androidx.appcompat.view.menu.d02
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((b82) obj).n);
                }
            }, new Comparator() { // from class: androidx.appcompat.view.menu.k02
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return (((Long) obj).longValue() > ((Long) obj2).longValue() ? 1 : (((Long) obj).longValue() == ((Long) obj2).longValue() ? 0 : -1));
                }
            });
            this.j = new PriorityQueue(comparing);
        }
        return this.j;
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ k42 t() {
        return super.t();
    }

    public final void t0() {
        n();
        String a = i().m.a();
        if (a != null) {
            if ("unset".equals(a)) {
                a0("app", "_npa", null, b().a());
            } else {
                a0("app", "_npa", Long.valueOf("true".equals(a) ? 1L : 0L), b().a());
            }
        }
        if (!this.a.p() || !this.o) {
            l().F().a("Updating Scion state (FE)");
            t().b0();
            return;
        }
        l().F().a("Recording app launch after enabling measurement for the first time (FE)");
        n0();
        if (pb2.a() && e().s(vi1.q0)) {
            u().e.a();
        }
        h().D(new n12(this));
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ b72 u() {
        return super.u();
    }

    public final void u0(Bundle bundle) {
        H(bundle, b().a());
    }

    public final void v0(vz1 vz1Var) {
        v();
        pj0.i(vz1Var);
        if (this.e.remove(vz1Var)) {
            return;
        }
        l().L().a("OnEventListener had not been registered");
    }

    public final void x0(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        h().D(new r12(this, str, str2, j, aa2.D(bundle), z, z2, z3, str3));
    }

    public final void y0(String str, String str2, Bundle bundle) {
        Z(str, str2, bundle, true, true, b().a());
    }

    public final void z0(String str, String str2, Bundle bundle) {
        n();
        U(str, str2, b().a(), bundle);
    }
}
