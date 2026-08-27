package androidx.appcompat.view.menu;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public class n21 implements l21 {
    public static volatile o21 e;
    public final ec a;
    public final ec b;
    public final wr0 c;
    public final l41 d;

    public n21(ec ecVar, ec ecVar2, wr0 wr0Var, l41 l41Var, pa1 pa1Var) {
        this.a = ecVar;
        this.b = ecVar2;
        this.c = wr0Var;
        this.d = l41Var;
        pa1Var.c();
    }

    public static n21 c() {
        o21 o21Var = e;
        if (o21Var != null) {
            return o21Var.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set d(pl plVar) {
        return plVar instanceof io ? Collections.unmodifiableSet(((io) plVar).a()) : Collections.singleton(lo.b("proto"));
    }

    public static void f(Context context) {
        if (e == null) {
            synchronized (n21.class) {
                try {
                    if (e == null) {
                        e = ri.d().b(context).a();
                    }
                } finally {
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.l21
    public void a(qs0 qs0Var, q21 q21Var) {
        this.c.a(qs0Var.f().f(qs0Var.c().c()), b(qs0Var), q21Var);
    }

    public final ap b(qs0 qs0Var) {
        return ap.a().i(this.a.a()).k(this.b.a()).j(qs0Var.g()).h(new jo(qs0Var.b(), qs0Var.d())).g(qs0Var.c().a()).d();
    }

    public l41 e() {
        return this.d;
    }

    public h21 g(pl plVar) {
        return new i21(d(plVar), g21.a().b(plVar.b()).c(plVar.c()).a(), this);
    }
}
