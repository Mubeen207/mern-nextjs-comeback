package androidx.lifecycle;

import androidx.appcompat.view.menu.b61;
import androidx.appcompat.view.menu.c60;
import androidx.appcompat.view.menu.e61;
import androidx.appcompat.view.menu.gi;
import androidx.appcompat.view.menu.pr0;
import androidx.appcompat.view.menu.qr0;
import androidx.appcompat.view.menu.ur0;
import androidx.lifecycle.f;
import androidx.lifecycle.r;
/* loaded from: classes.dex */
public abstract class p {
    public static final gi.b a = new b();
    public static final gi.b b = new c();
    public static final gi.b c = new a();

    /* loaded from: classes.dex */
    public static final class a implements gi.b {
    }

    /* loaded from: classes.dex */
    public static final class b implements gi.b {
    }

    /* loaded from: classes.dex */
    public static final class c implements gi.b {
    }

    /* loaded from: classes.dex */
    public static final class d implements r.b {
        @Override // androidx.lifecycle.r.b
        public b61 b(Class cls, gi giVar) {
            c60.e(cls, "modelClass");
            c60.e(giVar, "extras");
            return new qr0();
        }
    }

    public static final void a(ur0 ur0Var) {
        c60.e(ur0Var, "<this>");
        f.b b2 = ur0Var.h().b();
        if (b2 != f.b.INITIALIZED && b2 != f.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (ur0Var.l().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            pr0 pr0Var = new pr0(ur0Var.l(), (e61) ur0Var);
            ur0Var.l().h("androidx.lifecycle.internal.SavedStateHandlesProvider", pr0Var);
            ur0Var.h().a(new o(pr0Var));
        }
    }

    public static final qr0 b(e61 e61Var) {
        c60.e(e61Var, "<this>");
        return (qr0) new r(e61Var, new d()).b("androidx.lifecycle.internal.SavedStateHandlesVM", qr0.class);
    }
}
