package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class fk1 implements Runnable {
    public final /* synthetic */ long m;
    public final /* synthetic */ rh1 n;

    public fk1(rh1 rh1Var, long j) {
        this.n = rh1Var;
        this.m = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.B(this.m);
    }
}
