package androidx.appcompat.view.menu;

import java.util.Arrays;
import java.util.HashSet;
/* loaded from: classes.dex */
public class bw0 {
    public static int o = 1;
    public boolean a;
    public String b;
    public float f;
    public a j;
    public int c = -1;
    public int d = -1;
    public int e = 0;
    public boolean g = false;
    public float[] h = new float[9];
    public float[] i = new float[9];
    public p4[] k = new p4[16];
    public int l = 0;
    public int m = 0;
    public HashSet n = null;

    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public bw0(a aVar, String str) {
        this.j = aVar;
    }

    public static void b() {
        o++;
    }

    public final void a(p4 p4Var) {
        int i = 0;
        while (true) {
            int i2 = this.l;
            if (i >= i2) {
                p4[] p4VarArr = this.k;
                if (i2 >= p4VarArr.length) {
                    this.k = (p4[]) Arrays.copyOf(p4VarArr, p4VarArr.length * 2);
                }
                p4[] p4VarArr2 = this.k;
                int i3 = this.l;
                p4VarArr2[i3] = p4Var;
                this.l = i3 + 1;
                return;
            } else if (this.k[i] == p4Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void c(p4 p4Var) {
        int i = this.l;
        int i2 = 0;
        while (i2 < i) {
            if (this.k[i2] == p4Var) {
                while (i2 < i - 1) {
                    p4[] p4VarArr = this.k;
                    int i3 = i2 + 1;
                    p4VarArr[i2] = p4VarArr[i3];
                    i2 = i3;
                }
                this.l--;
                return;
            }
            i2++;
        }
    }

    public void d() {
        this.b = null;
        this.j = a.UNKNOWN;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2] = null;
        }
        this.l = 0;
        this.m = 0;
        this.a = false;
        Arrays.fill(this.i, 0.0f);
    }

    public void e(j90 j90Var, float f) {
        this.f = f;
        this.g = true;
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].B(j90Var, this, false);
        }
        this.l = 0;
    }

    public void f(a aVar, String str) {
        this.j = aVar;
    }

    public final void g(p4 p4Var) {
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].C(p4Var, false);
        }
        this.l = 0;
    }

    public String toString() {
        if (this.b != null) {
            return "" + this.b;
        }
        return "" + this.c;
    }
}
