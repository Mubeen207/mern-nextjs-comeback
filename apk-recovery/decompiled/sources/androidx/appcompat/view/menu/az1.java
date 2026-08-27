package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class az1 implements Runnable {
    public final /* synthetic */ cz0 m;
    public final /* synthetic */ d12 n;

    public az1(d12 d12Var, cz0 cz0Var) {
        this.n = d12Var;
        this.m = cz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        jg0 jg0Var;
        jg0 jg0Var2;
        obj = this.n.b;
        synchronized (obj) {
            try {
                d12 d12Var = this.n;
                jg0Var = d12Var.c;
                if (jg0Var != null) {
                    jg0Var2 = d12Var.c;
                    jg0Var2.a(this.m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
