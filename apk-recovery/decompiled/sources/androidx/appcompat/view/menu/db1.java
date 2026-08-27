package androidx.appcompat.view.menu;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class db1 extends r {
    public static final Parcelable.Creator<db1> CREATOR = new ob1();
    public final int m;
    public int n;
    public Intent o;

    public db1(int i, int i2, Intent intent) {
        this.m = i;
        this.n = i2;
        this.o = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.i(parcel, 1, this.m);
        mr0.i(parcel, 2, this.n);
        mr0.m(parcel, 3, this.o, i, false);
        mr0.b(parcel, a);
    }
}
