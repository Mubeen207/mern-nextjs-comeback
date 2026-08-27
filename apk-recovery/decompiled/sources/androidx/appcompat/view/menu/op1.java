package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.pn1;
/* loaded from: classes.dex */
public final class op1 extends pn1.a {
    public final /* synthetic */ String q;
    public final /* synthetic */ em1 r;
    public final /* synthetic */ pn1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op1(pn1 pn1Var, String str, em1 em1Var) {
        super(pn1Var);
        this.s = pn1Var;
        this.q = str;
        this.r = em1Var;
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void a() {
        im1 im1Var;
        im1Var = this.s.i;
        ((im1) pj0.i(im1Var)).getMaxUserProperties(this.q, this.r);
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void b() {
        this.r.f(null);
    }
}
