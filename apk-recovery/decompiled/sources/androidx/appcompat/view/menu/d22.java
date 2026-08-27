package androidx.appcompat.view.menu;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class d22 implements Iterator {
    public Iterator m;

    public d22(Iterator it) {
        this.m = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.m.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.m.remove();
    }
}
