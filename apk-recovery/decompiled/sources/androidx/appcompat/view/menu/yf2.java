package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class yf2 extends nh1 implements cg2 {
    public yf2() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static cg2 j(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof cg2 ? (cg2) queryLocalInterface : new tf2(iBinder);
    }

    @Override // androidx.appcompat.view.menu.nh1
    public final boolean h(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            g20 d = d();
            parcel2.writeNoException();
            rk1.e(parcel2, d);
        } else if (i != 2) {
            return false;
        } else {
            int c = c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
        }
        return true;
    }
}
