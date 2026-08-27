package androidx.appcompat.view.menu;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* loaded from: classes.dex */
public abstract class v52 extends AbstractMap {
    public final int m;
    public List n;
    public Map o;
    public boolean p;
    public volatile t62 q;
    public Map r;
    public volatile d62 s;

    public static v52 b(int i) {
        return new t52(i);
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.n.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo((Comparable) ((j62) this.n.get(i2)).getKey());
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            } else if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo((Comparable) ((j62) this.n.get(i4)).getKey());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (compareTo2 <= 0) {
                return i4;
            } else {
                i3 = i4 + 1;
            }
        }
        i = i3 + 1;
        return -i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        q();
        if (!this.n.isEmpty()) {
            this.n.clear();
        }
        if (this.o.isEmpty()) {
            return;
        }
        this.o.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.o.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d */
    public final Object put(Comparable comparable, Object obj) {
        q();
        int a = a(comparable);
        if (a >= 0) {
            return ((j62) this.n.get(a)).setValue(obj);
        }
        q();
        if (this.n.isEmpty() && !(this.n instanceof ArrayList)) {
            this.n = new ArrayList(this.m);
        }
        int i = -(a + 1);
        if (i >= this.m) {
            return p().put(comparable, obj);
        }
        int size = this.n.size();
        int i2 = this.m;
        if (size == i2) {
            j62 j62Var = (j62) this.n.remove(i2 - 1);
            p().put((Comparable) j62Var.getKey(), j62Var.getValue());
        }
        this.n.add(i, new j62(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.q == null) {
            this.q = new t62(this);
        }
        return this.q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v52) {
            v52 v52Var = (v52) obj;
            int size = size();
            if (size != v52Var.size()) {
                return false;
            }
            int g = g();
            if (g != v52Var.g()) {
                return entrySet().equals(v52Var.entrySet());
            }
            for (int i = 0; i < g; i++) {
                if (!h(i).equals(v52Var.h(i))) {
                    return false;
                }
            }
            if (g != size) {
                return this.o.equals(v52Var.o);
            }
            return true;
        }
        return super.equals(obj);
    }

    public void f() {
        if (this.p) {
            return;
        }
        this.o = this.o.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.o);
        this.r = this.r.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.r);
        this.p = true;
    }

    public final int g() {
        return this.n.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        return a >= 0 ? ((j62) this.n.get(a)).getValue() : this.o.get(comparable);
    }

    public final Map.Entry h(int i) {
        return (Map.Entry) this.n.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int g = g();
        int i = 0;
        for (int i2 = 0; i2 < g; i2++) {
            i += ((j62) this.n.get(i2)).hashCode();
        }
        return this.o.size() > 0 ? i + this.o.hashCode() : i;
    }

    public final Iterable j() {
        return this.o.isEmpty() ? h62.a() : this.o.entrySet();
    }

    public final Object k(int i) {
        q();
        Object value = ((j62) this.n.remove(i)).getValue();
        if (!this.o.isEmpty()) {
            Iterator it = p().entrySet().iterator();
            this.n.add(new j62(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public final Set m() {
        if (this.s == null) {
            this.s = new d62(this);
        }
        return this.s;
    }

    public final boolean o() {
        return this.p;
    }

    public final SortedMap p() {
        q();
        if (this.o.isEmpty() && !(this.o instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.o = treeMap;
            this.r = treeMap.descendingMap();
        }
        return (SortedMap) this.o;
    }

    public final void q() {
        if (this.p) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        q();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return k(a);
        }
        if (this.o.isEmpty()) {
            return null;
        }
        return this.o.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.n.size() + this.o.size();
    }

    public v52(int i) {
        this.m = i;
        this.n = Collections.emptyList();
        this.o = Collections.emptyMap();
        this.r = Collections.emptyMap();
    }
}
