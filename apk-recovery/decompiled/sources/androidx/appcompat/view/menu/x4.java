package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class x4 extends w4 {
    public static final boolean f(Object[] objArr, Object obj) {
        c60.e(objArr, "<this>");
        return i(objArr, obj) >= 0;
    }

    public static List g(Object[] objArr, int i) {
        int a;
        c60.e(objArr, "<this>");
        if (i >= 0) {
            a = xn0.a(objArr.length - i, 0);
            return l(objArr, a);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static final int h(Object[] objArr) {
        c60.e(objArr, "<this>");
        return objArr.length - 1;
    }

    public static final int i(Object[] objArr, Object obj) {
        c60.e(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (c60.a(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static char j(char[] cArr) {
        c60.e(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object k(Object[] objArr) {
        c60.e(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final List l(Object[] objArr, int i) {
        List b;
        List e;
        c60.e(objArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            e = sc.e();
            return e;
        } else {
            int length = objArr.length;
            if (i >= length) {
                return m(objArr);
            }
            if (i == 1) {
                b = rc.b(objArr[length - 1]);
                return b;
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(objArr[i2]);
            }
            return arrayList;
        }
    }

    public static final List m(Object[] objArr) {
        List e;
        List b;
        c60.e(objArr, "<this>");
        int length = objArr.length;
        if (length == 0) {
            e = sc.e();
            return e;
        } else if (length != 1) {
            return n(objArr);
        } else {
            b = rc.b(objArr[0]);
            return b;
        }
    }

    public static final List n(Object[] objArr) {
        c60.e(objArr, "<this>");
        return new ArrayList(sc.d(objArr));
    }
}
