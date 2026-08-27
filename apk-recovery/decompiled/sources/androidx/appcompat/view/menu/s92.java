package androidx.appcompat.view.menu;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class s92 implements ud2 {
    public final Executor a;
    public final Object b = new Object();
    public pg0 c;

    public s92(Executor executor, pg0 pg0Var) {
        this.a = executor;
        this.c = pg0Var;
    }

    @Override // androidx.appcompat.view.menu.ud2
    public final void b(cz0 cz0Var) {
        if (cz0Var.m()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new l72(this, cz0Var));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
