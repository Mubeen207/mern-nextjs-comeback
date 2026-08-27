package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class dg1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            int i4 = lr0.i(n);
            if (i4 == 1) {
                i = lr0.p(parcel, n);
            } else if (i4 == 2) {
                z = lr0.j(parcel, n);
            } else if (i4 == 3) {
                z2 = lr0.j(parcel, n);
            } else if (i4 == 4) {
                i2 = lr0.p(parcel, n);
            } else if (i4 != 5) {
                lr0.t(parcel, n);
            } else {
                i3 = lr0.p(parcel, n);
            }
        }
        lr0.h(parcel, u);
        return new yp0(i, z, z2, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new yp0[i];
    }
}
