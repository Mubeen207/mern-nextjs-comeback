package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class hk1 implements Runnable {
    public final /* synthetic */ cz0 m;
    public final /* synthetic */ um1 n;

    public hk1(um1 um1Var, cz0 cz0Var) {
        this.n = um1Var;
        this.m = cz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qf2 qf2Var;
        qf2 qf2Var2;
        qf2 qf2Var3;
        yg ygVar;
        qf2 qf2Var4;
        qf2 qf2Var5;
        if (this.m.k()) {
            qf2Var5 = this.n.c;
            qf2Var5.q();
            return;
        }
        try {
            ygVar = this.n.b;
            Object a = ygVar.a(this.m);
            qf2Var4 = this.n.c;
            qf2Var4.p(a);
        } catch (fq0 e) {
            if (e.getCause() instanceof Exception) {
                qf2Var3 = this.n.c;
                qf2Var3.o((Exception) e.getCause());
                return;
            }
            qf2Var2 = this.n.c;
            qf2Var2.o(e);
        } catch (Exception e2) {
            qf2Var = this.n.c;
            qf2Var.o(e2);
        }
    }
}
