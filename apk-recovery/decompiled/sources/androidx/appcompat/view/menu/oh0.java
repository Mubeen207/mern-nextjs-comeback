package androidx.appcompat.view.menu;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class oh0 implements Serializable {
    public final Object m;
    public final Object n;

    public oh0(Object obj, Object obj2) {
        this.m = obj;
        this.n = obj2;
    }

    public final Object a() {
        return this.m;
    }

    public final Object b() {
        return this.n;
    }

    public final Object c() {
        return this.m;
    }

    public final Object d() {
        return this.n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oh0) {
            oh0 oh0Var = (oh0) obj;
            return c60.a(this.m, oh0Var.m) && c60.a(this.n, oh0Var.n);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.m;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.n;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.m + ", " + this.n + ')';
    }
}
