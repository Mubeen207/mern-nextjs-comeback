package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.bw0;
import androidx.appcompat.view.menu.j90;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class p4 implements j90.a {
    public a e;
    public bw0 a = null;
    public float b = 0.0f;
    public boolean c = false;
    public ArrayList d = new ArrayList();
    public boolean f = false;

    /* loaded from: classes.dex */
    public interface a {
        float a(int i);

        void b(bw0 bw0Var, float f, boolean z);

        void c(bw0 bw0Var, float f);

        void clear();

        boolean d(bw0 bw0Var);

        int e();

        float f(p4 p4Var, boolean z);

        float g(bw0 bw0Var);

        float h(bw0 bw0Var, boolean z);

        bw0 i(int i);

        void j(float f);

        void k();
    }

    public p4() {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String A() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.p4.A():java.lang.String");
    }

    public void B(j90 j90Var, bw0 bw0Var, boolean z) {
        if (bw0Var.g) {
            this.b += bw0Var.f * this.e.g(bw0Var);
            this.e.h(bw0Var, z);
            if (z) {
                bw0Var.c(this);
            }
        }
    }

    public void C(p4 p4Var, boolean z) {
        this.b += p4Var.b * this.e.f(p4Var, z);
        if (z) {
            p4Var.a.c(this);
        }
    }

    public void D(j90 j90Var) {
        if (j90Var.f.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int e = this.e.e();
            for (int i = 0; i < e; i++) {
                bw0 i2 = this.e.i(i);
                if (i2.d != -1 || i2.g) {
                    this.d.add(i2);
                }
            }
            if (this.d.size() > 0) {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    bw0 bw0Var = (bw0) it.next();
                    if (bw0Var.g) {
                        B(j90Var, bw0Var, true);
                    } else {
                        C(j90Var.f[bw0Var.d], true);
                    }
                }
                this.d.clear();
            } else {
                z = true;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j90.a
    public void a(bw0 bw0Var) {
        int i = bw0Var.e;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.e.c(bw0Var, f);
    }

    @Override // androidx.appcompat.view.menu.j90.a
    public void b(j90.a aVar) {
        if (aVar instanceof p4) {
            p4 p4Var = (p4) aVar;
            this.a = null;
            this.e.clear();
            for (int i = 0; i < p4Var.e.e(); i++) {
                this.e.b(p4Var.e.i(i), p4Var.e.a(i), true);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j90.a
    public bw0 c(j90 j90Var, boolean[] zArr) {
        return x(zArr, null);
    }

    @Override // androidx.appcompat.view.menu.j90.a
    public void clear() {
        this.e.clear();
        this.a = null;
        this.b = 0.0f;
    }

    public p4 d(j90 j90Var, int i) {
        this.e.c(j90Var.o(i, "ep"), 1.0f);
        this.e.c(j90Var.o(i, "em"), -1.0f);
        return this;
    }

    public p4 e(bw0 bw0Var, int i) {
        this.e.c(bw0Var, i);
        return this;
    }

    public boolean f(j90 j90Var) {
        boolean z;
        bw0 g = g(j90Var);
        if (g == null) {
            z = true;
        } else {
            y(g);
            z = false;
        }
        if (this.e.e() == 0) {
            this.f = true;
        }
        return z;
    }

    public bw0 g(j90 j90Var) {
        boolean v;
        boolean v2;
        int e = this.e.e();
        bw0 bw0Var = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        bw0 bw0Var2 = null;
        for (int i = 0; i < e; i++) {
            float a2 = this.e.a(i);
            bw0 i2 = this.e.i(i);
            if (i2.j == bw0.a.UNRESTRICTED) {
                if (bw0Var == null) {
                    v2 = v(i2, j90Var);
                } else if (f > a2) {
                    v2 = v(i2, j90Var);
                } else if (!z && v(i2, j90Var)) {
                    f = a2;
                    bw0Var = i2;
                    z = true;
                }
                z = v2;
                f = a2;
                bw0Var = i2;
            } else if (bw0Var == null && a2 < 0.0f) {
                if (bw0Var2 == null) {
                    v = v(i2, j90Var);
                } else if (f2 > a2) {
                    v = v(i2, j90Var);
                } else if (!z2 && v(i2, j90Var)) {
                    f2 = a2;
                    bw0Var2 = i2;
                    z2 = true;
                }
                z2 = v;
                f2 = a2;
                bw0Var2 = i2;
            }
        }
        return bw0Var != null ? bw0Var : bw0Var2;
    }

    @Override // androidx.appcompat.view.menu.j90.a
    public bw0 getKey() {
        return this.a;
    }

    public p4 h(bw0 bw0Var, bw0 bw0Var2, int i, float f, bw0 bw0Var3, bw0 bw0Var4, int i2) {
        if (bw0Var2 == bw0Var3) {
            this.e.c(bw0Var, 1.0f);
            this.e.c(bw0Var4, 1.0f);
            this.e.c(bw0Var2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.e.c(bw0Var, 1.0f);
            this.e.c(bw0Var2, -1.0f);
            this.e.c(bw0Var3, -1.0f);
            this.e.c(bw0Var4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            this.e.c(bw0Var, -1.0f);
            this.e.c(bw0Var2, 1.0f);
            this.b = i;
        } else if (f >= 1.0f) {
            this.e.c(bw0Var4, -1.0f);
            this.e.c(bw0Var3, 1.0f);
            this.b = -i2;
        } else {
            float f2 = 1.0f - f;
            this.e.c(bw0Var, f2 * 1.0f);
            this.e.c(bw0Var2, f2 * (-1.0f));
            this.e.c(bw0Var3, (-1.0f) * f);
            this.e.c(bw0Var4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.b = ((-i) * f2) + (i2 * f);
            }
        }
        return this;
    }

    public p4 i(bw0 bw0Var, int i) {
        this.a = bw0Var;
        float f = i;
        bw0Var.f = f;
        this.b = f;
        this.f = true;
        return this;
    }

    public p4 j(bw0 bw0Var, bw0 bw0Var2, float f) {
        this.e.c(bw0Var, -1.0f);
        this.e.c(bw0Var2, f);
        return this;
    }

    public p4 k(bw0 bw0Var, bw0 bw0Var2, bw0 bw0Var3, bw0 bw0Var4, float f) {
        this.e.c(bw0Var, -1.0f);
        this.e.c(bw0Var2, 1.0f);
        this.e.c(bw0Var3, f);
        this.e.c(bw0Var4, -f);
        return this;
    }

    public p4 l(float f, float f2, float f3, bw0 bw0Var, bw0 bw0Var2, bw0 bw0Var3, bw0 bw0Var4) {
        this.b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.e.c(bw0Var, 1.0f);
            this.e.c(bw0Var2, -1.0f);
            this.e.c(bw0Var4, 1.0f);
            this.e.c(bw0Var3, -1.0f);
        } else if (f == 0.0f) {
            this.e.c(bw0Var, 1.0f);
            this.e.c(bw0Var2, -1.0f);
        } else if (f3 == 0.0f) {
            this.e.c(bw0Var3, 1.0f);
            this.e.c(bw0Var4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.e.c(bw0Var, 1.0f);
            this.e.c(bw0Var2, -1.0f);
            this.e.c(bw0Var4, f4);
            this.e.c(bw0Var3, -f4);
        }
        return this;
    }

    public p4 m(bw0 bw0Var, int i) {
        if (i < 0) {
            this.b = i * (-1);
            this.e.c(bw0Var, 1.0f);
        } else {
            this.b = i;
            this.e.c(bw0Var, -1.0f);
        }
        return this;
    }

    public p4 n(bw0 bw0Var, bw0 bw0Var2, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.c(bw0Var, 1.0f);
                this.e.c(bw0Var2, -1.0f);
                return this;
            }
        }
        this.e.c(bw0Var, -1.0f);
        this.e.c(bw0Var2, 1.0f);
        return this;
    }

    public p4 o(bw0 bw0Var, bw0 bw0Var2, bw0 bw0Var3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.c(bw0Var, 1.0f);
                this.e.c(bw0Var2, -1.0f);
                this.e.c(bw0Var3, -1.0f);
                return this;
            }
        }
        this.e.c(bw0Var, -1.0f);
        this.e.c(bw0Var2, 1.0f);
        this.e.c(bw0Var3, 1.0f);
        return this;
    }

    public p4 p(bw0 bw0Var, bw0 bw0Var2, bw0 bw0Var3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.c(bw0Var, 1.0f);
                this.e.c(bw0Var2, -1.0f);
                this.e.c(bw0Var3, 1.0f);
                return this;
            }
        }
        this.e.c(bw0Var, -1.0f);
        this.e.c(bw0Var2, 1.0f);
        this.e.c(bw0Var3, -1.0f);
        return this;
    }

    public p4 q(bw0 bw0Var, bw0 bw0Var2, bw0 bw0Var3, bw0 bw0Var4, float f) {
        this.e.c(bw0Var3, 0.5f);
        this.e.c(bw0Var4, 0.5f);
        this.e.c(bw0Var, -0.5f);
        this.e.c(bw0Var2, -0.5f);
        this.b = -f;
        return this;
    }

    public void r() {
        float f = this.b;
        if (f < 0.0f) {
            this.b = f * (-1.0f);
            this.e.k();
        }
    }

    public boolean s() {
        bw0 bw0Var = this.a;
        return bw0Var != null && (bw0Var.j == bw0.a.UNRESTRICTED || this.b >= 0.0f);
    }

    public boolean t(bw0 bw0Var) {
        return this.e.d(bw0Var);
    }

    public String toString() {
        return A();
    }

    public boolean u() {
        return this.a == null && this.b == 0.0f && this.e.e() == 0;
    }

    public final boolean v(bw0 bw0Var, j90 j90Var) {
        return bw0Var.m <= 1;
    }

    public bw0 w(bw0 bw0Var) {
        return x(null, bw0Var);
    }

    public final bw0 x(boolean[] zArr, bw0 bw0Var) {
        bw0.a aVar;
        int e = this.e.e();
        bw0 bw0Var2 = null;
        float f = 0.0f;
        for (int i = 0; i < e; i++) {
            float a2 = this.e.a(i);
            if (a2 < 0.0f) {
                bw0 i2 = this.e.i(i);
                if ((zArr == null || !zArr[i2.c]) && i2 != bw0Var && (((aVar = i2.j) == bw0.a.SLACK || aVar == bw0.a.ERROR) && a2 < f)) {
                    f = a2;
                    bw0Var2 = i2;
                }
            }
        }
        return bw0Var2;
    }

    public void y(bw0 bw0Var) {
        bw0 bw0Var2 = this.a;
        if (bw0Var2 != null) {
            this.e.c(bw0Var2, -1.0f);
            this.a = null;
        }
        float h = this.e.h(bw0Var, true) * (-1.0f);
        this.a = bw0Var;
        if (h == 1.0f) {
            return;
        }
        this.b /= h;
        this.e.j(h);
    }

    public void z() {
        this.a = null;
        this.e.clear();
        this.b = 0.0f;
        this.f = false;
    }

    public p4(i9 i9Var) {
        this.e = new n4(this, i9Var);
    }
}
