package androidx.appcompat.view.menu;

import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class ag0 extends pq {
    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }
}
