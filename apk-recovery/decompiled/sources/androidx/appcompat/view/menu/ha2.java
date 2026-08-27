package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ha2 implements ia2 {
    public static final rv1 A;
    public static final rv1 B;
    public static final rv1 C;
    public static final rv1 D;
    public static final rv1 E;
    public static final rv1 F;
    public static final rv1 G;
    public static final rv1 H;
    public static final rv1 I;
    public static final rv1 J;
    public static final rv1 K;
    public static final rv1 L;
    public static final rv1 M;
    public static final rv1 N;
    public static final rv1 O;
    public static final rv1 P;
    public static final rv1 Q;
    public static final rv1 R;
    public static final rv1 S;
    public static final rv1 T;
    public static final rv1 U;
    public static final rv1 V;
    public static final rv1 W;
    public static final rv1 X;
    public static final rv1 a;
    public static final rv1 b;
    public static final rv1 c;
    public static final rv1 d;
    public static final rv1 e;
    public static final rv1 f;
    public static final rv1 g;
    public static final rv1 h;
    public static final rv1 i;
    public static final rv1 j;
    public static final rv1 k;
    public static final rv1 l;
    public static final rv1 m;
    public static final rv1 n;
    public static final rv1 o;
    public static final rv1 p;
    public static final rv1 q;
    public static final rv1 r;
    public static final rv1 s;
    public static final rv1 t;
    public static final rv1 u;
    public static final rv1 v;
    public static final rv1 w;
    public static final rv1 x;
    public static final rv1 y;
    public static final rv1 z;

    static {
        hw1 e2 = new hw1(lv1.a("com.google.android.gms.measurement")).f().e();
        a = e2.b("measurement.ad_id_cache_time", 10000L);
        b = e2.b("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L);
        c = e2.b("measurement.max_bundles_per_iteration", 100L);
        d = e2.b("measurement.config.cache_time", 86400000L);
        e = e2.c("measurement.log_tag", "FA");
        f = e2.c("measurement.config.url_authority", "app-measurement.com");
        g = e2.c("measurement.config.url_scheme", "https");
        h = e2.b("measurement.upload.debug_upload_interval", 1000L);
        i = e2.c("measurement.rb.attribution.event_params", "value|currency");
        j = e2.b("measurement.lifetimevalue.max_currency_tracked", 4L);
        k = e2.b("measurement.upload.max_event_parameter_value_length", 100L);
        l = e2.b("measurement.store.max_stored_events_per_app", 100000L);
        m = e2.b("measurement.experiment.max_ids", 50L);
        n = e2.b("measurement.audience.filter_result_max_count", 200L);
        o = e2.b("measurement.upload.max_item_scoped_custom_parameters", 27L);
        p = e2.b("measurement.rb.attribution.client.min_ad_services_version", 7L);
        q = e2.b("measurement.alarm_manager.minimum_interval", 60000L);
        r = e2.b("measurement.upload.minimum_delay", 500L);
        s = e2.b("measurement.monitoring.sample_period_millis", 86400000L);
        t = e2.c("measurement.rb.attribution.app_allowlist", "");
        u = e2.b("measurement.upload.realtime_upload_interval", 10000L);
        v = e2.b("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        w = e2.b("measurement.config.cache_time.service", 3600000L);
        x = e2.b("measurement.service_client.idle_disconnect_millis", 5000L);
        y = e2.c("measurement.log_tag.service", "FA-SVC");
        z = e2.b("measurement.upload.stale_data_deletion_interval", 86400000L);
        A = e2.c("measurement.rb.attribution.uri_authority", "google-analytics.com");
        B = e2.c("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        C = e2.c("measurement.rb.attribution.query_parameters_to_remove", "");
        D = e2.c("measurement.rb.attribution.uri_scheme", "https");
        E = e2.b("measurement.sdk.attribution.cache.ttl", 604800000L);
        F = e2.b("measurement.redaction.app_instance_id.ttl", 7200000L);
        G = e2.b("measurement.upload.backoff_period", 43200000L);
        H = e2.b("measurement.upload.initial_upload_delay_time", 15000L);
        I = e2.b("measurement.upload.interval", 3600000L);
        J = e2.b("measurement.upload.max_bundle_size", 65536L);
        K = e2.b("measurement.upload.max_bundles", 100L);
        L = e2.b("measurement.upload.max_conversions_per_day", 500L);
        M = e2.b("measurement.upload.max_error_events_per_day", 1000L);
        N = e2.b("measurement.upload.max_events_per_bundle", 1000L);
        O = e2.b("measurement.upload.max_events_per_day", 100000L);
        P = e2.b("measurement.upload.max_public_events_per_day", 50000L);
        Q = e2.b("measurement.upload.max_queue_time", 2419200000L);
        R = e2.b("measurement.upload.max_realtime_events_per_day", 10L);
        S = e2.b("measurement.upload.max_batch_size", 65536L);
        T = e2.b("measurement.upload.retry_count", 6L);
        U = e2.b("measurement.upload.retry_time", 1800000L);
        V = e2.c("measurement.upload.url", "https://app-measurement.com/a");
        W = e2.b("measurement.upload.window_interval", 3600000L);
        X = e2.c("measurement.rb.attribution.user_properties", "_npa,npa");
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final String A() {
        return (String) X.f();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long B() {
        return ((Long) x.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long C() {
        return ((Long) S.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long D() {
        return ((Long) U.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long E() {
        return ((Long) r.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final String F() {
        return (String) i.f();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long G() {
        return ((Long) L.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long H() {
        return ((Long) H.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final String I() {
        return (String) C.f();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long J() {
        return ((Long) P.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long K() {
        return ((Long) z.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long L() {
        return ((Long) T.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long M() {
        return ((Long) s.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long N() {
        return ((Long) W.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long O() {
        return ((Long) o.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final String P() {
        return (String) t.f();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long Q() {
        return ((Long) M.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final String R() {
        return (String) D.f();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long S() {
        return ((Long) I.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long T() {
        return ((Long) Q.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long U() {
        return ((Long) E.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long a() {
        return ((Long) a.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long b() {
        return ((Long) b.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long c() {
        return ((Long) c.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long d() {
        return ((Long) d.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long e() {
        return ((Long) m.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long f() {
        return ((Long) h.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long g() {
        return ((Long) j.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long h() {
        return ((Long) p.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long i() {
        return ((Long) l.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long j() {
        return ((Long) k.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long k() {
        return ((Long) N.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long l() {
        return ((Long) n.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final String m() {
        return (String) f.f();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long n() {
        return ((Long) u.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final String o() {
        return (String) A.f();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long p() {
        return ((Long) J.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final String q() {
        return (String) V.f();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long r() {
        return ((Long) R.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long s() {
        return ((Long) F.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long t() {
        return ((Long) v.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final String u() {
        return (String) g.f();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long v() {
        return ((Long) K.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long w() {
        return ((Long) q.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final String x() {
        return (String) B.f();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long y() {
        return ((Long) G.f()).longValue();
    }

    @Override // androidx.appcompat.view.menu.ia2
    public final long z() {
        return ((Long) O.f()).longValue();
    }
}
