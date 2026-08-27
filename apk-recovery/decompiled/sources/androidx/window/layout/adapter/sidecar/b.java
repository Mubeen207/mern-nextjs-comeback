package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.view.menu.ba1;
import androidx.appcompat.view.menu.c60;
import androidx.appcompat.view.menu.e81;
import androidx.appcompat.view.menu.j51;
import androidx.appcompat.view.menu.lj;
import androidx.appcompat.view.menu.pf;
import androidx.appcompat.view.menu.sc;
import androidx.appcompat.view.menu.u31;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.layout.adapter.sidecar.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class b implements e81 {
    public static volatile b d;
    public androidx.window.layout.adapter.sidecar.a a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public static final a c = new a(null);
    public static final ReentrantLock e = new ReentrantLock();

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }

        public final b a(Context context) {
            c60.e(context, "context");
            if (b.d == null) {
                ReentrantLock reentrantLock = b.e;
                reentrantLock.lock();
                try {
                    if (b.d == null) {
                        b.d = new b(b.c.b(context));
                    }
                    u31 u31Var = u31.a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            b bVar = b.d;
            c60.b(bVar);
            return bVar;
        }

        public final androidx.window.layout.adapter.sidecar.a b(Context context) {
            c60.e(context, "context");
            try {
                if (c(SidecarCompat.f.c())) {
                    SidecarCompat sidecarCompat = new SidecarCompat(context);
                    if (sidecarCompat.l()) {
                        return sidecarCompat;
                    }
                    return null;
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final boolean c(j51 j51Var) {
            return j51Var != null && j51Var.compareTo(j51.r.a()) >= 0;
        }
    }

    /* renamed from: androidx.window.layout.adapter.sidecar.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0057b implements a.InterfaceC0056a {
        public C0057b() {
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0056a
        public void a(Activity activity, ba1 ba1Var) {
            c60.e(activity, "activity");
            c60.e(ba1Var, "newLayout");
            Iterator it = b.this.g().iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (c60.a(cVar.d(), activity)) {
                    cVar.b(ba1Var);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final Activity a;
        public final Executor b;
        public final pf c;
        public ba1 d;

        public c(Activity activity, Executor executor, pf pfVar) {
            c60.e(activity, "activity");
            c60.e(executor, "executor");
            c60.e(pfVar, "callback");
            this.a = activity;
            this.b = executor;
            this.c = pfVar;
        }

        public static final void c(c cVar, ba1 ba1Var) {
            c60.e(cVar, "this$0");
            c60.e(ba1Var, "$newLayoutInfo");
            cVar.c.accept(ba1Var);
        }

        public final void b(final ba1 ba1Var) {
            c60.e(ba1Var, "newLayoutInfo");
            this.d = ba1Var;
            this.b.execute(new Runnable() { // from class: androidx.appcompat.view.menu.mu0
                @Override // java.lang.Runnable
                public final void run() {
                    b.c.c(b.c.this, ba1Var);
                }
            });
        }

        public final Activity d() {
            return this.a;
        }

        public final pf e() {
            return this.c;
        }

        public final ba1 f() {
            return this.d;
        }
    }

    public b(androidx.window.layout.adapter.sidecar.a aVar) {
        this.a = aVar;
        androidx.window.layout.adapter.sidecar.a aVar2 = this.a;
        if (aVar2 != null) {
            aVar2.a(new C0057b());
        }
    }

    @Override // androidx.appcompat.view.menu.e81
    public void a(Context context, Executor executor, pf pfVar) {
        List e2;
        Object obj;
        List e3;
        c60.e(context, "context");
        c60.e(executor, "executor");
        c60.e(pfVar, "callback");
        u31 u31Var = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ReentrantLock reentrantLock = e;
            reentrantLock.lock();
            try {
                androidx.window.layout.adapter.sidecar.a aVar = this.a;
                if (aVar == null) {
                    e3 = sc.e();
                    pfVar.accept(new ba1(e3));
                    return;
                }
                boolean h = h(activity);
                c cVar = new c(activity, executor, pfVar);
                this.b.add(cVar);
                if (h) {
                    Iterator it = this.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (c60.a(activity, ((c) obj).d())) {
                            break;
                        }
                    }
                    c cVar2 = (c) obj;
                    ba1 f = cVar2 != null ? cVar2.f() : null;
                    if (f != null) {
                        cVar.b(f);
                    }
                } else {
                    aVar.b(activity);
                }
                u31 u31Var2 = u31.a;
                reentrantLock.unlock();
                u31Var = u31.a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (u31Var == null) {
            e2 = sc.e();
            pfVar.accept(new ba1(e2));
        }
    }

    @Override // androidx.appcompat.view.menu.e81
    public void b(pf pfVar) {
        c60.e(pfVar, "callback");
        synchronized (e) {
            try {
                if (this.a == null) {
                    return;
                }
                ArrayList<c> arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.e() == pfVar) {
                        c60.d(cVar, "callbackWrapper");
                        arrayList.add(cVar);
                    }
                }
                this.b.removeAll(arrayList);
                for (c cVar2 : arrayList) {
                    f(cVar2.d());
                }
                u31 u31Var = u31.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.b;
        if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
            for (c cVar : copyOnWriteArrayList) {
                if (c60.a(cVar.d(), activity)) {
                    return;
                }
            }
        }
        androidx.window.layout.adapter.sidecar.a aVar = this.a;
        if (aVar != null) {
            aVar.c(activity);
        }
    }

    public final CopyOnWriteArrayList g() {
        return this.b;
    }

    public final boolean h(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.b;
        if ((copyOnWriteArrayList instanceof Collection) && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (c cVar : copyOnWriteArrayList) {
            if (c60.a(cVar.d(), activity)) {
                return true;
            }
        }
        return false;
    }
}
