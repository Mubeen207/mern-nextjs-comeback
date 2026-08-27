package androidx.appcompat.view.menu;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes.dex */
public final class d32 implements Runnable {
    public final /* synthetic */ km1 m;
    public final /* synthetic */ ri1 n;
    public final /* synthetic */ String o;
    public final /* synthetic */ AppMeasurementDynamiteService p;

    public d32(AppMeasurementDynamiteService appMeasurementDynamiteService, km1 km1Var, ri1 ri1Var, String str) {
        this.p = appMeasurementDynamiteService;
        this.m = km1Var;
        this.n = ri1Var;
        this.o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.l.J().G(this.m, this.n, this.o);
    }
}
