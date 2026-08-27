package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.p4;
import java.util.Arrays;
/* loaded from: classes.dex */
public class n4 implements p4.a {
    public static float l = 0.001f;
    public final p4 b;
    public final i9 c;
    public int a = 0;
    public int d = 8;
    public bw0 e = null;
    public int[] f = new int[8];
    public int[] g = new int[8];
    public float[] h = new float[8];
    public int i = -1;
    public int j = -1;
    public boolean k = false;

    public n4(p4 p4Var, i9 i9Var) {
        this.b = p4Var;
        this.c = i9Var;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public float a(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.h[i2];
            }
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public void b(bw0 bw0Var, float f, boolean z) {
        float f2 = l;
        if (f <= (-f2) || f >= f2) {
            int i = this.i;
            if (i == -1) {
                this.i = 0;
                this.h[0] = f;
                this.f[0] = bw0Var.c;
                this.g[0] = -1;
                bw0Var.m++;
                bw0Var.a(this.b);
                this.a++;
                if (this.k) {
                    return;
                }
                int i2 = this.j + 1;
                this.j = i2;
                int[] iArr = this.f;
                if (i2 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
                int i5 = this.f[i];
                int i6 = bw0Var.c;
                if (i5 == i6) {
                    float[] fArr = this.h;
                    float f3 = fArr[i] + f;
                    float f4 = l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.i) {
                            this.i = this.g[i];
                        } else {
                            int[] iArr2 = this.g;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            bw0Var.c(this.b);
                        }
                        if (this.k) {
                            this.j = i;
                        }
                        bw0Var.m--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.g[i];
            }
            int i7 = this.j;
            int i8 = i7 + 1;
            if (this.k) {
                int[] iArr3 = this.f;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f;
            if (i7 >= iArr4.length && this.a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f;
                    if (i9 >= iArr5.length) {
                        break;
                    } else if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr6 = this.f;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.k = false;
                this.j = i7 - 1;
                this.h = Arrays.copyOf(this.h, i10);
                this.f = Arrays.copyOf(this.f, this.d);
                this.g = Arrays.copyOf(this.g, this.d);
            }
            this.f[i7] = bw0Var.c;
            this.h[i7] = f;
            if (i3 != -1) {
                int[] iArr7 = this.g;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.g[i7] = this.i;
                this.i = i7;
            }
            bw0Var.m++;
            bw0Var.a(this.b);
            this.a++;
            if (!this.k) {
                this.j++;
            }
            int i11 = this.j;
            int[] iArr8 = this.f;
            if (i11 >= iArr8.length) {
                this.k = true;
                this.j = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public final void c(bw0 bw0Var, float f) {
        if (f == 0.0f) {
            h(bw0Var, true);
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = bw0Var.c;
            this.g[0] = -1;
            bw0Var.m++;
            bw0Var.a(this.b);
            this.a++;
            if (this.k) {
                return;
            }
            int i2 = this.j + 1;
            this.j = i2;
            int[] iArr = this.f;
            if (i2 >= iArr.length) {
                this.k = true;
                this.j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int i5 = this.f[i];
            int i6 = bw0Var.c;
            if (i5 == i6) {
                this.h[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.g[i];
        }
        int i7 = this.j;
        int i8 = i7 + 1;
        if (this.k) {
            int[] iArr2 = this.f;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f;
        if (i7 >= iArr3.length && this.a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.k = false;
            this.j = i7 - 1;
            this.h = Arrays.copyOf(this.h, i10);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[i7] = bw0Var.c;
        this.h[i7] = f;
        if (i3 != -1) {
            int[] iArr6 = this.g;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.g[i7] = this.i;
            this.i = i7;
        }
        bw0Var.m++;
        bw0Var.a(this.b);
        int i11 = this.a + 1;
        this.a = i11;
        if (!this.k) {
            this.j++;
        }
        int[] iArr7 = this.f;
        if (i11 >= iArr7.length) {
            this.k = true;
        }
        if (this.j >= iArr7.length) {
            this.k = true;
            this.j = iArr7.length - 1;
        }
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public final void clear() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            bw0 bw0Var = this.c.d[this.f[i]];
            if (bw0Var != null) {
                bw0Var.c(this.b);
            }
            i = this.g[i];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public boolean d(bw0 bw0Var) {
        int i = this.i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.f[i] == bw0Var.c) {
                return true;
            }
            i = this.g[i];
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public int e() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public float f(p4 p4Var, boolean z) {
        float g = g(p4Var.a);
        h(p4Var.a, z);
        p4.a aVar = p4Var.e;
        int e = aVar.e();
        for (int i = 0; i < e; i++) {
            bw0 i2 = aVar.i(i);
            b(i2, aVar.g(i2) * g, z);
        }
        return g;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public final float g(bw0 bw0Var) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.f[i] == bw0Var.c) {
                return this.h[i];
            }
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public final float h(bw0 bw0Var, boolean z) {
        if (this.e == bw0Var) {
            this.e = null;
        }
        int i = this.i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.f[i] == bw0Var.c) {
                if (i == this.i) {
                    this.i = this.g[i];
                } else {
                    int[] iArr = this.g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    bw0Var.c(this.b);
                }
                bw0Var.m--;
                this.a--;
                this.f[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.h[i];
            }
            i2++;
            i3 = i;
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public bw0 i(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.c.d[this.f[i2]];
            }
            i2 = this.g[i2];
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public void j(float f) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] / f;
            i = this.g[i];
        }
    }

    @Override // androidx.appcompat.view.menu.p4.a
    public void k() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.g[i];
        }
    }

    public String toString() {
        int i = this.i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            str = ((str + " -> ") + this.h[i] + " : ") + this.c.d[this.f[i]];
            i = this.g[i];
        }
        return str;
    }
}
