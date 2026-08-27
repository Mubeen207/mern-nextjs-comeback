package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class z6 implements Parcelable {
    public static final Parcelable.Creator<z6> CREATOR = new a();
    public boolean m;
    public final boolean n;
    public final boolean o;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public z6 createFromParcel(Parcel parcel) {
            return new z6(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public z6[] newArray(int i) {
            return new z6[i];
        }
    }

    public z6() {
        this.m = false;
        this.n = true;
        this.o = false;
    }

    public static z6 a() {
        z6 z6Var = new z6();
        z6Var.m = true;
        return z6Var;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
    }

    public z6(Parcel parcel) {
        this.m = parcel.readByte() != 0;
        this.n = parcel.readByte() != 0;
        this.o = parcel.readByte() != 0;
    }

    public z6(z6 z6Var) {
        this.m = z6Var.m;
        this.n = z6Var.n;
        this.o = z6Var.o;
    }
}
