package androidx.appcompat.view.menu;

import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class xc extends wc {
    public static boolean k(Collection collection, Iterable iterable) {
        c60.e(collection, "<this>");
        c60.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object obj : iterable) {
            if (collection.add(obj)) {
                z = true;
            }
        }
        return z;
    }

    public static final boolean l(Iterable iterable, kw kwVar, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) kwVar.i(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean m(Iterable iterable, kw kwVar) {
        c60.e(iterable, "<this>");
        c60.e(kwVar, "predicate");
        return l(iterable, kwVar, false);
    }
}
