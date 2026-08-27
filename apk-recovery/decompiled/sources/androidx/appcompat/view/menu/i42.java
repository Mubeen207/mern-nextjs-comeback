package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class i42 implements Runnable {
    public final /* synthetic */ long m;
    public final /* synthetic */ u32 n;

    public i42(u32 u32Var, long j) {
        this.n = u32Var;
        this.m = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.o().v(this.m);
        this.n.e = null;
    }
}
