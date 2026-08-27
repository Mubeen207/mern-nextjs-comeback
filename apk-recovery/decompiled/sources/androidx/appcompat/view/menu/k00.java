package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.accounts.IAccountManagerResponse;
import android.content.pm.PackageParser;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.t02;
import java.util.Map;
/* loaded from: classes.dex */
public interface k00 extends IInterface {
    public static final String a = "androidx.appcompat.view.menu.k00";

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements k00 {

        /* renamed from: androidx.appcompat.view.menu.k00$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0009a implements k00 {
            public IBinder l;

            public C0009a(IBinder iBinder) {
                this.l = iBinder;
            }

            @Override // androidx.appcompat.view.menu.k00
            public void A1(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    obtain.writeInt(i);
                    this.l.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public int E0(Account account, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    b.d(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void G(Account account, String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    b.d(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.l.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public Account[] I1(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Account[]) obtain2.createTypedArray(Account.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void J1(Account account, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    b.d(obtain, account, 0);
                    obtain.writeInt(i);
                    this.l.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void K1(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z, Bundle bundle, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    obtain.writeInt(z ? 1 : 0);
                    b.d(obtain, bundle, 0);
                    obtain.writeInt(i);
                    this.l.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void M0(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z, Bundle bundle, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStringArray(strArr);
                    obtain.writeInt(z ? 1 : 0);
                    b.d(obtain, bundle, 0);
                    obtain.writeInt(i);
                    this.l.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void M1(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    obtain.writeInt(i);
                    this.l.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public String N1(Account account, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    b.d(obtain, account, 0);
                    obtain.writeInt(i);
                    this.l.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public boolean R0(Account account, String str, Bundle bundle, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    b.d(obtain, account, 0);
                    obtain.writeString(str);
                    b.d(obtain, bundle, 0);
                    obtain.writeInt(i);
                    this.l.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public Account[] S1(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Account[]) obtain2.createTypedArray(Account.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void T0(IAccountManagerResponse iAccountManagerResponse, String str, boolean z, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    this.l.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void X0(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.l.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void Y(IAccountManagerResponse iAccountManagerResponse, Account account, Bundle bundle, boolean z, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    b.d(obtain, account, 0);
                    b.d(obtain, bundle, 0);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    this.l.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void Z(String[] strArr, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void a1(IAccountManagerResponse iAccountManagerResponse, Account account, boolean z, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    b.d(obtain, account, 0);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(i);
                    this.l.transact(10, obtain, obtain2, 0);
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

            @Override // androidx.appcompat.view.menu.k00
            public Map b2(Account account, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    b.d(obtain, account, 0);
                    obtain.writeInt(i);
                    this.l.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void c1(Account account, String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    b.d(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.l.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public Account[] d1(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.l.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return (Account[]) obtain2.createTypedArray(Account.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void d2(IAccountManagerResponse iAccountManagerResponse, Account account, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    b.d(obtain, account, 0);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public Map f0(String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.l.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void f1(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z, Bundle bundle, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    b.d(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    b.d(obtain, bundle, 0);
                    obtain.writeInt(i);
                    this.l.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public boolean i1(Account account, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    b.d(obtain, account, 0);
                    obtain.writeInt(i);
                    this.l.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void k1(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z, boolean z2, Bundle bundle, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    b.d(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeInt(z2 ? 1 : 0);
                    b.d(obtain, bundle, 0);
                    obtain.writeInt(i);
                    this.l.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public AuthenticatorDescription[] k2(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeInt(i);
                    this.l.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return (AuthenticatorDescription[]) obtain2.createTypedArray(AuthenticatorDescription.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public String l2(Account account, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    b.d(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public boolean m0(Account account, String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    b.d(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public boolean p0(Account account, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    b.d(obtain, account, 0);
                    obtain.writeInt(i);
                    this.l.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public String r(Account account, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    b.d(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void r2(Account account, String str, int i, boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    b.d(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    this.l.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public boolean s1(Account account, String str, Bundle bundle, Map map, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    b.d(obtain, account, 0);
                    obtain.writeString(str);
                    b.d(obtain, bundle, 0);
                    obtain.writeMap(map);
                    obtain.writeInt(i);
                    this.l.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void w1(String[] strArr, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void y0(IAccountManagerResponse iAccountManagerResponse, String str, String str2, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    obtain.writeStrongInterface(iAccountManagerResponse);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i);
                    this.l.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.k00
            public void y1(Account account, String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(k00.a);
                    b.d(obtain, account, 0);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, k00.a);
        }

        public static k00 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(k00.a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof k00)) ? new C0009a(iBinder) : (k00) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = k00.a;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 1:
                    String N1 = N1((Account) b.c(parcel, Account.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(N1);
                    break;
                case 2:
                    String r = r((Account) b.c(parcel, Account.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(r);
                    break;
                case t02.c.c /* 3 */:
                    AuthenticatorDescription[] k2 = k2(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(k2, 1);
                    break;
                case 4:
                    Account[] S1 = S1(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(S1, 1);
                    break;
                case t02.c.e /* 5 */:
                    Account[] d1 = d1(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(d1, 1);
                    break;
                case t02.c.f /* 6 */:
                    Account[] I1 = I1(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(I1, 1);
                    break;
                case t02.c.g /* 7 */:
                    M1(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.createStringArray(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
                    A1(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.createStringArray(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 9:
                    boolean R0 = R0((Account) b.c(parcel, Account.CREATOR), parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(R0 ? 1 : 0);
                    break;
                case 10:
                    a1(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), (Account) b.c(parcel, Account.CREATOR), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 11:
                    boolean i1 = i1((Account) b.c(parcel, Account.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(i1 ? 1 : 0);
                    break;
                case 12:
                    d2(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), (Account) b.c(parcel, Account.CREATOR), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 13:
                    X0(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 14:
                    String l2 = l2((Account) b.c(parcel, Account.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(l2);
                    break;
                case 15:
                    G((Account) b.c(parcel, Account.CREATOR), parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                    y1((Account) b.c(parcel, Account.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 17:
                    J1((Account) b.c(parcel, Account.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 18:
                    c1((Account) b.c(parcel, Account.CREATOR), parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 19:
                    r2((Account) b.c(parcel, Account.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    break;
                case 20:
                    k1(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), (Account) b.c(parcel, Account.CREATOR), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 21:
                    M0(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 22:
                    K1(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 23:
                    f1(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), (Account) b.c(parcel, Account.CREATOR), parcel.readString(), parcel.readInt() != 0, (Bundle) b.c(parcel, Bundle.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 24:
                    T0(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 25:
                    Y(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), (Account) b.c(parcel, Account.CREATOR), (Bundle) b.c(parcel, Bundle.CREATOR), parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 26:
                    boolean p0 = p0((Account) b.c(parcel, Account.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(p0 ? 1 : 0);
                    break;
                case 27:
                    y0(IAccountManagerResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 28:
                    Map b2 = b2((Account) b.c(parcel, Account.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeMap(b2);
                    break;
                case 29:
                    boolean s1 = s1((Account) b.c(parcel, Account.CREATOR), parcel.readString(), (Bundle) b.c(parcel, Bundle.CREATOR), parcel.readHashMap(getClass().getClassLoader()), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(s1 ? 1 : 0);
                    break;
                case 30:
                    boolean m0 = m0((Account) b.c(parcel, Account.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(m0 ? 1 : 0);
                    break;
                case 31:
                    int E0 = E0((Account) b.c(parcel, Account.CREATOR), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(E0);
                    break;
                case PackageParser.PARSE_EXTERNAL_STORAGE /* 32 */:
                    Map f0 = f0(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeMap(f0);
                    break;
                case 33:
                    w1(parcel.createStringArray(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 34:
                    Z(parcel.createStringArray(), parcel.readString(), parcel.readInt());
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

    void A1(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i);

    int E0(Account account, String str, int i);

    void G(Account account, String str, String str2, int i);

    Account[] I1(String str, int i);

    void J1(Account account, int i);

    void K1(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z, Bundle bundle, int i);

    void M0(IAccountManagerResponse iAccountManagerResponse, String str, String str2, String[] strArr, boolean z, Bundle bundle, int i);

    void M1(IAccountManagerResponse iAccountManagerResponse, String str, String[] strArr, int i);

    String N1(Account account, int i);

    boolean R0(Account account, String str, Bundle bundle, int i);

    Account[] S1(String str, int i, int i2);

    void T0(IAccountManagerResponse iAccountManagerResponse, String str, boolean z, int i);

    void X0(String str, String str2, int i);

    void Y(IAccountManagerResponse iAccountManagerResponse, Account account, Bundle bundle, boolean z, int i);

    void Z(String[] strArr, String str, int i);

    void a1(IAccountManagerResponse iAccountManagerResponse, Account account, boolean z, int i);

    Map b2(Account account, int i);

    void c1(Account account, String str, String str2, int i);

    Account[] d1(String str, String str2, int i);

    void d2(IAccountManagerResponse iAccountManagerResponse, Account account, int i, int i2);

    Map f0(String str, String str2, int i);

    void f1(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z, Bundle bundle, int i);

    boolean i1(Account account, int i);

    void k1(IAccountManagerResponse iAccountManagerResponse, Account account, String str, boolean z, boolean z2, Bundle bundle, int i);

    AuthenticatorDescription[] k2(int i);

    String l2(Account account, String str, int i);

    boolean m0(Account account, String str, int i, int i2);

    boolean p0(Account account, int i);

    String r(Account account, String str, int i);

    void r2(Account account, String str, int i, boolean z);

    boolean s1(Account account, String str, Bundle bundle, Map map, int i);

    void w1(String[] strArr, String str, int i);

    void y0(IAccountManagerResponse iAccountManagerResponse, String str, String str2, int i);

    void y1(Account account, String str, int i);
}
