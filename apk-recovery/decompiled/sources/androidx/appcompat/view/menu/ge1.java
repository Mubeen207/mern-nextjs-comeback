package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class ge1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        IBinder iBinder = null;
        ef efVar = null;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            int i2 = lr0.i(n);
            if (i2 == 1) {
                i = lr0.p(parcel, n);
            } else if (i2 == 2) {
                iBinder = lr0.o(parcel, n);
            } else if (i2 == 3) {
                efVar = (ef) lr0.c(parcel, n, ef.CREATOR);
            } else if (i2 == 4) {
                z = lr0.j(parcel, n);
            } else if (i2 != 5) {
                lr0.t(parcel, n);
            } else {
                z2 = lr0.j(parcel, n);
            }
        }
        lr0.h(parcel, u);
        return new fe1(i, iBinder, efVar, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new fe1[i];
    }
}
