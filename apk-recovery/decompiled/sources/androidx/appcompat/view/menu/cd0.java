package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.view.menu.dd0;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public abstract class cd0 {
    public static boolean A(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return B(intent.getExtras());
    }

    public static boolean B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    public static boolean a() {
        Context j;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            tr.k();
            j = tr.k().j();
            sharedPreferences = j.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = j.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(j.getPackageName(), PackageParser.PARSE_IS_PRIVILEGED)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    public static dd0 b(dd0.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        dd0.a h = dd0.p().m(p(extras)).e(bVar).f(f(extras)).i(m()).k(dd0.d.ANDROID).h(k(extras));
        String h2 = h(extras);
        if (h2 != null) {
            h.g(h2);
        }
        String o = o(extras);
        if (o != null) {
            h.l(o);
        }
        String c = c(extras);
        if (c != null) {
            h.c(c);
        }
        String i = i(extras);
        if (i != null) {
            h.b(i);
        }
        String e = e(extras);
        if (e != null) {
            h.d(e);
        }
        long n = n(extras);
        if (n > 0) {
            h.j(n);
        }
        return h.a();
    }

    public static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    public static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    public static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    public static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (TextUtils.isEmpty(string)) {
            try {
                return (String) mz0.a(fs.r(tr.k()).a());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        return string;
    }

    public static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    public static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    public static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    public static String j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    public static dd0.c k(Bundle bundle) {
        return (bundle == null || !pf0.t(bundle)) ? dd0.c.DATA_MESSAGE : dd0.c.DISPLAY_NOTIFICATION;
    }

    public static String l(Bundle bundle) {
        return (bundle == null || !pf0.t(bundle)) ? "data" : "display";
    }

    public static String m() {
        return tr.k().j().getPackageName();
    }

    public static long n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException unused) {
            }
        }
        tr k = tr.k();
        String d = k.m().d();
        if (d != null) {
            try {
                return Long.parseLong(d);
            } catch (NumberFormatException unused2) {
            }
        }
        String c = k.m().c();
        try {
            if (c.startsWith("1:")) {
                String[] split = c.split(":");
                if (split.length < 2) {
                    return 0L;
                }
                String str = split[1];
                if (str.isEmpty()) {
                    return 0L;
                }
                return Long.parseLong(str);
            }
            return Long.parseLong(c);
        } catch (NumberFormatException unused3) {
            return 0L;
        }
    }

    public static String o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    public static int p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid TTL: ");
                sb.append(obj);
                return 0;
            }
        }
        return 0;
    }

    public static String q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    public static boolean r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static void s(Intent intent) {
        x("_nd", intent.getExtras());
    }

    public static void t(Intent intent) {
        x("_nf", intent.getExtras());
    }

    public static void u(Bundle bundle) {
        y(bundle);
        x("_no", bundle);
    }

    public static void v(Intent intent) {
        if (A(intent)) {
            x("_nr", intent.getExtras());
        }
        if (z(intent)) {
            w(dd0.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.q());
        }
    }

    public static void w(dd0.b bVar, Intent intent, h21 h21Var) {
        dd0 b;
        if (h21Var == null || (b = b(bVar, intent)) == null) {
            return;
        }
        try {
            h21Var.a("FCM_CLIENT_EVENT_LOGGING", ed0.class, lo.b("proto"), new u11() { // from class: androidx.appcompat.view.menu.bd0
                @Override // androidx.appcompat.view.menu.u11
                public final Object apply(Object obj) {
                    return ((ed0) obj).c();
                }
            }).a(wo.e(ed0.b().b(b).a(), kk0.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException unused) {
        }
    }

    public static void x(String str, Bundle bundle) {
        try {
            tr.k();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d = d(bundle);
            if (d != null) {
                bundle2.putString("_nmid", d);
            }
            String e = e(bundle);
            if (e != null) {
                bundle2.putString("_nmn", e);
            }
            String i = i(bundle);
            if (!TextUtils.isEmpty(i)) {
                bundle2.putString("label", i);
            }
            String g = g(bundle);
            if (!TextUtils.isEmpty(g)) {
                bundle2.putString("message_channel", g);
            }
            String o = o(bundle);
            if (o != null) {
                bundle2.putString("_nt", o);
            }
            String j = j(bundle);
            if (j != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(j));
                } catch (NumberFormatException unused) {
                }
            }
            String q = q(bundle);
            if (q != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(q));
                } catch (NumberFormatException unused2) {
                }
            }
            String l = l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", l);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Logging to scion event=");
                sb.append(str);
                sb.append(" scionPayload=");
                sb.append(bundle2);
            }
            a2 a2Var = (a2) tr.k().i(a2.class);
            if (a2Var != null) {
                a2Var.b("fcm", str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    public static void y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            Log.isLoggable("FirebaseMessaging", 3);
            return;
        }
        a2 a2Var = (a2) tr.k().i(a2.class);
        Log.isLoggable("FirebaseMessaging", 3);
        if (a2Var != null) {
            String string = bundle.getString("google.c.a.c_id");
            a2Var.a("fcm", "_ln", string);
            Bundle bundle2 = new Bundle();
            bundle2.putString("source", "Firebase");
            bundle2.putString("medium", "notification");
            bundle2.putString("campaign", string);
            a2Var.b("fcm", "_cmp", bundle2);
        }
    }

    public static boolean z(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return a();
    }
}
