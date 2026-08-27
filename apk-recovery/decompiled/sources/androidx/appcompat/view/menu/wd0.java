package androidx.appcompat.view.menu;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* loaded from: classes.dex */
public final class wd0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<wd0> CREATOR = new a();
    public final Calendar m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final long r;
    public String s;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public wd0 createFromParcel(Parcel parcel) {
            return wd0.e(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public wd0[] newArray(int i) {
            return new wd0[i];
        }
    }

    public wd0(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c = t41.c(calendar);
        this.m = c;
        this.n = c.get(2);
        this.o = c.get(1);
        this.p = c.getMaximum(7);
        this.q = c.getActualMaximum(5);
        this.r = c.getTimeInMillis();
    }

    public static wd0 e(int i, int i2) {
        Calendar i3 = t41.i();
        i3.set(1, i);
        i3.set(2, i2);
        return new wd0(i3);
    }

    public static wd0 i(long j) {
        Calendar i = t41.i();
        i.setTimeInMillis(j);
        return new wd0(i);
    }

    public static wd0 j() {
        return new wd0(t41.g());
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(wd0 wd0Var) {
        return this.m.compareTo(wd0Var.m);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wd0) {
            wd0 wd0Var = (wd0) obj;
            return this.n == wd0Var.n && this.o == wd0Var.o;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.n), Integer.valueOf(this.o)});
    }

    public int k(int i) {
        int i2 = this.m.get(7);
        if (i <= 0) {
            i = this.m.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + this.p : i3;
    }

    public long l(int i) {
        Calendar c = t41.c(this.m);
        c.set(5, i);
        return c.getTimeInMillis();
    }

    public int m(long j) {
        Calendar c = t41.c(this.m);
        c.setTimeInMillis(j);
        return c.get(5);
    }

    public String n() {
        if (this.s == null) {
            this.s = zi.f(this.m.getTimeInMillis());
        }
        return this.s;
    }

    public long o() {
        return this.m.getTimeInMillis();
    }

    public wd0 p(int i) {
        Calendar c = t41.c(this.m);
        c.add(2, i);
        return new wd0(c);
    }

    public int q(wd0 wd0Var) {
        if (this.m instanceof GregorianCalendar) {
            return ((wd0Var.o - this.o) * 12) + (wd0Var.n - this.n);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.o);
        parcel.writeInt(this.n);
    }
}
