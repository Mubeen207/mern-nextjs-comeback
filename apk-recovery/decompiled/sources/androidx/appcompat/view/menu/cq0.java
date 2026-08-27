package androidx.appcompat.view.menu;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class cq0 {
    public static int h;
    public b81 c;
    public b81 d;
    public int f;
    public int g;
    public int a = 0;
    public boolean b = false;
    public ArrayList e = new ArrayList();

    public cq0(b81 b81Var, int i) {
        this.c = null;
        this.d = null;
        int i2 = h;
        this.f = i2;
        h = i2 + 1;
        this.c = b81Var;
        this.d = b81Var;
        this.g = i;
    }

    public void a(b81 b81Var) {
        this.e.add(b81Var);
        this.d = b81Var;
    }

    public long b(nf nfVar, int i) {
        long j;
        int i2;
        b81 b81Var = this.c;
        if (b81Var instanceof qa) {
            if (((qa) b81Var).f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(b81Var instanceof oz)) {
                return 0L;
            }
        } else if (!(b81Var instanceof n51)) {
            return 0L;
        }
        nl nlVar = (i == 0 ? nfVar.e : nfVar.f).h;
        nl nlVar2 = (i == 0 ? nfVar.e : nfVar.f).i;
        boolean contains = b81Var.h.l.contains(nlVar);
        boolean contains2 = this.c.i.l.contains(nlVar2);
        long j2 = this.c.j();
        if (contains && contains2) {
            long d = d(this.c.h, 0L);
            long c = c(this.c.i, 0L);
            long j3 = d - j2;
            b81 b81Var2 = this.c;
            int i3 = b81Var2.i.f;
            if (j3 >= (-i3)) {
                j3 += i3;
            }
            int i4 = b81Var2.h.f;
            long j4 = ((-c) - j2) - i4;
            if (j4 >= i4) {
                j4 -= i4;
            }
            float o = b81Var2.b.o(i);
            float f = (float) (o > 0.0f ? (((float) j4) / o) + (((float) j3) / (1.0f - o)) : 0L);
            long j5 = (f * o) + 0.5f + j2 + (f * (1.0f - o)) + 0.5f;
            b81 b81Var3 = this.c;
            j = b81Var3.h.f + j5;
            i2 = b81Var3.i.f;
        } else if (contains) {
            nl nlVar3 = this.c.h;
            return Math.max(d(nlVar3, nlVar3.f), this.c.h.f + j2);
        } else if (contains2) {
            nl nlVar4 = this.c.i;
            return Math.max(-c(nlVar4, nlVar4.f), (-this.c.i.f) + j2);
        } else {
            b81 b81Var4 = this.c;
            j = b81Var4.h.f + b81Var4.j();
            i2 = this.c.i.f;
        }
        return j - i2;
    }

    public final long c(nl nlVar, long j) {
        b81 b81Var = nlVar.d;
        if (b81Var instanceof jz) {
            return j;
        }
        int size = nlVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            jl jlVar = (jl) nlVar.k.get(i);
            if (jlVar instanceof nl) {
                nl nlVar2 = (nl) jlVar;
                if (nlVar2.d != b81Var) {
                    j2 = Math.min(j2, c(nlVar2, nlVar2.f + j));
                }
            }
        }
        if (nlVar == b81Var.i) {
            long j3 = j - b81Var.j();
            return Math.min(Math.min(j2, c(b81Var.h, j3)), j3 - b81Var.h.f);
        }
        return j2;
    }

    public final long d(nl nlVar, long j) {
        b81 b81Var = nlVar.d;
        if (b81Var instanceof jz) {
            return j;
        }
        int size = nlVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            jl jlVar = (jl) nlVar.k.get(i);
            if (jlVar instanceof nl) {
                nl nlVar2 = (nl) jlVar;
                if (nlVar2.d != b81Var) {
                    j2 = Math.max(j2, d(nlVar2, nlVar2.f + j));
                }
            }
        }
        if (nlVar == b81Var.h) {
            long j3 = j + b81Var.j();
            return Math.max(Math.max(j2, d(b81Var.i, j3)), j3 - b81Var.i.f);
        }
        return j2;
    }
}
