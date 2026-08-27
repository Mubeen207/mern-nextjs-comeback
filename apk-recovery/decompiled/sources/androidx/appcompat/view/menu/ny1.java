package androidx.appcompat.view.menu;

import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class ny1 extends py1 {
    public final byte[] q;

    public ny1(byte[] bArr) {
        bArr.getClass();
        this.q = bArr;
    }

    @Override // androidx.appcompat.view.menu.tx1
    public byte d(int i) {
        return this.q[i];
    }

    @Override // androidx.appcompat.view.menu.tx1
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof tx1) && t() == ((tx1) obj).t()) {
            if (t() == 0) {
                return true;
            }
            if (obj instanceof ny1) {
                ny1 ny1Var = (ny1) obj;
                int f = f();
                int f2 = ny1Var.f();
                if (f == 0 || f2 == 0 || f == f2) {
                    return y(ny1Var, 0, t());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.tx1
    public final tx1 i(int i, int i2) {
        int h = tx1.h(0, i2, t());
        return h == 0 ? tx1.n : new by1(this.q, z(), h);
    }

    @Override // androidx.appcompat.view.menu.tx1
    public final String p(Charset charset) {
        return new String(this.q, z(), t(), charset);
    }

    @Override // androidx.appcompat.view.menu.tx1
    public final void r(vx1 vx1Var) {
        vx1Var.a(this.q, z(), t());
    }

    @Override // androidx.appcompat.view.menu.tx1
    public byte s(int i) {
        return this.q[i];
    }

    @Override // androidx.appcompat.view.menu.tx1
    public int t() {
        return this.q.length;
    }

    @Override // androidx.appcompat.view.menu.tx1
    public final int u(int i, int i2, int i3) {
        return y02.a(i, this.q, z(), i3);
    }

    @Override // androidx.appcompat.view.menu.tx1
    public final boolean x() {
        int z = z();
        return c82.f(this.q, z, t() + z);
    }

    @Override // androidx.appcompat.view.menu.py1
    public final boolean y(tx1 tx1Var, int i, int i2) {
        if (i2 > tx1Var.t()) {
            int t = t();
            throw new IllegalArgumentException("Length too large: " + i2 + t);
        } else if (i2 > tx1Var.t()) {
            int t2 = tx1Var.t();
            throw new IllegalArgumentException("Ran off end of other: 0, " + i2 + ", " + t2);
        } else if (tx1Var instanceof ny1) {
            ny1 ny1Var = (ny1) tx1Var;
            byte[] bArr = this.q;
            byte[] bArr2 = ny1Var.q;
            int z = z() + i2;
            int z2 = z();
            int z3 = ny1Var.z();
            while (z2 < z) {
                if (bArr[z2] != bArr2[z3]) {
                    return false;
                }
                z2++;
                z3++;
            }
            return true;
        } else {
            return tx1Var.i(0, i2).equals(i(0, i2));
        }
    }

    public int z() {
        return 0;
    }
}
