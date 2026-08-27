package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class vj0 extends ug0 {
    public final Object m;

    public vj0(Object obj) {
        this.m = obj;
    }

    @Override // androidx.appcompat.view.menu.ug0
    public Object b() {
        return this.m;
    }

    @Override // androidx.appcompat.view.menu.ug0
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof vj0) {
            return this.m.equals(((vj0) obj).m);
        }
        return false;
    }

    public int hashCode() {
        return this.m.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.m);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
