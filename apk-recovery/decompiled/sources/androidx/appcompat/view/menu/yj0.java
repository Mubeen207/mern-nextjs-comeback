package androidx.appcompat.view.menu;

import android.util.SparseArray;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class yj0 {
    public static SparseArray a = new SparseArray();
    public static HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(wj0.DEFAULT, 0);
        b.put(wj0.VERY_LOW, 1);
        b.put(wj0.HIGHEST, 2);
        for (wj0 wj0Var : b.keySet()) {
            a.append(((Integer) b.get(wj0Var)).intValue(), wj0Var);
        }
    }

    public static int a(wj0 wj0Var) {
        Integer num = (Integer) b.get(wj0Var);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + wj0Var);
    }

    public static wj0 b(int i) {
        wj0 wj0Var = (wj0) a.get(i);
        if (wj0Var != null) {
            return wj0Var;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
