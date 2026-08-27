package androidx.appcompat.view.menu;

import java.util.List;
/* loaded from: classes.dex */
public final class si1 extends jh1 {
    public si1() {
        this.a.add(wj1.AND);
        this.a.add(wj1.NOT);
        this.a.add(wj1.OR);
    }

    @Override // androidx.appcompat.view.menu.jh1
    public final tg1 b(String str, sw1 sw1Var, List list) {
        int i = yi1.a[lu1.c(str).ordinal()];
        if (i == 1) {
            lu1.f(wj1.AND, 2, list);
            tg1 b = sw1Var.b((tg1) list.get(0));
            return !b.d().booleanValue() ? b : sw1Var.b((tg1) list.get(1));
        } else if (i == 2) {
            lu1.f(wj1.NOT, 1, list);
            return new vf1(Boolean.valueOf(!sw1Var.b((tg1) list.get(0)).d().booleanValue()));
        } else if (i != 3) {
            return super.a(str);
        } else {
            lu1.f(wj1.OR, 2, list);
            tg1 b2 = sw1Var.b((tg1) list.get(0));
            return b2.d().booleanValue() ? b2 : sw1Var.b((tg1) list.get(1));
        }
    }
}
