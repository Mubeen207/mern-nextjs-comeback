package androidx.appcompat.view.menu;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class jr0 implements Iterable {
    public c m;
    public c n;
    public final WeakHashMap o = new WeakHashMap();
    public int p = 0;

    /* loaded from: classes.dex */
    public static class a extends e {
        public a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // androidx.appcompat.view.menu.jr0.e
        public c c(c cVar) {
            return cVar.p;
        }

        @Override // androidx.appcompat.view.menu.jr0.e
        public c d(c cVar) {
            return cVar.o;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends e {
        public b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // androidx.appcompat.view.menu.jr0.e
        public c c(c cVar) {
            return cVar.o;
        }

        @Override // androidx.appcompat.view.menu.jr0.e
        public c d(c cVar) {
            return cVar.p;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Map.Entry {
        public final Object m;
        public final Object n;
        public c o;
        public c p;

        public c(Object obj, Object obj2) {
            this.m = obj;
            this.n = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.m.equals(cVar.m) && this.n.equals(cVar.n);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.m;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.n;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.m.hashCode() ^ this.n.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.m + "=" + this.n;
        }
    }

    /* loaded from: classes.dex */
    public class d extends f implements Iterator {
        public c m;
        public boolean n = true;

        public d() {
        }

        @Override // androidx.appcompat.view.menu.jr0.f
        public void b(c cVar) {
            c cVar2 = this.m;
            if (cVar == cVar2) {
                c cVar3 = cVar2.p;
                this.m = cVar3;
                this.n = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Map.Entry next() {
            if (this.n) {
                this.n = false;
                this.m = jr0.this.m;
            } else {
                c cVar = this.m;
                this.m = cVar != null ? cVar.o : null;
            }
            return this.m;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.n) {
                return jr0.this.m != null;
            }
            c cVar = this.m;
            return (cVar == null || cVar.o == null) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e extends f implements Iterator {
        public c m;
        public c n;

        public e(c cVar, c cVar2) {
            this.m = cVar2;
            this.n = cVar;
        }

        @Override // androidx.appcompat.view.menu.jr0.f
        public void b(c cVar) {
            if (this.m == cVar && cVar == this.n) {
                this.n = null;
                this.m = null;
            }
            c cVar2 = this.m;
            if (cVar2 == cVar) {
                this.m = c(cVar2);
            }
            if (this.n == cVar) {
                this.n = f();
            }
        }

        public abstract c c(c cVar);

        public abstract c d(c cVar);

        @Override // java.util.Iterator
        /* renamed from: e */
        public Map.Entry next() {
            c cVar = this.n;
            this.n = f();
            return cVar;
        }

        public final c f() {
            c cVar = this.n;
            c cVar2 = this.m;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.n != null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        public abstract void b(c cVar);
    }

    public Map.Entry d() {
        return this.m;
    }

    public Iterator descendingIterator() {
        b bVar = new b(this.n, this.m);
        this.o.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jr0) {
            jr0 jr0Var = (jr0) obj;
            if (size() != jr0Var.size()) {
                return false;
            }
            Iterator it = iterator();
            Iterator it2 = jr0Var.iterator();
            while (it.hasNext() && it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object next = it2.next();
                if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                    return false;
                }
            }
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        return false;
    }

    public c f(Object obj) {
        c cVar = this.m;
        while (cVar != null && !cVar.m.equals(obj)) {
            cVar = cVar.o;
        }
        return cVar;
    }

    public d g() {
        d dVar = new d();
        this.o.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry h() {
        return this.n;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public c i(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.p++;
        c cVar2 = this.n;
        if (cVar2 == null) {
            this.m = cVar;
            this.n = cVar;
            return cVar;
        }
        cVar2.o = cVar;
        cVar.p = cVar2;
        this.n = cVar;
        return cVar;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.m, this.n);
        this.o.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Object k(Object obj, Object obj2) {
        c f2 = f(obj);
        if (f2 != null) {
            return f2.n;
        }
        i(obj, obj2);
        return null;
    }

    public Object n(Object obj) {
        c f2 = f(obj);
        if (f2 == null) {
            return null;
        }
        this.p--;
        if (!this.o.isEmpty()) {
            for (f fVar : this.o.keySet()) {
                fVar.b(f2);
            }
        }
        c cVar = f2.p;
        if (cVar != null) {
            cVar.o = f2.o;
        } else {
            this.m = f2.o;
        }
        c cVar2 = f2.o;
        if (cVar2 != null) {
            cVar2.p = cVar;
        } else {
            this.n = cVar;
        }
        f2.o = null;
        f2.p = null;
        return f2.n;
    }

    public int size() {
        return this.p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
