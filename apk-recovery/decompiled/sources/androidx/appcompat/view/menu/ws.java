package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.mf;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ws extends i71 {
    public mf[] i1;
    public int L0 = -1;
    public int M0 = -1;
    public int N0 = -1;
    public int O0 = -1;
    public int P0 = -1;
    public int Q0 = -1;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public float T0 = 0.5f;
    public float U0 = 0.5f;
    public float V0 = 0.5f;
    public float W0 = 0.5f;
    public int X0 = 0;
    public int Y0 = 0;
    public int Z0 = 2;
    public int a1 = 2;
    public int b1 = 0;
    public int c1 = -1;
    public int d1 = 0;
    public ArrayList e1 = new ArrayList();
    public mf[] f1 = null;
    public mf[] g1 = null;
    public int[] h1 = null;
    public int j1 = 0;

    /* loaded from: classes.dex */
    public class a {
        public int a;
        public kf d;
        public kf e;
        public kf f;
        public kf g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int q;
        public mf b = null;
        public int c = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public int p = 0;

        public a(int i, kf kfVar, kf kfVar2, kf kfVar3, kf kfVar4, int i2) {
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.q = 0;
            this.a = i;
            this.d = kfVar;
            this.e = kfVar2;
            this.f = kfVar3;
            this.g = kfVar4;
            this.h = ws.this.P0();
            this.i = ws.this.R0();
            this.j = ws.this.Q0();
            this.k = ws.this.O0();
            this.q = i2;
        }

        public void b(mf mfVar) {
            if (this.a == 0) {
                int B1 = ws.this.B1(mfVar, this.q);
                if (mfVar.y() == mf.b.MATCH_CONSTRAINT) {
                    this.p++;
                    B1 = 0;
                }
                this.l += B1 + (mfVar.O() != 8 ? ws.this.X0 : 0);
                int A1 = ws.this.A1(mfVar, this.q);
                if (this.b == null || this.c < A1) {
                    this.b = mfVar;
                    this.c = A1;
                    this.m = A1;
                }
            } else {
                int B12 = ws.this.B1(mfVar, this.q);
                int A12 = ws.this.A1(mfVar, this.q);
                if (mfVar.M() == mf.b.MATCH_CONSTRAINT) {
                    this.p++;
                    A12 = 0;
                }
                this.m += A12 + (mfVar.O() != 8 ? ws.this.Y0 : 0);
                if (this.b == null || this.c < B12) {
                    this.b = mfVar;
                    this.c = B12;
                    this.l = B12;
                }
            }
            this.o++;
        }

        public void c() {
            this.c = 0;
            this.b = null;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
        }

        public void d(boolean z, int i, boolean z2) {
            mf mfVar;
            char c;
            int i2 = this.o;
            for (int i3 = 0; i3 < i2 && this.n + i3 < ws.this.j1; i3++) {
                mf mfVar2 = ws.this.i1[this.n + i3];
                if (mfVar2 != null) {
                    mfVar2.Z();
                }
            }
            if (i2 == 0 || this.b == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i4 = -1;
            int i5 = -1;
            for (int i6 = 0; i6 < i2; i6++) {
                int i7 = z ? (i2 - 1) - i6 : i6;
                if (this.n + i7 >= ws.this.j1) {
                    break;
                }
                if (ws.this.i1[this.n + i7].O() == 0) {
                    if (i4 == -1) {
                        i4 = i6;
                    }
                    i5 = i6;
                }
            }
            mf mfVar3 = null;
            if (this.a != 0) {
                mf mfVar4 = this.b;
                mfVar4.j0(ws.this.L0);
                int i8 = this.h;
                if (i > 0) {
                    i8 += ws.this.X0;
                }
                if (z) {
                    mfVar4.D.a(this.f, i8);
                    if (z2) {
                        mfVar4.B.a(this.d, this.j);
                    }
                    if (i > 0) {
                        this.f.b.B.a(mfVar4.D, 0);
                    }
                } else {
                    mfVar4.B.a(this.d, i8);
                    if (z2) {
                        mfVar4.D.a(this.f, this.j);
                    }
                    if (i > 0) {
                        this.d.b.D.a(mfVar4.B, 0);
                    }
                }
                int i9 = 0;
                while (i9 < i2 && this.n + i9 < ws.this.j1) {
                    mf mfVar5 = ws.this.i1[this.n + i9];
                    if (i9 == 0) {
                        mfVar5.j(mfVar5.C, this.e, this.i);
                        int i10 = ws.this.M0;
                        float f = ws.this.S0;
                        if (this.n == 0 && ws.this.O0 != -1) {
                            i10 = ws.this.O0;
                            f = ws.this.U0;
                        } else if (z2 && ws.this.Q0 != -1) {
                            i10 = ws.this.Q0;
                            f = ws.this.W0;
                        }
                        mfVar5.y0(i10);
                        mfVar5.x0(f);
                    }
                    if (i9 == i2 - 1) {
                        mfVar5.j(mfVar5.E, this.g, this.k);
                    }
                    if (mfVar3 != null) {
                        mfVar5.C.a(mfVar3.E, ws.this.Y0);
                        if (i9 == i4) {
                            mfVar5.C.n(this.i);
                        }
                        mfVar3.E.a(mfVar5.C, 0);
                        if (i9 == i5 + 1) {
                            mfVar3.E.n(this.k);
                        }
                    }
                    if (mfVar5 != mfVar4) {
                        if (z) {
                            int i11 = ws.this.Z0;
                            if (i11 == 0) {
                                mfVar5.D.a(mfVar4.D, 0);
                            } else if (i11 == 1) {
                                mfVar5.B.a(mfVar4.B, 0);
                            } else if (i11 == 2) {
                                mfVar5.B.a(mfVar4.B, 0);
                                mfVar5.D.a(mfVar4.D, 0);
                            }
                        } else {
                            int i12 = ws.this.Z0;
                            if (i12 == 0) {
                                mfVar5.B.a(mfVar4.B, 0);
                            } else if (i12 == 1) {
                                mfVar5.D.a(mfVar4.D, 0);
                            } else if (i12 == 2) {
                                if (z3) {
                                    mfVar5.B.a(this.d, this.h);
                                    mfVar5.D.a(this.f, this.j);
                                } else {
                                    mfVar5.B.a(mfVar4.B, 0);
                                    mfVar5.D.a(mfVar4.D, 0);
                                }
                            }
                            i9++;
                            mfVar3 = mfVar5;
                        }
                    }
                    i9++;
                    mfVar3 = mfVar5;
                }
                return;
            }
            mf mfVar6 = this.b;
            mfVar6.y0(ws.this.M0);
            int i13 = this.i;
            if (i > 0) {
                i13 += ws.this.Y0;
            }
            mfVar6.C.a(this.e, i13);
            if (z2) {
                mfVar6.E.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.b.E.a(mfVar6.C, 0);
            }
            if (ws.this.a1 == 3 && !mfVar6.S()) {
                for (int i14 = 0; i14 < i2; i14++) {
                    int i15 = z ? (i2 - 1) - i14 : i14;
                    if (this.n + i15 >= ws.this.j1) {
                        break;
                    }
                    mfVar = ws.this.i1[this.n + i15];
                    if (mfVar.S()) {
                        break;
                    }
                }
            }
            mfVar = mfVar6;
            int i16 = 0;
            while (i16 < i2) {
                int i17 = z ? (i2 - 1) - i16 : i16;
                if (this.n + i17 >= ws.this.j1) {
                    return;
                }
                mf mfVar7 = ws.this.i1[this.n + i17];
                if (i16 == 0) {
                    mfVar7.j(mfVar7.B, this.d, this.h);
                }
                if (i17 == 0) {
                    int i18 = ws.this.L0;
                    float f2 = ws.this.R0;
                    if (this.n == 0 && ws.this.N0 != -1) {
                        i18 = ws.this.N0;
                        f2 = ws.this.T0;
                    } else if (z2 && ws.this.P0 != -1) {
                        i18 = ws.this.P0;
                        f2 = ws.this.V0;
                    }
                    mfVar7.j0(i18);
                    mfVar7.i0(f2);
                }
                if (i16 == i2 - 1) {
                    mfVar7.j(mfVar7.D, this.f, this.j);
                }
                if (mfVar3 != null) {
                    mfVar7.B.a(mfVar3.D, ws.this.X0);
                    if (i16 == i4) {
                        mfVar7.B.n(this.h);
                    }
                    mfVar3.D.a(mfVar7.B, 0);
                    if (i16 == i5 + 1) {
                        mfVar3.D.n(this.j);
                    }
                }
                if (mfVar7 != mfVar6) {
                    c = 3;
                    if (ws.this.a1 == 3 && mfVar.S() && mfVar7 != mfVar && mfVar7.S()) {
                        mfVar7.F.a(mfVar.F, 0);
                    } else {
                        int i19 = ws.this.a1;
                        if (i19 == 0) {
                            mfVar7.C.a(mfVar6.C, 0);
                        } else if (i19 == 1) {
                            mfVar7.E.a(mfVar6.E, 0);
                        } else if (z3) {
                            mfVar7.C.a(this.e, this.i);
                            mfVar7.E.a(this.g, this.k);
                        } else {
                            mfVar7.C.a(mfVar6.C, 0);
                            mfVar7.E.a(mfVar6.E, 0);
                        }
                    }
                } else {
                    c = 3;
                }
                i16++;
                mfVar3 = mfVar7;
            }
        }

        public int e() {
            return this.a == 1 ? this.m - ws.this.Y0 : this.m;
        }

        public int f() {
            return this.a == 0 ? this.l - ws.this.X0 : this.l;
        }

        public void g(int i) {
            int i2 = this.p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.n + i5 < ws.this.j1; i5++) {
                mf mfVar = ws.this.i1[this.n + i5];
                if (this.a == 0) {
                    if (mfVar != null && mfVar.y() == mf.b.MATCH_CONSTRAINT && mfVar.l == 0) {
                        ws.this.T0(mfVar, mf.b.FIXED, i4, mfVar.M(), mfVar.v());
                    }
                } else if (mfVar != null && mfVar.M() == mf.b.MATCH_CONSTRAINT && mfVar.m == 0) {
                    ws.this.T0(mfVar, mfVar.y(), mfVar.P(), mf.b.FIXED, i4);
                }
            }
            h();
        }

        public final void h() {
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i = this.o;
            for (int i2 = 0; i2 < i && this.n + i2 < ws.this.j1; i2++) {
                mf mfVar = ws.this.i1[this.n + i2];
                if (this.a == 0) {
                    int P = mfVar.P();
                    int i3 = ws.this.X0;
                    if (mfVar.O() == 8) {
                        i3 = 0;
                    }
                    this.l += P + i3;
                    int A1 = ws.this.A1(mfVar, this.q);
                    if (this.b == null || this.c < A1) {
                        this.b = mfVar;
                        this.c = A1;
                        this.m = A1;
                    }
                } else {
                    int B1 = ws.this.B1(mfVar, this.q);
                    int A12 = ws.this.A1(mfVar, this.q);
                    int i4 = ws.this.Y0;
                    if (mfVar.O() == 8) {
                        i4 = 0;
                    }
                    this.m += A12 + i4;
                    if (this.b == null || this.c < B1) {
                        this.b = mfVar;
                        this.c = B1;
                        this.l = B1;
                    }
                }
            }
        }

        public void i(int i) {
            this.n = i;
        }

        public void j(int i, kf kfVar, kf kfVar2, kf kfVar3, kf kfVar4, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.d = kfVar;
            this.e = kfVar2;
            this.f = kfVar3;
            this.g = kfVar4;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.q = i6;
        }
    }

    public final int A1(mf mfVar, int i) {
        if (mfVar == null) {
            return 0;
        }
        if (mfVar.M() == mf.b.MATCH_CONSTRAINT) {
            int i2 = mfVar.m;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (mfVar.t * i);
                if (i3 != mfVar.v()) {
                    T0(mfVar, mfVar.y(), mfVar.P(), mf.b.FIXED, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return mfVar.v();
            } else {
                if (i2 == 3) {
                    return (int) ((mfVar.P() * mfVar.Q) + 0.5f);
                }
            }
        }
        return mfVar.v();
    }

    public final int B1(mf mfVar, int i) {
        if (mfVar == null) {
            return 0;
        }
        if (mfVar.y() == mf.b.MATCH_CONSTRAINT) {
            int i2 = mfVar.l;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (mfVar.q * i);
                if (i3 != mfVar.P()) {
                    T0(mfVar, mf.b.FIXED, i3, mfVar.M(), mfVar.v());
                }
                return i3;
            } else if (i2 == 1) {
                return mfVar.P();
            } else {
                if (i2 == 3) {
                    return (int) ((mfVar.v() * mfVar.Q) + 0.5f);
                }
            }
        }
        return mfVar.P();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C1(androidx.appcompat.view.menu.mf[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ws.C1(androidx.appcompat.view.menu.mf[], int, int, int, int[]):void");
    }

    public final void D1(mf[] mfVarArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int i6;
        kf kfVar;
        int Q0;
        kf kfVar2;
        int O0;
        int i7;
        if (i == 0) {
            return;
        }
        this.e1.clear();
        a aVar = new a(i2, this.B, this.C, this.D, this.E, i3);
        this.e1.add(aVar);
        if (i2 == 0) {
            i4 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i9 < i) {
                mf mfVar = mfVarArr[i9];
                int B1 = B1(mfVar, i3);
                if (mfVar.y() == mf.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i10 = i4;
                boolean z = (i8 == i3 || (this.X0 + i8) + B1 > i3) && aVar.b != null;
                if ((!z && i9 > 0 && (i7 = this.c1) > 0 && i9 % i7 == 0) || z) {
                    aVar = new a(i2, this.B, this.C, this.D, this.E, i3);
                    aVar.i(i9);
                    this.e1.add(aVar);
                } else if (i9 > 0) {
                    i8 += this.X0 + B1;
                    aVar.b(mfVar);
                    i9++;
                    i4 = i10;
                }
                i8 = B1;
                aVar.b(mfVar);
                i9++;
                i4 = i10;
            }
        } else {
            i4 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i) {
                mf mfVar2 = mfVarArr[i12];
                int A1 = A1(mfVar2, i3);
                if (mfVar2.M() == mf.b.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i13 = i4;
                boolean z2 = (i11 == i3 || (this.Y0 + i11) + A1 > i3) && aVar.b != null;
                if ((!z2 && i12 > 0 && (i5 = this.c1) > 0 && i12 % i5 == 0) || z2) {
                    aVar = new a(i2, this.B, this.C, this.D, this.E, i3);
                    aVar.i(i12);
                    this.e1.add(aVar);
                } else if (i12 > 0) {
                    i11 += this.Y0 + A1;
                    aVar.b(mfVar2);
                    i12++;
                    i4 = i13;
                }
                i11 = A1;
                aVar.b(mfVar2);
                i12++;
                i4 = i13;
            }
        }
        int size = this.e1.size();
        kf kfVar3 = this.B;
        kf kfVar4 = this.C;
        kf kfVar5 = this.D;
        kf kfVar6 = this.E;
        int P0 = P0();
        int R0 = R0();
        int Q02 = Q0();
        int O02 = O0();
        mf.b y = y();
        mf.b bVar = mf.b.WRAP_CONTENT;
        boolean z3 = y == bVar || M() == bVar;
        if (i4 > 0 && z3) {
            for (int i14 = 0; i14 < size; i14++) {
                a aVar2 = (a) this.e1.get(i14);
                if (i2 == 0) {
                    aVar2.g(i3 - aVar2.f());
                } else {
                    aVar2.g(i3 - aVar2.e());
                }
            }
        }
        int i15 = R0;
        int i16 = Q02;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = P0;
        kf kfVar7 = kfVar4;
        kf kfVar8 = kfVar3;
        int i21 = O02;
        while (i19 < size) {
            a aVar3 = (a) this.e1.get(i19);
            if (i2 == 0) {
                if (i19 < size - 1) {
                    kfVar2 = ((a) this.e1.get(i19 + 1)).b.C;
                    O0 = 0;
                } else {
                    kfVar2 = this.E;
                    O0 = O0();
                }
                kf kfVar9 = aVar3.b.E;
                kf kfVar10 = kfVar8;
                kf kfVar11 = kfVar8;
                int i22 = i17;
                kf kfVar12 = kfVar7;
                int i23 = i18;
                kf kfVar13 = kfVar5;
                kf kfVar14 = kfVar5;
                i6 = i19;
                aVar3.j(i2, kfVar10, kfVar12, kfVar13, kfVar2, i20, i15, i16, O0, i3);
                int max = Math.max(i23, aVar3.f());
                i17 = i22 + aVar3.e();
                if (i6 > 0) {
                    i17 += this.Y0;
                }
                kfVar8 = kfVar11;
                i18 = max;
                i15 = 0;
                kfVar7 = kfVar9;
                kfVar = kfVar14;
                int i24 = O0;
                kfVar6 = kfVar2;
                i21 = i24;
            } else {
                kf kfVar15 = kfVar8;
                int i25 = i17;
                int i26 = i18;
                i6 = i19;
                if (i6 < size - 1) {
                    kfVar = ((a) this.e1.get(i6 + 1)).b.B;
                    Q0 = 0;
                } else {
                    kfVar = this.D;
                    Q0 = Q0();
                }
                kf kfVar16 = aVar3.b.D;
                aVar3.j(i2, kfVar15, kfVar7, kfVar, kfVar6, i20, i15, Q0, i21, i3);
                i18 = i26 + aVar3.f();
                int max2 = Math.max(i25, aVar3.e());
                if (i6 > 0) {
                    i18 += this.X0;
                }
                i17 = max2;
                i20 = 0;
                i16 = Q0;
                kfVar8 = kfVar16;
            }
            i19 = i6 + 1;
            kfVar5 = kfVar;
        }
        iArr[0] = i18;
        iArr[1] = i17;
    }

    public final void E1(mf[] mfVarArr, int i, int i2, int i3, int[] iArr) {
        a aVar;
        if (i == 0) {
            return;
        }
        if (this.e1.size() == 0) {
            aVar = new a(i2, this.B, this.C, this.D, this.E, i3);
            this.e1.add(aVar);
        } else {
            a aVar2 = (a) this.e1.get(0);
            aVar2.c();
            aVar = aVar2;
            aVar.j(i2, this.B, this.C, this.D, this.E, P0(), R0(), Q0(), O0(), i3);
        }
        for (int i4 = 0; i4 < i; i4++) {
            aVar.b(mfVarArr[i4]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void F1(float f) {
        this.T0 = f;
    }

    public void G1(int i) {
        this.N0 = i;
    }

    public void H1(float f) {
        this.U0 = f;
    }

    public void I1(int i) {
        this.O0 = i;
    }

    public void J1(int i) {
        this.Z0 = i;
    }

    public void K1(float f) {
        this.R0 = f;
    }

    public void L1(int i) {
        this.X0 = i;
    }

    public void M1(int i) {
        this.L0 = i;
    }

    public void N1(float f) {
        this.V0 = f;
    }

    public void O1(int i) {
        this.P0 = i;
    }

    public void P1(float f) {
        this.W0 = f;
    }

    public void Q1(int i) {
        this.Q0 = i;
    }

    public void R1(int i) {
        this.c1 = i;
    }

    @Override // androidx.appcompat.view.menu.i71
    public void S0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int[] iArr;
        boolean z;
        if (this.x0 > 0 && !U0()) {
            X0(0, 0);
            W0(false);
            return;
        }
        int P0 = P0();
        int Q0 = Q0();
        int R0 = R0();
        int O0 = O0();
        int[] iArr2 = new int[2];
        int i7 = (i2 - P0) - Q0;
        int i8 = this.d1;
        if (i8 == 1) {
            i7 = (i4 - R0) - O0;
        }
        int i9 = i7;
        if (i8 == 0) {
            if (this.L0 == -1) {
                this.L0 = 0;
            }
            if (this.M0 == -1) {
                this.M0 = 0;
            }
        } else {
            if (this.L0 == -1) {
                this.L0 = 0;
            }
            if (this.M0 == -1) {
                this.M0 = 0;
            }
        }
        mf[] mfVarArr = this.w0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = this.x0;
            if (i10 >= i5) {
                break;
            }
            if (this.w0[i10].O() == 8) {
                i11++;
            }
            i10++;
        }
        if (i11 > 0) {
            mfVarArr = new mf[i5 - i11];
            int i12 = 0;
            for (int i13 = 0; i13 < this.x0; i13++) {
                mf mfVar = this.w0[i13];
                if (mfVar.O() != 8) {
                    mfVarArr[i12] = mfVar;
                    i12++;
                }
            }
            i6 = i12;
        } else {
            i6 = i5;
        }
        this.i1 = mfVarArr;
        this.j1 = i6;
        int i14 = this.b1;
        if (i14 == 0) {
            iArr = iArr2;
            z = true;
            E1(mfVarArr, i6, this.d1, i9, iArr2);
        } else if (i14 == 1) {
            z = true;
            iArr = iArr2;
            D1(mfVarArr, i6, this.d1, i9, iArr2);
        } else if (i14 != 2) {
            z = true;
            iArr = iArr2;
        } else {
            z = true;
            iArr = iArr2;
            C1(mfVarArr, i6, this.d1, i9, iArr2);
        }
        int i15 = iArr[0] + P0 + Q0;
        int i16 = iArr[z ? 1 : 0] + R0 + O0;
        if (i == 1073741824) {
            i15 = i2;
        } else if (i == Integer.MIN_VALUE) {
            i15 = Math.min(i15, i2);
        } else if (i != 0) {
            i15 = 0;
        }
        if (i3 == 1073741824) {
            i16 = i4;
        } else if (i3 == Integer.MIN_VALUE) {
            i16 = Math.min(i16, i4);
        } else if (i3 != 0) {
            i16 = 0;
        }
        X0(i15, i16);
        E0(i15);
        h0(i16);
        if (this.x0 <= 0) {
            z = false;
        }
        W0(z);
    }

    public void S1(int i) {
        this.d1 = i;
    }

    public void T1(int i) {
        this.a1 = i;
    }

    public void U1(float f) {
        this.S0 = f;
    }

    public void V1(int i) {
        this.Y0 = i;
    }

    public void W1(int i) {
        this.M0 = i;
    }

    public void X1(int i) {
        this.b1 = i;
    }

    @Override // androidx.appcompat.view.menu.mf
    public void f(j90 j90Var) {
        super.f(j90Var);
        boolean a1 = G() != null ? ((nf) G()).a1() : false;
        int i = this.b1;
        if (i != 0) {
            if (i == 1) {
                int size = this.e1.size();
                int i2 = 0;
                while (i2 < size) {
                    ((a) this.e1.get(i2)).d(a1, i2, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2) {
                z1(a1);
            }
        } else if (this.e1.size() > 0) {
            ((a) this.e1.get(0)).d(a1, 0, true);
        }
        W0(false);
    }

    public final void z1(boolean z) {
        mf mfVar;
        if (this.h1 == null || this.g1 == null || this.f1 == null) {
            return;
        }
        for (int i = 0; i < this.j1; i++) {
            this.i1[i].Z();
        }
        int[] iArr = this.h1;
        int i2 = iArr[0];
        int i3 = iArr[1];
        mf mfVar2 = null;
        for (int i4 = 0; i4 < i2; i4++) {
            mf mfVar3 = this.g1[z ? (i2 - i4) - 1 : i4];
            if (mfVar3 != null && mfVar3.O() != 8) {
                if (i4 == 0) {
                    mfVar3.j(mfVar3.B, this.B, P0());
                    mfVar3.j0(this.L0);
                    mfVar3.i0(this.R0);
                }
                if (i4 == i2 - 1) {
                    mfVar3.j(mfVar3.D, this.D, Q0());
                }
                if (i4 > 0) {
                    mfVar3.j(mfVar3.B, mfVar2.D, this.X0);
                    mfVar2.j(mfVar2.D, mfVar3.B, 0);
                }
                mfVar2 = mfVar3;
            }
        }
        for (int i5 = 0; i5 < i3; i5++) {
            mf mfVar4 = this.f1[i5];
            if (mfVar4 != null && mfVar4.O() != 8) {
                if (i5 == 0) {
                    mfVar4.j(mfVar4.C, this.C, R0());
                    mfVar4.y0(this.M0);
                    mfVar4.x0(this.S0);
                }
                if (i5 == i3 - 1) {
                    mfVar4.j(mfVar4.E, this.E, O0());
                }
                if (i5 > 0) {
                    mfVar4.j(mfVar4.C, mfVar2.E, this.Y0);
                    mfVar2.j(mfVar2.E, mfVar4.C, 0);
                }
                mfVar2 = mfVar4;
            }
        }
        for (int i6 = 0; i6 < i2; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = (i7 * i2) + i6;
                if (this.d1 == 1) {
                    i8 = (i6 * i3) + i7;
                }
                mf[] mfVarArr = this.i1;
                if (i8 < mfVarArr.length && (mfVar = mfVarArr[i8]) != null && mfVar.O() != 8) {
                    mf mfVar5 = this.g1[i6];
                    mf mfVar6 = this.f1[i7];
                    if (mfVar != mfVar5) {
                        mfVar.j(mfVar.B, mfVar5.B, 0);
                        mfVar.j(mfVar.D, mfVar5.D, 0);
                    }
                    if (mfVar != mfVar6) {
                        mfVar.j(mfVar.C, mfVar6.C, 0);
                        mfVar.j(mfVar.E, mfVar6.E, 0);
                    }
                }
            }
        }
    }
}
