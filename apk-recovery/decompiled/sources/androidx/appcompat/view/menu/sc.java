package androidx.appcompat.view.menu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public abstract class sc extends rc {
    public static ArrayList c(Object... objArr) {
        c60.e(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new j4(objArr, true));
    }

    public static final Collection d(Object[] objArr) {
        c60.e(objArr, "<this>");
        return new j4(objArr, false);
    }

    public static List e() {
        return fo.m;
    }

    public static final int f(List list) {
        c60.e(list, "<this>");
        return list.size() - 1;
    }

    public static List g(Object... objArr) {
        List e;
        c60.e(objArr, "elements");
        if (objArr.length > 0) {
            return w4.b(objArr);
        }
        e = e();
        return e;
    }

    public static List h(List list) {
        List e;
        List b;
        c60.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            e = e();
            return e;
        } else if (size != 1) {
            return list;
        } else {
            b = rc.b(list.get(0));
            return b;
        }
    }

    public static void i() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
