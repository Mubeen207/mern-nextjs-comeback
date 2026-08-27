package androidx.appcompat.view.menu;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Binder;
import android.text.TextUtils;
import androidx.appcompat.view.menu.r00;
import androidx.appcompat.view.menu.u6;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
/* loaded from: classes.dex */
public class x6 extends r00.a implements n30 {
    public static final x6 q = new x6();
    public static final f7 r = f7.k();
    public final st0 l;
    public final ke m;
    public final List n;
    public final Map o;
    public final Object p;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (TextUtils.isEmpty(action)) {
                return;
            }
            if ("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action)) {
                x6.this.l.i();
            }
        }
    }

    public x6() {
        st0 st0Var = new st0();
        this.l = st0Var;
        this.n = new ArrayList();
        this.o = st0Var.a;
        this.p = new Object();
        this.m = new ke();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        bv0.m().registerReceiver(new a(), intentFilter);
    }

    public static String v2(String str, String str2) {
        return str2 == null ? str : str2;
    }

    public static x6 w2() {
        return q;
    }

    public List A2() {
        return new ArrayList(this.o.values());
    }

    @Override // androidx.appcompat.view.menu.r00
    public List B1(int i) {
        ArrayList arrayList;
        if (r.H1(i)) {
            synchronized (this.o) {
                try {
                    arrayList = new ArrayList();
                    for (y6 y6Var : this.o.values()) {
                        if (y6Var.a(i) && !xx.a(y6Var.m.y)) {
                            s50 s50Var = new s50();
                            s50Var.m = i;
                            s50Var.n = y6Var.m.y;
                            arrayList.add(s50Var);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public final List B2(int i, int i2) {
        ArrayList arrayList;
        if (r.H1(i2)) {
            synchronized (this.o) {
                try {
                    arrayList = new ArrayList(this.o.size());
                    for (y6 y6Var : this.o.values()) {
                        ApplicationInfo d = ch0.d(y6Var.m, i, y6Var.e(i2), i2);
                        if (d != null) {
                            arrayList.add(d);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public final p50 C2(String str, o50 o50Var, int i) {
        File file;
        System.currentTimeMillis();
        p50 p50Var = new p50();
        File file2 = null;
        try {
            f7 f7Var = r;
            if (!f7Var.H1(i)) {
                f7Var.c2(i);
            }
            if (o50Var.b(8)) {
                file = new File(ov0.f(), UUID.randomUUID().toString() + ".apk");
                try {
                    qr.c(bv0.m().getContentResolver().openInputStream(Uri.parse(str)), file);
                } catch (Throwable th) {
                    th = th;
                    file2 = file;
                    try {
                        th.printStackTrace();
                        return p50Var;
                    } finally {
                        if (file2 != null && o50Var.b(8)) {
                            qr.d(file2);
                        }
                    }
                }
            } else {
                file = new File(str);
            }
            File file3 = file;
            PackageInfo packageArchiveInfo = bv0.r().getPackageArchiveInfo(file3.getAbsolutePath(), 0);
            if (packageArchiveInfo == null) {
                p50 a2 = p50Var.a("getPackageArchiveInfo error. Please check whether APK is normal.");
                if (o50Var.b(8)) {
                    qr.d(file3);
                }
                return a2;
            } else if (!androidx.appcompat.view.menu.a.d(file3)) {
                String str2 = ((Object) packageArchiveInfo.applicationInfo.loadLabel(bv0.r())) + "[" + packageArchiveInfo.packageName + "]";
                String str3 = packageArchiveInfo.packageName;
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append("\n");
                sb.append(bv0.y() ? "The box does not support 32-bit Application" : "The box does not support 64-bit Application");
                p50 b = p50Var.b(str3, sb.toString());
                if (o50Var.b(8)) {
                    qr.d(file3);
                }
                return b;
            } else {
                PackageParser.Package F2 = F2(file3.getAbsolutePath());
                if (F2 == null) {
                    p50 a3 = p50Var.a("Parser apk error.");
                    if (o50Var.b(8)) {
                        qr.d(file3);
                    }
                    return a3;
                }
                p50Var.n = F2.packageName;
                if (o50Var.b(1)) {
                    F2.applicationInfo = bv0.r().getPackageInfo(F2.packageName, 0).applicationInfo;
                }
                y6 b2 = this.l.b(F2.packageName, F2, o50Var);
                a7.e().o(F2.packageName, i);
                if (w6.h().w(b2, i) < 0) {
                    p50 a4 = p50Var.a("Install apk error.");
                    if (o50Var.b(8)) {
                        qr.d(file3);
                    }
                    return a4;
                }
                synchronized (this.o) {
                    b2.j(true, i);
                    b2.i();
                }
                this.m.r(b2.m);
                this.m.b(b2.m);
                this.l.j(F2.packageName);
                D2(b2.m.y, i);
                if (o50Var.b(8)) {
                    qr.d(file3);
                }
                return p50Var;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // androidx.appcompat.view.menu.r00
    public ResolveInfo D(Intent intent, String str, int i, int i2) {
        if (r.H1(i2)) {
            return u2(G2(intent, str, i, i2));
        }
        return null;
    }

    public void D2(String str, int i) {
        for (eh0 eh0Var : this.n) {
            eh0Var.k(str, i);
        }
    }

    public void E2(String str, boolean z, int i) {
        for (eh0 eh0Var : this.n) {
            eh0Var.h(str, z, i);
        }
    }

    @Override // androidx.appcompat.view.menu.r00
    public boolean F1(String str, int i) {
        if (r.H1(i)) {
            synchronized (this.o) {
                try {
                    y6 y6Var = (y6) this.o.get(str);
                    if (y6Var == null) {
                        return false;
                    }
                    return y6Var.a(i);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return false;
    }

    public final PackageParser.Package F2(String str) {
        try {
            PackageParser b = gh0.b();
            PackageParser.Package c = gh0.c(b, new File(str), 0);
            gh0.a(b, c, 0);
            return c;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final List G2(Intent intent, String str, int i, int i2) {
        List j;
        ComponentName component = intent.getComponent();
        if (component == null && intent.getSelector() != null) {
            intent = intent.getSelector();
            component = intent.getComponent();
        }
        if (component != null) {
            ArrayList arrayList = new ArrayList(1);
            ActivityInfo x2 = x2(component, i, i2);
            if (x2 != null) {
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.activityInfo = x2;
                arrayList.add(resolveInfo);
                return arrayList;
            }
        }
        synchronized (this.o) {
            j = this.m.j(intent, str, i, i2);
        }
        return j;
    }

    public final List H2(Intent intent, String str, int i, int i2) {
        ComponentName component = intent.getComponent();
        if (component == null && intent.getSelector() != null) {
            intent = intent.getSelector();
            component = intent.getComponent();
        }
        Intent intent2 = intent;
        if (component != null) {
            ArrayList arrayList = new ArrayList(1);
            ServiceInfo g1 = g1(component, i, i2);
            if (g1 != null) {
                ResolveInfo resolveInfo = new ResolveInfo();
                resolveInfo.serviceInfo = g1;
                arrayList.add(resolveInfo);
            }
            return arrayList;
        }
        synchronized (this.o) {
            try {
                String str2 = intent2.getPackage();
                if (str2 == null) {
                    return this.m.p(intent2, str, i, i2);
                }
                y6 y6Var = (y6) this.o.get(str2);
                if (y6Var == null) {
                    return Collections.emptyList();
                }
                return this.m.q(intent2, str, i, y6Var.m.p, i2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.r00
    public List I0(int i, int i2) {
        return B2(i, i2);
    }

    public final int I2(int i) {
        return i | 786432;
    }

    @Override // androidx.appcompat.view.menu.r00
    public List O0(Intent intent, int i, int i2) {
        List H2 = H2(intent, intent.resolveTypeIfNeeded(bv0.m().getContentResolver()), i, i2);
        if ("android.support.customtabs.action.CustomTabsService".equals(intent.getAction())) {
            if (H2 == null) {
                H2 = new ArrayList();
            }
            ResolveInfo resolveInfo = new ResolveInfo();
            ServiceInfo serviceInfo = new ServiceInfo();
            resolveInfo.serviceInfo = serviceInfo;
            serviceInfo.packageName = "com.android.chrome";
            serviceInfo.name = "com.snake.helper.FakeCustomTabsService";
            serviceInfo.applicationInfo = bv0.m().getApplicationInfo();
            H2.add(0, resolveInfo);
        }
        return H2;
    }

    @Override // androidx.appcompat.view.menu.r00
    public p50 U0(String str, o50 o50Var, int i) {
        p50 C2;
        synchronized (this.p) {
            C2 = C2(str, o50Var, i);
        }
        return C2;
    }

    @Override // androidx.appcompat.view.menu.r00
    public ActivityInfo U1(ComponentName componentName, int i, int i2) {
        if (r.H1(i2)) {
            synchronized (this.o) {
                try {
                    u6.b f = this.m.f(componentName);
                    if (f != null) {
                        y6 y6Var = (y6) this.o.get(componentName.getPackageName());
                        if (y6Var == null) {
                            return null;
                        }
                        return ch0.c(f, i, y6Var.e(i2), i2);
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.r00
    public ResolveInfo W(Intent intent, int i, String str, int i2) {
        List H2;
        if (r.H1(i2) && (H2 = H2(intent, str, i, i2)) != null && H2.size() >= 1) {
            return (ResolveInfo) H2.get(0);
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.r00
    public List W0(Intent intent, int i, String str, int i2) {
        List list;
        if (r.H1(i2)) {
            String str2 = intent.getPackage();
            ComponentName component = intent.getComponent();
            if (component == null && intent.getSelector() != null) {
                intent = intent.getSelector();
                component = intent.getComponent();
            }
            if (component != null) {
                ArrayList arrayList = new ArrayList(1);
                ActivityInfo U1 = U1(component, i, i2);
                if (U1 != null) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    resolveInfo.activityInfo = U1;
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            }
            synchronized (this.o) {
                try {
                    if (str2 != null) {
                        y6 y6Var = (y6) this.o.get(str2);
                        if (y6Var != null) {
                            Intent intent2 = intent;
                            list = this.m.k(intent2, str, i, y6Var.m.m, i2);
                        } else {
                            list = null;
                        }
                        if ((list == null || list.isEmpty()) && list == null) {
                            list = new ArrayList();
                        }
                        return list;
                    }
                    for (y6 y6Var2 : this.o.values()) {
                        if (y6Var2 != null) {
                            Intent intent3 = intent;
                            List k = this.m.k(intent3, str, i, y6Var2.m.m, i2);
                            if (k != null && !k.isEmpty()) {
                                return k;
                            }
                        }
                    }
                    return Collections.emptyList();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.emptyList();
    }

    @Override // androidx.appcompat.view.menu.r00
    public ProviderInfo X1(ComponentName componentName, int i, int i2) {
        if (r.H1(i2)) {
            synchronized (this.o) {
                try {
                    u6.i g = this.m.g(componentName);
                    if (g != null) {
                        y6 y6Var = (y6) this.o.get(componentName.getPackageName());
                        if (y6Var == null) {
                            return null;
                        }
                        return ch0.i(g, i, y6Var.e(i2), i2);
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.r00
    public void a2(String str) {
        synchronized (this.p) {
            synchronized (this.o) {
                y6 y6Var = (y6) this.o.get(str);
                if (y6Var == null) {
                    return;
                }
                a7.e().n(str);
                for (Integer num : y6Var.b()) {
                    if (w6.h().b1(y6Var, true, num.intValue()) >= 0) {
                        E2(str, true, num.intValue());
                    }
                }
                this.l.g(str);
                this.m.r(y6Var.m);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.r00
    public List b0(Intent intent, int i, String str, int i2) {
        if (r.H1(i2)) {
            ComponentName component = intent.getComponent();
            if (component == null && intent.getSelector() != null) {
                intent = intent.getSelector();
                component = intent.getComponent();
            }
            Intent intent2 = intent;
            if (component != null) {
                ArrayList arrayList = new ArrayList(1);
                ActivityInfo o2 = o2(component, i, i2);
                if (o2 != null) {
                    ResolveInfo resolveInfo = new ResolveInfo();
                    resolveInfo.activityInfo = o2;
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            }
            synchronized (this.o) {
                try {
                    y6 y6Var = (y6) this.o.get(intent2.getPackage());
                    if (y6Var == null) {
                        return this.m.n(intent2, str, i, i2);
                    }
                    return this.m.o(intent2, str, i, y6Var.m.n, i2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.emptyList();
    }

    @Override // androidx.appcompat.view.menu.r00
    public ApplicationInfo c0(String str, int i, int i2) {
        if (r.H1(i2)) {
            if (Objects.equals(str, bv0.o())) {
                try {
                    return bv0.r().getApplicationInfo(str, i);
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            int I2 = I2(i);
            synchronized (this.o) {
                try {
                    y6 y6Var = (y6) this.o.get(str);
                    if (y6Var != null) {
                        return ch0.d(y6Var.m, I2, y6Var.e(i2), i2);
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.r00
    public int f2(int i) {
        bk0 c = a7.e().c(i);
        if (c != null) {
            return c.r;
        }
        return -1;
    }

    @Override // androidx.appcompat.view.menu.r00
    public void g(int i) {
        synchronized (this.o) {
            try {
                for (y6 y6Var : this.o.values()) {
                    t1(y6Var.m.y, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.r00
    public ServiceInfo g1(ComponentName componentName, int i, int i2) {
        if (r.H1(i2)) {
            synchronized (this.o) {
                try {
                    u6.k i3 = this.m.i(componentName);
                    if (i3 != null) {
                        y6 y6Var = (y6) this.o.get(componentName.getPackageName());
                        if (y6Var == null) {
                            return null;
                        }
                        return ch0.j(i3, i, y6Var.e(i2), i2);
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.r00
    public List g2(String str, int i, int i2, int i3) {
        if (r.H1(i3)) {
            ArrayList arrayList = new ArrayList();
            if (TextUtils.isEmpty(str)) {
                return arrayList;
            }
            arrayList.addAll(this.m.m(str, i2, i3));
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // androidx.appcompat.view.menu.n30
    public void j() {
        this.l.i();
        for (y6 y6Var : this.o.values()) {
            this.m.r(y6Var.m);
            this.m.b(y6Var.m);
        }
    }

    public void k(eh0 eh0Var) {
        this.n.add(eh0Var);
    }

    @Override // androidx.appcompat.view.menu.r00
    public String[] l1(int i, int i2) {
        String[] strArr;
        bk0 c;
        if (r.H1(i2)) {
            synchronized (this.o) {
                try {
                    ArrayList arrayList = new ArrayList();
                    for (y6 y6Var : this.o.values()) {
                        String str = y6Var.m.y;
                        if (y6Var.a(i2) && y2(str) == i) {
                            arrayList.add(str);
                        }
                    }
                    if (arrayList.isEmpty() && (c = a7.e().c(Binder.getCallingPid())) != null) {
                        arrayList.add(c.b());
                    }
                    strArr = (String[]) arrayList.toArray(new String[0]);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return strArr;
        }
        return new String[0];
    }

    @Override // androidx.appcompat.view.menu.r00
    public ResolveInfo n(Intent intent, int i, String str, int i2) {
        if (r.H1(i2)) {
            return u2(G2(intent, str, i, i2));
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.r00
    public List n1(int i, int i2) {
        ArrayList arrayList;
        if (r.H1(i2)) {
            synchronized (this.o) {
                try {
                    ArrayList arrayList2 = new ArrayList(this.o.size());
                    for (y6 y6Var : this.o.values()) {
                        PackageInfo z1 = z1(y6Var.m.y, i, i2);
                        if (z1 != null) {
                            arrayList2.add(z1);
                        }
                    }
                    arrayList = new ArrayList(arrayList2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // androidx.appcompat.view.menu.r00
    public ActivityInfo o2(ComponentName componentName, int i, int i2) {
        if (r.H1(i2)) {
            synchronized (this.o) {
                try {
                    u6.b h = this.m.h(componentName);
                    if (h != null) {
                        y6 y6Var = (y6) this.o.get(componentName.getPackageName());
                        if (y6Var == null) {
                            return null;
                        }
                        return ch0.c(h, i, y6Var.e(i2), i2);
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.r00
    public void q1(String str, int i) {
        a7.e().o(str, i);
    }

    @Override // androidx.appcompat.view.menu.r00
    public void t1(String str, int i) {
        synchronized (this.p) {
            synchronized (this.o) {
                y6 y6Var = (y6) this.o.get(str);
                if (y6Var == null) {
                    return;
                }
                if (F1(str, i)) {
                    boolean z = true;
                    if (y6Var.c().size() > 1) {
                        z = false;
                    }
                    a7.e().o(str, i);
                    if (z) {
                        this.l.g(str);
                        this.m.r(y6Var.m);
                    } else {
                        y6Var.f(i);
                        y6Var.i();
                    }
                    E2(str, z, i);
                }
            }
        }
    }

    public final ResolveInfo u2(List list) {
        if (list != null) {
            int size = list.size();
            if (size == 1) {
                return (ResolveInfo) list.get(0);
            }
            if (size > 1) {
                ResolveInfo resolveInfo = (ResolveInfo) list.get(0);
                ResolveInfo resolveInfo2 = (ResolveInfo) list.get(1);
                if (resolveInfo.priority == resolveInfo2.priority && resolveInfo.preferredOrder == resolveInfo2.preferredOrder && resolveInfo.isDefault == resolveInfo2.isDefault) {
                    return null;
                }
                return (ResolveInfo) list.get(0);
            }
            return null;
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.r00
    public void v0(String str, int i) {
        if (F1(str, i)) {
            a7.e().o(str, i);
        }
    }

    public final ActivityInfo x2(ComponentName componentName, int i, int i2) {
        int I2 = I2(i);
        synchronized (this.o) {
            try {
                u6.b f = this.m.f(componentName);
                if (f != null) {
                    y6 y6Var = (y6) this.l.a.get(componentName.getPackageName());
                    if (y6Var == null) {
                        return null;
                    }
                    return ch0.c(f, I2, y6Var.e(i2), i2);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int y2(String str) {
        y6 y6Var = (y6) this.o.get(str);
        if (y6Var != null) {
            return y6Var.n;
        }
        return -1;
    }

    @Override // androidx.appcompat.view.menu.r00
    public ProviderInfo z0(String str, int i, int i2) {
        if (r.H1(i2)) {
            return this.m.l(str, i, i2);
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.r00
    public PackageInfo z1(String str, int i, int i2) {
        y6 y6Var;
        if (r.H1(i2)) {
            if (Objects.equals(str, bv0.o())) {
                try {
                    return bv0.r().getPackageInfo(str, i);
                } catch (PackageManager.NameNotFoundException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            int I2 = I2(i);
            synchronized (this.o) {
                y6Var = (y6) this.o.get(str);
            }
            if (y6Var != null) {
                return ch0.g(y6Var, I2, y6Var.e(i2), i2);
            }
            return null;
        }
        return null;
    }

    public y6 z2(String str) {
        return (y6) this.o.get(str);
    }
}
