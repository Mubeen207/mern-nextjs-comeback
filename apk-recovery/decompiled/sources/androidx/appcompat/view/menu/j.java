package androidx.appcompat.view.menu;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class j extends x31 {
    public final int m;
    public int n;

    public j(int i, int i2) {
        qj0.k(i2, i);
        this.m = i;
        this.n = i2;
    }

    public abstract Object b(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.n < this.m;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.n > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.n;
            this.n = i + 1;
            return b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.n;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.n - 1;
            this.n = i;
            return b(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.n - 1;
    }
}
