package androidx.appcompat.view.menu;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public final class xh1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        ef efVar = null;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            int i3 = lr0.i(n);
            if (i3 == 1) {
                i2 = lr0.p(parcel, n);
            } else if (i3 == 2) {
                str = lr0.d(parcel, n);
            } else if (i3 == 3) {
                pendingIntent = (PendingIntent) lr0.c(parcel, n, PendingIntent.CREATOR);
            } else if (i3 == 4) {
                efVar = (ef) lr0.c(parcel, n, ef.CREATOR);
            } else if (i3 != 1000) {
                lr0.t(parcel, n);
            } else {
                i = lr0.p(parcel, n);
            }
        }
        lr0.h(parcel, u);
        return new Status(i, i2, str, pendingIntent, efVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
