package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public final class wf1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        String str = null;
        String str2 = null;
        y92 y92Var = null;
        String str3 = null;
        ri1 ri1Var = null;
        ri1 ri1Var2 = null;
        ri1 ri1Var3 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            switch (lr0.i(n)) {
                case 2:
                    str = lr0.d(parcel, n);
                    break;
                case t02.c.c /* 3 */:
                    str2 = lr0.d(parcel, n);
                    break;
                case 4:
                    y92Var = (y92) lr0.c(parcel, n, y92.CREATOR);
                    break;
                case t02.c.e /* 5 */:
                    j = lr0.q(parcel, n);
                    break;
                case t02.c.f /* 6 */:
                    z = lr0.j(parcel, n);
                    break;
                case t02.c.g /* 7 */:
                    str3 = lr0.d(parcel, n);
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    ri1Var = (ri1) lr0.c(parcel, n, ri1.CREATOR);
                    break;
                case 9:
                    j2 = lr0.q(parcel, n);
                    break;
                case 10:
                    ri1Var2 = (ri1) lr0.c(parcel, n, ri1.CREATOR);
                    break;
                case 11:
                    j3 = lr0.q(parcel, n);
                    break;
                case 12:
                    ri1Var3 = (ri1) lr0.c(parcel, n, ri1.CREATOR);
                    break;
                default:
                    lr0.t(parcel, n);
                    break;
            }
        }
        lr0.h(parcel, u);
        return new lf1(str, str2, y92Var, j, z, str3, ri1Var, j2, ri1Var2, j3, ri1Var3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new lf1[i];
    }
}
