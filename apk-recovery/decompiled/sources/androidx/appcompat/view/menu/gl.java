package androidx.appcompat.view.menu;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class gl extends p implements ScheduledFuture {
    public final ScheduledFuture t;

    /* loaded from: classes.dex */
    public class a implements b {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.gl.b
        public void a(Throwable th) {
            gl.this.t(th);
        }

        @Override // androidx.appcompat.view.menu.gl.b
        public void set(Object obj) {
            gl.this.s(obj);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Throwable th);

        void set(Object obj);
    }

    /* loaded from: classes.dex */
    public interface c {
        ScheduledFuture a(b bVar);
    }

    public gl(c cVar) {
        this.t = cVar.a(new a());
    }

    @Override // androidx.appcompat.view.menu.p
    public void g() {
        this.t.cancel(v());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.t.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* renamed from: y */
    public int compareTo(Delayed delayed) {
        return this.t.compareTo(delayed);
    }
}
