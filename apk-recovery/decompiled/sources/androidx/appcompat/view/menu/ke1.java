package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ke1 implements Runnable {
    public final /* synthetic */ String m;
    public final /* synthetic */ long n;
    public final /* synthetic */ rh1 o;

    public ke1(rh1 rh1Var, String str, long j) {
        this.o = rh1Var;
        this.m = str;
        this.n = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rh1.y(this.o, this.m, this.n);
    }
}
