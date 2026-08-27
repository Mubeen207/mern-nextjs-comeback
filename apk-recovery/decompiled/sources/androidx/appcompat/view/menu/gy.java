package androidx.appcompat.view.menu;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageParser;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.appcompat.view.menu.t02;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class gy implements Handler.Callback {
    public static final Status C = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status D = new Status(4, "The user must be signed in to make this API call.");
    public static final Object E = new Object();
    public static gy F;
    public final Handler A;
    public volatile boolean B;
    public oz0 p;
    public qz0 q;
    public final Context r;
    public final dy s;
    public final rd1 t;
    public long l = 5000;
    public long m = 120000;
    public long n = 10000;
    public boolean o = false;
    public final AtomicInteger u = new AtomicInteger(1);
    public final AtomicInteger v = new AtomicInteger(0);
    public final Map w = new ConcurrentHashMap(5, 0.75f, 1);
    public kb1 x = null;
    public final Set y = new q4();
    public final Set z = new q4();

    public gy(Context context, Looper looper, dy dyVar) {
        this.B = true;
        this.r = context;
        ce1 ce1Var = new ce1(looper, this);
        this.A = ce1Var;
        this.s = dyVar;
        this.t = new rd1(dyVar);
        if (rl.a(context)) {
            this.B = false;
        }
        ce1Var.sendMessage(ce1Var.obtainMessage(6));
    }

    public static Status h(r2 r2Var, ef efVar) {
        String b = r2Var.b();
        String valueOf = String.valueOf(efVar);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(b);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(efVar, sb.toString());
    }

    public static gy x(Context context) {
        gy gyVar;
        synchronized (E) {
            try {
                if (F == null) {
                    F = new gy(context.getApplicationContext(), wx.c().getLooper(), dy.m());
                }
                gyVar = F;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gyVar;
    }

    public final void D(cy cyVar, int i, dz0 dz0Var, ez0 ez0Var, ex0 ex0Var) {
        l(ez0Var, dz0Var.d(), cyVar);
        fd1 fd1Var = new fd1(i, dz0Var, ez0Var, ex0Var);
        Handler handler = this.A;
        handler.sendMessage(handler.obtainMessage(4, new lc1(fd1Var, this.v.get(), cyVar)));
    }

    public final void E(qd0 qd0Var, int i, long j, int i2) {
        Handler handler = this.A;
        handler.sendMessage(handler.obtainMessage(18, new kc1(qd0Var, i, j, i2)));
    }

    public final void F(ef efVar, int i) {
        if (g(efVar, i)) {
            return;
        }
        Handler handler = this.A;
        handler.sendMessage(handler.obtainMessage(5, i, 0, efVar));
    }

    public final void a() {
        Handler handler = this.A;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(cy cyVar) {
        Handler handler = this.A;
        handler.sendMessage(handler.obtainMessage(7, cyVar));
    }

    public final void c(kb1 kb1Var) {
        synchronized (E) {
            try {
                if (this.x != kb1Var) {
                    this.x = kb1Var;
                    this.y.clear();
                }
                this.y.addAll(kb1Var.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(kb1 kb1Var) {
        synchronized (E) {
            try {
                if (this.x == kb1Var) {
                    this.x = null;
                    this.y.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f() {
        if (this.o) {
            return false;
        }
        yp0 a = xp0.b().a();
        if (a == null || a.i()) {
            int a2 = this.t.a(this.r, 203400000);
            return a2 == -1 || a2 == 0;
        }
        return false;
    }

    public final boolean g(ef efVar, int i) {
        return this.s.w(this.r, efVar, i);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        wb1 wb1Var;
        r2 r2Var;
        r2 r2Var2;
        r2 r2Var3;
        r2 r2Var4;
        int i = message.what;
        switch (i) {
            case 1:
                this.n = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.A.removeMessages(12);
                for (r2 r2Var5 : this.w.keySet()) {
                    Handler handler = this.A;
                    handler.sendMessageDelayed(handler.obtainMessage(12, r2Var5), this.n);
                }
                break;
            case 2:
                my0.a(message.obj);
                throw null;
            case t02.c.c /* 3 */:
                for (wb1 wb1Var2 : this.w.values()) {
                    wb1Var2.C();
                    wb1Var2.D();
                }
                break;
            case 4:
            case PackageParser.PARSE_IGNORE_PROCESSES /* 8 */:
            case 13:
                lc1 lc1Var = (lc1) message.obj;
                wb1 wb1Var3 = (wb1) this.w.get(lc1Var.c.d());
                if (wb1Var3 == null) {
                    wb1Var3 = i(lc1Var.c);
                }
                if (!wb1Var3.L() || this.v.get() == lc1Var.b) {
                    wb1Var3.E(lc1Var.a);
                    break;
                } else {
                    lc1Var.a.a(C);
                    wb1Var3.J();
                    break;
                }
                break;
            case t02.c.e /* 5 */:
                int i2 = message.arg1;
                ef efVar = (ef) message.obj;
                Iterator it = this.w.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        wb1 wb1Var4 = (wb1) it.next();
                        wb1Var = wb1Var4.r() == i2 ? wb1Var4 : null;
                    }
                }
                if (wb1Var != null) {
                    if (efVar.d() == 13) {
                        String e = this.s.e(efVar.d());
                        String f = efVar.f();
                        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 69 + String.valueOf(f).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(e);
                        sb.append(": ");
                        sb.append(f);
                        wb1.x(wb1Var, new Status(17, sb.toString()));
                        break;
                    } else {
                        wb1.x(wb1Var, h(wb1.v(wb1Var), efVar));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    new Exception();
                    break;
                }
            case t02.c.f /* 6 */:
                if (this.r.getApplicationContext() instanceof Application) {
                    v7.c((Application) this.r.getApplicationContext());
                    v7.b().a(new rb1(this));
                    if (!v7.b().e(true)) {
                        this.n = 300000L;
                        break;
                    }
                }
                break;
            case t02.c.g /* 7 */:
                i((cy) message.obj);
                break;
            case 9:
                if (this.w.containsKey(message.obj)) {
                    ((wb1) this.w.get(message.obj)).I();
                    break;
                }
                break;
            case 10:
                for (r2 r2Var6 : this.z) {
                    wb1 wb1Var5 = (wb1) this.w.remove(r2Var6);
                    if (wb1Var5 != null) {
                        wb1Var5.J();
                    }
                }
                this.z.clear();
                break;
            case 11:
                if (this.w.containsKey(message.obj)) {
                    ((wb1) this.w.get(message.obj)).K();
                    break;
                }
                break;
            case 12:
                if (this.w.containsKey(message.obj)) {
                    ((wb1) this.w.get(message.obj)).a();
                    break;
                }
                break;
            case 14:
                my0.a(message.obj);
                throw null;
            case 15:
                yb1 yb1Var = (yb1) message.obj;
                Map map = this.w;
                r2Var = yb1Var.a;
                if (map.containsKey(r2Var)) {
                    Map map2 = this.w;
                    r2Var2 = yb1Var.a;
                    wb1.A((wb1) map2.get(r2Var2), yb1Var);
                    break;
                }
                break;
            case PackageParser.PARSE_FORWARD_LOCK /* 16 */:
                yb1 yb1Var2 = (yb1) message.obj;
                Map map3 = this.w;
                r2Var3 = yb1Var2.a;
                if (map3.containsKey(r2Var3)) {
                    Map map4 = this.w;
                    r2Var4 = yb1Var2.a;
                    wb1.B((wb1) map4.get(r2Var4), yb1Var2);
                    break;
                }
                break;
            case 17:
                k();
                break;
            case 18:
                kc1 kc1Var = (kc1) message.obj;
                if (kc1Var.c == 0) {
                    j().a(new oz0(kc1Var.b, Arrays.asList(kc1Var.a)));
                    break;
                } else {
                    oz0 oz0Var = this.p;
                    if (oz0Var != null) {
                        List f2 = oz0Var.f();
                        if (oz0Var.d() != kc1Var.b || (f2 != null && f2.size() >= kc1Var.d)) {
                            this.A.removeMessages(17);
                            k();
                        } else {
                            this.p.i(kc1Var.a);
                        }
                    }
                    if (this.p == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(kc1Var.a);
                        this.p = new oz0(kc1Var.b, arrayList);
                        Handler handler2 = this.A;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), kc1Var.c);
                        break;
                    }
                }
                break;
            case 19:
                this.o = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                return false;
        }
        return true;
    }

    public final wb1 i(cy cyVar) {
        r2 d = cyVar.d();
        wb1 wb1Var = (wb1) this.w.get(d);
        if (wb1Var == null) {
            wb1Var = new wb1(this, cyVar);
            this.w.put(d, wb1Var);
        }
        if (wb1Var.L()) {
            this.z.add(d);
        }
        wb1Var.D();
        return wb1Var;
    }

    public final qz0 j() {
        if (this.q == null) {
            this.q = pz0.a(this.r);
        }
        return this.q;
    }

    public final void k() {
        oz0 oz0Var = this.p;
        if (oz0Var != null) {
            if (oz0Var.d() > 0 || f()) {
                j().a(oz0Var);
            }
            this.p = null;
        }
    }

    public final void l(ez0 ez0Var, int i, cy cyVar) {
        jc1 b;
        if (i == 0 || (b = jc1.b(this, i, cyVar.d())) == null) {
            return;
        }
        cz0 a = ez0Var.a();
        final Handler handler = this.A;
        handler.getClass();
        a.c(new Executor() { // from class: androidx.appcompat.view.menu.qb1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, b);
    }

    public final int m() {
        return this.u.getAndIncrement();
    }

    public final wb1 w(r2 r2Var) {
        return (wb1) this.w.get(r2Var);
    }
}
