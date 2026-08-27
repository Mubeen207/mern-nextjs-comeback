package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class kg1 extends r {
    public static final Parcelable.Creator<kg1> CREATOR = new ig1();
    public final Bundle m;

    public kg1(Bundle bundle) {
        this.m = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.e(parcel, 1, this.m, false);
        mr0.b(parcel, a);
    }
}
