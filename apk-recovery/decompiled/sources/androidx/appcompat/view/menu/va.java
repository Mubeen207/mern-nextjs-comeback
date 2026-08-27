package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class va extends ua {
    public final yw d;

    public va(yw ywVar, kh khVar, int i, u8 u8Var) {
        super(khVar, i, u8Var);
        this.d = ywVar;
    }

    public static /* synthetic */ Object j(va vaVar, jk0 jk0Var, xg xgVar) {
        Object c;
        Object h = vaVar.d.h(jk0Var, xgVar);
        c = f60.c();
        return h == c ? h : u31.a;
    }

    @Override // androidx.appcompat.view.menu.ua
    public Object e(jk0 jk0Var, xg xgVar) {
        return j(this, jk0Var, xgVar);
    }

    @Override // androidx.appcompat.view.menu.ua
    public String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}
