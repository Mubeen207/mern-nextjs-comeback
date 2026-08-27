package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class eb1 implements IInterface {
    public final IBinder l;
    public final String m;

    public eb1(IBinder iBinder, String str) {
        this.l = iBinder;
        this.m = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.l;
    }

    public final Parcel h() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.m);
        return obtain;
    }

    public final void j(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.l.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void k(int i, Parcel parcel) {
        try {
            this.l.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
