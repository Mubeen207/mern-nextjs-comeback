package androidx.appcompat.view.menu;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class u32 extends fp1 {
    public volatile w32 c;
    public volatile w32 d;
    public w32 e;
    public final Map f;
    public Activity g;
    public volatile boolean h;
    public volatile w32 i;
    public w32 j;
    public boolean k;
    public final Object l;

    public u32(fx1 fx1Var) {
        super(fx1Var);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }

    public static /* synthetic */ void J(u32 u32Var, Bundle bundle, w32 w32Var, w32 w32Var2, long j) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        u32Var.N(w32Var, w32Var2, j, true, u32Var.j().E(null, "screen_view", bundle, null, false));
    }

    @Override // androidx.appcompat.view.menu.fp1
    public final boolean A() {
        return false;
    }

    public final w32 C(boolean z) {
        v();
        n();
        if (z) {
            w32 w32Var = this.e;
            return w32Var != null ? w32Var : this.j;
        }
        return this.e;
    }

    public final String D(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > e().t(null) ? str2.substring(0, e().t(null)) : str2;
    }

    public final void E(Activity activity) {
        synchronized (this.l) {
            try {
                if (activity == this.g) {
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e().Q()) {
            this.f.remove(activity);
        }
    }

    public final void F(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!e().Q() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(activity, new w32(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void G(Activity activity, w32 w32Var, boolean z) {
        w32 w32Var2;
        w32 w32Var3 = this.c == null ? this.d : this.c;
        if (w32Var.b == null) {
            w32Var2 = new w32(w32Var.a, activity != null ? D(activity.getClass(), "Activity") : null, w32Var.c, w32Var.e, w32Var.f);
        } else {
            w32Var2 = w32Var;
        }
        this.d = this.c;
        this.c = w32Var2;
        h().D(new e42(this, w32Var2, w32Var3, b().b(), z));
    }

    public final void H(Activity activity, String str, String str2) {
        if (!e().Q()) {
            l().M().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        w32 w32Var = this.c;
        if (w32Var == null) {
            l().M().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f.get(activity) == null) {
            l().M().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = D(activity.getClass(), "Activity");
            }
            boolean a = a42.a(w32Var.b, str2);
            boolean a2 = a42.a(w32Var.a, str);
            if (a && a2) {
                l().M().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > e().t(null))) {
                l().M().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 != null && (str2.length() <= 0 || str2.length() > e().t(null))) {
                l().M().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            } else {
                l().K().c("Setting current screen to name, class", str == null ? "null" : str, str2);
                w32 w32Var2 = new w32(str, str2, j().P0());
                this.f.put(activity, w32Var2);
                G(activity, w32Var2, true);
            }
        }
    }

    public final void I(Bundle bundle, long j) {
        String str;
        synchronized (this.l) {
            try {
                if (!this.k) {
                    l().M().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String str2 = null;
                if (bundle != null) {
                    String string = bundle.getString("screen_name");
                    if (string != null && (string.length() <= 0 || string.length() > e().t(null))) {
                        l().M().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                        return;
                    }
                    String string2 = bundle.getString("screen_class");
                    if (string2 != null && (string2.length() <= 0 || string2.length() > e().t(null))) {
                        l().M().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                        return;
                    } else {
                        str2 = string2;
                        str = string;
                    }
                } else {
                    str = null;
                }
                if (str2 == null) {
                    Activity activity = this.g;
                    str2 = activity != null ? D(activity.getClass(), "Activity") : "Activity";
                }
                String str3 = str2;
                w32 w32Var = this.c;
                if (this.h && w32Var != null) {
                    this.h = false;
                    boolean a = a42.a(w32Var.b, str3);
                    boolean a2 = a42.a(w32Var.a, str);
                    if (a && a2) {
                        l().M().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                l().K().c("Logging screen view with name, class", str == null ? "null" : str, str3 == null ? "null" : str3);
                w32 w32Var2 = this.c == null ? this.d : this.c;
                w32 w32Var3 = new w32(str, str3, j().P0(), true, j);
                this.c = w32Var3;
                this.d = w32Var2;
                this.i = w32Var3;
                h().D(new y32(this, bundle, w32Var3, w32Var2, b().b()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v6, types: [long, android.os.BaseBundle] */
    public final void N(w32 w32Var, w32 w32Var2, long j, boolean z, Bundle bundle) {
        long j2;
        n();
        boolean z2 = false;
        boolean z3 = (w32Var2 != null && w32Var2.c == w32Var.c && a42.a(w32Var2.b, w32Var.b) && a42.a(w32Var2.a, w32Var.a)) ? false : true;
        if (z && this.e != null) {
            z2 = true;
        }
        if (z3) {
            aa2.W(w32Var, bundle != null ? new Bundle(bundle) : new Bundle(), true);
            if (w32Var2 != null) {
                String str = w32Var2.a;
                if (str != null) {
                    "_pn".putString("_pn", str);
                }
                String str2 = w32Var2.b;
                if (str2 != null) {
                    "_pc".putString("_pc", str2);
                }
                ?? r8 = w32Var2.c;
                r8.putLong("_pi", r8);
            }
            ?? r82 = 0;
            if (z2) {
                long a = u().f.a(j);
                if (a > 0) {
                    j().L(null, a);
                }
            }
            if (!e().Q()) {
                r82.putLong("_mst", 1L);
            }
            String str3 = w32Var.e ? "app" : "auto";
            long a2 = b().a();
            if (w32Var.e) {
                a2 = w32Var.f;
                if (a2 != 0) {
                    j2 = a2;
                    r().U(str3, "_vs", j2, null);
                }
            }
            j2 = a2;
            r().U(str3, "_vs", j2, null);
        }
        if (z2) {
            O(this.e, true, j);
        }
        this.e = w32Var;
        if (w32Var.e) {
            this.j = w32Var;
        }
        t().L(w32Var);
    }

    public final void O(w32 w32Var, boolean z, long j) {
        o().v(b().b());
        if (!u().E(w32Var != null && w32Var.d, z, j) || w32Var == null) {
            return;
        }
        w32Var.d = false;
    }

    public final w32 P() {
        return this.c;
    }

    public final void Q(Activity activity) {
        synchronized (this.l) {
            this.k = false;
            this.h = true;
        }
        long b = b().b();
        if (!e().Q()) {
            this.c = null;
            h().D(new i42(this, b));
            return;
        }
        w32 T = T(activity);
        this.d = this.c;
        this.c = null;
        h().D(new g42(this, T, b));
    }

    public final void R(Activity activity, Bundle bundle) {
        w32 w32Var;
        if (!e().Q() || bundle == null || (w32Var = (w32) this.f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", w32Var.c);
        bundle2.putString("name", w32Var.a);
        bundle2.putString("referrer_name", w32Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void S(Activity activity) {
        synchronized (this.l) {
            this.k = true;
            if (activity != this.g) {
                synchronized (this.l) {
                    this.g = activity;
                    this.h = false;
                }
                if (e().Q()) {
                    this.i = null;
                    h().D(new m42(this));
                }
            }
        }
        if (!e().Q()) {
            this.c = this.i;
            h().D(new c42(this));
            return;
        }
        G(activity, T(activity), false);
        rh1 o = o();
        o.h().D(new fk1(o, o.b().b()));
    }

    public final w32 T(Activity activity) {
        pj0.i(activity);
        w32 w32Var = (w32) this.f.get(activity);
        if (w32Var == null) {
            w32 w32Var2 = new w32(null, D(activity.getClass(), "Activity"), j().P0());
            this.f.put(activity, w32Var2);
            w32Var = w32Var2;
        }
        return this.i != null ? this.i : w32Var;
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

    @Override // androidx.appcompat.view.menu.kr1, androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ st1 l() {
        return super.l();
    }

    @Override // androidx.appcompat.view.menu.kr1, androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // androidx.appcompat.view.menu.kr1, androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ rh1 o() {
        return super.o();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ ct1 p() {
        return super.p();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ it1 q() {
        return super.q();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ g02 r() {
        return super.r();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ u32 s() {
        return super.s();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ k42 t() {
        return super.t();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ b72 u() {
        return super.u();
    }
}
