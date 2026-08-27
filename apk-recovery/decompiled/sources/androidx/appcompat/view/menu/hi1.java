package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class hi1 extends r implements Iterable {
    public static final Parcelable.Creator<hi1> CREATOR = new li1();
    public final Bundle m;

    public hi1(Bundle bundle) {
        this.m = bundle;
    }

    public final int d() {
        return this.m.size();
    }

    public final Double i(String str) {
        return Double.valueOf(this.m.getDouble(str));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ni1(this);
    }

    public final Bundle k() {
        return new Bundle(this.m);
    }

    public final Long n(String str) {
        return Long.valueOf(this.m.getLong(str));
    }

    public final Object p(String str) {
        return this.m.get(str);
    }

    public final String r(String str) {
        return this.m.getString(str);
    }

    public final String toString() {
        return this.m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.e(parcel, 2, k(), false);
        mr0.b(parcel, a);
    }
}
