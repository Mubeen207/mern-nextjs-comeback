package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.p4;
import java.util.Arrays;
/* loaded from: classes.dex */
public class cw0 implements p4.a {
    public static float n = 0.001f;
    public final int a = -1;
    public int b = 16;
    public int c = 16;
    public int[] d = new int[16];
    public int[] e = new int[16];
    public int[] f = new int[16];
    public float[] g = new float[16];
    public int[] h = new int[16];
    public int[] i = new int[16];
    public int j = 0;
    public int k = -1;
    public final p4 l;
    public final i9 m;

    public cw0(p4 p4Var, i9 i9Var) {
        this.l = p4Var;
        this.m = i9Var;
        clear();
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public float a(int i) {
        int i2 = this.j;
        int i3 = this.k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.g[i3];
            }
            i3 = this.i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public void b(bw0 bw0Var, float f, boolean z) {
        float f2 = n;
        if (f <= (-f2) || f >= f2) {
            int p = p(bw0Var);
            if (p == -1) {
                c(bw0Var, f);
                return;
            }
            float[] fArr = this.g;
            float f3 = fArr[p] + f;
            fArr[p] = f3;
            float f4 = n;
            if (f3 <= (-f4) || f3 >= f4) {
                return;
            }
            fArr[p] = 0.0f;
            h(bw0Var, z);
        }
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public void c(bw0 bw0Var, float f) {
        float f2 = n;
        if (f > (-f2) && f < f2) {
            h(bw0Var, true);
            return;
        }
        if (this.j == 0) {
            m(0, bw0Var, f);
            l(bw0Var, 0);
            this.k = 0;
            return;
        }
        int p = p(bw0Var);
        if (p != -1) {
            this.g[p] = f;
            return;
        }
        if (this.j + 1 >= this.b) {
            o();
        }
        int i = this.j;
        int i2 = this.k;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.f[i2];
            int i6 = bw0Var.c;
            if (i5 == i6) {
                this.g[i2] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i2;
            }
            i2 = this.i[i2];
            if (i2 == -1) {
                break;
            }
        }
        q(i3, bw0Var, f);
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public void clear() {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            bw0 i3 = i(i2);
            if (i3 != null) {
                i3.c(this.l);
            }
        }
        for (int i4 = 0; i4 < this.b; i4++) {
            this.f[i4] = -1;
            this.e[i4] = -1;
        }
        for (int i5 = 0; i5 < this.c; i5++) {
            this.d[i5] = -1;
        }
        this.j = 0;
        this.k = -1;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public boolean d(bw0 bw0Var) {
        return p(bw0Var) != -1;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public int e() {
        return this.j;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public float f(p4 p4Var, boolean z) {
        float g = g(p4Var.a);
        h(p4Var.a, z);
        cw0 cw0Var = (cw0) p4Var.e;
        int e = cw0Var.e();
        int i = 0;
        int i2 = 0;
        while (i < e) {
            int i3 = cw0Var.f[i2];
            if (i3 != -1) {
                b(this.m.d[i3], cw0Var.g[i2] * g, z);
                i++;
            }
            i2++;
        }
        return g;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public float g(bw0 bw0Var) {
        int p = p(bw0Var);
        if (p != -1) {
            return this.g[p];
        }
        return 0.0f;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public float h(bw0 bw0Var, boolean z) {
        int p = p(bw0Var);
        if (p == -1) {
            return 0.0f;
        }
        r(bw0Var);
        float f = this.g[p];
        if (this.k == p) {
            this.k = this.i[p];
        }
        this.f[p] = -1;
        int[] iArr = this.h;
        int i = iArr[p];
        if (i != -1) {
            int[] iArr2 = this.i;
            iArr2[i] = iArr2[p];
        }
        int i2 = this.i[p];
        if (i2 != -1) {
            iArr[i2] = iArr[p];
        }
        this.j--;
        bw0Var.m--;
        if (z) {
            bw0Var.c(this.l);
        }
        return f;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public bw0 i(int i) {
        int i2 = this.j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.m.d[this.f[i3]];
            }
            i3 = this.i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public void j(float f) {
        int i = this.j;
        int i2 = this.k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public void k() {
        int i = this.j;
        int i2 = this.k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    public final void l(bw0 bw0Var, int i) {
        int[] iArr;
        int i2 = bw0Var.c % this.c;
        int[] iArr2 = this.d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                }
                i3 = i4;
            }
            iArr[i3] = i;
        }
        this.e[i] = -1;
    }

    public final void m(int i, bw0 bw0Var, float f) {
        this.f[i] = bw0Var.c;
        this.g[i] = f;
        this.h[i] = -1;
        this.i[i] = -1;
        bw0Var.a(this.l);
        bw0Var.m++;
        this.j++;
    }

    public final int n() {
        for (int i = 0; i < this.b; i++) {
            if (this.f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    public final void o() {
        int i = this.b * 2;
        this.f = Arrays.copyOf(this.f, i);
        this.g = Arrays.copyOf(this.g, i);
        this.h = Arrays.copyOf(this.h, i);
        this.i = Arrays.copyOf(this.i, i);
        this.e = Arrays.copyOf(this.e, i);
        for (int i2 = this.b; i2 < i; i2++) {
            this.f[i2] = -1;
            this.e[i2] = -1;
        }
        this.b = i;
    }

    public int p(bw0 bw0Var) {
        if (this.j == 0) {
            return -1;
        }
        int i = bw0Var.c;
        int i2 = this.d[i % this.c];
        if (i2 == -1) {
            return -1;
        }
        if (this.f[i2] == i) {
            return i2;
        }
        do {
            i2 = this.e[i2];
            if (i2 == -1) {
                break;
            }
        } while (this.f[i2] != i);
        if (i2 != -1 && this.f[i2] == i) {
            return i2;
        }
        return -1;
    }

    public final void q(int i, bw0 bw0Var, float f) {
        int n2 = n();
        m(n2, bw0Var, f);
        if (i != -1) {
            this.h[n2] = i;
            int[] iArr = this.i;
            iArr[n2] = iArr[i];
            iArr[i] = n2;
        } else {
            this.h[n2] = -1;
            if (this.j > 0) {
                this.i[n2] = this.k;
                this.k = n2;
            } else {
                this.i[n2] = -1;
            }
        }
        int i2 = this.i[n2];
        if (i2 != -1) {
            this.h[i2] = n2;
        }
        l(bw0Var, n2);
    }

    public final void r(bw0 bw0Var) {
        int[] iArr;
        int i;
        int i2 = bw0Var.c;
        int i3 = i2 % this.c;
        int[] iArr2 = this.d;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f[i4] == i2) {
            int[] iArr3 = this.e;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.e;
            i = iArr[i4];
            if (i == -1 || this.f[i] == i2) {
                break;
            }
            i4 = i;
        }
        if (i == -1 || this.f[i] != i2) {
            return;
        }
        iArr[i4] = iArr[i];
        iArr[i] = -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            bw0 i3 = i(i2);
            if (i3 != null) {
                String str2 = str + i3 + " = " + a(i2) + " ";
                int p = p(i3);
                String str3 = str2 + "[p: ";
                String str4 = (this.h[p] != -1 ? str3 + this.m.d[this.f[this.h[p]]] : str3 + "none") + ", n: ";
                str = (this.i[p] != -1 ? str4 + this.m.d[this.f[this.i[p]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
