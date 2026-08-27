package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.jr0;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class cr extends jr0 {
    public final HashMap q = new HashMap();

    public boolean contains(Object obj) {
        return this.q.containsKey(obj);
    }

    @Override // androidx.appcompat.view.menu.jr0
    public jr0.c f(Object obj) {
        return (jr0.c) this.q.get(obj);
    }

    @Override // androidx.appcompat.view.menu.jr0
    public Object k(Object obj, Object obj2) {
        jr0.c f = f(obj);
        if (f != null) {
            return f.n;
        }
        this.q.put(obj, i(obj, obj2));
        return null;
    }

    @Override // androidx.appcompat.view.menu.jr0
    public Object n(Object obj) {
        Object n = super.n(obj);
        this.q.remove(obj);
        return n;
    }

    public Map.Entry p(Object obj) {
        if (contains(obj)) {
            return ((jr0.c) this.q.get(obj)).p;
        }
        return null;
    }
}
