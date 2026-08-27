package androidx.appcompat.view.menu;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.t8;
import java.util.UUID;
/* loaded from: classes.dex */
public class zh0 implements Parcelable {
    public static final Parcelable.Creator<zh0> CREATOR = new a();
    public final int m;
    public final boolean n;
    public final boolean o;
    public final IBinder p;
    public final int q;
    public int r;
    public int s;
    public final String t;
    public final Bundle u;
    public final boolean v;
    public final boolean w;
    public final String x;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public zh0 createFromParcel(Parcel parcel) {
            return new zh0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public zh0[] newArray(int i) {
            return new zh0[i];
        }
    }

    public zh0(BroadcastReceiver.PendingResult pendingResult) {
        this.x = UUID.randomUUID().toString();
        if (y8.b()) {
            this.m = ((Integer) t8.b.l.c(pendingResult)).intValue();
            this.n = ((Boolean) t8.b.g.c(pendingResult)).booleanValue();
            this.o = ((Boolean) t8.b.f.c(pendingResult)).booleanValue();
            this.p = (IBinder) t8.b.k.c(pendingResult);
            this.q = ((Integer) t8.b.j.c(pendingResult)).intValue();
            this.r = ((Integer) t8.b.e.c(pendingResult)).intValue();
            this.t = (String) t8.b.h.c(pendingResult);
            this.u = (Bundle) t8.b.i.c(pendingResult);
            this.v = ((Boolean) t8.b.c.c(pendingResult)).booleanValue();
            this.w = ((Boolean) t8.b.d.c(pendingResult)).booleanValue();
            return;
        }
        this.m = ((Integer) t8.a.k.c(pendingResult)).intValue();
        this.n = ((Boolean) t8.a.f.c(pendingResult)).booleanValue();
        this.o = ((Boolean) t8.a.e.c(pendingResult)).booleanValue();
        this.p = (IBinder) t8.a.j.c(pendingResult);
        this.q = ((Integer) t8.a.i.c(pendingResult)).intValue();
        this.t = (String) t8.a.g.c(pendingResult);
        this.u = (Bundle) t8.a.h.c(pendingResult);
        this.v = ((Boolean) t8.a.c.c(pendingResult)).booleanValue();
        this.w = ((Boolean) t8.a.d.c(pendingResult)).booleanValue();
    }

    public BroadcastReceiver.PendingResult a() {
        return y8.b() ? (BroadcastReceiver.PendingResult) t8.b.b.b(Integer.valueOf(this.s), this.t, this.u, Integer.valueOf(this.m), Boolean.valueOf(this.n), Boolean.valueOf(this.o), this.p, Integer.valueOf(this.q), Integer.valueOf(this.r)) : (BroadcastReceiver.PendingResult) t8.a.b.b(Integer.valueOf(this.s), this.t, this.u, Integer.valueOf(this.m), Boolean.valueOf(this.n), Boolean.valueOf(this.o), this.p, Integer.valueOf(this.q));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PendingResultData{mType=" + this.m + ", mOrderedHint=" + this.n + ", mInitialStickyHint=" + this.o + ", mToken=" + this.p + ", mSendingUser=" + this.q + ", mFlags=" + this.r + ", mResultCode=" + this.s + ", mResultData='" + this.t + "', mResultExtras=" + this.u + ", mAbortBroadcast=" + this.v + ", mFinished=" + this.w + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
        parcel.writeStrongBinder(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeString(this.t);
        parcel.writeBundle(this.u);
        parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.w ? (byte) 1 : (byte) 0);
        parcel.writeString(this.x);
    }

    public zh0(Parcel parcel) {
        this.m = parcel.readInt();
        this.n = parcel.readByte() != 0;
        this.o = parcel.readByte() != 0;
        this.p = parcel.readStrongBinder();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readString();
        this.u = parcel.readBundle();
        this.v = parcel.readByte() != 0;
        this.w = parcel.readByte() != 0;
        this.x = parcel.readString();
    }
}
