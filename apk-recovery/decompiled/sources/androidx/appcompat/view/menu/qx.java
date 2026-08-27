package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public class qx implements bx0 {
    public final ez0 a;

    public qx(ez0 ez0Var) {
        this.a = ez0Var;
    }

    @Override // androidx.appcompat.view.menu.bx0
    public boolean a(di0 di0Var) {
        if (di0Var.l() || di0Var.k() || di0Var.i()) {
            this.a.e(di0Var.d());
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.bx0
    public boolean b(Exception exc) {
        return false;
    }
}
