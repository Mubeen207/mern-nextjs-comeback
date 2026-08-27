package androidx.appcompat.view.menu;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class jf implements ss0 {
    public final AtomicReference a;

    public jf(ss0 ss0Var) {
        c60.e(ss0Var, "sequence");
        this.a = new AtomicReference(ss0Var);
    }

    @Override // androidx.appcompat.view.menu.ss0
    public Iterator iterator() {
        ss0 ss0Var = (ss0) this.a.getAndSet(null);
        if (ss0Var != null) {
            return ss0Var.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
