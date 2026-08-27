package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class d extends ug0 {
    public static final d m = new d();

    public static ug0 e() {
        return m;
    }

    @Override // androidx.appcompat.view.menu.ug0
    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // androidx.appcompat.view.menu.ug0
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
