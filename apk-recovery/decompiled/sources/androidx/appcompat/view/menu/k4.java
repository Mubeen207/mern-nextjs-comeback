package androidx.appcompat.view.menu;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class k4 extends n {
    public static final a p = new a(null);
    public static final Object[] q = new Object[0];
    public int m;
    public Object[] n = q;
    public int o;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }

        public final int a(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        c60.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        k(size() + collection.size());
        g(r(this.m + size()), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        k(size() + 1);
        int i = i(this.m);
        this.m = i;
        this.n[i] = obj;
        this.o = size() + 1;
    }

    public final void addLast(Object obj) {
        k(size() + 1);
        this.n[r(this.m + size())] = obj;
        this.o = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int r = r(this.m + size());
        int i = this.m;
        if (i < r) {
            w4.e(this.n, null, i, r);
        } else if (!isEmpty()) {
            Object[] objArr = this.n;
            w4.e(objArr, null, this.m, objArr.length);
            w4.e(this.n, null, 0, r);
        }
        this.m = 0;
        this.o = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // androidx.appcompat.view.menu.n
    public int d() {
        return this.o;
    }

    @Override // androidx.appcompat.view.menu.n
    public Object f(int i) {
        k.m.a(i, size());
        if (i == sc.f(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int r = r(this.m + i);
        Object obj = this.n[r];
        if (i < (size() >> 1)) {
            int i2 = this.m;
            if (r >= i2) {
                Object[] objArr = this.n;
                w4.c(objArr, objArr, i2 + 1, i2, r);
            } else {
                Object[] objArr2 = this.n;
                w4.c(objArr2, objArr2, 1, 0, r);
                Object[] objArr3 = this.n;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.m;
                w4.c(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.n;
            int i4 = this.m;
            objArr4[i4] = null;
            this.m = n(i4);
        } else {
            int r2 = r(this.m + sc.f(this));
            if (r <= r2) {
                Object[] objArr5 = this.n;
                w4.c(objArr5, objArr5, r, r + 1, r2 + 1);
            } else {
                Object[] objArr6 = this.n;
                w4.c(objArr6, objArr6, r, r + 1, objArr6.length);
                Object[] objArr7 = this.n;
                objArr7[objArr7.length - 1] = objArr7[0];
                w4.c(objArr7, objArr7, 0, 1, r2 + 1);
            }
            this.n[r2] = null;
        }
        this.o = size() - 1;
        return obj;
    }

    public final void g(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.n.length;
        while (i < length && it.hasNext()) {
            this.n[i] = it.next();
            i++;
        }
        int i2 = this.m;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.n[i3] = it.next();
        }
        this.o = size() + collection.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        k.m.a(i, size());
        return this.n[r(this.m + i)];
    }

    public final void h(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.n;
        w4.c(objArr2, objArr, 0, this.m, objArr2.length);
        Object[] objArr3 = this.n;
        int length = objArr3.length;
        int i2 = this.m;
        w4.c(objArr3, objArr, length - i2, 0, i2);
        this.m = 0;
        this.n = objArr;
    }

    public final int i(int i) {
        return i == 0 ? x4.h(this.n) : i - 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int r = r(this.m + size());
        int i2 = this.m;
        if (i2 < r) {
            while (i2 < r) {
                if (c60.a(obj, this.n[i2])) {
                    i = this.m;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < r) {
            return -1;
        } else {
            int length = this.n.length;
            while (true) {
                if (i2 >= length) {
                    for (int i3 = 0; i3 < r; i3++) {
                        if (c60.a(obj, this.n[i3])) {
                            i2 = i3 + this.n.length;
                            i = this.m;
                        }
                    }
                    return -1;
                } else if (c60.a(obj, this.n[i2])) {
                    i = this.m;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final void k(int i) {
        int a2;
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.n;
        if (i <= objArr.length) {
            return;
        }
        if (objArr != q) {
            h(p.a(objArr.length, i));
            return;
        }
        a2 = xn0.a(i, 10);
        this.n = new Object[a2];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int h;
        int i;
        int r = r(this.m + size());
        int i2 = this.m;
        if (i2 < r) {
            h = r - 1;
            if (i2 <= h) {
                while (!c60.a(obj, this.n[h])) {
                    if (h != i2) {
                        h--;
                    }
                }
                i = this.m;
                return h - i;
            }
            return -1;
        }
        if (i2 > r) {
            int i3 = r - 1;
            while (true) {
                if (-1 >= i3) {
                    h = x4.h(this.n);
                    int i4 = this.m;
                    if (i4 <= h) {
                        while (!c60.a(obj, this.n[h])) {
                            if (h != i4) {
                                h--;
                            }
                        }
                        i = this.m;
                    }
                } else if (c60.a(obj, this.n[i3])) {
                    h = i3 + this.n.length;
                    i = this.m;
                    break;
                } else {
                    i3--;
                }
            }
        }
        return -1;
    }

    public final int n(int i) {
        if (i == x4.h(this.n)) {
            return 0;
        }
        return i + 1;
    }

    public final int p(int i) {
        return i < 0 ? i + this.n.length : i;
    }

    public final int r(int i) {
        Object[] objArr = this.n;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        int r;
        c60.e(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.n.length != 0) {
            int r2 = r(this.m + size());
            int i = this.m;
            if (i < r2) {
                r = i;
                while (i < r2) {
                    Object obj = this.n[i];
                    if (!collection.contains(obj)) {
                        this.n[r] = obj;
                        r++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                w4.e(this.n, null, r, r2);
            } else {
                int length = this.n.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.n;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!collection.contains(obj2)) {
                        this.n[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                r = r(i2);
                for (int i3 = 0; i3 < r2; i3++) {
                    Object[] objArr2 = this.n;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.n[r] = obj3;
                        r = n(r);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.o = p(r - this.m);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.n;
        int i = this.m;
        Object obj = objArr[i];
        objArr[i] = null;
        this.m = n(i);
        this.o = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int r = r(this.m + sc.f(this));
        Object[] objArr = this.n;
        Object obj = objArr[r];
        objArr[r] = null;
        this.o = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        int r;
        c60.e(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.n.length != 0) {
            int r2 = r(this.m + size());
            int i = this.m;
            if (i < r2) {
                r = i;
                while (i < r2) {
                    Object obj = this.n[i];
                    if (collection.contains(obj)) {
                        this.n[r] = obj;
                        r++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                w4.e(this.n, null, r, r2);
            } else {
                int length = this.n.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.n;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.n[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                r = r(i2);
                for (int i3 = 0; i3 < r2; i3++) {
                    Object[] objArr2 = this.n;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.n[r] = obj3;
                        r = n(r);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.o = p(r - this.m);
            }
        }
        return z;
    }

    public final Object s() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        k.m.a(i, size());
        int r = r(this.m + i);
        Object[] objArr = this.n;
        Object obj2 = objArr[r];
        objArr[r] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        c60.e(objArr, "array");
        if (objArr.length < size()) {
            objArr = u4.a(objArr, size());
        }
        int r = r(this.m + size());
        int i = this.m;
        if (i < r) {
            w4.d(this.n, objArr, 0, i, r, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.n;
            w4.c(objArr2, objArr, 0, this.m, objArr2.length);
            Object[] objArr3 = this.n;
            w4.c(objArr3, objArr, objArr3.length - this.m, 0, r);
        }
        if (objArr.length > size()) {
            objArr[size()] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        k.m.b(i, size());
        if (i == size()) {
            addLast(obj);
        } else if (i == 0) {
            addFirst(obj);
        } else {
            k(size() + 1);
            int r = r(this.m + i);
            if (i < ((size() + 1) >> 1)) {
                int i2 = i(r);
                int i3 = i(this.m);
                int i4 = this.m;
                if (i2 >= i4) {
                    Object[] objArr = this.n;
                    objArr[i3] = objArr[i4];
                    w4.c(objArr, objArr, i4, i4 + 1, i2 + 1);
                } else {
                    Object[] objArr2 = this.n;
                    w4.c(objArr2, objArr2, i4 - 1, i4, objArr2.length);
                    Object[] objArr3 = this.n;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    w4.c(objArr3, objArr3, 0, 1, i2 + 1);
                }
                this.n[i2] = obj;
                this.m = i3;
            } else {
                int r2 = r(this.m + size());
                if (r < r2) {
                    Object[] objArr4 = this.n;
                    w4.c(objArr4, objArr4, r + 1, r, r2);
                } else {
                    Object[] objArr5 = this.n;
                    w4.c(objArr5, objArr5, 1, 0, r2);
                    Object[] objArr6 = this.n;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    w4.c(objArr6, objArr6, r + 1, r, objArr6.length - 1);
                }
                this.n[r] = obj;
            }
            this.o = size() + 1;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        c60.e(collection, "elements");
        k.m.b(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        k(size() + collection.size());
        int r = r(this.m + size());
        int r2 = r(this.m + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.m;
            int i3 = i2 - size;
            if (r2 < i2) {
                Object[] objArr = this.n;
                w4.c(objArr, objArr, i3, i2, objArr.length);
                if (size >= r2) {
                    Object[] objArr2 = this.n;
                    w4.c(objArr2, objArr2, objArr2.length - size, 0, r2);
                } else {
                    Object[] objArr3 = this.n;
                    w4.c(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.n;
                    w4.c(objArr4, objArr4, 0, size, r2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.n;
                w4.c(objArr5, objArr5, i3, i2, r2);
            } else {
                Object[] objArr6 = this.n;
                i3 += objArr6.length;
                int i4 = r2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    w4.c(objArr6, objArr6, i3, i2, r2);
                } else {
                    w4.c(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.n;
                    w4.c(objArr7, objArr7, 0, this.m + length, r2);
                }
            }
            this.m = i3;
            g(p(r2 - size), collection);
        } else {
            int i5 = r2 + size;
            if (r2 < r) {
                int i6 = size + r;
                Object[] objArr8 = this.n;
                if (i6 <= objArr8.length) {
                    w4.c(objArr8, objArr8, i5, r2, r);
                } else if (i5 >= objArr8.length) {
                    w4.c(objArr8, objArr8, i5 - objArr8.length, r2, r);
                } else {
                    int length2 = r - (i6 - objArr8.length);
                    w4.c(objArr8, objArr8, 0, length2, r);
                    Object[] objArr9 = this.n;
                    w4.c(objArr9, objArr9, i5, r2, length2);
                }
            } else {
                Object[] objArr10 = this.n;
                w4.c(objArr10, objArr10, size, 0, r);
                Object[] objArr11 = this.n;
                if (i5 >= objArr11.length) {
                    w4.c(objArr11, objArr11, i5 - objArr11.length, r2, objArr11.length);
                } else {
                    w4.c(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.n;
                    w4.c(objArr12, objArr12, i5, r2, objArr12.length - size);
                }
            }
            g(r2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
