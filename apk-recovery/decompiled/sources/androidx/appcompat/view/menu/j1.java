package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageParser;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class j1 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            bv0.j().s((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            bv0.j().t((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            bv0.j().u((IBinder) objArr[0]);
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            rd0.f(objArr);
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return bv0.j().j((IBinder) objArr[0], mv0.N2());
        }
    }

    /* loaded from: classes.dex */
    public static class f extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            return bv0.j().k((IBinder) objArr[0], mv0.N2());
        }
    }

    /* loaded from: classes.dex */
    public static class g extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            int f = f();
            Intent[] intentArr = (Intent[]) objArr[f];
            String[] strArr = (String[]) objArr[f + 1];
            IBinder iBinder = (IBinder) objArr[f + 2];
            Bundle bundle = (Bundle) objArr[f + 3];
            if (te.e(intentArr)) {
                for (Intent intent : intentArr) {
                    intent.setExtrasClassLoader(obj.getClass().getClassLoader());
                }
                return Integer.valueOf(bv0.j().B(mv0.N2(), intentArr, strArr, iBinder, bundle));
            }
            return method.invoke(obj, objArr);
        }

        public int f() {
            return 2;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            rd0.f(objArr);
            Intent g = g(objArr);
            if ("android.intent.action.VIEW".equals(g.getAction()) && g.getData() != null) {
                String scheme = g.getData().getScheme();
                if ("http".equals(scheme) || "https".equals(scheme)) {
                    int N2 = mv0.N2();
                    Intent intent = new Intent(g);
                    intent.putExtra("url", g.getData().toString());
                    intent.putExtra("_userId", N2);
                    intent.setPackage(null);
                    intent.setComponent(new ComponentName(bv0.o(), "com.snake.helper.InternalWebBrowser"));
                    bv0.j().D(N2, intent, j(objArr), k(objArr), l(objArr), i(objArr), f(objArr), h(objArr));
                    return 0;
                }
            }
            if (g.getParcelableExtra("_S_|_target_") != null) {
                return method.invoke(obj, objArr);
            }
            if (te.c(g)) {
                if (bv0.h().c(or.a(mv0.H2(), g.getData()), mv0.N2())) {
                    return 0;
                }
                g.setData(or.b(mv0.H2(), g.getData()));
                return method.invoke(obj, objArr);
            }
            String dataString = g.getDataString();
            if (dataString != null) {
                if (dataString.equals("package:" + mv0.E2())) {
                    g.setData(Uri.parse("package:" + bv0.o()));
                }
            }
            ResolveInfo y = bv0.u().y(g, PackageParser.PARSE_IS_PRIVILEGED, j(objArr), mv0.N2());
            if (y == null) {
                String str = g.getPackage();
                if (g.getPackage() == null && g.getComponent() == null) {
                    g.setPackage(mv0.E2());
                } else {
                    str = g.getPackage();
                }
                ResolveInfo y2 = bv0.u().y(g, PackageParser.PARSE_IS_PRIVILEGED, j(objArr), mv0.N2());
                if (y2 == null) {
                    g.setPackage(str);
                    return method.invoke(obj, objArr);
                }
                y = y2;
            }
            g.setExtrasClassLoader(obj.getClass().getClassLoader());
            ActivityInfo activityInfo = y.activityInfo;
            g.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            bv0.j().D(mv0.N2(), g(objArr), j(objArr), k(objArr), l(objArr), i(objArr), f(objArr), h(objArr));
            return 0;
        }

        public final int f(Object[] objArr) {
            Object obj = objArr[y8.g() ? '\b' : (char) 7];
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            for (Object obj2 : objArr) {
                if (obj2 instanceof Integer) {
                    return ((Integer) obj2).intValue();
                }
            }
            return 0;
        }

        public final Intent g(Object[] objArr) {
            Object obj = objArr[y8.g() ? (char) 3 : (char) 2];
            if (obj instanceof Intent) {
                return (Intent) obj;
            }
            for (Object obj2 : objArr) {
                if (obj2 instanceof Intent) {
                    return (Intent) obj2;
                }
            }
            return null;
        }

        public final Bundle h(Object[] objArr) {
            Object obj = objArr[y8.g() ? '\t' : '\b'];
            if (obj instanceof Bundle) {
                return (Bundle) obj;
            }
            for (Object obj2 : objArr) {
                if (obj2 instanceof Bundle) {
                    return (Bundle) obj2;
                }
            }
            return null;
        }

        public final int i(Object[] objArr) {
            Object obj = objArr[y8.g() ? (char) 7 : (char) 6];
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            for (Object obj2 : objArr) {
                if (obj2 instanceof Integer) {
                    return ((Integer) obj2).intValue();
                }
            }
            return 0;
        }

        public final String j(Object[] objArr) {
            Object obj = objArr[y8.g() ? (char) 4 : (char) 3];
            if (obj instanceof String) {
                return (String) obj;
            }
            for (Object obj2 : objArr) {
                if (obj2 instanceof String) {
                    return (String) obj2;
                }
            }
            return null;
        }

        public final IBinder k(Object[] objArr) {
            Object obj = objArr[y8.g() ? (char) 5 : (char) 4];
            if (obj instanceof IBinder) {
                return (IBinder) obj;
            }
            for (Object obj2 : objArr) {
                if (obj2 instanceof IBinder) {
                    return (IBinder) obj2;
                }
            }
            return null;
        }

        public final String l(Object[] objArr) {
            Object obj = objArr[y8.g() ? (char) 6 : (char) 5];
            if (obj == null || (obj instanceof String)) {
                return (String) obj;
            }
            return null;
        }
    }

    public static Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put("startActivity", new h());
        hashMap.put("startActivities", new g());
        hashMap.put("activityResumed", new b());
        hashMap.put("activityDestroyed", new a());
        hashMap.put("finishActivity", new c());
        hashMap.put("getAppTasks", new d());
        hashMap.put("getCallingPackage", new f());
        hashMap.put("getCallingActivity", new e());
        return hashMap;
    }
}
