package androidx.appcompat.view.menu;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public abstract class p52 {
    public static final Class a = E();
    public static final o72 b = A();
    public static final o72 c = new s72();

    public static o72 A() {
        try {
            Class I = I();
            if (I == null) {
                return null;
            }
            return (o72) I.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void B(int i, List list, g92 g92Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.v(i, list, z);
    }

    public static int C(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * mz1.P(i, 0L);
    }

    public static int D(List list) {
        return list.size() << 3;
    }

    public static Class E() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void F(int i, List list, g92 g92Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.n(i, list, z);
    }

    public static int G(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return H(list) + (size * mz1.s0(i));
    }

    public static int H(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g12) {
            g12 g12Var = (g12) list;
            i = 0;
            while (i2 < size) {
                i += mz1.g0(g12Var.f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += mz1.g0(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static Class I() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void J(int i, List list, g92 g92Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.c(i, list, z);
    }

    public static int K(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return L(list) + (list.size() * mz1.s0(i));
    }

    public static int L(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x22) {
            x22 x22Var = (x22) list;
            i = 0;
            while (i2 < size) {
                i += mz1.a0(x22Var.j(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += mz1.a0(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void M(int i, List list, g92 g92Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.E(i, list, z);
    }

    public static int N(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return O(list) + (size * mz1.s0(i));
    }

    public static int O(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g12) {
            g12 g12Var = (g12) list;
            i = 0;
            while (i2 < size) {
                i += mz1.o0(g12Var.f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += mz1.o0(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void P(int i, List list, g92 g92Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.w(i, list, z);
    }

    public static int Q(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return R(list) + (size * mz1.s0(i));
    }

    public static int R(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x22) {
            x22 x22Var = (x22) list;
            i = 0;
            while (i2 < size) {
                i += mz1.j0(x22Var.j(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += mz1.j0(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void S(int i, List list, g92 g92Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.o(i, list, z);
    }

    public static int T(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return U(list) + (size * mz1.s0(i));
    }

    public static int U(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g12) {
            g12 g12Var = (g12) list;
            i = 0;
            while (i2 < size) {
                i += mz1.v0(g12Var.f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += mz1.v0(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void V(int i, List list, g92 g92Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.f(i, list, z);
    }

    public static int W(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return X(list) + (size * mz1.s0(i));
    }

    public static int X(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof x22) {
            x22 x22Var = (x22) list;
            i = 0;
            while (i2 < size) {
                i += mz1.n0(x22Var.j(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += mz1.n0(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void Y(int i, List list, g92 g92Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.G(i, list, z);
    }

    public static void Z(int i, List list, g92 g92Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.I(i, list, z);
    }

    public static int a(int i, Object obj, m52 m52Var) {
        return mz1.R(i, (z32) obj, m52Var);
    }

    public static void a0(int i, List list, g92 g92Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.A(i, list, z);
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s0 = size * mz1.s0(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            s0 += mz1.A((tx1) list.get(i2));
        }
        return s0;
    }

    public static void b0(int i, List list, g92 g92Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.q(i, list, z);
    }

    public static int c(int i, List list, m52 m52Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += mz1.x(i, (z32) list.get(i3), m52Var);
        }
        return i2;
    }

    public static void c0(int i, List list, g92 g92Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.h(i, list, z);
    }

    public static int d(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * mz1.z(i, true);
    }

    public static int e(List list) {
        return list.size();
    }

    public static o72 f() {
        return b;
    }

    public static Object g(Object obj, int i, int i2, Object obj2, o72 o72Var) {
        if (obj2 == null) {
            obj2 = o72Var.i(obj);
        }
        o72Var.f(obj2, i, i2);
        return obj2;
    }

    public static Object h(Object obj, int i, List list, o12 o12Var, Object obj2, o72 o72Var) {
        if (o12Var == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (o12Var.e(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj2 = g(obj, i, intValue, obj2, o72Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!o12Var.e(intValue2)) {
                    obj2 = g(obj, i, intValue2, obj2, o72Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static void i(int i, List list, g92 g92Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.K(i, list);
    }

    public static void j(int i, List list, g92 g92Var, m52 m52Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.b(i, list, m52Var);
    }

    public static void k(int i, List list, g92 g92Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.l(i, list, z);
    }

    public static void l(yz1 yz1Var, Object obj, Object obj2) {
        h02 b2 = yz1Var.b(obj2);
        if (b2.a.isEmpty()) {
            return;
        }
        yz1Var.e(obj).f(b2);
    }

    public static void m(t32 t32Var, Object obj, Object obj2, long j) {
        z72.j(obj, j, t32Var.d(z72.B(obj, j), z72.B(obj2, j)));
    }

    public static void n(o72 o72Var, Object obj, Object obj2) {
        o72Var.j(obj, o72Var.b(o72Var.k(obj), o72Var.k(obj2)));
    }

    public static void o(Class cls) {
        Class cls2;
        if (!t02.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int s0 = mz1.s0(i) * size;
        if (list instanceof f22) {
            f22 f22Var = (f22) list;
            while (i2 < size) {
                Object j = f22Var.j(i2);
                s0 += j instanceof tx1 ? mz1.A((tx1) j) : mz1.C((String) j);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                s0 += obj instanceof tx1 ? mz1.A((tx1) obj) : mz1.C((String) obj);
                i2++;
            }
        }
        return s0;
    }

    public static int r(int i, List list, m52 m52Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int s0 = mz1.s0(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            s0 += mz1.g((z32) list.get(i2), m52Var);
        }
        return s0;
    }

    public static int s(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * mz1.s0(i));
    }

    public static int t(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof g12) {
            g12 g12Var = (g12) list;
            i = 0;
            while (i2 < size) {
                i += mz1.X(g12Var.f(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += mz1.X(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static o72 u() {
        return c;
    }

    public static void v(int i, List list, g92 g92Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.y(i, list);
    }

    public static void w(int i, List list, g92 g92Var, m52 m52Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.C(i, list, m52Var);
    }

    public static void x(int i, List list, g92 g92Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g92Var.D(i, list, z);
    }

    public static int y(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * mz1.h0(i, 0);
    }

    public static int z(List list) {
        return list.size() << 2;
    }
}
