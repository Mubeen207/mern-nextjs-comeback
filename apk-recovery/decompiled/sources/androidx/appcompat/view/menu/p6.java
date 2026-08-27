package androidx.appcompat.view.menu;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class p6 implements Parcelable {
    public static final Parcelable.Creator<p6> CREATOR = new a();
    public double m;
    public double n;
    public double o;
    public float p;
    public float q;
    public float r;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public p6 createFromParcel(Parcel parcel) {
            return new p6(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public p6[] newArray(int i) {
            return new p6[i];
        }
    }

    public p6(Parcel parcel) {
        this.m = 0.0d;
        this.n = 0.0d;
        this.o = 0.0d;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = 0.0f;
        this.m = parcel.readDouble();
        this.n = parcel.readDouble();
        this.o = parcel.readDouble();
        this.r = parcel.readFloat();
        this.p = parcel.readFloat();
        this.q = parcel.readFloat();
    }

    public static String a(String str) {
        String substring = str.startsWith("$") ? str.substring(1) : str;
        int i = 0;
        for (int i2 = 0; i2 < substring.length(); i2++) {
            i ^= (byte) substring.charAt(i2);
        }
        return str + "*" + String.format("%02X", Integer.valueOf(i)).toLowerCase();
    }

    public static String c(double d) {
        int i = (int) d;
        double d2 = (d - i) * 60.0d;
        return i + j((int) d2) + ":" + String.valueOf(d2).substring(2);
    }

    public static String f(p6 p6Var) {
        return p6Var.m > 0.0d ? "N" : "S";
    }

    public static String i(p6 p6Var) {
        return p6Var.n > 0.0d ? "E" : "W";
    }

    public static String j(int i) {
        return k(String.valueOf(i));
    }

    public static String k(String str) {
        StringBuilder sb = new StringBuilder(2);
        int i = 0;
        if (str == null) {
            while (i < 2) {
                sb.append('0');
                i++;
            }
        } else {
            while (i < 2 - str.length()) {
                sb.append('0');
                i++;
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public Location b() {
        Location location = new Location("gps");
        location.setLatitude(this.m);
        location.setLongitude(this.n);
        location.setSpeed(this.p);
        location.setBearing(this.q);
        location.setAccuracy(40.0f);
        location.setTime(System.currentTimeMillis());
        Bundle bundle = new Bundle();
        bundle.putInt("satellites", 10);
        bundle.putInt("satellitesvalue", 10);
        location.setExtras(bundle);
        return location;
    }

    public double d() {
        return this.m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double e() {
        return this.n;
    }

    public String toString() {
        return "BLocation{latitude: " + this.m + ", longitude: " + this.n + ", altitude: " + this.o + ", speed: " + this.p + ", bearing: " + this.q + ", accuracy: " + this.r + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.m);
        parcel.writeDouble(this.n);
        parcel.writeDouble(this.o);
        parcel.writeFloat(this.p);
        parcel.writeFloat(this.q);
        parcel.writeFloat(this.r);
    }
}
