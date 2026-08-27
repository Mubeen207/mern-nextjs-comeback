package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class gz1 extends iz1 {
    public boolean b;

    public gz1(fx1 fx1Var) {
        super(fx1Var);
        this.a.n();
    }

    public final void o() {
        if (!r()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void p() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (s()) {
            return;
        }
        this.a.R();
        this.b = true;
    }

    public final void q() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        t();
        this.a.R();
        this.b = true;
    }

    public final boolean r() {
        return this.b;
    }

    public abstract boolean s();

    public void t() {
    }
}
