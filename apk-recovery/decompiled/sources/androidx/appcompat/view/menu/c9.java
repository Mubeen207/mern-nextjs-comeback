package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract /* synthetic */ class c9 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.appcompat.view.menu.g, androidx.appcompat.view.menu.ok, java.lang.Object] */
    public static final ok a(th thVar, kh khVar, xh xhVar, yw ywVar) {
        kh d = lh.d(thVar, khVar);
        n80 n80Var = xhVar.g() ? new n80(d, ywVar) : new rk(d, true);
        n80Var.K0(xhVar, n80Var, ywVar);
        return n80Var;
    }

    public static /* synthetic */ ok b(th thVar, kh khVar, xh xhVar, yw ywVar, int i, Object obj) {
        if ((i & 1) != 0) {
            khVar = bo.m;
        }
        if ((i & 2) != 0) {
            xhVar = xh.DEFAULT;
        }
        return b9.a(thVar, khVar, xhVar, ywVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.appcompat.view.menu.g, androidx.appcompat.view.menu.t60, java.lang.Object] */
    public static final t60 c(th thVar, kh khVar, xh xhVar, yw ywVar) {
        kh d = lh.d(thVar, khVar);
        s80 s80Var = xhVar.g() ? new s80(d, ywVar) : new qw0(d, true);
        s80Var.K0(xhVar, s80Var, ywVar);
        return s80Var;
    }

    public static /* synthetic */ t60 d(th thVar, kh khVar, xh xhVar, yw ywVar, int i, Object obj) {
        if ((i & 1) != 0) {
            khVar = bo.m;
        }
        if ((i & 2) != 0) {
            xhVar = xh.DEFAULT;
        }
        return b9.c(thVar, khVar, xhVar, ywVar);
    }
}
