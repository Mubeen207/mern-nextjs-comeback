package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.view.menu.ao;
import androidx.appcompat.view.menu.c60;
import androidx.appcompat.view.menu.d90;
import androidx.appcompat.view.menu.lj;
import androidx.lifecycle.f;
import androidx.lifecycle.n;
/* loaded from: classes.dex */
public final class l implements d90 {
    public static final b i = new b(null);
    public static final l j = new l();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final i f = new i(this);
    public final Runnable g = new Runnable() { // from class: androidx.appcompat.view.menu.ak0
        @Override // java.lang.Runnable
        public final void run() {
            androidx.lifecycle.l.j(androidx.lifecycle.l.this);
        }
    };
    public final n.a h = new d();

    /* loaded from: classes.dex */
    public static final class a {
        public static final a a = new a();

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            c60.e(activity, "activity");
            c60.e(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(lj ljVar) {
            this();
        }

        public final d90 a() {
            return l.j;
        }

        public final void b(Context context) {
            c60.e(context, "context");
            l.j.i(context);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ao {

        /* loaded from: classes.dex */
        public static final class a extends ao {
            final /* synthetic */ l this$0;

            public a(l lVar) {
                this.this$0 = lVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                c60.e(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                c60.e(activity, "activity");
                this.this$0.f();
            }
        }

        public c() {
        }

        @Override // androidx.appcompat.view.menu.ao, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            c60.e(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                n.b.b(activity).e(l.this.h);
            }
        }

        @Override // androidx.appcompat.view.menu.ao, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            c60.e(activity, "activity");
            l.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            c60.e(activity, "activity");
            a.a(activity, new a(l.this));
        }

        @Override // androidx.appcompat.view.menu.ao, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            c60.e(activity, "activity");
            l.this.g();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements n.a {
        public d() {
        }

        @Override // androidx.lifecycle.n.a
        public void a() {
        }

        @Override // androidx.lifecycle.n.a
        public void b() {
            l.this.e();
        }

        @Override // androidx.lifecycle.n.a
        public void c() {
            l.this.f();
        }
    }

    public static final void j(l lVar) {
        c60.e(lVar, "this$0");
        lVar.m();
        lVar.n();
    }

    public static final d90 o() {
        return i.a();
    }

    public final void d() {
        int i2 = this.b - 1;
        this.b = i2;
        if (i2 == 0) {
            Handler handler = this.e;
            c60.b(handler);
            handler.postDelayed(this.g, 700L);
        }
    }

    public final void e() {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == 1) {
            if (this.c) {
                this.f.h(f.a.ON_RESUME);
                this.c = false;
                return;
            }
            Handler handler = this.e;
            c60.b(handler);
            handler.removeCallbacks(this.g);
        }
    }

    public final void f() {
        int i2 = this.a + 1;
        this.a = i2;
        if (i2 == 1 && this.d) {
            this.f.h(f.a.ON_START);
            this.d = false;
        }
    }

    public final void g() {
        this.a--;
        n();
    }

    @Override // androidx.appcompat.view.menu.d90
    public f h() {
        return this.f;
    }

    public final void i(Context context) {
        c60.e(context, "context");
        this.e = new Handler();
        this.f.h(f.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        c60.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void m() {
        if (this.b == 0) {
            this.c = true;
            this.f.h(f.a.ON_PAUSE);
        }
    }

    public final void n() {
        if (this.a == 0 && this.c) {
            this.f.h(f.a.ON_STOP);
            this.d = true;
        }
    }
}
