package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
/* loaded from: classes.dex */
public final class ee1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        int i = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            int i3 = lr0.i(n);
            if (i3 == 1) {
                i = lr0.p(parcel, n);
            } else if (i3 == 2) {
                account = (Account) lr0.c(parcel, n, Account.CREATOR);
            } else if (i3 == 3) {
                i2 = lr0.p(parcel, n);
            } else if (i3 != 4) {
                lr0.t(parcel, n);
            } else {
                googleSignInAccount = (GoogleSignInAccount) lr0.c(parcel, n, GoogleSignInAccount.CREATOR);
            }
        }
        lr0.h(parcel, u);
        return new de1(i, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new de1[i];
    }
}
