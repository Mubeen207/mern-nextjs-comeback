package androidx.appcompat.view.menu;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
/* loaded from: classes.dex */
public abstract class v40 extends w40 implements NavigableSet, dw0 {
    public final transient Comparator o;
    public transient v40 p;

    public v40(Comparator comparator) {
        this.o = comparator;
    }

    public static v40 A(Comparator comparator, Iterable iterable) {
        qj0.i(comparator);
        if (ew0.b(comparator, iterable) && (iterable instanceof v40)) {
            v40 v40Var = (v40) iterable;
            if (!v40Var.i()) {
                return v40Var;
            }
        }
        Object[] b = l60.b(iterable);
        return z(comparator, b.length, b);
    }

    public static v40 B(Comparator comparator, Collection collection) {
        return A(comparator, collection);
    }

    public static oo0 E(Comparator comparator) {
        return yg0.c().equals(comparator) ? oo0.r : new oo0(q40.u(), comparator);
    }

    public static int P(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    public static v40 z(Comparator comparator, int i, Object... objArr) {
        if (i == 0) {
            return E(comparator);
        }
        vf0.c(objArr, i);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        return new oo0(q40.n(objArr, i2), comparator);
    }

    public abstract v40 C();

    @Override // java.util.NavigableSet
    /* renamed from: D */
    public v40 descendingSet() {
        v40 v40Var = this.p;
        if (v40Var == null) {
            v40 C = C();
            this.p = C;
            C.p = this;
            return C;
        }
        return v40Var;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: F */
    public v40 headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: G */
    public v40 headSet(Object obj, boolean z) {
        return H(qj0.i(obj), z);
    }

    public abstract v40 H(Object obj, boolean z);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: I */
    public v40 subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: J */
    public v40 subSet(Object obj, boolean z, Object obj2, boolean z2) {
        qj0.i(obj);
        qj0.i(obj2);
        qj0.d(this.o.compare(obj, obj2) <= 0);
        return K(obj, z, obj2, z2);
    }

    public abstract v40 K(Object obj, boolean z, Object obj2, boolean z2);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: L */
    public v40 tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* renamed from: M */
    public v40 tailSet(Object obj, boolean z) {
        return N(qj0.i(obj), z);
    }

    public abstract v40 N(Object obj, boolean z);

    public int O(Object obj, Object obj2) {
        return P(this.o, obj, obj2);
    }

    @Override // java.util.SortedSet, androidx.appcompat.view.menu.dw0
    public Comparator comparator() {
        return this.o;
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }
}
