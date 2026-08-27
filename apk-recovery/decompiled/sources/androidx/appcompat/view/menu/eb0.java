package androidx.appcompat.view.menu;

import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class eb0 extends db0 {
    public static int a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map b(oh0 oh0Var) {
        c60.e(oh0Var, "pair");
        Map singletonMap = Collections.singletonMap(oh0Var.c(), oh0Var.d());
        c60.d(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final Map c(Map map) {
        c60.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        c60.d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
