package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.nl;
/* loaded from: classes.dex */
public class zl extends nl {
    public int m;

    public zl(b81 b81Var) {
        super(b81Var);
        if (b81Var instanceof oz) {
            this.e = nl.a.HORIZONTAL_DIMENSION;
        } else {
            this.e = nl.a.VERTICAL_DIMENSION;
        }
    }

    @Override // androidx.appcompat.view.menu.nl
    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (jl jlVar : this.k) {
            jlVar.a(jlVar);
        }
    }
}
