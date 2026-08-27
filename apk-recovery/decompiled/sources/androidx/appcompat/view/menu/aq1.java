package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.pn1;
/* loaded from: classes.dex */
public final class aq1 extends pn1.a {
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ pn1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq1(pn1 pn1Var, String str, String str2, Object obj, boolean z) {
        super(pn1Var);
        this.u = pn1Var;
        this.q = str;
        this.r = str2;
        this.s = obj;
        this.t = z;
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void a() {
        im1 im1Var;
        im1Var = this.u.i;
        ((im1) pj0.i(im1Var)).setUserProperty(this.q, this.r, yf0.k(this.s), this.t, this.m);
    }
}
