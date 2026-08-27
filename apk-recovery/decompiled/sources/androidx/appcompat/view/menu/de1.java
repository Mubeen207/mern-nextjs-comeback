package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
/* loaded from: classes.dex */
public final class de1 extends r {
    public static final Parcelable.Creator<de1> CREATOR = new ee1();
    public final int m;
    public final Account n;
    public final int o;
    public final GoogleSignInAccount p;

    public de1(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.m = i;
        this.n = account;
        this.o = i2;
        this.p = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.i(parcel, 1, this.m);
        mr0.m(parcel, 2, this.n, i, false);
        mr0.i(parcel, 3, this.o);
        mr0.m(parcel, 4, this.p, i, false);
        mr0.b(parcel, a);
    }

    public de1(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
