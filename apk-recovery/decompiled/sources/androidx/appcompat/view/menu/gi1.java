package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public final class gi1 extends jh1 {
    public gi1() {
        this.a.add(wj1.EQUALS);
        this.a.add(wj1.GREATER_THAN);
        this.a.add(wj1.GREATER_THAN_EQUALS);
        this.a.add(wj1.IDENTITY_EQUALS);
        this.a.add(wj1.IDENTITY_NOT_EQUALS);
        this.a.add(wj1.LESS_THAN);
        this.a.add(wj1.LESS_THAN_EQUALS);
        this.a.add(wj1.NOT_EQUALS);
    }

    public static boolean c(tg1 tg1Var, tg1 tg1Var2) {
        tg1 bg1Var;
        tg1 bg1Var2;
        while (!tg1Var.getClass().equals(tg1Var2.getClass())) {
            if (((tg1Var instanceof hh1) || (tg1Var instanceof pg1)) && ((tg1Var2 instanceof hh1) || (tg1Var2 instanceof pg1))) {
                return true;
            }
            boolean z = tg1Var instanceof bg1;
            if (z && (tg1Var2 instanceof xg1)) {
                bg1Var2 = new bg1(tg1Var2.f());
            } else {
                boolean z2 = tg1Var instanceof xg1;
                if (z2 && (tg1Var2 instanceof bg1)) {
                    bg1Var = new bg1(tg1Var.f());
                } else if (tg1Var instanceof vf1) {
                    bg1Var = new bg1(tg1Var.f());
                } else if (tg1Var2 instanceof vf1) {
                    bg1Var2 = new bg1(tg1Var2.f());
                } else if ((z2 || z) && (tg1Var2 instanceof hg1)) {
                    bg1Var2 = new xg1(tg1Var2.g());
                } else if (!(tg1Var instanceof hg1) || (!(tg1Var2 instanceof xg1) && !(tg1Var2 instanceof bg1))) {
                    return false;
                } else {
                    bg1Var = new xg1(tg1Var.g());
                }
                tg1Var = bg1Var;
            }
            tg1Var2 = bg1Var2;
        }
        if ((tg1Var instanceof hh1) || (tg1Var instanceof pg1)) {
            return true;
        }
        return tg1Var instanceof bg1 ? (Double.isNaN(tg1Var.f().doubleValue()) || Double.isNaN(tg1Var2.f().doubleValue()) || tg1Var.f().doubleValue() != tg1Var2.f().doubleValue()) ? false : true : tg1Var instanceof xg1 ? tg1Var.g().equals(tg1Var2.g()) : tg1Var instanceof vf1 ? tg1Var.d().equals(tg1Var2.d()) : tg1Var == tg1Var2;
    }

    public static boolean d(tg1 tg1Var, tg1 tg1Var2) {
        if (tg1Var instanceof hg1) {
            tg1Var = new xg1(tg1Var.g());
        }
        if (tg1Var2 instanceof hg1) {
            tg1Var2 = new xg1(tg1Var2.g());
        }
        if ((tg1Var instanceof xg1) && (tg1Var2 instanceof xg1)) {
            return tg1Var.g().compareTo(tg1Var2.g()) < 0;
        }
        double doubleValue = tg1Var.f().doubleValue();
        double doubleValue2 = tg1Var2.f().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == -0.0d) || ((doubleValue == -0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    public static boolean e(tg1 tg1Var, tg1 tg1Var2) {
        if (tg1Var instanceof hg1) {
            tg1Var = new xg1(tg1Var.g());
        }
        if (tg1Var2 instanceof hg1) {
            tg1Var2 = new xg1(tg1Var2.g());
        }
        return (((tg1Var instanceof xg1) && (tg1Var2 instanceof xg1)) || !(Double.isNaN(tg1Var.f().doubleValue()) || Double.isNaN(tg1Var2.f().doubleValue()))) && !d(tg1Var2, tg1Var);
    }

    @Override // androidx.appcompat.view.menu.jh1
    public final tg1 b(String str, sw1 sw1Var, List list) {
        boolean c;
        boolean h;
        lu1.f(lu1.c(str), 2, list);
        tg1 b = sw1Var.b((tg1) list.get(0));
        tg1 b2 = sw1Var.b((tg1) list.get(1));
        switch (mi1.a[lu1.c(str).ordinal()]) {
            case 1:
                c = c(b, b2);
                break;
            case 2:
                c = d(b2, b);
                break;
            case t02.c.c /* 3 */:
                c = e(b2, b);
                break;
            case 4:
                c = lu1.h(b, b2);
                break;
            case t02.c.e /* 5 */:
                h = lu1.h(b, b2);
                c = !h;
                break;
            case t02.c.f /* 6 */:
                c = d(b, b2);
                break;
            case t02.c.g /* 7 */:
                c = e(b, b2);
                break;
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                h = c(b, b2);
                c = !h;
                break;
            default:
                return super.a(str);
        }
        return c ? tg1.j : tg1.k;
    }
}
