package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class n6 implements Parcelable {
    public static final Parcelable.Creator<n6> CREATOR = new a();
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public n6 createFromParcel(Parcel parcel) {
            return new n6(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public n6[] newArray(int i) {
            return new n6[i];
        }
    }

    public n6(Parcel parcel) {
        this.m = parcel.readInt();
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
    }
}
