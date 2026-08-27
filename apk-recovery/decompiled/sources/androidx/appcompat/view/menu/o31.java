package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class o31 implements ys {
    public final kh a;
    public final Object b;
    public final yw c;

    /* loaded from: classes.dex */
    public static final class a extends oy0 implements yw {
        public int q;
        public /* synthetic */ Object r;
        public final /* synthetic */ ys s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ys ysVar, xg xgVar) {
            super(2, xgVar);
            this.s = ysVar;
        }

        @Override // androidx.appcompat.view.menu.y7
        public final xg a(Object obj, xg xgVar) {
            a aVar = new a(this.s, xgVar);
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
                Object obj2 = this.r;
                ys ysVar = this.s;
                this.q = 1;
                if (ysVar.a(obj2, this) == c) {
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
        public final Object h(Object obj, xg xgVar) {
            return ((a) a(obj, xgVar)).k(u31.a);
        }
    }

    public o31(ys ysVar, kh khVar) {
        this.a = khVar;
        this.b = l01.b(khVar);
        this.c = new a(ysVar, null);
    }

    @Override // androidx.appcompat.view.menu.ys
    public Object a(Object obj, xg xgVar) {
        Object c;
        Object b = wa.b(this.a, obj, this.b, this.c, xgVar);
        c = f60.c();
        return b == c ? b : u31.a;
    }
}
