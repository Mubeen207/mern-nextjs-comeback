package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class om1 extends uj1 implements km1 {
    public om1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // androidx.appcompat.view.menu.km1
    public final void f(Bundle bundle) {
        Parcel h = h();
        yj1.d(h, bundle);
        k(1, h);
    }
}
