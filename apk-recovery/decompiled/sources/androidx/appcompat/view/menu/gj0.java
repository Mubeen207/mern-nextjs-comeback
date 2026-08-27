package androidx.appcompat.view.menu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class gj0 {
    public static final wp a;
    public static volatile wp b;

    /* loaded from: classes.dex */
    public static class b implements wp {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.wp
        public ExecutorService a(ThreadFactory threadFactory, o01 o01Var) {
            return b(1, threadFactory, o01Var);
        }

        public ExecutorService b(int i, ThreadFactory threadFactory, o01 o01Var) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        b bVar = new b();
        a = bVar;
        b = bVar;
    }

    public static wp a() {
        return b;
    }
}
