package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class h82 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        String str = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            int i2 = lr0.i(n);
            if (i2 == 1) {
                str = lr0.d(parcel, n);
            } else if (i2 == 2) {
                j = lr0.q(parcel, n);
            } else if (i2 != 3) {
                lr0.t(parcel, n);
            } else {
                i = lr0.p(parcel, n);
            }
        }
        lr0.h(parcel, u);
        return new b82(str, j, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new b82[i];
    }
}
