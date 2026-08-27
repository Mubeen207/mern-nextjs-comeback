package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class mz1 extends vx1 {
    public static final Logger b = Logger.getLogger(mz1.class.getName());
    public static final boolean c = z72.w();
    public sz1 a;

    /* loaded from: classes.dex */
    public static class a extends mz1 {
        public final byte[] d;
        public final int e;
        public final int f;
        public int g;

        public a(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i2) | i2) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.d = bArr;
            this.e = 0;
            this.g = 0;
            this.f = i2;
        }

        public final void A0(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.d, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)), e);
            }
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void H(int i) {
            if (i >= 0) {
                U(i);
            } else {
                N(i);
            }
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void K(int i, int i2) {
            V(i, 0);
            H(i2);
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void L(int i, long j) {
            V(i, 0);
            N(j);
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void M(int i, tx1 tx1Var) {
            V(1, 3);
            b0(2, i);
            n(3, tx1Var);
            V(1, 4);
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void N(long j) {
            if (mz1.c && b() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.d;
                    int i = this.g;
                    this.g = i + 1;
                    z72.m(bArr, i, (byte) ((((int) j) & 127) | PackageParser.PARSE_IS_PRIVILEGED));
                    j >>>= 7;
                }
                byte[] bArr2 = this.d;
                int i2 = this.g;
                this.g = i2 + 1;
                z72.m(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | PackageParser.PARSE_IS_PRIVILEGED);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
                }
            }
            byte[] bArr4 = this.d;
            int i4 = this.g;
            this.g = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void U(int i) {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.d;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | PackageParser.PARSE_IS_PRIVILEGED);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
                }
            }
            byte[] bArr2 = this.d;
            int i3 = this.g;
            this.g = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void V(int i, int i2) {
            U((i << 3) | i2);
        }

        @Override // androidx.appcompat.view.menu.vx1
        public final void a(byte[] bArr, int i, int i2) {
            A0(bArr, i, i2);
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final int b() {
            return this.f - this.g;
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void b0(int i, int i2) {
            V(i, 0);
            U(i2);
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void j(byte b) {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void k(int i) {
            try {
                byte[] bArr = this.d;
                int i2 = this.g;
                bArr[i2] = (byte) i;
                bArr[i2 + 1] = (byte) (i >> 8);
                bArr[i2 + 2] = (byte) (i >> 16);
                this.g = i2 + 4;
                bArr[i2 + 3] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void l(int i, int i2) {
            V(i, 5);
            k(i2);
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void m(int i, long j) {
            V(i, 1);
            s(j);
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void n(int i, tx1 tx1Var) {
            V(i, 2);
            t(tx1Var);
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void o(int i, z32 z32Var) {
            V(1, 3);
            b0(2, i);
            V(3, 2);
            u(z32Var);
            V(1, 4);
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void p(int i, z32 z32Var, m52 m52Var) {
            V(i, 2);
            U(((dx1) z32Var).e(m52Var));
            m52Var.g(z32Var, this.a);
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void q(int i, String str) {
            V(i, 2);
            v(str);
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void r(int i, boolean z) {
            V(i, 0);
            j(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void s(long j) {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                bArr[i] = (byte) j;
                bArr[i + 1] = (byte) (j >> 8);
                bArr[i + 2] = (byte) (j >> 16);
                bArr[i + 3] = (byte) (j >> 24);
                bArr[i + 4] = (byte) (j >> 32);
                bArr[i + 5] = (byte) (j >> 40);
                bArr[i + 6] = (byte) (j >> 48);
                this.g = i + 8;
                bArr[i + 7] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void t(tx1 tx1Var) {
            U(tx1Var.t());
            tx1Var.r(this);
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void u(z32 z32Var) {
            U(z32Var.a());
            z32Var.c(this);
        }

        @Override // androidx.appcompat.view.menu.mz1
        public final void v(String str) {
            int i = this.g;
            try {
                int v0 = mz1.v0(str.length() * 3);
                int v02 = mz1.v0(str.length());
                if (v02 != v0) {
                    U(c82.a(str));
                    this.g = c82.b(str, this.d, this.g, b());
                    return;
                }
                int i2 = i + v02;
                this.g = i2;
                int b = c82.b(str, this.d, i2, b());
                this.g = i;
                U((b - i) - v02);
                this.g = b;
            } catch (i82 e) {
                this.g = i;
                w(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends IOException {
        public b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public b(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static int A(tx1 tx1Var) {
        int t = tx1Var.t();
        return v0(t) + t;
    }

    public static int B(z32 z32Var) {
        return z32Var.a();
    }

    public static int C(String str) {
        int length;
        try {
            length = c82.a(str);
        } catch (i82 unused) {
            length = str.getBytes(y02.b).length;
        }
        return v0(length) + length;
    }

    public static mz1 D(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int P(int i, long j) {
        return v0(i << 3) + 8;
    }

    public static int Q(int i, tx1 tx1Var) {
        int v0 = v0(i << 3);
        int t = tx1Var.t();
        return v0 + v0(t) + t;
    }

    public static int R(int i, z32 z32Var, m52 m52Var) {
        return v0(i << 3) + g(z32Var, m52Var);
    }

    public static int S(long j) {
        return 8;
    }

    public static int T(z32 z32Var) {
        int a2 = z32Var.a();
        return v0(a2) + a2;
    }

    public static int X(int i) {
        return g0(i);
    }

    public static int Y(int i, long j) {
        return v0(i << 3) + n0(j);
    }

    public static int Z(int i, tx1 tx1Var) {
        return (v0(8) << 1) + w0(2, i) + Q(3, tx1Var);
    }

    public static int a0(long j) {
        return n0(j);
    }

    public static int c(double d) {
        return 8;
    }

    public static int c0(int i) {
        return 4;
    }

    public static int d(float f) {
        return 4;
    }

    public static int d0(int i, int i2) {
        return v0(i << 3) + g0(i2);
    }

    public static int e(int i, double d) {
        return v0(i << 3) + 8;
    }

    public static int e0(int i, long j) {
        return v0(i << 3) + 8;
    }

    public static int f(int i, float f) {
        return v0(i << 3) + 4;
    }

    public static int f0(long j) {
        return 8;
    }

    public static int g(z32 z32Var, m52 m52Var) {
        int e = ((dx1) z32Var).e(m52Var);
        return v0(e) + e;
    }

    public static int g0(int i) {
        if (i >= 0) {
            return v0(i);
        }
        return 10;
    }

    public static int h(boolean z) {
        return 1;
    }

    public static int h0(int i, int i2) {
        return v0(i << 3) + 4;
    }

    public static int i(byte[] bArr) {
        int length = bArr.length;
        return v0(length) + length;
    }

    public static int i0(int i, long j) {
        return v0(i << 3) + n0(u0(j));
    }

    public static int j0(long j) {
        return n0(u0(j));
    }

    public static int k0(int i) {
        return 4;
    }

    public static int l0(int i, int i2) {
        return v0(i << 3) + g0(i2);
    }

    public static int m0(int i, long j) {
        return v0(i << 3) + n0(j);
    }

    public static int n0(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int o0(int i) {
        return v0(z0(i));
    }

    public static int p0(int i, int i2) {
        return v0(i << 3) + 4;
    }

    public static int s0(int i) {
        return v0(i << 3);
    }

    public static int t0(int i, int i2) {
        return v0(i << 3) + v0(z0(i2));
    }

    public static long u0(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int v0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int w0(int i, int i2) {
        return v0(i << 3) + v0(i2);
    }

    public static int x(int i, z32 z32Var, m52 m52Var) {
        return (v0(i << 3) << 1) + ((dx1) z32Var).e(m52Var);
    }

    public static int y(int i, String str) {
        return v0(i << 3) + C(str);
    }

    public static int z(int i, boolean z) {
        return v0(i << 3) + 1;
    }

    public static int z0(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public final void E() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void F(double d) {
        s(Double.doubleToRawLongBits(d));
    }

    public final void G(float f) {
        k(Float.floatToRawIntBits(f));
    }

    public abstract void H(int i);

    public final void I(int i, double d) {
        m(i, Double.doubleToRawLongBits(d));
    }

    public final void J(int i, float f) {
        l(i, Float.floatToRawIntBits(f));
    }

    public abstract void K(int i, int i2);

    public abstract void L(int i, long j);

    public abstract void M(int i, tx1 tx1Var);

    public abstract void N(long j);

    public final void O(boolean z) {
        j(z ? (byte) 1 : (byte) 0);
    }

    public abstract void U(int i);

    public abstract void V(int i, int i2);

    public abstract int b();

    public abstract void b0(int i, int i2);

    public abstract void j(byte b2);

    public abstract void k(int i);

    public abstract void l(int i, int i2);

    public abstract void m(int i, long j);

    public abstract void n(int i, tx1 tx1Var);

    public abstract void o(int i, z32 z32Var);

    public abstract void p(int i, z32 z32Var, m52 m52Var);

    public abstract void q(int i, String str);

    public final void q0(int i, long j) {
        L(i, u0(j));
    }

    public abstract void r(int i, boolean z);

    public final void r0(long j) {
        N(u0(j));
    }

    public abstract void s(long j);

    public abstract void t(tx1 tx1Var);

    public abstract void u(z32 z32Var);

    public abstract void v(String str);

    public final void w(String str, i82 i82Var) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) i82Var);
        byte[] bytes = str.getBytes(y02.b);
        try {
            U(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new b(e);
        }
    }

    public final void x0(int i) {
        U(z0(i));
    }

    public final void y0(int i, int i2) {
        b0(i, z0(i2));
    }

    public mz1() {
    }
}
