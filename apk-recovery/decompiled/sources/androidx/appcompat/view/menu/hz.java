package androidx.appcompat.view.menu;

import java.lang.invoke.MethodType;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class hz {
    public static final Set a = new HashSet();

    /* loaded from: classes.dex */
    public static class a {
        private boolean override;
    }

    /* loaded from: classes.dex */
    public static final class b {
        private transient int accessFlags;
        private transient int classFlags;
        private transient ClassLoader classLoader;
        private transient int classSize;
        private transient int clinitThreadId;
        private transient Class<?> componentType;
        private transient short copiedMethodsOffset;
        private transient Object dexCache;
        private transient int dexClassDefIndex;
        private volatile transient int dexTypeIndex;
        private transient Object extData;
        private transient long iFields;
        private transient Object[] ifTable;
        private transient long methods;
        private transient String name;
        private transient int numReferenceInstanceFields;
        private transient int numReferenceStaticFields;
        private transient int objectSize;
        private transient int objectSizeAllocFastPath;
        private transient int primitiveType;
        private transient int referenceInstanceOffsets;
        private transient long sFields;
        private transient int status;
        private transient Class<?> superClass;
        private transient short virtualMethodsOffset;
        private transient Object vtable;
    }

    /* loaded from: classes.dex */
    public static final class c extends a {
        private int accessFlags;
        private long artMethod;
        private b declaringClass;
        private b declaringClassOfOverriddenMethod;
        private Object[] parameters;
    }

    /* loaded from: classes.dex */
    public static class d {
        private d(Object... objArr) {
            throw new IllegalStateException("Failed to new a instance");
        }

        private static Object invoke(Object... objArr) {
            throw new IllegalStateException("Failed to invoke the method");
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        private e cachedSpreadInvoker;
        private MethodType nominalType;
        private final MethodType type = null;
        protected final int handleKind = 0;
        protected final long artFieldOrMethod = 0;
    }

    /* loaded from: classes.dex */
    public static class f {
        private static int s;
        private static int t;
        private int i;
        private int j;

        private static void a() {
        }

        private static void b() {
        }
    }

    public static boolean a(Class[] clsArr, Object[] objArr) {
        if (clsArr.length != objArr.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (clsArr[i].isPrimitive()) {
                Class cls = clsArr[i];
                if (cls == Integer.TYPE && !(objArr[i] instanceof Integer)) {
                    return false;
                }
                if (cls == Byte.TYPE && !(objArr[i] instanceof Byte)) {
                    return false;
                }
                if (cls == Character.TYPE && !(objArr[i] instanceof Character)) {
                    return false;
                }
                if (cls == Boolean.TYPE && !(objArr[i] instanceof Boolean)) {
                    return false;
                }
                if (cls == Double.TYPE && !(objArr[i] instanceof Double)) {
                    return false;
                }
                if (cls == Float.TYPE && !(objArr[i] instanceof Float)) {
                    return false;
                }
                if (cls == Long.TYPE && !(objArr[i] instanceof Long)) {
                    return false;
                }
                if (cls == Short.TYPE && !(objArr[i] instanceof Short)) {
                    return false;
                }
            } else {
                Object obj = objArr[i];
                if (obj != null && !clsArr[i].isInstance(obj)) {
                    return false;
                }
            }
        }
        return true;
    }
}
