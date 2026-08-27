package androidx.appcompat.view.menu;

import android.app.Activity;
import androidx.appcompat.view.menu.pn1;
/* loaded from: classes.dex */
public final class oq1 extends pn1.a {
    public final /* synthetic */ Activity q;
    public final /* synthetic */ em1 r;
    public final /* synthetic */ pn1.b s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq1(pn1.b bVar, Activity activity, em1 em1Var) {
        super(pn1.this);
        this.s = bVar;
        this.q = activity;
        this.r = em1Var;
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void a() {
        im1 im1Var;
        im1Var = pn1.this.i;
        ((im1) pj0.i(im1Var)).onActivitySaveInstanceState(yf0.k(this.q), this.r, this.n);
    }
}
