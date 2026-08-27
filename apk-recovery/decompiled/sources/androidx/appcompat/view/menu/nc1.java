package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class nc1 implements Runnable {
    public final /* synthetic */ od1 m;
    public final /* synthetic */ pc1 n;

    public nc1(pc1 pc1Var, od1 od1Var) {
        this.n = pc1Var;
        this.m = od1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pc1.w2(this.n, this.m);
    }
}
