package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.zf0;
/* loaded from: classes.dex */
public class mr extends r {
    public static final Parcelable.Creator<mr> CREATOR = new lk1();
    public final String m;
    public final int n;
    public final long o;

    public mr(String str, int i, long j) {
        this.m = str;
        this.n = i;
        this.o = j;
    }

    public String d() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mr) {
            mr mrVar = (mr) obj;
            if (((d() != null && d().equals(mrVar.d())) || (d() == null && mrVar.d() == null)) && f() == mrVar.f()) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        long j = this.o;
        return j == -1 ? this.n : j;
    }

    public final int hashCode() {
        return zf0.b(d(), Long.valueOf(f()));
    }

    public final String toString() {
        zf0.a c = zf0.c(this);
        c.a("name", d());
        c.a("version", Long.valueOf(f()));
        return c.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.n(parcel, 1, d(), false);
        mr0.i(parcel, 2, this.n);
        mr0.k(parcel, 3, f());
        mr0.b(parcel, a);
    }

    public mr(String str, long j) {
        this.m = str;
        this.o = j;
        this.n = -1;
    }
}
