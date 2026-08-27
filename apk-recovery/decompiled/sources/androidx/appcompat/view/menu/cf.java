package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.bb;
/* loaded from: classes.dex */
public class cf extends v8 {
    public final int y;
    public final u8 z;

    public cf(int i, u8 u8Var, kw kwVar) {
        super(i, kwVar);
        this.y = i;
        this.z = u8Var;
        if (u8Var == u8.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + go0.b(v8.class).c() + " instead").toString());
        } else if (i >= 1) {
        } else {
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
        }
    }

    public static /* synthetic */ Object B0(cf cfVar, Object obj, xg xgVar) {
        n31 d;
        Object E0 = cfVar.E0(obj, true);
        if (E0 instanceof bb.a) {
            bb.c(E0);
            kw kwVar = cfVar.n;
            if (kwVar == null || (d = qg0.d(kwVar, obj, null, 2, null)) == null) {
                throw cfVar.K();
            }
            pp.a(d, cfVar.K());
            throw d;
        }
        return u31.a;
    }

    public final Object C0(Object obj, boolean z) {
        kw kwVar;
        n31 d;
        Object y = super.y(obj);
        if (bb.e(y) || bb.d(y)) {
            return y;
        }
        if (!z || (kwVar = this.n) == null || (d = qg0.d(kwVar, obj, null, 2, null)) == null) {
            return bb.a.c(u31.a);
        }
        throw d;
    }

    public final Object D0(Object obj) {
        db dbVar;
        py0 py0Var = w8.d;
        db dbVar2 = (db) v8.t.get(this);
        while (true) {
            long andIncrement = v8.p.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean U = U(andIncrement);
            int i = w8.b;
            long j2 = j / i;
            int i2 = (int) (j % i);
            if (dbVar2.o != j2) {
                db F = F(j2, dbVar2);
                if (F != null) {
                    dbVar = F;
                } else if (U) {
                    return bb.a.a(K());
                }
            } else {
                dbVar = dbVar2;
            }
            int w0 = w0(dbVar, i2, obj, j, py0Var, U);
            if (w0 == 0) {
                dbVar.b();
                return bb.a.c(u31.a);
            } else if (w0 == 1) {
                return bb.a.c(u31.a);
            } else {
                if (w0 == 2) {
                    if (U) {
                        dbVar.p();
                        return bb.a.a(K());
                    }
                    p71 p71Var = py0Var instanceof p71 ? (p71) py0Var : null;
                    if (p71Var != null) {
                        i0(p71Var, dbVar, i2);
                    }
                    B((dbVar.o * i) + i2);
                    return bb.a.c(u31.a);
                } else if (w0 == 3) {
                    throw new IllegalStateException("unexpected".toString());
                } else {
                    if (w0 == 4) {
                        if (j < J()) {
                            dbVar.b();
                        }
                        return bb.a.a(K());
                    }
                    if (w0 == 5) {
                        dbVar.b();
                    }
                    dbVar2 = dbVar;
                }
            }
        }
    }

    public final Object E0(Object obj, boolean z) {
        return this.z == u8.DROP_LATEST ? C0(obj, z) : D0(obj);
    }

    @Override // androidx.appcompat.view.menu.v8
    public boolean V() {
        return this.z == u8.DROP_OLDEST;
    }

    @Override // androidx.appcompat.view.menu.v8, androidx.appcompat.view.menu.os0
    public Object q(Object obj, xg xgVar) {
        return B0(this, obj, xgVar);
    }

    @Override // androidx.appcompat.view.menu.v8, androidx.appcompat.view.menu.os0
    public Object y(Object obj) {
        return E0(obj, false);
    }
}
