package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.mf;
/* loaded from: classes.dex */
public class w7 extends kz {
    public int y0 = 0;
    public boolean z0 = true;
    public int A0 = 0;

    public boolean K0() {
        return this.z0;
    }

    public int L0() {
        return this.y0;
    }

    public int M0() {
        return this.A0;
    }

    public void N0() {
        for (int i = 0; i < this.x0; i++) {
            mf mfVar = this.w0[i];
            int i2 = this.y0;
            if (i2 == 0 || i2 == 1) {
                mfVar.o0(0, true);
            } else if (i2 == 2 || i2 == 3) {
                mfVar.o0(1, true);
            }
        }
    }

    public void O0(boolean z) {
        this.z0 = z;
    }

    public void P0(int i) {
        this.y0 = i;
    }

    public void Q0(int i) {
        this.A0 = i;
    }

    @Override // androidx.appcompat.view.menu.mf
    public void f(j90 j90Var) {
        kf[] kfVarArr;
        boolean z;
        int i;
        int i2;
        int i3;
        kf[] kfVarArr2 = this.J;
        kfVarArr2[0] = this.B;
        kfVarArr2[2] = this.C;
        kfVarArr2[1] = this.D;
        kfVarArr2[3] = this.E;
        int i4 = 0;
        while (true) {
            kfVarArr = this.J;
            if (i4 >= kfVarArr.length) {
                break;
            }
            kf kfVar = kfVarArr[i4];
            kfVar.g = j90Var.q(kfVar);
            i4++;
        }
        int i5 = this.y0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        kf kfVar2 = kfVarArr[i5];
        for (int i6 = 0; i6 < this.x0; i6++) {
            mf mfVar = this.w0[i6];
            if ((this.z0 || mfVar.g()) && ((((i2 = this.y0) == 0 || i2 == 1) && mfVar.y() == mf.b.MATCH_CONSTRAINT && mfVar.B.d != null && mfVar.D.d != null) || (((i3 = this.y0) == 2 || i3 == 3) && mfVar.M() == mf.b.MATCH_CONSTRAINT && mfVar.C.d != null && mfVar.E.d != null))) {
                z = true;
                break;
            }
        }
        z = false;
        boolean z2 = this.B.i() || this.D.i();
        boolean z3 = this.C.i() || this.E.i();
        int i7 = !(!z && (((i = this.y0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3))))) ? 4 : 5;
        for (int i8 = 0; i8 < this.x0; i8++) {
            mf mfVar2 = this.w0[i8];
            if (this.z0 || mfVar2.g()) {
                bw0 q = j90Var.q(mfVar2.J[this.y0]);
                kf[] kfVarArr3 = mfVar2.J;
                int i9 = this.y0;
                kf kfVar3 = kfVarArr3[i9];
                kfVar3.g = q;
                kf kfVar4 = kfVar3.d;
                int i10 = (kfVar4 == null || kfVar4.b != this) ? 0 : kfVar3.e;
                if (i9 == 0 || i9 == 2) {
                    j90Var.i(kfVar2.g, q, this.A0 - i10, z);
                } else {
                    j90Var.g(kfVar2.g, q, this.A0 + i10, z);
                }
                j90Var.e(kfVar2.g, q, this.A0 + i10, i7);
            }
        }
        int i11 = this.y0;
        if (i11 == 0) {
            j90Var.e(this.D.g, this.B.g, 0, 8);
            j90Var.e(this.B.g, this.N.D.g, 0, 4);
            j90Var.e(this.B.g, this.N.B.g, 0, 0);
        } else if (i11 == 1) {
            j90Var.e(this.B.g, this.D.g, 0, 8);
            j90Var.e(this.B.g, this.N.B.g, 0, 4);
            j90Var.e(this.B.g, this.N.D.g, 0, 0);
        } else if (i11 == 2) {
            j90Var.e(this.E.g, this.C.g, 0, 8);
            j90Var.e(this.C.g, this.N.E.g, 0, 4);
            j90Var.e(this.C.g, this.N.C.g, 0, 0);
        } else if (i11 == 3) {
            j90Var.e(this.C.g, this.E.g, 0, 8);
            j90Var.e(this.C.g, this.N.C.g, 0, 4);
            j90Var.e(this.C.g, this.N.E.g, 0, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.mf
    public boolean g() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.mf
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i = 0; i < this.x0; i++) {
            mf mfVar = this.w0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + mfVar.r();
        }
        return str + "}";
    }
}
