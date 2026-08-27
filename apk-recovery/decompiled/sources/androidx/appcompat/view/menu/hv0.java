package androidx.appcompat.view.menu;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageParser;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.appcompat.view.menu.l00;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class hv0 extends l00.a implements n30 {
    public static final hv0 n = new hv0();
    public final Map l = new HashMap();
    public final s8 m = s8.e(x6.w2());

    public static hv0 h() {
        return n;
    }

    @Override // androidx.appcompat.view.menu.l00
    public dq0 C(String str, int i) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) bv0.m().getSystemService("activity")).getRunningAppProcesses();
        HashMap hashMap = new HashMap();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            hashMap.put(Integer.valueOf(runningAppProcessInfo.pid), runningAppProcessInfo);
        }
        List<bk0> g = a7.e().g(str, i);
        dq0 dq0Var = new dq0();
        for (bk0 bk0Var : g) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = (ActivityManager.RunningAppProcessInfo) hashMap.get(Integer.valueOf(bk0Var.q));
            if (runningAppProcessInfo2 != null) {
                runningAppProcessInfo2.processName = bk0Var.m;
                dq0Var.m.add(runningAppProcessInfo2);
            }
        }
        return dq0Var;
    }

    @Override // androidx.appcompat.view.menu.l00
    public ComponentName D1(Intent intent, String str, boolean z, int i) {
        s41 k = k(i);
        synchronized (k.a) {
            k.a.n(intent, str, i);
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.l00
    public void H(ComponentName componentName, IBinder iBinder, int i) {
        s41 k = k(i);
        synchronized (k.a) {
            k.a.p(iBinder, i);
        }
    }

    @Override // androidx.appcompat.view.menu.l00
    public void K(zh0 zh0Var) {
        this.m.b(zh0Var);
    }

    @Override // androidx.appcompat.view.menu.l00
    public void L1(IBinder iBinder, int i) {
        s41 k = k(i);
        synchronized (k.a) {
            k.a.q(iBinder);
        }
    }

    @Override // androidx.appcompat.view.menu.l00
    public void M(IBinder iBinder) {
        bk0 c = a7.e().c(Binder.getCallingPid());
        if (c == null) {
            return;
        }
        s41 k = k(c.u);
        synchronized (k.b) {
            k.b.q(c.u, iBinder);
        }
    }

    @Override // androidx.appcompat.view.menu.l00
    public p3 N0(String str, String str2, int i) {
        bk0 u = a7.e().u(str, str2, i, -1, Binder.getCallingPid());
        if (u == null) {
            return null;
        }
        return u.a();
    }

    @Override // androidx.appcompat.view.menu.l00
    public String R1(IBinder iBinder, int i) {
        s41 k = k(i);
        synchronized (k.c) {
            try {
                yh0 yh0Var = (yh0) k.c.get(iBinder);
                if (yh0Var != null) {
                    return yh0Var.b;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.l00
    public eq0 S0(String str, int i) {
        return k(i).a.h(str, i);
    }

    @Override // androidx.appcompat.view.menu.l00
    public void T1(IBinder iBinder) {
        bk0 c = a7.e().c(Binder.getCallingPid());
        if (c == null) {
            return;
        }
        s41 k = k(c.u);
        synchronized (k.b) {
            k.b.p(c.u, iBinder);
        }
    }

    @Override // androidx.appcompat.view.menu.l00
    public String X(IBinder iBinder, int i) {
        String j;
        s41 k = k(i);
        synchronized (k.b) {
            j = k.b.j(iBinder, i);
        }
        return j;
    }

    @Override // androidx.appcompat.view.menu.l00
    public int Y1(Intent intent, String str, int i) {
        int o;
        s41 k = k(i);
        synchronized (k.a) {
            o = k.a.o(intent, str, i);
        }
        return o;
    }

    @Override // androidx.appcompat.view.menu.l00
    public int Z0(int i, Intent intent, String str, IBinder iBinder, String str2, int i2, int i3, Bundle bundle) {
        int v;
        s41 k = k(i);
        synchronized (k.b) {
            v = k.b.v(i, intent, str, iBinder, str2, i2, i3, bundle);
        }
        return v;
    }

    @Override // androidx.appcompat.view.menu.l00
    public IBinder d0(Intent intent, String str, int i) {
        IBinder l;
        s41 k = k(i);
        synchronized (k.a) {
            l = k.a.l(intent, str, i);
        }
        return l;
    }

    @Override // androidx.appcompat.view.menu.l00
    public void h0(String str, String str2, int i) {
        a7.e().t(str, str2, i);
    }

    @Override // androidx.appcompat.view.menu.l00
    public IBinder i(ProviderInfo providerInfo) {
        bk0 u = a7.e().u(providerInfo.packageName, providerInfo.processName, a7.e().k(Binder.getCallingPid()), -1, Binder.getCallingPid());
        if (u != null) {
            try {
                return u.n.i(providerInfo);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        throw new RuntimeException("Unable to create process " + providerInfo.name);
    }

    @Override // androidx.appcompat.view.menu.n30
    public void j() {
        this.m.f();
    }

    public final s41 k(int i) {
        synchronized (this.l) {
            try {
                s41 s41Var = (s41) this.l.get(Integer.valueOf(i));
                if (s41Var != null) {
                    return s41Var;
                }
                s41 s41Var2 = new s41();
                this.l.put(Integer.valueOf(i), s41Var2);
                return s41Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.l00
    public void l(Intent intent, int i) {
        s41 k = k(i);
        synchronized (k.a) {
            k.a.j(intent);
        }
    }

    @Override // androidx.appcompat.view.menu.l00
    public void m(int i, IBinder iBinder, String str) {
        bk0 c = a7.e().c(Binder.getCallingPid());
        if (c == null) {
            return;
        }
        s41 k = k(c.u);
        synchronized (k.b) {
            k.b.n(c, i, iBinder, str);
        }
    }

    @Override // androidx.appcompat.view.menu.l00
    public Intent m2(Intent intent, String str, int i) {
        for (ResolveInfo resolveInfo : x6.w2().b0(intent, PackageParser.PARSE_IS_PRIVILEGED, str, i)) {
            a7 e = a7.e();
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            bk0 d = e.d(activityInfo.packageName, activityInfo.processName, i);
            if (d != null) {
                try {
                    d.n.N();
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
        }
        Intent intent2 = new Intent();
        intent2.setPackage(bv0.o());
        intent2.setComponent(null);
        intent2.setAction(intent.getAction());
        return intent2;
    }

    @Override // androidx.appcompat.view.menu.l00
    public void n0(Intent intent, int i) {
        s41 k = k(i);
        synchronized (k.b) {
            k.b.v(i, intent, null, null, null, -1, -1, null);
        }
    }

    @Override // androidx.appcompat.view.menu.l00
    public int q(IBinder iBinder, int i) {
        s41 k = k(i);
        synchronized (k.c) {
            try {
                yh0 yh0Var = (yh0) k.c.get(iBinder);
                if (yh0Var != null) {
                    return yh0Var.a;
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.l00
    public ComponentName q2(IBinder iBinder, int i) {
        ComponentName i2;
        s41 k = k(i);
        synchronized (k.b) {
            i2 = k.b.i(iBinder, i);
        }
        return i2;
    }

    @Override // androidx.appcompat.view.menu.l00
    public void r1(IBinder iBinder) {
        bk0 c = a7.e().c(Binder.getCallingPid());
        if (c == null) {
            return;
        }
        s41 k = k(c.u);
        synchronized (k.b) {
            k.b.o(c.u, iBinder);
        }
    }

    @Override // androidx.appcompat.view.menu.l00
    public Intent u(Intent intent, IBinder iBinder, String str, int i) {
        Intent c;
        s41 k = k(i);
        synchronized (k.a) {
            c = k.a.c(intent, iBinder, str, i);
        }
        return c;
    }

    @Override // androidx.appcompat.view.menu.l00
    public void u1(IBinder iBinder, String str, int i, int i2) {
        s41 k = k(i2);
        synchronized (k.c) {
            yh0 yh0Var = new yh0();
            yh0Var.a = i;
            yh0Var.b = str;
            k.c.put(iBinder, yh0Var);
        }
    }

    @Override // androidx.appcompat.view.menu.l00
    public int v1(int i, Intent[] intentArr, String[] strArr, IBinder iBinder, Bundle bundle) {
        int s;
        s41 k = k(i);
        synchronized (k.b) {
            s = k.b.s(i, intentArr, strArr, iBinder, bundle);
        }
        return s;
    }

    @Override // androidx.appcompat.view.menu.l00
    public void x1(Intent intent, zh0 zh0Var, int i) {
        List<ResolveInfo> b0 = x6.w2().b0(intent, PackageParser.PARSE_IS_PRIVILEGED, null, i);
        if (b0.isEmpty()) {
            zh0Var.a().finish();
            return;
        }
        this.m.d(zh0Var);
        for (ResolveInfo resolveInfo : b0) {
            a7 e = a7.e();
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            bk0 d = e.d(activityInfo.packageName, activityInfo.processName, i);
            if (d != null) {
                zn0 zn0Var = new zn0();
                zn0Var.m = intent;
                zn0Var.n = resolveInfo.activityInfo;
                zn0Var.o = zh0Var;
                d.n.z(zn0Var);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.l00
    public l31 y(Intent intent, int i) {
        l31 k;
        s41 k2 = k(i);
        synchronized (k2.a) {
            k = k2.a.k(intent);
        }
        return k;
    }
}
