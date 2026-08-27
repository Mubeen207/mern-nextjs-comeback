package androidx.appcompat.view.menu;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class gi0 extends pd0 {
    public final String a;

    public gi0(String str) {
        this.a = str;
    }

    @Override // androidx.appcompat.view.menu.pd0
    public String c() {
        return this.a;
    }

    @Override // androidx.appcompat.view.menu.pd0
    public Object d(Object obj, Method method, Object[] objArr) {
        rd0.f(objArr);
        return method.invoke(obj, objArr);
    }
}
