package androidx.appcompat.view.menu;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public class ki implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong a = new AtomicLong();
    public final String b;
    public final int c;
    public final StrictMode.ThreadPolicy d;

    public ki(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.b = str;
        this.c = i;
        this.d = threadPolicy;
    }

    public final /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.c);
        StrictMode.ThreadPolicy threadPolicy = this.d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = e.newThread(new Runnable() { // from class: androidx.appcompat.view.menu.ji
            @Override // java.lang.Runnable
            public final void run() {
                ki.this.b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.b, Long.valueOf(this.a.getAndIncrement())));
        return newThread;
    }
}
