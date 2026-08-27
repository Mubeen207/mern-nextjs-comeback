package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class s22 implements Runnable {
    public final /* synthetic */ ih1 m;
    public final /* synthetic */ g02 n;

    public s22(g02 g02Var, ih1 ih1Var) {
        this.n = g02Var;
        this.m = ih1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.n.i().z(this.m)) {
            this.n.t().U(false);
        } else {
            this.n.l().J().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(this.m.a()));
        }
    }
}
