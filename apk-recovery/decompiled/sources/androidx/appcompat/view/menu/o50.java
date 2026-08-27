package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class o50 implements Parcelable {
    public static final Parcelable.Creator<o50> CREATOR = new a();
    public int m;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public o50 createFromParcel(Parcel parcel) {
            return new o50(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public o50[] newArray(int i) {
            return new o50[i];
        }
    }

    public o50() {
        this.m = 0;
    }

    public static o50 a() {
        o50 o50Var = new o50();
        o50Var.m |= 1;
        return o50Var;
    }

    public boolean b(int i) {
        return (i & this.m) != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
    }

    public o50(Parcel parcel) {
        this.m = 0;
        this.m = parcel.readInt();
    }
}
