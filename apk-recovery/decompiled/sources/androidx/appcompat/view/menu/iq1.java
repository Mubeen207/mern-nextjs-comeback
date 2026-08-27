package androidx.appcompat.view.menu;

import android.app.Activity;
import androidx.appcompat.view.menu.pn1;
/* loaded from: classes.dex */
public final class iq1 extends pn1.a {
    public final /* synthetic */ Activity q;
    public final /* synthetic */ pn1.b r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq1(pn1.b bVar, Activity activity) {
        super(pn1.this);
        this.r = bVar;
        this.q = activity;
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void a() {
        im1 im1Var;
        im1Var = pn1.this.i;
        ((im1) pj0.i(im1Var)).onActivityStopped(yf0.k(this.q), this.n);
    }
}
