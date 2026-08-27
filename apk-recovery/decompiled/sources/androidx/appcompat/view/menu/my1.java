package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class my1 implements Runnable {
    public final /* synthetic */ ri1 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ nx1 o;

    public my1(nx1 nx1Var, ri1 ri1Var, String str) {
        this.o = nx1Var;
        this.m = ri1Var;
        this.n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r82 r82Var;
        r82 r82Var2;
        r82Var = this.o.l;
        r82Var.o0();
        r82Var2 = this.o.l;
        r82Var2.r(this.m, this.n);
    }
}
