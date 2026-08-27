package androidx.appcompat.view.menu;

import android.os.IBinder;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class g30 extends j8 {
    public g30() {
        super((IBinder) et0.c.b("storagestats"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return f30.b.b(et0.c.b("storagestats"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("storagestats");
    }

    @Override // androidx.appcompat.view.menu.ob, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        rd0.f(objArr);
        rd0.i(objArr);
        return super.invoke(obj, method, objArr);
    }
}
