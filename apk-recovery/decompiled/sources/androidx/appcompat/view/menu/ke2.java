package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class ke2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        boolean z = false;
        int i = 0;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            int i3 = lr0.i(n);
            if (i3 == 1) {
                z = lr0.j(parcel, n);
            } else if (i3 == 2) {
                str = lr0.d(parcel, n);
            } else if (i3 == 3) {
                i2 = lr0.p(parcel, n);
            } else if (i3 != 4) {
                lr0.t(parcel, n);
            } else {
                i = lr0.p(parcel, n);
            }
        }
        lr0.h(parcel, u);
        return new pd2(z, str, i2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new pd2[i];
    }
}
