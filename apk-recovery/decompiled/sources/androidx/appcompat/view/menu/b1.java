package androidx.appcompat.view.menu;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.appcompat.view.menu.g10;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class b1 {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public final Map c = new HashMap();

    /* loaded from: classes.dex */
    public class a implements IBinder.DeathRecipient {
        public final /* synthetic */ IBinder l;

        public a(IBinder iBinder) {
            this.l = iBinder;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.l.unlinkToDeath(this, 0);
            b1.this.c.remove(this.l);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public Intent a;
    }

    /* loaded from: classes.dex */
    public static class c extends g10.a {
        public final AtomicInteger l = new AtomicInteger(1);
        public final AtomicInteger m = new AtomicInteger(0);
        public ServiceInfo n;
        public Intent o;

        public void x2() {
            this.l.getAndIncrement();
        }

        public void y2() {
            this.m.incrementAndGet();
        }
    }

    public static /* synthetic */ void i(Intent intent) {
        try {
            bv0.m().startService(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public Intent c(Intent intent, IBinder iBinder, String str, int i) {
        c g;
        ResolveInfo m = m(intent, str, i);
        if (m == null) {
            return intent;
        }
        ServiceInfo serviceInfo = m.serviceInfo;
        bk0 u = a7.e().u(serviceInfo.packageName, serviceInfo.processName, i, -1, Binder.getCallingPid());
        if (u == null) {
            throw new RuntimeException("Unable to create " + serviceInfo.name);
        }
        synchronized (this.a) {
            g = g(intent);
            g.n = serviceInfo;
            if (iBinder != null && ((b) this.c.get(iBinder)) == null) {
                b bVar = new b();
                try {
                    iBinder.linkToDeath(new a(iBinder), 0);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
                bVar.a = intent;
                this.c.put(iBinder, bVar);
                g.y2();
            }
        }
        return d(intent, serviceInfo, u, g);
    }

    public final Intent d(Intent intent, ServiceInfo serviceInfo, bk0 bk0Var, c cVar) {
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(bv0.o(), nl0.i(bk0Var.s)));
        intent2.setAction(UUID.randomUUID().toString());
        ul0.b(intent2, intent, serviceInfo, cVar, bk0Var.u, cVar.l.get());
        return intent2;
    }

    public final c e(IBinder iBinder) {
        return (c) this.b.get(iBinder);
    }

    public final c f(Intent intent) {
        return (c) this.a.get(new Intent.FilterComparison(intent));
    }

    public final c g(Intent intent) {
        c f = f(intent);
        if (f == null) {
            c cVar = new c();
            cVar.o = intent;
            this.a.put(new Intent.FilterComparison(intent), cVar);
            this.b.put(cVar, cVar);
            return cVar;
        }
        return f;
    }

    public eq0 h(String str, int i) {
        ActivityManager.RunningServiceInfo runningServiceInfo;
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) bv0.m().getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
        HashMap hashMap = new HashMap();
        for (ActivityManager.RunningServiceInfo runningServiceInfo2 : runningServices) {
            hashMap.put(Integer.valueOf(runningServiceInfo2.pid), runningServiceInfo2);
        }
        eq0 eq0Var = new eq0();
        for (c cVar : this.a.values()) {
            ServiceInfo serviceInfo = cVar.n;
            bk0 d = a7.e().d(str, serviceInfo.processName, i);
            if (d != null && (runningServiceInfo = (ActivityManager.RunningServiceInfo) hashMap.get(Integer.valueOf(d.q))) != null) {
                runningServiceInfo.process = d.m;
                runningServiceInfo.service = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                eq0Var.m.add(runningServiceInfo);
            }
        }
        return eq0Var;
    }

    public void j(Intent intent) {
        if (intent == null) {
            return;
        }
        Intent intent2 = ul0.a(intent).a;
        if (intent2 != null) {
            intent = intent2;
        }
        c cVar = (c) this.a.remove(new Intent.FilterComparison(intent));
        if (cVar != null) {
            this.b.remove(cVar);
        }
    }

    public l31 k(Intent intent) {
        if (intent == null) {
            return null;
        }
        ul0 a2 = ul0.a(intent);
        ComponentName component = a2.a.getComponent();
        c f = f(a2.a);
        if (f == null) {
            return null;
        }
        l31 l31Var = new l31();
        l31Var.c(component);
        l31Var.b(f.m.get());
        l31Var.d(f.l.get());
        return l31Var;
    }

    public IBinder l(Intent intent, String str, int i) {
        ResolveInfo m = m(intent, str, i);
        if (m == null) {
            return null;
        }
        a7 e = a7.e();
        ServiceInfo serviceInfo = m.serviceInfo;
        bk0 d = e.d(serviceInfo.packageName, serviceInfo.processName, i);
        if (d == null) {
            return null;
        }
        try {
            return d.n.O1(intent);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final ResolveInfo m(Intent intent, String str, int i) {
        return x6.w2().W(intent, 0, str, i);
    }

    public void n(Intent intent, String str, int i) {
        ResolveInfo m = m(intent, str, i);
        if (m == null) {
            return;
        }
        ServiceInfo serviceInfo = m.serviceInfo;
        bk0 u = a7.e().u(serviceInfo.packageName, serviceInfo.processName, i, -1, Binder.getCallingPid());
        if (u == null) {
            throw new RuntimeException("Unable to create " + serviceInfo.name);
        }
        c g = g(intent);
        g.n = serviceInfo;
        g.x2();
        final Intent d = d(intent, serviceInfo, u, g);
        new Thread(new Runnable() { // from class: androidx.appcompat.view.menu.a1
            @Override // java.lang.Runnable
            public final void run() {
                b1.i(d);
            }
        }).start();
    }

    public int o(Intent intent, String str, int i) {
        synchronized (this.a) {
            try {
                c f = f(intent);
                if (f == null) {
                    return 0;
                }
                if (f.m.get() > 0) {
                    return 0;
                }
                f.l.set(0);
                ResolveInfo m = m(intent, str, i);
                if (m == null) {
                    return 0;
                }
                ServiceInfo serviceInfo = m.serviceInfo;
                bk0 u = a7.e().u(serviceInfo.packageName, serviceInfo.processName, i, -1, Binder.getCallingPid());
                if (u == null) {
                    return 0;
                }
                try {
                    u.n.n2(intent);
                } catch (RemoteException unused) {
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void p(IBinder iBinder, int i) {
        c e = e(iBinder);
        if (e != null) {
            o(e.o, null, i);
        }
    }

    public void q(IBinder iBinder) {
        b bVar = (b) this.c.get(iBinder);
        if (bVar == null) {
            return;
        }
        g(bVar.a).m.decrementAndGet();
        this.c.remove(iBinder);
    }
}
