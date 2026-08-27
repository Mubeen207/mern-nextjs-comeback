package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.rv;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class tv implements Parcelable {
    public static final Parcelable.Creator<tv> CREATOR = new a();
    public ArrayList m;
    public ArrayList n;
    public o7[] o;
    public int p;
    public String q;
    public ArrayList r;
    public ArrayList s;
    public ArrayList t;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public tv createFromParcel(Parcel parcel) {
            return new tv(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public tv[] newArray(int i) {
            return new tv[i];
        }
    }

    public tv() {
        this.q = null;
        this.r = new ArrayList();
        this.s = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeTypedArray(this.o, i);
        parcel.writeInt(this.p);
        parcel.writeString(this.q);
        parcel.writeStringList(this.r);
        parcel.writeTypedList(this.s);
        parcel.writeTypedList(this.t);
    }

    public tv(Parcel parcel) {
        this.q = null;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = (o7[]) parcel.createTypedArray(o7.CREATOR);
        this.p = parcel.readInt();
        this.q = parcel.readString();
        this.r = parcel.createStringArrayList();
        this.s = parcel.createTypedArrayList(p7.CREATOR);
        this.t = parcel.createTypedArrayList(rv.g.CREATOR);
    }
}
