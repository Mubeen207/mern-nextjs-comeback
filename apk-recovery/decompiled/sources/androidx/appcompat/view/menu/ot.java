package androidx.appcompat.view.menu;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.view.menu.zt;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class ot implements i1 {
    public final io.flutter.embedding.engine.a b;
    public final zt.b c;
    public qp e;
    public c f;
    public Service i;
    public BroadcastReceiver k;
    public ContentProvider m;
    public final Map a = new HashMap();
    public final Map d = new HashMap();
    public boolean g = false;
    public final Map h = new HashMap();
    public final Map j = new HashMap();
    public final Map l = new HashMap();

    /* loaded from: classes.dex */
    public static class b implements zt.a {
        public final xt a;

        public b(xt xtVar) {
            this.a = xtVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o1 {
        public final Activity a;
        public final HiddenLifecycleReference b;
        public final Set c = new HashSet();
        public final Set d = new HashSet();
        public final Set e = new HashSet();
        public final Set f = new HashSet();
        public final Set g = new HashSet();
        public final Set h = new HashSet();

        public c(Activity activity, androidx.lifecycle.f fVar) {
            this.a = activity;
            this.b = new HiddenLifecycleReference(fVar);
        }

        public boolean a(int i, int i2, Intent intent) {
            Iterator it = new HashSet(this.d).iterator();
            while (true) {
                boolean z = false;
                while (it.hasNext()) {
                    if (((fj0) it.next()).a(i, i2, intent) || z) {
                        z = true;
                    }
                }
                return z;
            }
        }

        public void b(Intent intent) {
            Iterator it = this.e.iterator();
            if (it.hasNext()) {
                my0.a(it.next());
                throw null;
            }
        }

        public boolean c(int i, String[] strArr, int[] iArr) {
            Iterator it = this.c.iterator();
            if (it.hasNext()) {
                my0.a(it.next());
                throw null;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.o1
        public Activity d() {
            return this.a;
        }

        @Override // androidx.appcompat.view.menu.o1
        public void e(fj0 fj0Var) {
            this.d.add(fj0Var);
        }

        @Override // androidx.appcompat.view.menu.o1
        public void f(fj0 fj0Var) {
            this.d.remove(fj0Var);
        }

        public void g(Bundle bundle) {
            Iterator it = this.h.iterator();
            if (it.hasNext()) {
                my0.a(it.next());
                throw null;
            }
        }

        public void h(Bundle bundle) {
            Iterator it = this.h.iterator();
            if (it.hasNext()) {
                my0.a(it.next());
                throw null;
            }
        }

        public void i() {
            Iterator it = this.f.iterator();
            if (it.hasNext()) {
                my0.a(it.next());
                throw null;
            }
        }
    }

    public ot(Context context, io.flutter.embedding.engine.a aVar, xt xtVar, io.flutter.embedding.engine.b bVar) {
        this.b = aVar;
        this.c = new zt.b(context, aVar, aVar.k(), aVar.s(), aVar.q().M(), new b(xtVar), bVar);
    }

    @Override // androidx.appcompat.view.menu.i1
    public boolean a(int i, int i2, Intent intent) {
        if (!s()) {
            ha0.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        s11 i3 = s11.i("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            boolean a2 = this.f.a(i, i2, intent);
            if (i3 != null) {
                i3.close();
            }
            return a2;
        } catch (Throwable th) {
            if (i3 != null) {
                try {
                    i3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // androidx.appcompat.view.menu.i1
    public boolean b(int i, String[] strArr, int[] iArr) {
        if (!s()) {
            ha0.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        s11 i2 = s11.i("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            boolean c2 = this.f.c(i, strArr, iArr);
            if (i2 != null) {
                i2.close();
            }
            return c2;
        } catch (Throwable th) {
            if (i2 != null) {
                try {
                    i2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // androidx.appcompat.view.menu.i1
    public void c() {
        if (!s()) {
            ha0.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        s11 i = s11.i("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.g = true;
            for (d1 d1Var : this.d.values()) {
                d1Var.i();
            }
            m();
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // androidx.appcompat.view.menu.i1
    public void d(qp qpVar, androidx.lifecycle.f fVar) {
        s11 i = s11.i("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            qp qpVar2 = this.e;
            if (qpVar2 != null) {
                qpVar2.e();
            }
            n();
            this.e = qpVar;
            k((Activity) qpVar.f(), fVar);
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // androidx.appcompat.view.menu.i1
    public void e(Intent intent) {
        if (!s()) {
            ha0.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        s11 i = s11.i("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.f.b(intent);
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // androidx.appcompat.view.menu.i1
    public void f(Bundle bundle) {
        if (!s()) {
            ha0.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        s11 i = s11.i("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.f.g(bundle);
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // androidx.appcompat.view.menu.i1
    public void g() {
        if (!s()) {
            ha0.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        s11 i = s11.i("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            for (d1 d1Var : this.d.values()) {
                d1Var.c();
            }
            m();
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // androidx.appcompat.view.menu.i1
    public void h(Bundle bundle) {
        if (!s()) {
            ha0.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        s11 i = s11.i("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.f.h(bundle);
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // androidx.appcompat.view.menu.i1
    public void i() {
        if (!s()) {
            ha0.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        s11 i = s11.i("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.f.i();
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void j(zt ztVar) {
        s11 i = s11.i("FlutterEngineConnectionRegistry#add " + ztVar.getClass().getSimpleName());
        try {
            if (r(ztVar.getClass())) {
                ha0.g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + ztVar + ") but it was already registered with this FlutterEngine (" + this.b + ").");
                if (i != null) {
                    i.close();
                    return;
                }
                return;
            }
            ha0.f("FlutterEngineCxnRegstry", "Adding plugin: " + ztVar);
            this.a.put(ztVar.getClass(), ztVar);
            ztVar.h(this.c);
            if (ztVar instanceof d1) {
                d1 d1Var = (d1) ztVar;
                this.d.put(ztVar.getClass(), d1Var);
                if (s()) {
                    d1Var.g(this.f);
                }
            }
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void k(Activity activity, androidx.lifecycle.f fVar) {
        this.f = new c(activity, fVar);
        this.b.q().f0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.b.q().u(activity, this.b.s(), this.b.k());
        for (d1 d1Var : this.d.values()) {
            if (this.g) {
                d1Var.b(this.f);
            } else {
                d1Var.g(this.f);
            }
        }
        this.g = false;
    }

    public void l() {
        ha0.f("FlutterEngineCxnRegstry", "Destroying.");
        n();
        y();
    }

    public final void m() {
        this.b.q().E();
        this.e = null;
        this.f = null;
    }

    public final void n() {
        if (s()) {
            g();
        } else if (v()) {
            q();
        } else if (t()) {
            o();
        } else if (u()) {
            p();
        }
    }

    public void o() {
        if (!t()) {
            ha0.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        s11 i = s11.i("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            Iterator it = this.j.values().iterator();
            if (it.hasNext()) {
                my0.a(it.next());
                throw null;
            } else if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void p() {
        if (!u()) {
            ha0.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        s11 i = s11.i("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            Iterator it = this.l.values().iterator();
            if (it.hasNext()) {
                my0.a(it.next());
                throw null;
            } else if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void q() {
        if (!v()) {
            ha0.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        s11 i = s11.i("FlutterEngineConnectionRegistry#detachFromService");
        try {
            Iterator it = this.h.values().iterator();
            if (it.hasNext()) {
                my0.a(it.next());
                throw null;
            }
            this.i = null;
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean r(Class cls) {
        return this.a.containsKey(cls);
    }

    public final boolean s() {
        return this.e != null;
    }

    public final boolean t() {
        return this.k != null;
    }

    public final boolean u() {
        return this.m != null;
    }

    public final boolean v() {
        return this.i != null;
    }

    public void w(Class cls) {
        zt ztVar = (zt) this.a.get(cls);
        if (ztVar == null) {
            return;
        }
        s11 i = s11.i("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
        try {
            if (ztVar instanceof d1) {
                if (s()) {
                    ((d1) ztVar).c();
                }
                this.d.remove(cls);
            }
            ztVar.f(this.c);
            this.a.remove(cls);
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void x(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            w((Class) it.next());
        }
    }

    public void y() {
        x(new HashSet(this.a.keySet()));
        this.a.clear();
    }
}
