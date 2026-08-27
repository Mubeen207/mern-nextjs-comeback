package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class lk1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            int i2 = lr0.i(n);
            if (i2 == 1) {
                str = lr0.d(parcel, n);
            } else if (i2 == 2) {
                i = lr0.p(parcel, n);
            } else if (i2 != 3) {
                lr0.t(parcel, n);
            } else {
                j = lr0.q(parcel, n);
            }
        }
        lr0.h(parcel, u);
        return new mr(str, i, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new mr[i];
    }
}
