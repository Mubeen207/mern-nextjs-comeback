package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.ArrayMap;
import androidx.appcompat.view.menu.u6;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ke {
    public final Object a = new Object();
    public final a b = new a();
    public final b c = new b();
    public final a d = new a();
    public final c e = new c();
    public final ArrayMap f = new ArrayMap();

    /* loaded from: classes.dex */
    public static final class a extends z50 {
        public final ArrayMap g;
        public int h;

        public final void A(u6.b bVar) {
            this.g.remove(bVar.a());
            int size = bVar.b.size();
            for (int i = 0; i < size; i++) {
                m((u6.c) bVar.b.get(i));
            }
        }

        public final void u(u6.b bVar, String str, List list) {
            this.g.put(bVar.a(), bVar);
            int size = bVar.b.size();
            for (int i = 0; i < size; i++) {
                u6.c cVar = (u6.c) bVar.b.get(i);
                if (list != null && "activity".equals(str)) {
                    list.add(cVar);
                }
                b(cVar);
            }
        }

        @Override // androidx.appcompat.view.menu.z50
        /* renamed from: v */
        public boolean f(String str, u6.c cVar) {
            return str.equals(cVar.t.a.y);
        }

        @Override // androidx.appcompat.view.menu.z50
        /* renamed from: w */
        public u6.c[] g(int i) {
            return new u6.c[i];
        }

        @Override // androidx.appcompat.view.menu.z50
        /* renamed from: x */
        public ResolveInfo h(u6.c cVar, int i, int i2) {
            u6.b bVar = cVar.t;
            y6 y6Var = bVar.a.x;
            if (y6Var == null) {
                return null;
            }
            ActivityInfo c = ch0.c(bVar, this.h, y6Var.e(i2), i2);
            ResolveInfo resolveInfo = new ResolveInfo();
            resolveInfo.activityInfo = c;
            if ((this.h & 64) != 0) {
                resolveInfo.filter = cVar.m;
            }
            resolveInfo.priority = cVar.m.getPriority();
            resolveInfo.preferredOrder = bVar.a.z;
            resolveInfo.match = i;
            resolveInfo.isDefault = cVar.n;
            resolveInfo.labelRes = cVar.o;
            resolveInfo.nonLocalizedLabel = cVar.p;
            resolveInfo.icon = cVar.q;
            return resolveInfo;
        }

        public List y(Intent intent, String str, int i, int i2) {
            this.h = i;
            return super.i(intent, str, (i & 65536) != 0, i2);
        }

        public List z(Intent intent, String str, int i, List list, int i2) {
            if (list == null) {
                return null;
            }
            this.h = i;
            boolean z = (i & 65536) != 0;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                ArrayList arrayList2 = ((u6.b) list.get(i3)).b;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    u6.c[] cVarArr = new u6.c[arrayList2.size()];
                    arrayList2.toArray(cVarArr);
                    arrayList.add(cVarArr);
                }
            }
            return super.j(intent, str, z, arrayList, i2);
        }

        public a() {
            this.g = new ArrayMap();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z50 {
        public final ArrayMap g;
        public int h;

        public void s(u6.i iVar) {
            this.g.put(iVar.a(), iVar);
            int size = iVar.b.size();
            for (int i = 0; i < size; i++) {
                b((u6.j) iVar.b.get(i));
            }
        }

        @Override // androidx.appcompat.view.menu.z50
        /* renamed from: t */
        public boolean c(u6.j jVar, List list) {
            ProviderInfo providerInfo = jVar.t.f;
            for (int size = list.size() - 1; size >= 0; size--) {
                ProviderInfo providerInfo2 = ((ResolveInfo) list.get(size)).providerInfo;
                if (providerInfo2.name.equals(providerInfo.name) && providerInfo2.packageName.equals(providerInfo.packageName)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.z50
        /* renamed from: u */
        public boolean f(String str, u6.j jVar) {
            return str.equals(jVar.t.a.y);
        }

        @Override // androidx.appcompat.view.menu.z50
        /* renamed from: v */
        public u6.j[] g(int i) {
            return new u6.j[i];
        }

        @Override // androidx.appcompat.view.menu.z50
        /* renamed from: w */
        public ResolveInfo h(u6.j jVar, int i, int i2) {
            u6.i iVar = jVar.t;
            y6 y6Var = iVar.a.x;
            if (y6Var == null) {
                return null;
            }
            ProviderInfo i3 = ch0.i(iVar, this.h, y6Var.e(i2), i2);
            ResolveInfo resolveInfo = new ResolveInfo();
            resolveInfo.providerInfo = i3;
            if ((this.h & 64) != 0) {
                resolveInfo.filter = jVar.m;
            }
            resolveInfo.priority = jVar.m.getPriority();
            resolveInfo.preferredOrder = iVar.a.z;
            resolveInfo.match = i;
            resolveInfo.isDefault = jVar.n;
            resolveInfo.labelRes = jVar.o;
            resolveInfo.nonLocalizedLabel = jVar.p;
            resolveInfo.icon = jVar.q;
            return resolveInfo;
        }

        public void x(u6.i iVar) {
            this.g.remove(iVar.a());
            int size = iVar.b.size();
            for (int i = 0; i < size; i++) {
                m((u6.j) iVar.b.get(i));
            }
        }

        public b() {
            this.g = new ArrayMap();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends z50 {
        public final ArrayMap g;
        public int h;

        public void s(u6.k kVar) {
            this.g.put(kVar.a(), kVar);
            int size = kVar.b.size();
            for (int i = 0; i < size; i++) {
                b((u6.l) kVar.b.get(i));
            }
        }

        @Override // androidx.appcompat.view.menu.z50
        /* renamed from: t */
        public boolean f(String str, u6.l lVar) {
            return str.equals(lVar.t.a.y);
        }

        @Override // androidx.appcompat.view.menu.z50
        /* renamed from: u */
        public u6.l[] g(int i) {
            return new u6.l[i];
        }

        @Override // androidx.appcompat.view.menu.z50
        /* renamed from: v */
        public ResolveInfo h(u6.l lVar, int i, int i2) {
            u6.k kVar = lVar.t;
            y6 y6Var = kVar.a.x;
            if (y6Var == null) {
                return null;
            }
            ServiceInfo j = ch0.j(kVar, this.h, y6Var.e(i2), i2);
            ResolveInfo resolveInfo = new ResolveInfo();
            resolveInfo.serviceInfo = j;
            if ((this.h & 64) != 0) {
                resolveInfo.filter = lVar.m;
            }
            resolveInfo.priority = lVar.m.getPriority();
            resolveInfo.preferredOrder = kVar.a.z;
            resolveInfo.match = i;
            resolveInfo.isDefault = lVar.n;
            resolveInfo.labelRes = lVar.o;
            resolveInfo.nonLocalizedLabel = lVar.p;
            resolveInfo.icon = lVar.q;
            return resolveInfo;
        }

        public List w(Intent intent, String str, int i, int i2) {
            this.h = i;
            return super.i(intent, str, (i & 65536) != 0, i2);
        }

        public List x(Intent intent, String str, int i, List list, int i2) {
            if (list == null) {
                return null;
            }
            this.h = i;
            boolean z = (i & 65536) != 0;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                ArrayList arrayList2 = ((u6.k) list.get(i3)).b;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    u6.l[] lVarArr = new u6.l[arrayList2.size()];
                    arrayList2.toArray(lVarArr);
                    arrayList.add(lVarArr);
                }
            }
            return super.j(intent, str, z, arrayList, i2);
        }

        public void y(u6.k kVar) {
            this.g.remove(kVar.a());
            int size = kVar.b.size();
            for (int i = 0; i < size; i++) {
                m((u6.l) kVar.b.get(i));
            }
        }

        public c() {
            this.g = new ArrayMap();
        }
    }

    public final void a(u6 u6Var, List list) {
        int size = u6Var.m.size();
        for (int i = 0; i < size; i++) {
            u6.b bVar = (u6.b) u6Var.m.get(i);
            ActivityInfo activityInfo = bVar.f;
            activityInfo.processName = x6.v2(u6Var.E.processName, activityInfo.processName);
            this.b.u(bVar, "activity", list);
        }
    }

    public void b(u6 u6Var) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            a(u6Var, arrayList);
            e(u6Var);
            c(u6Var);
            d(u6Var);
        }
    }

    public final void c(u6 u6Var) {
        int size = u6Var.o.size();
        for (int i = 0; i < size; i++) {
            u6.i iVar = (u6.i) u6Var.o.get(i);
            ProviderInfo providerInfo = iVar.f;
            providerInfo.processName = x6.v2(u6Var.E.processName, providerInfo.processName);
            this.c.s(iVar);
            String str = iVar.f.authority;
            if (str != null) {
                String[] split = str.split(";");
                iVar.f.authority = null;
                for (String str2 : split) {
                    if (this.f.containsKey(str2)) {
                        u6.i iVar2 = (u6.i) this.f.get(str2);
                        ComponentName a2 = (iVar2 == null || iVar2.a() == null) ? null : iVar2.a();
                        if (a2 != null) {
                            a2.getPackageName();
                        }
                    } else {
                        this.f.put(str2, iVar);
                        ProviderInfo providerInfo2 = iVar.f;
                        if (providerInfo2.authority == null) {
                            providerInfo2.authority = str2;
                        } else {
                            providerInfo2.authority = iVar.f.authority + ";" + str2;
                        }
                    }
                }
            }
        }
    }

    public final void d(u6 u6Var) {
        int size = u6Var.n.size();
        for (int i = 0; i < size; i++) {
            u6.b bVar = (u6.b) u6Var.n.get(i);
            ActivityInfo activityInfo = bVar.f;
            activityInfo.processName = x6.v2(u6Var.E.processName, activityInfo.processName);
            this.d.u(bVar, "receiver", null);
        }
    }

    public final void e(u6 u6Var) {
        int size = u6Var.p.size();
        for (int i = 0; i < size; i++) {
            u6.k kVar = (u6.k) u6Var.p.get(i);
            ServiceInfo serviceInfo = kVar.f;
            serviceInfo.processName = x6.v2(u6Var.E.processName, serviceInfo.processName);
            this.e.s(kVar);
        }
    }

    public u6.b f(ComponentName componentName) {
        u6.b bVar;
        synchronized (this.a) {
            bVar = (u6.b) this.b.g.get(componentName);
        }
        return bVar;
    }

    public u6.i g(ComponentName componentName) {
        u6.i iVar;
        synchronized (this.a) {
            iVar = (u6.i) this.c.g.get(componentName);
        }
        return iVar;
    }

    public u6.b h(ComponentName componentName) {
        u6.b bVar;
        synchronized (this.a) {
            bVar = (u6.b) this.d.g.get(componentName);
        }
        return bVar;
    }

    public u6.k i(ComponentName componentName) {
        u6.k kVar;
        synchronized (this.a) {
            kVar = (u6.k) this.e.g.get(componentName);
        }
        return kVar;
    }

    public List j(Intent intent, String str, int i, int i2) {
        List y;
        synchronized (this.a) {
            y = this.b.y(intent, str, i, i2);
        }
        return y;
    }

    public List k(Intent intent, String str, int i, List list, int i2) {
        List z;
        synchronized (this.a) {
            z = this.b.z(intent, str, i, list, i2);
        }
        return z;
    }

    public ProviderInfo l(String str, int i, int i2) {
        synchronized (this.a) {
            try {
                u6.i iVar = (u6.i) this.f.get(str);
                if (iVar == null) {
                    return null;
                }
                return ch0.i(iVar, i, iVar.a.x.e(i2), i2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List m(String str, int i, int i2) {
        ProviderInfo i3;
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            try {
                for (int size = this.c.g.size() - 1; size >= 0; size--) {
                    u6.i iVar = (u6.i) this.c.g.valueAt(size);
                    y6 y6Var = iVar.a.x;
                    if (y6Var != null) {
                        ProviderInfo providerInfo = iVar.f;
                        if (providerInfo.authority != null && ((str == null || providerInfo.processName.equals(str)) && (i3 = ch0.i(iVar, i, y6Var.e(i2), i2)) != null)) {
                            arrayList.add(i3);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public List n(Intent intent, String str, int i, int i2) {
        List y;
        synchronized (this.a) {
            y = this.d.y(intent, str, i, i2);
        }
        return y;
    }

    public List o(Intent intent, String str, int i, List list, int i2) {
        List z;
        synchronized (this.a) {
            z = this.d.z(intent, str, i, list, i2);
        }
        return z;
    }

    public List p(Intent intent, String str, int i, int i2) {
        List w;
        synchronized (this.a) {
            w = this.e.w(intent, str, i, i2);
        }
        return w;
    }

    public List q(Intent intent, String str, int i, List list, int i2) {
        List x;
        synchronized (this.a) {
            x = this.e.x(intent, str, i, list, i2);
        }
        return x;
    }

    public void r(u6 u6Var) {
        synchronized (this.a) {
            s(u6Var);
        }
    }

    public final void s(u6 u6Var) {
        String[] split;
        int size = u6Var.m.size();
        for (int i = 0; i < size; i++) {
            this.b.A((u6.b) u6Var.m.get(i));
        }
        int size2 = u6Var.o.size();
        for (int i2 = 0; i2 < size2; i2++) {
            u6.i iVar = (u6.i) u6Var.o.get(i2);
            this.c.x(iVar);
            String str = iVar.f.authority;
            if (str != null) {
                for (String str2 : str.split(";")) {
                    if (this.f.get(str2) == iVar) {
                        this.f.remove(str2);
                    }
                }
                this.f.remove(iVar.f.authority);
            }
        }
        int size3 = u6Var.n.size();
        for (int i3 = 0; i3 < size3; i3++) {
            this.d.A((u6.b) u6Var.n.get(i3));
        }
        int size4 = u6Var.p.size();
        for (int i4 = 0; i4 < size4; i4++) {
            this.e.y((u6.k) u6Var.p.get(i4));
        }
    }
}
