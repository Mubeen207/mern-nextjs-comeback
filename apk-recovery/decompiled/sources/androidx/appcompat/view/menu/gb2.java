package androidx.appcompat.view.menu;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class gb2 implements Runnable {
    public final /* synthetic */ cz0 m;
    public final /* synthetic */ nc2 n;

    public gb2(nc2 nc2Var, cz0 cz0Var) {
        this.n = nc2Var;
        this.m = cz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fy0 fy0Var;
        try {
            fy0Var = this.n.b;
            cz0 a = fy0Var.a(this.m.i());
            if (a == null) {
                this.n.d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = jz0.b;
            a.e(executor, this.n);
            a.d(executor, this.n);
            a.a(executor, this.n);
        } catch (fq0 e) {
            if (e.getCause() instanceof Exception) {
                this.n.d((Exception) e.getCause());
            } else {
                this.n.d(e);
            }
        } catch (CancellationException unused) {
            this.n.c();
        } catch (Exception e2) {
            this.n.d(e2);
        }
    }
}
