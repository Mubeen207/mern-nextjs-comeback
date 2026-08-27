package androidx.appcompat.view.menu;

import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class v50 implements Iterator {
    public abstract int b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
