package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ef2 extends jg1 {
    public boolean o;
    public boolean p;
    public final /* synthetic */ ne2 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef2(ne2 ne2Var, boolean z, boolean z2) {
        super("log");
        this.q = ne2Var;
        this.o = z;
        this.p = z2;
    }

    @Override // androidx.appcompat.view.menu.jg1
    public final tg1 a(sw1 sw1Var, List list) {
        kf2 kf2Var;
        kf2 kf2Var2;
        kf2 kf2Var3;
        lu1.k("log", 1, list);
        if (list.size() == 1) {
            kf2Var3 = this.q.o;
            kf2Var3.a(te2.INFO, sw1Var.b((tg1) list.get(0)).g(), Collections.emptyList(), this.o, this.p);
            return tg1.e;
        }
        te2 c = te2.c(lu1.i(sw1Var.b((tg1) list.get(0)).f().doubleValue()));
        String g = sw1Var.b((tg1) list.get(1)).g();
        if (list.size() == 2) {
            kf2Var2 = this.q.o;
            kf2Var2.a(c, g, Collections.emptyList(), this.o, this.p);
            return tg1.e;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 2; i < Math.min(list.size(), 5); i++) {
            arrayList.add(sw1Var.b((tg1) list.get(i)).g());
        }
        kf2Var = this.q.o;
        kf2Var.a(c, g, arrayList, this.o, this.p);
        return tg1.e;
    }
}
