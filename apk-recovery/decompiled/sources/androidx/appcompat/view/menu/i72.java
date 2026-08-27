package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.content.pm.PackageParser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.t02;
import com.google.android.gms.common.api.Scope;
/* loaded from: classes.dex */
public final class i72 implements Parcelable.Creator {
    public static void a(rx rxVar, Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.i(parcel, 1, rxVar.m);
        mr0.i(parcel, 2, rxVar.n);
        mr0.i(parcel, 3, rxVar.o);
        mr0.n(parcel, 4, rxVar.p, false);
        mr0.h(parcel, 5, rxVar.q, false);
        mr0.p(parcel, 6, rxVar.r, i, false);
        mr0.e(parcel, 7, rxVar.s, false);
        mr0.m(parcel, 8, rxVar.t, i, false);
        mr0.p(parcel, 10, rxVar.u, i, false);
        mr0.p(parcel, 11, rxVar.v, i, false);
        mr0.c(parcel, 12, rxVar.w);
        mr0.i(parcel, 13, rxVar.x);
        mr0.c(parcel, 14, rxVar.y);
        mr0.n(parcel, 15, rxVar.d(), false);
        mr0.b(parcel, a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        Scope[] scopeArr = rx.A;
        Bundle bundle = new Bundle();
        mr[] mrVarArr = rx.B;
        mr[] mrVarArr2 = mrVarArr;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
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
                    str = lr0.d(parcel, n);
                    break;
                case t02.c.e /* 5 */:
                    iBinder = lr0.o(parcel, n);
                    break;
                case t02.c.f /* 6 */:
                    scopeArr = (Scope[]) lr0.f(parcel, n, Scope.CREATOR);
                    break;
                case t02.c.g /* 7 */:
                    bundle = lr0.a(parcel, n);
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    account = (Account) lr0.c(parcel, n, Account.CREATOR);
                    break;
                case 9:
                default:
                    lr0.t(parcel, n);
                    break;
                case 10:
                    mrVarArr = (mr[]) lr0.f(parcel, n, mr.CREATOR);
                    break;
                case 11:
                    mrVarArr2 = (mr[]) lr0.f(parcel, n, mr.CREATOR);
                    break;
                case 12:
                    z = lr0.j(parcel, n);
                    break;
                case 13:
                    i4 = lr0.p(parcel, n);
                    break;
                case 14:
                    z2 = lr0.j(parcel, n);
                    break;
                case 15:
                    str2 = lr0.d(parcel, n);
                    break;
            }
        }
        lr0.h(parcel, u);
        return new rx(i, i2, i3, str, iBinder, scopeArr, bundle, account, mrVarArr, mrVarArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new rx[i];
    }
}
