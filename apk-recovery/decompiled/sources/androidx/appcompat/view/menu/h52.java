package androidx.appcompat.view.menu;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class h52 implements ud2 {
    public final Executor a;
    public final Object b = new Object();
    public lg0 c;

    public h52(Executor executor, lg0 lg0Var) {
        this.a = executor;
        this.c = lg0Var;
    }

    @Override // androidx.appcompat.view.menu.ud2
    public final void b(cz0 cz0Var) {
        if (cz0Var.m() || cz0Var.k()) {
            return;
        }
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new e32(this, cz0Var));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
