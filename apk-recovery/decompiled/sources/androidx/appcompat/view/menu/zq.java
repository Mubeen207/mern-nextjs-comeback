package androidx.appcompat.view.menu;

import java.util.AbstractSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class zq extends AbstractSet {
    public a m;
    public final Object[] n;

    /* loaded from: classes.dex */
    public static final class a implements Iterator {
        public final Object[] m;
        public int n;

        public a(Object[] objArr) {
            this.m = objArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.n != this.m.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArr = this.m;
            int i = this.n;
            this.n = i + 1;
            return objArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public zq(Object[] objArr) {
        this.n = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        a aVar = this.m;
        if (aVar != null) {
            aVar.n = 0;
            return aVar;
        }
        a aVar2 = new a(this.n);
        this.m = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.n.length;
    }
}
