package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public interface rz extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends nh1 implements rz {
        public static rz asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof rz ? (rz) queryLocalInterface : new jf2(iBinder);
        }
    }

    Account b();
}
