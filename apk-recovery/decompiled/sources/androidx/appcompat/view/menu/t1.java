package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import androidx.appcompat.view.menu.jo0;
import java.util.List;
/* loaded from: classes.dex */
public abstract class t1 {
    public static final jo0 a;
    public static jo0.d b;
    public static jo0.b c;
    public static jo0.b d;
    public static jo0.b e;
    public static jo0.b f;
    public static jo0.b g;
    public static jo0.b h;
    public static jo0.b i;
    public static jo0.b j;
    public static jo0.e k;
    public static jo0.d l;
    public static jo0.d m;
    public static jo0.d n;
    public static jo0.d o;
    public static jo0.d p;

    /* loaded from: classes.dex */
    public static class a {
        public static final jo0 a;
        public static jo0.b b;
        public static jo0.b c;
        public static jo0.b d;
        public static jo0.b e;
        public static jo0.b f;
        public static jo0.b g;

        static {
            jo0 w = jo0.w("android.app.ActivityThread$ActivityClientRecord");
            a = w;
            b = w.e("activity");
            c = w.e("activityInfo");
            d = w.e("intent");
            e = w.e("token");
            f = w.e("isTopResumedActivity");
            g = w.e("packageInfo");
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static final jo0 a;
        public static jo0.b b;
        public static jo0.b c;
        public static jo0.b d;
        public static jo0.b e;
        public static jo0.b f;

        static {
            jo0 w = jo0.w("android.app.ActivityThread$AppBindData");
            a = w;
            b = w.e("appInfo");
            c = w.e("info");
            d = w.e("instrumentationName");
            e = w.e("processName");
            f = w.e("providers");
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static final jo0 a;
        public static jo0.b b;

        static {
            jo0 w = jo0.w("android.app.ActivityThread$CreateServiceData");
            a = w;
            b = w.e("info");
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static final jo0 a;
        public static jo0.b b;
        public static jo0.b c;
        public static jo0.b d;

        static {
            jo0 w = jo0.w("android.app.ActivityThread$H");
            a = w;
            b = w.e("CREATE_SERVICE");
            c = w.e("EXECUTE_TRANSACTION");
            d = w.e("LAUNCH_ACTIVITY");
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static final jo0 a;
        public static jo0.b b;
        public static jo0.b c;

        static {
            jo0 w = jo0.w("android.app.ActivityThread$ProviderClientRecord");
            a = w;
            b = w.e("mNames");
            c = w.e("mProvider");
        }
    }

    static {
        jo0 w = jo0.w("android.app.ActivityThread");
        a = w;
        b = w.u("scheduleTransaction", jo0.v("android.app.servertransaction.ClientTransaction"));
        c = w.e("sPackageManager");
        d = w.e("sPermissionManager");
        e = w.e("mActivities");
        f = w.e("mBoundApplication");
        g = w.e("mH");
        h = w.e("mInitialApplication");
        i = w.e("mInstrumentation");
        j = w.e("mProviderMap");
        k = w.z("currentActivityThread", new Class[0]);
        l = w.u("getApplicationThread", new Class[0]);
        m = w.u("getSystemContext", new Class[0]);
        n = w.u("getLaunchingActivity", IBinder.class);
        o = w.u("performNewIntents", IBinder.class, List.class);
        Class cls = Boolean.TYPE;
        p = w.u("installProvider", Context.class, jo0.v("android.app.ContentProviderHolder"), ProviderInfo.class, cls, cls, cls);
    }
}
