package androidx.lifecycle;

import androidx.appcompat.view.menu.c60;
import androidx.appcompat.view.menu.c90;
import androidx.appcompat.view.menu.cr;
import androidx.appcompat.view.menu.d90;
import androidx.appcompat.view.menu.e90;
import androidx.appcompat.view.menu.h4;
import androidx.appcompat.view.menu.jr0;
import androidx.appcompat.view.menu.lj;
import androidx.appcompat.view.menu.ne0;
import androidx.appcompat.view.menu.zw0;
import androidx.lifecycle.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class i extends f {
    public static final a k = new a(null);
    public final boolean b;
    public cr c;
    public f.b d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public ArrayList i;
    public final ne0 j;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }

        public final f.b a(f.b bVar, f.b bVar2) {
            c60.e(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public f.b a;
        public h b;

        public b(c90 c90Var, f.b bVar) {
            c60.e(bVar, "initialState");
            c60.b(c90Var);
            this.b = e90.f(c90Var);
            this.a = bVar;
        }

        public final void a(d90 d90Var, f.a aVar) {
            c60.e(aVar, "event");
            f.b e = aVar.e();
            this.a = i.k.a(this.a, e);
            h hVar = this.b;
            c60.b(d90Var);
            hVar.c(d90Var, aVar);
            this.a = e;
        }

        public final f.b b() {
            return this.a;
        }
    }

    public i(d90 d90Var, boolean z) {
        this.b = z;
        this.c = new cr();
        f.b bVar = f.b.INITIALIZED;
        this.d = bVar;
        this.i = new ArrayList();
        this.e = new WeakReference(d90Var);
        this.j = zw0.a(bVar);
    }

    @Override // androidx.lifecycle.f
    public void a(c90 c90Var) {
        d90 d90Var;
        c60.e(c90Var, "observer");
        f("addObserver");
        f.b bVar = this.d;
        f.b bVar2 = f.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = f.b.INITIALIZED;
        }
        b bVar3 = new b(c90Var, bVar2);
        if (((b) this.c.k(c90Var, bVar3)) == null && (d90Var = (d90) this.e.get()) != null) {
            boolean z = this.f != 0 || this.g;
            f.b e = e(c90Var);
            this.f++;
            while (bVar3.b().compareTo(e) < 0 && this.c.contains(c90Var)) {
                l(bVar3.b());
                f.a b2 = f.a.Companion.b(bVar3.b());
                if (b2 == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(d90Var, b2);
                k();
                e = e(c90Var);
            }
            if (!z) {
                m();
            }
            this.f--;
        }
    }

    @Override // androidx.lifecycle.f
    public f.b b() {
        return this.d;
    }

    @Override // androidx.lifecycle.f
    public void c(c90 c90Var) {
        c60.e(c90Var, "observer");
        f("removeObserver");
        this.c.n(c90Var);
    }

    public final void d(d90 d90Var) {
        Iterator descendingIterator = this.c.descendingIterator();
        c60.d(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.h) {
            Map.Entry entry = (Map.Entry) descendingIterator.next();
            c60.d(entry, "next()");
            c90 c90Var = (c90) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.d) > 0 && !this.h && this.c.contains(c90Var)) {
                f.a a2 = f.a.Companion.a(bVar.b());
                if (a2 == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                l(a2.e());
                bVar.a(d90Var, a2);
                k();
            }
        }
    }

    public final f.b e(c90 c90Var) {
        b bVar;
        Map.Entry p = this.c.p(c90Var);
        f.b bVar2 = null;
        f.b b2 = (p == null || (bVar = (b) p.getValue()) == null) ? null : bVar.b();
        if (!this.i.isEmpty()) {
            ArrayList arrayList = this.i;
            bVar2 = (f.b) arrayList.get(arrayList.size() - 1);
        }
        a aVar = k;
        return aVar.a(aVar.a(this.d, b2), bVar2);
    }

    public final void f(String str) {
        if (!this.b || h4.f().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    public final void g(d90 d90Var) {
        jr0.d g = this.c.g();
        c60.d(g, "observerMap.iteratorWithAdditions()");
        while (g.hasNext() && !this.h) {
            Map.Entry entry = (Map.Entry) g.next();
            c90 c90Var = (c90) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.d) < 0 && !this.h && this.c.contains(c90Var)) {
                l(bVar.b());
                f.a b2 = f.a.Companion.b(bVar.b());
                if (b2 == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(d90Var, b2);
                k();
            }
        }
    }

    public void h(f.a aVar) {
        c60.e(aVar, "event");
        f("handleLifecycleEvent");
        j(aVar.e());
    }

    public final boolean i() {
        if (this.c.size() == 0) {
            return true;
        }
        Map.Entry d = this.c.d();
        c60.b(d);
        f.b b2 = ((b) d.getValue()).b();
        Map.Entry h = this.c.h();
        c60.b(h);
        f.b b3 = ((b) h.getValue()).b();
        return b2 == b3 && this.d == b3;
    }

    public final void j(f.b bVar) {
        f.b bVar2 = this.d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == f.b.INITIALIZED && bVar == f.b.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.d + " in component " + this.e.get()).toString());
        }
        this.d = bVar;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        m();
        this.g = false;
        if (this.d == f.b.DESTROYED) {
            this.c = new cr();
        }
    }

    public final void k() {
        ArrayList arrayList = this.i;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void l(f.b bVar) {
        this.i.add(bVar);
    }

    public final void m() {
        d90 d90Var = (d90) this.e.get();
        if (d90Var == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!i()) {
            this.h = false;
            f.b bVar = this.d;
            Map.Entry d = this.c.d();
            c60.b(d);
            if (bVar.compareTo(((b) d.getValue()).b()) < 0) {
                d(d90Var);
            }
            Map.Entry h = this.c.h();
            if (!this.h && h != null && this.d.compareTo(((b) h.getValue()).b()) > 0) {
                g(d90Var);
            }
        }
        this.h = false;
        this.j.setValue(b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(d90 d90Var) {
        this(d90Var, true);
        c60.e(d90Var, "provider");
    }
}
