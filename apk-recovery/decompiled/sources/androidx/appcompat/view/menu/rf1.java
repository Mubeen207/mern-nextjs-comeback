package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class rf1 extends nh1 implements uf1 {
    public static uf1 j(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof uf1 ? (uf1) queryLocalInterface : new jf1(iBinder);
    }
}
