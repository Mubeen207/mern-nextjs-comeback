package androidx.appcompat.view.menu;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.appcompat.view.menu.re;
import androidx.appcompat.view.menu.v7;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class tr {
    public static final Object k = new Object();
    public static final Map l = new o4();
    public final Context a;
    public final String b;
    public final ts c;
    public final re d;
    public final m80 g;
    public final hl0 h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final List i = new CopyOnWriteArrayList();
    public final List j = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z);
    }

    /* loaded from: classes.dex */
    public static class b implements v7.a {
        public static AtomicReference a = new AtomicReference();

        public static void c(Context context) {
            if (ti0.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    b bVar = new b();
                    if (zd1.a(a, null, bVar)) {
                        v7.c(application);
                        v7.b().a(bVar);
                    }
                }
            }
        }

        @Override // androidx.appcompat.view.menu.v7.a
        public void a(boolean z) {
            synchronized (tr.k) {
                try {
                    Iterator it = new ArrayList(tr.l.values()).iterator();
                    while (it.hasNext()) {
                        tr trVar = (tr) it.next();
                        if (trVar.e.get()) {
                            trVar.x(z);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends BroadcastReceiver {
        public static AtomicReference b = new AtomicReference();
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        public static void b(Context context) {
            if (b.get() == null) {
                c cVar = new c(context);
                if (zd1.a(b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (tr.k) {
                try {
                    for (tr trVar : tr.l.values()) {
                        trVar.o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    public tr(final Context context, String str, ts tsVar) {
        this.a = (Context) pj0.i(context);
        this.b = pj0.e(str);
        this.c = (ts) pj0.i(tsVar);
        ww0 b2 = FirebaseInitProvider.b();
        us.b("Firebase");
        us.b("ComponentDiscovery");
        List b3 = ce.c(context, ComponentDiscoveryService.class).b();
        us.a();
        us.b("Runtime");
        re.b g = re.k(h31.INSTANCE).d(b3).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(ud.s(context, Context.class, new Class[0])).b(ud.s(this, tr.class, new Class[0])).b(ud.s(tsVar, ts.class, new Class[0])).g(new ge());
        if (r41.a(context) && FirebaseInitProvider.c()) {
            g.b(ud.s(b2, ww0.class, new Class[0]));
        }
        re e = g.e();
        this.d = e;
        us.a();
        this.g = new m80(new hl0() { // from class: androidx.appcompat.view.menu.rr
            @Override // androidx.appcompat.view.menu.hl0
            public final Object get() {
                vi u;
                u = tr.this.u(context);
                return u;
            }
        });
        this.h = e.d(sj.class);
        g(new a() { // from class: androidx.appcompat.view.menu.sr
            @Override // androidx.appcompat.view.menu.tr.a
            public final void a(boolean z) {
                tr.this.v(z);
            }
        });
        us.a();
    }

    public static tr k() {
        tr trVar;
        synchronized (k) {
            try {
                trVar = (tr) l.get("[DEFAULT]");
                if (trVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + gk0.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((sj) trVar.h.get()).l();
            } catch (Throwable th) {
                throw th;
            }
        }
        return trVar;
    }

    public static tr p(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return k();
                }
                ts a2 = ts.a(context);
                if (a2 == null) {
                    return null;
                }
                return q(context, a2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static tr q(Context context, ts tsVar) {
        return r(context, tsVar, "[DEFAULT]");
    }

    public static tr r(Context context, ts tsVar, String str) {
        tr trVar;
        b.c(context);
        String w = w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            Map map = l;
            pj0.m(!map.containsKey(w), "FirebaseApp name " + w + " already exists!");
            pj0.j(context, "Application context cannot be null.");
            trVar = new tr(context, w, tsVar);
            map.put(w, trVar);
        }
        trVar.o();
        return trVar;
    }

    public static String w(String str) {
        return str.trim();
    }

    public boolean equals(Object obj) {
        if (obj instanceof tr) {
            return this.b.equals(((tr) obj).l());
        }
        return false;
    }

    public void g(a aVar) {
        h();
        if (this.e.get() && v7.b().d()) {
            aVar.a(true);
        }
        this.i.add(aVar);
    }

    public final void h() {
        pj0.m(!this.f.get(), "FirebaseApp was deleted");
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public Object i(Class cls) {
        h();
        return this.d.a(cls);
    }

    public Context j() {
        h();
        return this.a;
    }

    public String l() {
        h();
        return this.b;
    }

    public ts m() {
        h();
        return this.c;
    }

    public String n() {
        return x7.a(l().getBytes(Charset.defaultCharset())) + "+" + x7.a(m().c().getBytes(Charset.defaultCharset()));
    }

    public final void o() {
        if (!r41.a(this.a)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            sb.append(l());
            c.b(this.a);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        sb2.append(l());
        this.d.n(t());
        ((sj) this.h.get()).l();
    }

    public boolean s() {
        h();
        return ((vi) this.g.get()).b();
    }

    public boolean t() {
        return "[DEFAULT]".equals(l());
    }

    public String toString() {
        return zf0.c(this).a("name", this.b).a("options", this.c).toString();
    }

    public final /* synthetic */ vi u(Context context) {
        return new vi(context, n(), (vl0) this.d.a(vl0.class));
    }

    public final /* synthetic */ void v(boolean z) {
        if (z) {
            return;
        }
        ((sj) this.h.get()).l();
    }

    public final void x(boolean z) {
        for (a aVar : this.i) {
            aVar.a(z);
        }
    }
}
