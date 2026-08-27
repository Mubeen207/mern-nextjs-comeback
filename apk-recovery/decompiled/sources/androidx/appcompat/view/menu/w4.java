package androidx.appcompat.view.menu;

import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public abstract class w4 extends v4 {
    public static final List b(Object[] objArr) {
        c60.e(objArr, "<this>");
        List a = y4.a(objArr);
        c60.d(a, "asList(this)");
        return a;
    }

    public static final Object[] c(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        c60.e(objArr, "<this>");
        c60.e(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
        return objArr2;
    }

    public static /* synthetic */ Object[] d(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        return c(objArr, objArr2, i, i2, i3);
    }

    public static final void e(Object[] objArr, Object obj, int i, int i2) {
        c60.e(objArr, "<this>");
        Arrays.fill(objArr, i, i2, obj);
    }
}
