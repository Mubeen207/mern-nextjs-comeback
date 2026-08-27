package androidx.appcompat.view.menu;

import java.util.Collection;
import java.util.List;
import java.util.ServiceLoader;
/* loaded from: classes.dex */
public abstract class ph {
    public static final Collection a;

    static {
        ss0 a2;
        List d;
        a2 = ws0.a(ServiceLoader.load(oh.class, oh.class.getClassLoader()).iterator());
        d = ys0.d(a2);
        a = d;
    }

    public static final Collection a() {
        return a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
