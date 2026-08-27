package androidx.appcompat.view.menu;

import java.util.List;
/* loaded from: classes.dex */
public abstract class wa0 {
    public static final boolean a = false;

    public static final ud0 a(Throwable th, String str) {
        if (a) {
            return new ud0(th, str);
        }
        if (th != null) {
            throw th;
        }
        d();
        throw new g80();
    }

    public static /* synthetic */ ud0 b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(ta0 ta0Var) {
        return ta0Var.F() instanceof ud0;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final ta0 e(ua0 ua0Var, List list) {
        try {
            return ua0Var.b(list);
        } catch (Throwable th) {
            return a(th, ua0Var.a());
        }
    }
}
