package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class c70 extends pd implements mm, y40 {
    public e70 p;

    @Override // androidx.appcompat.view.menu.mm
    public void a() {
        x().v0(this);
    }

    @Override // androidx.appcompat.view.menu.y40
    public boolean c() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.y40
    public cf0 f() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.ea0
    public String toString() {
        return hj.a(this) + '@' + hj.b(this) + "[job@" + hj.b(x()) + ']';
    }

    public final e70 x() {
        e70 e70Var = this.p;
        if (e70Var != null) {
            return e70Var;
        }
        c60.n("job");
        return null;
    }

    public final void y(e70 e70Var) {
        this.p = e70Var;
    }
}
