package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.p40;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public abstract class q40 extends p40 implements List, RandomAccess {
    public static final x31 n = new b(lo0.q, 0);

    /* loaded from: classes.dex */
    public static final class a extends p40.a {
        public a() {
            this(4);
        }

        public a e(Object... objArr) {
            super.b(objArr);
            return this;
        }

        public q40 f() {
            this.c = true;
            return q40.n(this.a, this.b);
        }

        public a(int i) {
            super(i);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends j {
        public final q40 o;

        public b(q40 q40Var, int i) {
            super(q40Var.size(), i);
            this.o = q40Var;
        }

        @Override // androidx.appcompat.view.menu.j
        public Object b(int i) {
            return this.o.get(i);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends q40 {
        public final transient q40 o;

        public c(q40 q40Var) {
            this.o = q40Var;
        }

        @Override // androidx.appcompat.view.menu.q40, java.util.List
        /* renamed from: A */
        public q40 subList(int i, int i2) {
            qj0.m(i, i2, size());
            return this.o.subList(D(i2), D(i)).y();
        }

        public final int C(int i) {
            return (size() - 1) - i;
        }

        public final int D(int i) {
            return size() - i;
        }

        @Override // androidx.appcompat.view.menu.q40, androidx.appcompat.view.menu.p40, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.o.contains(obj);
        }

        @Override // java.util.List
        public Object get(int i) {
            qj0.g(i, size());
            return this.o.get(C(i));
        }

        @Override // androidx.appcompat.view.menu.p40
        public boolean i() {
            return this.o.i();
        }

        @Override // androidx.appcompat.view.menu.q40, java.util.List
        public int indexOf(Object obj) {
            int lastIndexOf = this.o.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return C(lastIndexOf);
            }
            return -1;
        }

        @Override // androidx.appcompat.view.menu.q40, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // androidx.appcompat.view.menu.q40, java.util.List
        public int lastIndexOf(Object obj) {
            int indexOf = this.o.indexOf(obj);
            if (indexOf >= 0) {
                return C(indexOf);
            }
            return -1;
        }

        @Override // androidx.appcompat.view.menu.q40, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.o.size();
        }

        @Override // androidx.appcompat.view.menu.q40
        public q40 y() {
            return this.o;
        }

        @Override // androidx.appcompat.view.menu.q40, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    /* loaded from: classes.dex */
    public class d extends q40 {
        public final transient int o;
        public final transient int p;

        public d(int i, int i2) {
            this.o = i;
            this.p = i2;
        }

        @Override // androidx.appcompat.view.menu.q40, java.util.List
        /* renamed from: A */
        public q40 subList(int i, int i2) {
            qj0.m(i, i2, this.p);
            q40 q40Var = q40.this;
            int i3 = this.o;
            return q40Var.subList(i + i3, i2 + i3);
        }

        @Override // androidx.appcompat.view.menu.p40
        public Object[] f() {
            return q40.this.f();
        }

        @Override // androidx.appcompat.view.menu.p40
        public int g() {
            return q40.this.h() + this.o + this.p;
        }

        @Override // java.util.List
        public Object get(int i) {
            qj0.g(i, this.p);
            return q40.this.get(i + this.o);
        }

        @Override // androidx.appcompat.view.menu.p40
        public int h() {
            return q40.this.h() + this.o;
        }

        @Override // androidx.appcompat.view.menu.p40
        public boolean i() {
            return true;
        }

        @Override // androidx.appcompat.view.menu.q40, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // androidx.appcompat.view.menu.q40, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.p;
        }

        @Override // androidx.appcompat.view.menu.q40, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    public static q40 k(Object[] objArr) {
        return n(objArr, objArr.length);
    }

    public static q40 n(Object[] objArr, int i) {
        return i == 0 ? u() : new lo0(objArr, i);
    }

    public static q40 p(Object... objArr) {
        return k(vf0.b(objArr));
    }

    public static q40 u() {
        return lo0.q;
    }

    public static q40 v(Object obj, Object obj2) {
        return p(obj, obj2);
    }

    public static q40 w(Object obj, Object obj2, Object obj3) {
        return p(obj, obj2, obj3);
    }

    public static q40 x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return p(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static q40 z(Comparator comparator, Iterable iterable) {
        qj0.i(comparator);
        Object[] b2 = l60.b(iterable);
        vf0.b(b2);
        Arrays.sort(b2, comparator);
        return k(b2);
    }

    @Override // java.util.List
    /* renamed from: A */
    public q40 subList(int i, int i2) {
        qj0.m(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? u() : B(i, i2);
    }

    public q40 B(int i, int i2) {
        return new d(i, i2 - i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.appcompat.view.menu.p40, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // androidx.appcompat.view.menu.p40
    public int d(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return o90.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return o90.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return o90.d(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: r */
    public w31 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s */
    public x31 listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: t */
    public x31 listIterator(int i) {
        qj0.k(i, size());
        return isEmpty() ? n : new b(this, i);
    }

    public q40 y() {
        return size() <= 1 ? this : new c(this);
    }
}
