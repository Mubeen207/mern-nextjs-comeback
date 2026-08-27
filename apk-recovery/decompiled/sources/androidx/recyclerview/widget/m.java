package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class m extends RecyclerView.l {
    public boolean g = true;

    public final void A(RecyclerView.c0 c0Var) {
        I(c0Var);
        h(c0Var);
    }

    public final void B(RecyclerView.c0 c0Var) {
        J(c0Var);
    }

    public final void C(RecyclerView.c0 c0Var, boolean z) {
        K(c0Var, z);
        h(c0Var);
    }

    public final void D(RecyclerView.c0 c0Var, boolean z) {
        L(c0Var, z);
    }

    public final void E(RecyclerView.c0 c0Var) {
        M(c0Var);
        h(c0Var);
    }

    public final void F(RecyclerView.c0 c0Var) {
        N(c0Var);
    }

    public final void G(RecyclerView.c0 c0Var) {
        O(c0Var);
        h(c0Var);
    }

    public final void H(RecyclerView.c0 c0Var) {
        P(c0Var);
    }

    public void I(RecyclerView.c0 c0Var) {
    }

    public void J(RecyclerView.c0 c0Var) {
    }

    public void K(RecyclerView.c0 c0Var, boolean z) {
    }

    public void L(RecyclerView.c0 c0Var, boolean z) {
    }

    public void M(RecyclerView.c0 c0Var) {
    }

    public void N(RecyclerView.c0 c0Var) {
    }

    public void O(RecyclerView.c0 c0Var) {
    }

    public void P(RecyclerView.c0 c0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.c0 c0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i;
        int i2;
        return (bVar == null || ((i = bVar.a) == (i2 = bVar2.a) && bVar.b == bVar2.b)) ? w(c0Var) : y(c0Var, i, bVar.b, i2, bVar2.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i;
        int i2;
        int i3 = bVar.a;
        int i4 = bVar.b;
        if (c0Var2.J()) {
            int i5 = bVar.a;
            i2 = bVar.b;
            i = i5;
        } else {
            i = bVar2.a;
            i2 = bVar2.b;
        }
        return x(c0Var, c0Var2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(RecyclerView.c0 c0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i = bVar.a;
        int i2 = bVar.b;
        View view = c0Var.a;
        int left = bVar2 == null ? view.getLeft() : bVar2.a;
        int top = bVar2 == null ? view.getTop() : bVar2.b;
        if (c0Var.v() || (i == left && i2 == top)) {
            return z(c0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(c0Var, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d(RecyclerView.c0 c0Var, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i = bVar.a;
        int i2 = bVar2.a;
        if (i == i2 && bVar.b == bVar2.b) {
            E(c0Var);
            return false;
        }
        return y(c0Var, i, bVar.b, i2, bVar2.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f(RecyclerView.c0 c0Var) {
        return !this.g || c0Var.t();
    }

    public abstract boolean w(RecyclerView.c0 c0Var);

    public abstract boolean x(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i, int i2, int i3, int i4);

    public abstract boolean y(RecyclerView.c0 c0Var, int i, int i2, int i3, int i4);

    public abstract boolean z(RecyclerView.c0 c0Var);
}
