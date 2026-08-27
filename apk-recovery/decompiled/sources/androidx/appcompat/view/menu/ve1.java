package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class ve1 implements IInterface {
    public final IBinder l;
    public final String m;

    public ve1(IBinder iBinder, String str) {
        this.l = iBinder;
        this.m = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.l;
    }

    public final Parcel h(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.l.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel j() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.m);
        return obtain;
    }
}
