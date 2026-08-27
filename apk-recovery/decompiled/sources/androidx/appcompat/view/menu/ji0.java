package androidx.appcompat.view.menu;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ji0 {

    /* loaded from: classes.dex */
    public static final class a {
        public static final a a = new a();
        public static final Method b;
        public static final Method c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            c60.d(methods, "throwableMethods");
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (c60.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    c60.d(parameterTypes, "it.parameterTypes");
                    if (c60.a(t4.k(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            b = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (c60.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            c = method;
        }
    }

    public void a(Throwable th, Throwable th2) {
        c60.e(th, "cause");
        c60.e(th2, "exception");
        Method method = a.b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public tn0 b() {
        return new yq();
    }
}
