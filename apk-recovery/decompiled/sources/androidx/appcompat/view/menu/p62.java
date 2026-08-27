package androidx.appcompat.view.menu;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class p62 implements Iterator {
    public int m;
    public boolean n;
    public Iterator o;
    public final /* synthetic */ v52 p;

    public final Iterator b() {
        Map map;
        if (this.o == null) {
            map = this.p.o;
            this.o = map.entrySet().iterator();
        }
        return this.o;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.m + 1;
        list = this.p.n;
        if (i >= list.size()) {
            map = this.p.o;
            if (map.isEmpty() || !b().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.n = true;
        int i = this.m + 1;
        this.m = i;
        list = this.p.n;
        if (i < list.size()) {
            list2 = this.p.n;
            return (Map.Entry) list2.get(this.m);
        }
        return (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.n) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.n = false;
        this.p.q();
        int i = this.m;
        list = this.p.n;
        if (i >= list.size()) {
            b().remove();
            return;
        }
        v52 v52Var = this.p;
        int i2 = this.m;
        this.m = i2 - 1;
        v52Var.k(i2);
    }

    public p62(v52 v52Var) {
        this.p = v52Var;
        this.m = -1;
    }
}
