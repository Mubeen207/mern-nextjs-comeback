package androidx.appcompat.view.menu;

import android.os.Bundle;
import androidx.appcompat.view.menu.pn1;
/* loaded from: classes.dex */
public final class ao1 extends pn1.a {
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ Bundle s;
    public final /* synthetic */ pn1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao1(pn1 pn1Var, String str, String str2, Bundle bundle) {
        super(pn1Var);
        this.t = pn1Var;
        this.q = str;
        this.r = str2;
        this.s = bundle;
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void a() {
        im1 im1Var;
        im1Var = this.t.i;
        ((im1) pj0.i(im1Var)).clearConditionalUserProperty(this.q, this.r, this.s);
    }
}
