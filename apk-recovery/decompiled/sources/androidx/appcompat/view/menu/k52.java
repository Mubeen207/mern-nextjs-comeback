package androidx.appcompat.view.menu;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class k52 extends ix1 implements RandomAccess {
    public static final k52 p = new k52(new Object[0], 0, false);
    public Object[] n;
    public int o;

    public k52(Object[] objArr, int i, boolean z) {
        super(z);
        this.n = objArr;
        this.o = i;
    }

    public static k52 h() {
        return p;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        d();
        if (i >= 0 && i <= (i2 = this.o)) {
            Object[] objArr = this.n;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.n, i, objArr2, i + 1, this.o - i);
                this.n = objArr2;
            }
            this.n[i] = obj;
            this.o++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(f(i));
    }

    @Override // androidx.appcompat.view.menu.q12
    public final /* synthetic */ q12 e(int i) {
        if (i >= this.o) {
            return new k52(Arrays.copyOf(this.n, i), this.o, true);
        }
        throw new IllegalArgumentException();
    }

    public final String f(int i) {
        int i2 = this.o;
        return "Index:" + i + ", Size:" + i2;
    }

    public final void g(int i) {
        if (i < 0 || i >= this.o) {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g(i);
        return this.n[i];
    }

    @Override // androidx.appcompat.view.menu.ix1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        d();
        g(i);
        Object[] objArr = this.n;
        Object obj = objArr[i];
        if (i < this.o - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.o--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        d();
        g(i);
        Object[] objArr = this.n;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.o;
    }

    @Override // androidx.appcompat.view.menu.ix1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        int i = this.o;
        Object[] objArr = this.n;
        if (i == objArr.length) {
            this.n = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.n;
        int i2 = this.o;
        this.o = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
