package androidx.appcompat.view.menu;

import android.content.pm.PackageParser;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class xv implements Parcelable {
    public static final Parcelable.Creator<xv> CREATOR = new a();
    public final String m;
    public final String n;
    public final boolean o;
    public final int p;
    public final int q;
    public final String r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final int w;
    public final String x;
    public final int y;
    public final boolean z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public xv createFromParcel(Parcel parcel) {
            return new xv(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public xv[] newArray(int i) {
            return new xv[i];
        }
    }

    public xv(fv fvVar) {
        this.m = fvVar.getClass().getName();
        this.n = fvVar.e;
        this.o = fvVar.o;
        this.p = fvVar.w;
        this.q = fvVar.x;
        this.r = fvVar.y;
        this.s = fvVar.B;
        this.t = fvVar.l;
        this.u = fvVar.A;
        this.v = fvVar.z;
        this.w = fvVar.Q.ordinal();
        this.x = fvVar.h;
        this.y = fvVar.i;
        this.z = fvVar.J;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) PackageParser.PARSE_IS_PRIVILEGED);
        sb.append("FragmentState{");
        sb.append(this.m);
        sb.append(" (");
        sb.append(this.n);
        sb.append(")}:");
        if (this.o) {
            sb.append(" fromLayout");
        }
        if (this.q != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.q));
        }
        String str = this.r;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.r);
        }
        if (this.s) {
            sb.append(" retainInstance");
        }
        if (this.t) {
            sb.append(" removing");
        }
        if (this.u) {
            sb.append(" detached");
        }
        if (this.v) {
            sb.append(" hidden");
        }
        if (this.x != null) {
            sb.append(" targetWho=");
            sb.append(this.x);
            sb.append(" targetRequestCode=");
            sb.append(this.y);
        }
        if (this.z) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeString(this.r);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w);
        parcel.writeString(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z ? 1 : 0);
    }

    public xv(Parcel parcel) {
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.o = parcel.readInt() != 0;
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readString();
        this.s = parcel.readInt() != 0;
        this.t = parcel.readInt() != 0;
        this.u = parcel.readInt() != 0;
        this.v = parcel.readInt() != 0;
        this.w = parcel.readInt();
        this.x = parcel.readString();
        this.y = parcel.readInt();
        this.z = parcel.readInt() != 0;
    }
}
