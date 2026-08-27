package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class yu0 extends t40 {
    public final transient Object o;

    public yu0(Object obj) {
        this.o = qj0.i(obj);
    }

    @Override // androidx.appcompat.view.menu.p40, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.o.equals(obj);
    }

    @Override // androidx.appcompat.view.menu.p40
    public int d(Object[] objArr, int i) {
        objArr[i] = this.o;
        return i + 1;
    }

    @Override // androidx.appcompat.view.menu.t40, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.o.hashCode();
    }

    @Override // androidx.appcompat.view.menu.p40
    public boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.o.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: z */
    public w31 iterator() {
        return m60.c(this.o);
    }
}
