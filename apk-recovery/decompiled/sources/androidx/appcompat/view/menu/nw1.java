package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class nw1 {
    public final boolean a;

    public nw1(zw1 zw1Var) {
        qj0.j(zw1Var, "BuildInfo must be non-null");
        this.a = !zw1Var.a();
    }

    public final boolean a(String str) {
        qj0.j(str, "flagName must not be null");
        if (this.a) {
            return ((s40) yw1.a.get()).b(str);
        }
        return true;
    }
}
