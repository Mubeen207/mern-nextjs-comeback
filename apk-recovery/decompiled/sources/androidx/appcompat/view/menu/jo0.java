package androidx.appcompat.view.menu;

import android.os.Binder;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class jo0 {
    public final Class a;

    /* loaded from: classes.dex */
    public static class a extends c {
        public a(Constructor constructor) {
            super(constructor);
        }

        public Object b(Object... objArr) {
            try {
                return ((Constructor) this.a).newInstance(objArr);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends c {
        public b(Field field) {
            super(field);
        }

        public Object b() {
            return c(null);
        }

        public Object c(Object obj) {
            try {
                return ((Field) this.a).get(obj);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        public void d(Object obj) {
            e(null, obj);
        }

        public void e(Object obj, Object obj2) {
            try {
                ((Field) this.a).set(obj, obj2);
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public AccessibleObject a;

        public c(AccessibleObject accessibleObject) {
            if (accessibleObject == null) {
                return;
            }
            accessibleObject.setAccessible(true);
            this.a = accessibleObject;
        }

        public boolean a() {
            return this.a != null;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {
        public d(Method method) {
            super(method);
        }

        public Object b(Object obj, Object... objArr) {
            try {
                return ((Method) this.a).invoke(obj, objArr);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e extends c {
        public e(Method method) {
            super(method);
        }

        public Object b(Object... objArr) {
            try {
                return ((Method) this.a).invoke(null, objArr);
            } catch (Throwable unused) {
                return null;
            }
        }

        public Object c(Object... objArr) {
            try {
                return ((Method) this.a).invoke(null, objArr);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    public jo0(Class cls) {
        this.a = cls;
    }

    public static a A(Constructor constructor) {
        return new a(constructor);
    }

    public static b B(Field field) {
        return new b(field);
    }

    public static d C(Method method) {
        return new d(method);
    }

    public static e D(Method method) {
        return new e(method);
    }

    public static void a(Class... clsArr) {
        if (clsArr != null) {
            for (int i = 0; i < clsArr.length; i++) {
                if (clsArr[i] == null) {
                    throw new NullPointerException("parameterTypes[" + i + "] == null");
                }
            }
        }
    }

    public static void b(Class... clsArr) {
        if (clsArr != null) {
            for (int i = 0; i < clsArr.length; i++) {
                if (clsArr[i] == null) {
                    throw new NullPointerException("parameterTypes[" + i + "] == null");
                }
            }
        }
    }

    public static b d(Class cls, String str) {
        return B(r(cls, str));
    }

    public static Class f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Constructor g(Class cls, Class... clsArr) {
        a(clsArr);
        return h(cls, clsArr);
    }

    public static Constructor h(Class cls, Class... clsArr) {
        try {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(clsArr);
                declaredConstructor.setAccessible(true);
                return declaredConstructor;
            } catch (NoSuchMethodException unused) {
                Constructor b2 = mz.b(cls, clsArr);
                b2.setAccessible(true);
                return b2;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static Field i(Class cls, String str) {
        return j(cls, str);
    }

    public static Field j(Class cls, String str) {
        while (cls != null) {
            try {
                try {
                    try {
                        Field declaredField = cls.getDeclaredField(str);
                        declaredField.setAccessible(true);
                        return declaredField;
                    } catch (NoSuchFieldException unused) {
                        return k(cls, str);
                    }
                } catch (NoSuchFieldException unused2) {
                    return o(cls, str);
                }
            } catch (NoSuchFieldException unused3) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static Field k(Class cls, String str) {
        for (Field field : mz.e(cls)) {
            if (field.getName().equals(str)) {
                field.setAccessible(true);
                return field;
            }
        }
        throw new NoSuchFieldException();
    }

    public static Method l(Class cls, String str, Class... clsArr) {
        b(clsArr);
        return n(cls, str, clsArr);
    }

    public static Method m(Class cls, String str) {
        Method[] declaredMethods;
        try {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals(str)) {
                    method.setAccessible(true);
                    return method;
                }
            }
            return null;
        } catch (Throwable unused) {
            for (Executable executable : mz.d(cls)) {
                if (executable.getName().equals(str)) {
                    executable.setAccessible(true);
                    return (Method) executable;
                }
            }
            return null;
        }
    }

    public static Method n(Class cls, String str, Class... clsArr) {
        while (cls != null) {
            try {
                try {
                    Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (NoSuchMethodException unused) {
                    Method c2 = mz.c(cls, str, clsArr);
                    c2.setAccessible(true);
                    return c2;
                }
            } catch (Exception unused2) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static Field o(Class cls, String str) {
        for (Field field : mz.f(cls)) {
            if (field.getName().equals(str)) {
                field.setAccessible(true);
                return field;
            }
        }
        throw new NoSuchFieldException();
    }

    public static Constructor q(Class cls, Class... clsArr) {
        return g(cls, clsArr);
    }

    public static Field r(Class cls, String str) {
        return i(cls, str);
    }

    public static Method s(Class cls, String str, Class... clsArr) {
        return l(cls, str, clsArr);
    }

    public static d t(Class cls, String str, Class... clsArr) {
        Method s = s(cls, str, clsArr);
        if ((clsArr == null || clsArr.length == 0) && s == null) {
            s = m(cls, str);
        }
        return C(s);
    }

    public static Class v(String str) {
        return Class.forName(str);
    }

    public static jo0 w(String str) {
        return new jo0(f(str));
    }

    public static jo0 x(String str) {
        Class<?>[] declaredClasses;
        String[] split = str.split("\\$");
        if (split.length == 1) {
            return w(str);
        }
        String str2 = split[0];
        if (split[1].length() != 4) {
            return w(str);
        }
        Class f = f(str2);
        if (f == null) {
            return new jo0(f);
        }
        for (Class<?> cls : f.getDeclaredClasses()) {
            if (cls.getSuperclass() == Binder.class) {
                return new jo0(cls);
            }
        }
        return new jo0(null);
    }

    public static e y(Class cls, String str, Class... clsArr) {
        Method s = s(cls, str, clsArr);
        if ((clsArr == null || clsArr.length == 0) && s == null) {
            s = m(cls, str);
        }
        return D(s);
    }

    public a c(Class... clsArr) {
        return A(q(this.a, clsArr));
    }

    public b e(String str) {
        return d(this.a, str);
    }

    public Class p() {
        return this.a;
    }

    public d u(String str, Class... clsArr) {
        return t(this.a, str, clsArr);
    }

    public e z(String str, Class... clsArr) {
        return y(this.a, str, clsArr);
    }
}
