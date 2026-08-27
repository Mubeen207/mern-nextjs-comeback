package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.e8;
import androidx.appcompat.view.menu.mf;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes.dex */
public class nf extends a81 {
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public e8 x0 = new e8(this);
    public ml y0 = new ml(this);
    public e8.b z0 = null;
    public boolean A0 = false;
    public j90 B0 = new j90();
    public int G0 = 0;
    public int H0 = 0;
    public pa[] I0 = new pa[4];
    public pa[] J0 = new pa[4];
    public boolean K0 = false;
    public boolean L0 = false;
    public boolean M0 = false;
    public int N0 = 0;
    public int O0 = 0;
    public int P0 = 263;
    public boolean Q0 = false;
    public boolean R0 = false;
    public boolean S0 = false;
    public int T0 = 0;

    @Override // androidx.appcompat.view.menu.mf
    public void I0(boolean z, boolean z2) {
        super.I0(z, z2);
        int size = this.w0.size();
        for (int i = 0; i < size; i++) {
            ((mf) this.w0.get(i)).I0(z, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
    @Override // androidx.appcompat.view.menu.a81
    public void K0() {
        boolean z;
        ?? r11;
        boolean z2;
        this.S = 0;
        this.T = 0;
        int max = Math.max(0, P());
        int max2 = Math.max(0, v());
        this.R0 = false;
        this.S0 = false;
        boolean z3 = d1(64) || d1(PackageParser.PARSE_IS_PRIVILEGED);
        j90 j90Var = this.B0;
        j90Var.g = false;
        j90Var.h = false;
        if (this.P0 != 0 && z3) {
            j90Var.h = true;
        }
        mf.b[] bVarArr = this.M;
        mf.b bVar = bVarArr[1];
        mf.b bVar2 = bVarArr[0];
        ArrayList arrayList = this.w0;
        mf.b y = y();
        mf.b bVar3 = mf.b.WRAP_CONTENT;
        boolean z4 = y == bVar3 || M() == bVar3;
        e1();
        int size = this.w0.size();
        for (int i = 0; i < size; i++) {
            mf mfVar = (mf) this.w0.get(i);
            if (mfVar instanceof a81) {
                ((a81) mfVar).K0();
            }
        }
        int i2 = 0;
        boolean z5 = false;
        boolean z6 = true;
        while (z6) {
            int i3 = i2 + 1;
            try {
                this.B0.D();
                e1();
                l(this.B0);
                for (int i4 = 0; i4 < size; i4++) {
                    ((mf) this.w0.get(i4)).l(this.B0);
                }
                z6 = O0(this.B0);
                if (z6) {
                    this.B0.z();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("EXCEPTION : " + e);
            }
            if (z6) {
                i1(this.B0, tg0.a);
            } else {
                J0(this.B0);
                for (int i5 = 0; i5 < size; i5++) {
                    ((mf) this.w0.get(i5)).J0(this.B0);
                }
            }
            if (z4 && i3 < 8 && tg0.a[2]) {
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    mf mfVar2 = (mf) this.w0.get(i8);
                    i6 = Math.max(i6, mfVar2.S + mfVar2.P());
                    i7 = Math.max(i7, mfVar2.T + mfVar2.v());
                }
                int max3 = Math.max(this.Z, i6);
                int max4 = Math.max(this.a0, i7);
                mf.b bVar4 = mf.b.WRAP_CONTENT;
                if (bVar2 != bVar4 || P() >= max3) {
                    z = false;
                } else {
                    E0(max3);
                    this.M[0] = bVar4;
                    z = true;
                    z5 = true;
                }
                if (bVar == bVar4 && v() < max4) {
                    h0(max4);
                    this.M[1] = bVar4;
                    z = true;
                    z5 = true;
                }
            } else {
                z = false;
            }
            int max5 = Math.max(this.Z, P());
            if (max5 > P()) {
                E0(max5);
                this.M[0] = mf.b.FIXED;
                z = true;
                z5 = true;
            }
            int max6 = Math.max(this.a0, v());
            if (max6 > v()) {
                h0(max6);
                r11 = 1;
                this.M[1] = mf.b.FIXED;
                z = true;
                z2 = true;
            } else {
                r11 = 1;
                z2 = z5;
            }
            if (!z2) {
                mf.b bVar5 = this.M[0];
                mf.b bVar6 = mf.b.WRAP_CONTENT;
                if (bVar5 == bVar6 && max > 0 && P() > max) {
                    this.R0 = r11;
                    this.M[0] = mf.b.FIXED;
                    E0(max);
                    z = r11;
                    z2 = z;
                }
                if (this.M[r11] == bVar6 && max2 > 0 && v() > max2) {
                    this.S0 = r11;
                    this.M[r11] = mf.b.FIXED;
                    h0(max2);
                    z6 = true;
                    z5 = true;
                    i2 = i3;
                }
            }
            z6 = z;
            z5 = z2;
            i2 = i3;
        }
        this.w0 = arrayList;
        if (z5) {
            mf.b[] bVarArr2 = this.M;
            bVarArr2[0] = bVar2;
            bVarArr2[1] = bVar;
        }
        a0(this.B0.v());
    }

    public void N0(mf mfVar, int i) {
        if (i == 0) {
            P0(mfVar);
        } else if (i == 1) {
            Q0(mfVar);
        }
    }

    public boolean O0(j90 j90Var) {
        f(j90Var);
        int size = this.w0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            mf mfVar = (mf) this.w0.get(i);
            mfVar.o0(0, false);
            mfVar.o0(1, false);
            if (mfVar instanceof w7) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                mf mfVar2 = (mf) this.w0.get(i2);
                if (mfVar2 instanceof w7) {
                    ((w7) mfVar2).N0();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            mf mfVar3 = (mf) this.w0.get(i3);
            if (mfVar3.e()) {
                mfVar3.f(j90Var);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            mf mfVar4 = (mf) this.w0.get(i4);
            if (mfVar4 instanceof nf) {
                mf.b[] bVarArr = mfVar4.M;
                mf.b bVar = bVarArr[0];
                mf.b bVar2 = bVarArr[1];
                mf.b bVar3 = mf.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    mfVar4.l0(mf.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    mfVar4.A0(mf.b.FIXED);
                }
                mfVar4.f(j90Var);
                if (bVar == bVar3) {
                    mfVar4.l0(bVar);
                }
                if (bVar2 == bVar3) {
                    mfVar4.A0(bVar2);
                }
            } else {
                tg0.a(this, j90Var, mfVar4);
                if (!mfVar4.e()) {
                    mfVar4.f(j90Var);
                }
            }
        }
        if (this.G0 > 0) {
            oa.a(this, j90Var, 0);
        }
        if (this.H0 > 0) {
            oa.a(this, j90Var, 1);
        }
        return true;
    }

    public final void P0(mf mfVar) {
        int i = this.G0 + 1;
        pa[] paVarArr = this.J0;
        if (i >= paVarArr.length) {
            this.J0 = (pa[]) Arrays.copyOf(paVarArr, paVarArr.length * 2);
        }
        this.J0[this.G0] = new pa(mfVar, 0, a1());
        this.G0++;
    }

    public final void Q0(mf mfVar) {
        int i = this.H0 + 1;
        pa[] paVarArr = this.I0;
        if (i >= paVarArr.length) {
            this.I0 = (pa[]) Arrays.copyOf(paVarArr, paVarArr.length * 2);
        }
        this.I0[this.H0] = new pa(mfVar, 1, a1());
        this.H0++;
    }

    public boolean R0(boolean z) {
        return this.y0.f(z);
    }

    public boolean S0(boolean z) {
        return this.y0.g(z);
    }

    public boolean T0(boolean z, int i) {
        return this.y0.h(z, i);
    }

    public e8.b U0() {
        return this.z0;
    }

    public int V0() {
        return this.P0;
    }

    public boolean W0() {
        return false;
    }

    public void X0() {
        this.y0.j();
    }

    @Override // androidx.appcompat.view.menu.a81, androidx.appcompat.view.menu.mf
    public void Y() {
        this.B0.D();
        this.C0 = 0;
        this.E0 = 0;
        this.D0 = 0;
        this.F0 = 0;
        this.Q0 = false;
        super.Y();
    }

    public void Y0() {
        this.y0.k();
    }

    public boolean Z0() {
        return this.S0;
    }

    public boolean a1() {
        return this.A0;
    }

    public boolean b1() {
        return this.R0;
    }

    public long c1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.C0 = i8;
        this.D0 = i9;
        return this.x0.d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public boolean d1(int i) {
        return (this.P0 & i) == i;
    }

    public final void e1() {
        this.G0 = 0;
        this.H0 = 0;
    }

    public void f1(e8.b bVar) {
        this.z0 = bVar;
        this.y0.n(bVar);
    }

    public void g1(int i) {
        this.P0 = i;
        j90.r = tg0.b(i, PackageParser.PARSE_COLLECT_CERTIFICATES);
    }

    public void h1(boolean z) {
        this.A0 = z;
    }

    public void i1(j90 j90Var, boolean[] zArr) {
        zArr[2] = false;
        J0(j90Var);
        int size = this.w0.size();
        for (int i = 0; i < size; i++) {
            ((mf) this.w0.get(i)).J0(j90Var);
        }
    }

    public void j1() {
        this.x0.e(this);
    }
}
