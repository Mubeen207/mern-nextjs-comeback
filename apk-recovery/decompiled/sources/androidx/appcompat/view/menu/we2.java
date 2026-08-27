package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class we2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            int i = lr0.i(n);
            if (i == 1) {
                str = lr0.d(parcel, n);
            } else if (i == 2) {
                iBinder = lr0.o(parcel, n);
            } else if (i == 3) {
                z = lr0.j(parcel, n);
            } else if (i != 4) {
                lr0.t(parcel, n);
            } else {
                z2 = lr0.j(parcel, n);
            }
        }
        lr0.h(parcel, u);
        return new re2(str, iBinder, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new re2[i];
    }
}
