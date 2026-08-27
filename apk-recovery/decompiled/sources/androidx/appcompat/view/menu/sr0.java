package androidx.appcompat.view.menu;

import android.os.Bundle;
import androidx.appcompat.view.menu.jr0;
import androidx.lifecycle.f;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class sr0 {
    public static final b f = new b(null);
    public boolean b;
    public Bundle c;
    public boolean d;
    public final jr0 a = new jr0();
    public boolean e = true;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(lj ljVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        Bundle a();
    }

    public static final void d(sr0 sr0Var, d90 d90Var, f.a aVar) {
        c60.e(sr0Var, "this$0");
        c60.e(d90Var, "<anonymous parameter 0>");
        c60.e(aVar, "event");
        if (aVar == f.a.ON_START) {
            sr0Var.e = true;
        } else if (aVar == f.a.ON_STOP) {
            sr0Var.e = false;
        }
    }

    public final Bundle b(String str) {
        c60.e(str, "key");
        if (this.d) {
            Bundle bundle = this.c;
            if (bundle != null) {
                Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
                Bundle bundle3 = this.c;
                if (bundle3 != null) {
                    bundle3.remove(str);
                }
                Bundle bundle4 = this.c;
                if (bundle4 == null || bundle4.isEmpty()) {
                    this.c = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final c c(String str) {
        c60.e(str, "key");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c60.d(entry, "components");
            c cVar = (c) entry.getValue();
            if (c60.a((String) entry.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(androidx.lifecycle.f fVar) {
        c60.e(fVar, "lifecycle");
        if (!(!this.b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        fVar.a(new androidx.lifecycle.h() { // from class: androidx.appcompat.view.menu.rr0
            @Override // androidx.lifecycle.h
            public final void c(d90 d90Var, f.a aVar) {
                sr0.d(sr0.this, d90Var, aVar);
            }
        });
        this.b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.d = true;
    }

    public final void g(Bundle bundle) {
        c60.e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        jr0.d g = this.a.g();
        c60.d(g, "this.components.iteratorWithAdditions()");
        while (g.hasNext()) {
            Map.Entry entry = (Map.Entry) g.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void h(String str, c cVar) {
        c60.e(str, "key");
        c60.e(cVar, "provider");
        if (((c) this.a.k(str, cVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }
}
