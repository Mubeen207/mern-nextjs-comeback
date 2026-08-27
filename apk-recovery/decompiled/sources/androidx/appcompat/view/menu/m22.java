package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class m22 implements Runnable {
    public final /* synthetic */ Boolean m;
    public final /* synthetic */ g02 n;

    public m22(g02 g02Var, Boolean bool) {
        this.n = g02Var;
        this.m = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.S(this.m, true);
    }
}
