package androidx.appcompat.view.menu;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes.dex */
public interface t00 extends IInterface {
    public static final String j = "androidx.appcompat.view.menu.t00";

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements t00 {

        /* renamed from: androidx.appcompat.view.menu.t00$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0030a implements t00 {
            public IBinder l;

            public C0030a(IBinder iBinder) {
                this.l = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.l;
            }
        }

        public a() {
            attachInterface(this, t00.j);
        }

        public static t00 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(t00.j);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof t00)) ? new C0030a(iBinder) : (t00) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = t00.j;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                e7 F = F(parcel.readInt());
                parcel2.writeNoException();
                b.d(parcel2, F, 1);
            } else if (i == 2) {
                boolean H1 = H1(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(H1 ? 1 : 0);
            } else if (i == 3) {
                e7 c2 = c2(parcel.readInt());
                parcel2.writeNoException();
                b.d(parcel2, c2, 1);
            } else if (i == 4) {
                List h1 = h1();
                parcel2.writeNoException();
                b.c(parcel2, h1, 1);
            } else if (i != 5) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                g(parcel.readInt());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void c(Parcel parcel, List list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                d(parcel, (Parcelable) list.get(i2), i);
            }
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

    e7 F(int i);

    boolean H1(int i);

    e7 c2(int i);

    void g(int i);

    List h1();
}
