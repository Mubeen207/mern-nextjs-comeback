package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class od {
    public final Object a;
    public final kw b;

    public od(Object obj, kw kwVar) {
        this.a = obj;
        this.b = kwVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof od) {
            od odVar = (od) obj;
            return c60.a(this.a, odVar.a) && c60.a(this.b, odVar.b);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.b + ')';
    }
}
