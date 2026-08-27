package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.b81;
import androidx.appcompat.view.menu.kf;
import androidx.appcompat.view.menu.mf;
import androidx.appcompat.view.menu.nl;
/* loaded from: classes.dex */
public class oz extends b81 {
    public static int[] k = new int[2];

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b81.b.values().length];
            a = iArr;
            try {
                iArr[b81.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b81.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b81.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public oz(mf mfVar) {
        super(mfVar);
        this.h.e = nl.a.LEFT;
        this.i.e = nl.a.RIGHT;
        this.f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02ba, code lost:
        if (r14 != 1) goto L131;
     */
    @Override // androidx.appcompat.view.menu.b81, androidx.appcompat.view.menu.jl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.appcompat.view.menu.jl r17) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.oz.a(androidx.appcompat.view.menu.jl):void");
    }

    @Override // androidx.appcompat.view.menu.b81
    public void d() {
        mf G;
        mf G2;
        mf mfVar = this.b;
        if (mfVar.a) {
            this.e.d(mfVar.P());
        }
        if (this.e.j) {
            mf.b bVar = this.d;
            mf.b bVar2 = mf.b.MATCH_PARENT;
            if (bVar == bVar2 && (((G = this.b.G()) != null && G.y() == mf.b.FIXED) || G.y() == bVar2)) {
                b(this.h, G.e.h, this.b.B.c());
                b(this.i, G.e.i, -this.b.D.c());
                return;
            }
        } else {
            mf.b y = this.b.y();
            this.d = y;
            if (y != mf.b.MATCH_CONSTRAINT) {
                mf.b bVar3 = mf.b.MATCH_PARENT;
                if (y == bVar3 && (((G2 = this.b.G()) != null && G2.y() == mf.b.FIXED) || G2.y() == bVar3)) {
                    int P = (G2.P() - this.b.B.c()) - this.b.D.c();
                    b(this.h, G2.e.h, this.b.B.c());
                    b(this.i, G2.e.i, -this.b.D.c());
                    this.e.d(P);
                    return;
                } else if (this.d == mf.b.FIXED) {
                    this.e.d(this.b.P());
                }
            }
        }
        zl zlVar = this.e;
        if (zlVar.j) {
            mf mfVar2 = this.b;
            if (mfVar2.a) {
                kf[] kfVarArr = mfVar2.J;
                kf kfVar = kfVarArr[0];
                kf kfVar2 = kfVar.d;
                if (kfVar2 != null && kfVarArr[1].d != null) {
                    if (mfVar2.V()) {
                        this.h.f = this.b.J[0].c();
                        this.i.f = -this.b.J[1].c();
                        return;
                    }
                    nl h = h(this.b.J[0]);
                    if (h != null) {
                        b(this.h, h, this.b.J[0].c());
                    }
                    nl h2 = h(this.b.J[1]);
                    if (h2 != null) {
                        b(this.i, h2, -this.b.J[1].c());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                } else if (kfVar2 != null) {
                    nl h3 = h(kfVar);
                    if (h3 != null) {
                        b(this.h, h3, this.b.J[0].c());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                } else {
                    kf kfVar3 = kfVarArr[1];
                    if (kfVar3.d != null) {
                        nl h4 = h(kfVar3);
                        if (h4 != null) {
                            b(this.i, h4, -this.b.J[1].c());
                            b(this.h, this.i, -this.e.g);
                            return;
                        }
                        return;
                    } else if ((mfVar2 instanceof iz) || mfVar2.G() == null || this.b.m(kf.b.CENTER).d != null) {
                        return;
                    } else {
                        b(this.h, this.b.G().e.h, this.b.Q());
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                }
            }
        }
        if (this.d == mf.b.MATCH_CONSTRAINT) {
            mf mfVar3 = this.b;
            int i = mfVar3.l;
            if (i == 2) {
                mf G3 = mfVar3.G();
                if (G3 != null) {
                    zl zlVar2 = G3.f.e;
                    this.e.l.add(zlVar2);
                    zlVar2.k.add(this.e);
                    zl zlVar3 = this.e;
                    zlVar3.b = true;
                    zlVar3.k.add(this.h);
                    this.e.k.add(this.i);
                }
            } else if (i == 3) {
                if (mfVar3.m == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    n51 n51Var = mfVar3.f;
                    n51Var.h.a = this;
                    n51Var.i.a = this;
                    zlVar.a = this;
                    if (mfVar3.X()) {
                        this.e.l.add(this.b.f.e);
                        this.b.f.e.k.add(this.e);
                        n51 n51Var2 = this.b.f;
                        n51Var2.e.a = this;
                        this.e.l.add(n51Var2.h);
                        this.e.l.add(this.b.f.i);
                        this.b.f.h.k.add(this.e);
                        this.b.f.i.k.add(this.e);
                    } else if (this.b.V()) {
                        this.b.f.e.l.add(this.e);
                        this.e.k.add(this.b.f.e);
                    } else {
                        this.b.f.e.l.add(this.e);
                    }
                } else {
                    zl zlVar4 = mfVar3.f.e;
                    zlVar.l.add(zlVar4);
                    zlVar4.k.add(this.e);
                    this.b.f.h.k.add(this.e);
                    this.b.f.i.k.add(this.e);
                    zl zlVar5 = this.e;
                    zlVar5.b = true;
                    zlVar5.k.add(this.h);
                    this.e.k.add(this.i);
                    this.h.l.add(this.e);
                    this.i.l.add(this.e);
                }
            }
        }
        mf mfVar4 = this.b;
        kf[] kfVarArr2 = mfVar4.J;
        kf kfVar4 = kfVarArr2[0];
        kf kfVar5 = kfVar4.d;
        if (kfVar5 != null && kfVarArr2[1].d != null) {
            if (mfVar4.V()) {
                this.h.f = this.b.J[0].c();
                this.i.f = -this.b.J[1].c();
                return;
            }
            nl h5 = h(this.b.J[0]);
            nl h6 = h(this.b.J[1]);
            h5.b(this);
            h6.b(this);
            this.j = b81.b.CENTER;
        } else if (kfVar5 != null) {
            nl h7 = h(kfVar4);
            if (h7 != null) {
                b(this.h, h7, this.b.J[0].c());
                c(this.i, this.h, 1, this.e);
            }
        } else {
            kf kfVar6 = kfVarArr2[1];
            if (kfVar6.d != null) {
                nl h8 = h(kfVar6);
                if (h8 != null) {
                    b(this.i, h8, -this.b.J[1].c());
                    c(this.h, this.i, -1, this.e);
                }
            } else if ((mfVar4 instanceof iz) || mfVar4.G() == null) {
            } else {
                b(this.h, this.b.G().e.h, this.b.Q());
                c(this.i, this.h, 1, this.e);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.b81
    public void e() {
        nl nlVar = this.h;
        if (nlVar.j) {
            this.b.F0(nlVar.g);
        }
    }

    @Override // androidx.appcompat.view.menu.b81
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // androidx.appcompat.view.menu.b81
    public boolean m() {
        return this.d != mf.b.MATCH_CONSTRAINT || this.b.l == 0;
    }

    public final void q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else if (i5 != 1) {
                return;
            } else {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public void r() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.b.r();
    }
}
