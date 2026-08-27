package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class r01 {
    public final kh a;
    public final Object[] b;
    public final k01[] c;
    public int d;

    public r01(kh khVar, int i) {
        this.a = khVar;
        this.b = new Object[i];
        this.c = new k01[i];
    }

    public final void a(k01 k01Var, Object obj) {
        Object[] objArr = this.b;
        int i = this.d;
        objArr[i] = obj;
        k01[] k01VarArr = this.c;
        this.d = i + 1;
        c60.c(k01Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        k01VarArr[i] = k01Var;
    }

    public final void b(kh khVar) {
        int length = this.c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            k01 k01Var = this.c[length];
            c60.b(k01Var);
            k01Var.m(khVar, this.b[length]);
            if (i < 0) {
                return;
            }
            length = i;
        }
    }
}
