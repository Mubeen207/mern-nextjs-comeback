package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class f72 implements Runnable {
    public final /* synthetic */ long m;
    public final /* synthetic */ b72 n;

    public f72(b72 b72Var, long j) {
        this.n = b72Var;
        this.m = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b72.C(this.n, this.m);
    }
}
