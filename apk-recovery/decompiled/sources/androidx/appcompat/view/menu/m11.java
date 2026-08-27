package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class m11 {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public final Context a;
    public final fd0 b;
    public final zx c;
    public final FirebaseMessaging d;
    public final ScheduledExecutorService f;
    public final k11 h;
    public final Map e = new o4();
    public boolean g = false;

    public m11(FirebaseMessaging firebaseMessaging, fd0 fd0Var, k11 k11Var, zx zxVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = firebaseMessaging;
        this.b = fd0Var;
        this.h = k11Var;
        this.c = zxVar;
        this.a = context;
        this.f = scheduledExecutorService;
    }

    public static void b(cz0 cz0Var) {
        try {
            mz0.b(cz0Var, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static cz0 e(final FirebaseMessaging firebaseMessaging, final fd0 fd0Var, final zx zxVar, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return mz0.c(scheduledExecutorService, new Callable() { // from class: androidx.appcompat.view.menu.l11
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m11 i2;
                i2 = m11.i(context, scheduledExecutorService, firebaseMessaging, fd0Var, zxVar);
                return i2;
            }
        });
    }

    public static boolean g() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public static /* synthetic */ m11 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, fd0 fd0Var, zx zxVar) {
        return new m11(firebaseMessaging, fd0Var, k11.a(context, scheduledExecutorService), zxVar, context, scheduledExecutorService);
    }

    public final void c(String str) {
        b(this.c.k(this.d.i(), str));
    }

    public final void d(String str) {
        b(this.c.l(this.d.i(), str));
    }

    public boolean f() {
        return this.h.b() != null;
    }

    public synchronized boolean h() {
        return this.g;
    }

    public final void j(j11 j11Var) {
        synchronized (this.e) {
            try {
                String e = j11Var.e();
                if (this.e.containsKey(e)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.e.get(e);
                    ez0 ez0Var = (ez0) arrayDeque.poll();
                    if (ez0Var != null) {
                        ez0Var.c(null);
                    }
                    if (arrayDeque.isEmpty()) {
                        this.e.remove(e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[Catch: IOException -> 0x001d, TryCatch #0 {IOException -> 0x001d, blocks: (B:3:0x0001, B:20:0x0030, B:22:0x0036, B:23:0x0049, B:25:0x0056, B:26:0x006b, B:28:0x0078, B:8:0x0013, B:13:0x001f), top: B:41:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(androidx.appcompat.view.menu.j11 r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r6.b()     // Catch: java.io.IOException -> L1d
            int r2 = r1.hashCode()     // Catch: java.io.IOException -> L1d
            r3 = 83
            r4 = 1
            if (r2 == r3) goto L1f
            r3 = 85
            if (r2 == r3) goto L13
            goto L29
        L13:
            java.lang.String r2 = "U"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L29
            r1 = r4
            goto L2a
        L1d:
            r6 = move-exception
            goto L8d
        L1f:
            java.lang.String r2 = "S"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L29
            r1 = r0
            goto L2a
        L29:
            r1 = -1
        L2a:
            java.lang.String r2 = " succeeded."
            if (r1 == 0) goto L6b
            if (r1 == r4) goto L49
            boolean r1 = g()     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L8c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d
            r1.<init>()     // Catch: java.io.IOException -> L1d
            java.lang.String r2 = "Unknown topic operation"
            r1.append(r2)     // Catch: java.io.IOException -> L1d
            r1.append(r6)     // Catch: java.io.IOException -> L1d
            java.lang.String r6 = "."
            r1.append(r6)     // Catch: java.io.IOException -> L1d
            goto L8c
        L49:
            java.lang.String r1 = r6.c()     // Catch: java.io.IOException -> L1d
            r5.d(r1)     // Catch: java.io.IOException -> L1d
            boolean r1 = g()     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L8c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d
            r1.<init>()     // Catch: java.io.IOException -> L1d
            java.lang.String r3 = "Unsubscribe from topic: "
            r1.append(r3)     // Catch: java.io.IOException -> L1d
            java.lang.String r6 = r6.c()     // Catch: java.io.IOException -> L1d
            r1.append(r6)     // Catch: java.io.IOException -> L1d
            r1.append(r2)     // Catch: java.io.IOException -> L1d
            goto L8c
        L6b:
            java.lang.String r1 = r6.c()     // Catch: java.io.IOException -> L1d
            r5.c(r1)     // Catch: java.io.IOException -> L1d
            boolean r1 = g()     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L8c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d
            r1.<init>()     // Catch: java.io.IOException -> L1d
            java.lang.String r3 = "Subscribe to topic: "
            r1.append(r3)     // Catch: java.io.IOException -> L1d
            java.lang.String r6 = r6.c()     // Catch: java.io.IOException -> L1d
            r1.append(r6)     // Catch: java.io.IOException -> L1d
            r1.append(r2)     // Catch: java.io.IOException -> L1d
        L8c:
            return r4
        L8d:
            java.lang.String r1 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r2 = r6.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lae
            java.lang.String r1 = "INTERNAL_SERVER_ERROR"
            java.lang.String r2 = r6.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto La6
            goto Lae
        La6:
            java.lang.String r1 = r6.getMessage()
            if (r1 != 0) goto Lad
            return r0
        Lad:
            throw r6
        Lae:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Topic operation failed: "
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = ". Will retry Topic operation."
            r1.append(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.m11.k(androidx.appcompat.view.menu.j11):boolean");
    }

    public void l(Runnable runnable, long j) {
        this.f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    public synchronized void m(boolean z) {
        this.g = z;
    }

    public final void n() {
        if (h()) {
            return;
        }
        q(0L);
    }

    public void o() {
        if (f()) {
            n();
        }
    }

    public boolean p() {
        while (true) {
            synchronized (this) {
                try {
                    j11 b = this.h.b();
                    if (b == null) {
                        g();
                        return true;
                    } else if (!k(b)) {
                        return false;
                    } else {
                        this.h.d(b);
                        j(b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void q(long j) {
        l(new n11(this, this.a, this.b, Math.min(Math.max(30L, 2 * j), i)), j);
        m(true);
    }
}
