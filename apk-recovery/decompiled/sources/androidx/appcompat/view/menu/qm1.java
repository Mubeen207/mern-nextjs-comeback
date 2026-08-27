package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class qm1 extends ak1 implements km1 {
    public qm1() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // androidx.appcompat.view.menu.ak1
    public final boolean h(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            yj1.f(parcel);
            f((Bundle) yj1.a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
