package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class g42 implements Runnable {
    public final /* synthetic */ w32 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ u32 o;

    public g42(u32 u32Var, w32 w32Var, long j) {
        this.o = u32Var;
        this.m = w32Var;
        this.n = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.o.O(this.m, false, this.n);
        u32 u32Var = this.o;
        u32Var.e = null;
        u32Var.t().L(null);
    }
}
