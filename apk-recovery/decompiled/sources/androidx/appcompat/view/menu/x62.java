package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class x62 implements Runnable {
    public final /* synthetic */ r82 m;
    public final /* synthetic */ Runnable n;

    public x62(v62 v62Var, r82 r82Var, Runnable runnable) {
        this.m = r82Var;
        this.n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.m.o0();
        this.m.y(this.n);
        this.m.t0();
    }
}
