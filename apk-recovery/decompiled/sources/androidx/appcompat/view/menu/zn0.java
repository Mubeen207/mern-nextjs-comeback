package androidx.appcompat.view.menu;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class zn0 implements Parcelable {
    public static final Parcelable.Creator<zn0> CREATOR = new a();
    public Intent m;
    public ActivityInfo n;
    public zh0 o;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public zn0 createFromParcel(Parcel parcel) {
            return new zn0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public zn0[] newArray(int i) {
            return new zn0[i];
        }
    }

    public zn0() {
    }

    public zn0(Parcel parcel) {
        this.m = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.n = (ActivityInfo) parcel.readParcelable(ActivityInfo.class.getClassLoader());
        this.o = (zh0) parcel.readParcelable(zh0.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.m, i);
        parcel.writeParcelable(this.n, i);
        parcel.writeParcelable(this.o, i);
    }
}
