package androidx.appcompat.view.menu;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.view.menu.pn1;
/* loaded from: classes.dex */
public final class cq1 extends pn1.a {
    public final /* synthetic */ Bundle q;
    public final /* synthetic */ Activity r;
    public final /* synthetic */ pn1.b s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq1(pn1.b bVar, Bundle bundle, Activity activity) {
        super(pn1.this);
        this.s = bVar;
        this.q = bundle;
        this.r = activity;
    }

    @Override // androidx.appcompat.view.menu.pn1.a
    public final void a() {
        Bundle bundle;
        im1 im1Var;
        if (this.q != null) {
            bundle = new Bundle();
            if (this.q.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.q.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        im1Var = pn1.this.i;
        ((im1) pj0.i(im1Var)).onActivityCreated(yf0.k(this.r), bundle, this.n);
    }
}
