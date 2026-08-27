package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.kh;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public interface t60 extends kh.b {
    public static final b d = b.m;

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(t60 t60Var, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            t60Var.e(cancellationException);
        }

        public static Object b(t60 t60Var, Object obj, yw ywVar) {
            return kh.b.a.a(t60Var, obj, ywVar);
        }

        public static kh.b c(t60 t60Var, kh.c cVar) {
            return kh.b.a.b(t60Var, cVar);
        }

        public static /* synthetic */ mm d(t60 t60Var, boolean z, boolean z2, kw kwVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return t60Var.s(z, z2, kwVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static kh e(t60 t60Var, kh.c cVar) {
            return kh.b.a.c(t60Var, cVar);
        }

        public static kh f(t60 t60Var, kh khVar) {
            return kh.b.a.d(t60Var, khVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements kh.c {
        public static final /* synthetic */ b m = new b();
    }

    jb B(lb lbVar);

    boolean a();

    boolean c();

    void e(CancellationException cancellationException);

    mm h(kw kwVar);

    mm s(boolean z, boolean z2, kw kwVar);

    CancellationException w();
}
