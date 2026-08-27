package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import android.os.Parcel;
import androidx.appcompat.view.menu.t02;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class vc1 extends mb1 implements yc1 {
    public vc1() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // androidx.appcompat.view.menu.mb1
    public final boolean u2(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case t02.c.c /* 3 */:
                ef efVar = (ef) gc1.a(parcel, ef.CREATOR);
                db1 db1Var = (db1) gc1.a(parcel, db1.CREATOR);
                break;
            case 4:
                Status status = (Status) gc1.a(parcel, Status.CREATOR);
                break;
            case t02.c.e /* 5 */:
            default:
                return false;
            case t02.c.f /* 6 */:
                Status status2 = (Status) gc1.a(parcel, Status.CREATOR);
                break;
            case t02.c.g /* 7 */:
                Status status3 = (Status) gc1.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) gc1.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                v((od1) gc1.a(parcel, od1.CREATOR));
                break;
            case 9:
                ed1 ed1Var = (ed1) gc1.a(parcel, ed1.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
