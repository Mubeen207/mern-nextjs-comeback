package androidx.appcompat.view.menu;

import java.util.Comparator;
/* loaded from: classes.dex */
public final class xx1 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        tx1 tx1Var = (tx1) obj;
        tx1 tx1Var2 = (tx1) obj2;
        fy1 fy1Var = (fy1) tx1Var.iterator();
        fy1 fy1Var2 = (fy1) tx1Var2.iterator();
        while (fy1Var.hasNext() && fy1Var2.hasNext()) {
            int compareTo = Integer.valueOf(tx1.g(fy1Var.a())).compareTo(Integer.valueOf(tx1.g(fy1Var2.a())));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(tx1Var.t()).compareTo(Integer.valueOf(tx1Var2.t()));
    }
}
