package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.appcompat.view.menu.cz0;
import androidx.appcompat.view.menu.ey0;
import androidx.appcompat.view.menu.ez0;
import androidx.appcompat.view.menu.fd0;
import androidx.appcompat.view.menu.fy0;
import androidx.appcompat.view.menu.gs;
import androidx.appcompat.view.menu.h21;
import androidx.appcompat.view.menu.hl0;
import androidx.appcompat.view.menu.jr;
import androidx.appcompat.view.menu.js;
import androidx.appcompat.view.menu.kr;
import androidx.appcompat.view.menu.lr;
import androidx.appcompat.view.menu.m11;
import androidx.appcompat.view.menu.mz0;
import androidx.appcompat.view.menu.oe0;
import androidx.appcompat.view.menu.pg0;
import androidx.appcompat.view.menu.pj0;
import androidx.appcompat.view.menu.qy0;
import androidx.appcompat.view.menu.rl0;
import androidx.appcompat.view.menu.tr;
import androidx.appcompat.view.menu.vo;
import androidx.appcompat.view.menu.wi;
import androidx.appcompat.view.menu.zo;
import androidx.appcompat.view.menu.zx;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import com.google.firebase.messaging.b;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class FirebaseMessaging {
    public static final long n = TimeUnit.HOURS.toSeconds(8);
    public static b o;
    public static h21 p;
    public static ScheduledExecutorService q;
    public final tr a;
    public final gs b;
    public final Context c;
    public final zx d;
    public final com.google.firebase.messaging.a e;
    public final a f;
    public final Executor g;
    public final Executor h;
    public final Executor i;
    public final cz0 j;
    public final fd0 k;
    public boolean l;
    public final Application.ActivityLifecycleCallbacks m;

    /* loaded from: classes.dex */
    public class a {
        public final ey0 a;
        public boolean b;
        public zo c;
        public Boolean d;

        public a(ey0 ey0Var) {
            this.a = ey0Var;
        }

        public synchronized void b() {
            try {
                if (this.b) {
                    return;
                }
                Boolean e = e();
                this.d = e;
                if (e == null) {
                    zo zoVar = new zo() { // from class: androidx.appcompat.view.menu.rs
                        @Override // androidx.appcompat.view.menu.zo
                        public final void a(vo voVar) {
                            FirebaseMessaging.a.this.d(voVar);
                        }
                    };
                    this.c = zoVar;
                    this.a.b(wi.class, zoVar);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.a.s();
        }

        public final /* synthetic */ void d(vo voVar) {
            if (c()) {
                FirebaseMessaging.this.D();
            }
        }

        public final Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context j = FirebaseMessaging.this.a.j();
            SharedPreferences sharedPreferences = j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = j.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(j.getPackageName(), PackageParser.PARSE_IS_PRIVILEGED)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public synchronized void f(boolean z) {
            try {
                b();
                zo zoVar = this.c;
                if (zoVar != null) {
                    this.a.c(wi.class, zoVar);
                    this.c = null;
                }
                SharedPreferences.Editor edit = FirebaseMessaging.this.a.j().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("auto_init", z);
                edit.apply();
                if (z) {
                    FirebaseMessaging.this.D();
                }
                this.d = Boolean.valueOf(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public FirebaseMessaging(tr trVar, js jsVar, hl0 hl0Var, hl0 hl0Var2, gs gsVar, h21 h21Var, ey0 ey0Var) {
        this(trVar, jsVar, hl0Var, hl0Var2, gsVar, h21Var, ey0Var, new fd0(trVar.j()));
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(tr trVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) trVar.i(FirebaseMessaging.class);
            pj0.j(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public static synchronized FirebaseMessaging l() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(tr.k());
        }
        return firebaseMessaging;
    }

    public static synchronized b m(Context context) {
        b bVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (o == null) {
                    o = new b(context);
                }
                bVar = o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static h21 q() {
        return p;
    }

    public void A(boolean z) {
        this.f.f(z);
    }

    public synchronized void B(boolean z) {
        this.l = z;
    }

    public final synchronized void C() {
        if (!this.l) {
            E(0L);
        }
    }

    public final void D() {
        if (F(p())) {
            C();
        }
    }

    public synchronized void E(long j) {
        j(new qy0(this, Math.min(Math.max(30L, 2 * j), n)), j);
        this.l = true;
    }

    public boolean F(b.a aVar) {
        return aVar == null || aVar.b(this.k.a());
    }

    public String i() {
        final b.a p2 = p();
        if (F(p2)) {
            final String c = fd0.c(this.a);
            try {
                return (String) mz0.a(this.e.b(c, new a.InterfaceC0066a() { // from class: androidx.appcompat.view.menu.os
                    @Override // com.google.firebase.messaging.a.InterfaceC0066a
                    public final cz0 a() {
                        cz0 u;
                        u = FirebaseMessaging.this.u(c, p2);
                        return u;
                    }
                }));
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        return p2.a;
    }

    public void j(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (q == null) {
                    q = new ScheduledThreadPoolExecutor(1, new oe0("TAG"));
                }
                q.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Context k() {
        return this.c;
    }

    public final String n() {
        return "[DEFAULT]".equals(this.a.l()) ? "" : this.a.n();
    }

    public cz0 o() {
        final ez0 ez0Var = new ez0();
        this.g.execute(new Runnable() { // from class: androidx.appcompat.view.menu.ps
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.w(ez0Var);
            }
        });
        return ez0Var.a();
    }

    public b.a p() {
        return m(this.c).d(n(), fd0.c(this.a));
    }

    public final void r(String str) {
        if ("[DEFAULT]".equals(this.a.l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invoking onNewToken for app: ");
                sb.append(this.a.l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new jr(this.c).k(intent);
        }
    }

    public boolean s() {
        return this.f.c();
    }

    public boolean t() {
        return this.k.g();
    }

    public final /* synthetic */ cz0 u(final String str, final b.a aVar) {
        return this.d.e().n(this.i, new fy0() { // from class: androidx.appcompat.view.menu.qs
            @Override // androidx.appcompat.view.menu.fy0
            public final cz0 a(Object obj) {
                cz0 v;
                v = FirebaseMessaging.this.v(str, aVar, (String) obj);
                return v;
            }
        });
    }

    public final /* synthetic */ cz0 v(String str, b.a aVar, String str2) {
        m(this.c).f(n(), str, str2, this.k.a());
        if (aVar == null || !str2.equals(aVar.a)) {
            r(str2);
        }
        return mz0.e(str2);
    }

    public final /* synthetic */ void w(ez0 ez0Var) {
        try {
            ez0Var.c(i());
        } catch (Exception e) {
            ez0Var.b(e);
        }
    }

    public final /* synthetic */ void x() {
        if (s()) {
            D();
        }
    }

    public final /* synthetic */ void y(m11 m11Var) {
        if (s()) {
            m11Var.o();
        }
    }

    public final /* synthetic */ void z() {
        rl0.c(this.c);
    }

    public FirebaseMessaging(tr trVar, js jsVar, hl0 hl0Var, hl0 hl0Var2, gs gsVar, h21 h21Var, ey0 ey0Var, fd0 fd0Var) {
        this(trVar, jsVar, gsVar, h21Var, ey0Var, fd0Var, new zx(trVar, fd0Var, hl0Var, hl0Var2, gsVar), kr.f(), kr.c(), kr.b());
    }

    public FirebaseMessaging(tr trVar, js jsVar, gs gsVar, h21 h21Var, ey0 ey0Var, fd0 fd0Var, zx zxVar, Executor executor, Executor executor2, Executor executor3) {
        this.l = false;
        p = h21Var;
        this.a = trVar;
        this.b = gsVar;
        this.f = new a(ey0Var);
        Context j = trVar.j();
        this.c = j;
        lr lrVar = new lr();
        this.m = lrVar;
        this.k = fd0Var;
        this.h = executor;
        this.d = zxVar;
        this.e = new com.google.firebase.messaging.a(executor);
        this.g = executor2;
        this.i = executor3;
        Context j2 = trVar.j();
        if (j2 instanceof Application) {
            ((Application) j2).registerActivityLifecycleCallbacks(lrVar);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Context ");
            sb.append(j2);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (jsVar != null) {
            jsVar.a(new js.a() { // from class: androidx.appcompat.view.menu.ks
            });
        }
        executor2.execute(new Runnable() { // from class: androidx.appcompat.view.menu.ls
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.x();
            }
        });
        cz0 e = m11.e(this, fd0Var, zxVar, j, kr.g());
        this.j = e;
        e.e(executor2, new pg0() { // from class: androidx.appcompat.view.menu.ms
            @Override // androidx.appcompat.view.menu.pg0
            public final void a(Object obj) {
                FirebaseMessaging.this.y((m11) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: androidx.appcompat.view.menu.ns
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.z();
            }
        });
    }
}
