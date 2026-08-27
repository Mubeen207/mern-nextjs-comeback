package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.mr0;
import androidx.appcompat.view.menu.ne1;
import androidx.appcompat.view.menu.pj0;
import androidx.appcompat.view.menu.r;
import com.google.android.gms.common.internal.ReflectedParcelable;
/* loaded from: classes.dex */
public final class Scope extends r implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new ne1();
    public final int m;
    public final String n;

    public Scope(int i, String str) {
        pj0.f(str, "scopeUri must not be null or empty");
        this.m = i;
        this.n = str;
    }

    public String d() {
        return this.n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.n.equals(((Scope) obj).n);
        }
        return false;
    }

    public int hashCode() {
        return this.n.hashCode();
    }

    public String toString() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.i(parcel, 1, this.m);
        mr0.n(parcel, 2, d(), false);
        mr0.b(parcel, a);
    }

    public Scope(String str) {
        this(1, str);
    }
}
