package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public class qa0 implements Cloneable {
    public static final Object q = new Object();
    public boolean m;
    public long[] n;
    public Object[] o;
    public int p;

    public qa0() {
        this(10);
    }

    public void a() {
        int i = this.p;
        Object[] objArr = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.p = 0;
        this.m = false;
    }

    /* renamed from: b */
    public qa0 clone() {
        try {
            qa0 qa0Var = (qa0) super.clone();
            qa0Var.n = (long[]) this.n.clone();
            qa0Var.o = (Object[]) this.o.clone();
            return qa0Var;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void c() {
        int i = this.p;
        long[] jArr = this.n;
        Object[] objArr = this.o;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != q) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.m = false;
        this.p = i2;
    }

    public Object d(long j) {
        return e(j, null);
    }

    public Object e(long j, Object obj) {
        Object obj2;
        int b = rf.b(this.n, this.p, j);
        return (b < 0 || (obj2 = this.o[b]) == q) ? obj : obj2;
    }

    public int f(long j) {
        if (this.m) {
            c();
        }
        return rf.b(this.n, this.p, j);
    }

    public long g(int i) {
        if (this.m) {
            c();
        }
        return this.n[i];
    }

    public void h(long j, Object obj) {
        int b = rf.b(this.n, this.p, j);
        if (b >= 0) {
            this.o[b] = obj;
            return;
        }
        int i = ~b;
        int i2 = this.p;
        if (i < i2) {
            Object[] objArr = this.o;
            if (objArr[i] == q) {
                this.n[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.m && i2 >= this.n.length) {
            c();
            i = ~rf.b(this.n, this.p, j);
        }
        int i3 = this.p;
        if (i3 >= this.n.length) {
            int f = rf.f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.n;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.o;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.n = jArr;
            this.o = objArr2;
        }
        int i4 = this.p;
        if (i4 - i != 0) {
            long[] jArr3 = this.n;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.o;
            System.arraycopy(objArr4, i, objArr4, i5, this.p - i);
        }
        this.n[i] = j;
        this.o[i] = obj;
        this.p++;
    }

    public void i(long j) {
        int b = rf.b(this.n, this.p, j);
        if (b >= 0) {
            Object[] objArr = this.o;
            Object obj = objArr[b];
            Object obj2 = q;
            if (obj != obj2) {
                objArr[b] = obj2;
                this.m = true;
            }
        }
    }

    public void j(int i) {
        Object[] objArr = this.o;
        Object obj = objArr[i];
        Object obj2 = q;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.m = true;
        }
    }

    public int n() {
        if (this.m) {
            c();
        }
        return this.p;
    }

    public Object o(int i) {
        if (this.m) {
            c();
        }
        return this.o[i];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.p * 28);
        sb.append('{');
        for (int i = 0; i < this.p; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(g(i));
            sb.append('=');
            Object o = o(i);
            if (o != this) {
                sb.append(o);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public qa0(int i) {
        this.m = false;
        if (i == 0) {
            this.n = rf.b;
            this.o = rf.c;
            return;
        }
        int f = rf.f(i);
        this.n = new long[f];
        this.o = new Object[f];
    }
}
