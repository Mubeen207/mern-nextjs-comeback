package androidx.appcompat.view.menu;

import android.os.IInterface;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class f10 extends ob {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            rd0.f(objArr);
            return method.invoke(obj, objArr);
        }
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return ((IInterface) km.b.c(km.c.b(new Object[0]))) != g();
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return km.b.c(km.c.b(new Object[0]));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        km.b.e(km.c.b(new Object[0]), g());
    }

    @Override // androidx.appcompat.view.menu.ob
    public void j() {
        e("createVirtualDisplay", new a());
    }
}
