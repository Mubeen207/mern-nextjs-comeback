package androidx.appcompat.view.menu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
public final class mc2 extends BroadcastReceiver {
    public final fx1 a;

    public mc2(fx1 fx1Var) {
        this.a = fx1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.a.l().L().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.a.l().L().a("App receiver called with null action");
        } else if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.a.l().L().a("App receiver called with unknown action");
        } else {
            final fx1 fx1Var = this.a;
            if (vc2.a() && fx1Var.z().D(null, vi1.M0)) {
                fx1Var.l().K().a("App receiver notified triggers are available");
                fx1Var.h().D(new Runnable() { // from class: androidx.appcompat.view.menu.oe2
                    @Override // java.lang.Runnable
                    public final void run() {
                        fx1 fx1Var2 = fx1.this;
                        if (!fx1Var2.L().V0()) {
                            fx1Var2.l().L().a("registerTrigger called but app not eligible");
                            return;
                        }
                        final g02 H = fx1Var2.H();
                        H.getClass();
                        new Thread(new Runnable() { // from class: androidx.appcompat.view.menu.ue2
                            @Override // java.lang.Runnable
                            public final void run() {
                                g02.this.p0();
                            }
                        }).start();
                    }
                });
            }
        }
    }
}
