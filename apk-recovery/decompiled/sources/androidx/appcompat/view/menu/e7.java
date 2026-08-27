package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class e7 implements Parcelable {
    public static final Parcelable.Creator<e7> CREATOR = new a();
    public int m;
    public g7 n;
    public String o;
    public long p;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e7 createFromParcel(Parcel parcel) {
            return new e7(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public e7[] newArray(int i) {
            return new e7[i];
        }
    }

    public e7() {
    }

    public e7(Parcel parcel) {
        this.m = parcel.readInt();
        int readInt = parcel.readInt();
        this.n = readInt == -1 ? null : g7.values()[readInt];
        this.o = parcel.readString();
        this.p = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "BUserInfo{id=" + this.m + ", status=" + this.n + ", name='" + this.o + "', createTime=" + this.p + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        g7 g7Var = this.n;
        parcel.writeInt(g7Var == null ? -1 : g7Var.ordinal());
        parcel.writeString(this.o);
        parcel.writeLong(this.p);
    }
}
