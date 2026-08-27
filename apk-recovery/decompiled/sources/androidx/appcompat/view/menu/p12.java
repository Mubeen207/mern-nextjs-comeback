package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class p12 implements Runnable {
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ long p;
    public final /* synthetic */ g02 q;

    public p12(g02 g02Var, String str, String str2, Object obj, long j) {
        this.q = g02Var;
        this.m = str;
        this.n = str2;
        this.o = obj;
        this.p = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.q.a0(this.m, this.n, this.o, this.p);
    }
}
