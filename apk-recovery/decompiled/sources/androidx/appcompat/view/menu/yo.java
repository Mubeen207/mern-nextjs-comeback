package androidx.appcompat.view.menu;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class yo implements ey0, vl0 {
    public final Map a = new HashMap();
    public Queue b = new ArrayDeque();
    public final Executor c;

    public yo(Executor executor) {
        this.c = executor;
    }

    public static /* synthetic */ void g(Map.Entry entry, vo voVar) {
        ((zo) entry.getKey()).a(voVar);
    }

    @Override // androidx.appcompat.view.menu.ey0
    public synchronized void a(Class cls, Executor executor, zo zoVar) {
        try {
            rj0.b(cls);
            rj0.b(zoVar);
            rj0.b(executor);
            if (!this.a.containsKey(cls)) {
                this.a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(cls)).put(zoVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.appcompat.view.menu.ey0
    public void b(Class cls, zo zoVar) {
        a(cls, this.c, zoVar);
    }

    @Override // androidx.appcompat.view.menu.ey0
    public synchronized void c(Class cls, zo zoVar) {
        rj0.b(cls);
        rj0.b(zoVar);
        if (this.a.containsKey(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.a.get(cls);
            concurrentHashMap.remove(zoVar);
            if (concurrentHashMap.isEmpty()) {
                this.a.remove(cls);
            }
        }
    }

    public void e() {
        Queue<Object> queue;
        synchronized (this) {
            try {
                queue = this.b;
                if (queue != null) {
                    this.b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            for (Object obj : queue) {
                my0.a(obj);
                h(null);
            }
        }
    }

    public final synchronized Set f(vo voVar) {
        throw null;
    }

    public void h(final vo voVar) {
        rj0.b(voVar);
        synchronized (this) {
            try {
                Queue queue = this.b;
                if (queue != null) {
                    queue.add(voVar);
                    return;
                }
                for (final Map.Entry entry : f(voVar)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, voVar) { // from class: androidx.appcompat.view.menu.xo
                        public final /* synthetic */ Map.Entry m;

                        @Override // java.lang.Runnable
                        public final void run() {
                            yo.g(this.m, null);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
