package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class pi1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        String str = null;
        hi1 hi1Var = null;
        String str2 = null;
        long j = 0;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            int i = lr0.i(n);
            if (i == 2) {
                str = lr0.d(parcel, n);
            } else if (i == 3) {
                hi1Var = (hi1) lr0.c(parcel, n, hi1.CREATOR);
            } else if (i == 4) {
                str2 = lr0.d(parcel, n);
            } else if (i != 5) {
                lr0.t(parcel, n);
            } else {
                j = lr0.q(parcel, n);
            }
        }
        lr0.h(parcel, u);
        return new ri1(str, hi1Var, str2, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ri1[i];
    }
}
