package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.r40;
import androidx.appcompat.view.menu.s40;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class u40 extends s40 {
    public final transient t40 o;

    /* loaded from: classes.dex */
    public static final class a extends s40.a {
        public u40 a() {
            Collection entrySet = this.a.entrySet();
            Comparator comparator = this.b;
            if (comparator != null) {
                entrySet = yg0.a(comparator).d().b(entrySet);
            }
            return u40.e(entrySet, this.c);
        }
    }

    public u40(r40 r40Var, int i, Comparator comparator) {
        super(r40Var, i);
        this.o = d(comparator);
    }

    public static t40 d(Comparator comparator) {
        return comparator == null ? t40.u() : v40.E(comparator);
    }

    public static u40 e(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return f();
        }
        r40.a aVar = new r40.a(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            t40 g = g(comparator, (Collection) entry.getValue());
            if (!g.isEmpty()) {
                aVar.e(key, g);
                i += g.size();
            }
        }
        return new u40(aVar.b(), i, comparator);
    }

    public static u40 f() {
        return Cdo.p;
    }

    public static t40 g(Comparator comparator, Collection collection) {
        return comparator == null ? t40.r(collection) : v40.B(comparator, collection);
    }
}
