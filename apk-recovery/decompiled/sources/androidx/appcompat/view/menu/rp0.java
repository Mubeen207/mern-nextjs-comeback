package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.qp0;
/* loaded from: classes.dex */
public abstract class rp0 {
    public static final Object a(Throwable th) {
        c60.e(th, "exception");
        return new qp0.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof qp0.b) {
            throw ((qp0.b) obj).m;
        }
    }
}
