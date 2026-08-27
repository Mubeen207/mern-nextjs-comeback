package androidx.appcompat.view.menu;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class q4 implements Collection, Set {
    public static final int[] q = new int[0];
    public static final Object[] r = new Object[0];
    public static Object[] s;
    public static int t;
    public static Object[] u;
    public static int v;
    public int[] m;
    public Object[] n;
    public int o;
    public za0 p;

    /* loaded from: classes.dex */
    public class a extends za0 {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.za0
        public void a() {
            q4.this.clear();
        }

        @Override // androidx.appcompat.view.menu.za0
        public Object b(int i, int i2) {
            return q4.this.n[i];
        }

        @Override // androidx.appcompat.view.menu.za0
        public Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.appcompat.view.menu.za0
        public int d() {
            return q4.this.o;
        }

        @Override // androidx.appcompat.view.menu.za0
        public int e(Object obj) {
            return q4.this.indexOf(obj);
        }

        @Override // androidx.appcompat.view.menu.za0
        public int f(Object obj) {
            return q4.this.indexOf(obj);
        }

        @Override // androidx.appcompat.view.menu.za0
        public void g(Object obj, Object obj2) {
            q4.this.add(obj);
        }

        @Override // androidx.appcompat.view.menu.za0
        public void h(int i) {
            q4.this.n(i);
        }

        @Override // androidx.appcompat.view.menu.za0
        public Object i(int i, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public q4() {
        this(0);
    }

    public static void g(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (q4.class) {
                try {
                    if (v < 10) {
                        objArr[0] = u;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        u = objArr;
                        v++;
                    }
                } finally {
                }
            }
        } else if (iArr.length == 4) {
            synchronized (q4.class) {
                try {
                    if (t < 10) {
                        objArr[0] = s;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        s = objArr;
                        t++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i;
        int i2;
        if (obj == null) {
            i2 = k();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            i2 = i(obj, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.o;
        int[] iArr = this.m;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.n;
            d(i5);
            int[] iArr2 = this.m;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.n, 0, objArr.length);
            }
            g(iArr, objArr, this.o);
        }
        int i6 = this.o;
        if (i3 < i6) {
            int[] iArr3 = this.m;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.n;
            System.arraycopy(objArr2, i3, objArr2, i7, this.o - i3);
        }
        this.m[i3] = i;
        this.n[i3] = obj;
        this.o++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        f(this.o + collection.size());
        boolean z = false;
        for (Object obj : collection) {
            z |= add(obj);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.o;
        if (i != 0) {
            g(this.m, this.n, i);
            this.m = q;
            this.n = r;
            this.o = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i) {
        if (i == 8) {
            synchronized (q4.class) {
                try {
                    Object[] objArr = u;
                    if (objArr != null) {
                        this.n = objArr;
                        u = (Object[]) objArr[0];
                        this.m = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        v--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (q4.class) {
                try {
                    Object[] objArr2 = s;
                    if (objArr2 != null) {
                        this.n = objArr2;
                        s = (Object[]) objArr2[0];
                        this.m = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        t--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.m = new int[i];
        this.n = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i = 0; i < this.o; i++) {
                try {
                    if (!set.contains(p(i))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public void f(int i) {
        int[] iArr = this.m;
        if (iArr.length < i) {
            Object[] objArr = this.n;
            d(i);
            int i2 = this.o;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.m, 0, i2);
                System.arraycopy(objArr, 0, this.n, 0, this.o);
            }
            g(iArr, objArr, this.o);
        }
    }

    public final za0 h() {
        if (this.p == null) {
            this.p = new a();
        }
        return this.p;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.m;
        int i = this.o;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final int i(Object obj, int i) {
        int i2 = this.o;
        if (i2 == 0) {
            return -1;
        }
        int a2 = rf.a(this.m, i2, i);
        if (a2 >= 0 && !obj.equals(this.n[a2])) {
            int i3 = a2 + 1;
            while (i3 < i2 && this.m[i3] == i) {
                if (obj.equals(this.n[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.m[i4] == i; i4--) {
                if (obj.equals(this.n[i4])) {
                    return i4;
                }
            }
            return ~i3;
        }
        return a2;
    }

    public int indexOf(Object obj) {
        return obj == null ? k() : i(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.o <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return h().m().iterator();
    }

    public final int k() {
        int i = this.o;
        if (i == 0) {
            return -1;
        }
        int a2 = rf.a(this.m, i, 0);
        if (a2 >= 0 && this.n[a2] != null) {
            int i2 = a2 + 1;
            while (i2 < i && this.m[i2] == 0) {
                if (this.n[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = a2 - 1; i3 >= 0 && this.m[i3] == 0; i3--) {
                if (this.n[i3] == null) {
                    return i3;
                }
            }
            return ~i2;
        }
        return a2;
    }

    public Object n(int i) {
        Object[] objArr = this.n;
        Object obj = objArr[i];
        int i2 = this.o;
        if (i2 <= 1) {
            g(this.m, objArr, i2);
            this.m = q;
            this.n = r;
            this.o = 0;
        } else {
            int[] iArr = this.m;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = i2 - 1;
                this.o = i3;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, iArr, i, i3 - i);
                    Object[] objArr2 = this.n;
                    System.arraycopy(objArr2, i4, objArr2, i, this.o - i);
                }
                this.n[this.o] = null;
            } else {
                d(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.o--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.m, 0, i);
                    System.arraycopy(objArr, 0, this.n, 0, i);
                }
                int i5 = this.o;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, this.m, i, i5 - i);
                    System.arraycopy(objArr, i6, this.n, i, this.o - i);
                }
            }
        }
        return obj;
    }

    public Object p(int i) {
        return this.n[i];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            n(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            z |= remove(obj);
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.o - 1; i >= 0; i--) {
            if (!collection.contains(this.n[i])) {
                n(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.o;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.o;
        Object[] objArr = new Object[i];
        System.arraycopy(this.n, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.o * 14);
        sb.append('{');
        for (int i = 0; i < this.o; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object p = p(i);
            if (p != this) {
                sb.append(p);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public q4(int i) {
        if (i == 0) {
            this.m = q;
            this.n = r;
        } else {
            d(i);
        }
        this.o = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.o) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.o);
        }
        System.arraycopy(this.n, 0, objArr, 0, this.o);
        int length = objArr.length;
        int i = this.o;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
