package androidx.appcompat.view.menu;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class kf1 {
    public static final t40 d = t40.w("_syn", "_err", "_el");
    public String a;
    public long b;
    public Map c;

    public kf1(String str, long j, Map map) {
        this.a = str;
        this.b = j;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static Object c(String str, Object obj, Object obj2) {
        return (d.contains(str) && (obj2 instanceof Double)) ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : str.startsWith("_") ? ((obj instanceof String) || obj == null) ? obj2 : obj : obj instanceof Double ? obj2 : obj instanceof Long ? Long.valueOf(Math.round(((Double) obj2).doubleValue())) : obj instanceof String ? obj2.toString() : obj2;
    }

    public final long a() {
        return this.b;
    }

    public final Object b(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() {
        return new kf1(this.a, this.b, new HashMap(this.c));
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.c.remove(str);
            return;
        }
        this.c.put(str, c(str, this.c.get(str), obj));
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kf1) {
            kf1 kf1Var = (kf1) obj;
            if (this.b == kf1Var.b && this.a.equals(kf1Var.a)) {
                return this.c.equals(kf1Var.c);
            }
            return false;
        }
        return false;
    }

    public final void f(String str) {
        this.a = str;
    }

    public final Map g() {
        return this.c;
    }

    public final int hashCode() {
        long j = this.b;
        return (((this.a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        String valueOf = String.valueOf(this.c);
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + valueOf + "}";
    }
}
