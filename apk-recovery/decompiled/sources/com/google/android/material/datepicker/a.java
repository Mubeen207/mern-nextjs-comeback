package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.bg0;
import androidx.appcompat.view.menu.t41;
import androidx.appcompat.view.menu.wd0;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0062a();
    public final wd0 m;
    public final wd0 n;
    public final c o;
    public wd0 p;
    public final int q;
    public final int r;
    public final int s;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0062a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a((wd0) parcel.readParcelable(wd0.class.getClassLoader()), (wd0) parcel.readParcelable(wd0.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (wd0) parcel.readParcelable(wd0.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static final long f = t41.a(wd0.e(1900, 0).r);
        public static final long g = t41.a(wd0.e(2100, 11).r);
        public long a;
        public long b;
        public Long c;
        public int d;
        public c e;

        public b(a aVar) {
            this.a = f;
            this.b = g;
            this.e = com.google.android.material.datepicker.b.a(Long.MIN_VALUE);
            this.a = aVar.m.r;
            this.b = aVar.n.r;
            this.c = Long.valueOf(aVar.p.r);
            this.d = aVar.q;
            this.e = aVar.o;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.e);
            wd0 i = wd0.i(this.a);
            wd0 i2 = wd0.i(this.b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.c;
            return new a(i, i2, cVar, l == null ? null : wd0.i(l.longValue()), this.d, null);
        }

        public b b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface c extends Parcelable {
        boolean g(long j);
    }

    public /* synthetic */ a(wd0 wd0Var, wd0 wd0Var2, c cVar, wd0 wd0Var3, int i, C0062a c0062a) {
        this(wd0Var, wd0Var2, cVar, wd0Var3, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.m.equals(aVar.m) && this.n.equals(aVar.n) && bg0.a(this.p, aVar.p) && this.q == aVar.q && this.o.equals(aVar.o);
        }
        return false;
    }

    public c f() {
        return this.o;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.m, this.n, this.p, Integer.valueOf(this.q), this.o});
    }

    public wd0 i() {
        return this.n;
    }

    public int j() {
        return this.q;
    }

    public int k() {
        return this.s;
    }

    public wd0 l() {
        return this.p;
    }

    public wd0 m() {
        return this.m;
    }

    public int n() {
        return this.r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.m, 0);
        parcel.writeParcelable(this.n, 0);
        parcel.writeParcelable(this.p, 0);
        parcel.writeParcelable(this.o, 0);
        parcel.writeInt(this.q);
    }

    public a(wd0 wd0Var, wd0 wd0Var2, c cVar, wd0 wd0Var3, int i) {
        Objects.requireNonNull(wd0Var, "start cannot be null");
        Objects.requireNonNull(wd0Var2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.m = wd0Var;
        this.n = wd0Var2;
        this.p = wd0Var3;
        this.q = i;
        this.o = cVar;
        if (wd0Var3 != null && wd0Var.compareTo(wd0Var3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (wd0Var3 != null && wd0Var3.compareTo(wd0Var2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i >= 0 && i <= t41.i().getMaximum(7)) {
            this.s = wd0Var.q(wd0Var2) + 1;
            this.r = (wd0Var2.o - wd0Var.o) + 1;
            return;
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }
}
