package androidx.appcompat.view.menu;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
/* loaded from: classes.dex */
public final class va0 {
    public static final va0 a;
    public static final boolean b = false;
    public static final ta0 c;

    static {
        va0 va0Var = new va0();
        a = va0Var;
        wy0.f("kotlinx.coroutines.fast.service.loader", true);
        c = va0Var.a();
    }

    public final ta0 a() {
        ss0 a2;
        List d;
        Object next;
        ta0 e;
        try {
            if (b) {
                d = dr.a.c();
            } else {
                a2 = ws0.a(ServiceLoader.load(ua0.class, ua0.class.getClassLoader()).iterator());
                d = ys0.d(a2);
            }
            Iterator it = d.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c2 = ((ua0) next).c();
                    do {
                        Object next2 = it.next();
                        int c3 = ((ua0) next2).c();
                        if (c2 < c3) {
                            next = next2;
                            c2 = c3;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            ua0 ua0Var = (ua0) next;
            return (ua0Var == null || (e = wa0.e(ua0Var, d)) == null) ? wa0.b(null, null, 3, null) : e;
        } catch (Throwable th) {
            return wa0.b(th, null, 2, null);
        }
    }
}
