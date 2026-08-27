package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class fp1 extends kr1 {
    public boolean b;

    public fp1(fx1 fx1Var) {
        super(fx1Var);
        this.a.n();
    }

    public abstract boolean A();

    public final void v() {
        if (!z()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void w() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (A()) {
            return;
        }
        this.a.R();
        this.b = true;
    }

    public final void x() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        y();
        this.a.R();
        this.b = true;
    }

    public void y() {
    }

    public final boolean z() {
        return this.b;
    }
}
