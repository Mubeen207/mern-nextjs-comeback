package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class dz1 extends fz1 {
    public final byte[] e;
    public final boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    @Override // androidx.appcompat.view.menu.fz1
    public final int a(int i) {
        if (i >= 0) {
            int d = i + d();
            if (d >= 0) {
                int i2 = this.k;
                if (d <= i2) {
                    this.k = d;
                    f();
                    return i2;
                }
                throw v12.f();
            }
            throw v12.e();
        }
        throw v12.d();
    }

    @Override // androidx.appcompat.view.menu.fz1
    public final int d() {
        return this.i - this.j;
    }

    public final void f() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = i - this.j;
        int i3 = this.k;
        if (i2 <= i3) {
            this.h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.h = i4;
        this.g = i - i4;
    }

    public dz1(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.k = Integer.MAX_VALUE;
        this.e = bArr;
        this.g = i2 + i;
        this.i = i;
        this.j = i;
        this.f = z;
    }
}
