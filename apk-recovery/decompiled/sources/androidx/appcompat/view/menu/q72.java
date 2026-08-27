package androidx.appcompat.view.menu;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class q72 extends AbstractList implements f22, RandomAccess {
    public final f22 m;

    public q72(f22 f22Var) {
        this.m = f22Var;
    }

    @Override // androidx.appcompat.view.menu.f22
    public final List b() {
        return this.m.b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.m.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new u72(this);
    }

    @Override // androidx.appcompat.view.menu.f22
    public final Object j(int i) {
        return this.m.j(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new w72(this, i);
    }

    @Override // androidx.appcompat.view.menu.f22
    public final f22 m() {
        return this;
    }

    @Override // androidx.appcompat.view.menu.f22
    public final void q(tx1 tx1Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.m.size();
    }
}
