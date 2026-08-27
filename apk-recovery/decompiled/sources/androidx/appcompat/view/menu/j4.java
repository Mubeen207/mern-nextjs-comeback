package androidx.appcompat.view.menu;

import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class j4 implements Collection {
    public final Object[] m;
    public final boolean n;

    public j4(Object[] objArr, boolean z) {
        c60.e(objArr, "values");
        this.m = objArr;
        this.n = z;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return x4.f(this.m, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        c60.e(collection, "elements");
        Collection<Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public int d() {
        return this.m.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.m.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return m4.a(this.m);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        c60.e(objArr, "array");
        return nc.b(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return rc.a(this.m, this.n);
    }
}
