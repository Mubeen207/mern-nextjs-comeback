package androidx.appcompat.view.menu;

import java.util.Collection;
/* loaded from: classes.dex */
public abstract class l60 {
    public static Collection a(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : o90.g(iterable.iterator());
    }

    public static Object[] b(Iterable iterable) {
        return a(iterable).toArray();
    }
}
