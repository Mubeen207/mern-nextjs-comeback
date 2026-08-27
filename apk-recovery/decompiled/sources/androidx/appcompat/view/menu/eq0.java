package androidx.appcompat.view.menu;

import android.app.ActivityManager;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class eq0 implements Parcelable {
    public static final Parcelable.Creator<eq0> CREATOR = new a();
    public final List m;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public eq0 createFromParcel(Parcel parcel) {
            return new eq0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public eq0[] newArray(int i) {
            return new eq0[i];
        }
    }

    public eq0() {
        this.m = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.m);
    }

    public eq0(Parcel parcel) {
        this.m = parcel.createTypedArrayList(ActivityManager.RunningServiceInfo.CREATOR);
    }
}
