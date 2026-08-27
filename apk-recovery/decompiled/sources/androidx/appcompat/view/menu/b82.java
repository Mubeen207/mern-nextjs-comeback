package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class b82 extends r {
    public static final Parcelable.Creator<b82> CREATOR = new h82();
    public final String m;
    public final long n;
    public final int o;

    public b82(String str, long j, int i) {
        this.m = str;
        this.n = j;
        this.o = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.n(parcel, 1, this.m, false);
        mr0.k(parcel, 2, this.n);
        mr0.i(parcel, 3, this.o);
        mr0.b(parcel, a);
    }
}
