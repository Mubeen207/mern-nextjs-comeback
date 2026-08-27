package androidx.appcompat.view.menu;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class uw1 {
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public String H;
    public boolean I;
    public long J;
    public long K;
    public final fx1 a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public long i;
    public String j;
    public long k;
    public String l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;
    public String q;
    public Boolean r;
    public long s;
    public List t;
    public String u;
    public boolean v;
    public long w;
    public long x;
    public int y;
    public boolean z;

    public uw1(fx1 fx1Var, String str) {
        pj0.i(fx1Var);
        pj0.e(str);
        this.a = fx1Var;
        this.b = str;
        fx1Var.h().n();
    }

    public final void A(long j) {
        this.a.h().n();
        this.I |= this.J != j;
        this.J = j;
    }

    public final void B(String str) {
        this.a.h().n();
        this.I |= !nu1.a(this.l, str);
        this.l = str;
    }

    public final void C(boolean z) {
        this.a.h().n();
        this.I |= this.v != z;
        this.v = z;
    }

    public final long D() {
        this.a.h().n();
        return this.A;
    }

    public final void E(long j) {
        this.a.h().n();
        this.I |= this.E != j;
        this.E = j;
    }

    public final void F(String str) {
        this.a.h().n();
        this.I |= !nu1.a(this.j, str);
        this.j = str;
    }

    public final void G(boolean z) {
        this.a.h().n();
        this.I |= this.z != z;
        this.z = z;
    }

    public final long H() {
        this.a.h().n();
        return this.J;
    }

    public final void I(long j) {
        this.a.h().n();
        this.I |= this.F != j;
        this.F = j;
    }

    public final void J(String str) {
        this.a.h().n();
        this.I |= !nu1.a(this.f, str);
        this.f = str;
    }

    public final long K() {
        this.a.h().n();
        return this.E;
    }

    public final void L(long j) {
        this.a.h().n();
        this.I |= this.D != j;
        this.D = j;
    }

    public final void M(String str) {
        this.a.h().n();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.I |= !nu1.a(this.d, str);
        this.d = str;
    }

    public final long N() {
        this.a.h().n();
        return this.F;
    }

    public final void O(long j) {
        this.a.h().n();
        this.I |= this.C != j;
        this.C = j;
    }

    public final void P(String str) {
        this.a.h().n();
        this.I |= !nu1.a(this.H, str);
        this.H = str;
    }

    public final long Q() {
        this.a.h().n();
        return this.D;
    }

    public final void R(long j) {
        this.a.h().n();
        this.I |= this.G != j;
        this.G = j;
    }

    public final void S(String str) {
        this.a.h().n();
        this.I |= !nu1.a(this.e, str);
        this.e = str;
    }

    public final long T() {
        this.a.h().n();
        return this.C;
    }

    public final void U(long j) {
        this.a.h().n();
        this.I |= this.B != j;
        this.B = j;
    }

    public final void V(String str) {
        this.a.h().n();
        this.I |= !nu1.a(this.u, str);
        this.u = str;
    }

    public final long W() {
        this.a.h().n();
        return this.G;
    }

    public final void X(long j) {
        this.a.h().n();
        this.I |= this.n != j;
        this.n = j;
    }

    public final long Y() {
        this.a.h().n();
        return this.B;
    }

    public final void Z(long j) {
        this.a.h().n();
        this.I |= this.s != j;
        this.s = j;
    }

    public final int a() {
        this.a.h().n();
        return this.y;
    }

    public final long a0() {
        this.a.h().n();
        return this.n;
    }

    public final void b(int i) {
        this.a.h().n();
        this.I |= this.y != i;
        this.y = i;
    }

    public final void b0(long j) {
        this.a.h().n();
        this.I |= this.K != j;
        this.K = j;
    }

    public final void c(long j) {
        this.a.h().n();
        this.I |= this.k != j;
        this.k = j;
    }

    public final long c0() {
        this.a.h().n();
        return this.s;
    }

    public final void d(Boolean bool) {
        this.a.h().n();
        this.I |= !nu1.a(this.r, bool);
        this.r = bool;
    }

    public final void d0(long j) {
        this.a.h().n();
        this.I |= this.m != j;
        this.m = j;
    }

    public final void e(String str) {
        this.a.h().n();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.I |= !nu1.a(this.q, str);
        this.q = str;
    }

    public final long e0() {
        this.a.h().n();
        return this.K;
    }

    public final void f(List list) {
        this.a.h().n();
        if (nu1.a(this.t, list)) {
            return;
        }
        this.I = true;
        this.t = list != null ? new ArrayList(list) : null;
    }

    public final void f0(long j) {
        this.a.h().n();
        this.I |= this.i != j;
        this.i = j;
    }

    public final void g(boolean z) {
        this.a.h().n();
        this.I |= this.p != z;
        this.p = z;
    }

    public final long g0() {
        this.a.h().n();
        return this.m;
    }

    public final String h() {
        this.a.h().n();
        return this.j;
    }

    public final void h0(long j) {
        pj0.a(j >= 0);
        this.a.h().n();
        this.I |= this.g != j;
        this.g = j;
    }

    public final String i() {
        this.a.h().n();
        return this.f;
    }

    public final long i0() {
        this.a.h().n();
        return this.i;
    }

    public final String j() {
        this.a.h().n();
        return this.d;
    }

    public final void j0(long j) {
        this.a.h().n();
        this.I |= this.h != j;
        this.h = j;
    }

    public final String k() {
        this.a.h().n();
        return this.H;
    }

    public final long k0() {
        this.a.h().n();
        return this.g;
    }

    public final String l() {
        this.a.h().n();
        return this.e;
    }

    public final void l0(long j) {
        this.a.h().n();
        this.I |= this.x != j;
        this.x = j;
    }

    public final String m() {
        this.a.h().n();
        return this.u;
    }

    public final long m0() {
        this.a.h().n();
        return this.h;
    }

    public final List n() {
        this.a.h().n();
        return this.t;
    }

    public final void n0(long j) {
        this.a.h().n();
        this.I |= this.w != j;
        this.w = j;
    }

    public final void o() {
        this.a.h().n();
        this.I = false;
    }

    public final long o0() {
        this.a.h().n();
        return this.x;
    }

    public final void p() {
        this.a.h().n();
        long j = this.g + 1;
        if (j > 2147483647L) {
            this.a.l().L().b("Bundle index overflow. appId", st1.v(this.b));
            j = 0;
        }
        this.I = true;
        this.g = j;
    }

    public final long p0() {
        this.a.h().n();
        return this.w;
    }

    public final boolean q() {
        this.a.h().n();
        return this.p;
    }

    public final Boolean q0() {
        this.a.h().n();
        return this.r;
    }

    public final boolean r() {
        this.a.h().n();
        return this.o;
    }

    public final String r0() {
        this.a.h().n();
        return this.q;
    }

    public final boolean s() {
        this.a.h().n();
        return this.I;
    }

    public final String s0() {
        this.a.h().n();
        String str = this.H;
        P(null);
        return str;
    }

    public final boolean t() {
        this.a.h().n();
        return this.v;
    }

    public final String t0() {
        this.a.h().n();
        return this.b;
    }

    public final boolean u() {
        this.a.h().n();
        return this.z;
    }

    public final String u0() {
        this.a.h().n();
        return this.c;
    }

    public final long v() {
        this.a.h().n();
        return 0L;
    }

    public final String v0() {
        this.a.h().n();
        return this.l;
    }

    public final void w(long j) {
        this.a.h().n();
        this.I |= this.A != j;
        this.A = j;
    }

    public final void x(String str) {
        this.a.h().n();
        this.I |= !nu1.a(this.c, str);
        this.c = str;
    }

    public final void y(boolean z) {
        this.a.h().n();
        this.I |= this.o != z;
        this.o = z;
    }

    public final long z() {
        this.a.h().n();
        return this.k;
    }
}
