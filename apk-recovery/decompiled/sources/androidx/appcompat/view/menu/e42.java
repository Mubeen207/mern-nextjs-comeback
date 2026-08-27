package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class e42 implements Runnable {
    public final /* synthetic */ w32 m;
    public final /* synthetic */ w32 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ u32 q;

    public e42(u32 u32Var, w32 w32Var, w32 w32Var2, long j, boolean z) {
        this.q = u32Var;
        this.m = w32Var;
        this.n = w32Var2;
        this.o = j;
        this.p = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.N(this.m, this.n, this.o, this.p, null);
    }
}
