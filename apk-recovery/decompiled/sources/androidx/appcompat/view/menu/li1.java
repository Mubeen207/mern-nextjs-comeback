package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class li1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            if (lr0.i(n) != 2) {
                lr0.t(parcel, n);
            } else {
                bundle = lr0.a(parcel, n);
            }
        }
        lr0.h(parcel, u);
        return new hi1(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new hi1[i];
    }
}
