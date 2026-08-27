package androidx.appcompat.view.menu;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
/* loaded from: classes.dex */
public abstract class p40 extends AbstractCollection implements Serializable {
    public static final Object[] m = new Object[0];

    /* loaded from: classes.dex */
    public static abstract class a extends b {
        public Object[] a;
        public int b;
        public boolean c;

        public a(int i) {
            mc.b(i, "initialCapacity");
            this.a = new Object[i];
            this.b = 0;
        }

        public b b(Object... objArr) {
            c(objArr, objArr.length);
            return this;
        }

        public final void c(Object[] objArr, int i) {
            vf0.c(objArr, i);
            d(this.b + i);
            System.arraycopy(objArr, 0, this.a, this.b, i);
            this.b += i;
        }

        public final void d(int i) {
            Object[] objArr = this.a;
            if (objArr.length < i) {
                this.a = Arrays.copyOf(objArr, b.a(objArr.length, i));
                this.c = false;
            } else if (this.c) {
                this.a = (Object[]) objArr.clone();
                this.c = false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public static int a(int i, int i2) {
            if (i2 >= 0) {
                int i3 = i + (i >> 1) + 1;
                if (i3 < i2) {
                    i3 = Integer.highestOneBit(i2 - 1) << 1;
                }
                if (i3 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i3;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public abstract int d(Object[] objArr, int i);

    public Object[] f() {
        return null;
    }

    public int g() {
        throw new UnsupportedOperationException();
    }

    public int h() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean i();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        qj0.i(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] f = f();
            if (f != null) {
                return hi0.a(f, h(), g(), objArr);
            }
            objArr = vf0.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        d(objArr, 0);
        return objArr;
    }
}
