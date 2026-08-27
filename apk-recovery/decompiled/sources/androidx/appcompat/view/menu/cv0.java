package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public class cv0 implements Parcelable {
    public static final Parcelable.Creator<cv0> CREATOR = new a();
    public Account m;
    public String n;
    public HashMap o;
    public HashMap p;
    public HashMap q;
    public long r;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public cv0 createFromParcel(Parcel parcel) {
            return new cv0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public cv0[] newArray(int i) {
            return new cv0[i];
        }
    }

    public cv0() {
        this.o = new LinkedHashMap();
        this.p = new LinkedHashMap();
        this.q = new LinkedHashMap();
    }

    public void a(String str, String str2) {
        this.o.put(str, str2);
    }

    public boolean b(Account account) {
        if (account == null) {
            return false;
        }
        return account.equals(this.m);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.m, i);
        parcel.writeString(this.n);
        parcel.writeSerializable(this.o);
        parcel.writeSerializable(this.p);
        parcel.writeSerializable(this.q);
        parcel.writeLong(this.r);
    }

    public cv0(Parcel parcel) {
        this.o = new LinkedHashMap();
        this.p = new LinkedHashMap();
        this.q = new LinkedHashMap();
        this.m = (Account) parcel.readParcelable(Account.class.getClassLoader());
        this.n = parcel.readString();
        this.o = (HashMap) parcel.readSerializable();
        this.p = (HashMap) parcel.readSerializable();
        this.q = (HashMap) parcel.readSerializable();
        this.r = parcel.readLong();
    }
}
