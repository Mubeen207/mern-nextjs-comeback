package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ AppMeasurementDynamiteService.a m;
    public final /* synthetic */ AppMeasurementDynamiteService n;

    public a(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.a aVar) {
        this.n = appMeasurementDynamiteService;
        this.m = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.l.H().M(this.m);
    }
}
