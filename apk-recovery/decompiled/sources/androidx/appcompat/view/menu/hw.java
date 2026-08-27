package androidx.appcompat.view.menu;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.f;
import androidx.lifecycle.r;
/* loaded from: classes.dex */
public class hw implements androidx.lifecycle.e, ur0, e61 {
    public final fv a;
    public final d61 b;
    public final Runnable c;
    public androidx.lifecycle.i d = null;
    public tr0 e = null;

    public hw(fv fvVar, d61 d61Var, Runnable runnable) {
        this.a = fvVar;
        this.b = d61Var;
        this.c = runnable;
    }

    public void a(f.a aVar) {
        this.d.h(aVar);
    }

    @Override // androidx.lifecycle.e
    public gi b() {
        Application application;
        Context applicationContext = this.a.R0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        le0 le0Var = new le0();
        if (application != null) {
            le0Var.b(r.a.e, application);
        }
        le0Var.b(androidx.lifecycle.p.a, this.a);
        le0Var.b(androidx.lifecycle.p.b, this);
        if (this.a.o() != null) {
            le0Var.b(androidx.lifecycle.p.c, this.a.o());
        }
        return le0Var;
    }

    @Override // androidx.appcompat.view.menu.e61
    public d61 c() {
        d();
        return this.b;
    }

    public void d() {
        if (this.d == null) {
            this.d = new androidx.lifecycle.i(this);
            tr0 a = tr0.a(this);
            this.e = a;
            a.c();
            this.c.run();
        }
    }

    public boolean e() {
        return this.d != null;
    }

    public void f(Bundle bundle) {
        this.e.d(bundle);
    }

    public void g(Bundle bundle) {
        this.e.e(bundle);
    }

    @Override // androidx.appcompat.view.menu.d90
    public androidx.lifecycle.f h() {
        d();
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.ur0
    public sr0 l() {
        d();
        return this.e.b();
    }
}
