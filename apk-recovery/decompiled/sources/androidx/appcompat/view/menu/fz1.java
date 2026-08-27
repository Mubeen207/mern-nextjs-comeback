package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class fz1 {
    public static volatile int d = 100;
    public int a;
    public int b;
    public boolean c;

    public static long b(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static fz1 c(byte[] bArr, int i, int i2, boolean z) {
        dz1 dz1Var = new dz1(bArr, i2);
        try {
            dz1Var.a(i2);
            return dz1Var;
        } catch (v12 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int a(int i);

    public abstract int d();

    public fz1() {
        this.a = d;
        this.b = Integer.MAX_VALUE;
        this.c = false;
    }
}
