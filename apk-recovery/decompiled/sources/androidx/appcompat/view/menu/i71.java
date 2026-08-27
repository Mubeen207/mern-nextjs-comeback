package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.e8;
import androidx.appcompat.view.menu.mf;
/* loaded from: classes.dex */
public abstract class i71 extends kz {
    public int y0 = 0;
    public int z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public int D0 = 0;
    public int E0 = 0;
    public int F0 = 0;
    public boolean G0 = false;
    public int H0 = 0;
    public int I0 = 0;
    public e8.a J0 = new e8.a();
    public e8.b K0 = null;

    public void K0(boolean z) {
        int i = this.C0;
        if (i > 0 || this.D0 > 0) {
            if (z) {
                this.E0 = this.D0;
                this.F0 = i;
                return;
            }
            this.E0 = i;
            this.F0 = this.D0;
        }
    }

    public void L0() {
        for (int i = 0; i < this.x0; i++) {
            mf mfVar = this.w0[i];
            if (mfVar != null) {
                mfVar.q0(true);
            }
        }
    }

    public int M0() {
        return this.I0;
    }

    public int N0() {
        return this.H0;
    }

    public int O0() {
        return this.z0;
    }

    public int P0() {
        return this.E0;
    }

    public int Q0() {
        return this.F0;
    }

    public int R0() {
        return this.y0;
    }

    public abstract void S0(int i, int i2, int i3, int i4);

    public void T0(mf mfVar, mf.b bVar, int i, mf.b bVar2, int i2) {
        while (this.K0 == null && G() != null) {
            this.K0 = ((nf) G()).U0();
        }
        e8.a aVar = this.J0;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.K0.b(mfVar, aVar);
        mfVar.E0(this.J0.e);
        mfVar.h0(this.J0.f);
        mfVar.g0(this.J0.h);
        mfVar.b0(this.J0.g);
    }

    public boolean U0() {
        mf mfVar = this.N;
        e8.b U0 = mfVar != null ? ((nf) mfVar).U0() : null;
        if (U0 == null) {
            return false;
        }
        for (int i = 0; i < this.x0; i++) {
            mf mfVar2 = this.w0[i];
            if (mfVar2 != null && !(mfVar2 instanceof oy)) {
                mf.b s = mfVar2.s(0);
                mf.b s2 = mfVar2.s(1);
                mf.b bVar = mf.b.MATCH_CONSTRAINT;
                if (s != bVar || mfVar2.l == 1 || s2 != bVar || mfVar2.m == 1) {
                    if (s == bVar) {
                        s = mf.b.WRAP_CONTENT;
                    }
                    if (s2 == bVar) {
                        s2 = mf.b.WRAP_CONTENT;
                    }
                    e8.a aVar = this.J0;
                    aVar.a = s;
                    aVar.b = s2;
                    aVar.c = mfVar2.P();
                    this.J0.d = mfVar2.v();
                    U0.b(mfVar2, this.J0);
                    mfVar2.E0(this.J0.e);
                    mfVar2.h0(this.J0.f);
                    mfVar2.b0(this.J0.g);
                }
            }
        }
        return true;
    }

    public boolean V0() {
        return this.G0;
    }

    public void W0(boolean z) {
        this.G0 = z;
    }

    public void X0(int i, int i2) {
        this.H0 = i;
        this.I0 = i2;
    }

    public void Y0(int i) {
        this.A0 = i;
        this.y0 = i;
        this.B0 = i;
        this.z0 = i;
        this.C0 = i;
        this.D0 = i;
    }

    public void Z0(int i) {
        this.z0 = i;
    }

    public void a1(int i) {
        this.D0 = i;
    }

    public void b1(int i) {
        this.A0 = i;
        this.E0 = i;
    }

    @Override // androidx.appcompat.view.menu.kz, androidx.appcompat.view.menu.iz
    public void c(nf nfVar) {
        L0();
    }

    public void c1(int i) {
        this.B0 = i;
        this.F0 = i;
    }

    public void d1(int i) {
        this.C0 = i;
        this.E0 = i;
        this.F0 = i;
    }

    public void e1(int i) {
        this.y0 = i;
    }
}
