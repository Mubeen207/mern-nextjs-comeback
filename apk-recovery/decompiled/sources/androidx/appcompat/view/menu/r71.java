package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class r71 {
    public static final long r = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService s = null;
    public static final Object t = new Object();
    public static volatile tm1 u = new sh1();
    public final Object a;
    public final PowerManager.WakeLock b;
    public int c;
    public Future d;
    public long e;
    public final Set f;
    public boolean g;
    public int h;
    public ph1 i;
    public cc j;
    public WorkSource k;
    public final String l;
    public final String m;
    public final Context n;
    public final Map o;
    public AtomicInteger p;
    public final ScheduledExecutorService q;

    public r71(Context context, int i, String str) {
        String packageName = context.getPackageName();
        this.a = new Object();
        this.c = 0;
        this.f = new HashSet();
        this.g = true;
        this.j = kj.d();
        this.o = new HashMap();
        this.p = new AtomicInteger(0);
        pj0.j(context, "WakeLock: context must not be null");
        pj0.f(str, "WakeLock: wakeLockName must not be empty");
        this.n = context.getApplicationContext();
        this.m = str;
        this.i = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.l = str;
        } else {
            String valueOf = String.valueOf(str);
            this.l = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb = new StringBuilder(29);
            sb.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new yy1(sb.toString());
        }
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i, str);
        this.b = newWakeLock;
        if (ta1.c(context)) {
            WorkSource b = ta1.b(context, px0.a(packageName) ? context.getPackageName() : packageName);
            this.k = b;
            if (b != null) {
                i(newWakeLock, b);
            }
        }
        ScheduledExecutorService scheduledExecutorService = s;
        if (scheduledExecutorService == null) {
            synchronized (t) {
                try {
                    scheduledExecutorService = s;
                    if (scheduledExecutorService == null) {
                        tw1.a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        s = scheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.q = scheduledExecutorService;
    }

    public static /* synthetic */ void e(r71 r71Var) {
        synchronized (r71Var.a) {
            try {
                if (r71Var.b()) {
                    String.valueOf(r71Var.l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                    r71Var.g();
                    if (r71Var.b()) {
                        r71Var.c = 1;
                        r71Var.h(0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            e.toString();
        }
    }

    public void a(long j) {
        this.p.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, r), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.a) {
            try {
                if (!b()) {
                    this.i = ph1.a(false, null);
                    this.b.acquire();
                    this.j.b();
                }
                this.c++;
                this.h++;
                f(null);
                gk1 gk1Var = (gk1) this.o.get(null);
                if (gk1Var == null) {
                    gk1Var = new gk1(null);
                    this.o.put(null, gk1Var);
                }
                gk1Var.a++;
                long b = this.j.b();
                long j2 = Long.MAX_VALUE - b > max ? b + max : Long.MAX_VALUE;
                if (j2 > this.e) {
                    this.e = j2;
                    Future future = this.d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.d = this.q.schedule(new Runnable() { // from class: androidx.appcompat.view.menu.le1
                        @Override // java.lang.Runnable
                        public final void run() {
                            r71.e(r71.this);
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.c > 0;
        }
        return z;
    }

    public void c() {
        if (this.p.decrementAndGet() < 0) {
            String.valueOf(this.l).concat(" release without a matched acquire!");
        }
        synchronized (this.a) {
            try {
                f(null);
                if (this.o.containsKey(null)) {
                    gk1 gk1Var = (gk1) this.o.get(null);
                    if (gk1Var != null) {
                        int i = gk1Var.a - 1;
                        gk1Var.a = i;
                        if (i == 0) {
                            this.o.remove(null);
                        }
                    }
                } else {
                    String.valueOf(this.l).concat(" counter does not exist");
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(boolean z) {
        synchronized (this.a) {
            this.g = z;
        }
    }

    public final String f(String str) {
        if (this.g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    public final void g() {
        if (this.f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f);
        this.f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        my0.a(arrayList.get(0));
        throw null;
    }

    public final void h(int i) {
        synchronized (this.a) {
            try {
                if (b()) {
                    if (this.g) {
                        int i2 = this.c - 1;
                        this.c = i2;
                        if (i2 > 0) {
                            return;
                        }
                    } else {
                        this.c = 0;
                    }
                    g();
                    for (gk1 gk1Var : this.o.values()) {
                        gk1Var.a = 0;
                    }
                    this.o.clear();
                    Future future = this.d;
                    if (future != null) {
                        future.cancel(false);
                        this.d = null;
                        this.e = 0L;
                    }
                    this.h = 0;
                    if (this.b.isHeld()) {
                        try {
                            this.b.release();
                            if (this.i != null) {
                                this.i = null;
                            }
                        } catch (RuntimeException e) {
                            if (!e.getClass().equals(RuntimeException.class)) {
                                throw e;
                            }
                            String.valueOf(this.l).concat(" failed to release!");
                            if (this.i != null) {
                                this.i = null;
                            }
                        }
                    } else {
                        String.valueOf(this.l).concat(" should be held!");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
