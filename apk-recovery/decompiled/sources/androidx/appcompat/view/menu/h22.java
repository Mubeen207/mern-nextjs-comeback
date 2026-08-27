package androidx.appcompat.view.menu;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class h22 extends ix1 implements f22, RandomAccess {
    public static final h22 o;
    public static final f22 p;
    public final List n;

    static {
        h22 h22Var = new h22(false);
        o = h22Var;
        p = h22Var;
    }

    public h22(int i) {
        this(new ArrayList(i));
    }

    public static String f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof tx1 ? ((tx1) obj).w() : y02.h((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        d();
        this.n.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.appcompat.view.menu.ix1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.appcompat.view.menu.f22
    public final List b() {
        return Collections.unmodifiableList(this.n);
    }

    @Override // androidx.appcompat.view.menu.ix1, androidx.appcompat.view.menu.q12
    public final /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    @Override // androidx.appcompat.view.menu.ix1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.n.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.appcompat.view.menu.q12
    public final /* synthetic */ q12 e(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.n);
            return new h22(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.appcompat.view.menu.ix1, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.n.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof tx1) {
            tx1 tx1Var = (tx1) obj;
            String w = tx1Var.w();
            if (tx1Var.x()) {
                this.n.set(i, w);
            }
            return w;
        }
        byte[] bArr = (byte[]) obj;
        String h = y02.h(bArr);
        if (y02.i(bArr)) {
            this.n.set(i, h);
        }
        return h;
    }

    @Override // androidx.appcompat.view.menu.ix1, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.appcompat.view.menu.f22
    public final Object j(int i) {
        return this.n.get(i);
    }

    @Override // androidx.appcompat.view.menu.f22
    public final f22 m() {
        return c() ? new q72(this) : this;
    }

    @Override // androidx.appcompat.view.menu.f22
    public final void q(tx1 tx1Var) {
        d();
        this.n.add(tx1Var);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.appcompat.view.menu.ix1, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        d();
        Object remove = this.n.remove(i);
        ((AbstractList) this).modCount++;
        return f(remove);
    }

    @Override // androidx.appcompat.view.menu.ix1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.appcompat.view.menu.ix1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        d();
        return f(this.n.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n.size();
    }

    public h22(ArrayList arrayList) {
        this.n = arrayList;
    }

    @Override // androidx.appcompat.view.menu.ix1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        d();
        if (collection instanceof f22) {
            collection = ((f22) collection).b();
        }
        boolean addAll = this.n.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public h22(boolean z) {
        super(false);
        this.n = Collections.emptyList();
    }

    @Override // androidx.appcompat.view.menu.ix1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // androidx.appcompat.view.menu.ix1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }
}
