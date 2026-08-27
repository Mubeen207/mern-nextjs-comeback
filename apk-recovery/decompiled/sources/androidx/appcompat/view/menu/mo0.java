package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.r40;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class mo0 extends r40 {
    public static final r40 t = new mo0(null, new Object[0], 0);
    public final transient Object q;
    public final transient Object[] r;
    public final transient int s;

    /* loaded from: classes.dex */
    public static class a extends t40 {
        public final transient r40 o;
        public final transient Object[] p;
        public final transient int q;
        public final transient int r;

        /* renamed from: androidx.appcompat.view.menu.mo0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0013a extends q40 {
            public C0013a() {
            }

            @Override // java.util.List
            /* renamed from: C */
            public Map.Entry get(int i) {
                qj0.g(i, a.this.r);
                int i2 = i * 2;
                Object obj = a.this.p[a.this.q + i2];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.p[i2 + (a.this.q ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // androidx.appcompat.view.menu.p40
            public boolean i() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.r;
            }
        }

        public a(r40 r40Var, Object[] objArr, int i, int i2) {
            this.o = r40Var;
            this.p = objArr;
            this.q = i;
            this.r = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: C */
        public w31 iterator() {
            return k().iterator();
        }

        @Override // androidx.appcompat.view.menu.p40, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                return value != null && value.equals(this.o.get(key));
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.p40
        public int d(Object[] objArr, int i) {
            return k().d(objArr, i);
        }

        @Override // androidx.appcompat.view.menu.p40
        public boolean i() {
            return true;
        }

        @Override // androidx.appcompat.view.menu.t40
        public q40 s() {
            return new C0013a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.r;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends t40 {
        public final transient r40 o;
        public final transient q40 p;

        public b(r40 r40Var, q40 q40Var) {
            this.o = r40Var;
            this.p = q40Var;
        }

        @Override // androidx.appcompat.view.menu.p40, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.o.get(obj) != null;
        }

        @Override // androidx.appcompat.view.menu.p40
        public int d(Object[] objArr, int i) {
            return k().d(objArr, i);
        }

        @Override // androidx.appcompat.view.menu.p40
        public boolean i() {
            return true;
        }

        @Override // androidx.appcompat.view.menu.t40
        public q40 k() {
            return this.p;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.o.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: z */
        public w31 iterator() {
            return k().iterator();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends q40 {
        public final transient Object[] o;
        public final transient int p;
        public final transient int q;

        public c(Object[] objArr, int i, int i2) {
            this.o = objArr;
            this.p = i;
            this.q = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            qj0.g(i, this.q);
            Object obj = this.o[(i * 2) + this.p];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // androidx.appcompat.view.menu.p40
        public boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.q;
        }
    }

    public mo0(Object obj, Object[] objArr, int i) {
        this.q = obj;
        this.r = objArr;
        this.s = i;
    }

    public static mo0 h(int i, Object[] objArr, r40.a aVar) {
        if (i == 0) {
            return (mo0) t;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            mc.a(obj, obj2);
            return new mo0(null, objArr, 1);
        }
        qj0.k(i, objArr.length >> 1);
        Object i2 = i(objArr, i, t40.n(i), 0);
        if (i2 instanceof Object[]) {
            Object[] objArr2 = (Object[]) i2;
            r40.a.C0027a c0027a = (r40.a.C0027a) objArr2[2];
            if (aVar == null) {
                throw c0027a.a();
            }
            aVar.e = c0027a;
            Object obj3 = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            i2 = obj3;
            i = intValue;
        }
        return new mo0(i2, objArr, i);
    }

    public static Object i(Object[] objArr, int i, int i2, int i3) {
        r40.a.C0027a c0027a = null;
        if (i == 1) {
            Object obj = objArr[i3];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i3 ^ 1];
            Objects.requireNonNull(obj2);
            mc.a(obj, obj2);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = 0;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            while (i5 < i) {
                int i7 = (i5 * 2) + i3;
                int i8 = (i6 * 2) + i3;
                Object obj3 = objArr[i7];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i7 ^ 1];
                Objects.requireNonNull(obj4);
                mc.a(obj3, obj4);
                int b2 = yy.b(obj3.hashCode());
                while (true) {
                    int i9 = b2 & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i8;
                        if (i6 < i5) {
                            objArr[i8] = obj3;
                            objArr[i8 ^ 1] = obj4;
                        }
                        i6++;
                    } else if (obj3.equals(objArr[i10])) {
                        int i11 = i10 ^ 1;
                        Object obj5 = objArr[i11];
                        Objects.requireNonNull(obj5);
                        c0027a = new r40.a.C0027a(obj3, obj4, obj5);
                        objArr[i11] = obj4;
                        break;
                    } else {
                        b2 = i9 + 1;
                    }
                }
                i5++;
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), c0027a};
        } else if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i12 = 0;
            while (i5 < i) {
                int i13 = (i5 * 2) + i3;
                int i14 = (i12 * 2) + i3;
                Object obj6 = objArr[i13];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i13 ^ 1];
                Objects.requireNonNull(obj7);
                mc.a(obj6, obj7);
                int b3 = yy.b(obj6.hashCode());
                while (true) {
                    int i15 = b3 & i4;
                    int i16 = sArr[i15] & 65535;
                    if (i16 == 65535) {
                        sArr[i15] = (short) i14;
                        if (i12 < i5) {
                            objArr[i14] = obj6;
                            objArr[i14 ^ 1] = obj7;
                        }
                        i12++;
                    } else if (obj6.equals(objArr[i16])) {
                        int i17 = i16 ^ 1;
                        Object obj8 = objArr[i17];
                        Objects.requireNonNull(obj8);
                        c0027a = new r40.a.C0027a(obj6, obj7, obj8);
                        objArr[i17] = obj7;
                        break;
                    } else {
                        b3 = i15 + 1;
                    }
                }
                i5++;
            }
            return i12 == i ? sArr : new Object[]{sArr, Integer.valueOf(i12), c0027a};
        } else {
            int[] iArr = new int[i2];
            Arrays.fill(iArr, -1);
            int i18 = 0;
            while (i5 < i) {
                int i19 = (i5 * 2) + i3;
                int i20 = (i18 * 2) + i3;
                Object obj9 = objArr[i19];
                Objects.requireNonNull(obj9);
                Object obj10 = objArr[i19 ^ 1];
                Objects.requireNonNull(obj10);
                mc.a(obj9, obj10);
                int b4 = yy.b(obj9.hashCode());
                while (true) {
                    int i21 = b4 & i4;
                    int i22 = iArr[i21];
                    if (i22 == -1) {
                        iArr[i21] = i20;
                        if (i18 < i5) {
                            objArr[i20] = obj9;
                            objArr[i20 ^ 1] = obj10;
                        }
                        i18++;
                    } else if (obj9.equals(objArr[i22])) {
                        int i23 = i22 ^ 1;
                        Object obj11 = objArr[i23];
                        Objects.requireNonNull(obj11);
                        c0027a = new r40.a.C0027a(obj9, obj10, obj11);
                        objArr[i23] = obj10;
                        break;
                    } else {
                        b4 = i21 + 1;
                    }
                }
                i5++;
            }
            return i18 == i ? iArr : new Object[]{iArr, Integer.valueOf(i18), c0027a};
        }
    }

    public static Object j(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (obj3.equals(obj2)) {
                Object obj4 = objArr[i2 ^ 1];
                Objects.requireNonNull(obj4);
                return obj4;
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int b2 = yy.b(obj2.hashCode());
                while (true) {
                    int i3 = b2 & length;
                    int i4 = bArr[i3] & 255;
                    if (i4 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[i4])) {
                        return objArr[i4 ^ 1];
                    }
                    b2 = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int b3 = yy.b(obj2.hashCode());
                while (true) {
                    int i5 = b3 & length2;
                    int i6 = sArr[i5] & 65535;
                    if (i6 == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[i6])) {
                        return objArr[i6 ^ 1];
                    }
                    b3 = i5 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int b4 = yy.b(obj2.hashCode());
                while (true) {
                    int i7 = b4 & length3;
                    int i8 = iArr[i7];
                    if (i8 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i8])) {
                        return objArr[i8 ^ 1];
                    }
                    b4 = i7 + 1;
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.r40
    public t40 a() {
        return new a(this, this.r, 0, this.s);
    }

    @Override // androidx.appcompat.view.menu.r40
    public t40 b() {
        return new b(this, new c(this.r, 0, this.s));
    }

    @Override // androidx.appcompat.view.menu.r40
    public p40 c() {
        return new c(this.r, 1, this.s);
    }

    @Override // androidx.appcompat.view.menu.r40, java.util.Map
    public Object get(Object obj) {
        Object j = j(this.q, this.r, this.s, 0, obj);
        if (j == null) {
            return null;
        }
        return j;
    }

    @Override // java.util.Map
    public int size() {
        return this.s;
    }
}
