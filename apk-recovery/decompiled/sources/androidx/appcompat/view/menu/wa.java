package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class wa {
    public static final /* synthetic */ ys a(ys ysVar, kh khVar) {
        return d(ysVar, khVar);
    }

    public static final Object b(kh khVar, Object obj, Object obj2, yw ywVar, xg xgVar) {
        Object c;
        Object c2 = l01.c(khVar, obj2);
        try {
            Object h = ((yw) t21.a(ywVar, 2)).h(obj, new ow0(xgVar, khVar));
            l01.a(khVar, c2);
            c = f60.c();
            if (h == c) {
                gj.c(xgVar);
            }
            return h;
        } catch (Throwable th) {
            l01.a(khVar, c2);
            throw th;
        }
    }

    public static /* synthetic */ Object c(kh khVar, Object obj, Object obj2, yw ywVar, xg xgVar, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = l01.b(khVar);
        }
        return b(khVar, obj, obj2, ywVar, xgVar);
    }

    public static final ys d(ys ysVar, kh khVar) {
        return ysVar instanceof rs0 ? ysVar : new o31(ysVar, khVar);
    }
}
