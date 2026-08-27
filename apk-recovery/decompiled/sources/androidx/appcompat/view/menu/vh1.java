package androidx.appcompat.view.menu;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class vh1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            if (lr0.i(n) != 1) {
                lr0.t(parcel, n);
            } else {
                intent = (Intent) lr0.c(parcel, n, Intent.CREATOR);
            }
        }
        lr0.h(parcel, u);
        return new jc(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new jc[i];
    }
}
