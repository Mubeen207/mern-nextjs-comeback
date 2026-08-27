package androidx.appcompat.view.menu;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class qf2 extends cz0 {
    public final Object a = new Object();
    public final pe2 b = new pe2();
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    @Override // androidx.appcompat.view.menu.cz0
    public final cz0 a(Executor executor, ig0 ig0Var) {
        this.b.a(new vw1(executor, ig0Var));
        w();
        return this;
    }

    @Override // androidx.appcompat.view.menu.cz0
    public final cz0 b(jg0 jg0Var) {
        this.b.a(new d12(jz0.a, jg0Var));
        w();
        return this;
    }

    @Override // androidx.appcompat.view.menu.cz0
    public final cz0 c(Executor executor, jg0 jg0Var) {
        this.b.a(new d12(executor, jg0Var));
        w();
        return this;
    }

    @Override // androidx.appcompat.view.menu.cz0
    public final cz0 d(Executor executor, lg0 lg0Var) {
        this.b.a(new h52(executor, lg0Var));
        w();
        return this;
    }

    @Override // androidx.appcompat.view.menu.cz0
    public final cz0 e(Executor executor, pg0 pg0Var) {
        this.b.a(new s92(executor, pg0Var));
        w();
        return this;
    }

    @Override // androidx.appcompat.view.menu.cz0
    public final cz0 f(Executor executor, yg ygVar) {
        qf2 qf2Var = new qf2();
        this.b.a(new um1(executor, ygVar, qf2Var));
        w();
        return qf2Var;
    }

    @Override // androidx.appcompat.view.menu.cz0
    public final cz0 g(Executor executor, yg ygVar) {
        qf2 qf2Var = new qf2();
        this.b.a(new lr1(executor, ygVar, qf2Var));
        w();
        return qf2Var;
    }

    @Override // androidx.appcompat.view.menu.cz0
    public final Exception h() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // androidx.appcompat.view.menu.cz0
    public final Object i() {
        Object obj;
        synchronized (this.a) {
            try {
                t();
                u();
                Exception exc = this.f;
                if (exc != null) {
                    throw new fq0(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // androidx.appcompat.view.menu.cz0
    public final Object j(Class cls) {
        Object obj;
        synchronized (this.a) {
            try {
                t();
                u();
                if (cls.isInstance(this.f)) {
                    throw ((Throwable) cls.cast(this.f));
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new fq0(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // androidx.appcompat.view.menu.cz0
    public final boolean k() {
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.cz0
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // androidx.appcompat.view.menu.cz0
    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // androidx.appcompat.view.menu.cz0
    public final cz0 n(Executor executor, fy0 fy0Var) {
        qf2 qf2Var = new qf2();
        this.b.a(new nc2(executor, fy0Var, qf2Var));
        w();
        return qf2Var;
    }

    public final void o(Exception exc) {
        pj0.j(exc, "Exception must not be null");
        synchronized (this.a) {
            v();
            this.c = true;
            this.f = exc;
        }
        this.b.b(this);
    }

    public final void p(Object obj) {
        synchronized (this.a) {
            v();
            this.c = true;
            this.e = obj;
        }
        this.b.b(this);
    }

    public final boolean q() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.d = true;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean r(Exception exc) {
        pj0.j(exc, "Exception must not be null");
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.f = exc;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean s(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t() {
        pj0.m(this.c, "Task is not yet complete");
    }

    public final void u() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    public final void v() {
        if (this.c) {
            throw gn.a(this);
        }
    }

    public final void w() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
