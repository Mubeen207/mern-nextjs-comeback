package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class jf2 extends ve1 implements rz {
    public jf2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // androidx.appcompat.view.menu.rz
    public final Account b() {
        Parcel h = h(2, j());
        Account account = (Account) rk1.a(h, Account.CREATOR);
        h.recycle();
        return account;
    }
}
