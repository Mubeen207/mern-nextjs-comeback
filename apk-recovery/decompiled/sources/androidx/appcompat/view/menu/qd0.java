package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class qd0 extends r {
    public static final Parcelable.Creator<qd0> CREATOR = new ud1();
    public final int m;
    public final int n;
    public final int o;
    public final long p;
    public final long q;
    public final String r;
    public final String s;
    public final int t;
    public final int u;

    public qd0(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.p = j;
        this.q = j2;
        this.r = str;
        this.s = str2;
        this.t = i4;
        this.u = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.i(parcel, 1, this.m);
        mr0.i(parcel, 2, this.n);
        mr0.i(parcel, 3, this.o);
        mr0.k(parcel, 4, this.p);
        mr0.k(parcel, 5, this.q);
        mr0.n(parcel, 6, this.r, false);
        mr0.n(parcel, 7, this.s, false);
        mr0.i(parcel, 8, this.t);
        mr0.i(parcel, 9, this.u);
        mr0.b(parcel, a);
    }
}
