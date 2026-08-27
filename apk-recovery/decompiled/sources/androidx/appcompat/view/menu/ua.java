package androidx.appcompat.view.menu;

import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class ua implements lx {
    public final kh a;
    public final int b;
    public final u8 c;

    /* loaded from: classes.dex */
    public static final class a extends oy0 implements yw {
        public int q;
        public /* synthetic */ Object r;
        public final /* synthetic */ ys s;
        public final /* synthetic */ ua t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ys ysVar, ua uaVar, xg xgVar) {
            super(2, xgVar);
            this.s = ysVar;
            this.t = uaVar;
        }

        @Override // androidx.appcompat.view.menu.y7
        public final xg a(Object obj, xg xgVar) {
            a aVar = new a(this.s, this.t, xgVar);
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
                ys ysVar = this.s;
                yn0 i2 = this.t.i((th) this.r);
                this.q = 1;
                if (zs.b(ysVar, i2, this) == c) {
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
        public final Object h(th thVar, xg xgVar) {
            return ((a) a(thVar, xgVar)).k(u31.a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends oy0 implements yw {
        public int q;
        public /* synthetic */ Object r;

        public b(xg xgVar) {
            super(2, xgVar);
        }

        @Override // androidx.appcompat.view.menu.y7
        public final xg a(Object obj, xg xgVar) {
            b bVar = new b(xgVar);
            bVar.r = obj;
            return bVar;
        }

        @Override // androidx.appcompat.view.menu.y7
        public final Object k(Object obj) {
            Object c;
            c = f60.c();
            int i = this.q;
            if (i == 0) {
                rp0.b(obj);
                ua uaVar = ua.this;
                this.q = 1;
                if (uaVar.e((jk0) this.r, this) == c) {
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
        public final Object h(jk0 jk0Var, xg xgVar) {
            return ((b) a(jk0Var, xgVar)).k(u31.a);
        }
    }

    public ua(kh khVar, int i, u8 u8Var) {
        this.a = khVar;
        this.b = i;
        this.c = u8Var;
    }

    public static /* synthetic */ Object d(ua uaVar, ys ysVar, xg xgVar) {
        Object c;
        Object b2 = uh.b(new a(ysVar, uaVar, null), xgVar);
        c = f60.c();
        return b2 == c ? b2 : u31.a;
    }

    public String a() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.xs
    public Object b(ys ysVar, xg xgVar) {
        return d(this, ysVar, xgVar);
    }

    @Override // androidx.appcompat.view.menu.lx
    public xs c(kh khVar, int i, u8 u8Var) {
        kh o = khVar.o(this.a);
        if (u8Var == u8.SUSPEND) {
            int i2 = this.b;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            u8Var = this.c;
        }
        return (c60.a(o, this.a) && i == this.b && u8Var == this.c) ? this : f(o, i, u8Var);
    }

    public abstract Object e(jk0 jk0Var, xg xgVar);

    public abstract ua f(kh khVar, int i, u8 u8Var);

    public final yw g() {
        return new b(null);
    }

    public final int h() {
        int i = this.b;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    public yn0 i(th thVar) {
        return hk0.c(thVar, this.a, h(), this.c, xh.ATOMIC, null, g(), 16, null);
    }

    public String toString() {
        String r;
        ArrayList arrayList = new ArrayList(4);
        String a2 = a();
        if (a2 != null) {
            arrayList.add(a2);
        }
        if (this.a != bo.m) {
            arrayList.add("context=" + this.a);
        }
        if (this.b != -3) {
            arrayList.add("capacity=" + this.b);
        }
        if (this.c != u8.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(hj.a(this));
        sb.append('[');
        r = ad.r(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb.append(r);
        sb.append(']');
        return sb.toString();
    }
}
