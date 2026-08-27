package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class yb1 {
    public final r2 a;
    public final mr b;

    public /* synthetic */ yb1(r2 r2Var, mr mrVar, xb1 xb1Var) {
        this.a = r2Var;
        this.b = mrVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof yb1)) {
            yb1 yb1Var = (yb1) obj;
            if (zf0.a(this.a, yb1Var.a) && zf0.a(this.b, yb1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zf0.b(this.a, this.b);
    }

    public final String toString() {
        return zf0.c(this).a("key", this.a).a("feature", this.b).toString();
    }
}
