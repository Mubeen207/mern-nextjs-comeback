package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import androidx.appcompat.view.menu.kf;
import androidx.appcompat.view.menu.t02;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class mf {
    public static float v0 = 0.5f;
    public kf I;
    public kf[] J;
    public ArrayList K;
    public boolean[] L;
    public b[] M;
    public mf N;
    public int O;
    public int P;
    public float Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public float b0;
    public qa c;
    public float c0;
    public qa d;
    public Object d0;
    public int e0;
    public int f0;
    public String g0;
    public String h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public int n0;
    public boolean o0;
    public boolean p0;
    public float[] q0;
    public mf[] r0;
    public mf[] s0;
    public mf t0;
    public mf u0;
    public boolean z;
    public boolean a = false;
    public b81[] b = new b81[2];
    public oz e = new oz(this);
    public n51 f = new n51(this);
    public boolean[] g = {true, true};
    public int[] h = {0, 0, 0, 0};
    public boolean i = false;
    public int j = -1;
    public int k = -1;
    public int l = 0;
    public int m = 0;
    public int[] n = new int[2];
    public int o = 0;
    public int p = 0;
    public float q = 1.0f;
    public int r = 0;
    public int s = 0;
    public float t = 1.0f;
    public int u = -1;
    public float v = 1.0f;
    public int[] w = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float x = 0.0f;
    public boolean y = false;
    public boolean A = false;
    public kf B = new kf(this, kf.b.LEFT);
    public kf C = new kf(this, kf.b.TOP);
    public kf D = new kf(this, kf.b.RIGHT);
    public kf E = new kf(this, kf.b.BOTTOM);
    public kf F = new kf(this, kf.b.BASELINE);
    public kf G = new kf(this, kf.b.CENTER_X);
    public kf H = new kf(this, kf.b.CENTER_Y);

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[kf.b.values().length];
            a = iArr2;
            try {
                iArr2[kf.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[kf.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[kf.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[kf.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[kf.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[kf.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[kf.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[kf.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[kf.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public mf() {
        kf kfVar = new kf(this, kf.b.CENTER);
        this.I = kfVar;
        this.J = new kf[]{this.B, this.D, this.C, this.E, this.F, kfVar};
        this.K = new ArrayList();
        this.L = new boolean[2];
        b bVar = b.FIXED;
        this.M = new b[]{bVar, bVar};
        this.N = null;
        this.O = 0;
        this.P = 0;
        this.Q = 0.0f;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        float f = v0;
        this.b0 = f;
        this.c0 = f;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = null;
        this.k0 = false;
        this.l0 = false;
        this.m0 = 0;
        this.n0 = 0;
        this.q0 = new float[]{-1.0f, -1.0f};
        this.r0 = new mf[]{null, null};
        this.s0 = new mf[]{null, null};
        this.t0 = null;
        this.u0 = null;
        d();
    }

    public int A(int i) {
        if (i == 0) {
            return P();
        }
        if (i == 1) {
            return v();
        }
        return 0;
    }

    public void A0(b bVar) {
        this.M[1] = bVar;
    }

    public int B() {
        return this.w[1];
    }

    public void B0(int i, int i2, int i3, float f) {
        this.m = i;
        this.r = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.s = i3;
        this.t = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.m = 2;
    }

    public int C() {
        return this.w[0];
    }

    public void C0(float f) {
        this.q0[1] = f;
    }

    public int D() {
        return this.a0;
    }

    public void D0(int i) {
        this.f0 = i;
    }

    public int E() {
        return this.Z;
    }

    public void E0(int i) {
        this.O = i;
        int i2 = this.Z;
        if (i < i2) {
            this.O = i2;
        }
    }

    public mf F(int i) {
        kf kfVar;
        kf kfVar2;
        if (i != 0) {
            if (i == 1 && (kfVar2 = (kfVar = this.E).d) != null && kfVar2.d == kfVar) {
                return kfVar2.b;
            }
            return null;
        }
        kf kfVar3 = this.D;
        kf kfVar4 = kfVar3.d;
        if (kfVar4 == null || kfVar4.d != kfVar3) {
            return null;
        }
        return kfVar4.b;
    }

    public void F0(int i) {
        this.S = i;
    }

    public mf G() {
        return this.N;
    }

    public void G0(int i) {
        this.T = i;
    }

    public mf H(int i) {
        kf kfVar;
        kf kfVar2;
        if (i != 0) {
            if (i == 1 && (kfVar2 = (kfVar = this.C).d) != null && kfVar2.d == kfVar) {
                return kfVar2.b;
            }
            return null;
        }
        kf kfVar3 = this.B;
        kf kfVar4 = kfVar3.d;
        if (kfVar4 == null || kfVar4.d != kfVar3) {
            return null;
        }
        return kfVar4.b;
    }

    public void H0(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.u == -1) {
            if (z3 && !z4) {
                this.u = 0;
            } else if (!z3 && z4) {
                this.u = 1;
                if (this.R == -1) {
                    this.v = 1.0f / this.v;
                }
            }
        }
        if (this.u == 0 && (!this.C.j() || !this.E.j())) {
            this.u = 1;
        } else if (this.u == 1 && (!this.B.j() || !this.D.j())) {
            this.u = 0;
        }
        if (this.u == -1 && (!this.C.j() || !this.E.j() || !this.B.j() || !this.D.j())) {
            if (this.C.j() && this.E.j()) {
                this.u = 0;
            } else if (this.B.j() && this.D.j()) {
                this.v = 1.0f / this.v;
                this.u = 1;
            }
        }
        if (this.u == -1) {
            int i = this.o;
            if (i > 0 && this.r == 0) {
                this.u = 0;
            } else if (i != 0 || this.r <= 0) {
            } else {
                this.v = 1.0f / this.v;
                this.u = 1;
            }
        }
    }

    public int I() {
        return Q() + this.O;
    }

    public void I0(boolean z, boolean z2) {
        int i;
        int i2;
        boolean k = z & this.e.k();
        boolean k2 = z2 & this.f.k();
        oz ozVar = this.e;
        int i3 = ozVar.h.g;
        n51 n51Var = this.f;
        int i4 = n51Var.h.g;
        int i5 = ozVar.i.g;
        int i6 = n51Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (k) {
            this.S = i3;
        }
        if (k2) {
            this.T = i4;
        }
        if (this.f0 == 8) {
            this.O = 0;
            this.P = 0;
            return;
        }
        if (k) {
            if (this.M[0] == b.FIXED && i8 < (i2 = this.O)) {
                i8 = i2;
            }
            this.O = i8;
            int i10 = this.Z;
            if (i8 < i10) {
                this.O = i10;
            }
        }
        if (k2) {
            if (this.M[1] == b.FIXED && i9 < (i = this.P)) {
                i9 = i;
            }
            this.P = i9;
            int i11 = this.a0;
            if (i9 < i11) {
                this.P = i11;
            }
        }
    }

    public b81 J(int i) {
        if (i == 0) {
            return this.e;
        }
        if (i == 1) {
            return this.f;
        }
        return null;
    }

    public void J0(j90 j90Var) {
        int x = j90Var.x(this.B);
        int x2 = j90Var.x(this.C);
        int x3 = j90Var.x(this.D);
        int x4 = j90Var.x(this.E);
        oz ozVar = this.e;
        nl nlVar = ozVar.h;
        if (nlVar.j) {
            nl nlVar2 = ozVar.i;
            if (nlVar2.j) {
                x = nlVar.g;
                x3 = nlVar2.g;
            }
        }
        n51 n51Var = this.f;
        nl nlVar3 = n51Var.h;
        if (nlVar3.j) {
            nl nlVar4 = n51Var.i;
            if (nlVar4.j) {
                x2 = nlVar3.g;
                x4 = nlVar4.g;
            }
        }
        int i = x4 - x2;
        if (x3 - x < 0 || i < 0 || x == Integer.MIN_VALUE || x == Integer.MAX_VALUE || x2 == Integer.MIN_VALUE || x2 == Integer.MAX_VALUE || x3 == Integer.MIN_VALUE || x3 == Integer.MAX_VALUE || x4 == Integer.MIN_VALUE || x4 == Integer.MAX_VALUE) {
            x = 0;
            x4 = 0;
            x2 = 0;
            x3 = 0;
        }
        f0(x, x2, x3, x4);
    }

    public float K() {
        return this.c0;
    }

    public int L() {
        return this.n0;
    }

    public b M() {
        return this.M[1];
    }

    public int N() {
        int i = this.B != null ? this.C.e : 0;
        return this.D != null ? i + this.E.e : i;
    }

    public int O() {
        return this.f0;
    }

    public int P() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.O;
    }

    public int Q() {
        mf mfVar = this.N;
        return (mfVar == null || !(mfVar instanceof nf)) ? this.S : ((nf) mfVar).C0 + this.S;
    }

    public int R() {
        mf mfVar = this.N;
        return (mfVar == null || !(mfVar instanceof nf)) ? this.T : ((nf) mfVar).D0 + this.T;
    }

    public boolean S() {
        return this.y;
    }

    public void T(kf.b bVar, mf mfVar, kf.b bVar2, int i, int i2) {
        m(bVar).b(mfVar.m(bVar2), i, i2, true);
    }

    public final boolean U(int i) {
        kf kfVar;
        kf kfVar2;
        int i2 = i * 2;
        kf[] kfVarArr = this.J;
        kf kfVar3 = kfVarArr[i2];
        kf kfVar4 = kfVar3.d;
        return (kfVar4 == null || kfVar4.d == kfVar3 || (kfVar2 = (kfVar = kfVarArr[i2 + 1]).d) == null || kfVar2.d != kfVar) ? false : true;
    }

    public boolean V() {
        kf kfVar = this.B;
        kf kfVar2 = kfVar.d;
        if (kfVar2 == null || kfVar2.d != kfVar) {
            kf kfVar3 = this.D;
            kf kfVar4 = kfVar3.d;
            return kfVar4 != null && kfVar4.d == kfVar3;
        }
        return true;
    }

    public boolean W() {
        return this.z;
    }

    public boolean X() {
        kf kfVar = this.C;
        kf kfVar2 = kfVar.d;
        if (kfVar2 == null || kfVar2.d != kfVar) {
            kf kfVar3 = this.E;
            kf kfVar4 = kfVar3.d;
            return kfVar4 != null && kfVar4.d == kfVar3;
        }
        return true;
    }

    public void Y() {
        this.B.l();
        this.C.l();
        this.D.l();
        this.E.l();
        this.F.l();
        this.G.l();
        this.H.l();
        this.I.l();
        this.N = null;
        this.x = 0.0f;
        this.O = 0;
        this.P = 0;
        this.Q = 0.0f;
        this.R = -1;
        this.S = 0;
        this.T = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        float f = v0;
        this.b0 = f;
        this.c0 = f;
        b[] bVarArr = this.M;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.d0 = null;
        this.e0 = 0;
        this.f0 = 0;
        this.h0 = null;
        this.i0 = false;
        this.j0 = false;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = false;
        this.p0 = false;
        float[] fArr = this.q0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.j = -1;
        this.k = -1;
        int[] iArr = this.w;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.l = 0;
        this.m = 0;
        this.q = 1.0f;
        this.t = 1.0f;
        this.p = Integer.MAX_VALUE;
        this.s = Integer.MAX_VALUE;
        this.o = 0;
        this.r = 0;
        this.i = false;
        this.u = -1;
        this.v = 1.0f;
        this.k0 = false;
        this.l0 = false;
        boolean[] zArr = this.g;
        zArr[0] = true;
        zArr[1] = true;
        this.A = false;
        boolean[] zArr2 = this.L;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void Z() {
        mf G = G();
        if (G != null && (G instanceof nf) && ((nf) G()).W0()) {
            return;
        }
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            ((kf) this.K.get(i)).l();
        }
    }

    public void a0(i9 i9Var) {
        this.B.m(i9Var);
        this.C.m(i9Var);
        this.D.m(i9Var);
        this.E.m(i9Var);
        this.F.m(i9Var);
        this.I.m(i9Var);
        this.G.m(i9Var);
        this.H.m(i9Var);
    }

    public void b0(int i) {
        this.Y = i;
        this.y = i > 0;
    }

    public void c0(Object obj) {
        this.d0 = obj;
    }

    public final void d() {
        this.K.add(this.B);
        this.K.add(this.C);
        this.K.add(this.D);
        this.K.add(this.E);
        this.K.add(this.G);
        this.K.add(this.H);
        this.K.add(this.I);
        this.K.add(this.F);
    }

    public void d0(String str) {
        this.g0 = str;
    }

    public boolean e() {
        return (this instanceof i71) || (this instanceof oy);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please submit an issue!!! */
    public void e0(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.Q = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i2 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            i2 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            r3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r3);
            if (substring2.length() > 0) {
                f = Float.parseFloat(substring2);
            }
            f = i;
        } else {
            String substring3 = str.substring(r3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f = i;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.Q = f;
            this.R = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(androidx.appcompat.view.menu.j90 r48) {
        /*
            Method dump skipped, instructions count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.mf.f(androidx.appcompat.view.menu.j90):void");
    }

    public void f0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.S = i;
        this.T = i2;
        if (this.f0 == 8) {
            this.O = 0;
            this.P = 0;
            return;
        }
        b[] bVarArr = this.M;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i7 < (i6 = this.O)) {
            i7 = i6;
        }
        if (bVarArr[1] == bVar2 && i8 < (i5 = this.P)) {
            i8 = i5;
        }
        this.O = i7;
        this.P = i8;
        int i9 = this.a0;
        if (i8 < i9) {
            this.P = i9;
        }
        int i10 = this.Z;
        if (i7 < i10) {
            this.O = i10;
        }
    }

    public boolean g() {
        return this.f0 != 8;
    }

    public void g0(boolean z) {
        this.y = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0331 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0424 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(androidx.appcompat.view.menu.j90 r32, boolean r33, boolean r34, boolean r35, boolean r36, androidx.appcompat.view.menu.bw0 r37, androidx.appcompat.view.menu.bw0 r38, androidx.appcompat.view.menu.mf.b r39, boolean r40, androidx.appcompat.view.menu.kf r41, androidx.appcompat.view.menu.kf r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.mf.h(androidx.appcompat.view.menu.j90, boolean, boolean, boolean, boolean, androidx.appcompat.view.menu.bw0, androidx.appcompat.view.menu.bw0, androidx.appcompat.view.menu.mf$b, boolean, androidx.appcompat.view.menu.kf, androidx.appcompat.view.menu.kf, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void h0(int i) {
        this.P = i;
        int i2 = this.a0;
        if (i < i2) {
            this.P = i2;
        }
    }

    public void i(kf.b bVar, mf mfVar, kf.b bVar2, int i) {
        kf.b bVar3;
        kf.b bVar4;
        boolean z;
        kf.b bVar5 = kf.b.CENTER;
        if (bVar == bVar5) {
            if (bVar2 != bVar5) {
                kf.b bVar6 = kf.b.LEFT;
                if (bVar2 == bVar6 || bVar2 == kf.b.RIGHT) {
                    i(bVar6, mfVar, bVar2, 0);
                    i(kf.b.RIGHT, mfVar, bVar2, 0);
                    m(bVar5).a(mfVar.m(bVar2), 0);
                    return;
                }
                kf.b bVar7 = kf.b.TOP;
                if (bVar2 == bVar7 || bVar2 == kf.b.BOTTOM) {
                    i(bVar7, mfVar, bVar2, 0);
                    i(kf.b.BOTTOM, mfVar, bVar2, 0);
                    m(bVar5).a(mfVar.m(bVar2), 0);
                    return;
                }
                return;
            }
            kf.b bVar8 = kf.b.LEFT;
            kf m = m(bVar8);
            kf.b bVar9 = kf.b.RIGHT;
            kf m2 = m(bVar9);
            kf.b bVar10 = kf.b.TOP;
            kf m3 = m(bVar10);
            kf.b bVar11 = kf.b.BOTTOM;
            kf m4 = m(bVar11);
            boolean z2 = true;
            if ((m == null || !m.j()) && (m2 == null || !m2.j())) {
                i(bVar8, mfVar, bVar8, 0);
                i(bVar9, mfVar, bVar9, 0);
                z = true;
            } else {
                z = false;
            }
            if ((m3 == null || !m3.j()) && (m4 == null || !m4.j())) {
                i(bVar10, mfVar, bVar10, 0);
                i(bVar11, mfVar, bVar11, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                m(bVar5).a(mfVar.m(bVar5), 0);
                return;
            } else if (z) {
                kf.b bVar12 = kf.b.CENTER_X;
                m(bVar12).a(mfVar.m(bVar12), 0);
                return;
            } else if (z2) {
                kf.b bVar13 = kf.b.CENTER_Y;
                m(bVar13).a(mfVar.m(bVar13), 0);
                return;
            } else {
                return;
            }
        }
        kf.b bVar14 = kf.b.CENTER_X;
        if (bVar == bVar14 && (bVar2 == (bVar4 = kf.b.LEFT) || bVar2 == kf.b.RIGHT)) {
            kf m5 = m(bVar4);
            kf m6 = mfVar.m(bVar2);
            kf m7 = m(kf.b.RIGHT);
            m5.a(m6, 0);
            m7.a(m6, 0);
            m(bVar14).a(m6, 0);
            return;
        }
        kf.b bVar15 = kf.b.CENTER_Y;
        if (bVar == bVar15 && (bVar2 == (bVar3 = kf.b.TOP) || bVar2 == kf.b.BOTTOM)) {
            kf m8 = mfVar.m(bVar2);
            m(bVar3).a(m8, 0);
            m(kf.b.BOTTOM).a(m8, 0);
            m(bVar15).a(m8, 0);
        } else if (bVar == bVar14 && bVar2 == bVar14) {
            kf.b bVar16 = kf.b.LEFT;
            m(bVar16).a(mfVar.m(bVar16), 0);
            kf.b bVar17 = kf.b.RIGHT;
            m(bVar17).a(mfVar.m(bVar17), 0);
            m(bVar14).a(mfVar.m(bVar2), 0);
        } else if (bVar == bVar15 && bVar2 == bVar15) {
            kf.b bVar18 = kf.b.TOP;
            m(bVar18).a(mfVar.m(bVar18), 0);
            kf.b bVar19 = kf.b.BOTTOM;
            m(bVar19).a(mfVar.m(bVar19), 0);
            m(bVar15).a(mfVar.m(bVar2), 0);
        } else {
            kf m9 = m(bVar);
            kf m10 = mfVar.m(bVar2);
            if (m9.k(m10)) {
                kf.b bVar20 = kf.b.BASELINE;
                if (bVar == bVar20) {
                    kf m11 = m(kf.b.TOP);
                    kf m12 = m(kf.b.BOTTOM);
                    if (m11 != null) {
                        m11.l();
                    }
                    if (m12 != null) {
                        m12.l();
                    }
                    i = 0;
                } else if (bVar == kf.b.TOP || bVar == kf.b.BOTTOM) {
                    kf m13 = m(bVar20);
                    if (m13 != null) {
                        m13.l();
                    }
                    kf m14 = m(bVar5);
                    if (m14.g() != m10) {
                        m14.l();
                    }
                    kf d = m(bVar).d();
                    kf m15 = m(bVar15);
                    if (m15.j()) {
                        d.l();
                        m15.l();
                    }
                } else if (bVar == kf.b.LEFT || bVar == kf.b.RIGHT) {
                    kf m16 = m(bVar5);
                    if (m16.g() != m10) {
                        m16.l();
                    }
                    kf d2 = m(bVar).d();
                    kf m17 = m(bVar14);
                    if (m17.j()) {
                        d2.l();
                        m17.l();
                    }
                }
                m9.a(m10, i);
            }
        }
    }

    public void i0(float f) {
        this.b0 = f;
    }

    public void j(kf kfVar, kf kfVar2, int i) {
        if (kfVar.e() == this) {
            i(kfVar.h(), kfVar2.e(), kfVar2.h(), i);
        }
    }

    public void j0(int i) {
        this.m0 = i;
    }

    public void k(mf mfVar, float f, int i) {
        kf.b bVar = kf.b.CENTER;
        T(bVar, mfVar, bVar, i, 0);
        this.x = f;
    }

    public void k0(int i, int i2) {
        this.S = i;
        int i3 = i2 - i;
        this.O = i3;
        int i4 = this.Z;
        if (i3 < i4) {
            this.O = i4;
        }
    }

    public void l(j90 j90Var) {
        j90Var.q(this.B);
        j90Var.q(this.C);
        j90Var.q(this.D);
        j90Var.q(this.E);
        if (this.Y > 0) {
            j90Var.q(this.F);
        }
    }

    public void l0(b bVar) {
        this.M[0] = bVar;
    }

    public kf m(kf.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return this.B;
            case 2:
                return this.C;
            case t02.c.c /* 3 */:
                return this.D;
            case 4:
                return this.E;
            case t02.c.e /* 5 */:
                return this.F;
            case t02.c.f /* 6 */:
                return this.I;
            case t02.c.g /* 7 */:
                return this.G;
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                return this.H;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void m0(int i, int i2, int i3, float f) {
        this.l = i;
        this.o = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.p = i3;
        this.q = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.l = 2;
    }

    public int n() {
        return this.Y;
    }

    public void n0(float f) {
        this.q0[0] = f;
    }

    public float o(int i) {
        if (i == 0) {
            return this.b0;
        }
        if (i == 1) {
            return this.c0;
        }
        return -1.0f;
    }

    public void o0(int i, boolean z) {
        this.L[i] = z;
    }

    public int p() {
        return R() + this.P;
    }

    public void p0(boolean z) {
        this.z = z;
    }

    public Object q() {
        return this.d0;
    }

    public void q0(boolean z) {
        this.A = z;
    }

    public String r() {
        return this.g0;
    }

    public void r0(int i) {
        this.w[1] = i;
    }

    public b s(int i) {
        if (i == 0) {
            return y();
        }
        if (i == 1) {
            return M();
        }
        return null;
    }

    public void s0(int i) {
        this.w[0] = i;
    }

    public float t() {
        return this.Q;
    }

    public void t0(int i) {
        if (i < 0) {
            this.a0 = 0;
        } else {
            this.a0 = i;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.h0 != null) {
            str = "type: " + this.h0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.g0 != null) {
            str2 = "id: " + this.g0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.S);
        sb.append(", ");
        sb.append(this.T);
        sb.append(") - (");
        sb.append(this.O);
        sb.append(" x ");
        sb.append(this.P);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.R;
    }

    public void u0(int i) {
        if (i < 0) {
            this.Z = 0;
        } else {
            this.Z = i;
        }
    }

    public int v() {
        if (this.f0 == 8) {
            return 0;
        }
        return this.P;
    }

    public void v0(int i, int i2) {
        this.S = i;
        this.T = i2;
    }

    public float w() {
        return this.b0;
    }

    public void w0(mf mfVar) {
        this.N = mfVar;
    }

    public int x() {
        return this.m0;
    }

    public void x0(float f) {
        this.c0 = f;
    }

    public b y() {
        return this.M[0];
    }

    public void y0(int i) {
        this.n0 = i;
    }

    public int z() {
        kf kfVar = this.B;
        int i = kfVar != null ? kfVar.e : 0;
        kf kfVar2 = this.D;
        return kfVar2 != null ? i + kfVar2.e : i;
    }

    public void z0(int i, int i2) {
        this.T = i;
        int i3 = i2 - i;
        this.P = i3;
        int i4 = this.a0;
        if (i3 < i4) {
            this.P = i4;
        }
    }
}
