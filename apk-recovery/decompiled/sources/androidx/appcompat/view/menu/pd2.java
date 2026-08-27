package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class pd2 extends r {
    public static final Parcelable.Creator<pd2> CREATOR = new ke2();
    public final boolean m;
    public final String n;
    public final int o;
    public final int p;

    public pd2(boolean z, String str, int i, int i2) {
        this.m = z;
        this.n = str;
        this.o = xf2.a(i) - 1;
        this.p = vm1.a(i2) - 1;
    }

    public final String d() {
        return this.n;
    }

    public final boolean f() {
        return this.m;
    }

    public final int i() {
        return vm1.a(this.p);
    }

    public final int k() {
        return xf2.a(this.o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.c(parcel, 1, this.m);
        mr0.n(parcel, 2, this.n, false);
        mr0.i(parcel, 3, this.o);
        mr0.i(parcel, 4, this.p);
        mr0.b(parcel, a);
    }
}
