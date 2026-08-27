package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.mf;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class e8 {
    public final ArrayList a = new ArrayList();
    public a b = new a();
    public nf c;

    /* loaded from: classes.dex */
    public static class a {
        public mf.b a;
        public mf.b b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public boolean j;
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(mf mfVar, a aVar);
    }

    public e8(nf nfVar) {
        this.c = nfVar;
    }

    public final boolean a(b bVar, mf mfVar, boolean z) {
        this.b.a = mfVar.y();
        this.b.b = mfVar.M();
        this.b.c = mfVar.P();
        this.b.d = mfVar.v();
        a aVar = this.b;
        aVar.i = false;
        aVar.j = z;
        mf.b bVar2 = aVar.a;
        mf.b bVar3 = mf.b.MATCH_CONSTRAINT;
        boolean z2 = bVar2 == bVar3;
        boolean z3 = aVar.b == bVar3;
        boolean z4 = z2 && mfVar.Q > 0.0f;
        boolean z5 = z3 && mfVar.Q > 0.0f;
        if (z4 && mfVar.n[0] == 4) {
            aVar.a = mf.b.FIXED;
        }
        if (z5 && mfVar.n[1] == 4) {
            aVar.b = mf.b.FIXED;
        }
        bVar.b(mfVar, aVar);
        mfVar.E0(this.b.e);
        mfVar.h0(this.b.f);
        mfVar.g0(this.b.h);
        mfVar.b0(this.b.g);
        a aVar2 = this.b;
        aVar2.j = false;
        return aVar2.i;
    }

    public final void b(nf nfVar) {
        int size = nfVar.w0.size();
        b U0 = nfVar.U0();
        for (int i = 0; i < size; i++) {
            mf mfVar = (mf) nfVar.w0.get(i);
            if (!(mfVar instanceof oy) && (!mfVar.e.e.j || !mfVar.f.e.j)) {
                mf.b s = mfVar.s(0);
                mf.b s2 = mfVar.s(1);
                mf.b bVar = mf.b.MATCH_CONSTRAINT;
                if (s != bVar || mfVar.l == 1 || s2 != bVar || mfVar.m == 1) {
                    a(U0, mfVar, false);
                }
            }
        }
        U0.a();
    }

    public final void c(nf nfVar, String str, int i, int i2) {
        int E = nfVar.E();
        int D = nfVar.D();
        nfVar.u0(0);
        nfVar.t0(0);
        nfVar.E0(i);
        nfVar.h0(i2);
        nfVar.u0(E);
        nfVar.t0(D);
        this.c.K0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x02cb, code lost:
        if (r10 != false) goto L172;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long d(androidx.appcompat.view.menu.nf r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e8.d(androidx.appcompat.view.menu.nf, int, int, int, int, int, int, int, int, int):long");
    }

    public void e(nf nfVar) {
        int i;
        this.a.clear();
        int size = nfVar.w0.size();
        while (i < size) {
            mf mfVar = (mf) nfVar.w0.get(i);
            mf.b y = mfVar.y();
            mf.b bVar = mf.b.MATCH_CONSTRAINT;
            if (y != bVar) {
                mf.b y2 = mfVar.y();
                mf.b bVar2 = mf.b.MATCH_PARENT;
                i = (y2 == bVar2 || mfVar.M() == bVar || mfVar.M() == bVar2) ? 0 : i + 1;
            }
            this.a.add(mfVar);
        }
        nfVar.X0();
    }
}
