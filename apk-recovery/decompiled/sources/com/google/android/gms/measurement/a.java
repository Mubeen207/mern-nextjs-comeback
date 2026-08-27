package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.appcompat.view.menu.fx1;
import androidx.appcompat.view.menu.g02;
import androidx.appcompat.view.menu.pj0;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class a extends AppMeasurement.a {
    public final fx1 a;
    public final g02 b;

    public a(fx1 fx1Var) {
        super();
        pj0.i(fx1Var);
        this.a = fx1Var;
        this.b = fx1Var.H();
    }

    @Override // androidx.appcompat.view.menu.y22
    public final long a() {
        return this.a.L().P0();
    }

    @Override // androidx.appcompat.view.menu.y22
    public final List c(String str, String str2) {
        return this.b.C(str, str2);
    }

    @Override // androidx.appcompat.view.menu.y22
    public final String e() {
        return this.b.i0();
    }

    @Override // androidx.appcompat.view.menu.y22
    public final void f(Bundle bundle) {
        this.b.u0(bundle);
    }

    @Override // androidx.appcompat.view.menu.y22
    public final String g() {
        return this.b.i0();
    }

    @Override // androidx.appcompat.view.menu.y22
    public final int h(String str) {
        pj0.e(str);
        return 25;
    }

    @Override // androidx.appcompat.view.menu.y22
    public final String i() {
        return this.b.k0();
    }

    @Override // androidx.appcompat.view.menu.y22
    public final String j() {
        return this.b.j0();
    }

    @Override // androidx.appcompat.view.menu.y22
    public final void k(String str) {
        this.a.y().D(str, this.a.b().b());
    }

    @Override // androidx.appcompat.view.menu.y22
    public final void l(String str, String str2, Bundle bundle) {
        this.a.H().X(str, str2, bundle);
    }

    @Override // androidx.appcompat.view.menu.y22
    public final void m(String str) {
        this.a.y().z(str, this.a.b().b());
    }

    @Override // androidx.appcompat.view.menu.y22
    public final Map n(String str, String str2, boolean z) {
        return this.b.D(str, str2, z);
    }

    @Override // androidx.appcompat.view.menu.y22
    public final void o(String str, String str2, Bundle bundle) {
        this.b.y0(str, str2, bundle);
    }
}
