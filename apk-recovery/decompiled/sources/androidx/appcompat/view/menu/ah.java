package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.kh;
/* loaded from: classes.dex */
public interface ah extends kh.b {
    public static final b b = b.m;

    /* loaded from: classes.dex */
    public static final class a {
        public static kh.b a(ah ahVar, kh.c cVar) {
            c60.e(cVar, "key");
            if (!(cVar instanceof i)) {
                if (ah.b == cVar) {
                    c60.c(ahVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                    return ahVar;
                }
                return null;
            }
            i iVar = (i) cVar;
            if (iVar.a(ahVar.getKey())) {
                kh.b b = iVar.b(ahVar);
                if (b instanceof kh.b) {
                    return b;
                }
                return null;
            }
            return null;
        }

        public static kh b(ah ahVar, kh.c cVar) {
            c60.e(cVar, "key");
            if (!(cVar instanceof i)) {
                return ah.b == cVar ? bo.m : ahVar;
            }
            i iVar = (i) cVar;
            return (!iVar.a(ahVar.getKey()) || iVar.b(ahVar) == null) ? ahVar : bo.m;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements kh.c {
        public static final /* synthetic */ b m = new b();
    }

    void x(xg xgVar);

    xg z(xg xgVar);
}
