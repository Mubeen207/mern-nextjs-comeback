package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.Parcel;
import androidx.appcompat.view.menu.g20;
/* loaded from: classes.dex */
public final class tf2 extends ve1 implements cg2 {
    public tf2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // androidx.appcompat.view.menu.cg2
    public final int c() {
        Parcel h = h(2, j());
        int readInt = h.readInt();
        h.recycle();
        return readInt;
    }

    @Override // androidx.appcompat.view.menu.cg2
    public final g20 d() {
        Parcel h = h(1, j());
        g20 asInterface = g20.a.asInterface(h.readStrongBinder());
        h.recycle();
        return asInterface;
    }
}
