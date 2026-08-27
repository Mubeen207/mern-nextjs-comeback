package androidx.appcompat.view.menu;

import android.content.Context;
import androidx.appcompat.view.menu.iv1;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class rv1 {
    public static volatile fw1 h;
    public final hw1 a;
    public final String b;
    public final Object c;
    public volatile int d;
    public volatile Object e;
    public final boolean f;
    public static final Object g = new Object();
    public static final AtomicReference i = new AtomicReference();
    public static nw1 j = new nw1(new zw1() { // from class: androidx.appcompat.view.menu.tv1
        @Override // androidx.appcompat.view.menu.zw1
        public final boolean a() {
            return rv1.n();
        }
    });
    public static final AtomicInteger k = new AtomicInteger();

    public static /* synthetic */ rv1 b(hw1 hw1Var, String str, Boolean bool, boolean z) {
        return new xv1(hw1Var, str, bool, true);
    }

    public static /* synthetic */ rv1 c(hw1 hw1Var, String str, Double d, boolean z) {
        return new dw1(hw1Var, str, d, true);
    }

    public static /* synthetic */ rv1 d(hw1 hw1Var, String str, Long l, boolean z) {
        return new zv1(hw1Var, str, l, true);
    }

    public static /* synthetic */ rv1 e(hw1 hw1Var, String str, String str2, boolean z) {
        return new bw1(hw1Var, str, str2, true);
    }

    public static void l(final Context context) {
        if (h != null || context == null) {
            return;
        }
        Object obj = g;
        synchronized (obj) {
            try {
                if (h == null) {
                    synchronized (obj) {
                        fw1 fw1Var = h;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (fw1Var != null) {
                            if (fw1Var.a() != context) {
                            }
                        }
                        gu1.d();
                        jw1.c();
                        dv1.b();
                        h = new au1(context, jy0.a(new hy0() { // from class: androidx.appcompat.view.menu.vv1
                            @Override // androidx.appcompat.view.menu.hy0
                            public final Object get() {
                                ug0 a;
                                a = iv1.a.a(context);
                                return a;
                            }
                        }));
                        k.incrementAndGet();
                    }
                }
            } finally {
            }
        }
    }

    public static void m() {
        k.incrementAndGet();
    }

    public static /* synthetic */ boolean n() {
        return true;
    }

    public final Object f() {
        Object j2;
        if (!this.f) {
            qj0.n(j.a(this.b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i2 = k.get();
        if (this.d < i2) {
            synchronized (this) {
                try {
                    if (this.d < i2) {
                        fw1 fw1Var = h;
                        ug0 a = ug0.a();
                        String str = null;
                        if (fw1Var != null) {
                            a = (ug0) fw1Var.b().get();
                            if (a.c()) {
                                hw1 hw1Var = this.a;
                                str = ((fv1) a.b()).a(hw1Var.b, hw1Var.a, hw1Var.d, this.b);
                            }
                        }
                        qj0.n(fw1Var != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        if (!this.a.f ? (j2 = j(fw1Var)) == null && (j2 = g(fw1Var)) == null : (j2 = g(fw1Var)) == null && (j2 = j(fw1Var)) == null) {
                            j2 = this.c;
                        }
                        if (a.c()) {
                            j2 = str == null ? this.c : h(str);
                        }
                        this.e = j2;
                        this.d = i2;
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public final Object g(fw1 fw1Var) {
        uw uwVar;
        hw1 hw1Var = this.a;
        if (!hw1Var.e && ((uwVar = hw1Var.i) == null || ((Boolean) uwVar.apply(fw1Var.a())).booleanValue())) {
            dv1 a = dv1.a(fw1Var.a());
            hw1 hw1Var2 = this.a;
            Object h2 = a.h(hw1Var2.e ? null : i(hw1Var2.c));
            if (h2 != null) {
                return h(h2);
            }
        }
        return null;
    }

    public abstract Object h(Object obj);

    public final String i(String str) {
        if (str == null || !str.isEmpty()) {
            String str2 = this.b;
            return str + str2;
        }
        return this.b;
    }

    public final Object j(fw1 fw1Var) {
        Object h2;
        tu1 a = this.a.b != null ? nv1.b(fw1Var.a(), this.a.b) ? this.a.h ? gu1.a(fw1Var.a().getContentResolver(), lv1.a(lv1.b(fw1Var.a(), this.a.b.getLastPathSegment())), new Runnable() { // from class: androidx.appcompat.view.menu.pv1
            @Override // java.lang.Runnable
            public final void run() {
                rv1.m();
            }
        }) : gu1.a(fw1Var.a().getContentResolver(), this.a.b, new Runnable() { // from class: androidx.appcompat.view.menu.pv1
            @Override // java.lang.Runnable
            public final void run() {
                rv1.m();
            }
        }) : null : jw1.b(fw1Var.a(), this.a.a, new Runnable() { // from class: androidx.appcompat.view.menu.pv1
            @Override // java.lang.Runnable
            public final void run() {
                rv1.m();
            }
        });
        if (a == null || (h2 = a.h(k())) == null) {
            return null;
        }
        return h(h2);
    }

    public final String k() {
        return i(this.a.d);
    }

    public rv1(hw1 hw1Var, String str, Object obj, boolean z) {
        this.d = -1;
        String str2 = hw1Var.a;
        if (str2 == null && hw1Var.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && hw1Var.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.a = hw1Var;
        this.b = str;
        this.c = obj;
        this.f = z;
    }
}
