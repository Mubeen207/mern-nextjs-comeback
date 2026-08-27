package androidx.appcompat.view.menu;

import android.os.Bundle;
import androidx.lifecycle.f;
/* loaded from: classes.dex */
public final class tr0 {
    public static final a d = new a(null);
    public final ur0 a;
    public final sr0 b;
    public boolean c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }

        public final tr0 a(ur0 ur0Var) {
            c60.e(ur0Var, "owner");
            return new tr0(ur0Var, null);
        }
    }

    public /* synthetic */ tr0(ur0 ur0Var, lj ljVar) {
        this(ur0Var);
    }

    public static final tr0 a(ur0 ur0Var) {
        return d.a(ur0Var);
    }

    public final sr0 b() {
        return this.b;
    }

    public final void c() {
        androidx.lifecycle.f h = this.a.h();
        if (h.b() != f.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        h.a(new ao0(this.a));
        this.b.e(h);
        this.c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.c) {
            c();
        }
        androidx.lifecycle.f h = this.a.h();
        if (!h.b().e(f.b.STARTED)) {
            this.b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + h.b()).toString());
    }

    public final void e(Bundle bundle) {
        c60.e(bundle, "outBundle");
        this.b.g(bundle);
    }

    public tr0(ur0 ur0Var) {
        this.a = ur0Var;
        this.b = new sr0();
    }
}
