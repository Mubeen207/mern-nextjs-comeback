package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public final class b72 extends fp1 {
    public Handler c;
    public boolean d;
    public final x72 e;
    public final t72 f;
    public final r72 g;

    public b72(fx1 fx1Var) {
        super(fx1Var);
        this.d = true;
        this.e = new x72(this);
        this.f = new t72(this);
        this.g = new r72(this);
    }

    public static /* synthetic */ void C(b72 b72Var, long j) {
        b72Var.n();
        b72Var.G();
        b72Var.l().K().b("Activity paused, time", Long.valueOf(j));
        b72Var.g.b(j);
        if (b72Var.e().Q()) {
            b72Var.f.e(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        n();
        if (this.c == null) {
            this.c = new zl1(Looper.getMainLooper());
        }
    }

    public static /* synthetic */ void I(b72 b72Var, long j) {
        b72Var.n();
        b72Var.G();
        b72Var.l().K().b("Activity resumed, time", Long.valueOf(j));
        if (b72Var.e().s(vi1.Q0)) {
            if (b72Var.e().Q() || b72Var.d) {
                b72Var.f.f(j);
            }
        } else if (b72Var.e().Q() || b72Var.i().s.b()) {
            b72Var.f.f(j);
        }
        b72Var.g.a();
        x72 x72Var = b72Var.e;
        x72Var.a.n();
        if (x72Var.a.a.p()) {
            x72Var.b(x72Var.a.b().a(), false);
        }
    }

    @Override // androidx.appcompat.view.menu.fp1
    public final boolean A() {
        return false;
    }

    public final void D(boolean z) {
        n();
        this.d = z;
    }

    public final boolean E(boolean z, boolean z2, long j) {
        return this.f.d(z, z2, j);
    }

    public final boolean F() {
        n();
        return this.d;
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
}
