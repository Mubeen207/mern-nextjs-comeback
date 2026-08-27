package androidx.appcompat.view.menu;

import android.os.Bundle;
import androidx.appcompat.view.menu.pn1;
/* loaded from: classes.dex */
public final class un1 extends pn1.a {
    public final /* synthetic */ Bundle q;
    public final /* synthetic */ pn1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un1(pn1 pn1Var, Bundle bundle) {
        super(pn1Var);
        this.r = pn1Var;
        this.q = bundle;
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void a() {
        im1 im1Var;
        im1Var = this.r.i;
        ((im1) pj0.i(im1Var)).setConditionalUserProperty(this.q, this.m);
    }
}
