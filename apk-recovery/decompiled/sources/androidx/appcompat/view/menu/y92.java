package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class y92 extends r {
    public static final Parcelable.Creator<y92> CREATOR = new w92();
    public final int m;
    public final String n;
    public final long o;
    public final Long p;
    public final Float q;
    public final String r;
    public final String s;
    public final Double t;

    public y92(ca2 ca2Var) {
        this(ca2Var.c, ca2Var.d, ca2Var.e, ca2Var.b);
    }

    public final Object d() {
        Long l = this.p;
        if (l != null) {
            return l;
        }
        Double d = this.t;
        if (d != null) {
            return d;
        }
        String str = this.r;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.i(parcel, 1, this.m);
        mr0.n(parcel, 2, this.n, false);
        mr0.k(parcel, 3, this.o);
        mr0.l(parcel, 4, this.p, false);
        mr0.g(parcel, 5, null, false);
        mr0.n(parcel, 6, this.r, false);
        mr0.n(parcel, 7, this.s, false);
        mr0.f(parcel, 8, this.t, false);
        mr0.b(parcel, a);
    }

    public y92(String str, long j, Object obj, String str2) {
        pj0.e(str);
        this.m = 2;
        this.n = str;
        this.o = j;
        this.s = str2;
        if (obj == null) {
            this.p = null;
            this.q = null;
            this.t = null;
            this.r = null;
        } else if (obj instanceof Long) {
            this.p = (Long) obj;
            this.q = null;
            this.t = null;
            this.r = null;
        } else if (obj instanceof String) {
            this.p = null;
            this.q = null;
            this.t = null;
            this.r = (String) obj;
        } else if (obj instanceof Double) {
            this.p = null;
            this.q = null;
            this.t = (Double) obj;
            this.r = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public y92(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.m = i;
        this.n = str;
        this.o = j;
        this.p = l;
        this.q = null;
        if (i == 1) {
            this.t = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.t = d;
        }
        this.r = str2;
        this.s = str3;
    }
}
