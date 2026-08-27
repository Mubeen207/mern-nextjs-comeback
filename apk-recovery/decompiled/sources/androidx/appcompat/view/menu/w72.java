package androidx.appcompat.view.menu;

import java.util.ListIterator;
/* loaded from: classes.dex */
public final class w72 implements ListIterator {
    public ListIterator m;
    public final /* synthetic */ int n;
    public final /* synthetic */ q72 o;

    public w72(q72 q72Var, int i) {
        f22 f22Var;
        this.o = q72Var;
        this.n = i;
        f22Var = q72Var.m;
        this.m = f22Var.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.m.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.m.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.m.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.m.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        return (String) this.m.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.m.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
