package androidx.appcompat.view.menu;
/* loaded from: classes.dex */
public abstract class jv {
    public static final qu0 a = new qu0();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return fv.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class c(ClassLoader classLoader, String str) {
        qu0 qu0Var = a;
        qu0 qu0Var2 = (qu0) qu0Var.get(classLoader);
        if (qu0Var2 == null) {
            qu0Var2 = new qu0();
            qu0Var.put(classLoader, qu0Var2);
        }
        Class cls = (Class) qu0Var2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            qu0Var2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public abstract fv a(ClassLoader classLoader, String str);
}
