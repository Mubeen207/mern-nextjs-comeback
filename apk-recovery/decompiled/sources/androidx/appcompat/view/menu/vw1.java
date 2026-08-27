package androidx.appcompat.view.menu;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class vw1 implements ud2 {
    public final Executor a;
    public final Object b = new Object();
    public ig0 c;

    public vw1(Executor executor, ig0 ig0Var) {
        this.a = executor;
        this.c = ig0Var;
    }

    @Override // androidx.appcompat.view.menu.ud2
    public final void b(cz0 cz0Var) {
        if (cz0Var.k()) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        return;
                    }
                    this.a.execute(new ou1(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
