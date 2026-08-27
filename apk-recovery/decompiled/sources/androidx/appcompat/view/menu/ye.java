package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class ye {
    public static final py0 a = new py0("CLOSED");

    public static final ze b(ze zeVar) {
        while (true) {
            Object f = zeVar.f();
            if (f == a) {
                return zeVar;
            }
            ze zeVar2 = (ze) f;
            if (zeVar2 != null) {
                zeVar = zeVar2;
            } else if (zeVar.j()) {
                return zeVar;
            }
        }
    }

    public static final Object c(ms0 ms0Var, long j, yw ywVar) {
        while (true) {
            if (ms0Var.o >= j && !ms0Var.h()) {
                return ns0.a(ms0Var);
            }
            Object f = ms0Var.f();
            if (f == a) {
                return ns0.a(a);
            }
            ms0 ms0Var2 = (ms0) ((ze) f);
            if (ms0Var2 == null) {
                ms0Var2 = (ms0) ywVar.h(Long.valueOf(ms0Var.o + 1), ms0Var);
                if (ms0Var.l(ms0Var2)) {
                    if (ms0Var.h()) {
                        ms0Var.k();
                    }
                }
            }
            ms0Var = ms0Var2;
        }
    }
}
