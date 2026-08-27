package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.ah;
/* loaded from: classes.dex */
public abstract class xa extends ua {
    public final xs d;

    /* loaded from: classes.dex */
    public static final class a extends oy0 implements yw {
        public int q;
        public /* synthetic */ Object r;

        public a(xg xgVar) {
            super(2, xgVar);
        }

        @Override // androidx.appcompat.view.menu.y7
        public final xg a(Object obj, xg xgVar) {
            a aVar = new a(xgVar);
            aVar.r = obj;
            return aVar;
        }

        @Override // androidx.appcompat.view.menu.y7
        public final Object k(Object obj) {
            Object c;
            c = f60.c();
            int i = this.q;
            if (i == 0) {
                rp0.b(obj);
                xa xaVar = xa.this;
                this.q = 1;
                if (xaVar.m((ys) this.r, this) == c) {
                    return c;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                rp0.b(obj);
            }
            return u31.a;
        }

        @Override // androidx.appcompat.view.menu.yw
        /* renamed from: o */
        public final Object h(ys ysVar, xg xgVar) {
            return ((a) a(ysVar, xgVar)).k(u31.a);
        }
    }

    public xa(xs xsVar, kh khVar, int i, u8 u8Var) {
        super(khVar, i, u8Var);
        this.d = xsVar;
    }

    public static /* synthetic */ Object j(xa xaVar, ys ysVar, xg xgVar) {
        Object c;
        Object c2;
        Object c3;
        if (xaVar.b == -3) {
            kh b = xgVar.b();
            kh o = b.o(xaVar.a);
            if (c60.a(o, b)) {
                Object m = xaVar.m(ysVar, xgVar);
                c3 = f60.c();
                return m == c3 ? m : u31.a;
            }
            ah.b bVar = ah.b;
            if (c60.a(o.d(bVar), b.d(bVar))) {
                Object l = xaVar.l(ysVar, o, xgVar);
                c2 = f60.c();
                return l == c2 ? l : u31.a;
            }
        }
        Object b2 = super.b(ysVar, xgVar);
        c = f60.c();
        return b2 == c ? b2 : u31.a;
    }

    public static /* synthetic */ Object k(xa xaVar, jk0 jk0Var, xg xgVar) {
        Object c;
        Object m = xaVar.m(new rs0(jk0Var), xgVar);
        c = f60.c();
        return m == c ? m : u31.a;
    }

    @Override // androidx.appcompat.view.menu.ua, androidx.appcompat.view.menu.xs
    public Object b(ys ysVar, xg xgVar) {
        return j(this, ysVar, xgVar);
    }

    @Override // androidx.appcompat.view.menu.ua
    public Object e(jk0 jk0Var, xg xgVar) {
        return k(this, jk0Var, xgVar);
    }

    public final Object l(ys ysVar, kh khVar, xg xgVar) {
        Object c;
        Object c2 = wa.c(khVar, wa.a(ysVar, xgVar.b()), null, new a(null), xgVar, 4, null);
        c = f60.c();
        return c2 == c ? c2 : u31.a;
    }

    public abstract Object m(ys ysVar, xg xgVar);

    @Override // androidx.appcompat.view.menu.ua
    public String toString() {
        return this.d + " -> " + super.toString();
    }
}
