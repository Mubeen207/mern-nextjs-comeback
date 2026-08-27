package androidx.appcompat.view.menu;

import android.app.ActivityManager;
import android.app.IServiceConnection;
import android.app.Notification;
import android.content.ComponentName;
import android.content.IIntentReceiver;
import android.content.Intent;
import android.content.pm.PackageParser;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import android.os.IInterface;
import androidx.appcompat.view.menu.p90;
import androidx.appcompat.view.menu.vz;
import com.snake.helper.DaemonService;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class yz extends ob {

    /* loaded from: classes.dex */
    public static class a extends b {
        @Override // androidx.appcompat.view.menu.pd0
        public Object b(Object obj, Method method, Object[] objArr) {
            objArr[6] = null;
            return super.b(obj, method, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class a0 extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            bv0.j().G((ComponentName) objArr[0], (IBinder) objArr[1], mv0.N2());
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            if (y8.j()) {
                Intent intent = (Intent) objArr[2];
                String str = (String) objArr[3];
                IServiceConnection iServiceConnection = (IServiceConnection) objArr[4];
                int intExtra = intent.getIntExtra("_S_|_UserId", -1);
                if (intExtra == -1) {
                    intExtra = mv0.N2();
                }
                if (objArr.length >= 8 && (objArr[6] instanceof String)) {
                    objArr[6] = bv0.o();
                }
                long m = yz.m(objArr[5]);
                ResolveInfo B = bv0.u().B(intent, 0, str, intExtra);
                if (B != null || y3.c(intent.getComponent())) {
                    if (y8.k()) {
                        objArr[5] = Long.valueOf(m & 2147483647L);
                    } else {
                        objArr[5] = Integer.valueOf((int) (m & 2147483647L));
                    }
                    Intent g = bv0.j().g(intent, iServiceConnection == null ? null : iServiceConnection.asBinder(), str, intExtra);
                    if (iServiceConnection != null) {
                        if (intent.getComponent() == null && B != null) {
                            ServiceInfo serviceInfo = B.serviceInfo;
                            intent.setComponent(new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        }
                        IServiceConnection k = bt0.k(iServiceConnection, intent);
                        objArr[4] = k;
                        WeakReference weakReference = (WeakReference) p90.b.a.b.c(iServiceConnection);
                        if (weakReference != null) {
                            p90.b.b.e(weakReference.get(), k);
                        }
                    }
                    if (g != null) {
                        objArr[2] = g;
                        return method.invoke(obj, objArr);
                    }
                }
                return method.invoke(obj, objArr);
            }
            return method.invoke(obj, objArr);
        }

        @Override // androidx.appcompat.view.menu.pd0
        public boolean e() {
            return bv0.h().z() || bv0.h().B();
        }
    }

    /* loaded from: classes.dex */
    public static class b0 extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            IServiceConnection iServiceConnection = (IServiceConnection) objArr[0];
            if (iServiceConnection == null) {
                return method.invoke(obj, objArr);
            }
            bv0.j().H(iServiceConnection.asBinder(), mv0.N2());
            bt0 u2 = bt0.u2(iServiceConnection.asBinder());
            if (u2 != null) {
                objArr[0] = u2;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            int f = f(objArr);
            Intent intent = (Intent) objArr[f];
            Intent A = bv0.j().A(intent, (String) objArr[f + 1], mv0.N2());
            if (A != null) {
                A.setExtrasClassLoader(mv0.H2().getClassLoader());
                ml0.b(A, intent, mv0.N2());
                objArr[f] = A;
            }
            for (int i = 0; i < objArr.length; i++) {
                if (objArr[i] instanceof String[]) {
                    objArr[i] = null;
                }
            }
            return method.invoke(obj, objArr);
        }

        public int f(Object[] objArr) {
            for (int i = 0; i < objArr.length; i++) {
                if (objArr[i] instanceof Intent) {
                    return i;
                }
            }
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            IBinder iBinder;
            int f = f();
            Object obj2 = objArr[f];
            if ((obj2 instanceof String) && !nl0.j((String) obj2)) {
                if (y8.f()) {
                    objArr[1] = bv0.o();
                }
                if (obj2.equals("settings") || obj2.equals("media") || obj2.equals("telephony")) {
                    Object invoke = method.invoke(obj, objArr);
                    fg.d(invoke, (String) obj2);
                    return invoke;
                }
                ProviderInfo z = bv0.u().z((String) obj2, PackageParser.PARSE_IS_PRIVILEGED, mv0.N2());
                if (mv0.F2() == -1 || z == null) {
                    iBinder = null;
                } else {
                    p3 q = bv0.j().q(z.packageName, z.processName, mv0.N2());
                    iBinder = q.o != mv0.F2() ? bv0.j().f(z) : null;
                    objArr[f] = nl0.e(q.o);
                    objArr[g()] = Integer.valueOf(bv0.q());
                }
                if (iBinder == null) {
                    return null;
                }
                Object invoke2 = method.invoke(obj, objArr);
                vz.a.b.e(invoke2, z);
                vz.a.c.e(invoke2, new ig().m((IInterface) hg.b.b(iBinder), mv0.E2()));
                return invoke2;
            }
            return method.invoke(obj, objArr);
        }

        public final int f() {
            return y8.f() ? 2 : 1;
        }

        public final int g() {
            return f() + 1;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return q41.b.b(Integer.valueOf(mv0.N2()), "SnakeEngine", q41.c.b());
        }
    }

    /* loaded from: classes.dex */
    public static class h extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return qh0.a(new ArrayList());
        }
    }

    /* loaded from: classes.dex */
    public static class i extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return yz.n(obj, method, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class j extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return yz.n(obj, method, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class k extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return bv0.j().m(((IInterface) objArr[0]).asBinder());
        }
    }

    /* loaded from: classes.dex */
    public static class l extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            if (bv0.h().z()) {
                rd0.f(objArr);
                return method.invoke(obj, objArr);
            }
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class m extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            dq0 n = gv0.i().n(mv0.E2(), mv0.N2());
            return n == null ? new ArrayList() : n.m;
        }
    }

    /* loaded from: classes.dex */
    public static class n extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            eq0 o = gv0.i().o(mv0.E2(), mv0.N2());
            return o == null ? new ArrayList() : o.m;
        }
    }

    /* loaded from: classes.dex */
    public static class o extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return Integer.valueOf(bv0.j().p(((IInterface) objArr[0]).asBinder()));
        }
    }

    /* loaded from: classes.dex */
    public static class p extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            rd0.i(objArr);
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class q extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            if (bv0.h().z()) {
                int length = objArr.length - 1;
                if (objArr[length] instanceof String) {
                    objArr[length] = bv0.o();
                }
                return method.invoke(obj, objArr);
            }
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class r extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            if ("com.tencent.mm".equals((String) objArr[1])) {
                return null;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class s extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            rd0.h(objArr);
            return bv0.j().x((Intent) objArr[0], (String) objArr[1], mv0.N2());
        }
    }

    /* loaded from: classes.dex */
    public static class t extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            rd0.f(objArr);
            int g = g();
            Object obj2 = objArr[g];
            if (obj2 != null) {
                IIntentReceiver iIntentReceiver = (IIntentReceiver) obj2;
                IIntentReceiver j = d50.j(iIntentReceiver);
                WeakReference weakReference = (WeakReference) p90.a.C0024a.b.c(iIntentReceiver);
                if (weakReference != null) {
                    p90.a.b.e(weakReference.get(), j);
                }
                objArr[g] = j;
            }
            if (objArr[f()] != null) {
                objArr[f()] = null;
            }
            return method.invoke(obj, objArr);
        }

        public int f() {
            if (y8.h()) {
                return 6;
            }
            return y8.g() ? 5 : 4;
        }

        public int g() {
            if (y8.h()) {
                return 4;
            }
            return y8.g() ? 3 : 2;
        }
    }

    /* loaded from: classes.dex */
    public static class u extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            if (objArr.length >= 9) {
                objArr[8] = 4;
            }
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class v extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            if (objArr.length > 0 && (objArr[0] instanceof String)) {
                objArr[0] = bv0.o();
            }
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class w extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            Notification notification = (Notification) objArr[3];
            Intent intent = new Intent(bv0.m(), DaemonService.class);
            if (notification == null) {
                bv0.m().stopService(intent);
            } else if (y8.d()) {
                bv0.m().startForegroundService(intent);
            } else {
                bv0.m().startService(intent);
            }
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class x extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            objArr[1] = hz0.a((ActivityManager.TaskDescription) objArr[1]);
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class y extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            Intent intent = (Intent) objArr[1];
            String str = (String) objArr[2];
            if (bv0.u().B(intent, 0, str, mv0.N2()) == null) {
                return method.invoke(obj, objArr);
            }
            int f = f();
            return bv0.j().E(intent, str, f != -1 ? ((Boolean) objArr[f]).booleanValue() : false, mv0.N2());
        }

        public int f() {
            return y8.d() ? 3 : -1;
        }
    }

    /* loaded from: classes.dex */
    public static class z extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return Integer.valueOf(bv0.j().F((Intent) objArr[1], (String) objArr[2], mv0.N2()));
        }
    }

    public static long m(Object obj) {
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).longValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return -1L;
    }

    public static Object n(Object obj, Method method, Object[] objArr) {
        int intValue = ((Integer) objArr[0]).intValue();
        Intent[] intentArr = (Intent[]) objArr[o(objArr)];
        int a2 = r4.a(objArr, String.class);
        if (a2 == -1) {
            a2 = 1;
        }
        objArr[a2] = bv0.o();
        for (int i2 = 0; i2 < intentArr.length; i2++) {
            Intent intent = intentArr[i2];
            if (intValue == 2) {
                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName(bv0.o(), nl0.h(mv0.F2())));
                tl0.b(intent2, intent, mv0.N2());
                intentArr[i2] = intent2;
            }
        }
        IInterface iInterface = (IInterface) method.invoke(obj, objArr);
        if (iInterface != null) {
            String[] n2 = tv0.g().n(mv0.K2());
            if (n2.length < 1) {
                n2 = new String[]{bv0.o()};
            }
            bv0.j().l(iInterface.asBinder(), n2[0], mv0.K2());
        }
        return iInterface;
    }

    public static int o(Object[] objArr) {
        for (int i2 = 0; i2 < objArr.length; i2++) {
            if (objArr[i2] instanceof Intent[]) {
                return i2;
            }
        }
        return y8.g() ? 6 : 5;
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return g() != h();
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return xu0.c.b(y8.d() ? m1.b.b() : y8.a() ? l1.b.b() : null, new Object[0]);
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        xu0.b.e(y8.d() ? m1.b.b() : y8.a() ? l1.b.b() : null, obj2);
    }

    @Override // androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        d(new gi0("getAppStartMode"));
        d(new gi0("setAppLockedVerifying"));
        d(new gi0("reportJunkFromApp"));
        e("getContentProvider", new f());
        e("startService", new y());
        e("stopService", new z());
        e("stopServiceToken", new a0());
        e("bindService", new b());
        e("bindIsolatedService", new a());
        e("unbindService", new b0());
        e("getRunningAppProcesses", new m());
        e("getServices", new n());
        e("getIntentSenderWithFeature", new j());
        e("getIntentSender", new i());
        e("getPackageForIntentSender", new k());
        e("getUidForIntentSender", new o());
        e("broadcastIntent", new c());
        e("peekService", new s());
        e("registerReceiver", new t());
        e("grantUriPermission", new p());
        e("setServiceForeground", new w());
        e("getHistoricalProcessExitReasons", new h());
        e("getCurrentUser", new g());
        e("checkPermission", new d());
        e("checkPermissionForDevice", new d());
        e("checkUriPermission", new e());
        e("setTaskDescription", new x());
        e("overridePendingTransition", new r());
        e("setPackageAskScreenCompat", new v());
        e("handleIncomingUser", new q());
        e("getPersistedUriPermissions", new l());
        e("registerReceiverWithFeature", new u());
        c(j1.a());
    }
}
