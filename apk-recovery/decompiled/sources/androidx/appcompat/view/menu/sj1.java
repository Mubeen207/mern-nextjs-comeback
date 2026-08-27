package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.t02;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class sj1 extends jh1 {
    public sj1() {
        this.a.add(wj1.ASSIGN);
        this.a.add(wj1.CONST);
        this.a.add(wj1.CREATE_ARRAY);
        this.a.add(wj1.CREATE_OBJECT);
        this.a.add(wj1.EXPRESSION_LIST);
        this.a.add(wj1.GET);
        this.a.add(wj1.GET_INDEX);
        this.a.add(wj1.GET_PROPERTY);
        this.a.add(wj1.NULL);
        this.a.add(wj1.SET_PROPERTY);
        this.a.add(wj1.TYPEOF);
        this.a.add(wj1.UNDEFINED);
        this.a.add(wj1.VAR);
    }

    @Override // androidx.appcompat.view.menu.jh1
    public final tg1 b(String str, sw1 sw1Var, List list) {
        String str2;
        int i = 0;
        switch (qj1.a[lu1.c(str).ordinal()]) {
            case 1:
                lu1.f(wj1.ASSIGN, 2, list);
                tg1 b = sw1Var.b((tg1) list.get(0));
                if (b instanceof xg1) {
                    if (sw1Var.g(b.g())) {
                        tg1 b2 = sw1Var.b((tg1) list.get(1));
                        sw1Var.h(b.g(), b2);
                        return b2;
                    }
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", b.g()));
                }
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", b.getClass().getCanonicalName()));
            case 2:
                lu1.j(wj1.CONST, 2, list);
                if (list.size() % 2 == 0) {
                    while (i < list.size() - 1) {
                        tg1 b3 = sw1Var.b((tg1) list.get(i));
                        if (!(b3 instanceof xg1)) {
                            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", b3.getClass().getCanonicalName()));
                        }
                        sw1Var.f(b3.g(), sw1Var.b((tg1) list.get(i + 1)));
                        i += 2;
                    }
                    return tg1.e;
                }
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            case t02.c.c /* 3 */:
                if (list.isEmpty()) {
                    return new sf1();
                }
                sf1 sf1Var = new sf1();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    tg1 b4 = sw1Var.b((tg1) it.next());
                    if (b4 instanceof fg1) {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                    sf1Var.y(i, b4);
                    i++;
                }
                return sf1Var;
            case 4:
                if (list.isEmpty()) {
                    return new rg1();
                }
                if (list.size() % 2 == 0) {
                    rg1 rg1Var = new rg1();
                    while (i < list.size() - 1) {
                        tg1 b5 = sw1Var.b((tg1) list.get(i));
                        tg1 b6 = sw1Var.b((tg1) list.get(i + 1));
                        if ((b5 instanceof fg1) || (b6 instanceof fg1)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        rg1Var.n(b5.g(), b6);
                        i += 2;
                    }
                    return rg1Var;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            case t02.c.e /* 5 */:
                lu1.j(wj1.EXPRESSION_LIST, 1, list);
                tg1 tg1Var = tg1.e;
                while (i < list.size()) {
                    tg1Var = sw1Var.b((tg1) list.get(i));
                    if (tg1Var instanceof fg1) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i++;
                }
                return tg1Var;
            case t02.c.f /* 6 */:
                lu1.f(wj1.GET, 1, list);
                tg1 b7 = sw1Var.b((tg1) list.get(0));
                if (b7 instanceof xg1) {
                    return sw1Var.c(b7.g());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", b7.getClass().getCanonicalName()));
            case t02.c.g /* 7 */:
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                lu1.f(wj1.GET_PROPERTY, 2, list);
                tg1 b8 = sw1Var.b((tg1) list.get(0));
                tg1 b9 = sw1Var.b((tg1) list.get(1));
                if ((b8 instanceof sf1) && lu1.l(b9)) {
                    return ((sf1) b8).s(b9.f().intValue());
                }
                if (b8 instanceof hg1) {
                    return ((hg1) b8).h(b9.g());
                }
                if (b8 instanceof xg1) {
                    if ("length".equals(b9.g())) {
                        return new bg1(Double.valueOf(b8.g().length()));
                    }
                    if (lu1.l(b9) && b9.f().doubleValue() < b8.g().length()) {
                        return new xg1(String.valueOf(b8.g().charAt(b9.f().intValue())));
                    }
                }
                return tg1.e;
            case 9:
                lu1.f(wj1.NULL, 0, list);
                return tg1.f;
            case 10:
                lu1.f(wj1.SET_PROPERTY, 3, list);
                tg1 b10 = sw1Var.b((tg1) list.get(0));
                tg1 b11 = sw1Var.b((tg1) list.get(1));
                tg1 b12 = sw1Var.b((tg1) list.get(2));
                if (b10 == tg1.e || b10 == tg1.f) {
                    throw new IllegalStateException(String.format("Can't set property %s of %s", b11.g(), b10.g()));
                }
                if ((b10 instanceof sf1) && (b11 instanceof bg1)) {
                    ((sf1) b10).y(b11.f().intValue(), b12);
                } else if (b10 instanceof hg1) {
                    ((hg1) b10).n(b11.g(), b12);
                }
                return b12;
            case 11:
                lu1.f(wj1.TYPEOF, 1, list);
                tg1 b13 = sw1Var.b((tg1) list.get(0));
                if (b13 instanceof hh1) {
                    str2 = "undefined";
                } else if (b13 instanceof vf1) {
                    str2 = "boolean";
                } else if (b13 instanceof bg1) {
                    str2 = "number";
                } else if (b13 instanceof xg1) {
                    str2 = "string";
                } else if (b13 instanceof vg1) {
                    str2 = "function";
                } else if ((b13 instanceof zg1) || (b13 instanceof fg1)) {
                    throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", b13));
                } else {
                    str2 = "object";
                }
                return new xg1(str2);
            case 12:
                lu1.f(wj1.UNDEFINED, 0, list);
                return tg1.e;
            case 13:
                lu1.j(wj1.VAR, 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    tg1 b14 = sw1Var.b((tg1) it2.next());
                    if (!(b14 instanceof xg1)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", b14.getClass().getCanonicalName()));
                    }
                    sw1Var.e(b14.g(), tg1.e);
                }
                return tg1.e;
            default:
                return super.a(str);
        }
    }
}
