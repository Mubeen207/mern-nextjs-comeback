package androidx.appcompat.view.menu;

import android.os.IBinder;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class s30 extends j8 {

    /* loaded from: classes.dex */
    public static class a extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            rd0.f(objArr);
            return method.invoke(obj, objArr);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends pd0 {
        @Override // androidx.appcompat.view.menu.pd0
        public Object d(Object obj, Method method, Object[] objArr) {
            rd0.f(objArr);
            return method.invoke(obj, objArr);
        }
    }

    public s30() {
        super((IBinder) et0.c.b("telephony.registry"));
    }

    @Override // androidx.appcompat.view.menu.o10
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ob
    public Object h() {
        return r30.b.b(et0.c.b("telephony.registry"));
    }

    @Override // androidx.appcompat.view.menu.ob
    public void i(Object obj, Object obj2) {
        l("telephony.registry");
    }

    @Override // androidx.appcompat.view.menu.j8, androidx.appcompat.view.menu.ob
    public void j() {
        super.j();
        e("listenForSubscriber", new b());
        e("listen", new a());
    }
}
