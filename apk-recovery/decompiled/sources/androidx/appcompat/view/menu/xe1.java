package androidx.appcompat.view.menu;

import java.util.Collections;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class xe1 {
    public final TreeMap a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public static int a(sw1 sw1Var, vg1 vg1Var, tg1 tg1Var) {
        tg1 a = vg1Var.a(sw1Var, Collections.singletonList(tg1Var));
        if (a instanceof bg1) {
            return lu1.i(a.f().doubleValue());
        }
        return -1;
    }

    public final void b(sw1 sw1Var, ff1 ff1Var) {
        q92 q92Var = new q92(ff1Var);
        for (Integer num : this.a.keySet()) {
            kf1 kf1Var = (kf1) ff1Var.d().clone();
            int a = a(sw1Var, (vg1) this.a.get(num), q92Var);
            if (a == 2 || a == -1) {
                ff1Var.e(kf1Var);
            }
        }
        for (Integer num2 : this.b.keySet()) {
            a(sw1Var, (vg1) this.b.get(num2), q92Var);
        }
    }

    public final void c(String str, int i, vg1 vg1Var, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.b;
        } else if (!"edit".equals(str2)) {
            throw new IllegalStateException("Unknown callback type: " + str2);
        } else {
            treeMap = this.a;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), vg1Var);
    }
}
