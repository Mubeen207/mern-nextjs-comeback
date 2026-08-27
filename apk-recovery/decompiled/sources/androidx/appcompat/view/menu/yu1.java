package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class yu1 implements Runnable {
    public final /* synthetic */ boolean m;
    public final /* synthetic */ su1 n;

    public yu1(su1 su1Var, boolean z) {
        this.n = su1Var;
        this.m = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r82 r82Var;
        r82Var = this.n.a;
        r82Var.H(this.m);
    }
}
