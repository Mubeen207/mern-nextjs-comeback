package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageParser;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.t02;
/* loaded from: classes.dex */
public interface l00 extends IInterface {
    public static final String b = "androidx.appcompat.view.menu.l00";

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements l00 {

        /* renamed from: androidx.appcompat.view.menu.l00$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0011a implements l00 {
            public IBinder l;

            public C0011a(IBinder iBinder) {
                this.l = iBinder;
            }

            @Override // androidx.appcompat.view.menu.l00
            public dq0 C(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                    return (dq0) b.c(obtain2, dq0.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public ComponentName D1(Intent intent, String str, boolean z, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    b.d(obtain, intent, 0);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    this.l.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ComponentName) b.c(obtain2, ComponentName.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public void H(ComponentName componentName, IBinder iBinder, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    b.d(obtain, componentName, 0);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.l.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public void K(zh0 zh0Var) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    b.d(obtain, zh0Var, 0);
                    this.l.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public void L1(IBinder iBinder, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.l.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public void M(IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    obtain.writeStrongBinder(iBinder);
                    this.l.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public p3 N0(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.l.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (p3) b.c(obtain2, p3.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public String R1(IBinder iBinder, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.l.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public eq0 S0(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    return (eq0) b.c(obtain2, eq0.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public void T1(IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    obtain.writeStrongBinder(iBinder);
                    this.l.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public String X(IBinder iBinder, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.l.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public int Y1(Intent intent, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    b.d(obtain, intent, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public int Z0(int i, Intent intent, String str, IBinder iBinder, String str2, int i2, int i3, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    obtain.writeInt(i);
                    b.d(obtain, intent, 0);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str2);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    b.d(obtain, bundle, 0);
                    this.l.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.l;
            }

            @Override // androidx.appcompat.view.menu.l00
            public IBinder d0(Intent intent, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    b.d(obtain, intent, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public void h0(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.l.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public IBinder i(ProviderInfo providerInfo) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    b.d(obtain, providerInfo, 0);
                    this.l.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public void l(Intent intent, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    b.d(obtain, intent, 0);
                    obtain.writeInt(i);
                    this.l.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public void m(int i, IBinder iBinder, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    this.l.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public Intent m2(Intent intent, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    b.d(obtain, intent, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Intent) b.c(obtain2, Intent.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public void n0(Intent intent, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    b.d(obtain, intent, 0);
                    obtain.writeInt(i);
                    this.l.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public int q(IBinder iBinder, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.l.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public ComponentName q2(IBinder iBinder, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    this.l.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ComponentName) b.c(obtain2, ComponentName.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public void r1(IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    obtain.writeStrongBinder(iBinder);
                    this.l.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public Intent u(Intent intent, IBinder iBinder, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    b.d(obtain, intent, 0);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Intent) b.c(obtain2, Intent.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public void u1(IBinder iBinder, String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public int v1(int i, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    obtain.writeInt(i);
                    obtain.writeTypedArray(intentArr, 0);
                    obtain.writeStringArray(strArr);
                    obtain.writeStrongBinder(iBinder);
                    b.d(obtain, bundle, 0);
                    this.l.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public void x1(Intent intent, zh0 zh0Var, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    b.d(obtain, intent, 0);
                    b.d(obtain, zh0Var, 0);
                    obtain.writeInt(i);
                    this.l.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.l00
            public l31 y(Intent intent, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(l00.b);
                    b.d(obtain, intent, 0);
                    obtain.writeInt(i);
                    this.l.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return (l31) b.c(obtain2, l31.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, l00.b);
        }

        public static l00 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(l00.b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof l00)) ? new C0011a(iBinder) : (l00) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = l00.b;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 1:
                    p3 N0 = N0(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    b.d(parcel2, N0, 1);
                    break;
                case 2:
                    h0(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case t02.c.c /* 3 */:
                    n0((Intent) b.c(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 4:
                    int Z0 = Z0(parcel.readInt(), (Intent) b.c(parcel, Intent.CREATOR), parcel.readString(), parcel.readStrongBinder(), parcel.readString(), parcel.readInt(), parcel.readInt(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(Z0);
                    break;
                case t02.c.e /* 5 */:
                    int v1 = v1(parcel.readInt(), (Intent[]) parcel.createTypedArray(Intent.CREATOR), parcel.createStringArray(), parcel.readStrongBinder(), (Bundle) b.c(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(v1);
                    break;
                case t02.c.f /* 6 */:
                    ComponentName D1 = D1((Intent) b.c(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    b.d(parcel2, D1, 1);
                    break;
                case t02.c.g /* 7 */:
                    int Y1 = Y1((Intent) b.c(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(Y1);
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    Intent u = u((Intent) b.c(parcel, Intent.CREATOR), parcel.readStrongBinder(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    b.d(parcel2, u, 1);
                    break;
                case 9:
                    L1(parcel.readStrongBinder(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 10:
                    H((ComponentName) b.c(parcel, ComponentName.CREATOR), parcel.readStrongBinder(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 11:
                    l31 y = y((Intent) b.c(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    b.d(parcel2, y, 1);
                    break;
                case 12:
                    l((Intent) b.c(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 13:
                    IBinder i3 = i((ProviderInfo) b.c(parcel, ProviderInfo.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(i3);
                    break;
                case 14:
                    Intent m2 = m2((Intent) b.c(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    b.d(parcel2, m2, 1);
                    break;
                case 15:
                    IBinder d0 = d0((Intent) b.c(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(d0);
                    break;
                case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                    m(parcel.readInt(), parcel.readStrongBinder(), parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 17:
                    T1(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    break;
                case 18:
                    r1(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    break;
                case 19:
                    M(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    break;
                case 20:
                    dq0 C = C(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    b.d(parcel2, C, 1);
                    break;
                case 21:
                    eq0 S0 = S0(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    b.d(parcel2, S0, 1);
                    break;
                case 22:
                    x1((Intent) b.c(parcel, Intent.CREATOR), (zh0) b.c(parcel, zh0.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 23:
                    K((zh0) b.c(parcel, zh0.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 24:
                    String X = X(parcel.readStrongBinder(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(X);
                    break;
                case 25:
                    ComponentName q2 = q2(parcel.readStrongBinder(), parcel.readInt());
                    parcel2.writeNoException();
                    b.d(parcel2, q2, 1);
                    break;
                case 26:
                    u1(parcel.readStrongBinder(), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 27:
                    String R1 = R1(parcel.readStrongBinder(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(R1);
                    break;
                case 28:
                    int q = q(parcel.readStrongBinder(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(q);
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

    dq0 C(String str, int i);

    ComponentName D1(Intent intent, String str, boolean z, int i);

    void H(ComponentName componentName, IBinder iBinder, int i);

    void K(zh0 zh0Var);

    void L1(IBinder iBinder, int i);

    void M(IBinder iBinder);

    p3 N0(String str, String str2, int i);

    String R1(IBinder iBinder, int i);

    eq0 S0(String str, int i);

    void T1(IBinder iBinder);

    String X(IBinder iBinder, int i);

    int Y1(Intent intent, String str, int i);

    int Z0(int i, Intent intent, String str, IBinder iBinder, String str2, int i2, int i3, Bundle bundle);

    IBinder d0(Intent intent, String str, int i);

    void h0(String str, String str2, int i);

    IBinder i(ProviderInfo providerInfo);

    void l(Intent intent, int i);

    void m(int i, IBinder iBinder, String str);

    Intent m2(Intent intent, String str, int i);

    void n0(Intent intent, int i);

    int q(IBinder iBinder, int i);

    ComponentName q2(IBinder iBinder, int i);

    void r1(IBinder iBinder);

    Intent u(Intent intent, IBinder iBinder, String str, int i);

    void u1(IBinder iBinder, String str, int i, int i2);

    int v1(int i, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle);

    void x1(Intent intent, zh0 zh0Var, int i);

    l31 y(Intent intent, int i);
}
