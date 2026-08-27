package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageParser;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public interface r00 extends IInterface {
    public static final String h = "androidx.appcompat.view.menu.r00";

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements r00 {

        /* renamed from: androidx.appcompat.view.menu.r00$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0026a implements r00 {
            public IBinder l;

            public C0026a(IBinder iBinder) {
                this.l = iBinder;
            }

            @Override // androidx.appcompat.view.menu.r00
            public ResolveInfo D(Intent intent, String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    b.f(obtain, intent, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ResolveInfo) b.d(obtain2, ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public boolean F1(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public List I0(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ApplicationInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public List O0(Intent intent, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    b.f(obtain, intent, 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public p50 U0(String str, o50 o50Var, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    obtain.writeString(str);
                    b.f(obtain, o50Var, 0);
                    obtain.writeInt(i);
                    this.l.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    return (p50) b.d(obtain2, p50.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public ActivityInfo U1(ComponentName componentName, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    b.f(obtain, componentName, 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ActivityInfo) b.d(obtain2, ActivityInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public ResolveInfo W(Intent intent, int i, String str, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    b.f(obtain, intent, 0);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    this.l.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ResolveInfo) b.d(obtain2, ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public List W0(Intent intent, int i, String str, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    b.f(obtain, intent, 0);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    this.l.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public ProviderInfo X1(ComponentName componentName, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    b.f(obtain, componentName, 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ProviderInfo) b.d(obtain2, ProviderInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.l;
            }

            @Override // androidx.appcompat.view.menu.r00
            public List b0(Intent intent, int i, String str, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    b.f(obtain, intent, 0);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    this.l.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public ApplicationInfo c0(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ApplicationInfo) b.d(obtain2, ApplicationInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public int f2(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    obtain.writeInt(i);
                    this.l.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public ServiceInfo g1(ComponentName componentName, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    b.f(obtain, componentName, 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ServiceInfo) b.d(obtain2, ServiceInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public List g2(String str, int i, int i2, int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.l.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(ProviderInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public String[] l1(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createStringArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public ResolveInfo n(Intent intent, int i, String str, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    b.f(obtain, intent, 0);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    this.l.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ResolveInfo) b.d(obtain2, ResolveInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public List n1(int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(PackageInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public ActivityInfo o2(ComponentName componentName, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    b.f(obtain, componentName, 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ActivityInfo) b.d(obtain2, ActivityInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public ProviderInfo z0(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ProviderInfo) b.d(obtain2, ProviderInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.r00
            public PackageInfo z1(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(r00.h);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return (PackageInfo) b.d(obtain2, PackageInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, r00.h);
        }

        public static r00 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(r00.h);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof r00)) ? new C0026a(iBinder) : (r00) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = r00.h;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 1:
                    int f2 = f2(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(f2);
                    break;
                case 2:
                    ResolveInfo W = W((Intent) b.d(parcel, Intent.CREATOR), parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    b.f(parcel2, W, 1);
                    break;
                case t02.c.c /* 3 */:
                    ResolveInfo n = n((Intent) b.d(parcel, Intent.CREATOR), parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    b.f(parcel2, n, 1);
                    break;
                case 4:
                    ProviderInfo z0 = z0(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    b.f(parcel2, z0, 1);
                    break;
                case t02.c.e /* 5 */:
                    ResolveInfo D = D((Intent) b.d(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    b.f(parcel2, D, 1);
                    break;
                case t02.c.f /* 6 */:
                    ApplicationInfo c0 = c0(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    b.f(parcel2, c0, 1);
                    break;
                case t02.c.g /* 7 */:
                    PackageInfo z1 = z1(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    b.f(parcel2, z1, 1);
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    ServiceInfo g1 = g1((ComponentName) b.d(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    b.f(parcel2, g1, 1);
                    break;
                case 9:
                    ActivityInfo o2 = o2((ComponentName) b.d(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    b.f(parcel2, o2, 1);
                    break;
                case 10:
                    ActivityInfo U1 = U1((ComponentName) b.d(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    b.f(parcel2, U1, 1);
                    break;
                case 11:
                    ProviderInfo X1 = X1((ComponentName) b.d(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    b.f(parcel2, X1, 1);
                    break;
                case 12:
                    List I0 = I0(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    b.e(parcel2, I0, 1);
                    break;
                case 13:
                    List n1 = n1(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    b.e(parcel2, n1, 1);
                    break;
                case 14:
                    List W0 = W0((Intent) b.d(parcel, Intent.CREATOR), parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    b.e(parcel2, W0, 1);
                    break;
                case 15:
                    List b0 = b0((Intent) b.d(parcel, Intent.CREATOR), parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    b.e(parcel2, b0, 1);
                    break;
                case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                    List O0 = O0((Intent) b.d(parcel, Intent.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    b.e(parcel2, O0, 1);
                    break;
                case 17:
                    List g2 = g2(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    b.e(parcel2, g2, 1);
                    break;
                case 18:
                    p50 U0 = U0(parcel.readString(), (o50) b.d(parcel, o50.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    b.f(parcel2, U0, 1);
                    break;
                case 19:
                    t1(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 20:
                    a2(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 21:
                    v0(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 22:
                    q1(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 23:
                    g(parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 24:
                    boolean F1 = F1(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(F1 ? 1 : 0);
                    break;
                case 25:
                    List B1 = B1(parcel.readInt());
                    parcel2.writeNoException();
                    b.e(parcel2, B1, 1);
                    break;
                case 26:
                    String[] l1 = l1(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeStringArray(l1);
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

    List B1(int i);

    ResolveInfo D(Intent intent, String str, int i, int i2);

    boolean F1(String str, int i);

    List I0(int i, int i2);

    List O0(Intent intent, int i, int i2);

    p50 U0(String str, o50 o50Var, int i);

    ActivityInfo U1(ComponentName componentName, int i, int i2);

    ResolveInfo W(Intent intent, int i, String str, int i2);

    List W0(Intent intent, int i, String str, int i2);

    ProviderInfo X1(ComponentName componentName, int i, int i2);

    void a2(String str);

    List b0(Intent intent, int i, String str, int i2);

    ApplicationInfo c0(String str, int i, int i2);

    int f2(int i);

    void g(int i);

    ServiceInfo g1(ComponentName componentName, int i, int i2);

    List g2(String str, int i, int i2, int i3);

    String[] l1(int i, int i2);

    ResolveInfo n(Intent intent, int i, String str, int i2);

    List n1(int i, int i2);

    ActivityInfo o2(ComponentName componentName, int i, int i2);

    void q1(String str, int i);

    void t1(String str, int i);

    void v0(String str, int i);

    ProviderInfo z0(String str, int i, int i2);

    PackageInfo z1(String str, int i, int i2);
}
