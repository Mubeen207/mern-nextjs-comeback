package androidx.appcompat.view.menu;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class d62 extends t62 {
    public final /* synthetic */ v52 n;

    @Override // androidx.appcompat.view.menu.t62, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new z52(this.n);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d62(v52 v52Var) {
        super(v52Var);
        this.n = v52Var;
    }
}
