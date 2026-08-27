package androidx.appcompat.view.menu;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class p implements m90 {
    public static final boolean p = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger q = Logger.getLogger(p.class.getName());
    public static final b r;
    public static final Object s;
    public volatile Object m;
    public volatile e n;
    public volatile h o;

    /* loaded from: classes.dex */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(p pVar, e eVar, e eVar2);

        public abstract boolean b(p pVar, Object obj, Object obj2);

        public abstract boolean c(p pVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static final c c;
        public static final c d;
        public final boolean a;
        public final Throwable b;

        static {
            if (p.p) {
                d = null;
                c = null;
                return;
            }
            d = new c(false, null);
            c = new c(true, null);
        }

        public c(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static final d b = new d(new a("Failure occurred while trying to finish a future."));
        public final Throwable a;

        /* loaded from: classes.dex */
        public class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.a = (Throwable) p.i(th);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public static final e d = new e(null, null);
        public final Runnable a;
        public final Executor b;
        public e c;

        public e(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends b {
        public final AtomicReferenceFieldUpdater a;
        public final AtomicReferenceFieldUpdater b;
        public final AtomicReferenceFieldUpdater c;
        public final AtomicReferenceFieldUpdater d;
        public final AtomicReferenceFieldUpdater e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.appcompat.view.menu.p.b
        public boolean a(p pVar, e eVar, e eVar2) {
            return q.a(this.d, pVar, eVar, eVar2);
        }

        @Override // androidx.appcompat.view.menu.p.b
        public boolean b(p pVar, Object obj, Object obj2) {
            return q.a(this.e, pVar, obj, obj2);
        }

        @Override // androidx.appcompat.view.menu.p.b
        public boolean c(p pVar, h hVar, h hVar2) {
            return q.a(this.c, pVar, hVar, hVar2);
        }

        @Override // androidx.appcompat.view.menu.p.b
        public void d(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // androidx.appcompat.view.menu.p.b
        public void e(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends b {
        public g() {
            super();
        }

        @Override // androidx.appcompat.view.menu.p.b
        public boolean a(p pVar, e eVar, e eVar2) {
            synchronized (pVar) {
                try {
                    if (pVar.n == eVar) {
                        pVar.n = eVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.appcompat.view.menu.p.b
        public boolean b(p pVar, Object obj, Object obj2) {
            synchronized (pVar) {
                try {
                    if (pVar.m == obj) {
                        pVar.m = obj2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.appcompat.view.menu.p.b
        public boolean c(p pVar, h hVar, h hVar2) {
            synchronized (pVar) {
                try {
                    if (pVar.o == hVar) {
                        pVar.o = hVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.appcompat.view.menu.p.b
        public void d(h hVar, h hVar2) {
            hVar.b = hVar2;
        }

        @Override // androidx.appcompat.view.menu.p.b
        public void e(h hVar, Thread thread) {
            hVar.a = thread;
        }
    }

    /* loaded from: classes.dex */
    public static final class h {
        public static final h c = new h(false);
        public volatile Thread a;
        public volatile h b;

        public h(boolean z) {
        }

        public void a(h hVar) {
            p.r.d(this, hVar);
        }

        public void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }

        public h() {
            p.r.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(p.class, h.class, "o"), AtomicReferenceFieldUpdater.newUpdater(p.class, e.class, "n"), AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "m"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        r = gVar;
        if (th != null) {
            q.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        s = new Object();
    }

    public static CancellationException h(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static Object i(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void k(p pVar) {
        pVar.q();
        pVar.g();
        e j = pVar.j(null);
        while (j != null) {
            e eVar = j.c;
            l(j.a, j.b);
            j = eVar;
        }
    }

    public static void l(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = q;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object n(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // androidx.appcompat.view.menu.m90
    public final void c(Runnable runnable, Executor executor) {
        i(runnable);
        i(executor);
        e eVar = this.n;
        if (eVar == e.d) {
            l(runnable, executor);
        }
        e eVar2 = new e(runnable, executor);
        do {
            eVar2.c = eVar;
            if (r.a(this, eVar, eVar2)) {
                return;
            }
            eVar = this.n;
        } while (eVar != e.d);
        l(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.m;
        if (obj == null) {
            if (r.b(this, obj, p ? new c(z, new CancellationException("Future.cancel() was called.")) : z ? c.c : c.d)) {
                if (z) {
                    o();
                }
                k(this);
                return true;
            }
        }
        return false;
    }

    public final void e(StringBuilder sb) {
        try {
            Object n = n(this);
            sb.append("SUCCESS, result=[");
            sb.append(u(n));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    public void g() {
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.m;
        if ((obj != null) & true) {
            return m(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.o;
            if (hVar != h.c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (r.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                r(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.m;
                            if ((obj2 != null) & true) {
                                return m(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        r(hVar2);
                    } else {
                        hVar = this.o;
                    }
                } while (hVar != h.c);
                return m(this.m);
            }
            return m(this.m);
        }
        while (nanos > 0) {
            Object obj3 = this.m;
            if ((obj3 != null) & true) {
                return m(obj3);
            }
            if (!Thread.interrupted()) {
                nanos = nanoTime - System.nanoTime();
            } else {
                throw new InterruptedException();
            }
        }
        String pVar = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
            boolean z = i == 0 || nanos2 > 1000;
            if (i > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + pVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.m instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.m != null) & true;
    }

    public final e j(e eVar) {
        e eVar2;
        do {
            eVar2 = this.n;
        } while (!r.a(this, eVar2, e.d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.c;
            eVar4.c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    public final Object m(Object obj) {
        if (obj instanceof c) {
            throw h("Task was cancelled.", ((c) obj).b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).a);
        }
        if (obj == s) {
            return null;
        }
        return obj;
    }

    public void o() {
    }

    public String p() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void q() {
        h hVar;
        do {
            hVar = this.o;
        } while (!r.c(this, hVar, h.c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.b;
        }
    }

    public final void r(h hVar) {
        hVar.a = null;
        while (true) {
            h hVar2 = this.o;
            if (hVar2 == h.c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.b;
                if (hVar2.a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.b = hVar4;
                    if (hVar3.a == null) {
                        break;
                    }
                } else if (!r.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public boolean s(Object obj) {
        if (obj == null) {
            obj = s;
        }
        if (r.b(this, null, obj)) {
            k(this);
            return true;
        }
        return false;
    }

    public boolean t(Throwable th) {
        if (r.b(this, null, new d((Throwable) i(th)))) {
            k(this);
            return true;
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                str = p();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final String u(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final boolean v() {
        Object obj = this.m;
        return (obj instanceof c) && ((c) obj).a;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.m;
        if ((obj2 != null) & true) {
            return m(obj2);
        }
        h hVar = this.o;
        if (hVar != h.c) {
            h hVar2 = new h();
            do {
                hVar2.a(hVar);
                if (r.c(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            r(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.m;
                    } while (!((obj != null) & true));
                    return m(obj);
                }
                hVar = this.o;
            } while (hVar != h.c);
            return m(this.m);
        }
        return m(this.m);
    }
}
