package androidx.appcompat.view.menu;

import android.app.Activity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* loaded from: classes.dex */
public final class qf {
    public final ClassLoader a;

    /* loaded from: classes.dex */
    public static final class a implements InvocationHandler {
        public final n70 l;
        public final kw m;

        public a(n70 n70Var, kw kwVar) {
            c60.e(n70Var, "clazz");
            c60.e(kwVar, "consumer");
            this.l = n70Var;
            this.m = kwVar;
        }

        public final void a(Object obj) {
            c60.e(obj, "parameter");
            this.m.i(obj);
        }

        public final boolean b(Method method, Object[] objArr) {
            return c60.a(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        public final boolean c(Method method, Object[] objArr) {
            return c60.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        public final boolean d(Method method, Object[] objArr) {
            return c60.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        public final boolean e(Method method, Object[] objArr) {
            return c60.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            c60.e(obj, "obj");
            c60.e(method, "method");
            if (b(method, objArr)) {
                a(o70.a(this.l, objArr != null ? objArr[0] : null));
                return u31.a;
            } else if (c(method, objArr)) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            } else if (d(method, objArr)) {
                return Integer.valueOf(this.m.hashCode());
            } else {
                if (e(method, objArr)) {
                    return this.m.toString();
                }
                throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public static final class c implements b {
        public final /* synthetic */ Method a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Object c;

        public c(Method method, Object obj, Object obj2) {
            this.a = method;
            this.b = obj;
            this.c = obj2;
        }

        @Override // androidx.appcompat.view.menu.qf.b
        public void a() {
            this.a.invoke(this.b, this.c);
        }
    }

    public qf(ClassLoader classLoader) {
        c60.e(classLoader, "loader");
        this.a = classLoader;
    }

    public final Object a(n70 n70Var, kw kwVar) {
        Object newProxyInstance = Proxy.newProxyInstance(this.a, new Class[]{d()}, new a(n70Var, kwVar));
        c60.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        return newProxyInstance;
    }

    public final Class b() {
        try {
            return d();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final b c(Object obj, n70 n70Var, String str, String str2, Activity activity, kw kwVar) {
        c60.e(obj, "obj");
        c60.e(n70Var, "clazz");
        c60.e(str, "addMethodName");
        c60.e(str2, "removeMethodName");
        c60.e(activity, "activity");
        c60.e(kwVar, "consumer");
        Object a2 = a(n70Var, kwVar);
        obj.getClass().getMethod(str, Activity.class, d()).invoke(obj, activity, a2);
        return new c(obj.getClass().getMethod(str2, d()), obj, a2);
    }

    public final Class d() {
        Class<?> loadClass = this.a.loadClass("java.util.function.Consumer");
        c60.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
