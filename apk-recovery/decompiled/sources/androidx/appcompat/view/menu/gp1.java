package androidx.appcompat.view.menu;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class gp1 implements Runnable {
    public final /* synthetic */ cz0 m;
    public final /* synthetic */ lr1 n;

    public gp1(lr1 lr1Var, cz0 cz0Var) {
        this.n = lr1Var;
        this.m = cz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qf2 qf2Var;
        qf2 qf2Var2;
        qf2 qf2Var3;
        yg ygVar;
        try {
            ygVar = this.n.b;
            cz0 cz0Var = (cz0) ygVar.a(this.m);
            if (cz0Var == null) {
                this.n.d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = jz0.b;
            cz0Var.e(executor, this.n);
            cz0Var.d(executor, this.n);
            cz0Var.a(executor, this.n);
        } catch (fq0 e) {
            if (e.getCause() instanceof Exception) {
                qf2Var3 = this.n.c;
                qf2Var3.o((Exception) e.getCause());
                return;
            }
            qf2Var2 = this.n.c;
            qf2Var2.o(e);
        } catch (Exception e2) {
            qf2Var = this.n.c;
            qf2Var.o(e2);
        }
    }
}
