package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class s72 extends o72 {
    public static void m(Object obj, g72 g72Var) {
        ((t02) obj).zzb = g72Var;
    }

    @Override // androidx.appcompat.view.menu.o72
    public final /* synthetic */ int a(Object obj) {
        return ((g72) obj).a();
    }

    @Override // androidx.appcompat.view.menu.o72
    public final /* synthetic */ Object b(Object obj, Object obj2) {
        g72 g72Var = (g72) obj;
        g72 g72Var2 = (g72) obj2;
        return g72.k().equals(g72Var2) ? g72Var : g72.k().equals(g72Var) ? g72.c(g72Var, g72Var2) : g72Var.b(g72Var2);
    }

    @Override // androidx.appcompat.view.menu.o72
    public final /* synthetic */ void c(Object obj, int i, tx1 tx1Var) {
        ((g72) obj).e((i << 3) | 2, tx1Var);
    }

    @Override // androidx.appcompat.view.menu.o72
    public final /* synthetic */ void d(Object obj, g92 g92Var) {
        ((g72) obj).g(g92Var);
    }

    @Override // androidx.appcompat.view.menu.o72
    public final /* synthetic */ int e(Object obj) {
        return ((g72) obj).i();
    }

    @Override // androidx.appcompat.view.menu.o72
    public final /* synthetic */ void f(Object obj, int i, long j) {
        ((g72) obj).e(i << 3, Long.valueOf(j));
    }

    @Override // androidx.appcompat.view.menu.o72
    public final /* synthetic */ void g(Object obj, g92 g92Var) {
        ((g72) obj).j(g92Var);
    }

    @Override // androidx.appcompat.view.menu.o72
    public final /* synthetic */ void h(Object obj, Object obj2) {
        m(obj, (g72) obj2);
    }

    @Override // androidx.appcompat.view.menu.o72
    public final /* synthetic */ Object i(Object obj) {
        g72 g72Var = ((t02) obj).zzb;
        if (g72Var == g72.k()) {
            g72 l = g72.l();
            m(obj, l);
            return l;
        }
        return g72Var;
    }

    @Override // androidx.appcompat.view.menu.o72
    public final /* synthetic */ void j(Object obj, Object obj2) {
        m(obj, (g72) obj2);
    }

    @Override // androidx.appcompat.view.menu.o72
    public final /* synthetic */ Object k(Object obj) {
        return ((t02) obj).zzb;
    }

    @Override // androidx.appcompat.view.menu.o72
    public final void l(Object obj) {
        ((t02) obj).zzb.m();
    }
}
