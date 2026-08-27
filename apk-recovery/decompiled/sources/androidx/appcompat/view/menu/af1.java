package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class af1 extends nh1 implements k10 {
    public af1() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // androidx.appcompat.view.menu.nh1
    public final boolean h(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            rk1.b(parcel);
            t2(parcel.readInt(), parcel.readStrongBinder(), (Bundle) rk1.a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            rk1.b(parcel);
            o1(parcel.readInt(), (Bundle) rk1.a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            rk1.b(parcel);
            j0(parcel.readInt(), parcel.readStrongBinder(), (a12) rk1.a(parcel, a12.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
