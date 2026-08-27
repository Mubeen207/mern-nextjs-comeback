package androidx.appcompat.view.menu;

import android.app.Service;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class x3 {
    public static final x3 c = new x3();
    public final Map a = new HashMap();
    public final Handler b = bv0.h().n();

    public static x3 c() {
        return c;
    }

    public static /* synthetic */ void e(ft0 ft0Var) {
        ft0Var.f().onDestroy();
    }

    public final ft0 b(Intent intent) {
        return (ft0) this.a.get(new Intent.FilterComparison(intent));
    }

    public final Service d(ul0 ul0Var) {
        Intent intent = ul0Var.a;
        ServiceInfo serviceInfo = ul0Var.b;
        IBinder iBinder = ul0Var.c;
        ft0 b = b(intent);
        if (b == null || b.f() == null) {
            Service A2 = mv0.B2().A2(serviceInfo, iBinder);
            if (A2 == null) {
                return null;
            }
            ft0 ft0Var = new ft0();
            ft0Var.l(A2);
            this.a.put(new Intent.FilterComparison(intent), ft0Var);
            return A2;
        }
        return b.f();
    }

    public IBinder f(Intent intent) {
        Service d;
        ul0 a = ul0.a(intent);
        Intent intent2 = a.a;
        ServiceInfo serviceInfo = a.b;
        if (intent2 == null || serviceInfo == null || (d = d(a)) == null) {
            return null;
        }
        intent2.setExtrasClassLoader(d.getClassLoader());
        ft0 b = b(intent2);
        b.i(intent2);
        if (b.h(intent2)) {
            if (b.j()) {
                d.onRebind(intent2);
                b.k(false);
            }
            return b.d(intent2);
        }
        try {
            IBinder onBind = d.onBind(intent2);
            b.b(intent2, onBind);
            return onBind;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void g(Configuration configuration) {
        if (this.a.size() > 0) {
            for (ft0 ft0Var : this.a.values()) {
                try {
                    ft0Var.f().onConfigurationChanged(configuration);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public void h() {
        if (this.a.size() > 0) {
            for (ft0 ft0Var : this.a.values()) {
                try {
                    ft0Var.f().onDestroy();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        this.a.clear();
    }

    public void i() {
        if (this.a.size() > 0) {
            for (ft0 ft0Var : this.a.values()) {
                try {
                    ft0Var.f().onLowMemory();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public void j(Intent intent) {
        Service d;
        ul0 a = ul0.a(intent);
        if (a.a == null || a.b == null || (d = d(a)) == null) {
            return;
        }
        a.a.setExtrasClassLoader(d.getClassLoader());
        b(a.a).m(a.e);
    }

    public void k(int i) {
        if (this.a.size() > 0) {
            for (ft0 ft0Var : this.a.values()) {
                try {
                    ft0Var.f().onTrimMemory(i);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        r3.onDestroy();
        androidx.appcompat.view.menu.bv0.j().v(r7, androidx.appcompat.view.menu.mv0.N2());
        r6.a.remove(new android.content.Intent.FilterComparison(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(android.content.Intent r7) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.ul0 r0 = androidx.appcompat.view.menu.ul0.a(r7)
            android.content.Intent r1 = r0.a
            if (r1 == 0) goto L66
            android.content.pm.ServiceInfo r2 = r0.b
            if (r2 != 0) goto Ld
            goto L66
        Ld:
            androidx.appcompat.view.menu.gv0 r2 = androidx.appcompat.view.menu.bv0.j()     // Catch: java.lang.Throwable -> L43
            int r3 = androidx.appcompat.view.menu.mv0.N2()     // Catch: java.lang.Throwable -> L43
            androidx.appcompat.view.menu.l31 r2 = r2.w(r7, r3)     // Catch: java.lang.Throwable -> L43
            if (r2 != 0) goto L1c
            return
        L1c:
            android.app.Service r3 = r6.d(r0)     // Catch: java.lang.Throwable -> L43
            if (r3 != 0) goto L23
            return
        L23:
            android.content.Intent r0 = r0.a     // Catch: java.lang.Throwable -> L43
            java.lang.ClassLoader r4 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L43
            r0.setExtrasClassLoader(r4)     // Catch: java.lang.Throwable -> L43
            androidx.appcompat.view.menu.ft0 r0 = r6.b(r1)     // Catch: java.lang.Throwable -> L43
            int r2 = r2.a()     // Catch: java.lang.Throwable -> L43
            r4 = 1
            if (r2 != 0) goto L39
            r2 = r4
            goto L3a
        L39:
            r2 = 0
        L3a:
            if (r2 != 0) goto L45
            boolean r5 = r0.c(r1)     // Catch: java.lang.Throwable -> L43
            if (r5 == 0) goto L66
            goto L45
        L43:
            r7 = move-exception
            goto L63
        L45:
            if (r2 == 0) goto L5f
            r3.onDestroy()     // Catch: java.lang.Throwable -> L43
            androidx.appcompat.view.menu.gv0 r2 = androidx.appcompat.view.menu.bv0.j()     // Catch: java.lang.Throwable -> L43
            int r3 = androidx.appcompat.view.menu.mv0.N2()     // Catch: java.lang.Throwable -> L43
            r2.v(r7, r3)     // Catch: java.lang.Throwable -> L43
            java.util.Map r7 = r6.a     // Catch: java.lang.Throwable -> L43
            android.content.Intent$FilterComparison r2 = new android.content.Intent$FilterComparison     // Catch: java.lang.Throwable -> L43
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L43
            r7.remove(r2)     // Catch: java.lang.Throwable -> L43
        L5f:
            r0.k(r4)     // Catch: java.lang.Throwable -> L43
            goto L66
        L63:
            r7.printStackTrace()
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.x3.l(android.content.Intent):void");
    }

    public IBinder m(Intent intent) {
        ft0 b = b(intent);
        if (b == null) {
            return null;
        }
        return b.d(intent);
    }

    public void n(Intent intent) {
        final ft0 b;
        if (intent == null || (b = b(intent)) == null || b.f() == null || b.g() <= 0) {
            return;
        }
        try {
            this.b.post(new Runnable() { // from class: androidx.appcompat.view.menu.w3
                @Override // java.lang.Runnable
                public final void run() {
                    x3.e(ft0.this);
                }
            });
            bv0.j().v(intent, mv0.N2());
            this.a.remove(new Intent.FilterComparison(intent));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
