package androidx.appcompat.view.menu;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class u72 implements Iterator {
    public Iterator m;
    public final /* synthetic */ q72 n;

    public u72(q72 q72Var) {
        f22 f22Var;
        this.n = q72Var;
        f22Var = q72Var.m;
        this.m = f22Var.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.m.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
