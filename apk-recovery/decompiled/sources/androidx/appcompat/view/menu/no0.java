package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class no0 extends t40 {
    public static final Object[] t;
    public static final no0 u;
    public final transient Object[] o;
    public final transient int p;
    public final transient Object[] q;
    public final transient int r;
    public final transient int s;

    static {
        Object[] objArr = new Object[0];
        t = objArr;
        u = new no0(objArr, 0, objArr, 0, 0);
    }

    public no0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.o = objArr;
        this.p = i;
        this.q = objArr2;
        this.r = i2;
        this.s = i3;
    }

    @Override // androidx.appcompat.view.menu.p40, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.q;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c = yy.c(obj);
        while (true) {
            int i = c & this.r;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c = i + 1;
        }
    }

    @Override // androidx.appcompat.view.menu.p40
    public int d(Object[] objArr, int i) {
        System.arraycopy(this.o, 0, objArr, i, this.s);
        return i + this.s;
    }

    @Override // androidx.appcompat.view.menu.p40
    public Object[] f() {
        return this.o;
    }

    @Override // androidx.appcompat.view.menu.p40
    public int g() {
        return this.s;
    }

    @Override // androidx.appcompat.view.menu.p40
    public int h() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.t40, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.p;
    }

    @Override // androidx.appcompat.view.menu.p40
    public boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.t40
    public q40 s() {
        return q40.n(this.o, this.s);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.s;
    }

    @Override // androidx.appcompat.view.menu.t40
    public boolean t() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: z */
    public w31 iterator() {
        return k().iterator();
    }
}
