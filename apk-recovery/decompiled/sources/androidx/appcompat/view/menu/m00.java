package androidx.appcompat.view.menu;

import android.content.Intent;
import android.content.pm.PackageParser;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public interface m00 extends IInterface {
    public static final String c = "androidx.appcompat.view.menu.m00";

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements m00 {

        /* renamed from: androidx.appcompat.view.menu.m00$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0012a implements m00 {
            public IBinder l;

            public C0012a(IBinder iBinder) {
                this.l = iBinder;
            }

            @Override // androidx.appcompat.view.menu.m00
            public void N() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(m00.c);
                    this.l.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.m00
            public IBinder O1(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(m00.c);
                    b.d(obtain, intent, 0);
                    this.l.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.l;
            }

            @Override // androidx.appcompat.view.menu.m00
            public void e2(IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(m00.c);
                    obtain.writeStrongBinder(iBinder);
                    this.l.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.m00
            public IBinder i(ProviderInfo providerInfo) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(m00.c);
                    b.d(obtain, providerInfo, 0);
                    this.l.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.m00
            public void n2(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(m00.c);
                    b.d(obtain, intent, 0);
                    this.l.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.m00
            public IBinder s0() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(m00.c);
                    this.l.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.m00
            public void t(IBinder iBinder, Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(m00.c);
                    obtain.writeStrongBinder(iBinder);
                    b.d(obtain, intent, 0);
                    this.l.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.m00
            public void z(zn0 zn0Var) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(m00.c);
                    b.d(obtain, zn0Var, 0);
                    this.l.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, m00.c);
        }

        public static m00 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(m00.c);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof m00)) ? new C0012a(iBinder) : (m00) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = m00.c;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 1:
                    IBinder s0 = s0();
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(s0);
                    break;
                case 2:
                    N();
                    parcel2.writeNoException();
                    break;
                case t02.c.c /* 3 */:
                    W1(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 4:
                    IBinder i3 = i((ProviderInfo) b.c(parcel, ProviderInfo.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(i3);
                    break;
                case t02.c.e /* 5 */:
                    IBinder O1 = O1((Intent) b.c(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(O1);
                    break;
                case t02.c.f /* 6 */:
                    n2((Intent) b.c(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    break;
                case t02.c.g /* 7 */:
                    e2(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    t(parcel.readStrongBinder(), (Intent) b.c(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 9:
                    z((zn0) b.c(parcel, zn0.CREATOR));
                    parcel2.writeNoException();
                    break;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void d(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        }
    }

    void N();

    IBinder O1(Intent intent);

    void W1(String str);

    void e2(IBinder iBinder);

    IBinder i(ProviderInfo providerInfo);

    void n2(Intent intent);

    IBinder s0();

    void t(IBinder iBinder, Intent intent);

    void z(zn0 zn0Var);
}
