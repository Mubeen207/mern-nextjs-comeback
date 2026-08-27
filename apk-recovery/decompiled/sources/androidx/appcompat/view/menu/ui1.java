package androidx.appcompat.view.menu;

import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class ui1 implements Comparator {
    public final /* synthetic */ jg1 m;
    public final /* synthetic */ sw1 n;

    public ui1(jg1 jg1Var, sw1 sw1Var) {
        this.m = jg1Var;
        this.n = sw1Var;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        tg1 tg1Var = (tg1) obj;
        tg1 tg1Var2 = (tg1) obj2;
        jg1 jg1Var = this.m;
        sw1 sw1Var = this.n;
        if (tg1Var instanceof hh1) {
            return !(tg1Var2 instanceof hh1) ? 1 : 0;
        } else if (tg1Var2 instanceof hh1) {
            return -1;
        } else {
            return jg1Var == null ? tg1Var.g().compareTo(tg1Var2.g()) : (int) lu1.a(jg1Var.a(sw1Var, Arrays.asList(tg1Var, tg1Var2)).f().doubleValue());
        }
    }
}
