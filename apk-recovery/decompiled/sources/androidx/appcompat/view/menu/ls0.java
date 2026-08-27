package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public class ls0 extends g implements wh {
    public final xg p;

    public ls0(kh khVar, xg xgVar) {
        super(khVar, true, true);
        this.p = xgVar;
    }

    @Override // androidx.appcompat.view.menu.g
    public void H0(Object obj) {
        xg xgVar = this.p;
        xgVar.n(rd.a(obj, xgVar));
    }

    @Override // androidx.appcompat.view.menu.e70
    public void I(Object obj) {
        xg b;
        b = e60.b(this.p);
        cm.c(b, rd.a(obj, this.p), null, 2, null);
    }

    @Override // androidx.appcompat.view.menu.wh
    public final wh g() {
        xg xgVar = this.p;
        if (xgVar instanceof wh) {
            return (wh) xgVar;
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.e70
    public final boolean i0() {
        return true;
    }
}
