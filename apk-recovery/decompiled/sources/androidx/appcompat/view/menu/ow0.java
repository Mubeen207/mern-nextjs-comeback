package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ow0 implements xg, wh {
    public final xg m;
    public final kh n;

    public ow0(xg xgVar, kh khVar) {
        this.m = xgVar;
        this.n = khVar;
    }

    @Override // androidx.appcompat.view.menu.xg
    public kh b() {
        return this.n;
    }

    @Override // androidx.appcompat.view.menu.wh
    public wh g() {
        xg xgVar = this.m;
        if (xgVar instanceof wh) {
            return (wh) xgVar;
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.xg
    public void n(Object obj) {
        this.m.n(obj);
    }
}
