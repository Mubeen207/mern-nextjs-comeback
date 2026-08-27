package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class lf1 extends r {
    public static final Parcelable.Creator<lf1> CREATOR = new wf1();
    public String m;
    public String n;
    public y92 o;
    public long p;
    public boolean q;
    public String r;
    public ri1 s;
    public long t;
    public ri1 u;
    public long v;
    public ri1 w;

    public lf1(lf1 lf1Var) {
        pj0.i(lf1Var);
        this.m = lf1Var.m;
        this.n = lf1Var.n;
        this.o = lf1Var.o;
        this.p = lf1Var.p;
        this.q = lf1Var.q;
        this.r = lf1Var.r;
        this.s = lf1Var.s;
        this.t = lf1Var.t;
        this.u = lf1Var.u;
        this.v = lf1Var.v;
        this.w = lf1Var.w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.n(parcel, 2, this.m, false);
        mr0.n(parcel, 3, this.n, false);
        mr0.m(parcel, 4, this.o, i, false);
        mr0.k(parcel, 5, this.p);
        mr0.c(parcel, 6, this.q);
        mr0.n(parcel, 7, this.r, false);
        mr0.m(parcel, 8, this.s, i, false);
        mr0.k(parcel, 9, this.t);
        mr0.m(parcel, 10, this.u, i, false);
        mr0.k(parcel, 11, this.v);
        mr0.m(parcel, 12, this.w, i, false);
        mr0.b(parcel, a);
    }

    public lf1(String str, String str2, y92 y92Var, long j, boolean z, String str3, ri1 ri1Var, long j2, ri1 ri1Var2, long j3, ri1 ri1Var3) {
        this.m = str;
        this.n = str2;
        this.o = y92Var;
        this.p = j;
        this.q = z;
        this.r = str3;
        this.s = ri1Var;
        this.t = j2;
        this.u = ri1Var2;
        this.v = j3;
        this.w = ri1Var3;
    }
}
