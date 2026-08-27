package androidx.appcompat.view.menu;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class e90 {
    public static final e90 a = new e90();
    public static final Map b = new HashMap();
    public static final Map c = new HashMap();

    public static final String c(String str) {
        String g;
        c60.e(str, "className");
        StringBuilder sb = new StringBuilder();
        g = zx0.g(str, ".", "_", false, 4, null);
        sb.append(g);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    public static final androidx.lifecycle.h f(Object obj) {
        c60.e(obj, "object");
        boolean z = obj instanceof androidx.lifecycle.h;
        boolean z2 = obj instanceof uj;
        if (z && z2) {
            return new androidx.lifecycle.c((uj) obj, (androidx.lifecycle.h) obj);
        }
        if (z2) {
            return new androidx.lifecycle.c((uj) obj, null);
        }
        if (z) {
            return (androidx.lifecycle.h) obj;
        }
        Class<?> cls = obj.getClass();
        e90 e90Var = a;
        if (e90Var.d(cls) == 2) {
            Object obj2 = c.get(cls);
            c60.b(obj2);
            List list = (List) obj2;
            if (list.size() == 1) {
                e90Var.a((Constructor) list.get(0), obj);
                return new androidx.lifecycle.q(null);
            }
            int size = list.size();
            androidx.lifecycle.d[] dVarArr = new androidx.lifecycle.d[size];
            for (int i = 0; i < size; i++) {
                a.a((Constructor) list.get(i), obj);
                dVarArr[i] = null;
            }
            return new androidx.lifecycle.b(dVarArr);
        }
        return new androidx.lifecycle.m(obj);
    }

    public final androidx.lifecycle.d a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            c60.d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            my0.a(newInstance);
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Constructor b(Class cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            c60.d(name, "fullPackage");
            if (name.length() != 0) {
                c60.d(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                c60.d(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            c60.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c2 = c(canonicalName);
            if (name.length() != 0) {
                c2 = name + '.' + c2;
            }
            Class<?> cls2 = Class.forName(c2);
            c60.c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public final int d(Class cls) {
        Map map = b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = g(cls);
        map.put(cls, Integer.valueOf(g));
        return g;
    }

    public final boolean e(Class cls) {
        return cls != null && c90.class.isAssignableFrom(cls);
    }

    public final int g(Class cls) {
        ArrayList arrayList;
        List b2;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b3 = b(cls);
        if (b3 != null) {
            Map map = c;
            b2 = rc.b(b3);
            map.put(cls, b2);
            return 2;
        } else if (androidx.lifecycle.a.c.d(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            if (e(superclass)) {
                c60.d(superclass, "superclass");
                if (d(superclass) == 1) {
                    return 1;
                }
                Object obj = c.get(superclass);
                c60.b(obj);
                arrayList = new ArrayList((Collection) obj);
            } else {
                arrayList = null;
            }
            Class<?>[] interfaces = cls.getInterfaces();
            c60.d(interfaces, "klass.interfaces");
            for (Class<?> cls2 : interfaces) {
                if (e(cls2)) {
                    c60.d(cls2, "intrface");
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    Object obj2 = c.get(cls2);
                    c60.b(obj2);
                    arrayList.addAll((Collection) obj2);
                }
            }
            if (arrayList != null) {
                c.put(cls, arrayList);
                return 2;
            }
            return 1;
        }
    }
}
