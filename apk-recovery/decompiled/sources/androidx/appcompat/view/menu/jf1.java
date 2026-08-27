package androidx.appcompat.view.menu;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class jf1 extends ve1 implements uf1 {
    public jf1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // androidx.appcompat.view.menu.uf1
    public final pd2 Q1(cb2 cb2Var) {
        Parcel j = j();
        rk1.d(j, cb2Var);
        Parcel h = h(6, j);
        pd2 pd2Var = (pd2) rk1.a(h, pd2.CREATOR);
        h.recycle();
        return pd2Var;
    }

    @Override // androidx.appcompat.view.menu.uf1
    public final boolean e() {
        Parcel h = h(7, j());
        boolean f = rk1.f(h);
        h.recycle();
        return f;
    }

    @Override // androidx.appcompat.view.menu.uf1
    public final pd2 j2(cb2 cb2Var) {
        Parcel j = j();
        rk1.d(j, cb2Var);
        Parcel h = h(8, j);
        pd2 pd2Var = (pd2) rk1.a(h, pd2.CREATOR);
        h.recycle();
        return pd2Var;
    }

    @Override // androidx.appcompat.view.menu.uf1
    public final boolean w0(re2 re2Var, g20 g20Var) {
        Parcel j = j();
        rk1.d(j, re2Var);
        rk1.e(j, g20Var);
        Parcel h = h(5, j);
        boolean f = rk1.f(h);
        h.recycle();
        return f;
    }
}
