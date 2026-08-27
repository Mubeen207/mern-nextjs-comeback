package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.appcompat.view.menu.aa2;
import androidx.appcompat.view.menu.c12;
import androidx.appcompat.view.menu.d32;
import androidx.appcompat.view.menu.fx1;
import androidx.appcompat.view.menu.g02;
import androidx.appcompat.view.menu.g20;
import androidx.appcompat.view.menu.g22;
import androidx.appcompat.view.menu.g52;
import androidx.appcompat.view.menu.gm1;
import androidx.appcompat.view.menu.gn1;
import androidx.appcompat.view.menu.h12;
import androidx.appcompat.view.menu.hi1;
import androidx.appcompat.view.menu.in1;
import androidx.appcompat.view.menu.km1;
import androidx.appcompat.view.menu.l12;
import androidx.appcompat.view.menu.mn1;
import androidx.appcompat.view.menu.o4;
import androidx.appcompat.view.menu.pj0;
import androidx.appcompat.view.menu.r92;
import androidx.appcompat.view.menu.ri1;
import androidx.appcompat.view.menu.u22;
import androidx.appcompat.view.menu.vz1;
import androidx.appcompat.view.menu.x12;
import androidx.appcompat.view.menu.xz1;
import androidx.appcompat.view.menu.yf0;
import androidx.appcompat.view.menu.zy1;
import com.google.android.gms.common.util.DynamiteApi;
import java.util.Map;
@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends gm1 {
    public fx1 l = null;
    public final Map m = new o4();

    /* loaded from: classes.dex */
    public class a implements xz1 {
        public gn1 a;

        public a(gn1 gn1Var) {
            this.a = gn1Var;
        }

        @Override // androidx.appcompat.view.menu.xz1
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.U(str, str2, bundle, j);
            } catch (RemoteException e) {
                fx1 fx1Var = AppMeasurementDynamiteService.this.l;
                if (fx1Var != null) {
                    fx1Var.l().L().b("Event interceptor threw exception", e);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements vz1 {
        public gn1 a;

        public b(gn1 gn1Var) {
            this.a = gn1Var;
        }

        @Override // androidx.appcompat.view.menu.vz1
        public final void a(String str, String str2, Bundle bundle, long j) {
            try {
                this.a.U(str, str2, bundle, j);
            } catch (RemoteException e) {
                fx1 fx1Var = AppMeasurementDynamiteService.this.l;
                if (fx1Var != null) {
                    fx1Var.l().L().b("Event listener threw exception", e);
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.im1
    public void beginAdUnitExposure(String str, long j) {
        j();
        this.l.y().z(str, j);
    }

    @Override // androidx.appcompat.view.menu.im1
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        j();
        this.l.H().X(str, str2, bundle);
    }

    @Override // androidx.appcompat.view.menu.im1
    public void clearMeasurementEnabled(long j) {
        j();
        this.l.H().R(null);
    }

    @Override // androidx.appcompat.view.menu.im1
    public void endAdUnitExposure(String str, long j) {
        j();
        this.l.y().D(str, j);
    }

    @Override // androidx.appcompat.view.menu.im1
    public void generateEventId(km1 km1Var) {
        j();
        long P0 = this.l.L().P0();
        j();
        this.l.L().P(km1Var, P0);
    }

    @Override // androidx.appcompat.view.menu.im1
    public void getAppInstanceId(km1 km1Var) {
        j();
        this.l.h().D(new zy1(this, km1Var));
    }

    @Override // androidx.appcompat.view.menu.im1
    public void getCachedAppInstanceId(km1 km1Var) {
        j();
        k(km1Var, this.l.H().i0());
    }

    @Override // androidx.appcompat.view.menu.im1
    public void getConditionalUserProperties(String str, String str2, km1 km1Var) {
        j();
        this.l.h().D(new g52(this, km1Var, str, str2));
    }

    @Override // androidx.appcompat.view.menu.im1
    public void getCurrentScreenClass(km1 km1Var) {
        j();
        k(km1Var, this.l.H().j0());
    }

    @Override // androidx.appcompat.view.menu.im1
    public void getCurrentScreenName(km1 km1Var) {
        j();
        k(km1Var, this.l.H().k0());
    }

    @Override // androidx.appcompat.view.menu.im1
    public void getGmpAppId(km1 km1Var) {
        j();
        k(km1Var, this.l.H().l0());
    }

    @Override // androidx.appcompat.view.menu.im1
    public void getMaxUserProperties(String str, km1 km1Var) {
        j();
        this.l.H();
        pj0.e(str);
        j();
        this.l.L().O(km1Var, 25);
    }

    @Override // androidx.appcompat.view.menu.im1
    public void getSessionId(km1 km1Var) {
        j();
        g02 H = this.l.H();
        H.h().D(new g22(H, km1Var));
    }

    @Override // androidx.appcompat.view.menu.im1
    public void getTestFlag(km1 km1Var, int i) {
        j();
        if (i == 0) {
            this.l.L().R(km1Var, this.l.H().m0());
        } else if (i == 1) {
            this.l.L().P(km1Var, this.l.H().h0().longValue());
        } else if (i != 2) {
            if (i == 3) {
                this.l.L().O(km1Var, this.l.H().g0().intValue());
            } else if (i != 4) {
            } else {
                this.l.L().T(km1Var, this.l.H().e0().booleanValue());
            }
        } else {
            aa2 L = this.l.L();
            double doubleValue = this.l.H().f0().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                km1Var.f(bundle);
            } catch (RemoteException e) {
                L.a.l().L().b("Error returning double value to wrapper", e);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.im1
    public void getUserProperties(String str, String str2, boolean z, km1 km1Var) {
        j();
        this.l.h().D(new c12(this, km1Var, str, str2, z));
    }

    @Override // androidx.appcompat.view.menu.im1
    public void initForTests(Map map) {
        j();
    }

    @Override // androidx.appcompat.view.menu.im1
    public void initialize(g20 g20Var, mn1 mn1Var, long j) {
        fx1 fx1Var = this.l;
        if (fx1Var == null) {
            this.l = fx1.c((Context) pj0.i((Context) yf0.j(g20Var)), mn1Var, Long.valueOf(j));
        } else {
            fx1Var.l().L().a("Attempting to initialize multiple times");
        }
    }

    @Override // androidx.appcompat.view.menu.im1
    public void isDataCollectionEnabled(km1 km1Var) {
        j();
        this.l.h().D(new r92(this, km1Var));
    }

    public final void j() {
        if (this.l == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public final void k(km1 km1Var, String str) {
        j();
        this.l.L().R(km1Var, str);
    }

    @Override // androidx.appcompat.view.menu.im1
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        j();
        this.l.H().Z(str, str2, bundle, z, z2, j);
    }

    @Override // androidx.appcompat.view.menu.im1
    public void logEventAndBundle(String str, String str2, Bundle bundle, km1 km1Var, long j) {
        j();
        pj0.e(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.l.h().D(new d32(this, km1Var, new ri1(str2, new hi1(bundle), "app", j), str));
    }

    @Override // androidx.appcompat.view.menu.im1
    public void logHealthData(int i, String str, g20 g20Var, g20 g20Var2, g20 g20Var3) {
        j();
        this.l.l().z(i, true, false, str, g20Var == null ? null : yf0.j(g20Var), g20Var2 == null ? null : yf0.j(g20Var2), g20Var3 != null ? yf0.j(g20Var3) : null);
    }

    @Override // androidx.appcompat.view.menu.im1
    public void onActivityCreated(g20 g20Var, Bundle bundle, long j) {
        j();
        u22 u22Var = this.l.H().c;
        if (u22Var != null) {
            this.l.H().o0();
            u22Var.onActivityCreated((Activity) yf0.j(g20Var), bundle);
        }
    }

    @Override // androidx.appcompat.view.menu.im1
    public void onActivityDestroyed(g20 g20Var, long j) {
        j();
        u22 u22Var = this.l.H().c;
        if (u22Var != null) {
            this.l.H().o0();
            u22Var.onActivityDestroyed((Activity) yf0.j(g20Var));
        }
    }

    @Override // androidx.appcompat.view.menu.im1
    public void onActivityPaused(g20 g20Var, long j) {
        j();
        u22 u22Var = this.l.H().c;
        if (u22Var != null) {
            this.l.H().o0();
            u22Var.onActivityPaused((Activity) yf0.j(g20Var));
        }
    }

    @Override // androidx.appcompat.view.menu.im1
    public void onActivityResumed(g20 g20Var, long j) {
        j();
        u22 u22Var = this.l.H().c;
        if (u22Var != null) {
            this.l.H().o0();
            u22Var.onActivityResumed((Activity) yf0.j(g20Var));
        }
    }

    @Override // androidx.appcompat.view.menu.im1
    public void onActivitySaveInstanceState(g20 g20Var, km1 km1Var, long j) {
        j();
        u22 u22Var = this.l.H().c;
        Bundle bundle = new Bundle();
        if (u22Var != null) {
            this.l.H().o0();
            u22Var.onActivitySaveInstanceState((Activity) yf0.j(g20Var), bundle);
        }
        try {
            km1Var.f(bundle);
        } catch (RemoteException e) {
            this.l.l().L().b("Error returning bundle value to wrapper", e);
        }
    }

    @Override // androidx.appcompat.view.menu.im1
    public void onActivityStarted(g20 g20Var, long j) {
        j();
        u22 u22Var = this.l.H().c;
        if (u22Var != null) {
            this.l.H().o0();
            u22Var.onActivityStarted((Activity) yf0.j(g20Var));
        }
    }

    @Override // androidx.appcompat.view.menu.im1
    public void onActivityStopped(g20 g20Var, long j) {
        j();
        u22 u22Var = this.l.H().c;
        if (u22Var != null) {
            this.l.H().o0();
            u22Var.onActivityStopped((Activity) yf0.j(g20Var));
        }
    }

    @Override // androidx.appcompat.view.menu.im1
    public void performAction(Bundle bundle, km1 km1Var, long j) {
        j();
        km1Var.f(null);
    }

    @Override // androidx.appcompat.view.menu.im1
    public void registerOnMeasurementEventListener(gn1 gn1Var) {
        vz1 vz1Var;
        j();
        synchronized (this.m) {
            try {
                vz1Var = (vz1) this.m.get(Integer.valueOf(gn1Var.a()));
                if (vz1Var == null) {
                    vz1Var = new b(gn1Var);
                    this.m.put(Integer.valueOf(gn1Var.a()), vz1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.l.H().L(vz1Var);
    }

    @Override // androidx.appcompat.view.menu.im1
    public void resetAnalyticsData(long j) {
        j();
        g02 H = this.l.H();
        H.T(null);
        H.h().D(new x12(H, j));
    }

    @Override // androidx.appcompat.view.menu.im1
    public void setConditionalUserProperty(Bundle bundle, long j) {
        j();
        if (bundle == null) {
            this.l.l().G().a("Conditional user property must not be null");
        } else {
            this.l.H().H(bundle, j);
        }
    }

    @Override // androidx.appcompat.view.menu.im1
    public void setConsent(final Bundle bundle, final long j) {
        j();
        final g02 H = this.l.H();
        H.h().G(new Runnable() { // from class: androidx.appcompat.view.menu.s02
            @Override // java.lang.Runnable
            public final void run() {
                g02 g02Var = g02.this;
                Bundle bundle2 = bundle;
                long j2 = j;
                if (TextUtils.isEmpty(g02Var.p().G())) {
                    g02Var.G(bundle2, 0, j2);
                } else {
                    g02Var.l().M().a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // androidx.appcompat.view.menu.im1
    public void setConsentThirdParty(Bundle bundle, long j) {
        j();
        this.l.H().G(bundle, -20, j);
    }

    @Override // androidx.appcompat.view.menu.im1
    public void setCurrentScreen(g20 g20Var, String str, String str2, long j) {
        j();
        this.l.I().H((Activity) yf0.j(g20Var), str, str2);
    }

    @Override // androidx.appcompat.view.menu.im1
    public void setDataCollectionEnabled(boolean z) {
        j();
        g02 H = this.l.H();
        H.v();
        H.h().D(new h12(H, z));
    }

    @Override // androidx.appcompat.view.menu.im1
    public void setDefaultEventParameters(Bundle bundle) {
        j();
        final g02 H = this.l.H();
        final Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        H.h().D(new Runnable() { // from class: androidx.appcompat.view.menu.m02
            @Override // java.lang.Runnable
            public final void run() {
                g02.this.F(bundle2);
            }
        });
    }

    @Override // androidx.appcompat.view.menu.im1
    public void setEventInterceptor(gn1 gn1Var) {
        j();
        a aVar = new a(gn1Var);
        if (this.l.h().J()) {
            this.l.H().M(aVar);
        } else {
            this.l.h().D(new com.google.android.gms.measurement.internal.a(this, aVar));
        }
    }

    @Override // androidx.appcompat.view.menu.im1
    public void setInstanceIdProvider(in1 in1Var) {
        j();
    }

    @Override // androidx.appcompat.view.menu.im1
    public void setMeasurementEnabled(boolean z, long j) {
        j();
        this.l.H().R(Boolean.valueOf(z));
    }

    @Override // androidx.appcompat.view.menu.im1
    public void setMinimumSessionDuration(long j) {
        j();
    }

    @Override // androidx.appcompat.view.menu.im1
    public void setSessionTimeoutDuration(long j) {
        j();
        g02 H = this.l.H();
        H.h().D(new l12(H, j));
    }

    @Override // androidx.appcompat.view.menu.im1
    public void setUserId(final String str, long j) {
        j();
        final g02 H = this.l.H();
        if (str != null && TextUtils.isEmpty(str)) {
            H.a.l().L().a("User ID must be non-empty or null");
            return;
        }
        H.h().D(new Runnable() { // from class: androidx.appcompat.view.menu.v02
            @Override // java.lang.Runnable
            public final void run() {
                g02 g02Var = g02.this;
                if (g02Var.p().K(str)) {
                    g02Var.p().I();
                }
            }
        });
        H.c0(null, "_id", str, true, j);
    }

    @Override // androidx.appcompat.view.menu.im1
    public void setUserProperty(String str, String str2, g20 g20Var, boolean z, long j) {
        j();
        this.l.H().c0(str, str2, yf0.j(g20Var), z, j);
    }

    @Override // androidx.appcompat.view.menu.im1
    public void unregisterOnMeasurementEventListener(gn1 gn1Var) {
        vz1 vz1Var;
        j();
        synchronized (this.m) {
            vz1Var = (vz1) this.m.remove(Integer.valueOf(gn1Var.a()));
        }
        if (vz1Var == null) {
            vz1Var = new b(gn1Var);
        }
        this.l.H().v0(vz1Var);
    }
}
