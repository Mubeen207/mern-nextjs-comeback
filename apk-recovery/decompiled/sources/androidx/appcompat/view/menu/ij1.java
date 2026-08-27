package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public final class ij1 extends jh1 {
    public ij1() {
        this.a.add(wj1.ADD);
        this.a.add(wj1.DIVIDE);
        this.a.add(wj1.MODULUS);
        this.a.add(wj1.MULTIPLY);
        this.a.add(wj1.NEGATE);
        this.a.add(wj1.POST_DECREMENT);
        this.a.add(wj1.POST_INCREMENT);
        this.a.add(wj1.PRE_DECREMENT);
        this.a.add(wj1.PRE_INCREMENT);
        this.a.add(wj1.SUBTRACT);
    }

    @Override // androidx.appcompat.view.menu.jh1
    public final tg1 b(String str, sw1 sw1Var, List list) {
        switch (oj1.a[lu1.c(str).ordinal()]) {
            case 1:
                lu1.f(wj1.ADD, 2, list);
                tg1 b = sw1Var.b((tg1) list.get(0));
                tg1 b2 = sw1Var.b((tg1) list.get(1));
                if ((b instanceof hg1) || (b instanceof xg1) || (b2 instanceof hg1) || (b2 instanceof xg1)) {
                    String g = b.g();
                    String g2 = b2.g();
                    return new xg1(g + g2);
                }
                return new bg1(Double.valueOf(b.f().doubleValue() + b2.f().doubleValue()));
            case 2:
                lu1.f(wj1.DIVIDE, 2, list);
                return new bg1(Double.valueOf(sw1Var.b((tg1) list.get(0)).f().doubleValue() / sw1Var.b((tg1) list.get(1)).f().doubleValue()));
            case t02.c.c /* 3 */:
                lu1.f(wj1.MODULUS, 2, list);
                return new bg1(Double.valueOf(sw1Var.b((tg1) list.get(0)).f().doubleValue() % sw1Var.b((tg1) list.get(1)).f().doubleValue()));
            case 4:
                lu1.f(wj1.MULTIPLY, 2, list);
                return new bg1(Double.valueOf(sw1Var.b((tg1) list.get(0)).f().doubleValue() * sw1Var.b((tg1) list.get(1)).f().doubleValue()));
            case t02.c.e /* 5 */:
                lu1.f(wj1.NEGATE, 1, list);
                return new bg1(Double.valueOf(sw1Var.b((tg1) list.get(0)).f().doubleValue() * (-1.0d)));
            case t02.c.f /* 6 */:
            case t02.c.g /* 7 */:
                lu1.g(str, 2, list);
                tg1 b3 = sw1Var.b((tg1) list.get(0));
                sw1Var.b((tg1) list.get(1));
                return b3;
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
            case 9:
                lu1.g(str, 1, list);
                return sw1Var.b((tg1) list.get(0));
            case 10:
                lu1.f(wj1.SUBTRACT, 2, list);
                return new bg1(Double.valueOf(sw1Var.b((tg1) list.get(0)).f().doubleValue() + new bg1(Double.valueOf(sw1Var.b((tg1) list.get(1)).f().doubleValue() * (-1.0d))).f().doubleValue()));
            default:
                return super.a(str);
        }
    }
}
