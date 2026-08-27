package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class j12 implements mx {
    public final /* synthetic */ b82 a;
    public final /* synthetic */ g02 b;

    public j12(g02 g02Var, b82 b82Var) {
        this.b = g02Var;
        this.a = b82Var;
    }

    @Override // androidx.appcompat.view.menu.mx
    public final void a(Object obj) {
        this.b.n();
        this.b.i = false;
        this.b.r0();
        this.b.l().F().b("registerTriggerAsync ran. uri", this.a.m);
    }

    @Override // androidx.appcompat.view.menu.mx
    public final void b(Throwable th) {
        this.b.n();
        this.b.i = false;
        this.b.r0();
        this.b.l().G().b("registerTriggerAsync failed with throwable", th);
    }
}
