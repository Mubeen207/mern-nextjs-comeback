package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class y41 extends lw0 {
    public final Object b;
    public final String c;
    public final h51 d;
    public final oa0 e;

    public y41(Object obj, String str, h51 h51Var, oa0 oa0Var) {
        c60.e(obj, "value");
        c60.e(str, "tag");
        c60.e(h51Var, "verificationMode");
        c60.e(oa0Var, "logger");
        this.b = obj;
        this.c = str;
        this.d = h51Var;
        this.e = oa0Var;
    }

    @Override // androidx.appcompat.view.menu.lw0
    public Object a() {
        return this.b;
    }

    @Override // androidx.appcompat.view.menu.lw0
    public lw0 c(String str, kw kwVar) {
        c60.e(str, "message");
        c60.e(kwVar, "condition");
        return ((Boolean) kwVar.i(this.b)).booleanValue() ? this : new xq(this.b, this.c, str, this.e, this.d);
    }
}
