package androidx.appcompat.view.menu;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class o4 extends qu0 implements Map {
    public za0 t;

    /* loaded from: classes.dex */
    public class a extends za0 {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.za0
        public void a() {
            o4.this.clear();
        }

        @Override // androidx.appcompat.view.menu.za0
        public Object b(int i, int i2) {
            return o4.this.n[(i << 1) + i2];
        }

        @Override // androidx.appcompat.view.menu.za0
        public Map c() {
            return o4.this;
        }

        @Override // androidx.appcompat.view.menu.za0
        public int d() {
            return o4.this.o;
        }

        @Override // androidx.appcompat.view.menu.za0
        public int e(Object obj) {
            return o4.this.f(obj);
        }

        @Override // androidx.appcompat.view.menu.za0
        public int f(Object obj) {
            return o4.this.h(obj);
        }

        @Override // androidx.appcompat.view.menu.za0
        public void g(Object obj, Object obj2) {
            o4.this.put(obj, obj2);
        }

        @Override // androidx.appcompat.view.menu.za0
        public void h(int i) {
            o4.this.k(i);
        }

        @Override // androidx.appcompat.view.menu.za0
        public Object i(int i, Object obj) {
            return o4.this.l(i, obj);
        }
    }

    public o4() {
    }

    @Override // java.util.Map
    public Set entrySet() {
        return n().l();
    }

    @Override // java.util.Map
    public Set keySet() {
        return n().m();
    }

    public final za0 n() {
        if (this.t == null) {
            this.t = new a();
        }
        return this.t;
    }

    public boolean o(Collection collection) {
        return za0.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        c(this.o + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        return n().n();
    }

    public o4(int i) {
        super(i);
    }

    public o4(qu0 qu0Var) {
        super(qu0Var);
    }
}
