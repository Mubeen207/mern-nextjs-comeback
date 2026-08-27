package androidx.appcompat.view.menu;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public abstract class bp0 {

    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        public String a;
        public int b;

        /* renamed from: androidx.appcompat.view.menu.bp0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0001a extends Thread {
            public final int m;

            public C0001a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.m = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.m);
                super.run();
            }
        }

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0001a(runnable, this.a, this.b);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {
        public Callable m;
        public pf n;
        public Handler o;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ pf m;
            public final /* synthetic */ Object n;

            public a(pf pfVar, Object obj) {
                this.m = pfVar;
                this.n = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.m.accept(this.n);
            }
        }

        public b(Handler handler, Callable callable, pf pfVar) {
            this.m = callable;
            this.n = pfVar;
            this.o = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.m.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.o.post(new a(this.n, obj));
        }
    }

    public static ThreadPoolExecutor a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static void b(Executor executor, Callable callable, pf pfVar) {
        executor.execute(new b(q9.a(), callable, pfVar));
    }

    public static Object c(ExecutorService executorService, Callable callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
