package androidx.appcompat.view.menu;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class kr0 implements Executor {
    public final Executor m;

    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public final Runnable m;

        public a(Runnable runnable) {
            this.m = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.m.run();
            } catch (Exception e) {
                pa0.c("Executor", "Background execution failure.", e);
            }
        }
    }

    public kr0(Executor executor) {
        this.m = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.m.execute(new a(runnable));
    }
}
