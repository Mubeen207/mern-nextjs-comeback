package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class b12 {
    public static tg1 a(nt1 nt1Var) {
        if (nt1Var == null) {
            return tg1.e;
        }
        int i = xy1.a[nt1Var.H().ordinal()];
        if (i == 1) {
            return nt1Var.P() ? new xg1(nt1Var.K()) : tg1.l;
        } else if (i == 2) {
            return nt1Var.O() ? new bg1(Double.valueOf(nt1Var.G())) : new bg1(null);
        } else if (i == 3) {
            return nt1Var.N() ? new vf1(Boolean.valueOf(nt1Var.M())) : new vf1(null);
        } else if (i != 4) {
            if (i != 5) {
                String valueOf = String.valueOf(nt1Var);
                throw new IllegalStateException("Invalid entity: " + valueOf);
            }
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        } else {
            List<nt1> L = nt1Var.L();
            ArrayList arrayList = new ArrayList();
            for (nt1 nt1Var2 : L) {
                arrayList.add(a(nt1Var2));
            }
            return new zg1(nt1Var.J(), arrayList);
        }
    }

    public static tg1 b(Object obj) {
        if (obj == null) {
            return tg1.f;
        }
        if (obj instanceof String) {
            return new xg1((String) obj);
        }
        if (obj instanceof Double) {
            return new bg1((Double) obj);
        }
        if (obj instanceof Long) {
            return new bg1(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new bg1(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new vf1((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (obj instanceof List) {
                sf1 sf1Var = new sf1();
                for (Object obj2 : (List) obj) {
                    sf1Var.u(b(obj2));
                }
                return sf1Var;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
        rg1 rg1Var = new rg1();
        Map map = (Map) obj;
        for (Object obj3 : map.keySet()) {
            tg1 b = b(map.get(obj3));
            if (obj3 != null) {
                if (!(obj3 instanceof String)) {
                    obj3 = obj3.toString();
                }
                rg1Var.n((String) obj3, b);
            }
        }
        return rg1Var;
    }
}
