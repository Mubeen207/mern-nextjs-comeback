package androidx.appcompat.view.menu;

import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class ut {
    public static ut d;
    public static boolean e;
    public xt a;
    public FlutterJNI.c b;
    public ExecutorService c;

    /* loaded from: classes.dex */
    public static final class b {
        public xt a;
        public FlutterJNI.c b;
        public ExecutorService c;

        /* loaded from: classes.dex */
        public class a implements ThreadFactory {
            public int a;

            public a() {
                this.a = 0;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i = this.a;
                this.a = i + 1;
                sb.append(i);
                thread.setName(sb.toString());
                return thread;
            }
        }

        public ut a() {
            b();
            return new ut(this.a, null, this.b, this.c);
        }

        public final void b() {
            if (this.b == null) {
                this.b = new FlutterJNI.c();
            }
            if (this.c == null) {
                this.c = Executors.newCachedThreadPool(new a());
            }
            if (this.a == null) {
                this.a = new xt(this.b.a(), this.c);
            }
        }
    }

    public static ut e() {
        e = true;
        if (d == null) {
            d = new b().a();
        }
        return d;
    }

    public qk a() {
        return null;
    }

    public ExecutorService b() {
        return this.c;
    }

    public xt c() {
        return this.a;
    }

    public FlutterJNI.c d() {
        return this.b;
    }

    public ut(xt xtVar, qk qkVar, FlutterJNI.c cVar, ExecutorService executorService) {
        this.a = xtVar;
        this.b = cVar;
        this.c = executorService;
    }
}
