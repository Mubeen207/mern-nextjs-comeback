package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class bp1 extends di1 implements gr1 {
    public static gr1 h(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof gr1 ? (gr1) queryLocalInterface : new zm1(iBinder);
    }
}
