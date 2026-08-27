package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.view.menu.pn1;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
/* loaded from: classes.dex */
public final class wn1 extends pn1.a {
    public final /* synthetic */ String q;
    public final /* synthetic */ String r;
    public final /* synthetic */ Context s;
    public final /* synthetic */ Bundle t;
    public final /* synthetic */ pn1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn1(pn1 pn1Var, String str, String str2, Context context, Bundle bundle) {
        super(pn1Var);
        this.u = pn1Var;
        this.q = str;
        this.r = str2;
        this.s = context;
        this.t = bundle;
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void a() {
        boolean B;
        String str;
        String str2;
        String str3;
        im1 im1Var;
        int b;
        im1 im1Var2;
        String str4;
        String unused;
        try {
            B = this.u.B(this.q, this.r);
            if (B) {
                String str5 = this.r;
                String str6 = this.q;
                str4 = this.u.a;
                str3 = str5;
                str2 = str6;
                str = str4;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            pj0.i(this.s);
            pn1 pn1Var = this.u;
            pn1Var.i = pn1Var.c(this.s, true);
            im1Var = this.u.i;
            if (im1Var == null) {
                unused = this.u.a;
                return;
            }
            int a = DynamiteModule.a(this.s, ModuleDescriptor.MODULE_ID);
            mn1 mn1Var = new mn1(82001L, Math.max(a, b), DynamiteModule.b(this.s, ModuleDescriptor.MODULE_ID) < a, str, str2, str3, this.t, ow1.a(this.s));
            im1Var2 = this.u.i;
            ((im1) pj0.i(im1Var2)).initialize(yf0.k(this.s), mn1Var, this.m);
        } catch (Exception e) {
            this.u.p(e, true, false);
        }
    }
}
