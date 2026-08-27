package androidx.appcompat.view.menu;

import android.os.Bundle;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class ni1 implements Iterator {
    public Iterator m;
    public final /* synthetic */ hi1 n;

    public ni1(hi1 hi1Var) {
        Bundle bundle;
        this.n = hi1Var;
        bundle = hi1Var.m;
        this.m = bundle.keySet().iterator();
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
        throw new UnsupportedOperationException("Remove not supported");
    }
}
