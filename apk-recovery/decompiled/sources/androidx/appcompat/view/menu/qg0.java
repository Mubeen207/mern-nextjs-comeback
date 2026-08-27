package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class qg0 {

    /* loaded from: classes.dex */
    public static final class a extends j80 implements kw {
        public final /* synthetic */ kw n;
        public final /* synthetic */ Object o;
        public final /* synthetic */ kh p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kw kwVar, Object obj, kh khVar) {
            super(1);
            this.n = kwVar;
            this.o = obj;
            this.p = khVar;
        }

        public final void a(Throwable th) {
            qg0.b(this.n, this.o, this.p);
        }

        @Override // androidx.appcompat.view.menu.kw
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((Throwable) obj);
            return u31.a;
        }
    }

    public static final kw a(kw kwVar, Object obj, kh khVar) {
        return new a(kwVar, obj, khVar);
    }

    public static final void b(kw kwVar, Object obj, kh khVar) {
        n31 c = c(kwVar, obj, null);
        if (c != null) {
            rh.a(khVar, c);
        }
    }

    public static final n31 c(kw kwVar, Object obj, n31 n31Var) {
        try {
            kwVar.i(obj);
        } catch (Throwable th) {
            if (n31Var == null || n31Var.getCause() == th) {
                return new n31("Exception in undelivered element handler for " + obj, th);
            }
            pp.a(n31Var, th);
        }
        return n31Var;
    }

    public static /* synthetic */ n31 d(kw kwVar, Object obj, n31 n31Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            n31Var = null;
        }
        return c(kwVar, obj, n31Var);
    }
}
