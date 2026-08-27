package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public final class xp0 {
    public static xp0 b;
    public static final yp0 c = new yp0(0, false, false, 0, 0);
    public yp0 a;

    public static synchronized xp0 b() {
        xp0 xp0Var;
        synchronized (xp0.class) {
            try {
                if (b == null) {
                    b = new xp0();
                }
                xp0Var = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xp0Var;
    }

    public yp0 a() {
        return this.a;
    }

    public final synchronized void c(yp0 yp0Var) {
        if (yp0Var == null) {
            this.a = c;
            return;
        }
        yp0 yp0Var2 = this.a;
        if (yp0Var2 == null || yp0Var2.n() < yp0Var.n()) {
            this.a = yp0Var;
        }
    }
}
