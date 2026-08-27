package androidx.appcompat.view.menu;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class g72 {
    public static final g72 f = new g72(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public g72() {
        this(0, new int[8], new Object[8], true);
    }

    public static g72 c(g72 g72Var, g72 g72Var2) {
        int i = g72Var.a + g72Var2.a;
        int[] copyOf = Arrays.copyOf(g72Var.b, i);
        System.arraycopy(g72Var2.b, 0, copyOf, g72Var.a, g72Var2.a);
        Object[] copyOf2 = Arrays.copyOf(g72Var.c, i);
        System.arraycopy(g72Var2.c, 0, copyOf2, g72Var.a, g72Var2.a);
        return new g72(i, copyOf, copyOf2, true);
    }

    public static void f(int i, Object obj, g92 g92Var) {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            g92Var.i(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            g92Var.M(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            g92Var.x(i2, (tx1) obj);
        } else if (i3 != 3) {
            if (i3 != 5) {
                throw new RuntimeException(v12.a());
            }
            g92Var.k(i2, ((Integer) obj).intValue());
        } else if (g92Var.a() == m92.a) {
            g92Var.j(i2);
            ((g72) obj).j(g92Var);
            g92Var.e(i2);
        } else {
            g92Var.e(i2);
            ((g72) obj).j(g92Var);
            g92Var.j(i2);
        }
    }

    public static g72 k() {
        return f;
    }

    public static g72 l() {
        return new g72();
    }

    public final int a() {
        int m0;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                m0 = mz1.m0(i5, ((Long) this.c[i3]).longValue());
            } else if (i6 == 1) {
                m0 = mz1.P(i5, ((Long) this.c[i3]).longValue());
            } else if (i6 == 2) {
                m0 = mz1.Q(i5, (tx1) this.c[i3]);
            } else if (i6 == 3) {
                m0 = (mz1.s0(i5) << 1) + ((g72) this.c[i3]).a();
            } else if (i6 != 5) {
                throw new IllegalStateException(v12.a());
            } else {
                m0 = mz1.h0(i5, ((Integer) this.c[i3]).intValue());
            }
            i2 += m0;
        }
        this.d = i2;
        return i2;
    }

    public final g72 b(g72 g72Var) {
        if (g72Var.equals(f)) {
            return this;
        }
        n();
        int i = this.a + g72Var.a;
        d(i);
        System.arraycopy(g72Var.b, 0, this.b, this.a, g72Var.a);
        System.arraycopy(g72Var.c, 0, this.c, this.a, g72Var.a);
        this.a = i;
        return this;
    }

    public final void d(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final void e(int i, Object obj) {
        n();
        d(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g72)) {
            g72 g72Var = (g72) obj;
            int i = this.a;
            if (i == g72Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = g72Var.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.c;
                        Object[] objArr2 = g72Var.c;
                        int i3 = this.a;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    } else if (iArr[i2] != iArr2[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final void g(g92 g92Var) {
        if (g92Var.a() == m92.b) {
            for (int i = this.a - 1; i >= 0; i--) {
                g92Var.t(this.b[i] >>> 3, this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            g92Var.t(this.b[i2] >>> 3, this.c[i2]);
        }
    }

    public final void h(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            j42.d(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int i() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2 += mz1.Z(this.b[i3] >>> 3, (tx1) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    public final void j(g92 g92Var) {
        if (this.a == 0) {
            return;
        }
        if (g92Var.a() == m92.a) {
            for (int i = 0; i < this.a; i++) {
                f(this.b[i], this.c[i], g92Var);
            }
            return;
        }
        for (int i2 = this.a - 1; i2 >= 0; i2--) {
            f(this.b[i2], this.c[i2], g92Var);
        }
    }

    public final void m() {
        if (this.e) {
            this.e = false;
        }
    }

    public final void n() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public g72(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
