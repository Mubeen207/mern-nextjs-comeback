package androidx.appcompat.view.menu;

import java.util.List;
/* loaded from: classes.dex */
public final class of2 extends jg1 {
    public xe1 o;

    public of2(xe1 xe1Var) {
        super("internal.registerCallback");
        this.o = xe1Var;
    }

    @Override // androidx.appcompat.view.menu.jg1
    public final tg1 a(sw1 sw1Var, List list) {
        lu1.g(this.m, 3, list);
        String g = sw1Var.b((tg1) list.get(0)).g();
        tg1 b = sw1Var.b((tg1) list.get(1));
        if (b instanceof vg1) {
            tg1 b2 = sw1Var.b((tg1) list.get(2));
            if (b2 instanceof rg1) {
                rg1 rg1Var = (rg1) b2;
                if (rg1Var.k("type")) {
                    this.o.c(g, rg1Var.k("priority") ? lu1.i(rg1Var.h("priority").f().doubleValue()) : 1000, (vg1) b, rg1Var.h("type").g());
                    return tg1.e;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
