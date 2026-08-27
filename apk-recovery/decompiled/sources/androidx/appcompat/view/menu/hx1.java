package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class hx1 implements Runnable {
    public final /* synthetic */ b02 m;
    public final /* synthetic */ fx1 n;

    public hx1(fx1 fx1Var, b02 b02Var) {
        this.n = fx1Var;
        this.m = b02Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fx1.g(this.n, this.m);
        this.n.e(this.m.g);
    }
}
