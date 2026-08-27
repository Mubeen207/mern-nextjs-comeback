package androidx.appcompat.view.menu;

import java.util.List;
/* loaded from: classes.dex */
public abstract class qh0 {
    public static Object a(List list) {
        Object b = ph0.c.b(list);
        if (b != null) {
            return b;
        }
        Object b2 = ph0.b.b(new Object[0]);
        for (Object obj : list) {
            ph0.d.b(b2, obj);
        }
        ph0.f.b(b2, Boolean.TRUE);
        return b2;
    }
}
