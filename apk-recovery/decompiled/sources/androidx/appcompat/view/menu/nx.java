package androidx.appcompat.view.menu;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public abstract class nx extends qy {

    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        public final Future m;
        public final mx n;

        public a(Future future, mx mxVar) {
            this.m = future;
            this.n = mxVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.n.a(nx.b(this.m));
            } catch (Error e) {
                e = e;
                this.n.b(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.n.b(e);
            } catch (ExecutionException e3) {
                this.n.b(e3.getCause());
            }
        }

        public String toString() {
            return xd0.a(this).c(this.n).toString();
        }
    }

    public static void a(m90 m90Var, mx mxVar, Executor executor) {
        qj0.i(mxVar);
        m90Var.c(new a(m90Var, mxVar), executor);
    }

    public static Object b(Future future) {
        qj0.o(future.isDone(), "Future was expected to be done: %s", future);
        return t31.a(future);
    }
}
