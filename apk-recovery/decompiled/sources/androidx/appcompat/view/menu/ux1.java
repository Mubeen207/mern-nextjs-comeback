package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class ux1 implements Runnable {
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ long p;
    public final /* synthetic */ nx1 q;

    public ux1(nx1 nx1Var, String str, String str2, String str3, long j) {
        this.q = nx1Var;
        this.m = str;
        this.n = str2;
        this.o = str3;
        this.p = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r82 r82Var;
        r82 r82Var2;
        String str = this.m;
        if (str == null) {
            r82Var2 = this.q.l;
            r82Var2.D(this.n, null);
            return;
        }
        w32 w32Var = new w32(this.o, str, this.p);
        r82Var = this.q.l;
        r82Var.D(this.n, w32Var);
    }
}
