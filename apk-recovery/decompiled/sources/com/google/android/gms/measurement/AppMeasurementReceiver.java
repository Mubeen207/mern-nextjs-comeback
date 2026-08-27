package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.appcompat.view.menu.qv1;
import androidx.appcompat.view.menu.u71;
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends u71 implements qv1.a {
    public qv1 c;

    @Override // androidx.appcompat.view.menu.qv1.a
    public final void a(Context context, Intent intent) {
        u71.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new qv1(this);
        }
        this.c.a(context, intent);
    }
}
