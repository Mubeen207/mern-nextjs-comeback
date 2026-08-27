package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class gj1 implements ej1 {
    public final sw1 a;
    public final String b;

    public gj1(sw1 sw1Var, String str) {
        this.a = sw1Var;
        this.b = str;
    }

    @Override // androidx.appcompat.view.menu.ej1
    public final sw1 a(tg1 tg1Var) {
        sw1 d = this.a.d();
        d.e(this.b, tg1Var);
        return d;
    }
}
