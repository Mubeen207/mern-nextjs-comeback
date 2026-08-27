package androidx.appcompat.view.menu;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.appcompat.view.menu.jf0;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class ed {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* loaded from: classes.dex */
    public static class a {
        public final jf0.e a;
        public final String b;
        public final int c;

        public a(jf0.e eVar, String str, int i) {
            this.a = eVar;
            this.b = str;
            this.c = i;
        }
    }

    public static PendingIntent a(Context context, pf0 pf0Var, String str, PackageManager packageManager) {
        Intent f = f(str, pf0Var, packageManager);
        if (f == null) {
            return null;
        }
        f.addFlags(67108864);
        f.putExtras(pf0Var.y());
        if (q(pf0Var)) {
            f.putExtra("gcm.n.analytics_data", pf0Var.x());
        }
        return PendingIntent.getActivity(context, g(), f, l(1073741824));
    }

    public static PendingIntent b(Context context, Context context2, pf0 pf0Var) {
        if (q(pf0Var)) {
            return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(pf0Var.x()));
        }
        return null;
    }

    public static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, pf0 pf0Var, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        jf0.e eVar = new jf0.e(context2, str);
        String n = pf0Var.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(n)) {
            eVar.j(n);
        }
        String n2 = pf0Var.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(n2)) {
            eVar.i(n2);
            eVar.x(new jf0.c().h(n2));
        }
        eVar.v(m(packageManager, resources, packageName, pf0Var.p("gcm.n.icon"), bundle));
        Uri n3 = n(packageName, pf0Var, resources);
        if (n3 != null) {
            eVar.w(n3);
        }
        eVar.h(a(context, pf0Var, packageName, packageManager));
        PendingIntent b = b(context, context2, pf0Var);
        if (b != null) {
            eVar.l(b);
        }
        Integer h = h(context2, pf0Var.p("gcm.n.color"), bundle);
        if (h != null) {
            eVar.g(h.intValue());
        }
        eVar.e(!pf0Var.a("gcm.n.sticky"));
        eVar.q(pf0Var.a("gcm.n.local_only"));
        String p = pf0Var.p("gcm.n.ticker");
        if (p != null) {
            eVar.y(p);
        }
        Integer m = pf0Var.m();
        if (m != null) {
            eVar.t(m.intValue());
        }
        Integer r = pf0Var.r();
        if (r != null) {
            eVar.A(r.intValue());
        }
        Integer l = pf0Var.l();
        if (l != null) {
            eVar.r(l.intValue());
        }
        Long j = pf0Var.j("gcm.n.event_time");
        if (j != null) {
            eVar.u(true);
            eVar.B(j.longValue());
        }
        long[] q = pf0Var.q();
        if (q != null) {
            eVar.z(q);
        }
        int[] e = pf0Var.e();
        if (e != null) {
            eVar.p(e[0], e[1], e[2]);
        }
        eVar.k(i(pf0Var));
        return new a(eVar, o(pf0Var), 0);
    }

    public static a e(Context context, pf0 pf0Var) {
        Bundle j = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, pf0Var, k(context, pf0Var.k(), j), j);
    }

    public static Intent f(String str, pf0 pf0Var, PackageManager packageManager) {
        String p = pf0Var.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f = pf0Var.f();
        if (f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f);
            return intent2;
        }
        return packageManager.getLaunchIntentForPackage(str);
    }

    public static int g() {
        return a.incrementAndGet();
    }

    public static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(lg.c(context, i));
            } catch (Resources.NotFoundException unused2) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static int i(pf0 pf0Var) {
        boolean a2 = pf0Var.a("gcm.n.default_sound");
        ?? r0 = a2;
        if (pf0Var.a("gcm.n.default_vibrate_timings")) {
            r0 = (a2 ? 1 : 0) | true;
        }
        return pf0Var.a("gcm.n.default_light_settings") ? r0 | 4 : r0;
    }

    public static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, PackageParser.PARSE_IS_PRIVILEGED);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Couldn't get own application info: ");
            sb.append(e);
        }
        return Bundle.EMPTY;
    }

    public static String k(Context context, String str, Bundle bundle) {
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Notification Channel requested (");
                sb.append(str);
                sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string) || notificationManager.getNotificationChannel(string) == null) {
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", identifier == 0 ? "Misc" : context.getString(identifier), 3));
                }
                return "fcm_fallback_notification_channel";
            }
            return string;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static int l(int i) {
        return i | 67108864;
    }

    public static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Couldn't get own application info: ");
                sb2.append(e);
            }
        }
        if (i == 0 || !p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    public static Uri n(String str, pf0 pf0Var, Resources resources) {
        String o = pf0Var.o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if ("default".equals(o) || resources.getIdentifier(o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + o);
    }

    public static String o(pf0 pf0Var) {
        String p = pf0Var.p("gcm.n.tag");
        if (TextUtils.isEmpty(p)) {
            return "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        return p;
    }

    public static boolean p(Resources resources, int i) {
        return true;
    }

    public static boolean q(pf0 pf0Var) {
        return pf0Var.a("google.c.a.e");
    }
}
