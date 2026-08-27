package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class n72 implements Runnable {
    public final /* synthetic */ long m;
    public final /* synthetic */ b72 n;

    public n72(b72 b72Var, long j) {
        this.n = b72Var;
        this.m = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b72.I(this.n, this.m);
    }
}
