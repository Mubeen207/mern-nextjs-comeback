package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.pn1;
/* loaded from: classes.dex */
public final class mp1 extends pn1.a {
    public final /* synthetic */ String r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ pn1 v;
    public final /* synthetic */ int q = 5;
    public final /* synthetic */ Object t = null;
    public final /* synthetic */ Object u = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp1(pn1 pn1Var, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.v = pn1Var;
        this.r = str;
        this.s = obj;
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void a() {
        im1 im1Var;
        im1Var = this.v.i;
        ((im1) pj0.i(im1Var)).logHealthData(this.q, this.r, yf0.k(this.s), yf0.k(null), yf0.k(null));
    }
}
