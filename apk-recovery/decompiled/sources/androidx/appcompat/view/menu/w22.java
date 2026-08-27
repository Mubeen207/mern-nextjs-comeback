package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class w22 implements Runnable {
    public final /* synthetic */ oz1 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ oz1 p;
    public final /* synthetic */ g02 q;

    public w22(g02 g02Var, oz1 oz1Var, long j, boolean z, oz1 oz1Var2) {
        this.q = g02Var;
        this.m = oz1Var;
        this.n = j;
        this.o = z;
        this.p = oz1Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.J(this.m);
        g02.N(this.q, this.m, this.n, false, this.o);
        if (hd2.a() && this.q.e().s(vi1.x0)) {
            g02.O(this.q, this.m, this.p);
        }
    }
}
