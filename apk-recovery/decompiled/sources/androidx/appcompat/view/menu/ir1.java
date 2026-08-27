package androidx.appcompat.view.menu;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class ir1 {
    public final ii1 a;
    public final sw1 b;
    public final sw1 c;
    public final f52 d;

    public ir1() {
        ii1 ii1Var = new ii1();
        this.a = ii1Var;
        sw1 sw1Var = new sw1(null, ii1Var);
        this.c = sw1Var;
        this.b = sw1Var.d();
        f52 f52Var = new f52();
        this.d = f52Var;
        sw1Var.h("require", new dg2(f52Var));
        f52Var.b("internal.platform", new Callable() { // from class: androidx.appcompat.view.menu.dp1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zf2();
            }
        });
        sw1Var.h("runtime.counter", new bg1(Double.valueOf(0.0d)));
    }

    public final tg1 a(sw1 sw1Var, nt1... nt1VarArr) {
        tg1 tg1Var = tg1.e;
        for (nt1 nt1Var : nt1VarArr) {
            tg1Var = b12.a(nt1Var);
            lu1.b(this.c);
            if ((tg1Var instanceof zg1) || (tg1Var instanceof vg1)) {
                tg1Var = this.a.a(sw1Var, tg1Var);
            }
        }
        return tg1Var;
    }

    public final void b(String str, Callable callable) {
        this.d.b(str, callable);
    }
}
