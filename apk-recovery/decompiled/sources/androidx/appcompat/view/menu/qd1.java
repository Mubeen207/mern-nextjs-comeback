package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class qd1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        int i = 0;
        ef efVar = null;
        fe1 fe1Var = null;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            int i2 = lr0.i(n);
            if (i2 == 1) {
                i = lr0.p(parcel, n);
            } else if (i2 == 2) {
                efVar = (ef) lr0.c(parcel, n, ef.CREATOR);
            } else if (i2 != 3) {
                lr0.t(parcel, n);
            } else {
                fe1Var = (fe1) lr0.c(parcel, n, fe1.CREATOR);
            }
        }
        lr0.h(parcel, u);
        return new od1(i, efVar, fe1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new od1[i];
    }
}
