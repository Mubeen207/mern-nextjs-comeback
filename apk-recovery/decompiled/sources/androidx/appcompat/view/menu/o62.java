package androidx.appcompat.view.menu;

import android.content.ComponentName;
/* loaded from: classes.dex */
public final class o62 implements Runnable {
    public final /* synthetic */ g62 m;

    public o62(g62 g62Var) {
        this.m = g62Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k42.M(this.m.n, new ComponentName(this.m.n.a(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
