package androidx.appcompat.view.menu;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class nx1 extends ys1 {
    public final r82 l;
    public Boolean m;
    public String n;

    public nx1(r82 r82Var) {
        this(r82Var, null);
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void A(ri1 ri1Var, String str, String str2) {
        pj0.i(ri1Var);
        pj0.e(str);
        v2(str, true);
        k(new my1(this, ri1Var, str));
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void C1(fb2 fb2Var) {
        x2(fb2Var, false);
        k(new qx1(this, fb2Var));
    }

    @Override // androidx.appcompat.view.menu.at1
    public final byte[] E1(ri1 ri1Var, String str) {
        pj0.e(str);
        pj0.i(ri1Var);
        v2(str, true);
        this.l.l().F().b("Log and bundle. event", this.l.f0().c(ri1Var.m));
        long c = this.l.b().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.l.h().B(new sy1(this, ri1Var, str)).get();
            if (bArr == null) {
                this.l.l().G().b("Log and bundle returned null. appId", st1.v(str));
                bArr = new byte[0];
            }
            this.l.l().F().d("Log and bundle processed. event, size, time_ms", this.l.f0().c(ri1Var.m), Integer.valueOf(bArr.length), Long.valueOf((this.l.b().c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            this.l.l().G().d("Failed to log and bundle. appId, event, error", st1.v(str), this.l.f0().c(ri1Var.m), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.l.l().G().d("Failed to log and bundle. appId, event, error", st1.v(str), this.l.f0().c(ri1Var.m), e);
            return null;
        }
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void F0(fb2 fb2Var) {
        pj0.e(fb2Var.m);
        pj0.i(fb2Var.H);
        ky1 ky1Var = new ky1(this, fb2Var);
        pj0.i(ky1Var);
        if (this.l.h().J()) {
            ky1Var.run();
        } else {
            this.l.h().G(ky1Var);
        }
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void G0(final Bundle bundle, fb2 fb2Var) {
        x2(fb2Var, false);
        final String str = fb2Var.m;
        pj0.i(str);
        k(new Runnable() { // from class: androidx.appcompat.view.menu.lx1
            @Override // java.lang.Runnable
            public final void run() {
                nx1.this.u2(str, bundle);
            }
        });
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void I(lf1 lf1Var) {
        pj0.i(lf1Var);
        pj0.i(lf1Var.o);
        pj0.e(lf1Var.m);
        v2(lf1Var.m, true);
        k(new yx1(this, new lf1(lf1Var)));
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void L0(y92 y92Var, fb2 fb2Var) {
        pj0.i(y92Var);
        x2(fb2Var, false);
        k(new qy1(this, y92Var, fb2Var));
    }

    @Override // androidx.appcompat.view.menu.at1
    public final String P1(fb2 fb2Var) {
        x2(fb2Var, false);
        return this.l.R(fb2Var);
    }

    @Override // androidx.appcompat.view.menu.at1
    public final kg1 Q0(fb2 fb2Var) {
        x2(fb2Var, false);
        pj0.e(fb2Var.m);
        if (qa2.a()) {
            try {
                return (kg1) this.l.h().B(new iy1(this, fb2Var)).get(10000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                this.l.l().G().c("Failed to get consent. appId", st1.v(fb2Var.m), e);
                return new kg1(null);
            }
        }
        return new kg1(null);
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void S(fb2 fb2Var) {
        pj0.e(fb2Var.m);
        v2(fb2Var.m, false);
        k(new ey1(this, fb2Var));
    }

    @Override // androidx.appcompat.view.menu.at1
    public final List T(fb2 fb2Var, boolean z) {
        x2(fb2Var, false);
        String str = fb2Var.m;
        pj0.i(str);
        try {
            List<ca2> list = (List) this.l.h().w(new cz1(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ca2 ca2Var : list) {
                if (!z && aa2.H0(ca2Var.c)) {
                }
                arrayList.add(new y92(ca2Var));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.l.l().G().c("Failed to get user properties. appId", st1.v(fb2Var.m), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.l.l().G().c("Failed to get user properties. appId", st1.v(fb2Var.m), e);
            return null;
        }
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void V1(long j, String str, String str2, String str3) {
        k(new ux1(this, str2, str3, str, j));
    }

    @Override // androidx.appcompat.view.menu.at1
    public final List Z1(String str, String str2, String str3) {
        v2(str, true);
        try {
            return (List) this.l.h().w(new gy1(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.l.l().G().b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void g0(ri1 ri1Var, fb2 fb2Var) {
        pj0.i(ri1Var);
        x2(fb2Var, false);
        k(new oy1(this, ri1Var, fb2Var));
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void i2(fb2 fb2Var) {
        x2(fb2Var, false);
        k(new px1(this, fb2Var));
    }

    public final void k(Runnable runnable) {
        pj0.i(runnable);
        if (this.l.h().J()) {
            runnable.run();
        } else {
            this.l.h().D(runnable);
        }
    }

    @Override // androidx.appcompat.view.menu.at1
    public final List m1(String str, String str2, boolean z, fb2 fb2Var) {
        x2(fb2Var, false);
        String str3 = fb2Var.m;
        pj0.i(str3);
        try {
            List<ca2> list = (List) this.l.h().w(new wx1(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ca2 ca2Var : list) {
                if (!z && aa2.H0(ca2Var.c)) {
                }
                arrayList.add(new y92(ca2Var));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.l.l().G().c("Failed to query user properties. appId", st1.v(fb2Var.m), e);
            return Collections.emptyList();
        } catch (ExecutionException e2) {
            e = e2;
            this.l.l().G().c("Failed to query user properties. appId", st1.v(fb2Var.m), e);
            return Collections.emptyList();
        }
    }

    @Override // androidx.appcompat.view.menu.at1
    public final void o(lf1 lf1Var, fb2 fb2Var) {
        pj0.i(lf1Var);
        pj0.i(lf1Var.o);
        x2(fb2Var, false);
        lf1 lf1Var2 = new lf1(lf1Var);
        lf1Var2.m = fb2Var.m;
        k(new sx1(this, lf1Var2, fb2Var));
    }

    @Override // androidx.appcompat.view.menu.at1
    public final List o0(String str, String str2, fb2 fb2Var) {
        x2(fb2Var, false);
        String str3 = fb2Var.m;
        pj0.i(str3);
        try {
            return (List) this.l.h().w(new ay1(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.l.l().G().b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // androidx.appcompat.view.menu.at1
    public final List r0(String str, String str2, String str3, boolean z) {
        v2(str, true);
        try {
            List<ca2> list = (List) this.l.h().w(new cy1(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (ca2 ca2Var : list) {
                if (!z && aa2.H0(ca2Var.c)) {
                }
                arrayList.add(new y92(ca2Var));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.l.l().G().c("Failed to get user properties as. appId", st1.v(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e2) {
            e = e2;
            this.l.l().G().c("Failed to get user properties as. appId", st1.v(str), e);
            return Collections.emptyList();
        }
    }

    @Override // androidx.appcompat.view.menu.at1
    public final List s(fb2 fb2Var, Bundle bundle) {
        x2(fb2Var, false);
        pj0.i(fb2Var.m);
        try {
            return (List) this.l.h().w(new ez1(this, fb2Var, bundle)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.l.l().G().c("Failed to get trigger URIs. appId", st1.v(fb2Var.m), e);
            return Collections.emptyList();
        }
    }

    public final /* synthetic */ void u2(String str, Bundle bundle) {
        this.l.e0().h0(str, bundle);
    }

    public final void v2(String str, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            this.l.l().G().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.m == null) {
                    if (!"com.google.android.gms".equals(this.n) && !k31.a(this.l.a(), Binder.getCallingUid()) && !ly.a(this.l.a()).c(Binder.getCallingUid())) {
                        z2 = false;
                        this.m = Boolean.valueOf(z2);
                    }
                    z2 = true;
                    this.m = Boolean.valueOf(z2);
                }
                if (this.m.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.l.l().G().b("Measurement Service called with invalid calling package. appId", st1.v(str));
                throw e;
            }
        }
        if (this.n == null && ky.i(this.l.a(), Binder.getCallingUid(), str)) {
            this.n = str;
        }
        if (str.equals(this.n)) {
            return;
        }
        throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
    }

    public final ri1 w2(ri1 ri1Var, fb2 fb2Var) {
        hi1 hi1Var;
        if ("_cmp".equals(ri1Var.m) && (hi1Var = ri1Var.n) != null && hi1Var.d() != 0) {
            String r = ri1Var.n.r("_cis");
            if ("referrer broadcast".equals(r) || "referrer API".equals(r)) {
                this.l.l().J().b("Event has been filtered ", ri1Var.toString());
                return new ri1("_cmpx", ri1Var.n, ri1Var.o, ri1Var.p);
            }
        }
        return ri1Var;
    }

    public final void x2(fb2 fb2Var, boolean z) {
        pj0.i(fb2Var);
        pj0.e(fb2Var.m);
        v2(fb2Var.m, false);
        this.l.n0().j0(fb2Var.n, fb2Var.C);
    }

    public final void y2(ri1 ri1Var, fb2 fb2Var) {
        if (!this.l.h0().W(fb2Var.m)) {
            z2(ri1Var, fb2Var);
            return;
        }
        this.l.l().K().b("EES config found for", fb2Var.m);
        uv1 h0 = this.l.h0();
        String str = fb2Var.m;
        oh1 oh1Var = TextUtils.isEmpty(str) ? null : (oh1) h0.j.c(str);
        if (oh1Var == null) {
            this.l.l().K().b("EES not loaded for", fb2Var.m);
            z2(ri1Var, fb2Var);
            return;
        }
        try {
            Map O = this.l.m0().O(ri1Var.n.k(), true);
            String a = qz1.a(ri1Var.m);
            if (a == null) {
                a = ri1Var.m;
            }
            if (oh1Var.d(new kf1(a, ri1Var.p, O))) {
                if (oh1Var.g()) {
                    this.l.l().K().b("EES edited event", ri1Var.m);
                    z2(this.l.m0().D(oh1Var.a().d()), fb2Var);
                } else {
                    z2(ri1Var, fb2Var);
                }
                if (oh1Var.f()) {
                    for (kf1 kf1Var : oh1Var.a().f()) {
                        this.l.l().K().b("EES logging created event", kf1Var.e());
                        z2(this.l.m0().D(kf1Var), fb2Var);
                    }
                    return;
                }
                return;
            }
        } catch (sk1 unused) {
            this.l.l().G().c("EES error. appId, eventName", fb2Var.n, ri1Var.m);
        }
        this.l.l().K().b("EES was not applied to event", ri1Var.m);
        z2(ri1Var, fb2Var);
    }

    public final void z2(ri1 ri1Var, fb2 fb2Var) {
        this.l.o0();
        this.l.q(ri1Var, fb2Var);
    }

    public nx1(r82 r82Var, String str) {
        pj0.i(r82Var);
        this.l = r82Var;
        this.n = null;
    }
}
