package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class c7 implements Parcelable {
    public int n;
    public final Object m = new Object();
    public List o = new ArrayList();

    public cv0 a(Account account) {
        cv0 cv0Var = new cv0();
        cv0Var.m = account;
        this.o.add(cv0Var);
        return cv0Var;
    }

    public boolean b(Account account) {
        return this.o.remove(d(account));
    }

    public long c(Account account) {
        cv0 d = d(account);
        if (d != null) {
            return d.r;
        }
        return -1L;
    }

    public cv0 d(Account account) {
        for (cv0 cv0Var : this.o) {
            if (cv0Var.b(account)) {
                return cv0Var;
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Map e(Account account) {
        cv0 d = d(account);
        return d == null ? new HashMap() : d.o;
    }

    public Account[] f(String str) {
        ArrayList arrayList = new ArrayList();
        for (cv0 cv0Var : this.o) {
            if (cv0Var.m.type.equals(str)) {
                arrayList.add(cv0Var.m);
            }
        }
        return (Account[]) arrayList.toArray(new Account[0]);
    }

    public Map i(Account account) {
        cv0 d = d(account);
        return d == null ? new HashMap() : d.q;
    }

    public Map j(Account account) {
        cv0 d = d(account);
        return d == null ? new HashMap() : d.p;
    }

    public Account[] k() {
        ArrayList arrayList = new ArrayList();
        for (cv0 cv0Var : this.o) {
            arrayList.add(cv0Var.m);
        }
        return (Account[]) arrayList.toArray(new Account[0]);
    }

    public void l(Account account) {
        cv0 d = d(account);
        if (d != null) {
            d.r = System.currentTimeMillis();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.n);
        parcel.writeTypedList(this.o);
    }
}
