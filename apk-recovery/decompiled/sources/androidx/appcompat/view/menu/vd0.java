package androidx.appcompat.view.menu;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class vd0 {
    public static final vd0 a = new vd0();
    public static final a b = new a(null, null, null);
    public static a c;

    /* loaded from: classes.dex */
    public static final class a {
        public final Method a;
        public final Method b;
        public final Method c;

        public a(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    public final a a(y7 y7Var) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), y7Var.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), y7Var.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = b;
            c = aVar2;
            return aVar2;
        }
    }

    public final String b(y7 y7Var) {
        c60.e(y7Var, "continuation");
        a aVar = c;
        if (aVar == null) {
            aVar = a(y7Var);
        }
        if (aVar == b) {
            return null;
        }
        Method method = aVar.a;
        Object invoke = method != null ? method.invoke(y7Var.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
