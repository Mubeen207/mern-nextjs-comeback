package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.ef;
import androidx.appcompat.view.menu.fd;
import androidx.appcompat.view.menu.mr0;
import androidx.appcompat.view.menu.r;
import androidx.appcompat.view.menu.xh1;
import androidx.appcompat.view.menu.zf0;
import com.google.android.gms.common.internal.ReflectedParcelable;
/* loaded from: classes.dex */
public final class Status extends r implements ReflectedParcelable {
    public final int m;
    public final int n;
    public final String o;
    public final PendingIntent p;
    public final ef q;
    public static final Status r = new Status(-1);
    public static final Status s = new Status(0);
    public static final Status t = new Status(14);
    public static final Status u = new Status(8);
    public static final Status v = new Status(15);
    public static final Status w = new Status(16);
    public static final Status y = new Status(17);
    public static final Status x = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new xh1();

    public Status(int i, int i2, String str, PendingIntent pendingIntent, ef efVar) {
        this.m = i;
        this.n = i2;
        this.o = str;
        this.p = pendingIntent;
        this.q = efVar;
    }

    public ef d() {
        return this.q;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.m == status.m && this.n == status.n && zf0.a(this.o, status.o) && zf0.a(this.p, status.p) && zf0.a(this.q, status.q);
        }
        return false;
    }

    public int f() {
        return this.n;
    }

    public int hashCode() {
        return zf0.b(Integer.valueOf(this.m), Integer.valueOf(this.n), this.o, this.p, this.q);
    }

    public String i() {
        return this.o;
    }

    public boolean k() {
        return this.p != null;
    }

    public final String n() {
        String str = this.o;
        return str != null ? str : fd.a(this.n);
    }

    public String toString() {
        zf0.a c = zf0.c(this);
        c.a("statusCode", n());
        c.a("resolution", this.p);
        return c.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.i(parcel, 1, f());
        mr0.n(parcel, 2, i(), false);
        mr0.m(parcel, 3, this.p, i, false);
        mr0.m(parcel, 4, d(), i, false);
        mr0.i(parcel, 1000, this.m);
        mr0.b(parcel, a);
    }

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(int i, String str) {
        this(1, i, str, null, null);
    }

    public Status(ef efVar, String str) {
        this(efVar, str, 17);
    }

    public Status(ef efVar, String str, int i) {
        this(1, i, str, efVar.i(), efVar);
    }
}
