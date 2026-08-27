package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class ef1 implements l10 {
    public final IBinder l;

    public ef1(IBinder iBinder) {
        this.l = iBinder;
    }

    @Override // androidx.appcompat.view.menu.l10
    public final void Q(k10 k10Var, rx rxVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(k10Var != null ? k10Var.asBinder() : null);
            if (rxVar != null) {
                obtain.writeInt(1);
                i72.a(rxVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.l.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.l;
    }
}
