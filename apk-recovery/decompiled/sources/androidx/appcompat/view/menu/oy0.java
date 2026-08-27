package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class oy0 extends zg implements ix {
    public final int p;

    public oy0(int i, xg xgVar) {
        super(xgVar);
        this.p = i;
    }

    @Override // androidx.appcompat.view.menu.ix
    public int e() {
        return this.p;
    }

    @Override // androidx.appcompat.view.menu.y7
    public String toString() {
        if (c() == null) {
            String e = go0.e(this);
            c60.d(e, "renderLambdaToString(this)");
            return e;
        }
        return super.toString();
    }
}
