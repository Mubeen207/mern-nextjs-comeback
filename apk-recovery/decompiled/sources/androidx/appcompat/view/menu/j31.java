package androidx.appcompat.view.menu;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class j31 extends pd0 {
    public final int a;
    public final String b;

    public j31(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // androidx.appcompat.view.menu.pd0
    public String c() {
        return this.b;
    }

    @Override // androidx.appcompat.view.menu.pd0
    public Object d(Object obj, Method method, Object[] objArr) {
        if (((Integer) objArr[this.a]).intValue() == mv0.J2()) {
            objArr[this.a] = Integer.valueOf(bv0.p());
        }
        return method.invoke(obj, objArr);
    }
}
