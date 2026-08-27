package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.g20;
/* loaded from: classes.dex */
public final class cb2 extends r {
    public static final Parcelable.Creator<cb2> CREATOR = new ic2();
    public final String m;
    public final boolean n;
    public final boolean o;
    public final Context p;
    public final boolean q;

    public cb2(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.m = str;
        this.n = z;
        this.o = z2;
        this.p = (Context) yf0.j(g20.a.asInterface(iBinder));
        this.q = z3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.appcompat.view.menu.g20, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.n(parcel, 1, this.m, false);
        mr0.c(parcel, 2, this.n);
        mr0.c(parcel, 3, this.o);
        mr0.h(parcel, 4, yf0.k(this.p), false);
        mr0.c(parcel, 5, this.q);
        mr0.b(parcel, a);
    }
}
