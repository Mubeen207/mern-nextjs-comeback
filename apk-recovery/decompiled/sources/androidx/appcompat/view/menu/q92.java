package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.t02;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class q92 extends rg1 {
    public final ff1 n;

    public q92(ff1 ff1Var) {
        this.n = ff1Var;
    }

    @Override // androidx.appcompat.view.menu.rg1, androidx.appcompat.view.menu.tg1
    public final tg1 p(String str, sw1 sw1Var, List list) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c = 0;
                    break;
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c = 1;
                    break;
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c = 2;
                    break;
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c = 3;
                    break;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c = 4;
                    break;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                lu1.g("getEventName", 0, list);
                return new xg1(this.n.d().e());
            case 1:
                lu1.g("getTimestamp", 0, list);
                return new bg1(Double.valueOf(this.n.d().a()));
            case 2:
                lu1.g("getParamValue", 1, list);
                return b12.b(this.n.d().b(sw1Var.b((tg1) list.get(0)).g()));
            case t02.c.c /* 3 */:
                lu1.g("getParams", 0, list);
                Map g = this.n.d().g();
                rg1 rg1Var = new rg1();
                for (String str2 : g.keySet()) {
                    rg1Var.n(str2, b12.b(g.get(str2)));
                }
                return rg1Var;
            case 4:
                lu1.g("setParamValue", 2, list);
                String g2 = sw1Var.b((tg1) list.get(0)).g();
                tg1 b = sw1Var.b((tg1) list.get(1));
                this.n.d().d(g2, lu1.d(b));
                return b;
            case t02.c.e /* 5 */:
                lu1.g("setEventName", 1, list);
                tg1 b2 = sw1Var.b((tg1) list.get(0));
                if (tg1.e.equals(b2) || tg1.f.equals(b2)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                this.n.d().f(b2.g());
                return new xg1(b2.g());
            default:
                return super.p(str, sw1Var, list);
        }
    }
}
