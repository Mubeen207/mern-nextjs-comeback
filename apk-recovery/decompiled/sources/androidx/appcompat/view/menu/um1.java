package androidx.appcompat.view.menu;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class um1 implements ud2 {
    public final Executor a;
    public final yg b;
    public final qf2 c;

    public um1(Executor executor, yg ygVar, qf2 qf2Var) {
        this.a = executor;
        this.b = ygVar;
        this.c = qf2Var;
    }

    @Override // androidx.appcompat.view.menu.ud2
    public final void b(cz0 cz0Var) {
        this.a.execute(new hk1(this, cz0Var));
    }
}
