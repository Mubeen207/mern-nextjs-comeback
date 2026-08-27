package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class l31 implements Parcelable {
    public static final Parcelable.Creator<l31> CREATOR = new a();
    public int m;
    public int n;
    public ComponentName o;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public l31 createFromParcel(Parcel parcel) {
            return new l31(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public l31[] newArray(int i) {
            return new l31[i];
        }
    }

    public l31() {
    }

    public l31(Parcel parcel) {
        this.m = parcel.readInt();
        this.n = parcel.readInt();
        this.o = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
    }

    public int a() {
        return this.n;
    }

    public void b(int i) {
        this.m = i;
    }

    public void c(ComponentName componentName) {
        this.o = componentName;
    }

    public void d(int i) {
        this.n = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeParcelable(this.o, i);
    }
}
