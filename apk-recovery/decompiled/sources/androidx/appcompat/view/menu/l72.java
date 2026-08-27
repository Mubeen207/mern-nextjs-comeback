package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class l72 implements Runnable {
    public final /* synthetic */ cz0 m;
    public final /* synthetic */ s92 n;

    public l72(s92 s92Var, cz0 cz0Var) {
        this.n = s92Var;
        this.m = cz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        pg0 pg0Var;
        pg0 pg0Var2;
        obj = this.n.b;
        synchronized (obj) {
            try {
                s92 s92Var = this.n;
                pg0Var = s92Var.c;
                if (pg0Var != null) {
                    pg0Var2 = s92Var.c;
                    pg0Var2.a(this.m.i());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
