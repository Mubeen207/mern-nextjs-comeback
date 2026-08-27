package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.e8;
import androidx.appcompat.view.menu.mf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public class ml {
    public nf a;
    public nf d;
    public boolean b = true;
    public boolean c = true;
    public ArrayList e = new ArrayList();
    public ArrayList f = new ArrayList();
    public e8.b g = null;
    public e8.a h = new e8.a();
    public ArrayList i = new ArrayList();

    public ml(nf nfVar) {
        this.a = nfVar;
        this.d = nfVar;
    }

    public final void a(nl nlVar, int i, int i2, nl nlVar2, ArrayList arrayList, cq0 cq0Var) {
        b81 b81Var = nlVar.d;
        if (b81Var.c == null) {
            nf nfVar = this.a;
            if (b81Var == nfVar.e || b81Var == nfVar.f) {
                return;
            }
            if (cq0Var == null) {
                cq0Var = new cq0(b81Var, i2);
                arrayList.add(cq0Var);
            }
            b81Var.c = cq0Var;
            cq0Var.a(b81Var);
            for (jl jlVar : b81Var.h.k) {
                if (jlVar instanceof nl) {
                    a((nl) jlVar, i, 0, nlVar2, arrayList, cq0Var);
                }
            }
            for (jl jlVar2 : b81Var.i.k) {
                if (jlVar2 instanceof nl) {
                    a((nl) jlVar2, i, 1, nlVar2, arrayList, cq0Var);
                }
            }
            if (i == 1 && (b81Var instanceof n51)) {
                for (jl jlVar3 : ((n51) b81Var).k.k) {
                    if (jlVar3 instanceof nl) {
                        a((nl) jlVar3, i, 2, nlVar2, arrayList, cq0Var);
                    }
                }
            }
            for (nl nlVar3 : b81Var.h.l) {
                if (nlVar3 == nlVar2) {
                    cq0Var.b = true;
                }
                a(nlVar3, i, 0, nlVar2, arrayList, cq0Var);
            }
            for (nl nlVar4 : b81Var.i.l) {
                if (nlVar4 == nlVar2) {
                    cq0Var.b = true;
                }
                a(nlVar4, i, 1, nlVar2, arrayList, cq0Var);
            }
            if (i == 1 && (b81Var instanceof n51)) {
                for (nl nlVar5 : ((n51) b81Var).k.l) {
                    a(nlVar5, i, 2, nlVar2, arrayList, cq0Var);
                }
            }
        }
    }

    public final boolean b(nf nfVar) {
        int i;
        mf.b bVar;
        int i2;
        mf.b bVar2;
        mf.b[] bVarArr;
        mf.b bVar3;
        mf.b bVar4;
        mf.b bVar5;
        mf.b bVar6;
        Iterator it = nfVar.w0.iterator();
        while (it.hasNext()) {
            mf mfVar = (mf) it.next();
            mf.b[] bVarArr2 = mfVar.M;
            mf.b bVar7 = bVarArr2[0];
            mf.b bVar8 = bVarArr2[1];
            if (mfVar.O() == 8) {
                mfVar.a = true;
            } else {
                if (mfVar.q < 1.0f && bVar7 == mf.b.MATCH_CONSTRAINT) {
                    mfVar.l = 2;
                }
                if (mfVar.t < 1.0f && bVar8 == mf.b.MATCH_CONSTRAINT) {
                    mfVar.m = 2;
                }
                if (mfVar.t() > 0.0f) {
                    mf.b bVar9 = mf.b.MATCH_CONSTRAINT;
                    if (bVar7 == bVar9 && (bVar8 == mf.b.WRAP_CONTENT || bVar8 == mf.b.FIXED)) {
                        mfVar.l = 3;
                    } else if (bVar8 == bVar9 && (bVar7 == mf.b.WRAP_CONTENT || bVar7 == mf.b.FIXED)) {
                        mfVar.m = 3;
                    } else if (bVar7 == bVar9 && bVar8 == bVar9) {
                        if (mfVar.l == 0) {
                            mfVar.l = 3;
                        }
                        if (mfVar.m == 0) {
                            mfVar.m = 3;
                        }
                    }
                }
                mf.b bVar10 = mf.b.MATCH_CONSTRAINT;
                if (bVar7 == bVar10 && mfVar.l == 1 && (mfVar.B.d == null || mfVar.D.d == null)) {
                    bVar7 = mf.b.WRAP_CONTENT;
                }
                mf.b bVar11 = bVar7;
                if (bVar8 == bVar10 && mfVar.m == 1 && (mfVar.C.d == null || mfVar.E.d == null)) {
                    bVar8 = mf.b.WRAP_CONTENT;
                }
                mf.b bVar12 = bVar8;
                oz ozVar = mfVar.e;
                ozVar.d = bVar11;
                int i3 = mfVar.l;
                ozVar.a = i3;
                n51 n51Var = mfVar.f;
                n51Var.d = bVar12;
                int i4 = mfVar.m;
                n51Var.a = i4;
                mf.b bVar13 = mf.b.MATCH_PARENT;
                if ((bVar11 == bVar13 || bVar11 == mf.b.FIXED || bVar11 == mf.b.WRAP_CONTENT) && (bVar12 == bVar13 || bVar12 == mf.b.FIXED || bVar12 == mf.b.WRAP_CONTENT)) {
                    int P = mfVar.P();
                    if (bVar11 == bVar13) {
                        i = (nfVar.P() - mfVar.B.e) - mfVar.D.e;
                        bVar = mf.b.FIXED;
                    } else {
                        i = P;
                        bVar = bVar11;
                    }
                    int v = mfVar.v();
                    if (bVar12 == bVar13) {
                        i2 = (nfVar.v() - mfVar.C.e) - mfVar.E.e;
                        bVar2 = mf.b.FIXED;
                    } else {
                        i2 = v;
                        bVar2 = bVar12;
                    }
                    l(mfVar, bVar, i, bVar2, i2);
                    mfVar.e.e.d(mfVar.P());
                    mfVar.f.e.d(mfVar.v());
                    mfVar.a = true;
                } else {
                    if (bVar11 == bVar10 && (bVar12 == (bVar6 = mf.b.WRAP_CONTENT) || bVar12 == mf.b.FIXED)) {
                        if (i3 == 3) {
                            if (bVar12 == bVar6) {
                                l(mfVar, bVar6, 0, bVar6, 0);
                            }
                            int v2 = mfVar.v();
                            mf.b bVar14 = mf.b.FIXED;
                            l(mfVar, bVar14, (int) ((v2 * mfVar.Q) + 0.5f), bVar14, v2);
                            mfVar.e.e.d(mfVar.P());
                            mfVar.f.e.d(mfVar.v());
                            mfVar.a = true;
                        } else if (i3 == 1) {
                            l(mfVar, bVar6, 0, bVar12, 0);
                            mfVar.e.e.m = mfVar.P();
                        } else if (i3 == 2) {
                            mf.b bVar15 = nfVar.M[0];
                            mf.b bVar16 = mf.b.FIXED;
                            if (bVar15 == bVar16 || bVar15 == bVar13) {
                                l(mfVar, bVar16, (int) ((mfVar.q * nfVar.P()) + 0.5f), bVar12, mfVar.v());
                                mfVar.e.e.d(mfVar.P());
                                mfVar.f.e.d(mfVar.v());
                                mfVar.a = true;
                            }
                        } else {
                            kf[] kfVarArr = mfVar.J;
                            if (kfVarArr[0].d == null || kfVarArr[1].d == null) {
                                l(mfVar, bVar6, 0, bVar12, 0);
                                mfVar.e.e.d(mfVar.P());
                                mfVar.f.e.d(mfVar.v());
                                mfVar.a = true;
                            }
                        }
                    }
                    if (bVar12 == bVar10 && (bVar11 == (bVar5 = mf.b.WRAP_CONTENT) || bVar11 == mf.b.FIXED)) {
                        if (i4 == 3) {
                            if (bVar11 == bVar5) {
                                l(mfVar, bVar5, 0, bVar5, 0);
                            }
                            int P2 = mfVar.P();
                            float f = mfVar.Q;
                            if (mfVar.u() == -1) {
                                f = 1.0f / f;
                            }
                            mf.b bVar17 = mf.b.FIXED;
                            l(mfVar, bVar17, P2, bVar17, (int) ((P2 * f) + 0.5f));
                            mfVar.e.e.d(mfVar.P());
                            mfVar.f.e.d(mfVar.v());
                            mfVar.a = true;
                        } else if (i4 == 1) {
                            l(mfVar, bVar11, 0, bVar5, 0);
                            mfVar.f.e.m = mfVar.v();
                        } else if (i4 == 2) {
                            mf.b bVar18 = nfVar.M[1];
                            mf.b bVar19 = mf.b.FIXED;
                            if (bVar18 == bVar19 || bVar18 == bVar13) {
                                l(mfVar, bVar11, mfVar.P(), bVar19, (int) ((mfVar.t * nfVar.v()) + 0.5f));
                                mfVar.e.e.d(mfVar.P());
                                mfVar.f.e.d(mfVar.v());
                                mfVar.a = true;
                            }
                        } else {
                            kf[] kfVarArr2 = mfVar.J;
                            if (kfVarArr2[2].d == null || kfVarArr2[3].d == null) {
                                l(mfVar, bVar5, 0, bVar12, 0);
                                mfVar.e.e.d(mfVar.P());
                                mfVar.f.e.d(mfVar.v());
                                mfVar.a = true;
                            }
                        }
                    }
                    if (bVar11 == bVar10 && bVar12 == bVar10) {
                        if (i3 == 1 || i4 == 1) {
                            mf.b bVar20 = mf.b.WRAP_CONTENT;
                            l(mfVar, bVar20, 0, bVar20, 0);
                            mfVar.e.e.m = mfVar.P();
                            mfVar.f.e.m = mfVar.v();
                        } else if (i4 == 2 && i3 == 2 && ((bVar3 = (bVarArr = nfVar.M)[0]) == (bVar4 = mf.b.FIXED) || bVar3 == bVar4)) {
                            mf.b bVar21 = bVarArr[1];
                            if (bVar21 == bVar4 || bVar21 == bVar4) {
                                l(mfVar, bVar4, (int) ((mfVar.q * nfVar.P()) + 0.5f), bVar4, (int) ((mfVar.t * nfVar.v()) + 0.5f));
                                mfVar.e.e.d(mfVar.P());
                                mfVar.f.e.d(mfVar.v());
                                mfVar.a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void c() {
        d(this.e);
        this.i.clear();
        cq0.h = 0;
        i(this.a.e, 0, this.i);
        i(this.a.f, 1, this.i);
        this.b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.d.e.f();
        this.d.f.f();
        arrayList.add(this.d.e);
        arrayList.add(this.d.f);
        Iterator it = this.d.w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            mf mfVar = (mf) it.next();
            if (mfVar instanceof oy) {
                arrayList.add(new py(mfVar));
            } else {
                if (mfVar.V()) {
                    if (mfVar.c == null) {
                        mfVar.c = new qa(mfVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(mfVar.c);
                } else {
                    arrayList.add(mfVar.e);
                }
                if (mfVar.X()) {
                    if (mfVar.d == null) {
                        mfVar.d = new qa(mfVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(mfVar.d);
                } else {
                    arrayList.add(mfVar.f);
                }
                if (mfVar instanceof kz) {
                    arrayList.add(new jz(mfVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((b81) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            b81 b81Var = (b81) it3.next();
            if (b81Var.b != this.d) {
                b81Var.d();
            }
        }
    }

    public final int e(nf nfVar, int i) {
        int size = this.i.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, ((cq0) this.i.get(i2)).b(nfVar, i));
        }
        return (int) j;
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.b || this.c) {
            Iterator it = this.a.w0.iterator();
            while (it.hasNext()) {
                mf mfVar = (mf) it.next();
                mfVar.a = false;
                mfVar.e.r();
                mfVar.f.q();
            }
            nf nfVar = this.a;
            nfVar.a = false;
            nfVar.e.r();
            this.a.f.q();
            this.c = false;
        }
        if (b(this.d)) {
            return false;
        }
        this.a.F0(0);
        this.a.G0(0);
        mf.b s = this.a.s(0);
        mf.b s2 = this.a.s(1);
        if (this.b) {
            c();
        }
        int Q = this.a.Q();
        int R = this.a.R();
        this.a.e.h.d(Q);
        this.a.f.h.d(R);
        m();
        mf.b bVar = mf.b.WRAP_CONTENT;
        if (s == bVar || s2 == bVar) {
            if (z4) {
                Iterator it2 = this.e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!((b81) it2.next()).m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && s == mf.b.WRAP_CONTENT) {
                this.a.l0(mf.b.FIXED);
                nf nfVar2 = this.a;
                nfVar2.E0(e(nfVar2, 0));
                nf nfVar3 = this.a;
                nfVar3.e.e.d(nfVar3.P());
            }
            if (z4 && s2 == mf.b.WRAP_CONTENT) {
                this.a.A0(mf.b.FIXED);
                nf nfVar4 = this.a;
                nfVar4.h0(e(nfVar4, 1));
                nf nfVar5 = this.a;
                nfVar5.f.e.d(nfVar5.v());
            }
        }
        nf nfVar6 = this.a;
        mf.b bVar2 = nfVar6.M[0];
        mf.b bVar3 = mf.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == mf.b.MATCH_PARENT) {
            int P = nfVar6.P() + Q;
            this.a.e.i.d(P);
            this.a.e.e.d(P - Q);
            m();
            nf nfVar7 = this.a;
            mf.b bVar4 = nfVar7.M[1];
            if (bVar4 == bVar3 || bVar4 == mf.b.MATCH_PARENT) {
                int v = nfVar7.v() + R;
                this.a.f.i.d(v);
                this.a.f.e.d(v - R);
            }
            m();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator it3 = this.e.iterator();
        while (it3.hasNext()) {
            b81 b81Var = (b81) it3.next();
            if (b81Var.b != this.a || b81Var.g) {
                b81Var.e();
            }
        }
        Iterator it4 = this.e.iterator();
        while (it4.hasNext()) {
            b81 b81Var2 = (b81) it4.next();
            if (z2 || b81Var2.b != this.a) {
                if (!b81Var2.h.j || ((!b81Var2.i.j && !(b81Var2 instanceof py)) || (!b81Var2.e.j && !(b81Var2 instanceof qa) && !(b81Var2 instanceof py)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.a.l0(s);
        this.a.A0(s2);
        return z3;
    }

    public boolean g(boolean z) {
        if (this.b) {
            Iterator it = this.a.w0.iterator();
            while (it.hasNext()) {
                mf mfVar = (mf) it.next();
                mfVar.a = false;
                oz ozVar = mfVar.e;
                ozVar.e.j = false;
                ozVar.g = false;
                ozVar.r();
                n51 n51Var = mfVar.f;
                n51Var.e.j = false;
                n51Var.g = false;
                n51Var.q();
            }
            nf nfVar = this.a;
            nfVar.a = false;
            oz ozVar2 = nfVar.e;
            ozVar2.e.j = false;
            ozVar2.g = false;
            ozVar2.r();
            n51 n51Var2 = this.a.f;
            n51Var2.e.j = false;
            n51Var2.g = false;
            n51Var2.q();
            c();
        }
        if (b(this.d)) {
            return false;
        }
        this.a.F0(0);
        this.a.G0(0);
        this.a.e.h.d(0);
        this.a.f.h.d(0);
        return true;
    }

    public boolean h(boolean z, int i) {
        boolean z2;
        mf.b bVar;
        boolean z3 = true;
        boolean z4 = z & true;
        mf.b s = this.a.s(0);
        mf.b s2 = this.a.s(1);
        int Q = this.a.Q();
        int R = this.a.R();
        if (z4 && (s == (bVar = mf.b.WRAP_CONTENT) || s2 == bVar)) {
            Iterator it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b81 b81Var = (b81) it.next();
                if (b81Var.f == i && !b81Var.m()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && s == mf.b.WRAP_CONTENT) {
                    this.a.l0(mf.b.FIXED);
                    nf nfVar = this.a;
                    nfVar.E0(e(nfVar, 0));
                    nf nfVar2 = this.a;
                    nfVar2.e.e.d(nfVar2.P());
                }
            } else if (z4 && s2 == mf.b.WRAP_CONTENT) {
                this.a.A0(mf.b.FIXED);
                nf nfVar3 = this.a;
                nfVar3.h0(e(nfVar3, 1));
                nf nfVar4 = this.a;
                nfVar4.f.e.d(nfVar4.v());
            }
        }
        if (i == 0) {
            nf nfVar5 = this.a;
            mf.b bVar2 = nfVar5.M[0];
            if (bVar2 == mf.b.FIXED || bVar2 == mf.b.MATCH_PARENT) {
                int P = nfVar5.P() + Q;
                this.a.e.i.d(P);
                this.a.e.e.d(P - Q);
                z2 = true;
            }
            z2 = false;
        } else {
            nf nfVar6 = this.a;
            mf.b bVar3 = nfVar6.M[1];
            if (bVar3 == mf.b.FIXED || bVar3 == mf.b.MATCH_PARENT) {
                int v = nfVar6.v() + R;
                this.a.f.i.d(v);
                this.a.f.e.d(v - R);
                z2 = true;
            }
            z2 = false;
        }
        m();
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            b81 b81Var2 = (b81) it2.next();
            if (b81Var2.f == i && (b81Var2.b != this.a || b81Var2.g)) {
                b81Var2.e();
            }
        }
        Iterator it3 = this.e.iterator();
        while (it3.hasNext()) {
            b81 b81Var3 = (b81) it3.next();
            if (b81Var3.f == i && (z2 || b81Var3.b != this.a)) {
                if (!b81Var3.h.j || !b81Var3.i.j || (!(b81Var3 instanceof qa) && !b81Var3.e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.a.l0(s);
        this.a.A0(s2);
        return z3;
    }

    public final void i(b81 b81Var, int i, ArrayList arrayList) {
        for (jl jlVar : b81Var.h.k) {
            if (jlVar instanceof nl) {
                a((nl) jlVar, i, 0, b81Var.i, arrayList, null);
            } else if (jlVar instanceof b81) {
                a(((b81) jlVar).h, i, 0, b81Var.i, arrayList, null);
            }
        }
        for (jl jlVar2 : b81Var.i.k) {
            if (jlVar2 instanceof nl) {
                a((nl) jlVar2, i, 1, b81Var.h, arrayList, null);
            } else if (jlVar2 instanceof b81) {
                a(((b81) jlVar2).i, i, 1, b81Var.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (jl jlVar3 : ((n51) b81Var).k.k) {
                if (jlVar3 instanceof nl) {
                    a((nl) jlVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    public void j() {
        this.b = true;
    }

    public void k() {
        this.c = true;
    }

    public final void l(mf mfVar, mf.b bVar, int i, mf.b bVar2, int i2) {
        e8.a aVar = this.h;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.g.b(mfVar, aVar);
        mfVar.E0(this.h.e);
        mfVar.h0(this.h.f);
        mfVar.g0(this.h.h);
        mfVar.b0(this.h.g);
    }

    public void m() {
        zl zlVar;
        Iterator it = this.a.w0.iterator();
        while (it.hasNext()) {
            mf mfVar = (mf) it.next();
            if (!mfVar.a) {
                mf.b[] bVarArr = mfVar.M;
                boolean z = false;
                mf.b bVar = bVarArr[0];
                mf.b bVar2 = bVarArr[1];
                int i = mfVar.l;
                int i2 = mfVar.m;
                mf.b bVar3 = mf.b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == mf.b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == bVar3 || (bVar2 == mf.b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                zl zlVar2 = mfVar.e.e;
                boolean z3 = zlVar2.j;
                zl zlVar3 = mfVar.f.e;
                boolean z4 = zlVar3.j;
                if (z3 && z4) {
                    mf.b bVar4 = mf.b.FIXED;
                    l(mfVar, bVar4, zlVar2.g, bVar4, zlVar3.g);
                    mfVar.a = true;
                } else if (z3 && z) {
                    l(mfVar, mf.b.FIXED, zlVar2.g, bVar3, zlVar3.g);
                    if (bVar2 == mf.b.MATCH_CONSTRAINT) {
                        mfVar.f.e.m = mfVar.v();
                    } else {
                        mfVar.f.e.d(mfVar.v());
                        mfVar.a = true;
                    }
                } else if (z4 && z2) {
                    l(mfVar, bVar3, zlVar2.g, mf.b.FIXED, zlVar3.g);
                    if (bVar == mf.b.MATCH_CONSTRAINT) {
                        mfVar.e.e.m = mfVar.P();
                    } else {
                        mfVar.e.e.d(mfVar.P());
                        mfVar.a = true;
                    }
                }
                if (mfVar.a && (zlVar = mfVar.f.l) != null) {
                    zlVar.d(mfVar.n());
                }
            }
        }
    }

    public void n(e8.b bVar) {
        this.g = bVar;
    }
}
