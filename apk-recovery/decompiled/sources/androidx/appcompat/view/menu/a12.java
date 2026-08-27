package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class a12 extends r {
    public static final Parcelable.Creator<a12> CREATOR = new b32();
    public Bundle m;
    public mr[] n;
    public int o;
    public ff p;

    public a12(Bundle bundle, mr[] mrVarArr, int i, ff ffVar) {
        this.m = bundle;
        this.n = mrVarArr;
        this.o = i;
        this.p = ffVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.e(parcel, 1, this.m, false);
        mr0.p(parcel, 2, this.n, i, false);
        mr0.i(parcel, 3, this.o);
        mr0.m(parcel, 4, this.p, i, false);
        mr0.b(parcel, a);
    }
}
