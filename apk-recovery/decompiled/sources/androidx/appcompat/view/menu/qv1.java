package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
public final class qv1 {
    public final a a;

    /* loaded from: classes.dex */
    public interface a {
        void a(Context context, Intent intent);
    }

    public qv1(a aVar) {
        pj0.i(aVar);
        this.a = aVar;
    }

    public final void a(Context context, Intent intent) {
        st1 l = fx1.c(context, null, null).l();
        if (intent == null) {
            l.L().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        l.K().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                l.L().a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        l.K().a("Starting wakeful intent.");
        this.a.a(context, className);
    }
}
