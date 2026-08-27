package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
/* loaded from: classes.dex */
public final class rh1 extends kr1 {
    public final Map b;
    public final Map c;
    public long d;

    public rh1(fx1 fx1Var) {
        super(fx1Var);
        this.c = new o4();
        this.b = new o4();
    }

    public static /* synthetic */ void C(rh1 rh1Var, String str, long j) {
        rh1Var.n();
        pj0.e(str);
        Integer num = (Integer) rh1Var.c.get(str);
        if (num == null) {
            rh1Var.l().G().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        w32 C = rh1Var.s().C(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            rh1Var.c.put(str, Integer.valueOf(intValue));
            return;
        }
        rh1Var.c.remove(str);
        Long l = (Long) rh1Var.b.get(str);
        if (l == null) {
            rh1Var.l().G().a("First ad unit exposure time was never set");
        } else {
            rh1Var.b.remove(str);
            rh1Var.A(str, j - l.longValue(), C);
        }
        if (rh1Var.c.isEmpty()) {
            long j2 = rh1Var.d;
            if (j2 == 0) {
                rh1Var.l().G().a("First ad exposure time was never set");
                return;
            }
            rh1Var.w(j - j2, C);
            rh1Var.d = 0L;
        }
    }

    public static /* synthetic */ void y(rh1 rh1Var, String str, long j) {
        rh1Var.n();
        pj0.e(str);
        if (rh1Var.c.isEmpty()) {
            rh1Var.d = j;
        }
        Integer num = (Integer) rh1Var.c.get(str);
        if (num != null) {
            rh1Var.c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (rh1Var.c.size() >= 100) {
            rh1Var.l().L().a("Too many ads visible");
        } else {
            rh1Var.c.put(str, 1);
            rh1Var.b.put(str, Long.valueOf(j));
        }
    }

    public final void A(String str, long j, w32 w32Var) {
        if (w32Var == null) {
            l().K().a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            l().K().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            aa2.W(w32Var, bundle, true);
            r().z0("am", "_xu", bundle);
        }
    }

    public final void B(long j) {
        for (String str : this.b.keySet()) {
            this.b.put(str, Long.valueOf(j));
        }
        if (this.b.isEmpty()) {
            return;
        }
        this.d = j;
    }

    public final void D(String str, long j) {
        if (str == null || str.length() == 0) {
            l().G().a("Ad unit id must be a non-empty string");
        } else {
            h().D(new sm1(this, str, j));
        }
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ cc b() {
        return super.b();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ pf1 d() {
        return super.d();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ tf1 e() {
        return super.e();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ fi1 f() {
        return super.f();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ pt1 g() {
        return super.g();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ mw1 h() {
        return super.h();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ wu1 i() {
        return super.i();
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ aa2 j() {
        return super.j();
    }

    @Override // androidx.appcompat.view.menu.kr1, androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ st1 l() {
        return super.l();
    }

    @Override // androidx.appcompat.view.menu.kr1, androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // androidx.appcompat.view.menu.kr1, androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ rh1 o() {
        return super.o();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ ct1 p() {
        return super.p();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ it1 q() {
        return super.q();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ g02 r() {
        return super.r();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ u32 s() {
        return super.s();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ k42 t() {
        return super.t();
    }

    @Override // androidx.appcompat.view.menu.kr1
    public final /* bridge */ /* synthetic */ b72 u() {
        return super.u();
    }

    public final void v(long j) {
        w32 C = s().C(false);
        for (String str : this.b.keySet()) {
            A(str, j - ((Long) this.b.get(str)).longValue(), C);
        }
        if (!this.b.isEmpty()) {
            w(j - this.d, C);
        }
        B(j);
    }

    public final void w(long j, w32 w32Var) {
        if (w32Var == null) {
            l().K().a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            l().K().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            aa2.W(w32Var, bundle, true);
            r().z0("am", "_xa", bundle);
        }
    }

    public final void z(String str, long j) {
        if (str == null || str.length() == 0) {
            l().G().a("Ad unit id must be a non-empty string");
        } else {
            h().D(new ke1(this, str, j));
        }
    }
}
