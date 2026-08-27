package androidx.appcompat.view.menu;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class fb0 extends eb0 {
    public static Map d() {
        go goVar = go.m;
        c60.c(goVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return goVar;
    }

    public static final Map e(Map map) {
        c60.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : eb0.c(map) : cb0.d();
    }

    public static final void f(Map map, Iterable iterable) {
        c60.e(map, "<this>");
        c60.e(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            oh0 oh0Var = (oh0) it.next();
            map.put(oh0Var.a(), oh0Var.b());
        }
    }

    public static Map g(Iterable iterable) {
        c60.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return h(iterable, new LinkedHashMap(cb0.a(collection.size())));
                }
                return eb0.b((oh0) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
            }
            return cb0.d();
        }
        return e(h(iterable, new LinkedHashMap()));
    }

    public static final Map h(Iterable iterable, Map map) {
        c60.e(iterable, "<this>");
        c60.e(map, "destination");
        f(map, iterable);
        return map;
    }
}
