package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public final class ud1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        int i5 = -1;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            switch (lr0.i(n)) {
                case 1:
                    i = lr0.p(parcel, n);
                    break;
                case 2:
                    i2 = lr0.p(parcel, n);
                    break;
                case t02.c.c /* 3 */:
                    i3 = lr0.p(parcel, n);
                    break;
                case 4:
                    j = lr0.q(parcel, n);
                    break;
                case t02.c.e /* 5 */:
                    j2 = lr0.q(parcel, n);
                    break;
                case t02.c.f /* 6 */:
                    str = lr0.d(parcel, n);
                    break;
                case t02.c.g /* 7 */:
                    str2 = lr0.d(parcel, n);
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    i4 = lr0.p(parcel, n);
                    break;
                case 9:
                    i5 = lr0.p(parcel, n);
                    break;
                default:
                    lr0.t(parcel, n);
                    break;
            }
        }
        lr0.h(parcel, u);
        return new qd0(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new qd0[i];
    }
}
