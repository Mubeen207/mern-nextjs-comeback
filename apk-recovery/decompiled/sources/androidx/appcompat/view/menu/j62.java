package androidx.appcompat.view.menu;

import java.util.Map;
/* loaded from: classes.dex */
public final class j62 implements Comparable, Map.Entry {
    public final Comparable m;
    public Object n;
    public final /* synthetic */ v52 o;

    public j62(v52 v52Var, Map.Entry entry) {
        this(v52Var, (Comparable) entry.getKey(), entry.getValue());
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((j62) obj).getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return c(this.m, entry.getKey()) && c(this.n, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.m;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.n;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.m;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.n;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.o.q();
        Object obj2 = this.n;
        this.n = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.m);
        String valueOf2 = String.valueOf(this.n);
        return valueOf + "=" + valueOf2;
    }

    public j62(v52 v52Var, Comparable comparable, Object obj) {
        this.o = v52Var;
        this.m = comparable;
        this.n = obj;
    }
}
