package androidx.appcompat.view.menu;

import android.content.Context;
import androidx.appcompat.view.menu.o21;
/* loaded from: classes.dex */
public final class ri extends o21 {
    public gl0 m;
    public gl0 n;
    public gl0 o;
    public gl0 p;
    public gl0 q;
    public gl0 r;
    public gl0 s;
    public gl0 t;
    public gl0 u;
    public gl0 v;
    public gl0 w;
    public gl0 x;
    public gl0 y;

    /* loaded from: classes.dex */
    public static final class b implements o21.a {
        public Context a;

        public b() {
        }

        @Override // androidx.appcompat.view.menu.o21.a
        public o21 a() {
            oj0.a(this.a, Context.class);
            return new ri(this.a);
        }

        @Override // androidx.appcompat.view.menu.o21.a
        /* renamed from: c */
        public b b(Context context) {
            this.a = (Context) oj0.b(context);
            return this;
        }
    }

    public static o21.a d() {
        return new b();
    }

    @Override // androidx.appcompat.view.menu.o21
    public gp a() {
        return (gp) this.s.get();
    }

    @Override // androidx.appcompat.view.menu.o21
    public n21 c() {
        return (n21) this.y.get();
    }

    public final void e(Context context) {
        this.m = nm.a(sp.a());
        vq a2 = t50.a(context);
        this.n = a2;
        fi a3 = fi.a(a2, u01.a(), v01.a());
        this.o = a3;
        this.p = nm.a(hd0.a(this.n, a3));
        this.q = ks0.a(this.n, jp.a(), lp.a());
        this.r = nm.a(kp.a(this.n));
        this.s = nm.a(ir0.a(u01.a(), v01.a(), mp.a(), this.q, this.r));
        bs0 b2 = bs0.b(u01.a());
        this.t = b2;
        ds0 a4 = ds0.a(this.n, this.s, b2, v01.a());
        this.u = a4;
        gl0 gl0Var = this.m;
        gl0 gl0Var2 = this.p;
        gl0 gl0Var3 = this.s;
        this.v = zj.a(gl0Var, gl0Var2, a4, gl0Var3, gl0Var3);
        gl0 gl0Var4 = this.n;
        gl0 gl0Var5 = this.p;
        gl0 gl0Var6 = this.s;
        this.w = m41.a(gl0Var4, gl0Var5, gl0Var6, this.u, this.m, gl0Var6, u01.a(), v01.a(), this.s);
        gl0 gl0Var7 = this.m;
        gl0 gl0Var8 = this.s;
        this.x = qa1.a(gl0Var7, gl0Var8, this.u, gl0Var8);
        this.y = nm.a(p21.a(u01.a(), v01.a(), this.v, this.w, this.x));
    }

    public ri(Context context) {
        e(context);
    }
}
