package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public class fl0 implements a51 {
    public boolean a = false;
    public boolean b = false;
    public nr c;
    public final cl0 d;

    public fl0(cl0 cl0Var) {
        this.d = cl0Var;
    }

    public final void a() {
        if (this.a) {
            throw new no("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
    }

    public void b(nr nrVar, boolean z) {
        this.a = false;
        this.c = nrVar;
        this.b = z;
    }

    @Override // androidx.appcompat.view.menu.a51
    public a51 c(String str) {
        a();
        this.d.g(this.c, str, this.b);
        return this;
    }

    @Override // androidx.appcompat.view.menu.a51
    public a51 d(boolean z) {
        a();
        this.d.l(this.c, z, this.b);
        return this;
    }
}
