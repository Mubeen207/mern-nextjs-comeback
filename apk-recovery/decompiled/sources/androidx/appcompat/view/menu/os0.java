package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public interface os0 {

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ boolean a(os0 os0Var, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return os0Var.k(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    boolean A();

    boolean k(Throwable th);

    Object q(Object obj, xg xgVar);

    void v(kw kwVar);

    Object y(Object obj);
}
