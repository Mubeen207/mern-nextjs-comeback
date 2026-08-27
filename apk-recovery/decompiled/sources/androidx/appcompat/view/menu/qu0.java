package androidx.appcompat.view.menu;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* loaded from: classes.dex */
public class qu0 {
    public static Object[] p;
    public static int q;
    public static Object[] r;
    public static int s;
    public int[] m;
    public Object[] n;
    public int o;

    public qu0() {
        this.m = rf.a;
        this.n = rf.c;
        this.o = 0;
    }

    public static int b(int[] iArr, int i, int i2) {
        try {
            return rf.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (qu0.class) {
                try {
                    if (s < 10) {
                        objArr[0] = r;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        r = objArr;
                        s++;
                    }
                } finally {
                }
            }
        } else if (iArr.length == 4) {
            synchronized (qu0.class) {
                try {
                    if (q < 10) {
                        objArr[0] = p;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        p = objArr;
                        q++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (qu0.class) {
                try {
                    Object[] objArr = r;
                    if (objArr != null) {
                        this.n = objArr;
                        r = (Object[]) objArr[0];
                        this.m = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        s--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (qu0.class) {
                try {
                    Object[] objArr2 = p;
                    if (objArr2 != null) {
                        this.n = objArr2;
                        p = (Object[]) objArr2[0];
                        this.m = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        q--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.m = new int[i];
        this.n = new Object[i << 1];
    }

    public void c(int i) {
        int i2 = this.o;
        int[] iArr = this.m;
        if (iArr.length < i) {
            Object[] objArr = this.n;
            a(i);
            if (this.o > 0) {
                System.arraycopy(iArr, 0, this.m, 0, i2);
                System.arraycopy(objArr, 0, this.n, 0, i2 << 1);
            }
            d(iArr, objArr, i2);
        }
        if (this.o != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.o;
        if (i > 0) {
            int[] iArr = this.m;
            Object[] objArr = this.n;
            this.m = rf.a;
            this.n = rf.c;
            this.o = 0;
            d(iArr, objArr, i);
        }
        if (this.o > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public int e(Object obj, int i) {
        int i2 = this.o;
        if (i2 == 0) {
            return -1;
        }
        int b = b(this.m, i2, i);
        if (b >= 0 && !obj.equals(this.n[b << 1])) {
            int i3 = b + 1;
            while (i3 < i2 && this.m[i3] == i) {
                if (obj.equals(this.n[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = b - 1; i4 >= 0 && this.m[i4] == i; i4--) {
                if (obj.equals(this.n[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qu0) {
            qu0 qu0Var = (qu0) obj;
            if (size() != qu0Var.size()) {
                return false;
            }
            for (int i = 0; i < this.o; i++) {
                try {
                    Object i2 = i(i);
                    Object m = m(i);
                    Object obj2 = qu0Var.get(i2);
                    if (m == null) {
                        if (obj2 != null || !qu0Var.containsKey(i2)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.o; i3++) {
                try {
                    Object i4 = i(i3);
                    Object m2 = m(i3);
                    Object obj3 = map.get(i4);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    public int g() {
        int i = this.o;
        if (i == 0) {
            return -1;
        }
        int b = b(this.m, i, 0);
        if (b >= 0 && this.n[b << 1] != null) {
            int i2 = b + 1;
            while (i2 < i && this.m[i2] == 0) {
                if (this.n[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = b - 1; i3 >= 0 && this.m[i3] == 0; i3--) {
                if (this.n[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return b;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int f = f(obj);
        return f >= 0 ? this.n[(f << 1) + 1] : obj2;
    }

    public int h(Object obj) {
        int i = this.o * 2;
        Object[] objArr = this.n;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.m;
        Object[] objArr = this.n;
        int i = this.o;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public Object i(int i) {
        return this.n[i << 1];
    }

    public boolean isEmpty() {
        return this.o <= 0;
    }

    public void j(qu0 qu0Var) {
        int i = qu0Var.o;
        c(this.o + i);
        if (this.o != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(qu0Var.i(i2), qu0Var.m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(qu0Var.m, 0, this.m, 0, i);
            System.arraycopy(qu0Var.n, 0, this.n, 0, i << 1);
            this.o = i;
        }
    }

    public Object k(int i) {
        Object[] objArr = this.n;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.o;
        int i4 = 0;
        if (i3 <= 1) {
            d(this.m, objArr, i3);
            this.m = rf.a;
            this.n = rf.c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.m;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.n;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.n;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.o) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.m, 0, i);
                    System.arraycopy(objArr, 0, this.n, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.m, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.n, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 == this.o) {
            this.o = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public Object l(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.n;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public Object m(int i) {
        return this.n[(i << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int e;
        int i2 = this.o;
        if (obj == null) {
            e = g();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            e = e(obj, hashCode);
        }
        if (e >= 0) {
            int i3 = (e << 1) + 1;
            Object[] objArr = this.n;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~e;
        int[] iArr = this.m;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.n;
            a(i5);
            if (i2 != this.o) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.m;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.n, 0, objArr2.length);
            }
            d(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.m;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.n;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.o - i4) << 1);
        }
        int i7 = this.o;
        if (i2 == i7) {
            int[] iArr4 = this.m;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.n;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.o = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int f = f(obj);
        if (f >= 0) {
            return k(f);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int f = f(obj);
        if (f >= 0) {
            return l(f, obj2);
        }
        return null;
    }

    public int size() {
        return this.o;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.o * 28);
        sb.append('{');
        for (int i = 0; i < this.o; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object i2 = i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m = m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f = f(obj);
        if (f >= 0) {
            Object m = m(f);
            if (obj2 == m || (obj2 != null && obj2.equals(m))) {
                k(f);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int f = f(obj);
        if (f >= 0) {
            Object m = m(f);
            if (m == obj2 || (obj2 != null && obj2.equals(m))) {
                l(f, obj3);
                return true;
            }
            return false;
        }
        return false;
    }

    public qu0(int i) {
        if (i == 0) {
            this.m = rf.a;
            this.n = rf.c;
        } else {
            a(i);
        }
        this.o = 0;
    }

    public qu0(qu0 qu0Var) {
        this();
        if (qu0Var != null) {
            j(qu0Var);
        }
    }
}
