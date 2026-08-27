package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class d7 implements Parcelable {
    public final int m;
    public static final d7 n = new d7(-1);
    public static final d7 o = new d7(-2);
    public static final d7 p = new d7(0);
    public static final d7 q = new d7(0);
    public static final Parcelable.Creator<d7> CREATOR = new a();

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public d7 createFromParcel(Parcel parcel) {
            return new d7(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public d7[] newArray(int i) {
            return new d7[i];
        }
    }

    public d7(int i) {
        this.m = i;
    }

    public static int a(int i) {
        return i % 100000;
    }

    public static int b(int i, int i2) {
        return (i * 100000) + (i2 % 100000);
    }

    public static int c(int i) {
        return i / 100000;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        try {
            if (obj instanceof d7) {
                return this.m == ((d7) obj).m;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return this.m;
    }

    public String toString() {
        return "UserHandle{" + this.m + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
    }

    public d7(Parcel parcel) {
        this.m = parcel.readInt();
    }
}
