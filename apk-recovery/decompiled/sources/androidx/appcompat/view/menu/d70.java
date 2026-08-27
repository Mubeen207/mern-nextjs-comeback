package androidx.appcompat.view.menu;

import android.app.job.JobInfo;
import android.app.job.JobService;
import android.content.pm.ServiceInfo;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class d70 implements Parcelable {
    public static final Parcelable.Creator<d70> CREATOR = new a();
    public JobInfo m;
    public ServiceInfo n;
    public JobService o;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public d70 createFromParcel(Parcel parcel) {
            return new d70(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public d70[] newArray(int i) {
            return new d70[i];
        }
    }

    public d70() {
    }

    public d70(Parcel parcel) {
        this.m = (JobInfo) parcel.readParcelable(JobInfo.class.getClassLoader());
        this.n = (ServiceInfo) parcel.readParcelable(ServiceInfo.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.m, i);
        parcel.writeParcelable(this.n, i);
    }
}
