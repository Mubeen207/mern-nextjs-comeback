package androidx.appcompat.view.menu;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface g10 extends IInterface {
    public static final String k = "androidx.appcompat.view.menu.g10";

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements g10 {

        /* renamed from: androidx.appcompat.view.menu.g10$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0005a implements g10 {
            public IBinder l;

            public C0005a(IBinder iBinder) {
                this.l = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.l;
            }
        }

        public a() {
            attachInterface(this, g10.k);
        }

        public static g10 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(g10.k);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof g10)) ? new C0005a(iBinder) : (g10) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = g10.k;
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(str);
            return true;
        }
    }
}
