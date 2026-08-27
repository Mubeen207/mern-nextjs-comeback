package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public final class sn1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            switch (lr0.i(n)) {
                case 1:
                    j = lr0.q(parcel, n);
                    break;
                case 2:
                    j2 = lr0.q(parcel, n);
                    break;
                case t02.c.c /* 3 */:
                    z = lr0.j(parcel, n);
                    break;
                case 4:
                    str = lr0.d(parcel, n);
                    break;
                case t02.c.e /* 5 */:
                    str2 = lr0.d(parcel, n);
                    break;
                case t02.c.f /* 6 */:
                    str3 = lr0.d(parcel, n);
                    break;
                case t02.c.g /* 7 */:
                    bundle = lr0.a(parcel, n);
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    str4 = lr0.d(parcel, n);
                    break;
                default:
                    lr0.t(parcel, n);
                    break;
            }
        }
        lr0.h(parcel, u);
        return new mn1(j, j2, z, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new mn1[i];
    }
}
