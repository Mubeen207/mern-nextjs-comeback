package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes.dex */
public final class ed1 extends r {
    public static final Parcelable.Creator<ed1> CREATOR = new hd1();
    public final List m;
    public final String n;

    public ed1(List list, String str) {
        this.m = list;
        this.n = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.o(parcel, 1, this.m, false);
        mr0.n(parcel, 2, this.n, false);
        mr0.b(parcel, a);
    }
}
