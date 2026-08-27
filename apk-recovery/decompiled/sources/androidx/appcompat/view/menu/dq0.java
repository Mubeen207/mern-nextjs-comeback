package androidx.appcompat.view.menu;

import android.app.ActivityManager;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class dq0 implements Parcelable {
    public static final Parcelable.Creator<dq0> CREATOR = new a();
    public final List m;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public dq0 createFromParcel(Parcel parcel) {
            return new dq0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public dq0[] newArray(int i) {
            return new dq0[i];
        }
    }

    public dq0() {
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

    public dq0(Parcel parcel) {
        this.m = parcel.createTypedArrayList(ActivityManager.RunningAppProcessInfo.CREATOR);
    }
}
