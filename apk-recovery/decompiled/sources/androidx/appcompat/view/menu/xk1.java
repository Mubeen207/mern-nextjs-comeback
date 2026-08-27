package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class xk1 extends ak1 implements ck1 {
    public static ck1 j(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof ck1 ? (ck1) queryLocalInterface : new vk1(iBinder);
    }
}
