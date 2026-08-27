package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
/* loaded from: classes.dex */
public final class ae1 extends vx {
    public final rz0 T;

    public ae1(Context context, Looper looper, ac acVar, rz0 rz0Var, df dfVar, kg0 kg0Var) {
        super(context, looper, 270, acVar, dfVar, kg0Var);
        this.T = rz0Var;
    }

    @Override // androidx.appcompat.view.menu.z7
    public final Bundle A() {
        return this.T.b();
    }

    @Override // androidx.appcompat.view.menu.z7
    public final String E() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // androidx.appcompat.view.menu.z7
    public final String F() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // androidx.appcompat.view.menu.z7
    public final boolean I() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.z7, androidx.appcompat.view.menu.m2.f
    public final int e() {
        return 203400000;
    }

    @Override // androidx.appcompat.view.menu.z7
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof kd1 ? (kd1) queryLocalInterface : new kd1(iBinder);
    }

    @Override // androidx.appcompat.view.menu.z7
    public final mr[] v() {
        return tc1.b;
    }
}
