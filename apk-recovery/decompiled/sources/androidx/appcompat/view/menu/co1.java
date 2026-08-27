package androidx.appcompat.view.menu;

import android.app.Activity;
import androidx.appcompat.view.menu.pn1;
/* loaded from: classes.dex */
public final class co1 extends pn1.a {
    public final /* synthetic */ Activity q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ pn1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co1(pn1 pn1Var, Activity activity, String str, String str2) {
        super(pn1Var);
        this.t = pn1Var;
        this.q = activity;
        this.r = str;
        this.s = str2;
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void a() {
        im1 im1Var;
        im1Var = this.t.i;
        ((im1) pj0.i(im1Var)).setCurrentScreen(yf0.k(this.q), this.r, this.s, this.m);
    }
}
