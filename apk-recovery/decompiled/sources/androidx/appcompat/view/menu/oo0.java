package androidx.appcompat.view.menu;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class oo0 extends v40 {
    public static final oo0 r = new oo0(q40.u(), yg0.c());
    public final transient q40 q;

    public oo0(q40 q40Var, Comparator comparator) {
        super(comparator);
        this.q = q40Var;
    }

    @Override // androidx.appcompat.view.menu.v40
    public v40 C() {
        Comparator reverseOrder = Collections.reverseOrder(this.o);
        return isEmpty() ? v40.E(reverseOrder) : new oo0(this.q.y(), reverseOrder);
    }

    @Override // androidx.appcompat.view.menu.v40
    public v40 H(Object obj, boolean z) {
        return R(0, S(obj, z));
    }

    @Override // androidx.appcompat.view.menu.v40
    public v40 K(Object obj, boolean z, Object obj2, boolean z2) {
        return N(obj, z).H(obj2, z2);
    }

    @Override // androidx.appcompat.view.menu.v40
    public v40 N(Object obj, boolean z) {
        return R(U(obj, z), size());
    }

    @Override // java.util.NavigableSet
    /* renamed from: Q */
    public w31 descendingIterator() {
        return this.q.y().iterator();
    }

    public oo0 R(int i, int i2) {
        return (i == 0 && i2 == size()) ? this : i < i2 ? new oo0(this.q.subList(i, i2), this.o) : v40.E(this.o);
    }

    public int S(Object obj, boolean z) {
        int binarySearch = Collections.binarySearch(this.q, qj0.i(obj), comparator());
        return binarySearch >= 0 ? z ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: T */
    public w31 iterator() {
        return this.q.iterator();
    }

    public int U(Object obj, boolean z) {
        int binarySearch = Collections.binarySearch(this.q, qj0.i(obj), comparator());
        return binarySearch >= 0 ? z ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final int V(Object obj) {
        return Collections.binarySearch(this.q, obj, W());
    }

    public Comparator W() {
        return this.o;
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        int U = U(obj, true);
        if (U == size()) {
            return null;
        }
        return this.q.get(U);
    }

    @Override // androidx.appcompat.view.menu.p40, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj != null) {
            try {
                return V(obj) >= 0;
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        if (collection instanceof ke0) {
            collection = ((ke0) collection).l();
        }
        if (!ew0.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        w31 it = iterator();
        Iterator it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = it.next();
        while (true) {
            try {
                int O = O(next2, next);
                if (O < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (O == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (O > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.p40
    public int d(Object[] objArr, int i) {
        return this.q.d(objArr, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[Catch: ClassCastException | NoSuchElementException -> 0x0046, TryCatch #0 {ClassCastException | NoSuchElementException -> 0x0046, blocks: (B:17:0x002a, B:18:0x002e, B:20:0x0034, B:22:0x003e), top: B:29:0x002a }] */
    @Override // androidx.appcompat.view.menu.t40, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L17
            return r2
        L17:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L1e
            return r0
        L1e:
            java.util.Comparator r1 = r5.o
            boolean r1 = androidx.appcompat.view.menu.ew0.b(r1, r6)
            if (r1 == 0) goto L47
            java.util.Iterator r6 = r6.iterator()
            androidx.appcompat.view.menu.w31 r1 = r5.iterator()     // Catch: java.lang.Throwable -> L46
        L2e:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L44
            int r3 = r5.O(r3, r4)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L2e
        L44:
            return r2
        L45:
            return r0
        L46:
            return r2
        L47:
            boolean r6 = r5.containsAll(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.oo0.equals(java.lang.Object):boolean");
    }

    @Override // androidx.appcompat.view.menu.p40
    public Object[] f() {
        return this.q.f();
    }

    @Override // java.util.SortedSet
    public Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.q.get(0);
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        int S = S(obj, true) - 1;
        if (S == -1) {
            return null;
        }
        return this.q.get(S);
    }

    @Override // androidx.appcompat.view.menu.p40
    public int g() {
        return this.q.g();
    }

    @Override // androidx.appcompat.view.menu.p40
    public int h() {
        return this.q.h();
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        int U = U(obj, false);
        if (U == size()) {
            return null;
        }
        return this.q.get(U);
    }

    @Override // androidx.appcompat.view.menu.p40
    public boolean i() {
        return this.q.i();
    }

    @Override // java.util.SortedSet
    public Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.q.get(size() - 1);
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        int S = S(obj, false) - 1;
        if (S == -1) {
            return null;
        }
        return this.q.get(S);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.q.size();
    }
}
