package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.rz;
import com.google.android.gms.common.api.Scope;
/* loaded from: classes.dex */
public class rx extends r {
    public final int m;
    public final int n;
    public int o;
    public String p;
    public IBinder q;
    public Scope[] r;
    public Bundle s;
    public Account t;
    public mr[] u;
    public mr[] v;
    public boolean w;
    public int x;
    public boolean y;
    public String z;
    public static final Parcelable.Creator<rx> CREATOR = new i72();
    public static final Scope[] A = new Scope[0];
    public static final mr[] B = new mr[0];

    public rx(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, mr[] mrVarArr, mr[] mrVarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? A : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        mrVarArr = mrVarArr == null ? B : mrVarArr;
        mrVarArr2 = mrVarArr2 == null ? B : mrVarArr2;
        this.m = i;
        this.n = i2;
        this.o = i3;
        if ("com.google.android.gms".equals(str)) {
            this.p = "com.google.android.gms";
        } else {
            this.p = str;
        }
        if (i < 2) {
            this.t = iBinder != null ? t0.j(rz.a.asInterface(iBinder)) : null;
        } else {
            this.q = iBinder;
            this.t = account;
        }
        this.r = scopeArr;
        this.s = bundle;
        this.u = mrVarArr;
        this.v = mrVarArr2;
        this.w = z;
        this.x = i4;
        this.y = z2;
        this.z = str2;
    }

    public final String d() {
        return this.z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        i72.a(this, parcel, i);
    }
}
