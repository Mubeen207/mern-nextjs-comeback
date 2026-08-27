package androidx.appcompat.view.menu;

import java.util.List;
/* loaded from: classes.dex */
public final class ew1 implements kf2 {
    public final /* synthetic */ uv1 a;

    public ew1(uv1 uv1Var) {
        this.a = uv1Var;
    }

    @Override // androidx.appcompat.view.menu.kf2
    public final void a(te2 te2Var, String str, List list, boolean z, boolean z2) {
        int i = iw1.a[te2Var.ordinal()];
        vt1 J = i != 1 ? i != 2 ? i != 3 ? i != 4 ? this.a.l().J() : this.a.l().K() : z ? this.a.l().N() : !z2 ? this.a.l().M() : this.a.l().L() : z ? this.a.l().I() : !z2 ? this.a.l().H() : this.a.l().G() : this.a.l().F();
        int size = list.size();
        if (size == 1) {
            J.b(str, list.get(0));
        } else if (size == 2) {
            J.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            J.a(str);
        } else {
            J.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
