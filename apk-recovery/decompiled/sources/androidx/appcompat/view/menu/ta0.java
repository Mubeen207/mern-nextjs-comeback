package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class ta0 extends nh {
    public abstract ta0 F();

    public final String G() {
        ta0 ta0Var;
        ta0 c = fm.c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            ta0Var = c.F();
        } catch (UnsupportedOperationException unused) {
            ta0Var = null;
        }
        if (this == ta0Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
