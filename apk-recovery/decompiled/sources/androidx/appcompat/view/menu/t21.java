package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class t21 {
    public static Object a(Object obj, int i) {
        if (obj != null && !c(obj, i)) {
            f(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    public static int b(Object obj) {
        if (obj instanceof ix) {
            return ((ix) obj).e();
        }
        if (obj instanceof iw) {
            return 0;
        }
        if (obj instanceof kw) {
            return 1;
        }
        if (obj instanceof yw) {
            return 2;
        }
        return obj instanceof ax ? 3 : -1;
    }

    public static boolean c(Object obj, int i) {
        return (obj instanceof zw) && b(obj) == i;
    }

    public static Throwable d(Throwable th) {
        return c60.i(th, t21.class.getName());
    }

    public static ClassCastException e(ClassCastException classCastException) {
        throw ((ClassCastException) d(classCastException));
    }

    public static void f(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        g(name + " cannot be cast to " + str);
    }

    public static void g(String str) {
        throw e(new ClassCastException(str));
    }
}
