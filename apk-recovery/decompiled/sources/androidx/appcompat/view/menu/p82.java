package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class p82 extends j82 {
    public boolean c;

    public p82(r82 r82Var) {
        super(r82Var);
        this.b.r0();
    }

    public final void u() {
        if (!w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void v() {
        if (this.c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        x();
        this.b.q0();
        this.c = true;
    }

    public final boolean w() {
        return this.c;
    }

    public abstract boolean x();
}
