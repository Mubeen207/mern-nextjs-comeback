package androidx.appcompat.view.menu;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class z12 implements Runnable {
    public final /* synthetic */ Bundle m;
    public final /* synthetic */ g02 n;

    public z12(g02 g02Var, Bundle bundle) {
        this.n = g02Var;
        this.m = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g02 g02Var = this.n;
        Bundle bundle = this.m;
        g02Var.n();
        g02Var.v();
        pj0.i(bundle);
        String e = pj0.e(bundle.getString("name"));
        if (!g02Var.a.p()) {
            g02Var.l().K().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            g02Var.t().D(new lf1(bundle.getString("app_id"), "", new y92(e, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), g02Var.j().G(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
