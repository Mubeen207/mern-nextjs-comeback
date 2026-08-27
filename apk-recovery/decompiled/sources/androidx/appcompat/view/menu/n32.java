package androidx.appcompat.view.menu;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class n32 extends LinkedHashMap {
    public static final n32 n;
    public boolean m;

    static {
        n32 n32Var = new n32();
        n = n32Var;
        n32Var.m = false;
    }

    public n32() {
        this.m = true;
    }

    public static int a(Object obj) {
        if (obj instanceof byte[]) {
            return y02.d((byte[]) obj);
        }
        if (obj instanceof k12) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static n32 b() {
        return n;
    }

    public final void c(n32 n32Var) {
        g();
        if (n32Var.isEmpty()) {
            return;
        }
        putAll(n32Var);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        super.clear();
    }

    public final n32 d() {
        return isEmpty() ? new n32() : new n32(this);
    }

    public final void e() {
        this.m = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() != map.size()) {
                    return false;
                }
                Iterator it = entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!map.containsKey(entry.getKey())) {
                        return false;
                    }
                    Object value = entry.getValue();
                    Object obj2 = map.get(entry.getKey());
                    if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                        equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                        continue;
                    } else {
                        equals = value.equals(obj2);
                        continue;
                    }
                    if (!equals) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.m;
    }

    public final void g() {
        if (!this.m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        g();
        y02.e(obj);
        y02.e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        g();
        for (Object obj : map.keySet()) {
            y02.e(obj);
            y02.e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        return super.remove(obj);
    }

    public n32(Map map) {
        super(map);
        this.m = true;
    }
}
