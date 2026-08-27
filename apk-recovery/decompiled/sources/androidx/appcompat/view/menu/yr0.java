package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class yr0 extends up {
    public final int p;
    public final int q;
    public final long r;
    public final String s;
    public sh t = F();

    public yr0(int i, int i2, long j, String str) {
        this.p = i;
        this.q = i2;
        this.r = j;
        this.s = str;
    }

    @Override // androidx.appcompat.view.menu.nh
    public void A(kh khVar, Runnable runnable) {
        sh.j(this.t, runnable, null, false, 6, null);
    }

    public final sh F() {
        return new sh(this.p, this.q, this.r, this.s);
    }

    public final void G(Runnable runnable, fz0 fz0Var, boolean z) {
        this.t.i(runnable, fz0Var, z);
    }
}
