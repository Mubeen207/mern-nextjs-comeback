package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class vk1 extends uj1 implements ck1 {
    public vk1(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // androidx.appcompat.view.menu.ck1
    public final Bundle f(Bundle bundle) {
        Parcel h = h();
        yj1.d(h, bundle);
        Parcel j = j(1, h);
        Bundle bundle2 = (Bundle) yj1.a(j, Bundle.CREATOR);
        j.recycle();
        return bundle2;
    }
}
