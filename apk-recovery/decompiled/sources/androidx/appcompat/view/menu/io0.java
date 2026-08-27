package androidx.appcompat.view.menu;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/* loaded from: classes.dex */
public final class io0 {
    public static final io0 a = new io0();

    public static final boolean e(String str, iw iwVar) {
        c60.e(iwVar, "block");
        try {
            return ((Boolean) iwVar.d()).booleanValue();
        } catch (ClassNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("ClassNotFound: ");
            if (str == null) {
                str = "";
            }
            sb.append(str);
            return false;
        } catch (NoSuchMethodException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NoSuchMethod: ");
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            return false;
        }
    }

    public final boolean a(iw iwVar) {
        c60.e(iwVar, "classLoader");
        try {
            iwVar.d();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean b(Method method, n70 n70Var) {
        c60.e(method, "<this>");
        c60.e(n70Var, "clazz");
        return c(method, l70.a(n70Var));
    }

    public final boolean c(Method method, Class cls) {
        c60.e(method, "<this>");
        c60.e(cls, "clazz");
        return method.getReturnType().equals(cls);
    }

    public final boolean d(Method method) {
        c60.e(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }
}
