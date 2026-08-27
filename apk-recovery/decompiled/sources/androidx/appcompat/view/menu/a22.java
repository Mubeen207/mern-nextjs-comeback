package androidx.appcompat.view.menu;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class a22 implements Runnable {
    public final /* synthetic */ Bundle m;
    public final /* synthetic */ g02 n;

    public a22(g02 g02Var, Bundle bundle) {
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
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        pj0.e(string);
        pj0.e(string2);
        pj0.i(bundle.get("value"));
        if (!g02Var.a.p()) {
            g02Var.l().K().a("Conditional property not set since app measurement is disabled");
            return;
        }
        y92 y92Var = new y92(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            ri1 G = g02Var.j().G(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            g02Var.t().D(new lf1(bundle.getString("app_id"), string2, y92Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), g02Var.j().G(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), G, bundle.getLong("time_to_live"), g02Var.j().G(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
