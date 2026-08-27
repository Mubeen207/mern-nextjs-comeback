package androidx.appcompat.view.menu;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class l4 implements Iterator {
    public final Object[] m;
    public int n;

    public l4(Object[] objArr) {
        c60.e(objArr, "array");
        this.m = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.n < this.m.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.m;
            int i = this.n;
            this.n = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.n--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
