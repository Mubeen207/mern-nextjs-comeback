package androidx.appcompat.view.menu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class rc {
    public static final Object[] a(Object[] objArr, boolean z) {
        c60.e(objArr, "<this>");
        if (z && c60.a(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        c60.d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static List b(Object obj) {
        List singletonList = Collections.singletonList(obj);
        c60.d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
