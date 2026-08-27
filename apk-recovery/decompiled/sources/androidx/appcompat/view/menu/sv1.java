package androidx.appcompat.view.menu;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class sv1 implements Runnable {
    public final /* synthetic */ ck1 m;
    public final /* synthetic */ ServiceConnection n;
    public final /* synthetic */ mv1 o;

    public sv1(mv1 mv1Var, ck1 ck1Var, ServiceConnection serviceConnection) {
        this.o = mv1Var;
        this.m = ck1Var;
        this.n = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        mv1 mv1Var = this.o;
        ov1 ov1Var = mv1Var.m;
        str = mv1Var.l;
        ck1 ck1Var = this.m;
        ServiceConnection serviceConnection = this.n;
        Bundle a = ov1Var.a(str, ck1Var);
        ov1Var.a.h().n();
        ov1Var.a.Q();
        if (a != null) {
            long j = a.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                ov1Var.a.l().L().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    ov1Var.a.l().G().a("No referrer defined in Install Referrer response");
                } else {
                    ov1Var.a.l().K().b("InstallReferrer API result", string);
                    aa2 L = ov1Var.a.L();
                    Bundle C = L.C(Uri.parse("?" + string), nd2.a() && ov1Var.a.z().s(vi1.F0), qb2.a() && ov1Var.a.z().s(vi1.a1));
                    if (C == null) {
                        ov1Var.a.l().G().a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = C.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                ov1Var.a.l().G().a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                C.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == ov1Var.a.F().f.a()) {
                            ov1Var.a.l().K().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (ov1Var.a.p()) {
                            ov1Var.a.F().f.b(j);
                            ov1Var.a.l().K().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            C.putString("_cis", "referrer API v2");
                            ov1Var.a.H().Y("auto", "_cmp", C, str);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            hf.b().c(ov1Var.a.a(), serviceConnection);
        }
    }
}
