package androidx.appcompat.view.menu;

import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public abstract class ei0 extends fv {
    public final LinkedHashSet b0 = new LinkedHashSet();

    public boolean f1(og0 og0Var) {
        return this.b0.add(og0Var);
    }

    public void g1() {
        this.b0.clear();
    }
}
