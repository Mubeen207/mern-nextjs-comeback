package androidx.appcompat.view.menu;

import java.io.Serializable;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class id extends yg0 implements Serializable {
    public final Comparator m;

    public id(Comparator comparator) {
        this.m = (Comparator) qj0.i(comparator);
    }

    @Override // androidx.appcompat.view.menu.yg0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.m.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof id) {
            return this.m.equals(((id) obj).m);
        }
        return false;
    }

    public int hashCode() {
        return this.m.hashCode();
    }

    public String toString() {
        return this.m.toString();
    }
}
