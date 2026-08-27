package androidx.appcompat.view.menu;

import android.content.Context;
/* loaded from: classes.dex */
public abstract class iz1 implements lz1 {
    public final fx1 a;

    public iz1(fx1 fx1Var) {
        pj0.i(fx1Var);
        this.a = fx1Var;
    }

    @Override // androidx.appcompat.view.menu.lz1
    public Context a() {
        return this.a.a();
    }

    @Override // androidx.appcompat.view.menu.lz1
    public cc b() {
        return this.a.b();
    }

    @Override // androidx.appcompat.view.menu.lz1
    public pf1 d() {
        return this.a.d();
    }

    public tf1 e() {
        return this.a.z();
    }

    public fi1 f() {
        return this.a.A();
    }

    public pt1 g() {
        return this.a.D();
    }

    @Override // androidx.appcompat.view.menu.lz1
    public mw1 h() {
        return this.a.h();
    }

    public wu1 i() {
        return this.a.F();
    }

    public aa2 j() {
        return this.a.L();
    }

    public void k() {
        this.a.h().k();
    }

    @Override // androidx.appcompat.view.menu.lz1
    public st1 l() {
        return this.a.l();
    }

    public void m() {
        this.a.Q();
    }

    public void n() {
        this.a.h().n();
    }
}
