package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.pn1;
/* loaded from: classes.dex */
public final class uo1 extends pn1.a {
    public final /* synthetic */ em1 q;
    public final /* synthetic */ pn1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo1(pn1 pn1Var, em1 em1Var) {
        super(pn1Var);
        this.r = pn1Var;
        this.q = em1Var;
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void a() {
        im1 im1Var;
        im1Var = this.r.i;
        ((im1) pj0.i(im1Var)).getCurrentScreenName(this.q);
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void b() {
        this.q.f(null);
    }
}
