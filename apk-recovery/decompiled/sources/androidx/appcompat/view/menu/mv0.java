package androidx.appcompat.view.menu;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.app.Service;
import android.app.job.JobService;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.os.StrictMode;
import android.webkit.WebView;
import androidx.appcompat.view.menu.jo0;
import androidx.appcompat.view.menu.m00;
import androidx.appcompat.view.menu.t1;
import com.snake.helper.Native;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class mv0 extends m00.a {
    public static final Object q = new Object();
    public b l;
    public Application m;
    public p3 n;
    public final List o = new ArrayList();
    public final Handler p = bv0.h().n();

    /* loaded from: classes.dex */
    public class a implements IBinder.DeathRecipient {
        public final /* synthetic */ IBinder l;

        public a(IBinder iBinder) {
            this.l = iBinder;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            synchronized (mv0.q) {
                try {
                    this.l.linkToDeath(this, 0);
                } catch (RemoteException unused) {
                }
                mv0.this.n = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public String a;
        public ApplicationInfo b;
        public List c;
        public Object d;
    }

    /* loaded from: classes.dex */
    public static final class c {
        public static final mv0 a = new mv0();
    }

    public static mv0 B2() {
        return c.a;
    }

    public static Activity C2(IBinder iBinder) {
        return (Activity) t1.a.b.c(((Map) t1.e.c(bv0.D())).get(iBinder));
    }

    public static p3 D2() {
        p3 p3Var;
        synchronized (q) {
            p3Var = B2().n;
        }
        return p3Var;
    }

    public static String E2() {
        if (D2() != null) {
            return D2().m;
        }
        if (B2().m != null) {
            return B2().m.getPackageName();
        }
        return null;
    }

    public static int F2() {
        if (D2() == null) {
            return -1;
        }
        return D2().o;
    }

    public static String G2() {
        if (D2() != null) {
            return D2().n;
        }
        if (B2().l != null) {
            return B2().l.a;
        }
        return null;
    }

    public static Application H2() {
        return B2().m;
    }

    public static int I2() {
        return d7.a(J2());
    }

    public static int J2() {
        if (D2() == null) {
            return 10000;
        }
        return D2().p;
    }

    public static int K2() {
        return D2() == null ? bv0.p() : D2().s;
    }

    public static List M2() {
        return B2().o;
    }

    public static int N2() {
        if (D2() == null) {
            return 0;
        }
        return D2().r;
    }

    public static void Q2(Object obj, Context context, ProviderInfo providerInfo, Object obj2) {
        jo0.d dVar = t1.p;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        dVar.b(obj, context, obj2, providerInfo, bool, bool2, bool2);
    }

    public static boolean T2() {
        return true;
    }

    public static /* synthetic */ void V2(IBinder iBinder) {
        Map map = (Map) t1.e.c(bv0.D());
        if (map.isEmpty() || map.get(iBinder) == null) {
            return;
        }
        Activity C2 = C2(iBinder);
        while (C2.getParent() != null) {
            C2 = C2.getParent();
        }
        k1.a(iBinder, ((Integer) c1.e.c(C2)).intValue(), (Intent) c1.f.c(C2));
        c1.c.e(C2, Boolean.TRUE);
    }

    public static /* synthetic */ void W2(Intent intent, IBinder iBinder) {
        try {
            intent = (Intent) fo0.b.b(intent, bv0.o());
        } catch (Throwable unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("handleNewIntent: ");
        sb.append(intent);
        Object D = bv0.D();
        Map map = (Map) t1.e.c(D);
        Object obj = map != null ? map.get(iBinder) : null;
        if (obj == null) {
            return;
        }
        List singletonList = Collections.singletonList(intent);
        if (u1.d.a()) {
            u1.d.b(D, obj, singletonList);
        } else if (u1.c.a()) {
            u1.c.b(D, iBinder, singletonList);
        } else if (u1.b.a()) {
            u1.b.b(D, iBinder, singletonList, Boolean.FALSE);
        }
    }

    public static Context z2(ApplicationInfo applicationInfo) {
        try {
            return bv0.m().createPackageContext(applicationInfo.packageName, 3);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Service A2(ServiceInfo serviceInfo, IBinder iBinder) {
        if (!B2().S2()) {
            B2().x2(serviceInfo.packageName, serviceInfo.processName);
        }
        try {
            Service service = (Service) ((ClassLoader) p90.h.b(this.l.d, new Object[0])).loadClass(serviceInfo.name).newInstance();
            try {
                Context createPackageContext = bv0.m().createPackageContext(serviceInfo.packageName, 3);
                tg.e.b(createPackageContext, service);
                at0.b.b(service, createPackageContext, bv0.D(), serviceInfo.name, iBinder, this.m, l1.c.b(new Object[0]));
                mg.a(createPackageContext);
                service.onCreate();
                return service;
            } catch (Exception e) {
                throw new RuntimeException("Unable to create service " + serviceInfo.name + ": " + e, e);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public Object L2() {
        return this.l.d;
    }

    @Override // androidx.appcompat.view.menu.m00
    public void N() {
        if (S2()) {
            return;
        }
        x2(E2(), G2());
    }

    @Override // androidx.appcompat.view.menu.m00
    public IBinder O1(Intent intent) {
        return x3.c().m(intent);
    }

    public synchronized void O2(String str, String str2) {
        try {
            if (S2()) {
                return;
            }
            PackageInfo m = bv0.u().m(str, 8, N2());
            ApplicationInfo applicationInfo = m.applicationInfo;
            if (m.providers == null) {
                m.providers = new ProviderInfo[0];
            }
            this.o.addAll(Arrays.asList(m.providers));
            il0.a(this.o);
            Object c2 = t1.f.c(bv0.D());
            Context z2 = z2(applicationInfo);
            Object c3 = tg.c.c(z2);
            jo0.b bVar = p90.g;
            Boolean bool = Boolean.FALSE;
            bVar.e(c3, bool);
            p90.f.e(c3, applicationInfo);
            int i = applicationInfo.targetSdkVersion;
            if (i < 9) {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitNetwork().build());
            }
            if (y8.c() && i < 24) {
                kx0.a();
            }
            if (y8.e()) {
                WebView.setDataDirectorySuffix(N2() + ":" + str + ":" + str2);
            }
            j71.a(str2, applicationInfo);
            x41.c.b(x41.b.b(new Object[0]), Integer.valueOf(applicationInfo.targetSdkVersion));
            if (y8.h()) {
                jd.b.b(Integer.valueOf(applicationInfo.targetSdkVersion));
            }
            Native.i(Build.VERSION.SDK_INT);
            e20.d().c(z2);
            b bVar2 = new b();
            bVar2.b = applicationInfo;
            bVar2.a = str2;
            bVar2.d = c3;
            bVar2.c = this.o;
            t1.b.d.e(c2, new ComponentName(bVar2.b.packageName, Instrumentation.class.getName()));
            t1.b.b.e(c2, bVar2.b);
            t1.b.c.e(c2, bVar2.d);
            t1.b.e.e(c2, bVar2.a);
            t1.b.f.e(c2, bVar2.c);
            this.l = bVar2;
            Security.removeProvider("AndroidNSSP");
            ze0.b.b(z2);
            try {
                a3(str, str2, z2);
                Application application = (Application) p90.i.b(c3, bool, null);
                zh.a(application);
                r3.c();
                this.m = application;
                t1.h.e(bv0.D(), this.m);
                mg.a((Context) t1.m.b(bv0.D(), new Object[0]));
                mg.a(this.m);
                R2(this.m, bVar2.a, bVar2.c);
                Z2(str, str2, application);
                r3.g().callApplicationOnCreate(application);
                Y2(str, str2, application);
                nz.c().b(ry.class);
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Unable to makeApplication", e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void P2(p3 p3Var) {
        synchronized (q) {
            try {
                p3 p3Var2 = this.n;
                if (p3Var2 != null && !p3Var2.m.equals(p3Var.m)) {
                    throw new RuntimeException("Reject init process: " + p3Var.n + ", this process is: " + this.n.n);
                }
                this.n = p3Var;
                IBinder asBinder = asBinder();
                try {
                    asBinder.linkToDeath(new a(asBinder), 0);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void R2(Context context, String str, List list) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ProviderInfo providerInfo = (ProviderInfo) it.next();
                try {
                    if (str.equals(providerInfo.processName) || providerInfo.processName.equals(context.getPackageName()) || providerInfo.multiprocess) {
                        Q2(bv0.D(), context, providerInfo, null);
                    }
                } catch (Throwable unused) {
                }
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            fg.c();
        }
    }

    public boolean S2() {
        return this.l != null;
    }

    public final /* synthetic */ void U2(String str, String str2, ConditionVariable conditionVariable) {
        O2(str, str2);
        conditionVariable.open();
    }

    @Override // androidx.appcompat.view.menu.m00
    public void W1(String str) {
    }

    public final /* synthetic */ void X2(zn0 zn0Var) {
        Intent intent = zn0Var.m;
        ActivityInfo activityInfo = zn0Var.n;
        BroadcastReceiver.PendingResult a2 = zn0Var.o.a();
        try {
            Context baseContext = this.m.getBaseContext();
            ClassLoader classLoader = baseContext.getClassLoader();
            intent.setExtrasClassLoader(classLoader);
            BroadcastReceiver broadcastReceiver = (BroadcastReceiver) classLoader.loadClass(activityInfo.name).newInstance();
            t8.c.b(broadcastReceiver, a2);
            broadcastReceiver.onReceive(baseContext, intent);
            BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) t8.b.b(broadcastReceiver, new Object[0]);
            if (pendingResult != null) {
                pendingResult.finish();
            }
            bv0.j().h(zn0Var.o);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void Y2(String str, String str2, Application application) {
        Iterator it = bv0.h().i().iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            N2();
            throw null;
        }
    }

    public final void Z2(String str, String str2, Application application) {
        Iterator it = bv0.h().i().iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            N2();
            throw null;
        }
    }

    public final void a3(String str, String str2, Context context) {
        Iterator it = bv0.h().i().iterator();
        if (it.hasNext()) {
            my0.a(it.next());
            N2();
            throw null;
        }
    }

    @Override // androidx.appcompat.view.menu.m00
    public void e2(final IBinder iBinder) {
        this.p.post(new Runnable() { // from class: androidx.appcompat.view.menu.iv0
            @Override // java.lang.Runnable
            public final void run() {
                mv0.V2(iBinder);
            }
        });
    }

    @Override // androidx.appcompat.view.menu.m00
    public IBinder i(ProviderInfo providerInfo) {
        if (!S2()) {
            x2(D2().m, D2().n);
        }
        for (String str : providerInfo.authority.split(";")) {
            IInterface iInterface = (IInterface) dg.b.c(bv0.m().getContentResolver().acquireContentProviderClient(str));
            if (iInterface != null) {
                return iInterface.asBinder();
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.m00
    public void n2(Intent intent) {
        x3.c().n(intent);
    }

    @Override // androidx.appcompat.view.menu.m00
    public IBinder s0() {
        return (IBinder) t1.l.b(bv0.D(), new Object[0]);
    }

    @Override // androidx.appcompat.view.menu.m00
    public void t(final IBinder iBinder, final Intent intent) {
        this.p.post(new Runnable() { // from class: androidx.appcompat.view.menu.jv0
            @Override // java.lang.Runnable
            public final void run() {
                mv0.W2(intent, iBinder);
            }
        });
    }

    public void x2(final String str, final String str2) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            O2(str, str2);
            return;
        }
        final ConditionVariable conditionVariable = new ConditionVariable();
        bv0.h().n().post(new Runnable() { // from class: androidx.appcompat.view.menu.lv0
            @Override // java.lang.Runnable
            public final void run() {
                mv0.this.U2(str, str2, conditionVariable);
            }
        });
        conditionVariable.block();
    }

    public JobService y2(ServiceInfo serviceInfo) {
        if (!B2().S2()) {
            B2().x2(serviceInfo.packageName, serviceInfo.processName);
        }
        try {
            JobService jobService = (JobService) ((ClassLoader) p90.h.b(this.l.d, new Object[0])).loadClass(serviceInfo.name).newInstance();
            try {
                Context createPackageContext = bv0.m().createPackageContext(serviceInfo.packageName, 3);
                tg.e.b(createPackageContext, jobService);
                at0.b.b(jobService, createPackageContext, bv0.D(), serviceInfo.name, B2().s0(), this.m, l1.c.b(new Object[0]));
                mg.a(createPackageContext);
                jobService.onCreate();
                jobService.onBind(null);
                return jobService;
            } catch (Exception e) {
                throw new RuntimeException("Unable to create JobService " + serviceInfo.name + ": " + e, e);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // androidx.appcompat.view.menu.m00
    public void z(final zn0 zn0Var) {
        if (!S2()) {
            N();
        }
        this.p.post(new Runnable() { // from class: androidx.appcompat.view.menu.kv0
            @Override // java.lang.Runnable
            public final void run() {
                mv0.this.X2(zn0Var);
            }
        });
    }
}
