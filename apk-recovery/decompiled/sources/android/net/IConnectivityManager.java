package android.net;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public interface IConnectivityManager extends IInterface {

    /* loaded from: classes.dex */
    public static class Default implements IConnectivityManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public LinkProperties getActiveLinkProperties() {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public NetworkInfo getActiveNetworkInfo() {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public NetworkInfo getActiveNetworkInfoForUid(int i, boolean z) {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public NetworkInfo[] getAllNetworkInfo() {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public LinkProperties getLinkProperties(int i) {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public NetworkInfo getNetworkInfo(int i) {
            return null;
        }

        @Override // android.net.IConnectivityManager
        public boolean isActiveNetworkMetered() {
            return false;
        }

        @Override // android.net.IConnectivityManager
        public boolean requestRouteToHostAddress(int i, int i2) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IConnectivityManager {
        public static final String DESCRIPTOR = IConnectivityManager.class.getName();
        static final int TRANSACTION_getActiveLinkProperties = 7;
        static final int TRANSACTION_getActiveNetworkInfo = 1;
        static final int TRANSACTION_getActiveNetworkInfoForUid = 2;
        static final int TRANSACTION_getAllNetworkInfo = 4;
        static final int TRANSACTION_getLinkProperties = 8;
        static final int TRANSACTION_getNetworkInfo = 3;
        static final int TRANSACTION_isActiveNetworkMetered = 5;
        static final int TRANSACTION_requestRouteToHostAddress = 6;

        /* loaded from: classes.dex */
        public static class Proxy implements IConnectivityManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // android.net.IConnectivityManager
            public LinkProperties getActiveLinkProperties() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return (LinkProperties) _Parcel.readTypedObject(obtain2, LinkProperties.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public NetworkInfo getActiveNetworkInfo() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (NetworkInfo) _Parcel.readTypedObject(obtain2, NetworkInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public NetworkInfo getActiveNetworkInfoForUid(int i, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return (NetworkInfo) _Parcel.readTypedObject(obtain2, NetworkInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public NetworkInfo[] getAllNetworkInfo() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return (NetworkInfo[]) obtain2.createTypedArray(NetworkInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // android.net.IConnectivityManager
            public LinkProperties getLinkProperties(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return (LinkProperties) _Parcel.readTypedObject(obtain2, LinkProperties.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public NetworkInfo getNetworkInfo(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return (NetworkInfo) _Parcel.readTypedObject(obtain2, NetworkInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public boolean isActiveNetworkMetered() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.net.IConnectivityManager
            public boolean requestRouteToHostAddress(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IConnectivityManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IConnectivityManager)) ? new Proxy(iBinder) : (IConnectivityManager) queryLocalInterface;
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
            switch (i) {
                case 1:
                    NetworkInfo activeNetworkInfo = getActiveNetworkInfo();
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, activeNetworkInfo, 1);
                    break;
                case 2:
                    NetworkInfo activeNetworkInfoForUid = getActiveNetworkInfoForUid(parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, activeNetworkInfoForUid, 1);
                    break;
                case 3:
                    NetworkInfo networkInfo = getNetworkInfo(parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, networkInfo, 1);
                    break;
                case 4:
                    NetworkInfo[] allNetworkInfo = getAllNetworkInfo();
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(allNetworkInfo, 1);
                    break;
                case 5:
                    boolean isActiveNetworkMetered = isActiveNetworkMetered();
                    parcel2.writeNoException();
                    parcel2.writeInt(isActiveNetworkMetered ? 1 : 0);
                    break;
                case 6:
                    boolean requestRouteToHostAddress = requestRouteToHostAddress(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(requestRouteToHostAddress ? 1 : 0);
                    break;
                case 7:
                    LinkProperties activeLinkProperties = getActiveLinkProperties();
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, activeLinkProperties, 1);
                    break;
                case 8:
                    LinkProperties linkProperties = getLinkProperties(parcel.readInt());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, linkProperties, 1);
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            t.writeToParcel(parcel, i);
        }
    }

    LinkProperties getActiveLinkProperties();

    NetworkInfo getActiveNetworkInfo();

    NetworkInfo getActiveNetworkInfoForUid(int i, boolean z);

    NetworkInfo[] getAllNetworkInfo();

    LinkProperties getLinkProperties(int i);

    NetworkInfo getNetworkInfo(int i);

    boolean isActiveNetworkMetered();

    boolean requestRouteToHostAddress(int i, int i2);
}
