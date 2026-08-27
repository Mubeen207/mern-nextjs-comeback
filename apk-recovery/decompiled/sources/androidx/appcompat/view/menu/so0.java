package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class so0 extends r {
    public static final Parcelable.Creator<so0> CREATOR = new to0();
    public Bundle m;

    public so0(Bundle bundle) {
        this.m = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        to0.c(this, parcel, i);
    }
}
