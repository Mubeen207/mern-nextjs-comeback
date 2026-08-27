package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class hd1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            int i = lr0.i(n);
            if (i == 1) {
                arrayList = lr0.e(parcel, n);
            } else if (i != 2) {
                lr0.t(parcel, n);
            } else {
                str = lr0.d(parcel, n);
            }
        }
        lr0.h(parcel, u);
        return new ed1(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ed1[i];
    }
}
