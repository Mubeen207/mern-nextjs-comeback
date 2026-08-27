package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.t02;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class ki1 extends jh1 {
    public ki1() {
        this.a.add(wj1.APPLY);
        this.a.add(wj1.BLOCK);
        this.a.add(wj1.BREAK);
        this.a.add(wj1.CASE);
        this.a.add(wj1.DEFAULT);
        this.a.add(wj1.CONTINUE);
        this.a.add(wj1.DEFINE_FUNCTION);
        this.a.add(wj1.FN);
        this.a.add(wj1.IF);
        this.a.add(wj1.QUOTE);
        this.a.add(wj1.RETURN);
        this.a.add(wj1.SWITCH);
        this.a.add(wj1.TERNARY);
    }

    public static tg1 c(sw1 sw1Var, List list) {
        lu1.j(wj1.FN, 2, list);
        tg1 b = sw1Var.b((tg1) list.get(0));
        tg1 b2 = sw1Var.b((tg1) list.get(1));
        if (b2 instanceof sf1) {
            List B = ((sf1) b2).B();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new vg1(b.g(), B, arrayList, sw1Var);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", b2.getClass().getCanonicalName()));
    }

    @Override // androidx.appcompat.view.menu.jh1
    public final tg1 b(String str, sw1 sw1Var, List list) {
        int i = 0;
        switch (qi1.a[lu1.c(str).ordinal()]) {
            case 1:
                lu1.f(wj1.APPLY, 3, list);
                tg1 b = sw1Var.b((tg1) list.get(0));
                String g = sw1Var.b((tg1) list.get(1)).g();
                tg1 b2 = sw1Var.b((tg1) list.get(2));
                if (b2 instanceof sf1) {
                    if (g.isEmpty()) {
                        throw new IllegalArgumentException("Function name for apply is undefined");
                    }
                    return b.p(g, sw1Var, ((sf1) b2).B());
                }
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", b2.getClass().getCanonicalName()));
            case 2:
                return sw1Var.d().a(new sf1(list));
            case t02.c.c /* 3 */:
                lu1.f(wj1.BREAK, 0, list);
                return tg1.h;
            case 4:
            case t02.c.e /* 5 */:
                if (!list.isEmpty()) {
                    tg1 b3 = sw1Var.b((tg1) list.get(0));
                    if (b3 instanceof sf1) {
                        return sw1Var.a((sf1) b3);
                    }
                }
                return tg1.e;
            case t02.c.f /* 6 */:
                lu1.f(wj1.BREAK, 0, list);
                return tg1.g;
            case t02.c.g /* 7 */:
                lu1.j(wj1.DEFINE_FUNCTION, 2, list);
                vg1 vg1Var = (vg1) c(sw1Var, list);
                if (vg1Var.b() == null) {
                    sw1Var.h("", vg1Var);
                } else {
                    sw1Var.h(vg1Var.b(), vg1Var);
                }
                return vg1Var;
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                return c(sw1Var, list);
            case 9:
                lu1.j(wj1.IF, 2, list);
                tg1 b4 = sw1Var.b((tg1) list.get(0));
                tg1 b5 = sw1Var.b((tg1) list.get(1));
                tg1 b6 = list.size() > 2 ? sw1Var.b((tg1) list.get(2)) : null;
                tg1 tg1Var = tg1.e;
                tg1 a = b4.d().booleanValue() ? sw1Var.a((sf1) b5) : b6 != null ? sw1Var.a((sf1) b6) : tg1Var;
                return a instanceof fg1 ? a : tg1Var;
            case 10:
                return new sf1(list);
            case 11:
                if (list.isEmpty()) {
                    return tg1.i;
                }
                lu1.f(wj1.RETURN, 1, list);
                return new fg1("return", sw1Var.b((tg1) list.get(0)));
            case 12:
                lu1.f(wj1.SWITCH, 3, list);
                tg1 b7 = sw1Var.b((tg1) list.get(0));
                tg1 b8 = sw1Var.b((tg1) list.get(1));
                tg1 b9 = sw1Var.b((tg1) list.get(2));
                if (b8 instanceof sf1) {
                    if (b9 instanceof sf1) {
                        sf1 sf1Var = (sf1) b8;
                        sf1 sf1Var2 = (sf1) b9;
                        boolean z = false;
                        while (true) {
                            if (i < sf1Var.v()) {
                                if (z || b7.equals(sw1Var.b(sf1Var.s(i)))) {
                                    tg1 b10 = sw1Var.b(sf1Var2.s(i));
                                    if (!(b10 instanceof fg1)) {
                                        z = true;
                                    } else if (!((fg1) b10).b().equals("break")) {
                                        return b10;
                                    }
                                }
                                i++;
                            } else if (sf1Var.v() + 1 == sf1Var2.v()) {
                                tg1 b11 = sw1Var.b(sf1Var2.s(sf1Var.v()));
                                if (b11 instanceof fg1) {
                                    String b12 = ((fg1) b11).b();
                                    if (b12.equals("return") || b12.equals("continue")) {
                                        return b11;
                                    }
                                }
                            }
                        }
                        return tg1.e;
                    }
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
            case 13:
                lu1.f(wj1.TERNARY, 3, list);
                return sw1Var.b((tg1) list.get(0)).d().booleanValue() ? sw1Var.b((tg1) list.get(1)) : sw1Var.b((tg1) list.get(2));
            default:
                return super.a(str);
        }
    }
}
