package androidx.appcompat.view.menu;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.appcompat.view.menu.qp0;
/* loaded from: classes.dex */
public abstract class wy {
    public static final vy a;
    private static volatile Choreographer choreographer;

    static {
        Object a2;
        try {
            qp0.a aVar = qp0.m;
            a2 = qp0.a(new uy(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            qp0.a aVar2 = qp0.m;
            a2 = qp0.a(rp0.a(th));
        }
        a = qp0.c(a2) ? null : a2;
    }

    public static final Handler a(Looper looper, boolean z) {
        if (z) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            c60.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        return new Handler(looper);
    }
}
