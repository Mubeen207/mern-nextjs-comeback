package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class e32 implements Runnable {
    public final /* synthetic */ cz0 m;
    public final /* synthetic */ h52 n;

    public e32(h52 h52Var, cz0 cz0Var) {
        this.n = h52Var;
        this.m = cz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        lg0 lg0Var;
        lg0 lg0Var2;
        obj = this.n.b;
        synchronized (obj) {
            try {
                h52 h52Var = this.n;
                lg0Var = h52Var.c;
                if (lg0Var != null) {
                    lg0Var2 = h52Var.c;
                    lg0Var2.d((Exception) pj0.i(this.m.h()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
