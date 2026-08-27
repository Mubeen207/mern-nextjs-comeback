package androidx.appcompat.view.menu;

import android.app.Activity;
import androidx.appcompat.view.menu.n81;
/* loaded from: classes.dex */
public final class n81 implements j81 {
    public final fa1 b;
    public final e81 c;

    /* loaded from: classes.dex */
    public static final class a extends oy0 implements yw {
        public int q;
        public /* synthetic */ Object r;
        public final /* synthetic */ Activity t;

        /* renamed from: androidx.appcompat.view.menu.n81$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0015a extends j80 implements iw {
            public final /* synthetic */ n81 n;
            public final /* synthetic */ pf o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0015a(n81 n81Var, pf pfVar) {
                super(0);
                this.n = n81Var;
                this.o = pfVar;
            }

            public final void a() {
                this.n.c.b(this.o);
            }

            @Override // androidx.appcompat.view.menu.iw
            public /* bridge */ /* synthetic */ Object d() {
                a();
                return u31.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, xg xgVar) {
            super(2, xgVar);
            this.t = activity;
        }

        public static final void q(jk0 jk0Var, ba1 ba1Var) {
            jk0Var.y(ba1Var);
        }

        @Override // androidx.appcompat.view.menu.y7
        public final xg a(Object obj, xg xgVar) {
            a aVar = new a(this.t, xgVar);
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
                final jk0 jk0Var = (jk0) this.r;
                pf pfVar = new pf() { // from class: androidx.appcompat.view.menu.m81
                    @Override // androidx.appcompat.view.menu.pf, androidx.window.extensions.core.util.function.Consumer
                    public final void accept(Object obj2) {
                        n81.a.q(jk0.this, (ba1) obj2);
                    }
                };
                n81.this.c.a(this.t, new lc0(), pfVar);
                C0015a c0015a = new C0015a(n81.this, pfVar);
                this.q = 1;
                if (hk0.a(jk0Var, c0015a, this) == c) {
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
        /* renamed from: p */
        public final Object h(jk0 jk0Var, xg xgVar) {
            return ((a) a(jk0Var, xgVar)).k(u31.a);
        }
    }

    public n81(fa1 fa1Var, e81 e81Var) {
        c60.e(fa1Var, "windowMetricsCalculator");
        c60.e(e81Var, "windowBackend");
        this.b = fa1Var;
        this.c = e81Var;
    }

    @Override // androidx.appcompat.view.menu.j81
    public xs a(Activity activity) {
        c60.e(activity, "activity");
        return zs.d(zs.a(new a(activity, null)), fm.c());
    }
}
