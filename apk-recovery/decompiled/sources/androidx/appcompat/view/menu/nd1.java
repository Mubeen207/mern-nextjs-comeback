package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class nd1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        int i = 0;
        de1 de1Var = null;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            int i2 = lr0.i(n);
            if (i2 == 1) {
                i = lr0.p(parcel, n);
            } else if (i2 != 2) {
                lr0.t(parcel, n);
            } else {
                de1Var = (de1) lr0.c(parcel, n, de1.CREATOR);
            }
        }
        lr0.h(parcel, u);
        return new ld1(i, de1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ld1[i];
    }
}
