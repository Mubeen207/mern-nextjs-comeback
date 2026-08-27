package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.appcompat.view.menu.z7;
/* loaded from: classes.dex */
public final class tt1 extends z7 {
    public tt1(Context context, Looper looper, z7.a aVar, z7.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // androidx.appcompat.view.menu.z7
    public final String E() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // androidx.appcompat.view.menu.z7
    public final String F() {
        return "com.google.android.gms.measurement.START";
    }

    @Override // androidx.appcompat.view.menu.z7, androidx.appcompat.view.menu.m2.f
    public final int e() {
        return ky.a;
    }

    @Override // androidx.appcompat.view.menu.z7
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof at1 ? (at1) queryLocalInterface : new et1(iBinder);
    }
}
