package androidx.appcompat.view.menu;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class za0 {
    public b a;
    public c b;
    public e c;

    /* loaded from: classes.dex */
    public final class a implements Iterator {
        public final int m;
        public int n;
        public int o;
        public boolean p = false;

        public a(int i) {
            this.m = i;
            this.n = za0.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.o < this.n;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                Object b = za0.this.b(this.o, this.m);
                this.o++;
                this.p = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.p) {
                throw new IllegalStateException();
            }
            int i = this.o - 1;
            this.o = i;
            this.n--;
            this.p = false;
            za0.this.h(i);
        }
    }

    /* loaded from: classes.dex */
    public final class b implements Set {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            int d = za0.this.d();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                za0.this.g(entry.getKey(), entry.getValue());
            }
            return d != za0.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            za0.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int e = za0.this.e(entry.getKey());
                if (e < 0) {
                    return false;
                }
                return rf.c(za0.this.b(e, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            for (Object obj : collection) {
                if (!contains(obj)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: d */
        public boolean add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return za0.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int d = za0.this.d() - 1; d >= 0; d--) {
                Object b = za0.this.b(d, 0);
                Object b2 = za0.this.b(d, 1);
                i += (b == null ? 0 : b.hashCode()) ^ (b2 == null ? 0 : b2.hashCode());
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return za0.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return za0.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public final class c implements Set {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            za0.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return za0.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return za0.j(za0.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return za0.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i = 0;
            for (int d = za0.this.d() - 1; d >= 0; d--) {
                Object b = za0.this.b(d, 0);
                i += b == null ? 0 : b.hashCode();
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return za0.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e = za0.this.e(obj);
            if (e >= 0) {
                za0.this.h(e);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return za0.o(za0.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return za0.p(za0.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return za0.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return za0.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return za0.this.r(objArr, 0);
        }
    }

    /* loaded from: classes.dex */
    public final class d implements Iterator, Map.Entry {
        public int m;
        public boolean o = false;
        public int n = -1;

        public d() {
            this.m = za0.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry next() {
            if (hasNext()) {
                this.n++;
                this.o = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.o) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return rf.c(entry.getKey(), za0.this.b(this.n, 0)) && rf.c(entry.getValue(), za0.this.b(this.n, 1));
                }
                return false;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.o) {
                return za0.this.b(this.n, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.o) {
                return za0.this.b(this.n, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.n < this.m;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.o) {
                Object b = za0.this.b(this.n, 0);
                Object b2 = za0.this.b(this.n, 1);
                return (b == null ? 0 : b.hashCode()) ^ (b2 != null ? b2.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.o) {
                throw new IllegalStateException();
            }
            za0.this.h(this.n);
            this.n--;
            this.m--;
            this.o = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.o) {
                return za0.this.i(this.n, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: classes.dex */
    public final class e implements Collection {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            za0.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return za0.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            for (Object obj : collection) {
                if (!contains(obj)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return za0.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f = za0.this.f(obj);
            if (f >= 0) {
                za0.this.h(f);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int d = za0.this.d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(za0.this.b(i, 1))) {
                    za0.this.h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int d = za0.this.d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(za0.this.b(i, 1))) {
                    za0.this.h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return za0.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return za0.this.q(1);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return za0.this.r(objArr, 1);
        }
    }

    public static boolean j(Map map, Collection collection) {
        for (Object obj : collection) {
            if (!map.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean o(Map map, Collection collection) {
        int size = map.size();
        for (Object obj : collection) {
            map.remove(obj);
        }
        return size != map.size();
    }

    public static boolean p(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i, int i2);

    public abstract Map c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(Object obj, Object obj2);

    public abstract void h(int i);

    public abstract Object i(int i, Object obj);

    public Set l() {
        if (this.a == null) {
            this.a = new b();
        }
        return this.a;
    }

    public Set m() {
        if (this.b == null) {
            this.b = new c();
        }
        return this.b;
    }

    public Collection n() {
        if (this.c == null) {
            this.c = new e();
        }
        return this.c;
    }

    public Object[] q(int i) {
        int d2 = d();
        Object[] objArr = new Object[d2];
        for (int i2 = 0; i2 < d2; i2++) {
            objArr[i2] = b(i2, i);
        }
        return objArr;
    }

    public Object[] r(Object[] objArr, int i) {
        int d2 = d();
        if (objArr.length < d2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d2);
        }
        for (int i2 = 0; i2 < d2; i2++) {
            objArr[i2] = b(i2, i);
        }
        if (objArr.length > d2) {
            objArr[d2] = null;
        }
        return objArr;
    }
}
