package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes.dex */
public class q6 implements Parcelable {
    public static final Parcelable.Creator<q6> CREATOR = new a();
    public int m;
    public n6 n;
    public List o;
    public List p;
    public p6 q;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public q6 createFromParcel(Parcel parcel) {
            return new q6(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public q6[] newArray(int i) {
            return new q6[i];
        }
    }

    public q6() {
    }

    public q6(Parcel parcel) {
        a(parcel);
    }

    public void a(Parcel parcel) {
        this.m = parcel.readInt();
        this.n = (n6) parcel.readParcelable(n6.class.getClassLoader());
        Parcelable.Creator<n6> creator = n6.CREATOR;
        this.o = parcel.createTypedArrayList(creator);
        this.p = parcel.createTypedArrayList(creator);
        this.q = (p6) parcel.readParcelable(p6.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        parcel.writeParcelable(this.n, i);
        parcel.writeTypedList(this.o);
        parcel.writeTypedList(this.p);
        parcel.writeParcelable(this.q, i);
    }
}
