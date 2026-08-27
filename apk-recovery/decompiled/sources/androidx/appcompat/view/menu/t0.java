package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import androidx.appcompat.view.menu.rz;
/* loaded from: classes.dex */
public abstract class t0 extends rz.a {
    public static Account j(rz rzVar) {
        Account account = null;
        if (rzVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = rzVar.b();
            } catch (RemoteException unused) {
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }
}
