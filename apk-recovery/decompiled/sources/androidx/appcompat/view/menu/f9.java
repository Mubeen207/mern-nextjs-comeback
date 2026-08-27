package androidx.appcompat.view.menu;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class f9 extends yg0 implements Serializable {
    public final uw m;
    public final yg0 n;

    public f9(uw uwVar, yg0 yg0Var) {
        this.m = (uw) qj0.i(uwVar);
        this.n = (yg0) qj0.i(yg0Var);
    }

    @Override // androidx.appcompat.view.menu.yg0, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.n.compare(this.m.apply(obj), this.m.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f9) {
            f9 f9Var = (f9) obj;
            return this.m.equals(f9Var.m) && this.n.equals(f9Var.n);
        }
        return false;
    }

    public int hashCode() {
        return ag0.b(this.m, this.n);
    }

    public String toString() {
        String valueOf = String.valueOf(this.n);
        String valueOf2 = String.valueOf(this.m);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
