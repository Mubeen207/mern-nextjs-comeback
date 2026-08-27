package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class od1 extends r {
    public static final Parcelable.Creator<od1> CREATOR = new qd1();
    public final int m;
    public final ef n;
    public final fe1 o;

    public od1(int i, ef efVar, fe1 fe1Var) {
        this.m = i;
        this.n = efVar;
        this.o = fe1Var;
    }

    public final ef d() {
        return this.n;
    }

    public final fe1 f() {
        return this.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.i(parcel, 1, this.m);
        mr0.m(parcel, 2, this.n, i, false);
        mr0.m(parcel, 3, this.o, i, false);
        mr0.b(parcel, a);
    }
}
