package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.pn1;
/* loaded from: classes.dex */
public final class yo1 extends pn1.a {
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ em1 t;
    public final /* synthetic */ pn1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo1(pn1 pn1Var, String str, String str2, boolean z, em1 em1Var) {
        super(pn1Var);
        this.u = pn1Var;
        this.q = str;
        this.r = str2;
        this.s = z;
        this.t = em1Var;
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void a() {
        im1 im1Var;
        im1Var = this.u.i;
        ((im1) pj0.i(im1Var)).getUserProperties(this.q, this.r, this.s, this.t);
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void b() {
        this.t.f(null);
    }
}
