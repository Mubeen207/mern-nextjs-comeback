package androidx.appcompat.view.menu;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes.dex */
public final class zy1 implements Runnable {
    public final /* synthetic */ km1 m;
    public final /* synthetic */ AppMeasurementDynamiteService n;

    public zy1(AppMeasurementDynamiteService appMeasurementDynamiteService, km1 km1Var) {
        this.n = appMeasurementDynamiteService;
        this.m = km1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.l.J().F(this.m);
    }
}
