package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class bp extends nh {
    public long o;
    public boolean p;
    public k4 q;

    public static /* synthetic */ void K(bp bpVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        bpVar.J(z);
    }

    public final void F(boolean z) {
        long G = this.o - G(z);
        this.o = G;
        if (G <= 0 && this.p) {
            shutdown();
        }
    }

    public final long G(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public final void H(dm dmVar) {
        k4 k4Var = this.q;
        if (k4Var == null) {
            k4Var = new k4();
            this.q = k4Var;
        }
        k4Var.addLast(dmVar);
    }

    public long I() {
        k4 k4Var = this.q;
        return (k4Var == null || k4Var.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void J(boolean z) {
        this.o += G(z);
        if (z) {
            return;
        }
        this.p = true;
    }

    public final boolean L() {
        return this.o >= G(true);
    }

    public final boolean M() {
        k4 k4Var = this.q;
        if (k4Var != null) {
            return k4Var.isEmpty();
        }
        return true;
    }

    public final boolean N() {
        dm dmVar;
        k4 k4Var = this.q;
        if (k4Var == null || (dmVar = (dm) k4Var.s()) == null) {
            return false;
        }
        dmVar.run();
        return true;
    }

    public abstract void shutdown();
}
