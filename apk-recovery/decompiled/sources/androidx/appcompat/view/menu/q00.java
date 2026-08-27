package androidx.appcompat.view.menu;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public interface q00 extends IInterface {
    public static final String g = "androidx.appcompat.view.menu.q00";

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements q00 {

        /* renamed from: androidx.appcompat.view.menu.q00$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0025a implements q00 {
            public IBinder l;

            public C0025a(IBinder iBinder) {
                this.l = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.l;
            }
        }

        public a() {
            attachInterface(this, q00.g);
        }

        public static q00 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(q00.g);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof q00)) ? new C0025a(iBinder) : (q00) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = q00.g;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                int w = w((y6) b.b(parcel, y6.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(w);
            } else if (i == 2) {
                int b1 = b1((y6) b.b(parcel, y6.CREATOR), parcel.readInt() != 0, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(b1);
            } else if (i == 3) {
                int P = P((y6) b.b(parcel, y6.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(P);
            } else if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                int j1 = j1((y6) b.b(parcel, y6.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(j1);
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    int P(y6 y6Var, int i);

    int b1(y6 y6Var, boolean z, int i);

    int j1(y6 y6Var);

    int w(y6 y6Var, int i);
}
