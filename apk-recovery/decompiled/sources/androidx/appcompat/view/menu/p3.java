package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class p3 implements Parcelable {
    public static final Parcelable.Creator<p3> CREATOR = new a();
    public String m;
    public String n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public IBinder t;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public p3 createFromParcel(Parcel parcel) {
            return new p3(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public p3[] newArray(int i) {
            return new p3[i];
        }
    }

    public p3() {
    }

    public p3(Parcel parcel) {
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readStrongBinder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeStrongBinder(this.t);
    }
}
