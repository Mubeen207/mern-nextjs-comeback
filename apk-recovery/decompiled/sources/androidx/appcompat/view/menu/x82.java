package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class x82 implements Runnable {
    public final /* synthetic */ u92 m;
    public final /* synthetic */ r82 n;

    public x82(r82 r82Var, u92 u92Var) {
        this.n = r82Var;
        this.m = u92Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r82.w(this.n, this.m);
        this.n.s0();
    }
}
