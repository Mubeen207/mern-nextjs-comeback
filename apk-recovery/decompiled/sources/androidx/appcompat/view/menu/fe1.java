package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.rz;
/* loaded from: classes.dex */
public final class fe1 extends r {
    public static final Parcelable.Creator<fe1> CREATOR = new ge1();
    public final int m;
    public final IBinder n;
    public final ef o;
    public final boolean p;
    public final boolean q;

    public fe1(int i, IBinder iBinder, ef efVar, boolean z, boolean z2) {
        this.m = i;
        this.n = iBinder;
        this.o = efVar;
        this.p = z;
        this.q = z2;
    }

    public final ef d() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof fe1) {
            fe1 fe1Var = (fe1) obj;
            return this.o.equals(fe1Var.o) && zf0.a(f(), fe1Var.f());
        }
        return false;
    }

    public final rz f() {
        IBinder iBinder = this.n;
        if (iBinder == null) {
            return null;
        }
        return rz.a.asInterface(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.i(parcel, 1, this.m);
        mr0.h(parcel, 2, this.n, false);
        mr0.m(parcel, 3, this.o, i, false);
        mr0.c(parcel, 4, this.p);
        mr0.c(parcel, 5, this.q);
        mr0.b(parcel, a);
    }
}
