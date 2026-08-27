package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.bw0;
import androidx.appcompat.view.menu.kf;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public class j90 {
    public static int q = 1000;
    public static boolean r = true;
    public static long s;
    public static long t;
    public a c;
    public p4[] f;
    public final i9 m;
    public a p;
    public int a = 0;
    public HashMap b = null;
    public int d = 32;
    public int e = 32;
    public boolean g = false;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public bw0[] n = new bw0[q];
    public int o = 0;

    /* loaded from: classes.dex */
    public interface a {
        void a(bw0 bw0Var);

        void b(a aVar);

        bw0 c(j90 j90Var, boolean[] zArr);

        void clear();

        bw0 getKey();
    }

    /* loaded from: classes.dex */
    public class b extends p4 {
        public b(i9 i9Var) {
            this.e = new cw0(this, i9Var);
        }
    }

    public j90() {
        this.f = null;
        this.f = new p4[32];
        C();
        i9 i9Var = new i9();
        this.m = i9Var;
        this.c = new xj0(i9Var);
        if (r) {
            this.p = new b(i9Var);
        } else {
            this.p = new p4(i9Var);
        }
    }

    public static p4 s(j90 j90Var, bw0 bw0Var, bw0 bw0Var2, float f) {
        return j90Var.r().j(bw0Var, bw0Var2, f);
    }

    public static sd0 w() {
        return null;
    }

    public void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public final int B(a aVar, boolean z) {
        for (int i = 0; i < this.j; i++) {
            this.i[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2++;
            if (i2 >= this.j * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.i[aVar.getKey().c] = true;
            }
            bw0 c = aVar.c(this, this.i);
            if (c != null) {
                boolean[] zArr = this.i;
                int i3 = c.c;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (c != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.k; i5++) {
                    p4 p4Var = this.f[i5];
                    if (p4Var.a.j != bw0.a.UNRESTRICTED && !p4Var.f && p4Var.t(c)) {
                        float g = p4Var.e.g(c);
                        if (g < 0.0f) {
                            float f2 = (-p4Var.b) / g;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    p4 p4Var2 = this.f[i4];
                    p4Var2.a.d = -1;
                    p4Var2.y(c);
                    bw0 bw0Var = p4Var2.a;
                    bw0Var.d = i4;
                    bw0Var.g(p4Var2);
                }
            } else {
                z2 = true;
            }
        }
        return i2;
    }

    public final void C() {
        int i = 0;
        if (r) {
            while (true) {
                p4[] p4VarArr = this.f;
                if (i >= p4VarArr.length) {
                    return;
                }
                p4 p4Var = p4VarArr[i];
                if (p4Var != null) {
                    this.m.a.a(p4Var);
                }
                this.f[i] = null;
                i++;
            }
        } else {
            while (true) {
                p4[] p4VarArr2 = this.f;
                if (i >= p4VarArr2.length) {
                    return;
                }
                p4 p4Var2 = p4VarArr2[i];
                if (p4Var2 != null) {
                    this.m.b.a(p4Var2);
                }
                this.f[i] = null;
                i++;
            }
        }
    }

    public void D() {
        i9 i9Var;
        int i = 0;
        while (true) {
            i9Var = this.m;
            bw0[] bw0VarArr = i9Var.d;
            if (i >= bw0VarArr.length) {
                break;
            }
            bw0 bw0Var = bw0VarArr[i];
            if (bw0Var != null) {
                bw0Var.d();
            }
            i++;
        }
        i9Var.c.c(this.n, this.o);
        this.o = 0;
        Arrays.fill(this.m.d, (Object) null);
        HashMap hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.a = 0;
        this.c.clear();
        this.j = 1;
        for (int i2 = 0; i2 < this.k; i2++) {
            this.f[i2].c = false;
        }
        C();
        this.k = 0;
        if (r) {
            this.p = new b(this.m);
        } else {
            this.p = new p4(this.m);
        }
    }

    public final bw0 a(bw0.a aVar, String str) {
        bw0 bw0Var = (bw0) this.m.c.b();
        if (bw0Var == null) {
            bw0Var = new bw0(aVar, str);
            bw0Var.f(aVar, str);
        } else {
            bw0Var.d();
            bw0Var.f(aVar, str);
        }
        int i = this.o;
        int i2 = q;
        if (i >= i2) {
            int i3 = i2 * 2;
            q = i3;
            this.n = (bw0[]) Arrays.copyOf(this.n, i3);
        }
        bw0[] bw0VarArr = this.n;
        int i4 = this.o;
        this.o = i4 + 1;
        bw0VarArr[i4] = bw0Var;
        return bw0Var;
    }

    public void b(mf mfVar, mf mfVar2, float f, int i) {
        kf.b bVar = kf.b.LEFT;
        bw0 q2 = q(mfVar.m(bVar));
        kf.b bVar2 = kf.b.TOP;
        bw0 q3 = q(mfVar.m(bVar2));
        kf.b bVar3 = kf.b.RIGHT;
        bw0 q4 = q(mfVar.m(bVar3));
        kf.b bVar4 = kf.b.BOTTOM;
        bw0 q5 = q(mfVar.m(bVar4));
        bw0 q6 = q(mfVar2.m(bVar));
        bw0 q7 = q(mfVar2.m(bVar2));
        bw0 q8 = q(mfVar2.m(bVar3));
        bw0 q9 = q(mfVar2.m(bVar4));
        p4 r2 = r();
        double d = f;
        double d2 = i;
        r2.q(q3, q5, q7, q9, (float) (Math.sin(d) * d2));
        d(r2);
        p4 r3 = r();
        r3.q(q2, q4, q6, q8, (float) (Math.cos(d) * d2));
        d(r3);
    }

    public void c(bw0 bw0Var, bw0 bw0Var2, int i, float f, bw0 bw0Var3, bw0 bw0Var4, int i2, int i3) {
        p4 r2 = r();
        r2.h(bw0Var, bw0Var2, i, f, bw0Var3, bw0Var4, i2);
        if (i3 != 8) {
            r2.d(this, i3);
        }
        d(r2);
    }

    public void d(p4 p4Var) {
        bw0 w;
        if (p4Var == null) {
            return;
        }
        boolean z = true;
        if (this.k + 1 >= this.l || this.j + 1 >= this.e) {
            y();
        }
        if (!p4Var.f) {
            p4Var.D(this);
            if (p4Var.u()) {
                return;
            }
            p4Var.r();
            if (p4Var.f(this)) {
                bw0 p = p();
                p4Var.a = p;
                l(p4Var);
                this.p.b(p4Var);
                B(this.p, true);
                if (p.d == -1) {
                    if (p4Var.a == p && (w = p4Var.w(p)) != null) {
                        p4Var.y(w);
                    }
                    if (!p4Var.f) {
                        p4Var.a.g(p4Var);
                    }
                    this.k--;
                }
            } else {
                z = false;
            }
            if (!p4Var.s() || z) {
                return;
            }
        }
        l(p4Var);
    }

    public p4 e(bw0 bw0Var, bw0 bw0Var2, int i, int i2) {
        if (i2 == 8 && bw0Var2.g && bw0Var.d == -1) {
            bw0Var.e(this, bw0Var2.f + i);
            return null;
        }
        p4 r2 = r();
        r2.n(bw0Var, bw0Var2, i);
        if (i2 != 8) {
            r2.d(this, i2);
        }
        d(r2);
        return r2;
    }

    public void f(bw0 bw0Var, int i) {
        int i2 = bw0Var.d;
        if (i2 == -1) {
            bw0Var.e(this, i);
        } else if (i2 == -1) {
            p4 r2 = r();
            r2.i(bw0Var, i);
            d(r2);
        } else {
            p4 p4Var = this.f[i2];
            if (p4Var.f) {
                p4Var.b = i;
            } else if (p4Var.e.e() == 0) {
                p4Var.f = true;
                p4Var.b = i;
            } else {
                p4 r3 = r();
                r3.m(bw0Var, i);
                d(r3);
            }
        }
    }

    public void g(bw0 bw0Var, bw0 bw0Var2, int i, boolean z) {
        p4 r2 = r();
        bw0 t2 = t();
        t2.e = 0;
        r2.o(bw0Var, bw0Var2, t2, i);
        d(r2);
    }

    public void h(bw0 bw0Var, bw0 bw0Var2, int i, int i2) {
        p4 r2 = r();
        bw0 t2 = t();
        t2.e = 0;
        r2.o(bw0Var, bw0Var2, t2, i);
        if (i2 != 8) {
            m(r2, (int) (r2.e.g(t2) * (-1.0f)), i2);
        }
        d(r2);
    }

    public void i(bw0 bw0Var, bw0 bw0Var2, int i, boolean z) {
        p4 r2 = r();
        bw0 t2 = t();
        t2.e = 0;
        r2.p(bw0Var, bw0Var2, t2, i);
        d(r2);
    }

    public void j(bw0 bw0Var, bw0 bw0Var2, int i, int i2) {
        p4 r2 = r();
        bw0 t2 = t();
        t2.e = 0;
        r2.p(bw0Var, bw0Var2, t2, i);
        if (i2 != 8) {
            m(r2, (int) (r2.e.g(t2) * (-1.0f)), i2);
        }
        d(r2);
    }

    public void k(bw0 bw0Var, bw0 bw0Var2, bw0 bw0Var3, bw0 bw0Var4, float f, int i) {
        p4 r2 = r();
        r2.k(bw0Var, bw0Var2, bw0Var3, bw0Var4, f);
        if (i != 8) {
            r2.d(this, i);
        }
        d(r2);
    }

    public final void l(p4 p4Var) {
        if (r) {
            p4 p4Var2 = this.f[this.k];
            if (p4Var2 != null) {
                this.m.a.a(p4Var2);
            }
        } else {
            p4 p4Var3 = this.f[this.k];
            if (p4Var3 != null) {
                this.m.b.a(p4Var3);
            }
        }
        p4[] p4VarArr = this.f;
        int i = this.k;
        p4VarArr[i] = p4Var;
        bw0 bw0Var = p4Var.a;
        bw0Var.d = i;
        this.k = i + 1;
        bw0Var.g(p4Var);
    }

    public void m(p4 p4Var, int i, int i2) {
        p4Var.e(o(i2, null), i);
    }

    public final void n() {
        for (int i = 0; i < this.k; i++) {
            p4 p4Var = this.f[i];
            p4Var.a.f = p4Var.b;
        }
    }

    public bw0 o(int i, String str) {
        if (this.j + 1 >= this.e) {
            y();
        }
        bw0 a2 = a(bw0.a.ERROR, str);
        int i2 = this.a + 1;
        this.a = i2;
        this.j++;
        a2.c = i2;
        a2.e = i;
        this.m.d[i2] = a2;
        this.c.a(a2);
        return a2;
    }

    public bw0 p() {
        if (this.j + 1 >= this.e) {
            y();
        }
        bw0 a2 = a(bw0.a.SLACK, null);
        int i = this.a + 1;
        this.a = i;
        this.j++;
        a2.c = i;
        this.m.d[i] = a2;
        return a2;
    }

    public bw0 q(Object obj) {
        bw0 bw0Var = null;
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.e) {
            y();
        }
        if (obj instanceof kf) {
            kf kfVar = (kf) obj;
            bw0Var = kfVar.f();
            if (bw0Var == null) {
                kfVar.m(this.m);
                bw0Var = kfVar.f();
            }
            int i = bw0Var.c;
            if (i == -1 || i > this.a || this.m.d[i] == null) {
                if (i != -1) {
                    bw0Var.d();
                }
                int i2 = this.a + 1;
                this.a = i2;
                this.j++;
                bw0Var.c = i2;
                bw0Var.j = bw0.a.UNRESTRICTED;
                this.m.d[i2] = bw0Var;
            }
        }
        return bw0Var;
    }

    public p4 r() {
        p4 p4Var;
        if (r) {
            p4Var = (p4) this.m.a.b();
            if (p4Var == null) {
                p4Var = new b(this.m);
                t++;
            } else {
                p4Var.z();
            }
        } else {
            p4Var = (p4) this.m.b.b();
            if (p4Var == null) {
                p4Var = new p4(this.m);
                s++;
            } else {
                p4Var.z();
            }
        }
        bw0.b();
        return p4Var;
    }

    public bw0 t() {
        if (this.j + 1 >= this.e) {
            y();
        }
        bw0 a2 = a(bw0.a.SLACK, null);
        int i = this.a + 1;
        this.a = i;
        this.j++;
        a2.c = i;
        this.m.d[i] = a2;
        return a2;
    }

    public final int u(a aVar) {
        for (int i = 0; i < this.k; i++) {
            p4 p4Var = this.f[i];
            if (p4Var.a.j != bw0.a.UNRESTRICTED && p4Var.b < 0.0f) {
                boolean z = false;
                int i2 = 0;
                while (!z) {
                    i2++;
                    float f = Float.MAX_VALUE;
                    int i3 = -1;
                    int i4 = -1;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i5 >= this.k) {
                            break;
                        }
                        p4 p4Var2 = this.f[i5];
                        if (p4Var2.a.j != bw0.a.UNRESTRICTED && !p4Var2.f && p4Var2.b < 0.0f) {
                            for (int i7 = 1; i7 < this.j; i7++) {
                                bw0 bw0Var = this.m.d[i7];
                                float g = p4Var2.e.g(bw0Var);
                                if (g > 0.0f) {
                                    for (int i8 = 0; i8 < 9; i8++) {
                                        float f2 = bw0Var.h[i8] / g;
                                        if ((f2 < f && i8 == i6) || i8 > i6) {
                                            f = f2;
                                            i3 = i5;
                                            i4 = i7;
                                            i6 = i8;
                                        }
                                    }
                                }
                            }
                        }
                        i5++;
                    }
                    if (i3 != -1) {
                        p4 p4Var3 = this.f[i3];
                        p4Var3.a.d = -1;
                        p4Var3.y(this.m.d[i4]);
                        bw0 bw0Var2 = p4Var3.a;
                        bw0Var2.d = i3;
                        bw0Var2.g(p4Var3);
                    } else {
                        z = true;
                    }
                    if (i2 > this.j / 2) {
                        z = true;
                    }
                }
                return i2;
            }
        }
        return 0;
    }

    public i9 v() {
        return this.m;
    }

    public int x(Object obj) {
        bw0 f = ((kf) obj).f();
        if (f != null) {
            return (int) (f.f + 0.5f);
        }
        return 0;
    }

    public final void y() {
        int i = this.d * 2;
        this.d = i;
        this.f = (p4[]) Arrays.copyOf(this.f, i);
        i9 i9Var = this.m;
        i9Var.d = (bw0[]) Arrays.copyOf(i9Var.d, this.d);
        int i2 = this.d;
        this.i = new boolean[i2];
        this.e = i2;
        this.l = i2;
    }

    public void z() {
        if (!this.g && !this.h) {
            A(this.c);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.f[i].f) {
                A(this.c);
                return;
            }
        }
        n();
    }
}
