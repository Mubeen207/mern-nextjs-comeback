package androidx.appcompat.view.menu;

import android.util.SparseArray;
/* loaded from: classes.dex */
public enum wl0 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    
    public static final SparseArray t;
    public final int m;

    static {
        wl0 wl0Var = DEFAULT;
        wl0 wl0Var2 = UNMETERED_ONLY;
        wl0 wl0Var3 = UNMETERED_OR_DAILY;
        wl0 wl0Var4 = FAST_IF_RADIO_AWAKE;
        wl0 wl0Var5 = NEVER;
        wl0 wl0Var6 = UNRECOGNIZED;
        SparseArray sparseArray = new SparseArray();
        t = sparseArray;
        sparseArray.put(0, wl0Var);
        sparseArray.put(1, wl0Var2);
        sparseArray.put(2, wl0Var3);
        sparseArray.put(3, wl0Var4);
        sparseArray.put(4, wl0Var5);
        sparseArray.put(-1, wl0Var6);
    }

    wl0(int i) {
        this.m = i;
    }
}
