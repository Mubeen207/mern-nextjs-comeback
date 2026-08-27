package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class ld1 extends r {
    public static final Parcelable.Creator<ld1> CREATOR = new nd1();
    public final int m;
    public final de1 n;

    public ld1(int i, de1 de1Var) {
        this.m = i;
        this.n = de1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.i(parcel, 1, this.m);
        mr0.m(parcel, 2, this.n, i, false);
        mr0.b(parcel, a);
    }
}
