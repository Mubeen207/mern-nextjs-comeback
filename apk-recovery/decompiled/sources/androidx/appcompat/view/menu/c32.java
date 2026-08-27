package androidx.appcompat.view.menu;

import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class c32 extends jg1 {
    public final ff1 o;

    public c32(ff1 ff1Var) {
        super("internal.eventLogger");
        this.o = ff1Var;
    }

    @Override // androidx.appcompat.view.menu.jg1
    public final tg1 a(sw1 sw1Var, List list) {
        lu1.g(this.m, 3, list);
        String g = sw1Var.b((tg1) list.get(0)).g();
        long a = (long) lu1.a(sw1Var.b((tg1) list.get(1)).f().doubleValue());
        tg1 b = sw1Var.b((tg1) list.get(2));
        this.o.c(g, a, b instanceof rg1 ? lu1.e((rg1) b) : new HashMap());
        return tg1.e;
    }
}
