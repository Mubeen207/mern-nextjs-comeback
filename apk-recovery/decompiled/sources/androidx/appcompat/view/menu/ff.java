package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class ff extends r {
    public static final Parcelable.Creator<ff> CREATOR = new e52();
    public final yp0 m;
    public final boolean n;
    public final boolean o;
    public final int[] p;
    public final int q;
    public final int[] r;

    public ff(yp0 yp0Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.m = yp0Var;
        this.n = z;
        this.o = z2;
        this.p = iArr;
        this.q = i;
        this.r = iArr2;
    }

    public int d() {
        return this.q;
    }

    public int[] f() {
        return this.p;
    }

    public int[] i() {
        return this.r;
    }

    public boolean k() {
        return this.n;
    }

    public boolean n() {
        return this.o;
    }

    public final yp0 p() {
        return this.m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.m(parcel, 1, this.m, i, false);
        mr0.c(parcel, 2, k());
        mr0.c(parcel, 3, n());
        mr0.j(parcel, 4, f(), false);
        mr0.i(parcel, 5, d());
        mr0.j(parcel, 6, i(), false);
        mr0.b(parcel, a);
    }
}
