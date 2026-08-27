package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class re2 extends r {
    public static final Parcelable.Creator<re2> CREATOR = new we2();
    public final String m;
    public final z02 n;
    public final boolean o;
    public final boolean p;

    public re2(String str, z02 z02Var, boolean z, boolean z2) {
        this.m = str;
        this.n = z02Var;
        this.o = z;
        this.p = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.n(parcel, 1, this.m, false);
        z02 z02Var = this.n;
        if (z02Var == null) {
            z02Var = null;
        }
        mr0.h(parcel, 2, z02Var, false);
        mr0.c(parcel, 3, this.o);
        mr0.c(parcel, 4, this.p);
        mr0.b(parcel, a);
    }

    public re2(String str, IBinder iBinder, boolean z, boolean z2) {
        this.m = str;
        a32 a32Var = null;
        if (iBinder != null) {
            try {
                g20 d = yf2.j(iBinder).d();
                byte[] bArr = d == null ? null : (byte[]) yf0.j(d);
                if (bArr != null) {
                    a32Var = new a32(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.n = a32Var;
        this.o = z;
        this.p = z2;
    }
}
