package androidx.appcompat.view.menu;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Binder;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import androidx.appcompat.view.menu.m00;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class a7 implements n30 {
    public static final a7 o = new a7();
    public final Map l = new HashMap();
    public final List m = new ArrayList();
    public final Object n = new Object();

    /* loaded from: classes.dex */
    public class a implements IBinder.DeathRecipient {
        public final /* synthetic */ IBinder l;
        public final /* synthetic */ bk0 m;

        public a(IBinder iBinder, bk0 bk0Var) {
            this.l = iBinder;
            this.m = bk0Var;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.l.unlinkToDeath(this, 0);
            a7.this.q(this.m);
        }
    }

    public static void b(bk0 bk0Var) {
        try {
            qr.m(bk0Var.m.getBytes(), new File(ov0.r(bk0Var.s), "cmdline"));
        } catch (IOException unused) {
        }
    }

    public static a7 e() {
        return o;
    }

    public static int h(Context context, String str) {
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.equalsIgnoreCase(str.toLowerCase())) {
                    return runningAppProcessInfo.pid;
                }
            }
            return -1;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static String i(Context context, int i) {
        String str;
        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.pid == i) {
                str = next.processName;
                break;
            }
        }
        if (str != null) {
            return str;
        }
        throw new RuntimeException("processName = null");
    }

    public static void s(bk0 bk0Var) {
        qr.d(ov0.r(bk0Var.s));
    }

    public final void a(bk0 bk0Var, IBinder iBinder) {
        m00 asInterface = m00.a.asInterface(iBinder);
        if (asInterface == null) {
            p(bk0Var);
            return;
        }
        try {
            iBinder.linkToDeath(new a(iBinder, bk0Var), 0);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        bk0Var.n = asInterface;
        try {
            bk0Var.o = d4.a(asInterface.s0());
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
        bk0Var.v.open();
    }

    public bk0 c(int i) {
        synchronized (this.m) {
            try {
                for (bk0 bk0Var : this.m) {
                    if (bk0Var.q == i) {
                        return bk0Var;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public bk0 d(String str, String str2, int i) {
        synchronized (this.l) {
            try {
                Map map = (Map) this.l.get(Integer.valueOf(d7.b(i, x6.w2().y2(str))));
                if (map == null) {
                    return null;
                }
                return (bk0) map.get(str2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int f(int i, String str) {
        bk0 c = c(i);
        return c == null ? x6.w2().y2(str) : d7.a(c.r);
    }

    public List g(String str, int i) {
        synchronized (this.l) {
            try {
                Map map = (Map) this.l.get(Integer.valueOf(d7.b(i, x6.w2().y2(str))));
                if (map == null) {
                    return new ArrayList();
                }
                return new ArrayList(map.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.n30
    public void j() {
        qr.d(ov0.q());
    }

    public int k(int i) {
        bk0 c = c(i);
        if (c == null) {
            return 0;
        }
        return c.u;
    }

    public final int l() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) bv0.m().getSystemService("activity")).getRunningAppProcesses();
        HashSet hashSet = new HashSet();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            hashSet.add(Integer.valueOf(r(runningAppProcessInfo.processName)));
        }
        for (int i = 0; i < 4; i++) {
            if (!hashSet.contains(Integer.valueOf(i))) {
                return i;
            }
        }
        return -1;
    }

    public final boolean m(bk0 bk0Var) {
        p3 a2 = bk0Var.a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("SnakeEngine_client_config", a2);
        IBinder b = e9.b(jl0.b(bk0Var.c(), "_Engine_|_init_process_", null, bundle), "_Engine_|_client_");
        if (b == null || !b.isBinderAlive()) {
            return false;
        }
        a(bk0Var, b);
        b(bk0Var);
        return true;
    }

    public void n(String str) {
        synchronized (this.n) {
            synchronized (this.m) {
                ArrayList arrayList = new ArrayList(this.m);
                int y2 = x6.w2().y2(str);
                for (bk0 bk0Var : this.m) {
                    if (y2 == d7.a(bk0Var.r)) {
                        this.l.remove(Integer.valueOf(bk0Var.r));
                        p(bk0Var);
                        arrayList.remove(bk0Var);
                    }
                }
                this.m.clear();
                this.m.addAll(arrayList);
            }
        }
    }

    public void o(String str, int i) {
        synchronized (this.n) {
            try {
                int b = d7.b(i, x6.w2().y2(str));
                Map map = (Map) this.l.get(Integer.valueOf(b));
                if (map == null) {
                    return;
                }
                for (bk0 bk0Var : map.values()) {
                    p(bk0Var);
                    this.m.remove(bk0Var);
                }
                this.l.remove(Integer.valueOf(b));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(bk0 bk0Var) {
        int i = bk0Var.q;
        if (i > 0) {
            Process.killProcess(i);
            return;
        }
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) bv0.m().getSystemService("activity")).getRunningAppProcesses()) {
                int r = r(runningAppProcessInfo.processName);
                if (r != -1 && bk0Var.s == r) {
                    Process.killProcess(runningAppProcessInfo.pid);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void q(bk0 bk0Var) {
        synchronized (this.n) {
            try {
                p(bk0Var);
                Map map = (Map) this.l.get(Integer.valueOf(bk0Var.r));
                if (map != null) {
                    map.remove(bk0Var.m);
                    if (map.isEmpty()) {
                        this.l.remove(Integer.valueOf(bk0Var.r));
                    }
                }
                this.m.remove(bk0Var);
                s(bk0Var);
                sv0.k().h(bk0Var.b(), bk0Var.u);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int r(String str) {
        if (str == null) {
            return -1;
        }
        String str2 = bv0.o() + ":p";
        if (str.startsWith(str2)) {
            try {
                return Integer.parseInt(str.substring(str2.length()));
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    public void t(String str, String str2, int i) {
        synchronized (this.n) {
            try {
                int callingPid = Binder.getCallingPid();
                bk0 c = c(callingPid);
                if (c != null) {
                    p(c);
                }
                u(str, str2, i, r(i(bv0.m(), callingPid)), callingPid);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public bk0 u(String str, String str2, int i, int i2, int i3) {
        ApplicationInfo c0 = x6.w2().c0(str, 0, i);
        bk0 bk0Var = null;
        if (c0 == null) {
            return null;
        }
        int b = d7.b(i, x6.w2().y2(str));
        synchronized (this.n) {
            try {
                Map map = (Map) this.l.get(Integer.valueOf(b));
                if (map == null) {
                    map = new HashMap();
                }
                if (i2 == -1) {
                    bk0 bk0Var2 = (bk0) map.get(str2);
                    if (bk0Var2 != null) {
                        ConditionVariable conditionVariable = bk0Var2.v;
                        if (conditionVariable != null) {
                            conditionVariable.block();
                        }
                        if (bk0Var2.n != null) {
                            return bk0Var2;
                        }
                    }
                    i2 = l();
                }
                if (i2 != -1) {
                    bk0 bk0Var3 = new bk0(c0, str2);
                    bk0Var3.p = Process.myUid();
                    bk0Var3.s = i2;
                    bk0Var3.r = x6.w2().y2(str);
                    bk0Var3.t = f(i3, str);
                    bk0Var3.u = i;
                    map.put(str2, bk0Var3);
                    this.m.add(bk0Var3);
                    synchronized (this.l) {
                        this.l.put(Integer.valueOf(b), map);
                    }
                    if (m(bk0Var3)) {
                        bk0Var3.q = h(bv0.m(), nl0.c(bk0Var3.s));
                        bk0Var = bk0Var3;
                    } else {
                        map.remove(str2);
                        this.m.remove(bk0Var3);
                    }
                    return bk0Var;
                }
                throw new RuntimeException("No processes available");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
