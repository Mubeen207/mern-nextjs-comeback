package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class tb1 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ wb1 n;

    public tb1(wb1 wb1Var, int i) {
        this.n = wb1Var;
        this.m = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.i(this.m);
    }
}
