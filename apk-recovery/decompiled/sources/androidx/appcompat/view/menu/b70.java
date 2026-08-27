package androidx.appcompat.view.menu;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public abstract /* synthetic */ class b70 {
    public static final kd a(t60 t60Var) {
        return new w60(t60Var);
    }

    public static /* synthetic */ kd b(t60 t60Var, int i, Object obj) {
        if ((i & 1) != 0) {
            t60Var = null;
        }
        return a70.a(t60Var);
    }

    public static final void c(kh khVar, CancellationException cancellationException) {
        t60 t60Var = (t60) khVar.d(t60.d);
        if (t60Var != null) {
            t60Var.e(cancellationException);
        }
    }

    public static final void d(t60 t60Var) {
        if (!t60Var.c()) {
            throw t60Var.w();
        }
    }
}
