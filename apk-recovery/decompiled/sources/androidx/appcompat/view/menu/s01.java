package androidx.appcompat.view.menu;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public class s01 implements Parcelable {
    public static final Parcelable.Creator<s01> CREATOR = new a();
    public final yb0 m;
    public final yb0 n;
    public final int o;
    public int p;
    public int q;
    public int r;
    public int s;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public s01 createFromParcel(Parcel parcel) {
            return new s01(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public s01[] newArray(int i) {
            return new s01[i];
        }
    }

    public s01(int i, int i2, int i3, int i4) {
        this.p = i;
        this.q = i2;
        this.r = i3;
        this.o = i4;
        this.s = c(i);
        this.m = new yb0(59);
        this.n = new yb0(i4 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static int c(int i) {
        return i >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s01) {
            s01 s01Var = (s01) obj;
            return this.p == s01Var.p && this.q == s01Var.q && this.o == s01Var.o && this.r == s01Var.r;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(this.q), Integer.valueOf(this.r)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.o);
    }

    public s01(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
