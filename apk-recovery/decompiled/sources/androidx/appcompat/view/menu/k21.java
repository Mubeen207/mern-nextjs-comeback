package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class k21 implements e21 {
    public final g21 a;
    public final String b;
    public final lo c;
    public final u11 d;
    public final l21 e;

    public k21(g21 g21Var, String str, lo loVar, u11 u11Var, l21 l21Var) {
        this.a = g21Var;
        this.b = str;
        this.c = loVar;
        this.d = u11Var;
        this.e = l21Var;
    }

    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // androidx.appcompat.view.menu.e21
    public void a(wo woVar) {
        d(woVar, new q21() { // from class: androidx.appcompat.view.menu.j21
            @Override // androidx.appcompat.view.menu.q21
            public final void a(Exception exc) {
                k21.c(exc);
            }
        });
    }

    public void d(wo woVar, q21 q21Var) {
        this.e.a(qs0.a().e(this.a).c(woVar).f(this.b).d(this.d).b(this.c).a(), q21Var);
    }
}
