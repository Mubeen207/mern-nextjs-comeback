package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* loaded from: classes.dex */
public class p7 implements Parcelable {
    public static final Parcelable.Creator<p7> CREATOR = new a();
    public final List m;
    public final List n;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public p7 createFromParcel(Parcel parcel) {
            return new p7(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public p7[] newArray(int i) {
            return new p7[i];
        }
    }

    public p7(Parcel parcel) {
        this.m = parcel.createStringArrayList();
        this.n = parcel.createTypedArrayList(o7.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.m);
        parcel.writeTypedList(this.n);
    }
}
