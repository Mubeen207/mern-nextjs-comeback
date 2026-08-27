package androidx.appcompat.view.menu;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class hi0 {
    public static Object[] a(Object[] objArr, int i, int i2, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i, i2, objArr2.getClass());
    }

    public static Object[] b(Object[] objArr, int i) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
    }

    public static Map c() {
        return gd.r();
    }
}
