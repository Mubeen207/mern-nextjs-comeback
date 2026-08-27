package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public final class fh1 extends jh1 {
    public fh1() {
        this.a.add(wj1.BITWISE_AND);
        this.a.add(wj1.BITWISE_LEFT_SHIFT);
        this.a.add(wj1.BITWISE_NOT);
        this.a.add(wj1.BITWISE_OR);
        this.a.add(wj1.BITWISE_RIGHT_SHIFT);
        this.a.add(wj1.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(wj1.BITWISE_XOR);
    }

    @Override // androidx.appcompat.view.menu.jh1
    public final tg1 b(String str, sw1 sw1Var, List list) {
        switch (lh1.a[lu1.c(str).ordinal()]) {
            case 1:
                lu1.f(wj1.BITWISE_AND, 2, list);
                return new bg1(Double.valueOf(lu1.i(sw1Var.b((tg1) list.get(0)).f().doubleValue()) & lu1.i(sw1Var.b((tg1) list.get(1)).f().doubleValue())));
            case 2:
                lu1.f(wj1.BITWISE_LEFT_SHIFT, 2, list);
                return new bg1(Double.valueOf(lu1.i(sw1Var.b((tg1) list.get(0)).f().doubleValue()) << ((int) (lu1.m(sw1Var.b((tg1) list.get(1)).f().doubleValue()) & 31))));
            case t02.c.c /* 3 */:
                lu1.f(wj1.BITWISE_NOT, 1, list);
                return new bg1(Double.valueOf(~lu1.i(sw1Var.b((tg1) list.get(0)).f().doubleValue())));
            case 4:
                lu1.f(wj1.BITWISE_OR, 2, list);
                return new bg1(Double.valueOf(lu1.i(sw1Var.b((tg1) list.get(0)).f().doubleValue()) | lu1.i(sw1Var.b((tg1) list.get(1)).f().doubleValue())));
            case t02.c.e /* 5 */:
                lu1.f(wj1.BITWISE_RIGHT_SHIFT, 2, list);
                return new bg1(Double.valueOf(lu1.i(sw1Var.b((tg1) list.get(0)).f().doubleValue()) >> ((int) (lu1.m(sw1Var.b((tg1) list.get(1)).f().doubleValue()) & 31))));
            case t02.c.f /* 6 */:
                lu1.f(wj1.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new bg1(Double.valueOf(lu1.m(sw1Var.b((tg1) list.get(0)).f().doubleValue()) >>> ((int) (lu1.m(sw1Var.b((tg1) list.get(1)).f().doubleValue()) & 31))));
            case t02.c.g /* 7 */:
                lu1.f(wj1.BITWISE_XOR, 2, list);
                return new bg1(Double.valueOf(lu1.i(sw1Var.b((tg1) list.get(0)).f().doubleValue()) ^ lu1.i(sw1Var.b((tg1) list.get(1)).f().doubleValue())));
            default:
                return super.a(str);
        }
    }
}
