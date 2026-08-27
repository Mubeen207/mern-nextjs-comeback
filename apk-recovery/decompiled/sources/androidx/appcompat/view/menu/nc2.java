package androidx.appcompat.view.menu;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class nc2 implements pg0, lg0, ig0, ud2 {
    public final Executor a;
    public final fy0 b;
    public final qf2 c;

    public nc2(Executor executor, fy0 fy0Var, qf2 qf2Var) {
        this.a = executor;
        this.b = fy0Var;
        this.c = qf2Var;
    }

    @Override // androidx.appcompat.view.menu.pg0
    public final void a(Object obj) {
        this.c.p(obj);
    }

    @Override // androidx.appcompat.view.menu.ud2
    public final void b(cz0 cz0Var) {
        this.a.execute(new gb2(this, cz0Var));
    }

    @Override // androidx.appcompat.view.menu.ig0
    public final void c() {
        this.c.q();
    }

    @Override // androidx.appcompat.view.menu.lg0
    public final void d(Exception exc) {
        this.c.o(exc);
    }
}
