package androidx.appcompat.view.menu;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public abstract class mz0 {
    public static Object a(cz0 cz0Var) {
        pj0.g();
        pj0.j(cz0Var, "Task must not be null");
        if (cz0Var.l()) {
            return f(cz0Var);
        }
        mf1 mf1Var = new mf1(null);
        g(cz0Var, mf1Var);
        mf1Var.b();
        return f(cz0Var);
    }

    public static Object b(cz0 cz0Var, long j, TimeUnit timeUnit) {
        pj0.g();
        pj0.j(cz0Var, "Task must not be null");
        pj0.j(timeUnit, "TimeUnit must not be null");
        if (cz0Var.l()) {
            return f(cz0Var);
        }
        mf1 mf1Var = new mf1(null);
        g(cz0Var, mf1Var);
        if (mf1Var.e(j, timeUnit)) {
            return f(cz0Var);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static cz0 c(Executor executor, Callable callable) {
        pj0.j(executor, "Executor must not be null");
        pj0.j(callable, "Callback must not be null");
        qf2 qf2Var = new qf2();
        executor.execute(new fg2(qf2Var, callable));
        return qf2Var;
    }

    public static cz0 d(Exception exc) {
        qf2 qf2Var = new qf2();
        qf2Var.o(exc);
        return qf2Var;
    }

    public static cz0 e(Object obj) {
        qf2 qf2Var = new qf2();
        qf2Var.p(obj);
        return qf2Var;
    }

    public static Object f(cz0 cz0Var) {
        if (cz0Var.m()) {
            return cz0Var.i();
        }
        if (cz0Var.k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(cz0Var.h());
    }

    public static void g(cz0 cz0Var, qf1 qf1Var) {
        Executor executor = jz0.b;
        cz0Var.e(executor, qf1Var);
        cz0Var.d(executor, qf1Var);
        cz0Var.a(executor, qf1Var);
    }
}
