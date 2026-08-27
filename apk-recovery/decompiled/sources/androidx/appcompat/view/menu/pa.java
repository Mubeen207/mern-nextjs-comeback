package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.mf;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class pa {
    public mf a;
    public mf b;
    public mf c;
    public mf d;
    public mf e;
    public mf f;
    public mf g;
    public ArrayList h;
    public int i;
    public int j;
    public float k = 0.0f;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;

    public pa(mf mfVar, int i, boolean z) {
        this.a = mfVar;
        this.p = i;
        this.q = z;
    }

    public static boolean c(mf mfVar, int i) {
        int i2;
        return mfVar.O() != 8 && mfVar.M[i] == mf.b.MATCH_CONSTRAINT && ((i2 = mfVar.n[i]) == 0 || i2 == 3);
    }

    public void a() {
        if (!this.v) {
            b();
        }
        this.v = true;
    }

    public final void b() {
        int i = this.p * 2;
        mf mfVar = this.a;
        boolean z = true;
        this.o = true;
        mf mfVar2 = mfVar;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            mf[] mfVarArr = mfVar.s0;
            int i2 = this.p;
            mf mfVar3 = null;
            mfVarArr[i2] = null;
            mfVar.r0[i2] = null;
            if (mfVar.O() != 8) {
                this.l++;
                mf.b s = mfVar.s(this.p);
                mf.b bVar = mf.b.MATCH_CONSTRAINT;
                if (s != bVar) {
                    this.m += mfVar.A(this.p);
                }
                int c = this.m + mfVar.J[i].c();
                this.m = c;
                int i3 = i + 1;
                this.m = c + mfVar.J[i3].c();
                int c2 = this.n + mfVar.J[i].c();
                this.n = c2;
                this.n = c2 + mfVar.J[i3].c();
                if (this.b == null) {
                    this.b = mfVar;
                }
                this.d = mfVar;
                mf.b[] bVarArr = mfVar.M;
                int i4 = this.p;
                if (bVarArr[i4] == bVar) {
                    int i5 = mfVar.n[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.j++;
                        float f = mfVar.q0[i4];
                        if (f > 0.0f) {
                            this.k += f;
                        }
                        if (c(mfVar, i4)) {
                            if (f < 0.0f) {
                                this.r = true;
                            } else {
                                this.s = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList();
                            }
                            this.h.add(mfVar);
                        }
                        if (this.f == null) {
                            this.f = mfVar;
                        }
                        mf mfVar4 = this.g;
                        if (mfVar4 != null) {
                            mfVar4.r0[this.p] = mfVar;
                        }
                        this.g = mfVar;
                    }
                    if (this.p == 0) {
                        if (mfVar.l != 0) {
                            this.o = false;
                        } else if (mfVar.o != 0 || mfVar.p != 0) {
                            this.o = false;
                        }
                    } else if (mfVar.m != 0) {
                        this.o = false;
                    } else if (mfVar.r != 0 || mfVar.s != 0) {
                        this.o = false;
                    }
                    if (mfVar.Q != 0.0f) {
                        this.o = false;
                        this.u = true;
                    }
                }
            }
            if (mfVar2 != mfVar) {
                mfVar2.s0[this.p] = mfVar;
            }
            kf kfVar = mfVar.J[i + 1].d;
            if (kfVar != null) {
                mf mfVar5 = kfVar.b;
                kf kfVar2 = mfVar5.J[i].d;
                if (kfVar2 != null && kfVar2.b == mfVar) {
                    mfVar3 = mfVar5;
                }
            }
            if (mfVar3 == null) {
                mfVar3 = mfVar;
                z2 = true;
            }
            mfVar2 = mfVar;
            mfVar = mfVar3;
        }
        mf mfVar6 = this.b;
        if (mfVar6 != null) {
            this.m -= mfVar6.J[i].c();
        }
        mf mfVar7 = this.d;
        if (mfVar7 != null) {
            this.m -= mfVar7.J[i + 1].c();
        }
        this.c = mfVar;
        if (this.p == 0 && this.q) {
            this.e = mfVar;
        } else {
            this.e = this.a;
        }
        if (!this.s || !this.r) {
            z = false;
        }
        this.t = z;
    }
}
