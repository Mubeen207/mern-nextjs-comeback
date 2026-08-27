package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class y50 extends w50 {
    public static final a q = new a(null);
    public static final y50 r = new y50(1, 0);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(lj ljVar) {
            this();
        }
    }

    public y50(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // androidx.appcompat.view.menu.w50
    public boolean equals(Object obj) {
        if (obj instanceof y50) {
            if (!isEmpty() || !((y50) obj).isEmpty()) {
                y50 y50Var = (y50) obj;
                if (d() != y50Var.d() || f() != y50Var.f()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.w50
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (d() * 31) + f();
    }

    public boolean i(int i) {
        return d() <= i && i <= f();
    }

    @Override // androidx.appcompat.view.menu.w50
    public boolean isEmpty() {
        return d() > f();
    }

    @Override // androidx.appcompat.view.menu.w50
    public String toString() {
        return d() + ".." + f();
    }
}
