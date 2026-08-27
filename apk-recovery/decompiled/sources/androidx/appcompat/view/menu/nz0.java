package androidx.appcompat.view.menu;

import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class nz0 {
    public static final String a = wy0.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static zr0 f;
    public static final fz0 g;
    public static final fz0 h;

    static {
        long f2;
        int a2;
        int e2;
        int e3;
        long f3;
        f2 = yy0.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        b = f2;
        a2 = xn0.a(wy0.a(), 2);
        e2 = yy0.e("kotlinx.coroutines.scheduler.core.pool.size", a2, 1, 0, 8, null);
        c = e2;
        e3 = yy0.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        d = e3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f3 = yy0.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        e = timeUnit.toNanos(f3);
        f = pe0.a;
        g = new gz0(0);
        h = new gz0(1);
    }
}
