package androidx.appcompat.view.menu;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class zd0 {
    public static zd0 c;
    public final LongSparseArray a = new LongSparseArray();
    public final PriorityQueue b = new PriorityQueue();

    /* loaded from: classes.dex */
    public static class a {
        public static final AtomicLong b = new AtomicLong(0);
        public final long a;

        public a(long j) {
            this.a = j;
        }

        public static a b() {
            return c(b.incrementAndGet());
        }

        public static a c(long j) {
            return new a(j);
        }

        public long d() {
            return this.a;
        }
    }

    public static zd0 a() {
        if (c == null) {
            c = new zd0();
        }
        return c;
    }

    public MotionEvent b(a aVar) {
        while (!this.b.isEmpty() && ((Long) this.b.peek()).longValue() < aVar.a) {
            this.a.remove(((Long) this.b.poll()).longValue());
        }
        if (!this.b.isEmpty() && ((Long) this.b.peek()).longValue() == aVar.a) {
            this.b.poll();
        }
        MotionEvent motionEvent = (MotionEvent) this.a.get(aVar.a);
        this.a.remove(aVar.a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a b = a.b();
        this.a.put(b.a, MotionEvent.obtain(motionEvent));
        this.b.add(Long.valueOf(b.a));
        return b;
    }
}
