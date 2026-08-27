package androidx.appcompat.view.menu;

import android.app.job.JobInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public interface n00 extends IInterface {
    public static final String d = "androidx.appcompat.view.menu.n00";

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements n00 {

        /* renamed from: androidx.appcompat.view.menu.n00$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0014a implements n00 {
            public IBinder l;

            public C0014a(IBinder iBinder) {
                this.l = iBinder;
            }

            @Override // androidx.appcompat.view.menu.n00
            public int B0(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(n00.d);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.n00
            public d70 E(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(n00.d);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.l.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return (d70) b.c(obtain2, d70.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.appcompat.view.menu.n00
            public void O(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(n00.d);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.l.transact(3, obtain, obtain2, 0);
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

            @Override // androidx.appcompat.view.menu.n00
            public JobInfo i0(JobInfo jobInfo, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(n00.d);
                    b.d(obtain, jobInfo, 0);
                    obtain.writeInt(i);
                    this.l.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return (JobInfo) b.c(obtain2, JobInfo.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, n00.d);
        }

        public static n00 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(n00.d);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof n00)) ? new C0014a(iBinder) : (n00) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = n00.d;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                JobInfo i0 = i0((JobInfo) b.c(parcel, JobInfo.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                b.d(parcel2, i0, 1);
            } else if (i == 2) {
                d70 E = E(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                b.d(parcel2, E, 1);
            } else if (i == 3) {
                O(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
            } else if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                int B0 = B0(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(B0);
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

    int B0(String str, int i, int i2);

    d70 E(String str, int i, int i2);

    void O(String str, int i);

    JobInfo i0(JobInfo jobInfo, int i);
}
