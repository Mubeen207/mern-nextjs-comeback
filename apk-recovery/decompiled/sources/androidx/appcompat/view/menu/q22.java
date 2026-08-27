package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class q22 implements Runnable {
    public final /* synthetic */ oz1 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ oz1 q;
    public final /* synthetic */ g02 r;

    public q22(g02 g02Var, oz1 oz1Var, long j, long j2, boolean z, oz1 oz1Var2) {
        this.r = g02Var;
        this.m = oz1Var;
        this.n = j;
        this.o = j2;
        this.p = z;
        this.q = oz1Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.r.J(this.m);
        this.r.E(this.n, false);
        g02.N(this.r, this.m, this.o, true, this.p);
        if (hd2.a() && this.r.e().s(vi1.x0)) {
            g02.O(this.r, this.m, this.q);
        }
    }
}
