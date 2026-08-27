package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
/* loaded from: classes.dex */
public class s50 implements Parcelable {
    public static final Parcelable.Creator<s50> CREATOR = new a();
    public int m;
    public String n;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public s50 createFromParcel(Parcel parcel) {
            return new s50(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public s50[] newArray(int i) {
            return new s50[i];
        }
    }

    public s50() {
    }

    public s50(Parcel parcel) {
        this.m = parcel.readInt();
        this.n = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.n, ((s50) obj).n);
    }

    public int hashCode() {
        return Objects.hash(this.n);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        parcel.writeString(this.n);
    }
}
