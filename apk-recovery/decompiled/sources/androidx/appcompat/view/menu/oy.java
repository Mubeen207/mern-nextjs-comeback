package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.kf;
import androidx.appcompat.view.menu.mf;
import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public class oy extends mf {
    public float w0 = -1.0f;
    public int x0 = -1;
    public int y0 = -1;
    public kf z0 = this.C;
    public int A0 = 0;
    public int B0 = 0;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kf.b.values().length];
            a = iArr;
            try {
                iArr[kf.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[kf.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[kf.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[kf.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[kf.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[kf.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[kf.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[kf.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[kf.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public oy() {
        this.K.clear();
        this.K.add(this.z0);
        int length = this.J.length;
        for (int i = 0; i < length; i++) {
            this.J[i] = this.z0;
        }
    }

    @Override // androidx.appcompat.view.menu.mf
    public void J0(j90 j90Var) {
        if (G() == null) {
            return;
        }
        int x = j90Var.x(this.z0);
        if (this.A0 == 1) {
            F0(x);
            G0(0);
            h0(G().v());
            E0(0);
            return;
        }
        F0(0);
        G0(x);
        E0(G().P());
        h0(0);
    }

    public int K0() {
        return this.A0;
    }

    public int L0() {
        return this.x0;
    }

    public int M0() {
        return this.y0;
    }

    public float N0() {
        return this.w0;
    }

    public void O0(int i) {
        if (i > -1) {
            this.w0 = -1.0f;
            this.x0 = i;
            this.y0 = -1;
        }
    }

    public void P0(int i) {
        if (i > -1) {
            this.w0 = -1.0f;
            this.x0 = -1;
            this.y0 = i;
        }
    }

    public void Q0(float f) {
        if (f > -1.0f) {
            this.w0 = f;
            this.x0 = -1;
            this.y0 = -1;
        }
    }

    public void R0(int i) {
        if (this.A0 == i) {
            return;
        }
        this.A0 = i;
        this.K.clear();
        if (this.A0 == 1) {
            this.z0 = this.B;
        } else {
            this.z0 = this.C;
        }
        this.K.add(this.z0);
        int length = this.J.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.J[i2] = this.z0;
        }
    }

    @Override // androidx.appcompat.view.menu.mf
    public void f(j90 j90Var) {
        nf nfVar = (nf) G();
        if (nfVar == null) {
            return;
        }
        kf m = nfVar.m(kf.b.LEFT);
        kf m2 = nfVar.m(kf.b.RIGHT);
        mf mfVar = this.N;
        boolean z = true;
        boolean z2 = mfVar != null && mfVar.M[0] == mf.b.WRAP_CONTENT;
        if (this.A0 == 0) {
            m = nfVar.m(kf.b.TOP);
            m2 = nfVar.m(kf.b.BOTTOM);
            mf mfVar2 = this.N;
            if (mfVar2 == null || mfVar2.M[1] != mf.b.WRAP_CONTENT) {
                z = false;
            }
            z2 = z;
        }
        if (this.x0 != -1) {
            bw0 q = j90Var.q(this.z0);
            j90Var.e(q, j90Var.q(m), this.x0, 8);
            if (z2) {
                j90Var.h(j90Var.q(m2), q, 0, 5);
            }
        } else if (this.y0 == -1) {
            if (this.w0 != -1.0f) {
                j90Var.d(j90.s(j90Var, j90Var.q(this.z0), j90Var.q(m2), this.w0));
            }
        } else {
            bw0 q2 = j90Var.q(this.z0);
            bw0 q3 = j90Var.q(m2);
            j90Var.e(q2, q3, -this.y0, 8);
            if (z2) {
                j90Var.h(q2, j90Var.q(m), 0, 5);
                j90Var.h(q3, q2, 0, 5);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.mf
    public boolean g() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.mf
    public kf m(kf.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.A0 == 1) {
                    return this.z0;
                }
                break;
            case t02.c.c /* 3 */:
            case 4:
                if (this.A0 == 0) {
                    return this.z0;
                }
                break;
            case t02.c.e /* 5 */:
            case t02.c.f /* 6 */:
            case t02.c.g /* 7 */:
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
