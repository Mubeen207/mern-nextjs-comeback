package androidx.appcompat.view.menu;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.appcompat.view.menu.ja0;
import androidx.appcompat.view.menu.sy0;
import androidx.appcompat.view.menu.t7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class l41 {
    public final Context a;
    public final r7 b;
    public final gp c;
    public final sa1 d;
    public final Executor e;
    public final sy0 f;
    public final ec g;
    public final ec h;
    public final xb i;

    public l41(Context context, r7 r7Var, gp gpVar, sa1 sa1Var, Executor executor, sy0 sy0Var, ec ecVar, ec ecVar2, xb xbVar) {
        this.a = context;
        this.b = r7Var;
        this.c = gpVar;
        this.d = sa1Var;
        this.e = executor;
        this.f = sy0Var;
        this.g = ecVar;
        this.h = ecVar2;
        this.i = xbVar;
    }

    public ap j(f21 f21Var) {
        sy0 sy0Var = this.f;
        final xb xbVar = this.i;
        Objects.requireNonNull(xbVar);
        return f21Var.a(ap.a().i(this.g.a()).k(this.h.a()).j("GDT_CLIENT_METRICS").h(new jo(lo.b("proto"), ((zb) sy0Var.d(new sy0.a() { // from class: androidx.appcompat.view.menu.b41
            @Override // androidx.appcompat.view.menu.sy0.a
            public final Object a() {
                return xb.this.c();
            }
        })).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final /* synthetic */ Boolean l(g21 g21Var) {
        return Boolean.valueOf(this.c.v(g21Var));
    }

    public final /* synthetic */ Iterable m(g21 g21Var) {
        return this.c.l(g21Var);
    }

    public final /* synthetic */ Object n(Iterable iterable, g21 g21Var, long j) {
        this.c.y(iterable);
        this.c.n(g21Var, this.g.a() + j);
        return null;
    }

    public final /* synthetic */ Object o(Iterable iterable) {
        this.c.f(iterable);
        return null;
    }

    public final /* synthetic */ Object p() {
        this.i.e();
        return null;
    }

    public final /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.i.a(((Integer) entry.getValue()).intValue(), ja0.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    public final /* synthetic */ Object r(g21 g21Var, long j) {
        this.c.n(g21Var, this.g.a() + j);
        return null;
    }

    public final /* synthetic */ Object s(g21 g21Var, int i) {
        this.d.a(g21Var, i + 1);
        return null;
    }

    public final /* synthetic */ void t(final g21 g21Var, final int i, Runnable runnable) {
        try {
            try {
                sy0 sy0Var = this.f;
                final gp gpVar = this.c;
                Objects.requireNonNull(gpVar);
                sy0Var.d(new sy0.a() { // from class: androidx.appcompat.view.menu.c41
                    @Override // androidx.appcompat.view.menu.sy0.a
                    public final Object a() {
                        return Integer.valueOf(gp.this.b());
                    }
                });
                if (k()) {
                    u(g21Var, i);
                } else {
                    this.f.d(new sy0.a() { // from class: androidx.appcompat.view.menu.d41
                        @Override // androidx.appcompat.view.menu.sy0.a
                        public final Object a() {
                            Object s;
                            s = l41.this.s(g21Var, i);
                            return s;
                        }
                    });
                }
            } catch (ry0 unused) {
                this.d.a(g21Var, i + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public t7 u(final g21 g21Var, int i) {
        t7 b;
        f21 a = this.b.a(g21Var.b());
        long j = 0;
        t7 e = t7.e(0L);
        while (true) {
            final long j2 = j;
            while (((Boolean) this.f.d(new sy0.a() { // from class: androidx.appcompat.view.menu.e41
                @Override // androidx.appcompat.view.menu.sy0.a
                public final Object a() {
                    Boolean l;
                    l = l41.this.l(g21Var);
                    return l;
                }
            })).booleanValue()) {
                final Iterable<bi0> iterable = (Iterable) this.f.d(new sy0.a() { // from class: androidx.appcompat.view.menu.f41
                    @Override // androidx.appcompat.view.menu.sy0.a
                    public final Object a() {
                        Iterable m;
                        m = l41.this.m(g21Var);
                        return m;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e;
                }
                if (a == null) {
                    pa0.a("Uploader", "Unknown backend for %s, deleting event batch for it...", g21Var);
                    b = t7.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (bi0 bi0Var : iterable) {
                        arrayList.add(bi0Var.b());
                    }
                    if (g21Var.e()) {
                        arrayList.add(j(a));
                    }
                    b = a.b(s7.a().b(arrayList).c(g21Var.c()).a());
                }
                e = b;
                if (e.c() == t7.a.TRANSIENT_ERROR) {
                    this.f.d(new sy0.a() { // from class: androidx.appcompat.view.menu.g41
                        @Override // androidx.appcompat.view.menu.sy0.a
                        public final Object a() {
                            Object n;
                            n = l41.this.n(iterable, g21Var, j2);
                            return n;
                        }
                    });
                    this.d.b(g21Var, i + 1, true);
                    return e;
                }
                this.f.d(new sy0.a() { // from class: androidx.appcompat.view.menu.h41
                    @Override // androidx.appcompat.view.menu.sy0.a
                    public final Object a() {
                        Object o;
                        o = l41.this.o(iterable);
                        return o;
                    }
                });
                if (e.c() == t7.a.OK) {
                    j = Math.max(j2, e.b());
                    if (g21Var.e()) {
                        this.f.d(new sy0.a() { // from class: androidx.appcompat.view.menu.i41
                            @Override // androidx.appcompat.view.menu.sy0.a
                            public final Object a() {
                                Object p;
                                p = l41.this.p();
                                return p;
                            }
                        });
                    }
                } else if (e.c() == t7.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (bi0 bi0Var2 : iterable) {
                        String j3 = bi0Var2.b().j();
                        if (hashMap.containsKey(j3)) {
                            hashMap.put(j3, Integer.valueOf(((Integer) hashMap.get(j3)).intValue() + 1));
                        } else {
                            hashMap.put(j3, 1);
                        }
                    }
                    this.f.d(new sy0.a() { // from class: androidx.appcompat.view.menu.j41
                        @Override // androidx.appcompat.view.menu.sy0.a
                        public final Object a() {
                            Object q;
                            q = l41.this.q(hashMap);
                            return q;
                        }
                    });
                }
            }
            this.f.d(new sy0.a() { // from class: androidx.appcompat.view.menu.k41
                @Override // androidx.appcompat.view.menu.sy0.a
                public final Object a() {
                    Object r;
                    r = l41.this.r(g21Var, j2);
                    return r;
                }
            });
            return e;
        }
    }

    public void v(final g21 g21Var, final int i, final Runnable runnable) {
        this.e.execute(new Runnable() { // from class: androidx.appcompat.view.menu.a41
            @Override // java.lang.Runnable
            public final void run() {
                l41.this.t(g21Var, i, runnable);
            }
        });
    }
}
