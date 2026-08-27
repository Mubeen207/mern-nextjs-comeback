package androidx.appcompat.view.menu;

import java.lang.reflect.Array;
/* loaded from: classes.dex */
public abstract class u4 {
    public static final Object[] a(Object[] objArr, int i) {
        c60.e(objArr, "reference");
        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
        c60.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }
}
