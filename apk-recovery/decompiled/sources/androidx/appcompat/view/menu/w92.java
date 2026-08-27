package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public final class w92 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        int i = 0;
        String str = null;
        Long l = null;
        Float f = null;
        String str2 = null;
        String str3 = null;
        Double d = null;
        long j = 0;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            switch (lr0.i(n)) {
                case 1:
                    i = lr0.p(parcel, n);
                    break;
                case 2:
                    str = lr0.d(parcel, n);
                    break;
                case t02.c.c /* 3 */:
                    j = lr0.q(parcel, n);
                    break;
                case 4:
                    l = lr0.r(parcel, n);
                    break;
                case t02.c.e /* 5 */:
                    f = lr0.m(parcel, n);
                    break;
                case t02.c.f /* 6 */:
                    str2 = lr0.d(parcel, n);
                    break;
                case t02.c.g /* 7 */:
                    str3 = lr0.d(parcel, n);
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    d = lr0.l(parcel, n);
                    break;
                default:
                    lr0.t(parcel, n);
                    break;
            }
        }
        lr0.h(parcel, u);
        return new y92(i, str, j, l, f, str2, str3, d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new y92[i];
    }
}
