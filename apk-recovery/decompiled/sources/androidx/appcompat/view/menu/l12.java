package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class l12 implements Runnable {
    public final /* synthetic */ long m;
    public final /* synthetic */ g02 n;

    public l12(g02 g02Var, long j) {
        this.n = g02Var;
        this.m = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.i().k.b(this.m);
        this.n.l().F().b("Session timeout duration set", Long.valueOf(this.m));
    }
}
