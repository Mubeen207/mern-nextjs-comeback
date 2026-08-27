package androidx.appcompat.view.menu;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class z7 {
    public c A;
    public IInterface B;
    public final ArrayList C;
    public ap1 D;
    public int E;
    public final a F;
    public final b G;
    public final int H;
    public final String I;
    public volatile String J;
    public ef K;
    public boolean L;
    public volatile a12 M;
    public AtomicInteger N;
    public int l;
    public long m;
    public long n;
    public int o;
    public long p;
    public volatile String q;
    public df2 r;
    public final Context s;
    public final Looper t;
    public final wx u;
    public final ey v;
    public final Handler w;
    public final Object x;
    public final Object y;
    public l10 z;
    public static final mr[] P = new mr[0];
    public static final String[] O = {"service_esmobile", "service_googleme"};

    /* loaded from: classes.dex */
    public interface a {
        void h(int i);

        void k(Bundle bundle);
    }

    /* loaded from: classes.dex */
    public interface b {
        void j(ef efVar);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(ef efVar);
    }

    /* loaded from: classes.dex */
    public class d implements c {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.z7.c
        public final void a(ef efVar) {
            if (efVar.n()) {
                z7 z7Var = z7.this;
                z7Var.k(null, z7Var.C());
            } else if (z7.this.G != null) {
                z7.this.G.j(efVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z7(android.content.Context r10, android.os.Looper r11, int r12, androidx.appcompat.view.menu.z7.a r13, androidx.appcompat.view.menu.z7.b r14, java.lang.String r15) {
        /*
            r9 = this;
            androidx.appcompat.view.menu.wx r3 = androidx.appcompat.view.menu.wx.b(r10)
            androidx.appcompat.view.menu.ey r4 = androidx.appcompat.view.menu.ey.f()
            androidx.appcompat.view.menu.pj0.i(r13)
            androidx.appcompat.view.menu.pj0.i(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.z7.<init>(android.content.Context, android.os.Looper, int, androidx.appcompat.view.menu.z7$a, androidx.appcompat.view.menu.z7$b, java.lang.String):void");
    }

    public static /* bridge */ /* synthetic */ void c0(z7 z7Var, a12 a12Var) {
        z7Var.M = a12Var;
        if (z7Var.S()) {
            ff ffVar = a12Var.p;
            xp0.b().c(ffVar == null ? null : ffVar.p());
        }
    }

    public static /* bridge */ /* synthetic */ void d0(z7 z7Var, int i) {
        int i2;
        int i3;
        synchronized (z7Var.x) {
            i2 = z7Var.E;
        }
        if (i2 == 3) {
            z7Var.L = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = z7Var.w;
        handler.sendMessage(handler.obtainMessage(i3, z7Var.N.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean g0(z7 z7Var, int i, int i2, IInterface iInterface) {
        synchronized (z7Var.x) {
            try {
                if (z7Var.E != i) {
                    return false;
                }
                z7Var.i0(i2, iInterface);
                return true;
            } finally {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        	at java.util.BitSet.or(Unknown Source)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:732)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:811)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:88)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:706)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public static /* bridge */ /* synthetic */ boolean h0(androidx.appcompat.view.menu.z7 r2) {
        /*
            boolean r0 = r2.L
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.E()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.B()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.E()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.z7.h0(androidx.appcompat.view.menu.z7):boolean");
    }

    public Bundle A() {
        return new Bundle();
    }

    public String B() {
        return null;
    }

    public Set C() {
        return Collections.emptySet();
    }

    public final IInterface D() {
        IInterface iInterface;
        synchronized (this.x) {
            try {
                if (this.E == 5) {
                    throw new DeadObjectException();
                }
                r();
                iInterface = this.B;
                pj0.j(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String E();

    public abstract String F();

    public String G() {
        return "com.google.android.gms";
    }

    public ff H() {
        a12 a12Var = this.M;
        if (a12Var == null) {
            return null;
        }
        return a12Var.p;
    }

    public boolean I() {
        return e() >= 211700000;
    }

    public boolean J() {
        return this.M != null;
    }

    public void K(IInterface iInterface) {
        this.n = System.currentTimeMillis();
    }

    public void L(ef efVar) {
        this.o = efVar.d();
        this.p = System.currentTimeMillis();
    }

    public void M(int i) {
        this.l = i;
        this.m = System.currentTimeMillis();
    }

    public void N(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.w;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new fr1(this, i, iBinder, bundle)));
    }

    public boolean O() {
        return false;
    }

    public void P(String str) {
        this.J = str;
    }

    public void Q(int i) {
        Handler handler = this.w;
        handler.sendMessage(handler.obtainMessage(6, this.N.get(), i));
    }

    public void R(c cVar, int i, PendingIntent pendingIntent) {
        pj0.j(cVar, "Connection progress callbacks cannot be null.");
        this.A = cVar;
        Handler handler = this.w;
        handler.sendMessage(handler.obtainMessage(3, this.N.get(), i, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    public final String X() {
        String str = this.I;
        return str == null ? this.s.getClass().getName() : str;
    }

    public boolean a() {
        boolean z;
        synchronized (this.x) {
            z = this.E == 4;
        }
        return z;
    }

    public void c(String str) {
        this.q = str;
        n();
    }

    public boolean d() {
        return true;
    }

    public abstract int e();

    public final void e0(int i, Bundle bundle, int i2) {
        Handler handler = this.w;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new ju1(this, i, null)));
    }

    public boolean f() {
        boolean z;
        synchronized (this.x) {
            int i = this.E;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final mr[] g() {
        a12 a12Var = this.M;
        if (a12Var == null) {
            return null;
        }
        return a12Var.n;
    }

    public String h() {
        df2 df2Var;
        if (!a() || (df2Var = this.r) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return df2Var.b();
    }

    public final void i0(int i, IInterface iInterface) {
        df2 df2Var;
        pj0.a((i == 4) == (iInterface != null));
        synchronized (this.x) {
            try {
                this.E = i;
                this.B = iInterface;
                if (i == 1) {
                    ap1 ap1Var = this.D;
                    if (ap1Var != null) {
                        wx wxVar = this.u;
                        String c2 = this.r.c();
                        pj0.i(c2);
                        wxVar.e(c2, this.r.b(), this.r.a(), ap1Var, X(), this.r.d());
                        this.D = null;
                    }
                } else if (i == 2 || i == 3) {
                    ap1 ap1Var2 = this.D;
                    if (ap1Var2 != null && (df2Var = this.r) != null) {
                        String c3 = df2Var.c();
                        String b2 = df2Var.b();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(c3);
                        sb.append(" on ");
                        sb.append(b2);
                        wx wxVar2 = this.u;
                        String c4 = this.r.c();
                        pj0.i(c4);
                        wxVar2.e(c4, this.r.b(), this.r.a(), ap1Var2, X(), this.r.d());
                        this.N.incrementAndGet();
                    }
                    ap1 ap1Var3 = new ap1(this, this.N.get());
                    this.D = ap1Var3;
                    df2 df2Var2 = (this.E != 3 || B() == null) ? new df2(G(), F(), false, wx.a(), I()) : new df2(y().getPackageName(), B(), true, wx.a(), false);
                    this.r = df2Var2;
                    if (df2Var2.d() && e() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.r.c())));
                    }
                    wx wxVar3 = this.u;
                    String c5 = this.r.c();
                    pj0.i(c5);
                    if (!wxVar3.f(new o92(c5, this.r.b(), this.r.a(), this.r.d()), ap1Var3, X(), w())) {
                        String c6 = this.r.c();
                        String b3 = this.r.b();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("unable to connect to service: ");
                        sb2.append(c6);
                        sb2.append(" on ");
                        sb2.append(b3);
                        e0(16, null, this.N.get());
                    }
                } else if (i == 4) {
                    pj0.i(iInterface);
                    K(iInterface);
                }
            } finally {
            }
        }
    }

    public String j() {
        return this.q;
    }

    public void k(rz rzVar, Set set) {
        Bundle A = A();
        int i = this.H;
        String str = this.J;
        int i2 = ey.a;
        Scope[] scopeArr = rx.A;
        Bundle bundle = new Bundle();
        mr[] mrVarArr = rx.B;
        rx rxVar = new rx(6, i, i2, null, null, scopeArr, bundle, null, mrVarArr, mrVarArr, true, 0, false, str);
        rxVar.p = this.s.getPackageName();
        rxVar.s = A;
        if (set != null) {
            rxVar.r = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account u = u();
            if (u == null) {
                u = new Account("<<default account>>", "com.google");
            }
            rxVar.t = u;
            if (rzVar != null) {
                rxVar.q = rzVar.asBinder();
            }
        } else if (O()) {
            rxVar.t = u();
        }
        rxVar.u = P;
        rxVar.v = v();
        if (S()) {
            rxVar.y = true;
        }
        try {
            try {
                synchronized (this.y) {
                    try {
                        l10 l10Var = this.z;
                        if (l10Var != null) {
                            l10Var.Q(new xm1(this, this.N.get()), rxVar);
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                N(8, null, null, this.N.get());
            }
        } catch (DeadObjectException unused2) {
            Q(3);
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    public void l(e eVar) {
        eVar.a();
    }

    public void m(c cVar) {
        pj0.j(cVar, "Connection progress callbacks cannot be null.");
        this.A = cVar;
        i0(2, null);
    }

    public void n() {
        this.N.incrementAndGet();
        synchronized (this.C) {
            try {
                int size = this.C.size();
                for (int i = 0; i < size; i++) {
                    ((nk1) this.C.get(i)).d();
                }
                this.C.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.y) {
            this.z = null;
        }
        i0(1, null);
    }

    public boolean o() {
        return false;
    }

    public void q() {
        int h = this.v.h(this.s, e());
        if (h == 0) {
            m(new d());
            return;
        }
        i0(1, null);
        R(new d(), h, null);
    }

    public final void r() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public abstract IInterface s(IBinder iBinder);

    public boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public mr[] v() {
        return P;
    }

    public Executor w() {
        return null;
    }

    public Bundle x() {
        return null;
    }

    public final Context y() {
        return this.s;
    }

    public int z() {
        return this.H;
    }

    public z7(Context context, Looper looper, wx wxVar, ey eyVar, int i, a aVar, b bVar, String str) {
        this.q = null;
        this.x = new Object();
        this.y = new Object();
        this.C = new ArrayList();
        this.E = 1;
        this.K = null;
        this.L = false;
        this.M = null;
        this.N = new AtomicInteger(0);
        pj0.j(context, "Context must not be null");
        this.s = context;
        pj0.j(looper, "Looper must not be null");
        this.t = looper;
        pj0.j(wxVar, "Supervisor must not be null");
        this.u = wxVar;
        pj0.j(eyVar, "API availability must not be null");
        this.v = eyVar;
        this.w = new zh1(this, looper);
        this.H = i;
        this.F = aVar;
        this.G = bVar;
        this.I = str;
    }
}
