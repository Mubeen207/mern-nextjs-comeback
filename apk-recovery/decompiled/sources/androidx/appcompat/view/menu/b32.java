package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class b32 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        Bundle bundle = null;
        ff ffVar = null;
        int i = 0;
        mr[] mrVarArr = null;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            int i2 = lr0.i(n);
            if (i2 == 1) {
                bundle = lr0.a(parcel, n);
            } else if (i2 == 2) {
                mrVarArr = (mr[]) lr0.f(parcel, n, mr.CREATOR);
            } else if (i2 == 3) {
                i = lr0.p(parcel, n);
            } else if (i2 != 4) {
                lr0.t(parcel, n);
            } else {
                ffVar = (ff) lr0.c(parcel, n, ff.CREATOR);
            }
        }
        lr0.h(parcel, u);
        return new a12(bundle, mrVarArr, i, ffVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new a12[i];
    }
}
