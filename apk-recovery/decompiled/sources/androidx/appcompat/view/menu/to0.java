package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class to0 implements Parcelable.Creator {
    public static void c(so0 so0Var, Parcel parcel, int i) {
        int a = mr0.a(parcel);
        mr0.e(parcel, 2, so0Var.m, false);
        mr0.b(parcel, a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public so0 createFromParcel(Parcel parcel) {
        int u = lr0.u(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < u) {
            int n = lr0.n(parcel);
            if (lr0.i(n) != 2) {
                lr0.t(parcel, n);
            } else {
                bundle = lr0.a(parcel, n);
            }
        }
        lr0.h(parcel, u);
        return new so0(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b */
    public so0[] newArray(int i) {
        return new so0[i];
    }
}
