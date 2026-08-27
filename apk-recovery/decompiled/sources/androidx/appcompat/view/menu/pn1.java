package androidx.appcompat.view.menu;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public class pn1 {
    public static volatile pn1 j;
    public final String a;
    public final cc b;
    public final ExecutorService c;
    public final t3 d;
    public final List e;
    public int f;
    public boolean g;
    public String h;
    public volatile im1 i;

    /* loaded from: classes.dex */
    public abstract class a implements Runnable {
        public final long m;
        public final long n;
        public final boolean o;

        public a(pn1 pn1Var) {
            this(true);
        }

        public abstract void a();

        public void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (pn1.this.g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e) {
                pn1.this.p(e, false, this.o);
                b();
            }
        }

        public a(boolean z) {
            this.m = pn1.this.b.a();
            this.n = pn1.this.b.b();
            this.o = z;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Application.ActivityLifecycleCallbacks {
        public b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            pn1.this.l(new cq1(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            pn1.this.l(new mq1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            pn1.this.l(new kq1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            pn1.this.l(new eq1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            em1 em1Var = new em1();
            pn1.this.l(new oq1(this, activity, em1Var));
            Bundle j = em1Var.j(50L);
            if (j != null) {
                bundle.putAll(j);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            pn1.this.l(new gq1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            pn1.this.l(new iq1(this, activity));
        }
    }

    public pn1(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !B(str2, str3)) {
            this.a = "FA";
        } else {
            this.a = str;
        }
        this.b = kj.d();
        this.c = jl1.a().a(new jo1(this), bm1.a);
        this.d = new t3(this);
        this.e = new ArrayList();
        if (y(context) && !G()) {
            this.h = null;
            this.g = true;
            return;
        }
        if (B(str2, str3)) {
            this.h = str2;
        } else {
            this.h = "fa";
        }
        l(new wn1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new b());
    }

    public static pn1 e(Context context) {
        return f(context, null, null, null, null);
    }

    public static pn1 f(Context context, String str, String str2, String str3, Bundle bundle) {
        pj0.i(context);
        if (j == null) {
            synchronized (pn1.class) {
                try {
                    if (j == null) {
                        j = new pn1(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return j;
    }

    public static boolean y(Context context) {
        return new ow1(context, ow1.a(context)).b("google_app_id") != null;
    }

    public final boolean B(String str, String str2) {
        return (str2 == null || str == null || G()) ? false : true;
    }

    public final String C() {
        em1 em1Var = new em1();
        l(new qo1(this, em1Var));
        return em1Var.v2(50L);
    }

    public final String D() {
        em1 em1Var = new em1();
        l(new jp1(this, em1Var));
        return em1Var.v2(500L);
    }

    public final String E() {
        em1 em1Var = new em1();
        l(new uo1(this, em1Var));
        return em1Var.v2(500L);
    }

    public final String F() {
        em1 em1Var = new em1();
        l(new so1(this, em1Var));
        return em1Var.v2(500L);
    }

    public final boolean G() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final int a(String str) {
        em1 em1Var = new em1();
        l(new op1(this, str, em1Var));
        Integer num = (Integer) em1.k(em1Var.j(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long b() {
        em1 em1Var = new em1();
        l(new wo1(this, em1Var));
        Long u2 = em1Var.u2(500L);
        if (u2 == null) {
            long nextLong = new Random(System.nanoTime() ^ this.b.a()).nextLong();
            int i = this.f + 1;
            this.f = i;
            return nextLong + i;
        }
        return u2.longValue();
    }

    public final im1 c(Context context, boolean z) {
        try {
            return gm1.asInterface(DynamiteModule.d(context, DynamiteModule.e, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e) {
            p(e, true, false);
            return null;
        }
    }

    public final List g(String str, String str2) {
        em1 em1Var = new em1();
        l(new yn1(this, str, str2, em1Var));
        List list = (List) em1.k(em1Var.j(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map h(String str, String str2, boolean z) {
        em1 em1Var = new em1();
        l(new yo1(this, str, str2, z, em1Var));
        Bundle j2 = em1Var.j(5000L);
        if (j2 == null || j2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(j2.size());
        for (String str3 : j2.keySet()) {
            Object obj = j2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void i(int i, String str, Object obj, Object obj2, Object obj3) {
        l(new mp1(this, false, 5, str, obj, null, null));
    }

    public final void j(Activity activity, String str, String str2) {
        l(new co1(this, activity, str, str2));
    }

    public final void k(Bundle bundle) {
        l(new un1(this, bundle));
    }

    public final void l(a aVar) {
        this.c.execute(aVar);
    }

    public final void p(Exception exc, boolean z, boolean z2) {
        this.g |= z;
        if (!z && z2) {
            i(5, "Error with data collection. Data lost.", exc, null, null);
        }
    }

    public final void q(String str, String str2, Bundle bundle) {
        l(new ao1(this, str, str2, bundle));
    }

    public final void r(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        l(new xp1(this, l, str, str2, bundle, z, z2));
    }

    public final void s(String str, String str2, Object obj, boolean z) {
        l(new aq1(this, str, str2, obj, z));
    }

    public final t3 u() {
        return this.d;
    }

    public final void w(String str) {
        l(new oo1(this, str));
    }

    public final void x(String str, String str2, Bundle bundle) {
        r(str, str2, bundle, true, true, null);
    }

    public final void z(String str) {
        l(new mo1(this, str));
    }
}
