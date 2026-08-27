package androidx.appcompat.view.menu;

import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class b51 extends pd0 {
    public final Object a;
    public final String b;

    public b51(String str, Object obj) {
        this.a = obj;
        this.b = str;
    }

    @Override // androidx.appcompat.view.menu.pd0
    public String c() {
        return this.b;
    }

    @Override // androidx.appcompat.view.menu.pd0
    public Object d(Object obj, Method method, Object[] objArr) {
        return this.a;
    }
}
