package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class lu1 {
    public static double a(double d) {
        int i;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == -0.0d) {
            return d;
        }
        return (i > 0 ? 1 : -1) * Math.floor(Math.abs(d));
    }

    public static int b(sw1 sw1Var) {
        int i = i(sw1Var.c("runtime.counter").f().doubleValue() + 1.0d);
        if (i <= 1000000) {
            sw1Var.h("runtime.counter", new bg1(Double.valueOf(i)));
            return i;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static wj1 c(String str) {
        wj1 c = (str == null || str.isEmpty()) ? null : wj1.c(Integer.parseInt(str));
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object d(tg1 tg1Var) {
        if (tg1.f.equals(tg1Var)) {
            return null;
        }
        if (tg1.e.equals(tg1Var)) {
            return "";
        }
        if (tg1Var instanceof rg1) {
            return e((rg1) tg1Var);
        }
        if (!(tg1Var instanceof sf1)) {
            return !tg1Var.f().isNaN() ? tg1Var.f() : tg1Var.g();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((sf1) tg1Var).iterator();
        while (it.hasNext()) {
            Object d = d((tg1) it.next());
            if (d != null) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    public static Map e(rg1 rg1Var) {
        HashMap hashMap = new HashMap();
        for (String str : rg1Var.a()) {
            Object d = d(rg1Var.h(str));
            if (d != null) {
                hashMap.put(str, d);
            }
        }
        return hashMap;
    }

    public static void f(wj1 wj1Var, int i, List list) {
        g(wj1Var.name(), i, list);
    }

    public static void g(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static boolean h(tg1 tg1Var, tg1 tg1Var2) {
        if (tg1Var.getClass().equals(tg1Var2.getClass())) {
            if ((tg1Var instanceof hh1) || (tg1Var instanceof pg1)) {
                return true;
            }
            if (!(tg1Var instanceof bg1)) {
                return tg1Var instanceof xg1 ? tg1Var.g().equals(tg1Var2.g()) : tg1Var instanceof vf1 ? tg1Var.d().equals(tg1Var2.d()) : tg1Var == tg1Var2;
            } else if (Double.isNaN(tg1Var.f().doubleValue()) || Double.isNaN(tg1Var2.f().doubleValue())) {
                return false;
            } else {
                return tg1Var.f().equals(tg1Var2.f());
            }
        }
        return false;
    }

    public static int i(double d) {
        int i;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) (((i > 0 ? 1 : -1) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static void j(wj1 wj1Var, int i, List list) {
        k(wj1Var.name(), i, list);
    }

    public static void k(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static boolean l(tg1 tg1Var) {
        if (tg1Var == null) {
            return false;
        }
        Double f = tg1Var.f();
        return !f.isNaN() && f.doubleValue() >= 0.0d && f.equals(Double.valueOf(Math.floor(f.doubleValue())));
    }

    public static long m(double d) {
        return i(d) & 4294967295L;
    }

    public static void n(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }
}
