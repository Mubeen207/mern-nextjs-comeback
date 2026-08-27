package androidx.appcompat.view.menu;

import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class r4 {
    public static int a(Object[] objArr, Class cls) {
        if (!d(objArr)) {
            int i = -1;
            for (Object obj : objArr) {
                i++;
                if (obj != null && cls == obj.getClass()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int b(Object[] objArr, Class cls) {
        if (d(objArr)) {
            return -1;
        }
        for (int length = objArr.length; length > 0; length--) {
            int i = length - 1;
            Object obj = objArr[i];
            if (obj != null && obj.getClass() == cls) {
                return i;
            }
        }
        return -1;
    }

    public static int c(Object[] objArr, Class cls, int i) {
        if (objArr == null) {
            return -1;
        }
        while (i < objArr.length) {
            if (cls.isInstance(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static boolean d(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static int[] e(Integer[] numArr) {
        int[] iArr = new int[numArr.length];
        for (int i = 0; i < numArr.length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public static Object[] f(Object[] objArr, int i) {
        if (objArr == null || i == 0) {
            return null;
        }
        return objArr.length == i ? objArr : Arrays.copyOf(objArr, i);
    }
}
