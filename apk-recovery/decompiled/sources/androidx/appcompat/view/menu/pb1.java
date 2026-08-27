package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.t02;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class pb1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
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
                    str2 = lr0.d(parcel, n);
                    break;
                case 4:
                    str3 = lr0.d(parcel, n);
                    break;
                case t02.c.e /* 5 */:
                    str4 = lr0.d(parcel, n);
                    break;
                case t02.c.f /* 6 */:
                    uri = (Uri) lr0.c(parcel, n, Uri.CREATOR);
                    break;
                case t02.c.g /* 7 */:
                    str5 = lr0.d(parcel, n);
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    j = lr0.q(parcel, n);
                    break;
                case 9:
                    str6 = lr0.d(parcel, n);
                    break;
                case 10:
                    arrayList = lr0.g(parcel, n, Scope.CREATOR);
                    break;
                case 11:
                    str7 = lr0.d(parcel, n);
                    break;
                case 12:
                    str8 = lr0.d(parcel, n);
                    break;
                default:
                    lr0.t(parcel, n);
                    break;
            }
        }
        lr0.h(parcel, u);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
