package androidx.appcompat.view.menu;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class vi1 {
    public static final xs1 A0;
    public static final xs1 B0;
    public static final xs1 C0;
    public static final xs1 D0;
    public static final xs1 E0;
    public static final xs1 F0;
    public static final xs1 G0;
    public static final xs1 H0;
    public static final xs1 I0;
    public static final xs1 J0;
    public static final xs1 K0;
    public static final xs1 L0;
    public static final xs1 M;
    public static final xs1 M0;
    public static final xs1 N;
    public static final xs1 N0;
    public static final xs1 O;
    public static final xs1 O0;
    public static final xs1 P;
    public static final xs1 P0;
    public static final xs1 Q;
    public static final xs1 Q0;
    public static final xs1 R;
    public static final xs1 R0;
    public static final xs1 S;
    public static final xs1 S0;
    public static final xs1 T;
    public static final xs1 T0;
    public static final xs1 U;
    public static final xs1 U0;
    public static final xs1 V;
    public static final xs1 V0;
    public static final xs1 W;
    public static final xs1 W0;
    public static final xs1 X;
    public static final xs1 X0;
    public static final xs1 Y;
    public static final xs1 Y0;
    public static final xs1 Z;
    public static final xs1 Z0;
    public static final xs1 a0;
    public static final xs1 a1;
    public static final xs1 b0;
    public static xs1 b1;
    public static final xs1 c0;
    public static final xs1 d0;
    public static final xs1 e0;
    public static final xs1 f0;
    public static final xs1 g0;
    public static final xs1 h0;
    public static final xs1 i0;
    public static final xs1 j0;
    public static final xs1 k0;
    public static final xs1 l0;
    public static final xs1 m0;
    public static final xs1 n0;
    public static final xs1 o0;
    public static final xs1 p0;
    public static final xs1 q0;
    public static final xs1 r0;
    public static final xs1 s0;
    public static final xs1 t0;
    public static final xs1 u0;
    public static final xs1 v0;
    public static final xs1 w0;
    public static final xs1 x0;
    public static final xs1 y0;
    public static final xs1 z0;
    public static final List a = Collections.synchronizedList(new ArrayList());
    public static final Set b = Collections.synchronizedSet(new HashSet());
    public static final xs1 c = a("measurement.ad_id_cache_time", 10000L, 10000L, new fs1() { // from class: androidx.appcompat.view.menu.zi1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.a());
            return valueOf;
        }
    });
    public static final xs1 d = a("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, 3600000L, new fs1() { // from class: androidx.appcompat.view.menu.hj1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.w());
            return valueOf;
        }
    });
    public static final xs1 e = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new fs1() { // from class: androidx.appcompat.view.menu.uk1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.J());
            return valueOf;
        }
    });
    public static final xs1 f = a("measurement.config.cache_time", 86400000L, 3600000L, new fs1() { // from class: androidx.appcompat.view.menu.sl1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.y());
            return valueOf;
        }
    });
    public static final xs1 g = a("measurement.config.url_scheme", "https", "https", new fs1() { // from class: androidx.appcompat.view.menu.pm1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            String n2;
            n2 = da2.n();
            return n2;
        }
    });
    public static final xs1 h = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new fs1() { // from class: androidx.appcompat.view.menu.zn1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            String m2;
            m2 = da2.m();
            return m2;
        }
    });
    public static final xs1 i = a("measurement.upload.max_bundles", 100, 100, new fs1() { // from class: androidx.appcompat.view.menu.ro1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) da2.U());
            return valueOf;
        }
    });
    public static final xs1 j = a("measurement.upload.max_batch_size", 65536, 65536, new fs1() { // from class: androidx.appcompat.view.menu.tp1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) da2.i());
            return valueOf;
        }
    });
    public static final xs1 k = a("measurement.upload.max_bundle_size", 65536, 65536, new fs1() { // from class: androidx.appcompat.view.menu.nq1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) da2.T());
            return valueOf;
        }
    });
    public static final xs1 l = a("measurement.upload.max_events_per_bundle", 1000, 1000, new fs1() { // from class: androidx.appcompat.view.menu.dj1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) da2.d());
            return valueOf;
        }
    });
    public static final xs1 m = a("measurement.upload.max_events_per_day", 100000, 100000, new fs1() { // from class: androidx.appcompat.view.menu.xj1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) da2.e());
            return valueOf;
        }
    });
    public static final xs1 n = a("measurement.upload.max_error_events_per_day", 1000, 1000, new fs1() { // from class: androidx.appcompat.view.menu.el1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) da2.c());
            return valueOf;
        }
    });
    public static final xs1 o = a("measurement.upload.max_public_events_per_day", 50000, 50000, new fs1() { // from class: androidx.appcompat.view.menu.dm1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) da2.f());
            return valueOf;
        }
    });
    public static final xs1 p = a("measurement.upload.max_conversions_per_day", 10000, 10000, new fs1() { // from class: androidx.appcompat.view.menu.hn1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) da2.b());
            return valueOf;
        }
    });
    public static final xs1 q = a("measurement.upload.max_realtime_events_per_day", 10, 10, new fs1() { // from class: androidx.appcompat.view.menu.fo1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) da2.h());
            return valueOf;
        }
    });
    public static final xs1 r = a("measurement.store.max_stored_events_per_app", 100000, 100000, new fs1() { // from class: androidx.appcompat.view.menu.to1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) da2.C());
            return valueOf;
        }
    });
    public static final xs1 s = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new fs1() { // from class: androidx.appcompat.view.menu.vp1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            String u2;
            u2 = da2.u();
            return u2;
        }
    });
    public static final xs1 t = a("measurement.upload.backoff_period", 43200000L, 43200000L, new fs1() { // from class: androidx.appcompat.view.menu.lq1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.Q());
            return valueOf;
        }
    });
    public static final xs1 u = a("measurement.upload.window_interval", 3600000L, 3600000L, new fs1() { // from class: androidx.appcompat.view.menu.xi1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.l());
            return valueOf;
        }
    });
    public static final xs1 v = a("measurement.upload.interval", 3600000L, 3600000L, new fs1() { // from class: androidx.appcompat.view.menu.bj1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.S());
            return valueOf;
        }
    });
    public static final xs1 w = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, new fs1() { // from class: androidx.appcompat.view.menu.fj1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.K());
            return valueOf;
        }
    });
    public static final xs1 x = a("measurement.upload.debug_upload_interval", 1000L, 1000L, new fs1() { // from class: androidx.appcompat.view.menu.lj1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.z());
            return valueOf;
        }
    });
    public static final xs1 y = a("measurement.upload.minimum_delay", 500L, 500L, new fs1() { // from class: androidx.appcompat.view.menu.jj1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.I());
            return valueOf;
        }
    });
    public static final xs1 z = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, new fs1() { // from class: androidx.appcompat.view.menu.pj1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.H());
            return valueOf;
        }
    });
    public static final xs1 A = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new fs1() { // from class: androidx.appcompat.view.menu.nj1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.N());
            return valueOf;
        }
    });
    public static final xs1 B = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new fs1() { // from class: androidx.appcompat.view.menu.tj1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.L());
            return valueOf;
        }
    });
    public static final xs1 C = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new fs1() { // from class: androidx.appcompat.view.menu.rj1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.R());
            return valueOf;
        }
    });
    public static final xs1 D = a("measurement.upload.retry_time", 1800000L, 1800000L, new fs1() { // from class: androidx.appcompat.view.menu.vj1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.k());
            return valueOf;
        }
    });
    public static final xs1 E = a("measurement.upload.retry_count", 6, 6, new fs1() { // from class: androidx.appcompat.view.menu.bk1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) da2.j());
            return valueOf;
        }
    });
    public static final xs1 F = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new fs1() { // from class: androidx.appcompat.view.menu.zj1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.g());
            return valueOf;
        }
    });
    public static final xs1 G = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, new fs1() { // from class: androidx.appcompat.view.menu.dk1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) da2.A());
            return valueOf;
        }
    });
    public static final xs1 H = a("measurement.audience.filter_result_max_count", 200, 200, new fs1() { // from class: androidx.appcompat.view.menu.yk1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Integer valueOf;
            valueOf = Integer.valueOf((int) da2.E());
            return valueOf;
        }
    });
    public static final xs1 I = a("measurement.upload.max_public_user_properties", 25, 25, null);
    public static final xs1 J = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
    public static final xs1 K = a("measurement.upload.max_public_event_params", 25, 25, null);
    public static final xs1 L = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new fs1() { // from class: androidx.appcompat.view.menu.wk1
        @Override // androidx.appcompat.view.menu.fs1
        public final Object a() {
            Long valueOf;
            valueOf = Long.valueOf(da2.M());
            return valueOf;
        }
    });

    static {
        Boolean bool = Boolean.FALSE;
        M = a("measurement.test.boolean_flag", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.cl1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(pc2.e());
                return valueOf;
            }
        });
        N = a("measurement.test.string_flag", "---", "---", new fs1() { // from class: androidx.appcompat.view.menu.al1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                String d2;
                d2 = pc2.d();
                return d2;
            }
        });
        O = a("measurement.test.long_flag", -1L, -1L, new fs1() { // from class: androidx.appcompat.view.menu.gl1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Long valueOf;
                valueOf = Long.valueOf(pc2.c());
                return valueOf;
            }
        });
        P = a("measurement.test.int_flag", -2, -2, new fs1() { // from class: androidx.appcompat.view.menu.kl1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Integer valueOf;
                valueOf = Integer.valueOf((int) pc2.b());
                return valueOf;
            }
        });
        Double valueOf = Double.valueOf(-3.0d);
        Q = a("measurement.test.double_flag", valueOf, valueOf, new fs1() { // from class: androidx.appcompat.view.menu.il1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Double valueOf2;
                valueOf2 = Double.valueOf(pc2.a());
                return valueOf2;
            }
        });
        R = a("measurement.experiment.max_ids", 50, 50, new fs1() { // from class: androidx.appcompat.view.menu.ol1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) da2.D());
                return valueOf2;
            }
        });
        S = a("measurement.upload.max_item_scoped_custom_parameters", 27, 27, new fs1() { // from class: androidx.appcompat.view.menu.ml1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) da2.F());
                return valueOf2;
            }
        });
        T = a("measurement.upload.max_event_parameter_value_length", 100, 100, new fs1() { // from class: androidx.appcompat.view.menu.ql1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) da2.B());
                return valueOf2;
            }
        });
        U = a("measurement.max_bundles_per_iteration", 100, 100, new fs1() { // from class: androidx.appcompat.view.menu.wl1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) da2.x());
                return valueOf2;
            }
        });
        V = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new fs1() { // from class: androidx.appcompat.view.menu.ul1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Long valueOf2;
                valueOf2 = Long.valueOf(da2.O());
                return valueOf2;
            }
        });
        W = a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, new fs1() { // from class: androidx.appcompat.view.menu.am1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Long valueOf2;
                valueOf2 = Long.valueOf(da2.P());
                return valueOf2;
            }
        });
        X = a("measurement.rb.attribution.client.min_ad_services_version", 7, 7, new fs1() { // from class: androidx.appcompat.view.menu.yl1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) da2.G());
                return valueOf2;
            }
        });
        Y = a("measurement.rb.attribution.uri_scheme", "https", "https", new fs1() { // from class: androidx.appcompat.view.menu.cm1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                String t2;
                t2 = da2.t();
                return t2;
            }
        });
        Z = a("measurement.rb.attribution.uri_authority", "google-analytics.com", "google-analytics.com", new fs1() { // from class: androidx.appcompat.view.menu.hm1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                String q2;
                q2 = da2.q();
                return q2;
            }
        });
        a0 = a("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", "privacy-sandbox/register-app-conversion", new fs1() { // from class: androidx.appcompat.view.menu.fm1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                String r2;
                r2 = da2.r();
                return r2;
            }
        });
        b0 = a("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,", "com.labpixies.flood,", new fs1() { // from class: androidx.appcompat.view.menu.lm1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                String p2;
                p2 = da2.p();
                return p2;
            }
        });
        c0 = a("measurement.rb.attribution.user_properties", "_npa,npa", "_npa,npa", new fs1() { // from class: androidx.appcompat.view.menu.jm1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                String v2;
                v2 = da2.v();
                return v2;
            }
        });
        d0 = a("measurement.rb.attribution.event_params", "value|currency", "value|currency", new fs1() { // from class: androidx.appcompat.view.menu.nm1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                String o2;
                o2 = da2.o();
                return o2;
            }
        });
        e0 = a("measurement.rb.attribution.query_parameters_to_remove", "", "", new fs1() { // from class: androidx.appcompat.view.menu.fn1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                String s2;
                s2 = da2.s();
                return s2;
            }
        });
        Boolean bool2 = Boolean.TRUE;
        f0 = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.rm1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(uc2.a());
                return valueOf2;
            }
        });
        g0 = a("measurement.quality.checksum", bool, bool, null);
        h0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.jn1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(jb2.c());
                return valueOf2;
            }
        });
        i0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.nn1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(jb2.b());
                return valueOf2;
            }
        });
        j0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.ln1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(jb2.d());
                return valueOf2;
            }
        });
        k0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.rn1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(fe2.a());
                return valueOf2;
            }
        });
        l0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.qn1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(cc2.a());
                return valueOf2;
            }
        });
        m0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.vn1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(hc2.a());
                return valueOf2;
            }
        });
        n0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.tn1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(ae2.b());
                return valueOf2;
            }
        });
        o0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.xn1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(ge2.a());
                return valueOf2;
            }
        });
        p0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.do1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(wa2.b());
                return valueOf2;
            }
        });
        q0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.bo1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(pb2.b());
                return valueOf2;
            }
        });
        r0 = a("measurement.service.storage_consent_support_version", 203600, 203600, new fs1() { // from class: androidx.appcompat.view.menu.eo1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) ka2.a());
                return valueOf2;
            }
        });
        s0 = a("measurement.client.click_identifier_control.dev", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.ho1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(k92.a());
                return valueOf2;
            }
        });
        t0 = a("measurement.service.click_identifier_control", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.go1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(ba2.a());
                return valueOf2;
            }
        });
        u0 = a("measurement.service.store_null_safelist", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.ko1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(ra2.b());
                return valueOf2;
            }
        });
        v0 = a("measurement.service.store_safelist", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.io1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(ra2.c());
                return valueOf2;
            }
        });
        w0 = a("measurement.collection.enable_session_stitching_token.first_open_fix", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.no1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(hd2.c());
                return valueOf2;
            }
        });
        x0 = a("measurement.collection.enable_session_stitching_token.client.dev", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.lo1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(hd2.b());
                return valueOf2;
            }
        });
        y0 = a("measurement.session_stitching_token_enabled", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.po1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(hd2.d());
                return valueOf2;
            }
        });
        z0 = a("measurement.sgtm.client.dev", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.vo1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zd2.b());
                return valueOf2;
            }
        });
        A0 = a("measurement.sgtm.service", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.ip1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(zd2.c());
                return valueOf2;
            }
        });
        B0 = a("measurement.redaction.retain_major_os_version", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.xo1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(ad2.a());
                return valueOf2;
            }
        });
        C0 = a("measurement.redaction.scion_payload_generator", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.lp1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(ad2.b());
                return valueOf2;
            }
        });
        D0 = a("measurement.sessionid.enable_client_session_id", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.kp1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(gd2.b());
                return valueOf2;
            }
        });
        E0 = a("measurement.sfmc.client", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.pp1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(nd2.b());
                return valueOf2;
            }
        });
        F0 = a("measurement.sfmc.service", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.np1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(nd2.c());
                return valueOf2;
            }
        });
        G0 = a("measurement.gmscore_feature_tracking", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.rp1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(vb2.b());
                return valueOf2;
            }
        });
        H0 = a("measurement.fix_health_monitor_stack_trace", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.qp1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(kb2.b());
                return valueOf2;
            }
        });
        I0 = a("measurement.item_scoped_custom_parameters.client", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.sp1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(bc2.b());
                return valueOf2;
            }
        });
        J0 = a("measurement.item_scoped_custom_parameters.service", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.up1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(bc2.c());
                return valueOf2;
            }
        });
        K0 = a("measurement.remove_app_background.client", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.yp1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(bd2.b());
                return valueOf2;
            }
        });
        L0 = a("measurement.rb.attribution.service", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.wp1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(vc2.d());
                return valueOf2;
            }
        });
        M0 = a("measurement.rb.attribution.client2", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.bq1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(vc2.b());
                return valueOf2;
            }
        });
        N0 = a("measurement.rb.attribution.uuid_generation", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.zp1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(vc2.f());
                return valueOf2;
            }
        });
        O0 = a("measurement.rb.attribution.enable_trigger_redaction", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.fq1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(vc2.e());
                return valueOf2;
            }
        });
        P0 = a("measurement.rb.attribution.followup1.service", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.dq1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(vc2.c());
                return valueOf2;
            }
        });
        Q0 = a("measurement.client.sessions.enable_fix_background_engagement", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.jq1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                return Boolean.valueOf(md2.a());
            }
        });
        R0 = a("measurement.client.ad_id_consent_fix", bool2, bool2, new fs1() { // from class: androidx.appcompat.view.menu.hq1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                return Boolean.valueOf(xa2.b());
            }
        });
        S0 = a("measurement.dma_consent.client", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.xq1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(qa2.b());
                return valueOf2;
            }
        });
        T0 = a("measurement.dma_consent.service", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.pq1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(qa2.d());
                return valueOf2;
            }
        });
        U0 = a("measurement.dma_consent.client_bow_check", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.ar1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(qa2.c());
                return valueOf2;
            }
        });
        V0 = a("measurement.dma_consent.service_gcs_v2", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.yq1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(qa2.e());
                return valueOf2;
            }
        });
        W0 = a("measurement.dma_consent.service_npa_remote_default", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.nr1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(qa2.f());
                return valueOf2;
            }
        });
        X0 = a("measurement.dma_consent.service_split_batch_on_consent", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.cr1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(qa2.g());
                return valueOf2;
            }
        });
        Y0 = a("measurement.service.deferred_first_open", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.yr1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(la2.b());
                return valueOf2;
            }
        });
        Z0 = a("measurement.gbraid_campaign.gbraid.client.dev", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.pr1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(qb2.b());
                return valueOf2;
            }
        });
        a1 = a("measurement.gbraid_campaign.gbraid.service", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.bs1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(qb2.c());
                return valueOf2;
            }
        });
        b1 = a("measurement.increase_param_lengths", bool, bool, new fs1() { // from class: androidx.appcompat.view.menu.zr1
            @Override // androidx.appcompat.view.menu.fs1
            public final Object a() {
                Boolean valueOf2;
                valueOf2 = Boolean.valueOf(wb2.b());
                return valueOf2;
            }
        });
    }

    public static xs1 a(String str, Object obj, Object obj2, fs1 fs1Var) {
        xs1 xs1Var = new xs1(str, obj, obj2, fs1Var);
        a.add(xs1Var);
        return xs1Var;
    }

    public static Map c(Context context) {
        gu1 a2 = gu1.a(context.getContentResolver(), lv1.a("com.google.android.gms.measurement"), new Runnable() { // from class: androidx.appcompat.view.menu.ti1
            @Override // java.lang.Runnable
            public final void run() {
                rv1.m();
            }
        });
        return a2 == null ? Collections.emptyMap() : a2.b();
    }
}
