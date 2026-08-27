package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class k42 extends fp1 {
    public final g62 c;
    public at1 d;
    public volatile Boolean e;
    public final eh1 f;
    public final d82 g;
    public final List h;
    public final eh1 i;

    public k42(fx1 fx1Var) {
        super(fx1Var);
        this.h = new ArrayList();
        this.g = new d82(fx1Var.b());
        this.c = new g62(this);
        this.f = new p42(this, fx1Var);
        this.i = new l52(this, fx1Var);
    }

    public static /* synthetic */ void M(k42 k42Var, ComponentName componentName) {
        k42Var.n();
        if (k42Var.d != null) {
            k42Var.d = null;
            k42Var.l().K().b("Disconnected from device MeasurementService", componentName);
            k42Var.n();
            k42Var.Y();
        }
    }

    private final void P(Runnable runnable) {
        n();
        if (c0()) {
            runnable.run();
        } else if (this.h.size() >= 1000) {
            l().G().a("Discarding data. Max runnable queue size reached");
        } else {
            this.h.add(runnable);
            this.i.b(60000L);
            Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        n();
        l().K().b("Processing queued up service tasks", Integer.valueOf(this.h.size()));
        for (Runnable runnable : this.h) {
            try {
                runnable.run();
            } catch (RuntimeException e) {
                l().G().b("Task exception while flushing queue", e);
            }
        }
        this.h.clear();
        this.i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        n();
        this.g.c();
        this.f.b(((Long) vi1.L.a(null)).longValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean h0() {
        /*
            r6 = this;
            r6.n()
            r6.v()
            java.lang.Boolean r0 = r6.e
            if (r0 != 0) goto Lfe
            r6.n()
            r6.v()
            androidx.appcompat.view.menu.wu1 r0 = r6.i()
            java.lang.Boolean r0 = r0.K()
            r1 = 1
            if (r0 == 0) goto L23
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L23
            goto Lf8
        L23:
            androidx.appcompat.view.menu.ct1 r2 = r6.p()
            int r2 = r2.C()
            if (r2 != r1) goto L30
        L2d:
            r3 = r1
            goto Ld5
        L30:
            androidx.appcompat.view.menu.st1 r2 = r6.l()
            androidx.appcompat.view.menu.vt1 r2 = r2.K()
            java.lang.String r3 = "Checking service availability"
            r2.a(r3)
            androidx.appcompat.view.menu.aa2 r2 = r6.j()
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.u(r3)
            if (r2 == 0) goto Lc6
            r3 = 0
            if (r2 == r1) goto Lb8
            r4 = 2
            if (r2 == r4) goto L98
            r0 = 3
            if (r2 == r0) goto L8a
            r0 = 9
            if (r2 == r0) goto L7c
            r0 = 18
            if (r2 == r0) goto L6e
            androidx.appcompat.view.menu.st1 r0 = r6.l()
            androidx.appcompat.view.menu.vt1 r0 = r0.L()
            java.lang.String r1 = "Unexpected service status"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.b(r1, r2)
        L6c:
            r1 = r3
            goto Ld5
        L6e:
            androidx.appcompat.view.menu.st1 r0 = r6.l()
            androidx.appcompat.view.menu.vt1 r0 = r0.L()
            java.lang.String r2 = "Service updating"
            r0.a(r2)
            goto L2d
        L7c:
            androidx.appcompat.view.menu.st1 r0 = r6.l()
            androidx.appcompat.view.menu.vt1 r0 = r0.L()
            java.lang.String r1 = "Service invalid"
            r0.a(r1)
            goto L6c
        L8a:
            androidx.appcompat.view.menu.st1 r0 = r6.l()
            androidx.appcompat.view.menu.vt1 r0 = r0.L()
            java.lang.String r1 = "Service disabled"
            r0.a(r1)
            goto L6c
        L98:
            androidx.appcompat.view.menu.st1 r2 = r6.l()
            androidx.appcompat.view.menu.vt1 r2 = r2.F()
            java.lang.String r4 = "Service container out of date"
            r2.a(r4)
            androidx.appcompat.view.menu.aa2 r2 = r6.j()
            int r2 = r2.G0()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto Lb5
        Lb1:
            r5 = r3
            r3 = r1
            r1 = r5
            goto Ld5
        Lb5:
            if (r0 != 0) goto L6c
            goto Ld5
        Lb8:
            androidx.appcompat.view.menu.st1 r0 = r6.l()
            androidx.appcompat.view.menu.vt1 r0 = r0.K()
            java.lang.String r2 = "Service missing"
            r0.a(r2)
            goto Lb1
        Lc6:
            androidx.appcompat.view.menu.st1 r0 = r6.l()
            androidx.appcompat.view.menu.vt1 r0 = r0.K()
            java.lang.String r2 = "Service available"
            r0.a(r2)
            goto L2d
        Ld5:
            if (r1 != 0) goto Lef
            androidx.appcompat.view.menu.tf1 r0 = r6.e()
            boolean r0 = r0.S()
            if (r0 == 0) goto Lef
            androidx.appcompat.view.menu.st1 r0 = r6.l()
            androidx.appcompat.view.menu.vt1 r0 = r0.G()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r2)
            goto Lf8
        Lef:
            if (r3 == 0) goto Lf8
            androidx.appcompat.view.menu.wu1 r0 = r6.i()
            r0.w(r1)
        Lf8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.e = r0
        Lfe:
            java.lang.Boolean r0 = r6.e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.k42.h0():boolean");
    }

    public static /* synthetic */ void l0(k42 k42Var) {
        k42Var.n();
        if (k42Var.c0()) {
            k42Var.l().K().a("Inactivity, disconnecting from the service");
            k42Var.Z();
        }
    }

    @Override // androidx.appcompat.view.menu.fp1
    public final boolean A() {
        return false;
    }

    public final void C(Bundle bundle) {
        n();
        v();
        P(new n52(this, j0(false), bundle));
    }

    public final void D(lf1 lf1Var) {
        pj0.i(lf1Var);
        n();
        v();
        P(new y52(this, true, j0(true), q().E(lf1Var), new lf1(lf1Var), lf1Var));
    }

    public final void E(ri1 ri1Var, String str) {
        pj0.i(ri1Var);
        n();
        v();
        P(new s52(this, true, j0(true), q().F(ri1Var), ri1Var, str));
    }

    public final void F(km1 km1Var) {
        n();
        v();
        P(new x42(this, j0(false), km1Var));
    }

    public final void G(km1 km1Var, ri1 ri1Var, String str) {
        n();
        v();
        if (j().u(ky.a) == 0) {
            P(new q52(this, ri1Var, str, km1Var));
            return;
        }
        l().L().a("Not bundling data. Service unavailable or out of date");
        j().U(km1Var, new byte[0]);
    }

    public final void H(km1 km1Var, String str, String str2) {
        n();
        v();
        P(new c62(this, str, str2, j0(false), km1Var));
    }

    public final void I(km1 km1Var, String str, String str2, boolean z) {
        n();
        v();
        P(new n42(this, str, str2, j0(false), z, km1Var));
    }

    public final void J(at1 at1Var) {
        n();
        pj0.i(at1Var);
        this.d = at1Var;
        g0();
        f0();
    }

    public final void K(at1 at1Var, r rVar, fb2 fb2Var) {
        int i;
        n();
        v();
        int i2 = 100;
        int i3 = 0;
        while (i3 < 1001 && i2 == 100) {
            ArrayList arrayList = new ArrayList();
            List C = q().C(100);
            if (C != null) {
                arrayList.addAll(C);
                i = C.size();
            } else {
                i = 0;
            }
            if (rVar != null && i < 100) {
                arrayList.add(rVar);
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                r rVar2 = (r) obj;
                if (rVar2 instanceof ri1) {
                    try {
                        at1Var.g0((ri1) rVar2, fb2Var);
                    } catch (RemoteException e) {
                        l().G().b("Failed to send event to the service", e);
                    }
                } else if (rVar2 instanceof y92) {
                    try {
                        at1Var.L0((y92) rVar2, fb2Var);
                    } catch (RemoteException e2) {
                        l().G().b("Failed to send user property to the service", e2);
                    }
                } else if (rVar2 instanceof lf1) {
                    try {
                        at1Var.o((lf1) rVar2, fb2Var);
                    } catch (RemoteException e3) {
                        l().G().b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    l().G().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            i2 = i;
        }
    }

    public final void L(w32 w32Var) {
        n();
        v();
        P(new b52(this, w32Var));
    }

    public final void O(y92 y92Var) {
        n();
        v();
        P(new v42(this, j0(true), q().G(y92Var), y92Var));
    }

    public final void Q(AtomicReference atomicReference) {
        n();
        v();
        P(new z42(this, atomicReference, j0(false)));
    }

    public final void R(AtomicReference atomicReference, Bundle bundle) {
        n();
        v();
        P(new q42(this, atomicReference, j0(false), bundle));
    }

    public final void S(AtomicReference atomicReference, String str, String str2, String str3) {
        n();
        v();
        P(new w52(this, atomicReference, str, str2, str3, j0(false)));
    }

    public final void T(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        n();
        v();
        P(new a62(this, atomicReference, str, str2, str3, j0(false), z));
    }

    public final void U(boolean z) {
        n();
        v();
        if (z) {
            q().H();
        }
        if (e0()) {
            P(new u52(this, j0(false)));
        }
    }

    public final kg1 V() {
        n();
        v();
        at1 at1Var = this.d;
        if (at1Var == null) {
            Y();
            l().F().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        fb2 j0 = j0(false);
        pj0.i(j0);
        try {
            kg1 Q0 = at1Var.Q0(j0);
            g0();
            return Q0;
        } catch (RemoteException e) {
            l().G().b("Failed to get consents; remote exception", e);
            return null;
        }
    }

    public final Boolean W() {
        return this.e;
    }

    public final void X() {
        n();
        v();
        fb2 j0 = j0(true);
        q().I();
        P(new j52(this, j0));
    }

    public final void Y() {
        n();
        v();
        if (c0()) {
            return;
        }
        if (h0()) {
            this.c.a();
        } else if (e().S()) {
        } else {
            List<ResolveInfo> queryIntentServices = a().getPackageManager().queryIntentServices(new Intent().setClassName(a(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                l().G().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            intent.setComponent(new ComponentName(a(), "com.google.android.gms.measurement.AppMeasurementService"));
            this.c.b(intent);
        }
    }

    public final void Z() {
        n();
        v();
        this.c.d();
        try {
            hf.b().c(a(), this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    public final void a0() {
        n();
        v();
        fb2 j0 = j0(false);
        q().H();
        P(new t42(this, j0));
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ cc b() {
        return super.b();
    }

    public final void b0() {
        n();
        v();
        P(new o52(this, j0(true)));
    }

    public final boolean c0() {
        n();
        v();
        return this.d != null;
    }

    @Override // androidx.appcompat.view.menu.iz1, androidx.appcompat.view.menu.lz1
    public final /* bridge */ /* synthetic */ pf1 d() {
        return super.d();
    }

    public final boolean d0() {
        n();
        v();
        return !h0() || j().G0() >= 200900;
    }

    @Override // androidx.appcompat.view.menu.iz1
    public final /* bridge */ /* synthetic */ tf1 e() {
        return super.e();
    }

    public final boolean e0() {
        n();
        v();
        return !h0() || j().G0() >= ((Integer) vi1.r0.a(null)).intValue();
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

    public final fb2 j0(boolean z) {
        return p().B(z ? l().O() : null);
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
