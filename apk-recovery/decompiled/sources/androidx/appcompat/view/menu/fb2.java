package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
/* loaded from: classes.dex */
public final class fb2 extends r {
    public static final Parcelable.Creator<fb2> CREATOR = new td2();
    public final boolean A;
    public final boolean B;
    public final String C;
    public final Boolean D;
    public final long E;
    public final List F;
    public final String G;
    public final String H;
    public final String I;
    public final String J;
    public final boolean K;
    public final long L;
    public final int M;
    public final String N;
    public final int O;
    public final long P;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final long q;
    public final long r;
    public final String s;
    public final boolean t;
    public final boolean u;
    public final long v;
    public final String w;
    public final long x;
    public final long y;
    public final int z;

    public fb2(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11, boolean z5, long j7, int i2, String str12, int i3, long j8) {
        pj0.e(str);
        this.m = str;
        this.n = TextUtils.isEmpty(str2) ? null : str2;
        this.o = str3;
        this.v = j;
        this.p = str4;
        this.q = j2;
        this.r = j3;
        this.s = str5;
        this.t = z;
        this.u = z2;
        this.w = str6;
        this.x = j4;
        this.y = j5;
        this.z = i;
        this.A = z3;
        this.B = z4;
        this.C = str7;
        this.D = bool;
        this.E = j6;
        this.F = list;
        this.G = null;
        this.H = str9;
        this.I = str10;
        this.J = str11;
        this.K = z5;
        this.L = j7;
        this.M = i2;
        this.N = str12;
        this.O = i3;
        this.P = j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.n(parcel, 2, this.m, false);
        mr0.n(parcel, 3, this.n, false);
        mr0.n(parcel, 4, this.o, false);
        mr0.n(parcel, 5, this.p, false);
        mr0.k(parcel, 6, this.q);
        mr0.k(parcel, 7, this.r);
        mr0.n(parcel, 8, this.s, false);
        mr0.c(parcel, 9, this.t);
        mr0.c(parcel, 10, this.u);
        mr0.k(parcel, 11, this.v);
        mr0.n(parcel, 12, this.w, false);
        mr0.k(parcel, 13, this.x);
        mr0.k(parcel, 14, this.y);
        mr0.i(parcel, 15, this.z);
        mr0.c(parcel, 16, this.A);
        mr0.c(parcel, 18, this.B);
        mr0.n(parcel, 19, this.C, false);
        mr0.d(parcel, 21, this.D, false);
        mr0.k(parcel, 22, this.E);
        mr0.o(parcel, 23, this.F, false);
        mr0.n(parcel, 24, this.G, false);
        mr0.n(parcel, 25, this.H, false);
        mr0.n(parcel, 26, this.I, false);
        mr0.n(parcel, 27, this.J, false);
        mr0.c(parcel, 28, this.K);
        mr0.k(parcel, 29, this.L);
        mr0.i(parcel, 30, this.M);
        mr0.n(parcel, 31, this.N, false);
        mr0.i(parcel, 32, this.O);
        mr0.k(parcel, 34, this.P);
        mr0.b(parcel, a);
    }

    public fb2(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11, boolean z5, long j7, int i2, String str12, int i3, long j8) {
        this.m = str;
        this.n = str2;
        this.o = str3;
        this.v = j3;
        this.p = str4;
        this.q = j;
        this.r = j2;
        this.s = str5;
        this.t = z;
        this.u = z2;
        this.w = str6;
        this.x = j4;
        this.y = j5;
        this.z = i;
        this.A = z3;
        this.B = z4;
        this.C = str7;
        this.D = bool;
        this.E = j6;
        this.F = list;
        this.G = str8;
        this.H = str9;
        this.I = str10;
        this.J = str11;
        this.K = z5;
        this.L = j7;
        this.M = i2;
        this.N = str12;
        this.O = i3;
        this.P = j8;
    }
}
