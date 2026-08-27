package androidx.appcompat.view.menu;

import java.util.Comparator;
import java.util.SortedSet;
/* loaded from: classes.dex */
public abstract class ew0 {
    public static Comparator a(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        return comparator == null ? yg0.c() : comparator;
    }

    public static boolean b(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        qj0.i(comparator);
        qj0.i(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else if (!(iterable instanceof dw0)) {
            return false;
        } else {
            comparator2 = ((dw0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
