package androidx.appcompat.view.menu;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes.dex */
public final class g52 implements Runnable {
    public final /* synthetic */ km1 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ AppMeasurementDynamiteService p;

    public g52(AppMeasurementDynamiteService appMeasurementDynamiteService, km1 km1Var, String str, String str2) {
        this.p = appMeasurementDynamiteService;
        this.m = km1Var;
        this.n = str;
        this.o = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.p.l.J().H(this.m, this.n, this.o);
    }
}
