package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.t02;
import java.util.List;
/* loaded from: classes.dex */
public interface o00 extends IInterface {
    public static final String e = "androidx.appcompat.view.menu.o00";

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements o00 {

        /* renamed from: androidx.appcompat.view.menu.o00$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0020a implements o00 {
            public IBinder l;

            public C0020a(IBinder iBinder) {
                this.l = iBinder;
            }

            @Override // androidx.appcompat.view.menu.o00
            public p6 B(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00.e);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.l.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return (p6) b.d(obtain2, p6.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.o00
            public List J0(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00.e);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.l.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(n6.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.o00
            public int K0(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00.e);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.l.transact(1, obtain, obtain2, 0);
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

            @Override // androidx.appcompat.view.menu.o00
            public n6 h2(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00.e);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.l.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return (n6) b.d(obtain2, n6.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.o00
            public void k0(IBinder iBinder, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00.e);
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.o00
            public List p2(int i, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00.e);
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    this.l.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(n6.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.o00
            public void x(IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(o00.e);
                    obtain.writeStrongBinder(iBinder);
                    this.l.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, o00.e);
        }

        public static o00 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(o00.e);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof o00)) ? new C0020a(iBinder) : (o00) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = o00.e;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 1:
                    int K0 = K0(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(K0);
                    break;
                case 2:
                    P0(parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case t02.c.c /* 3 */:
                    e1(parcel.readInt(), parcel.readString(), (n6) b.d(parcel, n6.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 4:
                    G1(parcel.readInt(), parcel.readString(), parcel.createTypedArrayList(n6.CREATOR));
                    parcel2.writeNoException();
                    break;
                case t02.c.e /* 5 */:
                    s2(parcel.readInt(), parcel.readString(), parcel.createTypedArrayList(n6.CREATOR));
                    parcel2.writeNoException();
                    break;
                case t02.c.f /* 6 */:
                    List J0 = J0(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    b.e(parcel2, J0, 1);
                    break;
                case t02.c.g /* 7 */:
                    l0((n6) b.d(parcel, n6.CREATOR));
                    parcel2.writeNoException();
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    L(parcel.createTypedArrayList(n6.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 9:
                    J(parcel.createTypedArrayList(n6.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 10:
                    List q0 = q0();
                    parcel2.writeNoException();
                    b.e(parcel2, q0, 1);
                    break;
                case 11:
                    n6 h2 = h2(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, h2, 1);
                    break;
                case 12:
                    List p2 = p2(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    b.e(parcel2, p2, 1);
                    break;
                case 13:
                    C0(parcel.readInt(), parcel.readString(), (p6) b.d(parcel, p6.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    p6 B = B(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    b.f(parcel2, B, 1);
                    break;
                case 15:
                    t0((p6) b.d(parcel, p6.CREATOR));
                    parcel2.writeNoException();
                    break;
                case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                    p6 A0 = A0();
                    parcel2.writeNoException();
                    b.f(parcel2, A0, 1);
                    break;
                case 17:
                    k0(parcel.readStrongBinder(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 18:
                    x(parcel.readStrongBinder());
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

    p6 A0();

    p6 B(int i, String str);

    void C0(int i, String str, p6 p6Var);

    void G1(int i, String str, List list);

    void J(List list);

    List J0(int i, String str);

    int K0(int i, String str);

    void L(List list);

    void P0(int i, String str, int i2);

    void e1(int i, String str, n6 n6Var);

    n6 h2(int i, String str);

    void k0(IBinder iBinder, String str, int i);

    void l0(n6 n6Var);

    List p2(int i, String str);

    List q0();

    void s2(int i, String str, List list);

    void t0(p6 p6Var);

    void x(IBinder iBinder);
}
