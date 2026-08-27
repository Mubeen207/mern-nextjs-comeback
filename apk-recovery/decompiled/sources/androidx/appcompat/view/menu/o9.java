package androidx.appcompat.view.menu;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class o9 {

    /* loaded from: classes.dex */
    public static final class a {
        public Object a;
        public d b;
        public fp0 c = fp0.w();
        public boolean d;

        public void a() {
            this.a = null;
            this.b = null;
            this.c.s(null);
        }

        public boolean b(Object obj) {
            boolean z = true;
            this.d = true;
            d dVar = this.b;
            z = (dVar == null || !dVar.b(obj)) ? false : false;
            if (z) {
                d();
            }
            return z;
        }

        public boolean c() {
            boolean z = true;
            this.d = true;
            d dVar = this.b;
            z = (dVar == null || !dVar.a(true)) ? false : false;
            if (z) {
                d();
            }
            return z;
        }

        public final void d() {
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public boolean e(Throwable th) {
            boolean z = true;
            this.d = true;
            d dVar = this.b;
            z = (dVar == null || !dVar.d(th)) ? false : false;
            if (z) {
                d();
            }
            return z;
        }

        public void finalize() {
            fp0 fp0Var;
            d dVar = this.b;
            if (dVar != null && !dVar.isDone()) {
                dVar.d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
            }
            if (this.d || (fp0Var = this.c) == null) {
                return;
            }
            fp0Var.s(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        Object a(a aVar);
    }

    /* loaded from: classes.dex */
    public static final class d implements m90 {
        public final WeakReference m;
        public final p n = new a();

        /* loaded from: classes.dex */
        public class a extends p {
            public a() {
            }

            @Override // androidx.appcompat.view.menu.p
            public String p() {
                a aVar = (a) d.this.m.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.a + "]";
            }
        }

        public d(a aVar) {
            this.m = new WeakReference(aVar);
        }

        public boolean a(boolean z) {
            return this.n.cancel(z);
        }

        public boolean b(Object obj) {
            return this.n.s(obj);
        }

        @Override // androidx.appcompat.view.menu.m90
        public void c(Runnable runnable, Executor executor) {
            this.n.c(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            a aVar = (a) this.m.get();
            boolean cancel = this.n.cancel(z);
            if (cancel && aVar != null) {
                aVar.a();
            }
            return cancel;
        }

        public boolean d(Throwable th) {
            return this.n.t(th);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.n.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.n.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.n.isDone();
        }

        public String toString() {
            return this.n.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j, TimeUnit timeUnit) {
            return this.n.get(j, timeUnit);
        }
    }

    public static m90 a(c cVar) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.b = dVar;
        aVar.a = cVar.getClass();
        try {
            Object a2 = cVar.a(aVar);
            if (a2 != null) {
                aVar.a = a2;
            }
        } catch (Exception e) {
            dVar.d(e);
        }
        return dVar;
    }
}
