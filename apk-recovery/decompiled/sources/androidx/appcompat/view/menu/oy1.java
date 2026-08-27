package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class oy1 implements Runnable {
    public final /* synthetic */ ri1 m;
    public final /* synthetic */ fb2 n;
    public final /* synthetic */ nx1 o;

    public oy1(nx1 nx1Var, ri1 ri1Var, fb2 fb2Var) {
        this.o = nx1Var;
        this.m = ri1Var;
        this.n = fb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.o.y2(this.o.w2(this.m, this.n), this.n);
    }
}
