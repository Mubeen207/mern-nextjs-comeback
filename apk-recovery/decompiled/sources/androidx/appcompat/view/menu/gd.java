package androidx.appcompat.view.menu;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public class gd extends AbstractMap implements Serializable {
    public static final Object v = new Object();
    public transient Object m;
    public transient int[] n;
    public transient Object[] o;
    public transient Object[] p;
    public transient int q;
    public transient int r;
    public transient Set s;
    public transient Set t;
    public transient Collection u;

    /* loaded from: classes.dex */
    public class a extends e {
        public a() {
            super(gd.this, null);
        }

        @Override // androidx.appcompat.view.menu.gd.e
        public Object c(int i) {
            return gd.this.G(i);
        }
    }

    /* loaded from: classes.dex */
    public class b extends e {
        public b() {
            super(gd.this, null);
        }

        @Override // androidx.appcompat.view.menu.gd.e
        /* renamed from: e */
        public Map.Entry c(int i) {
            return new g(i);
        }
    }

    /* loaded from: classes.dex */
    public class c extends e {
        public c() {
            super(gd.this, null);
        }

        @Override // androidx.appcompat.view.menu.gd.e
        public Object c(int i) {
            return gd.this.W(i);
        }
    }

    /* loaded from: classes.dex */
    public class d extends AbstractSet {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            gd.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map w = gd.this.w();
            if (w != null) {
                return w.entrySet().contains(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int D = gd.this.D(entry.getKey());
                return D != -1 && ag0.a(gd.this.W(D), entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return gd.this.y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map w = gd.this.w();
            if (w != null) {
                return w.entrySet().remove(obj);
            }
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (gd.this.J()) {
                    return false;
                }
                int B = gd.this.B();
                int f = hd.f(entry.getKey(), entry.getValue(), B, gd.this.N(), gd.this.L(), gd.this.M(), gd.this.O());
                if (f == -1) {
                    return false;
                }
                gd.this.I(f, B);
                gd.e(gd.this);
                gd.this.C();
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return gd.this.size();
        }
    }

    /* loaded from: classes.dex */
    public class f extends AbstractSet {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            gd.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return gd.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return gd.this.H();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map w = gd.this.w();
            return w != null ? w.keySet().remove(obj) : gd.this.K(obj) != gd.v;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return gd.this.size();
        }
    }

    /* loaded from: classes.dex */
    public final class g extends l {
        public final Object m;
        public int n;

        public g(int i) {
            this.m = gd.this.G(i);
            this.n = i;
        }

        public final void a() {
            int i = this.n;
            if (i == -1 || i >= gd.this.size() || !ag0.a(this.m, gd.this.G(this.n))) {
                this.n = gd.this.D(this.m);
            }
        }

        @Override // androidx.appcompat.view.menu.l, java.util.Map.Entry
        public Object getKey() {
            return this.m;
        }

        @Override // androidx.appcompat.view.menu.l, java.util.Map.Entry
        public Object getValue() {
            Map w = gd.this.w();
            if (w != null) {
                return sf0.a(w.get(this.m));
            }
            a();
            int i = this.n;
            return i == -1 ? sf0.b() : gd.this.W(i);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map w = gd.this.w();
            if (w != null) {
                return sf0.a(w.put(this.m, obj));
            }
            a();
            int i = this.n;
            if (i == -1) {
                gd.this.put(this.m, obj);
                return sf0.b();
            }
            Object W = gd.this.W(i);
            gd.this.V(this.n, obj);
            return W;
        }
    }

    /* loaded from: classes.dex */
    public class h extends AbstractCollection {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            gd.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return gd.this.X();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return gd.this.size();
        }
    }

    public gd() {
        E(3);
    }

    public static /* synthetic */ int e(gd gdVar) {
        int i = gdVar.r;
        gdVar.r = i - 1;
        return i;
    }

    public static gd r() {
        return new gd();
    }

    public int A(int i) {
        int i2 = i + 1;
        if (i2 < this.r) {
            return i2;
        }
        return -1;
    }

    public final int B() {
        return (1 << (this.q & 31)) - 1;
    }

    public void C() {
        this.q += 32;
    }

    public final int D(Object obj) {
        if (J()) {
            return -1;
        }
        int c2 = yy.c(obj);
        int B = B();
        int h2 = hd.h(N(), c2 & B);
        if (h2 == 0) {
            return -1;
        }
        int b2 = hd.b(c2, B);
        do {
            int i = h2 - 1;
            int x = x(i);
            if (hd.b(x, B) == b2 && ag0.a(obj, G(i))) {
                return i;
            }
            h2 = hd.c(x, B);
        } while (h2 != 0);
        return -1;
    }

    public void E(int i) {
        qj0.e(i >= 0, "Expected size must be >= 0");
        this.q = g60.a(i, 1, 1073741823);
    }

    public void F(int i, Object obj, Object obj2, int i2, int i3) {
        S(i, hd.d(i2, 0, i3));
        U(i, obj);
        V(i, obj2);
    }

    public final Object G(int i) {
        return M()[i];
    }

    public Iterator H() {
        Map w = w();
        return w != null ? w.keySet().iterator() : new a();
    }

    public void I(int i, int i2) {
        Object N = N();
        int[] L = L();
        Object[] M = M();
        Object[] O = O();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            M[i] = null;
            O[i] = null;
            L[i] = 0;
            return;
        }
        Object obj = M[i3];
        M[i] = obj;
        O[i] = O[i3];
        M[i3] = null;
        O[i3] = null;
        L[i] = L[i3];
        L[i3] = 0;
        int c2 = yy.c(obj) & i2;
        int h2 = hd.h(N, c2);
        if (h2 == size) {
            hd.i(N, c2, i + 1);
            return;
        }
        while (true) {
            int i4 = h2 - 1;
            int i5 = L[i4];
            int c3 = hd.c(i5, i2);
            if (c3 == size) {
                L[i4] = hd.d(i5, i + 1, i2);
                return;
            }
            h2 = c3;
        }
    }

    public boolean J() {
        return this.m == null;
    }

    public final Object K(Object obj) {
        if (J()) {
            return v;
        }
        int B = B();
        int f2 = hd.f(obj, null, B, N(), L(), M(), null);
        if (f2 == -1) {
            return v;
        }
        Object W = W(f2);
        I(f2, B);
        this.r--;
        C();
        return W;
    }

    public final int[] L() {
        int[] iArr = this.n;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] M() {
        Object[] objArr = this.o;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object N() {
        Object obj = this.m;
        Objects.requireNonNull(obj);
        return obj;
    }

    public final Object[] O() {
        Object[] objArr = this.p;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void P(int i) {
        this.n = Arrays.copyOf(L(), i);
        this.o = Arrays.copyOf(M(), i);
        this.p = Arrays.copyOf(O(), i);
    }

    public final void Q(int i) {
        int min;
        int length = L().length;
        if (i <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        P(min);
    }

    public final int R(int i, int i2, int i3, int i4) {
        Object a2 = hd.a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            hd.i(a2, i3 & i5, i4 + 1);
        }
        Object N = N();
        int[] L = L();
        for (int i6 = 0; i6 <= i; i6++) {
            int h2 = hd.h(N, i6);
            while (h2 != 0) {
                int i7 = h2 - 1;
                int i8 = L[i7];
                int b2 = hd.b(i8, i) | i6;
                int i9 = b2 & i5;
                int h3 = hd.h(a2, i9);
                hd.i(a2, i9, h2);
                L[i7] = hd.d(b2, h3, i5);
                h2 = hd.c(i8, i);
            }
        }
        this.m = a2;
        T(i5);
        return i5;
    }

    public final void S(int i, int i2) {
        L()[i] = i2;
    }

    public final void T(int i) {
        this.q = hd.d(this.q, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    public final void U(int i, Object obj) {
        M()[i] = obj;
    }

    public final void V(int i, Object obj) {
        O()[i] = obj;
    }

    public final Object W(int i) {
        return O()[i];
    }

    public Iterator X() {
        Map w = w();
        return w != null ? w.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (J()) {
            return;
        }
        C();
        Map w = w();
        if (w != null) {
            this.q = g60.a(size(), 3, 1073741823);
            w.clear();
            this.m = null;
            this.r = 0;
            return;
        }
        Arrays.fill(M(), 0, this.r, (Object) null);
        Arrays.fill(O(), 0, this.r, (Object) null);
        hd.g(N());
        Arrays.fill(L(), 0, this.r, 0);
        this.r = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map w = w();
        return w != null ? w.containsKey(obj) : D(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map w = w();
        if (w != null) {
            return w.containsValue(obj);
        }
        for (int i = 0; i < this.r; i++) {
            if (ag0.a(obj, W(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.t;
        if (set == null) {
            Set s = s();
            this.t = s;
            return s;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map w = w();
        if (w != null) {
            return w.get(obj);
        }
        int D = D(obj);
        if (D == -1) {
            return null;
        }
        n(D);
        return W(D);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.s;
        if (set == null) {
            Set u = u();
            this.s = u;
            return u;
        }
        return set;
    }

    public void n(int i) {
    }

    public int o(int i, int i2) {
        return i - 1;
    }

    public int p() {
        qj0.n(J(), "Arrays already allocated");
        int i = this.q;
        int j = hd.j(i);
        this.m = hd.a(j);
        T(j - 1);
        this.n = new int[i];
        this.o = new Object[i];
        this.p = new Object[i];
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        int R;
        int i;
        if (J()) {
            p();
        }
        Map w = w();
        if (w != null) {
            return w.put(obj, obj2);
        }
        int[] L = L();
        Object[] M = M();
        Object[] O = O();
        int i2 = this.r;
        int i3 = i2 + 1;
        int c2 = yy.c(obj);
        int B = B();
        int i4 = c2 & B;
        int h2 = hd.h(N(), i4);
        if (h2 != 0) {
            int b2 = hd.b(c2, B);
            int i5 = 0;
            while (true) {
                int i6 = h2 - 1;
                int i7 = L[i6];
                if (hd.b(i7, B) == b2 && ag0.a(obj, M[i6])) {
                    Object obj3 = O[i6];
                    O[i6] = obj2;
                    n(i6);
                    return obj3;
                }
                int c3 = hd.c(i7, B);
                i5++;
                if (c3 != 0) {
                    h2 = c3;
                } else if (i5 >= 9) {
                    return q().put(obj, obj2);
                } else {
                    if (i3 > B) {
                        R = R(B, hd.e(B), c2, i2);
                    } else {
                        L[i6] = hd.d(i7, i3, B);
                    }
                }
            }
        } else if (i3 > B) {
            R = R(B, hd.e(B), c2, i2);
            i = R;
        } else {
            hd.i(N(), i4, i3);
            i = B;
        }
        Q(i3);
        F(i2, obj, obj2, c2, i);
        this.r = i3;
        C();
        return null;
    }

    public Map q() {
        Map t = t(B() + 1);
        int z = z();
        while (z >= 0) {
            t.put(G(z), W(z));
            z = A(z);
        }
        this.m = t;
        this.n = null;
        this.o = null;
        this.p = null;
        C();
        return t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map w = w();
        if (w != null) {
            return w.remove(obj);
        }
        Object K = K(obj);
        if (K == v) {
            return null;
        }
        return K;
    }

    public Set s() {
        return new d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map w = w();
        return w != null ? w.size() : this.r;
    }

    public Map t(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public Set u() {
        return new f();
    }

    public Collection v() {
        return new h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.u;
        if (collection == null) {
            Collection v2 = v();
            this.u = v2;
            return v2;
        }
        return collection;
    }

    public Map w() {
        Object obj = this.m;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int x(int i) {
        return L()[i];
    }

    public Iterator y() {
        Map w = w();
        return w != null ? w.entrySet().iterator() : new b();
    }

    public int z() {
        return isEmpty() ? -1 : 0;
    }

    /* loaded from: classes.dex */
    public abstract class e implements Iterator {
        public int m;
        public int n;
        public int o;

        public e() {
            this.m = gd.this.q;
            this.n = gd.this.z();
            this.o = -1;
        }

        public final void b() {
            if (gd.this.q != this.m) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract Object c(int i);

        public void d() {
            this.m += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.n >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            b();
            if (hasNext()) {
                int i = this.n;
                this.o = i;
                Object c = c(i);
                this.n = gd.this.A(this.n);
                return c;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            b();
            mc.c(this.o >= 0);
            d();
            gd gdVar = gd.this;
            gdVar.remove(gdVar.G(this.o));
            this.n = gd.this.o(this.n, this.o);
            this.o = -1;
        }

        public /* synthetic */ e(gd gdVar, a aVar) {
            this();
        }
    }
}
