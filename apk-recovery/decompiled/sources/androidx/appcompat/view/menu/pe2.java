package androidx.appcompat.view.menu;

import java.util.ArrayDeque;
import java.util.Queue;
/* loaded from: classes.dex */
public final class pe2 {
    public final Object a = new Object();
    public Queue b;
    public boolean c;

    public final void a(ud2 ud2Var) {
        synchronized (this.a) {
            try {
                if (this.b == null) {
                    this.b = new ArrayDeque();
                }
                this.b.add(ud2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(cz0 cz0Var) {
        ud2 ud2Var;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        try {
                            ud2Var = (ud2) this.b.poll();
                            if (ud2Var == null) {
                                this.c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    ud2Var.b(cz0Var);
                }
            }
        }
    }
}
