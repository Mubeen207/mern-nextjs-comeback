package androidx.appcompat.view.menu;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class lg1 implements Iterator {
    public final /* synthetic */ Iterator m;

    public lg1(Iterator it) {
        this.m = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return new xg1((String) this.m.next());
    }
}
