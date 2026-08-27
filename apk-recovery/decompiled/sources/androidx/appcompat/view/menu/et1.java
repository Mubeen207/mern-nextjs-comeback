package androidx.appcompat.view.menu;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class et1 extends uj1 implements at1 {
    public et1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void A(ri1 ri1Var, String str, String str2) {
        Parcel h = h();
        yj1.d(h, ri1Var);
        h.writeString(str);
        h.writeString(str2);
        k(5, h);
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void C1(fb2 fb2Var) {
        Parcel h = h();
        yj1.d(h, fb2Var);
        k(6, h);
    }

    @Override // androidx.appcompat.view.menu.at1
    public final byte[] E1(ri1 ri1Var, String str) {
        Parcel h = h();
        yj1.d(h, ri1Var);
        h.writeString(str);
        Parcel j = j(9, h);
        byte[] createByteArray = j.createByteArray();
        j.recycle();
        return createByteArray;
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void F0(fb2 fb2Var) {
        Parcel h = h();
        yj1.d(h, fb2Var);
        k(20, h);
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void G0(Bundle bundle, fb2 fb2Var) {
        Parcel h = h();
        yj1.d(h, bundle);
        yj1.d(h, fb2Var);
        k(19, h);
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void I(lf1 lf1Var) {
        Parcel h = h();
        yj1.d(h, lf1Var);
        k(13, h);
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void L0(y92 y92Var, fb2 fb2Var) {
        Parcel h = h();
        yj1.d(h, y92Var);
        yj1.d(h, fb2Var);
        k(2, h);
    }

    @Override // androidx.appcompat.view.menu.at1
    public final String P1(fb2 fb2Var) {
        Parcel h = h();
        yj1.d(h, fb2Var);
        Parcel j = j(11, h);
        String readString = j.readString();
        j.recycle();
        return readString;
    }

    @Override // androidx.appcompat.view.menu.at1
    public final kg1 Q0(fb2 fb2Var) {
        Parcel h = h();
        yj1.d(h, fb2Var);
        Parcel j = j(21, h);
        kg1 kg1Var = (kg1) yj1.a(j, kg1.CREATOR);
        j.recycle();
        return kg1Var;
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void S(fb2 fb2Var) {
        Parcel h = h();
        yj1.d(h, fb2Var);
        k(18, h);
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void V1(long j, String str, String str2, String str3) {
        Parcel h = h();
        h.writeLong(j);
        h.writeString(str);
        h.writeString(str2);
        h.writeString(str3);
        k(10, h);
    }

    @Override // androidx.appcompat.view.menu.at1
    public final List Z1(String str, String str2, String str3) {
        Parcel h = h();
        h.writeString(str);
        h.writeString(str2);
        h.writeString(str3);
        Parcel j = j(17, h);
        ArrayList createTypedArrayList = j.createTypedArrayList(lf1.CREATOR);
        j.recycle();
        return createTypedArrayList;
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void g0(ri1 ri1Var, fb2 fb2Var) {
        Parcel h = h();
        yj1.d(h, ri1Var);
        yj1.d(h, fb2Var);
        k(1, h);
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void i2(fb2 fb2Var) {
        Parcel h = h();
        yj1.d(h, fb2Var);
        k(4, h);
    }

    @Override // androidx.appcompat.view.menu.at1
    public final List m1(String str, String str2, boolean z, fb2 fb2Var) {
        Parcel h = h();
        h.writeString(str);
        h.writeString(str2);
        yj1.e(h, z);
        yj1.d(h, fb2Var);
        Parcel j = j(14, h);
        ArrayList createTypedArrayList = j.createTypedArrayList(y92.CREATOR);
        j.recycle();
        return createTypedArrayList;
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void o(lf1 lf1Var, fb2 fb2Var) {
        Parcel h = h();
        yj1.d(h, lf1Var);
        yj1.d(h, fb2Var);
        k(12, h);
    }

    @Override // androidx.appcompat.view.menu.at1
    public final List o0(String str, String str2, fb2 fb2Var) {
        Parcel h = h();
        h.writeString(str);
        h.writeString(str2);
        yj1.d(h, fb2Var);
        Parcel j = j(16, h);
        ArrayList createTypedArrayList = j.createTypedArrayList(lf1.CREATOR);
        j.recycle();
        return createTypedArrayList;
    }

    @Override // androidx.appcompat.view.menu.at1
    public final List r0(String str, String str2, String str3, boolean z) {
        Parcel h = h();
        h.writeString(str);
        h.writeString(str2);
        h.writeString(str3);
        yj1.e(h, z);
        Parcel j = j(15, h);
        ArrayList createTypedArrayList = j.createTypedArrayList(y92.CREATOR);
        j.recycle();
        return createTypedArrayList;
    }

    @Override // androidx.appcompat.view.menu.at1
    public final List s(fb2 fb2Var, Bundle bundle) {
        Parcel h = h();
        yj1.d(h, fb2Var);
        yj1.d(h, bundle);
        Parcel j = j(24, h);
        ArrayList createTypedArrayList = j.createTypedArrayList(b82.CREATOR);
        j.recycle();
        return createTypedArrayList;
    }
}
