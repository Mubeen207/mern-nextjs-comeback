package androidx.appcompat.view.menu;

import java.util.Comparator;
/* loaded from: classes.dex */
public abstract class yg0 implements Comparator {
    public static yg0 a(Comparator comparator) {
        return comparator instanceof yg0 ? (yg0) comparator : new id(comparator);
    }

    public static yg0 c() {
        return se0.m;
    }

    public q40 b(Iterable iterable) {
        return q40.z(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public yg0 d() {
        return e(bb0.b());
    }

    public yg0 e(uw uwVar) {
        return new f9(uwVar, this);
    }
}
