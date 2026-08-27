package androidx.appcompat.view.menu;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.pm.PackageParser;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public interface p00 extends IInterface {
    public static final String f = "androidx.appcompat.view.menu.p00";

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements p00 {

        /* renamed from: androidx.appcompat.view.menu.p00$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0023a implements p00 {
            public IBinder l;

            public C0023a(IBinder iBinder) {
                this.l = iBinder;
            }

            @Override // androidx.appcompat.view.menu.p00
            public List H0(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(p00.f);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(NotificationChannelGroup.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.p00
            public void R(int i, String str, Notification notification, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(p00.f);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    b.f(obtain, notification, 0);
                    obtain.writeInt(i2);
                    this.l.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.p00
            public void V(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(p00.f);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.p00
            public NotificationChannel V0(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(p00.f);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (NotificationChannel) b.d(obtain2, NotificationChannel.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.p00
            public void Y0(int i, String str, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(p00.f);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    this.l.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.p00
            public void a0(NotificationChannel notificationChannel, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(p00.f);
                    b.f(obtain, notificationChannel, 0);
                    obtain.writeInt(i);
                    this.l.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.l;
            }

            @Override // androidx.appcompat.view.menu.p00
            public void e0(NotificationChannelGroup notificationChannelGroup, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(p00.f);
                    b.f(obtain, notificationChannelGroup, 0);
                    obtain.writeInt(i);
                    this.l.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.p00
            public List p(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(p00.f);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(NotificationChannel.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.p00
            public void p1(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(p00.f);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, p00.f);
        }

        public static p00 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(p00.f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof p00)) ? new C0023a(iBinder) : (p00) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = p00.f;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 1:
                    NotificationChannel V0 = V0(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    b.f(parcel2, V0, 1);
                    break;
                case 2:
                    List p = p(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    b.e(parcel2, p, 1);
                    break;
                case t02.c.c /* 3 */:
                    List H0 = H0(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    b.e(parcel2, H0, 1);
                    break;
                case 4:
                    a0((NotificationChannel) b.d(parcel, NotificationChannel.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case t02.c.e /* 5 */:
                    p1(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case t02.c.f /* 6 */:
                    e0((NotificationChannelGroup) b.d(parcel, NotificationChannelGroup.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case t02.c.g /* 7 */:
                    V(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    R(parcel.readInt(), parcel.readString(), (Notification) b.d(parcel, Notification.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 9:
                    Y0(parcel.readInt(), parcel.readString(), parcel.readInt());
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
        public static Object d(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void e(Parcel parcel, List list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                f(parcel, (Parcelable) list.get(i2), i);
            }
        }

        public static void f(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        }
    }

    List H0(String str, int i);

    void R(int i, String str, Notification notification, int i2);

    void V(String str, int i);

    NotificationChannel V0(String str, int i);

    void Y0(int i, String str, int i2);

    void a0(NotificationChannel notificationChannel, int i);

    void e0(NotificationChannelGroup notificationChannelGroup, int i);

    List p(String str, int i);

    void p1(String str, int i);
}
