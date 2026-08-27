package androidx.appcompat.view.menu;

import java.util.List;
/* loaded from: classes.dex */
public final class ba1 {
    public final List a;

    public ba1(List list) {
        c60.e(list, "displayFeatures");
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !c60.a(ba1.class, obj.getClass())) {
            return false;
        }
        return c60.a(this.a, ((ba1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String r;
        r = ad.r(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
        return r;
    }
}
