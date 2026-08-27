package androidx.appcompat.view.menu;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract /* synthetic */ class ng1 {
    public static tg1 a(hg1 hg1Var, tg1 tg1Var, sw1 sw1Var, List list) {
        if (hg1Var.k(tg1Var.g())) {
            tg1 h = hg1Var.h(tg1Var.g());
            if (h instanceof jg1) {
                return ((jg1) h).a(sw1Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", tg1Var.g()));
        } else if ("hasOwnProperty".equals(tg1Var.g())) {
            lu1.g("hasOwnProperty", 1, list);
            return hg1Var.k(sw1Var.b((tg1) list.get(0)).g()) ? tg1.j : tg1.k;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", tg1Var.g()));
        }
    }

    public static Iterator b(Map map) {
        return new lg1(map.keySet().iterator());
    }
}
