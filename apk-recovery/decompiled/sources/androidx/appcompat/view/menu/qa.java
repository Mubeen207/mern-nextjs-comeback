package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class qa extends b81 {
    public ArrayList k;
    public int l;

    public qa(mf mfVar, int i) {
        super(mfVar);
        this.k = new ArrayList();
        this.f = i;
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ad, code lost:
        if (r1 != r7) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01d3, code lost:
        if (r1 != r7) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d5, code lost:
        r13 = r13 + 1;
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d8, code lost:
        r9.e.d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0416, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    @Override // androidx.appcompat.view.menu.b81, androidx.appcompat.view.menu.jl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.appcompat.view.menu.jl r26) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.qa.a(androidx.appcompat.view.menu.jl):void");
    }

    @Override // androidx.appcompat.view.menu.b81
    public void d() {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((b81) it.next()).d();
        }
        int size = this.k.size();
        if (size < 1) {
            return;
        }
        mf mfVar = ((b81) this.k.get(0)).b;
        mf mfVar2 = ((b81) this.k.get(size - 1)).b;
        if (this.f == 0) {
            kf kfVar = mfVar.B;
            kf kfVar2 = mfVar2.D;
            nl i = i(kfVar, 0);
            int c = kfVar.c();
            mf r = r();
            if (r != null) {
                c = r.B.c();
            }
            if (i != null) {
                b(this.h, i, c);
            }
            nl i2 = i(kfVar2, 0);
            int c2 = kfVar2.c();
            mf s = s();
            if (s != null) {
                c2 = s.D.c();
            }
            if (i2 != null) {
                b(this.i, i2, -c2);
            }
        } else {
            kf kfVar3 = mfVar.C;
            kf kfVar4 = mfVar2.E;
            nl i3 = i(kfVar3, 1);
            int c3 = kfVar3.c();
            mf r2 = r();
            if (r2 != null) {
                c3 = r2.C.c();
            }
            if (i3 != null) {
                b(this.h, i3, c3);
            }
            nl i4 = i(kfVar4, 1);
            int c4 = kfVar4.c();
            mf s2 = s();
            if (s2 != null) {
                c4 = s2.E.c();
            }
            if (i4 != null) {
                b(this.i, i4, -c4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override // androidx.appcompat.view.menu.b81
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            ((b81) this.k.get(i)).e();
        }
    }

    @Override // androidx.appcompat.view.menu.b81
    public void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((b81) it.next()).f();
        }
    }

    @Override // androidx.appcompat.view.menu.b81
    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            b81 b81Var = (b81) this.k.get(i);
            j = j + b81Var.h.f + b81Var.j() + b81Var.i.f;
        }
        return j;
    }

    @Override // androidx.appcompat.view.menu.b81
    public boolean m() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!((b81) this.k.get(i)).m()) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        mf mfVar;
        mf mfVar2 = this.b;
        mf H = mfVar2.H(this.f);
        while (true) {
            mf mfVar3 = H;
            mfVar = mfVar2;
            mfVar2 = mfVar3;
            if (mfVar2 == null) {
                break;
            }
            H = mfVar2.H(this.f);
        }
        this.b = mfVar;
        this.k.add(mfVar.J(this.f));
        mf F = mfVar.F(this.f);
        while (F != null) {
            this.k.add(F.J(this.f));
            F = F.F(this.f);
        }
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            b81 b81Var = (b81) it.next();
            int i = this.f;
            if (i == 0) {
                b81Var.b.c = this;
            } else if (i == 1) {
                b81Var.b.d = this;
            }
        }
        if (this.f == 0 && ((nf) this.b.G()).a1() && this.k.size() > 1) {
            ArrayList arrayList = this.k;
            this.b = ((b81) arrayList.get(arrayList.size() - 1)).b;
        }
        this.l = this.f == 0 ? this.b.x() : this.b.L();
    }

    public final mf r() {
        for (int i = 0; i < this.k.size(); i++) {
            b81 b81Var = (b81) this.k.get(i);
            if (b81Var.b.O() != 8) {
                return b81Var.b;
            }
        }
        return null;
    }

    public final mf s() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            b81 b81Var = (b81) this.k.get(size);
            if (b81Var.b.O() != 8) {
                return b81Var.b;
            }
        }
        return null;
    }

    public String toString() {
        Iterator it;
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        while (this.k.iterator().hasNext()) {
            sb2 = ((sb2 + "<") + ((b81) it.next())) + "> ";
        }
        return sb2;
    }
}
