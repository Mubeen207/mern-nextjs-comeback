package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public class px implements bx0 {
    public final w41 a;
    public final ez0 b;

    public px(w41 w41Var, ez0 ez0Var) {
        this.a = w41Var;
        this.b = ez0Var;
    }

    @Override // androidx.appcompat.view.menu.bx0
    public boolean a(di0 di0Var) {
        if (!di0Var.k() || this.a.f(di0Var)) {
            return false;
        }
        this.b.c(r50.a().b(di0Var.b()).d(di0Var.c()).c(di0Var.h()).a());
        return true;
    }

    @Override // androidx.appcompat.view.menu.bx0
    public boolean b(Exception exc) {
        this.b.d(exc);
        return true;
    }
}
