package androidx.appcompat.view.menu;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class se0 extends yg0 implements Serializable {
    public static final se0 m = new se0();

    @Override // androidx.appcompat.view.menu.yg0, java.util.Comparator
    /* renamed from: f */
    public int compare(Comparable comparable, Comparable comparable2) {
        qj0.i(comparable);
        qj0.i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
