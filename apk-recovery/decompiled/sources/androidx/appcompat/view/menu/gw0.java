package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public class gw0 implements Cloneable {
    public static final Object q = new Object();
    public boolean m;
    public int[] n;
    public Object[] o;
    public int p;

    public gw0() {
        this(10);
    }

    public void a(int i, Object obj) {
        int i2 = this.p;
        if (i2 != 0 && i <= this.n[i2 - 1]) {
            i(i, obj);
            return;
        }
        if (this.m && i2 >= this.n.length) {
            d();
        }
        int i3 = this.p;
        if (i3 >= this.n.length) {
            int e = rf.e(i3 + 1);
            int[] iArr = new int[e];
            Object[] objArr = new Object[e];
            int[] iArr2 = this.n;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.o;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.n = iArr;
            this.o = objArr;
        }
        this.n[i3] = i;
        this.o[i3] = obj;
        this.p = i3 + 1;
    }

    public void b() {
        int i = this.p;
        Object[] objArr = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.p = 0;
        this.m = false;
    }

    /* renamed from: c */
    public gw0 clone() {
        try {
            gw0 gw0Var = (gw0) super.clone();
            gw0Var.n = (int[]) this.n.clone();
            gw0Var.o = (Object[]) this.o.clone();
            return gw0Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void d() {
        int i = this.p;
        int[] iArr = this.n;
        Object[] objArr = this.o;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != q) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.m = false;
        this.p = i2;
    }

    public Object e(int i) {
        return f(i, null);
    }

    public Object f(int i, Object obj) {
        Object obj2;
        int a = rf.a(this.n, this.p, i);
        return (a < 0 || (obj2 = this.o[a]) == q) ? obj : obj2;
    }

    public int g(Object obj) {
        if (this.m) {
            d();
        }
        for (int i = 0; i < this.p; i++) {
            if (this.o[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public int h(int i) {
        if (this.m) {
            d();
        }
        return this.n[i];
    }

    public void i(int i, Object obj) {
        int a = rf.a(this.n, this.p, i);
        if (a >= 0) {
            this.o[a] = obj;
            return;
        }
        int i2 = ~a;
        int i3 = this.p;
        if (i2 < i3) {
            Object[] objArr = this.o;
            if (objArr[i2] == q) {
                this.n[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.m && i3 >= this.n.length) {
            d();
            i2 = ~rf.a(this.n, this.p, i);
        }
        int i4 = this.p;
        if (i4 >= this.n.length) {
            int e = rf.e(i4 + 1);
            int[] iArr = new int[e];
            Object[] objArr2 = new Object[e];
            int[] iArr2 = this.n;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.o;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.n = iArr;
            this.o = objArr2;
        }
        int i5 = this.p;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.n;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.o;
            System.arraycopy(objArr4, i2, objArr4, i6, this.p - i2);
        }
        this.n[i2] = i;
        this.o[i2] = obj;
        this.p++;
    }

    public int j() {
        if (this.m) {
            d();
        }
        return this.p;
    }

    public Object n(int i) {
        if (this.m) {
            d();
        }
        return this.o[i];
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.p * 28);
        sb.append('{');
        for (int i = 0; i < this.p; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(h(i));
            sb.append('=');
            Object n = n(i);
            if (n != this) {
                sb.append(n);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public gw0(int i) {
        this.m = false;
        if (i == 0) {
            this.n = rf.a;
            this.o = rf.c;
            return;
        }
        int e = rf.e(i);
        this.n = new int[e];
        this.o = new Object[e];
    }
}
