package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.p40;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class r40 implements Map, Serializable {
    public static final Map.Entry[] p = new Map.Entry[0];
    public transient t40 m;
    public transient t40 n;
    public transient p40 o;

    /* loaded from: classes.dex */
    public static class a {
        public Comparator a;
        public Object[] b;
        public int c = 0;
        public boolean d = false;
        public C0027a e;

        /* renamed from: androidx.appcompat.view.menu.r40$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0027a {
            public final Object a;
            public final Object b;
            public final Object c;

            public C0027a(Object obj, Object obj2, Object obj3) {
                this.a = obj;
                this.b = obj2;
                this.c = obj3;
            }

            public IllegalArgumentException a() {
                String valueOf = String.valueOf(this.a);
                String valueOf2 = String.valueOf(this.b);
                String valueOf3 = String.valueOf(this.a);
                String valueOf4 = String.valueOf(this.c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(valueOf);
                sb.append("=");
                sb.append(valueOf2);
                sb.append(" and ");
                sb.append(valueOf3);
                sb.append("=");
                sb.append(valueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public a(int i) {
            this.b = new Object[i * 2];
        }

        public static void f(Object[] objArr, int i, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i3 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i, yg0.a(comparator).e(bb0.d()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        public final r40 a(boolean z) {
            Object[] objArr;
            C0027a c0027a;
            C0027a c0027a2;
            if (!z || (c0027a2 = this.e) == null) {
                int i = this.c;
                if (this.a == null) {
                    objArr = this.b;
                } else {
                    if (this.d) {
                        this.b = Arrays.copyOf(this.b, i * 2);
                    }
                    objArr = this.b;
                    if (!z) {
                        objArr = d(objArr, this.c);
                        if (objArr.length < this.b.length) {
                            i = objArr.length >>> 1;
                        }
                    }
                    f(objArr, i, this.a);
                }
                this.d = true;
                mo0 h = mo0.h(i, objArr, this);
                if (!z || (c0027a = this.e) == null) {
                    return h;
                }
                throw c0027a.a();
            }
            throw c0027a2.a();
        }

        public r40 b() {
            return a(true);
        }

        public final void c(int i) {
            int i2 = i * 2;
            Object[] objArr = this.b;
            if (i2 > objArr.length) {
                this.b = Arrays.copyOf(objArr, p40.b.a(objArr.length, i2));
                this.d = false;
            }
        }

        public final Object[] d(Object[] objArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                Object obj = objArr[i2 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i - bitSet.cardinality()) * 2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * 2) {
                if (bitSet.get(i3 >>> 1)) {
                    i3 += 2;
                } else {
                    int i5 = i4 + 1;
                    int i6 = i3 + 1;
                    Object obj2 = objArr[i3];
                    Objects.requireNonNull(obj2);
                    objArr2[i4] = obj2;
                    i4 += 2;
                    i3 += 2;
                    Object obj3 = objArr[i6];
                    Objects.requireNonNull(obj3);
                    objArr2[i5] = obj3;
                }
            }
            return objArr2;
        }

        public a e(Object obj, Object obj2) {
            c(this.c + 1);
            mc.a(obj, obj2);
            Object[] objArr = this.b;
            int i = this.c;
            objArr[i * 2] = obj;
            objArr[(i * 2) + 1] = obj2;
            this.c = i + 1;
            return this;
        }
    }

    public static r40 f() {
        return mo0.t;
    }

    public abstract t40 a();

    public abstract t40 b();

    public abstract p40 c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d */
    public t40 entrySet() {
        t40 t40Var = this.m;
        if (t40Var == null) {
            t40 a2 = a();
            this.m = a2;
            return a2;
        }
        return t40Var;
    }

    @Override // java.util.Map
    /* renamed from: e */
    public t40 keySet() {
        t40 t40Var = this.n;
        if (t40Var == null) {
            t40 b = b();
            this.n = b;
            return b;
        }
        return t40Var;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return bb0.a(this, obj);
    }

    @Override // java.util.Map
    /* renamed from: g */
    public p40 values() {
        p40 p40Var = this.o;
        if (p40Var == null) {
            p40 c = c();
            this.o = c;
            return c;
        }
        return p40Var;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return ht0.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return bb0.c(this);
    }
}
