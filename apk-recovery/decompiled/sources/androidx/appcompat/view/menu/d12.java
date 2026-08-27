package androidx.appcompat.view.menu;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class d12 implements ud2 {
    public final Executor a;
    public final Object b = new Object();
    public jg0 c;

    public d12(Executor executor, jg0 jg0Var) {
        this.a = executor;
        this.c = jg0Var;
    }

    @Override // androidx.appcompat.view.menu.ud2
    public final void b(cz0 cz0Var) {
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    return;
                }
                this.a.execute(new az1(this, cz0Var));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
