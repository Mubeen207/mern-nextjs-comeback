package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class ri1 extends r {
    public static final Parcelable.Creator<ri1> CREATOR = new pi1();
    public final String m;
    public final hi1 n;
    public final String o;
    public final long p;

    public ri1(ri1 ri1Var, long j) {
        pj0.i(ri1Var);
        this.m = ri1Var.m;
        this.n = ri1Var.n;
        this.o = ri1Var.o;
        this.p = j;
    }

    public final String toString() {
        String str = this.o;
        String str2 = this.m;
        String valueOf = String.valueOf(this.n);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.n(parcel, 2, this.m, false);
        mr0.m(parcel, 3, this.n, i, false);
        mr0.n(parcel, 4, this.o, false);
        mr0.k(parcel, 5, this.p);
        mr0.b(parcel, a);
    }

    public ri1(String str, hi1 hi1Var, String str2, long j) {
        this.m = str;
        this.n = hi1Var;
        this.o = str2;
        this.p = j;
    }
}
