package androidx.appcompat.view.menu;

import android.os.Bundle;
import androidx.appcompat.view.menu.pn1;
/* loaded from: classes.dex */
public final class xp1 extends pn1.a {
    public final /* synthetic */ Long q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ Bundle t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ pn1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp1(pn1 pn1Var, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(pn1Var);
        this.w = pn1Var;
        this.q = l;
        this.r = str;
        this.s = str2;
        this.t = bundle;
        this.u = z;
        this.v = z2;
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void a() {
        im1 im1Var;
        Long l = this.q;
        long longValue = l == null ? this.m : l.longValue();
        im1Var = this.w.i;
        ((im1) pj0.i(im1Var)).logEvent(this.r, this.s, this.t, this.u, this.v, longValue);
    }
}
