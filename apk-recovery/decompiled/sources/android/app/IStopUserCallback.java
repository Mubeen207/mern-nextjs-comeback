package android.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface IStopUserCallback extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IStopUserCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.app.IStopUserCallback
        public void userStopAborted(int i) {
        }

        @Override // android.app.IStopUserCallback
        public void userStopped(int i) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IStopUserCallback {
        public static final String DESCRIPTOR = IStopUserCallback.class.getName();
        static final int TRANSACTION_userStopAborted = 2;
        static final int TRANSACTION_userStopped = 1;

        /* loaded from: classes.dex */
        public static class Proxy implements IStopUserCallback {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // android.app.IStopUserCallback
            public void userStopAborted(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.app.IStopUserCallback
            public void userStopped(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IStopUserCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IStopUserCallback)) ? new Proxy(iBinder) : (IStopUserCallback) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                userStopped(parcel.readInt());
                parcel2.writeNoException();
            } else if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                userStopAborted(parcel.readInt());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    void userStopAborted(int i);

    void userStopped(int i);
}
