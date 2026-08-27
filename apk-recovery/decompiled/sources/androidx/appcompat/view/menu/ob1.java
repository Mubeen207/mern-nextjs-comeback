package androidx.appcompat.view.menu;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class ob1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            int i3 = lr0.i(n);
            if (i3 == 1) {
                i = lr0.p(parcel, n);
            } else if (i3 == 2) {
                i2 = lr0.p(parcel, n);
            } else if (i3 != 3) {
                lr0.t(parcel, n);
            } else {
                intent = (Intent) lr0.c(parcel, n, Intent.CREATOR);
            }
        }
        lr0.h(parcel, u);
        return new db1(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new db1[i];
    }
}
