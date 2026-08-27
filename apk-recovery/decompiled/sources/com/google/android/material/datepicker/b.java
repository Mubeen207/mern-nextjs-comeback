package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;
/* loaded from: classes.dex */
public class b implements a.c {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final long m;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public /* synthetic */ b(long j, a aVar) {
        this(j);
    }

    public static b a(long j) {
        return new b(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.m == ((b) obj).m;
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean g(long j) {
        return j >= this.m;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.m)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.m);
    }

    public b(long j) {
        this.m = j;
    }
}
