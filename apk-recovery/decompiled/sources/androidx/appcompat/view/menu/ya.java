package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ya extends xa {
    public /* synthetic */ ya(xs xsVar, kh khVar, int i, u8 u8Var, int i2, lj ljVar) {
        this(xsVar, (i2 & 2) != 0 ? bo.m : khVar, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? u8.SUSPEND : u8Var);
    }

    @Override // androidx.appcompat.view.menu.ua
    public ua f(kh khVar, int i, u8 u8Var) {
        return new ya(this.d, khVar, i, u8Var);
    }

    @Override // androidx.appcompat.view.menu.xa
    public Object m(ys ysVar, xg xgVar) {
        Object c;
        Object b = this.d.b(ysVar, xgVar);
        c = f60.c();
        return b == c ? b : u31.a;
    }

    public ya(xs xsVar, kh khVar, int i, u8 u8Var) {
        super(xsVar, khVar, i, u8Var);
    }
}
