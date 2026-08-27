package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.t02;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class wi1 extends jh1 {
    public wi1() {
        this.a.add(wj1.FOR_IN);
        this.a.add(wj1.FOR_IN_CONST);
        this.a.add(wj1.FOR_IN_LET);
        this.a.add(wj1.FOR_LET);
        this.a.add(wj1.FOR_OF);
        this.a.add(wj1.FOR_OF_CONST);
        this.a.add(wj1.FOR_OF_LET);
        this.a.add(wj1.WHILE);
    }

    public static tg1 c(ej1 ej1Var, tg1 tg1Var, tg1 tg1Var2) {
        return d(ej1Var, tg1Var.i(), tg1Var2);
    }

    public static tg1 d(ej1 ej1Var, Iterator it, tg1 tg1Var) {
        if (it != null) {
            while (it.hasNext()) {
                tg1 a = ej1Var.a((tg1) it.next()).a((sf1) tg1Var);
                if (a instanceof fg1) {
                    fg1 fg1Var = (fg1) a;
                    if ("break".equals(fg1Var.b())) {
                        return tg1.e;
                    }
                    if ("return".equals(fg1Var.b())) {
                        return fg1Var;
                    }
                }
            }
        }
        return tg1.e;
    }

    public static tg1 e(ej1 ej1Var, tg1 tg1Var, tg1 tg1Var2) {
        if (tg1Var instanceof Iterable) {
            return d(ej1Var, ((Iterable) tg1Var).iterator(), tg1Var2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // androidx.appcompat.view.menu.jh1
    public final tg1 b(String str, sw1 sw1Var, List list) {
        switch (cj1.a[lu1.c(str).ordinal()]) {
            case 1:
                lu1.f(wj1.FOR_IN, 3, list);
                if (list.get(0) instanceof xg1) {
                    return c(new kj1(sw1Var, ((tg1) list.get(0)).g()), sw1Var.b((tg1) list.get(1)), sw1Var.b((tg1) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            case 2:
                lu1.f(wj1.FOR_IN_CONST, 3, list);
                if (list.get(0) instanceof xg1) {
                    return c(new aj1(sw1Var, ((tg1) list.get(0)).g()), sw1Var.b((tg1) list.get(1)), sw1Var.b((tg1) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            case t02.c.c /* 3 */:
                lu1.f(wj1.FOR_IN_LET, 3, list);
                if (list.get(0) instanceof xg1) {
                    return c(new gj1(sw1Var, ((tg1) list.get(0)).g()), sw1Var.b((tg1) list.get(1)), sw1Var.b((tg1) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            case 4:
                lu1.f(wj1.FOR_LET, 4, list);
                tg1 b = sw1Var.b((tg1) list.get(0));
                if (b instanceof sf1) {
                    sf1 sf1Var = (sf1) b;
                    tg1 tg1Var = (tg1) list.get(1);
                    tg1 tg1Var2 = (tg1) list.get(2);
                    tg1 b2 = sw1Var.b((tg1) list.get(3));
                    sw1 d = sw1Var.d();
                    for (int i = 0; i < sf1Var.v(); i++) {
                        String g = sf1Var.s(i).g();
                        d.h(g, sw1Var.c(g));
                    }
                    while (sw1Var.b(tg1Var).d().booleanValue()) {
                        tg1 a = sw1Var.a((sf1) b2);
                        if (a instanceof fg1) {
                            fg1 fg1Var = (fg1) a;
                            if ("break".equals(fg1Var.b())) {
                                return tg1.e;
                            }
                            if ("return".equals(fg1Var.b())) {
                                return fg1Var;
                            }
                        }
                        sw1 d2 = sw1Var.d();
                        for (int i2 = 0; i2 < sf1Var.v(); i2++) {
                            String g2 = sf1Var.s(i2).g();
                            d2.h(g2, d.c(g2));
                        }
                        d2.b(tg1Var2);
                        d = d2;
                    }
                    return tg1.e;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            case t02.c.e /* 5 */:
                lu1.f(wj1.FOR_OF, 3, list);
                if (list.get(0) instanceof xg1) {
                    return e(new kj1(sw1Var, ((tg1) list.get(0)).g()), sw1Var.b((tg1) list.get(1)), sw1Var.b((tg1) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            case t02.c.f /* 6 */:
                lu1.f(wj1.FOR_OF_CONST, 3, list);
                if (list.get(0) instanceof xg1) {
                    return e(new aj1(sw1Var, ((tg1) list.get(0)).g()), sw1Var.b((tg1) list.get(1)), sw1Var.b((tg1) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            case t02.c.g /* 7 */:
                lu1.f(wj1.FOR_OF_LET, 3, list);
                if (list.get(0) instanceof xg1) {
                    return e(new gj1(sw1Var, ((tg1) list.get(0)).g()), sw1Var.b((tg1) list.get(1)), sw1Var.b((tg1) list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                lu1.f(wj1.WHILE, 4, list);
                tg1 tg1Var3 = (tg1) list.get(0);
                tg1 tg1Var4 = (tg1) list.get(1);
                tg1 b3 = sw1Var.b((tg1) list.get(3));
                if (sw1Var.b((tg1) list.get(2)).d().booleanValue()) {
                    tg1 a2 = sw1Var.a((sf1) b3);
                    if (a2 instanceof fg1) {
                        fg1 fg1Var2 = (fg1) a2;
                        if (!"break".equals(fg1Var2.b())) {
                            if ("return".equals(fg1Var2.b())) {
                                return fg1Var2;
                            }
                        }
                        return tg1.e;
                    }
                }
                while (sw1Var.b(tg1Var3).d().booleanValue()) {
                    tg1 a3 = sw1Var.a((sf1) b3);
                    if (a3 instanceof fg1) {
                        fg1 fg1Var3 = (fg1) a3;
                        if ("break".equals(fg1Var3.b())) {
                            return tg1.e;
                        }
                        if ("return".equals(fg1Var3.b())) {
                            return fg1Var3;
                        }
                    }
                    sw1Var.b(tg1Var4);
                }
                return tg1.e;
            default:
                return super.a(str);
        }
    }
}
