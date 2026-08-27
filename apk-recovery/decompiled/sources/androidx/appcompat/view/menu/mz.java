package androidx.appcompat.view.menu;

import androidx.appcompat.view.menu.hz;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public abstract class mz {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;

    static {
        long objectFieldOffset;
        long objectFieldOffset2;
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", new Class[0]).invoke(null, new Object[0]);
            a = unsafe;
            fh fhVar = new fh();
            Class<?> loadClass = fhVar.loadClass(Executable.class.getName());
            Class<?> loadClass2 = fhVar.loadClass(MethodHandle.class.getName());
            Class<?> loadClass3 = fhVar.loadClass(Class.class.getName());
            b = unsafe.objectFieldOffset(loadClass.getDeclaredField("artMethod"));
            c = unsafe.objectFieldOffset(loadClass.getDeclaredField("declaringClass"));
            d = unsafe.objectFieldOffset(loadClass2.getDeclaredField("artFieldOrMethod"));
            try {
                objectFieldOffset = unsafe.objectFieldOffset(loadClass3.getDeclaredField("fields"));
                objectFieldOffset2 = objectFieldOffset;
            } catch (NoSuchFieldException unused) {
                Unsafe unsafe2 = a;
                objectFieldOffset = unsafe2.objectFieldOffset(loadClass3.getDeclaredField("iFields"));
                objectFieldOffset2 = unsafe2.objectFieldOffset(loadClass3.getDeclaredField("sFields"));
            }
            f = objectFieldOffset;
            g = objectFieldOffset2;
            Unsafe unsafe3 = a;
            long objectFieldOffset3 = unsafe3.objectFieldOffset(loadClass3.getDeclaredField("methods"));
            e = objectFieldOffset3;
            Method declaredMethod = hz.f.class.getDeclaredMethod("a", new Class[0]);
            Method declaredMethod2 = hz.f.class.getDeclaredMethod("b", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            MethodHandle unreflect = MethodHandles.lookup().unreflect(declaredMethod);
            MethodHandle unreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
            long j2 = d;
            long j3 = unsafe3.getLong(unreflect, j2);
            long j4 = unsafe3.getLong(unreflect2, j2);
            long j5 = unsafe3.getLong(hz.f.class, objectFieldOffset3);
            long j6 = j4 - j3;
            h = j6;
            i = (j3 - j5) - j6;
            Field declaredField = hz.f.class.getDeclaredField("i");
            Field declaredField2 = hz.f.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle unreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle unreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            long j7 = unsafe3.getLong(unreflectGetter, j2);
            long j8 = unsafe3.getLong(unreflectGetter2, j2);
            long j9 = unsafe3.getLong(hz.f.class, objectFieldOffset);
            j = j8 - j7;
            k = j7 - j9;
        } catch (ReflectiveOperationException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static boolean a(String... strArr) {
        Set set = hz.a;
        set.addAll(Arrays.asList(strArr));
        String[] strArr2 = new String[set.size()];
        set.toArray(strArr2);
        return h(strArr2);
    }

    public static Constructor b(Class cls, Class... clsArr) {
        for (Executable executable : d(cls)) {
            if (executable instanceof Constructor) {
                Class<?>[] parameterTypes = executable.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    for (int i2 = 0; i2 < clsArr.length; i2++) {
                        if (clsArr[i2] != parameterTypes[i2]) {
                            break;
                        }
                    }
                    return (Constructor) executable;
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching constructor");
    }

    public static Method c(Class cls, String str, Class... clsArr) {
        for (Executable executable : d(cls)) {
            if (executable.getName().equals(str) && (executable instanceof Method)) {
                Class<?>[] parameterTypes = executable.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    for (int i2 = 0; i2 < clsArr.length; i2++) {
                        if (clsArr[i2] != parameterTypes[i2]) {
                            break;
                        }
                    }
                    return (Method) executable;
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    public static List d(Class cls) {
        if (cls.isPrimitive() || cls.isArray()) {
            return Collections.emptyList();
        }
        try {
            Method declaredMethod = hz.f.class.getDeclaredMethod("a", new Class[0]);
            declaredMethod.setAccessible(true);
            MethodHandle unreflect = MethodHandles.lookup().unreflect(declaredMethod);
            Unsafe unsafe = a;
            long j2 = unsafe.getLong(cls, e);
            if (j2 == 0) {
                return Collections.emptyList();
            }
            int i2 = unsafe.getInt(j2);
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                a.putLong(unreflect, d, (i3 * h) + j2 + i);
                arrayList.add((Executable) MethodHandles.reflectAs(Executable.class, unreflect));
            }
            return arrayList;
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            return Collections.emptyList();
        }
    }

    public static List e(Class cls) {
        if (cls.isPrimitive() || cls.isArray()) {
            return Collections.emptyList();
        }
        try {
            Field declaredField = hz.f.class.getDeclaredField("i");
            declaredField.setAccessible(true);
            MethodHandle unreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            Unsafe unsafe = a;
            long j2 = unsafe.getLong(cls, f);
            if (j2 == 0) {
                return Collections.emptyList();
            }
            int i2 = unsafe.getInt(j2);
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                a.putLong(unreflectGetter, d, (i3 * j) + j2 + k);
                Field field = (Field) MethodHandles.reflectAs(Field.class, unreflectGetter);
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            return arrayList;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return Collections.emptyList();
        }
    }

    public static List f(Class cls) {
        if (cls.isPrimitive() || cls.isArray()) {
            return Collections.emptyList();
        }
        try {
            Field declaredField = hz.f.class.getDeclaredField("s");
            declaredField.setAccessible(true);
            MethodHandle unreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            Unsafe unsafe = a;
            long j2 = unsafe.getLong(cls, g);
            if (j2 == 0) {
                return Collections.emptyList();
            }
            int i2 = unsafe.getInt(j2);
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                a.putLong(unreflectGetter, d, (i3 * j) + j2 + k);
                Field field = (Field) MethodHandles.reflectAs(Field.class, unreflectGetter);
                if (Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            return arrayList;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return Collections.emptyList();
        }
    }

    public static Object g(Class cls, Object obj, String str, Object... objArr) {
        if (obj == null || cls.isInstance(obj)) {
            Method declaredMethod = hz.d.class.getDeclaredMethod("invoke", Object[].class);
            declaredMethod.setAccessible(true);
            Unsafe unsafe = a;
            long j2 = unsafe.getLong(cls, e);
            if (j2 != 0) {
                int i2 = unsafe.getInt(j2);
                for (int i3 = 0; i3 < i2; i3++) {
                    a.putLong(declaredMethod, b, (i3 * h) + j2 + i);
                    if (str.equals(declaredMethod.getName()) && hz.a(declaredMethod.getParameterTypes(), objArr)) {
                        return declaredMethod.invoke(obj, objArr);
                    }
                }
                throw new NoSuchMethodException("Cannot find matching method");
            }
            throw new NoSuchMethodException("Cannot find matching method");
        }
        throw new IllegalArgumentException("this object is not an instance of the given class");
    }

    public static boolean h(String... strArr) {
        try {
            g(VMRuntime.class, g(VMRuntime.class, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
            return true;
        } catch (ReflectiveOperationException unused) {
            return false;
        }
    }
}
