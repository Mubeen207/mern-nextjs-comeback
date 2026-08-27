package androidx.appcompat.view.menu;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class fg2 implements Runnable {
    public final /* synthetic */ qf2 m;
    public final /* synthetic */ Callable n;

    public fg2(qf2 qf2Var, Callable callable) {
        this.m = qf2Var;
        this.n = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.m.p(this.n.call());
        } catch (Exception e) {
            this.m.o(e);
        } catch (Throwable th) {
            this.m.o(new RuntimeException(th));
        }
    }
}
