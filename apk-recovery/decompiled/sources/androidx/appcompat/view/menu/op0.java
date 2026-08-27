package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class op0 extends y7 {
    public op0(xg xgVar) {
        super(xgVar);
        if (xgVar != null && xgVar.b() != bo.m) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // androidx.appcompat.view.menu.xg
    public kh b() {
        return bo.m;
    }
}
