package androidx.appcompat.view.menu;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class h4 extends iz0 {
    public static volatile h4 c;
    public static final Executor d = new Executor() { // from class: androidx.appcompat.view.menu.f4
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            h4.g(runnable);
        }
    };
    public static final Executor e = new Executor() { // from class: androidx.appcompat.view.menu.g4
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            h4.h(runnable);
        }
    };
    public iz0 a;
    public final iz0 b;

    public h4() {
        kk kkVar = new kk();
        this.b = kkVar;
        this.a = kkVar;
    }

    public static h4 f() {
        if (c != null) {
            return c;
        }
        synchronized (h4.class) {
            try {
                if (c == null) {
                    c = new h4();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public static /* synthetic */ void g(Runnable runnable) {
        f().c(runnable);
    }

    public static /* synthetic */ void h(Runnable runnable) {
        f().a(runnable);
    }

    @Override // androidx.appcompat.view.menu.iz0
    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override // androidx.appcompat.view.menu.iz0
    public boolean b() {
        return this.a.b();
    }

    @Override // androidx.appcompat.view.menu.iz0
    public void c(Runnable runnable) {
        this.a.c(runnable);
    }
}
