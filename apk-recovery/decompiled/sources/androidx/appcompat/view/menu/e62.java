package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class e62 implements Runnable {
    public final /* synthetic */ at1 m;
    public final /* synthetic */ g62 n;

    public e62(g62 g62Var, at1 at1Var) {
        this.n = g62Var;
        this.m = at1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.n) {
            try {
                this.n.l = false;
                if (!this.n.n.c0()) {
                    this.n.n.l().K().a("Connected to service");
                    this.n.n.J(this.m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
