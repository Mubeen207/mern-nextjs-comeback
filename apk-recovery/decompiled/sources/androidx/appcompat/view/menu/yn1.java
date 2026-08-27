package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.pn1;
/* loaded from: classes.dex */
public final class yn1 extends pn1.a {
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ em1 s;
    public final /* synthetic */ pn1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn1(pn1 pn1Var, String str, String str2, em1 em1Var) {
        super(pn1Var);
        this.t = pn1Var;
        this.q = str;
        this.r = str2;
        this.s = em1Var;
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void a() {
        im1 im1Var;
        im1Var = this.t.i;
        ((im1) pj0.i(im1Var)).getConditionalUserProperties(this.q, this.r, this.s);
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void b() {
        this.s.f(null);
    }
}
