package androidx.appcompat.view.menu;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.appcompat.view.menu.oz1;
import androidx.appcompat.view.menu.y1;
/* loaded from: classes.dex */
public final class wu1 extends gz1 {
    public static final Pair z = new Pair("", 0L);
    public SharedPreferences c;
    public ev1 d;
    public final gv1 e;
    public final gv1 f;
    public final jv1 g;
    public String h;
    public boolean i;
    public long j;
    public final gv1 k;
    public final cv1 l;
    public final jv1 m;
    public final av1 n;
    public final cv1 o;
    public final gv1 p;
    public final gv1 q;
    public boolean r;
    public cv1 s;
    public cv1 t;
    public gv1 u;
    public final jv1 v;
    public final jv1 w;
    public final gv1 x;
    public final av1 y;

    public wu1(fx1 fx1Var) {
        super(fx1Var);
        this.k = new gv1(this, "session_timeout", 1800000L);
        this.l = new cv1(this, "start_new_session", true);
        this.p = new gv1(this, "last_pause_time", 0L);
        this.q = new gv1(this, "session_id", 0L);
        this.m = new jv1(this, "non_personalized_ads", null);
        this.n = new av1(this, "last_received_uri_timestamps_by_source", null);
        this.o = new cv1(this, "allow_remote_dynamite", false);
        this.e = new gv1(this, "first_open_time", 0L);
        this.f = new gv1(this, "app_install_time", 0L);
        this.g = new jv1(this, "app_instance_id", null);
        this.s = new cv1(this, "app_backgrounded", false);
        this.t = new cv1(this, "deep_link_retrieval_complete", false);
        this.u = new gv1(this, "deep_link_retrieval_attempts", 0L);
        this.v = new jv1(this, "firebase_feature_rollouts", null);
        this.w = new jv1(this, "deferred_attribution_cache", null);
        this.x = new gv1(this, "deferred_attribution_cache_timestamp", 0L);
        this.y = new av1(this, "default_event_parameters", null);
    }

    public final boolean A(oz1 oz1Var) {
        n();
        int b = oz1Var.b();
        if (x(b)) {
            SharedPreferences.Editor edit = F().edit();
            edit.putString("consent_settings", oz1Var.v());
            edit.putInt("consent_source", b);
            edit.apply();
            return true;
        }
        return false;
    }

    public final boolean B() {
        SharedPreferences sharedPreferences = this.c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final void C(Boolean bool) {
        n();
        SharedPreferences.Editor edit = F().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    public final void D(String str) {
        n();
        SharedPreferences.Editor edit = F().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    public final void E(boolean z2) {
        n();
        l().K().b("App measurement setting deferred collection", Boolean.valueOf(z2));
        SharedPreferences.Editor edit = F().edit();
        edit.putBoolean("deferred_analytics_collection", z2);
        edit.apply();
    }

    public final SharedPreferences F() {
        n();
        o();
        pj0.i(this.c);
        return this.c;
    }

    public final void G(String str) {
        n();
        SharedPreferences.Editor edit = F().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    public final SparseArray H() {
        Bundle a = this.n.a();
        if (a == null) {
            return new SparseArray();
        }
        int[] intArray = a.getIntArray("uriSources");
        long[] longArray = a.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            l().G().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final ih1 I() {
        n();
        return ih1.c(F().getString("dma_consent_settings", null));
    }

    public final oz1 J() {
        n();
        return oz1.f(F().getString("consent_settings", "G1"), F().getInt("consent_source", 100));
    }

    public final Boolean K() {
        n();
        if (F().contains("use_service")) {
            return Boolean.valueOf(F().getBoolean("use_service", false));
        }
        return null;
    }

    public final Boolean L() {
        n();
        if (F().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(F().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    public final Boolean M() {
        n();
        if (F().contains("measurement_enabled")) {
            return Boolean.valueOf(F().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final String N() {
        n();
        String string = F().getString("previous_os_version", null);
        f().o();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = F().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    public final String O() {
        n();
        return F().getString("admob_app_id", null);
    }

    public final String P() {
        n();
        return F().getString("gmp_app_id", null);
    }

    public final void Q() {
        n();
        Boolean M = M();
        SharedPreferences.Editor edit = F().edit();
        edit.clear();
        edit.apply();
        if (M != null) {
            v(M);
        }
    }

    @Override // androidx.appcompat.view.menu.gz1
    public final boolean s() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.gz1
    public final void t() {
        SharedPreferences sharedPreferences = a().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.c = sharedPreferences;
        boolean z2 = sharedPreferences.getBoolean("has_been_opened", false);
        this.r = z2;
        if (!z2) {
            SharedPreferences.Editor edit = this.c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.d = new ev1(this, "health_monitor", Math.max(0L, ((Long) vi1.e.a(null)).longValue()));
    }

    public final Pair u(String str) {
        n();
        if (xa2.a() && e().s(vi1.R0) && !J().l(oz1.a.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        long b = b().b();
        if (this.h == null || b >= this.j) {
            this.j = b + e().C(str);
            y1.b(true);
            try {
                y1.a a = y1.a(a());
                this.h = "";
                String a2 = a.a();
                if (a2 != null) {
                    this.h = a2;
                }
                this.i = a.b();
            } catch (Exception e) {
                l().F().b("Unable to get advertising id", e);
                this.h = "";
            }
            y1.b(false);
            return new Pair(this.h, Boolean.valueOf(this.i));
        }
        return new Pair(this.h, Boolean.valueOf(this.i));
    }

    public final void v(Boolean bool) {
        n();
        SharedPreferences.Editor edit = F().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void w(boolean z2) {
        n();
        SharedPreferences.Editor edit = F().edit();
        edit.putBoolean("use_service", z2);
        edit.apply();
    }

    public final boolean x(int i) {
        return oz1.k(i, F().getInt("consent_source", 100));
    }

    public final boolean y(long j) {
        return j - this.k.a() > this.p.a();
    }

    public final boolean z(ih1 ih1Var) {
        n();
        if (oz1.k(ih1Var.a(), I().a())) {
            SharedPreferences.Editor edit = F().edit();
            edit.putString("dma_consent_settings", ih1Var.i());
            edit.apply();
            return true;
        }
        return false;
    }
}
