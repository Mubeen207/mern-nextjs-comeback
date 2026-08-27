package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.appcompat.view.menu.d72;
import androidx.appcompat.view.menu.u71;
import androidx.appcompat.view.menu.v62;
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements d72 {
    public v62 a;

    private final v62 c() {
        if (this.a == null) {
            this.a = new v62(this);
        }
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.d72
    public final void a(Intent intent) {
        u71.b(intent);
    }

    @Override // androidx.appcompat.view.menu.d72
    public final void b(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.appcompat.view.menu.d72
    public final boolean e(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return c().b(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c().h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c().i(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return c().a(intent, i, i2);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return c().k(intent);
    }
}
