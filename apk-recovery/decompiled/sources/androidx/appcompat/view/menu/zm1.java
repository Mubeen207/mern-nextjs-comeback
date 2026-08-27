package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class zm1 extends te1 implements gr1 {
    public zm1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // androidx.appcompat.view.menu.gr1
    public final String c() {
        Parcel j = j(1, h());
        String readString = j.readString();
        j.recycle();
        return readString;
    }

    @Override // androidx.appcompat.view.menu.gr1
    public final boolean u0(boolean z) {
        Parcel h = h();
        pk1.a(h, true);
        Parcel j = j(2, h);
        boolean b = pk1.b(j);
        j.recycle();
        return b;
    }
}
